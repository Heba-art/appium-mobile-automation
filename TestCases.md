<table border="1" style="width:100%; border-collapse: collapse; font-family: sans-serif; font-size: 14px;">
  <thead>
    <tr style="background-color:#007bff; color:white;">
      <th style="padding: 10px; text-align: left;">ID</th>
      <th style="padding: 10px; text-align: left;">Module</th>
      <th style="padding: 10px; text-align: left;">Title</th>
      <th style="padding: 10px; text-align: left;">Priority</th>
      <th style="padding: 10px; text-align: left;">Type</th>
      <th style="padding: 10px; text-align: left;">Precondition</th>
      <th style="padding: 10px; text-align: left;">Steps</th>
      <th style="padding: 10px; text-align: left;">Expected Result</th>
      <th style="padding: 10px; text-align: left;">Actual Result</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TC01</td>
      <td>Launch</td>
      <td>Verify Settings App Launch</td>
      <td>High</td>
      <td>Functional</td>
      <td>Emulator connected and Appium server running</td>
      <td>Start test and check the current package name.</td>
      <td>Current package equals <code>com.android.settings</code>.</td>
      <td>As expected ✅</td>
    </tr>
    <tr>
      <td>TC02</td>
      <td>Home</td>
      <td>Verify Search Icon Visibility</td>
      <td>Medium</td>
      <td>UI</td>
      <td>App opened on Settings home screen</td>
      <td>Wait for element with accessibility id "Search settings".</td>
      <td>Search icon is displayed and enabled.</td>
      <td>As expected ✅</td>
    </tr>
    <tr>
      <td>TC03</td>
      <td>Network</td>
      <td>Open "Network &amp; Internet" Section</td>
      <td>High</td>
      <td>Functional</td>
      <td>App launched successfully</td>
      <td>Tap on "Network &amp; Internet" option.</td>
      <td>Screen title changes to "Network &amp; Internet".</td>
      <td>As expected ✅</td>
    </tr>
    <tr>
      <td>TC04</td>
      <td>Devices</td>
      <td>Open "Connected Devices"</td>
      <td>Medium</td>
      <td>Functional</td>
      <td>Settings app on main screen</td>
      <td>Tap on "Connected Devices".</td>
      <td>Title "Connected Devices" is displayed.</td>
      <td>As expected ✅</td>
    </tr>
    <tr>
      <td>TC05</td>
      <td>Battery</td>
      <td>Scroll and Open "Battery" Section</td>
      <td>Medium</td>
      <td>Functional</td>
      <td>App launched on main screen</td>
      <td>Scroll down and tap "Battery".</td>
      <td>"Battery" screen or usage info displayed.</td>
      <td>As expected ✅</td>
    </tr>
    <tr>
      <td>TC06</td>
      <td>Search</td>
      <td>Search for "Bluetooth" Setting</td>
      <td>High</td>
      <td>Functional</td>
      <td>App on Settings home screen</td>
      <td>Tap search icon → enter “Bluetooth” → tap first result.</td>
      <td>Bluetooth page opens successfully.</td>
      <td>As expected ✅</td>
    </tr>
    <tr>
      <td>TC07</td>
      <td>Apps</td>
      <td>Open "Apps" Section</td>
      <td>Medium</td>
      <td>Functional</td>
      <td>Settings app on home screen</td>
      <td>Tap "Apps".</td>
      <td>List of installed or recent apps is shown.</td>
      <td>As expected ✅</td>
    </tr>
    <tr>
      <td>TC08</td>
      <td>About</td>
      <td>Open "About Phone" and Verify Android Version</td>
      <td>Medium</td>
      <td>Functional</td>
      <td>Settings app launched</td>
      <td>Scroll to “About phone” → open → read Android version.</td>
      <td>Android version displayed and not empty.</td>
      <td>As expected ✅</td>
    </tr>
    <tr>
      <td>TC09</td>
      <td>Navigation</td>
      <td>Verify Back Navigation Returns Home</td>
      <td>Low</td>
      <td>Navigation</td>
      <td>User inside a sub-section</td>
      <td>Press back button to return.</td>
      <td>Returns to Settings home screen.</td>
      <td>As expected ✅</td>
    </tr>
    <tr>
      <td>TC10</td>
      <td>System</td>
      <td>Open “System → Languages &amp; Input”</td>
      <td>High</td>
      <td>Functional</td>
      <td>Settings app on main screen</td>
      <td>Scroll to “System” → tap → open “Languages &amp; input”.</td>
      <td>Languages &amp; input page appears with language settings.</td>
      <td>As expected ✅</td>
    </tr>
  </tbody>
</table>

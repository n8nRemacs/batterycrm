# Setup SSH keys on remote servers
# Run this script in PowerShell

$pubKey = Get-Content "$env:USERPROFILE\.ssh\id_rsa.pub"

$servers = @{
    "n8n" = @{host="185.221.214.83"; pass="Mi31415926pS"}
    "msg" = @{host="155.212.221.189"; pass="Mi31415926pSss!"}
}

Write-Host "Public key: $($pubKey.Substring(0,50))..."
Write-Host ""

foreach ($name in $servers.Keys) {
    $srv = $servers[$name]
    Write-Host "[$name] Run this command and enter password: $($srv.pass)"
    Write-Host "ssh root@$($srv.host) `"mkdir -p ~/.ssh && echo '$pubKey' >> ~/.ssh/authorized_keys && chmod 700 ~/.ssh && chmod 600 ~/.ssh/authorized_keys`""
    Write-Host ""
}

package com.huawei.updatesdk.fileprovider;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final String f363882a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, File> f363883b = new HashMap<>();

    public b(String str) {
        this.f363882a = str;
    }

    @Override // com.huawei.updatesdk.fileprovider.a
    public Uri a(File file) throws IOException {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry<String, File> entry = null;
            for (Map.Entry<String, File> entry2 : this.f363883b.entrySet()) {
                String path = entry2.getValue().getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException("wisedist: Failed to find configured root that contains");
            }
            String path2 = entry.getValue().getPath();
            boolean zEndsWith = path2.endsWith("/");
            int length = path2.length();
            if (!zEndsWith) {
                length++;
            }
            return new Uri.Builder().scheme("content").authority(this.f363882a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(length), "/")).build();
        } catch (Exception unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for wisedist");
        }
    }

    @Override // com.huawei.updatesdk.fileprovider.a
    public File a(Uri uri) throws IOException {
        try {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.f363883b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("wisedist: Unable to find configured root for");
            }
            if (TextUtils.isEmpty(strDecode2) || strDecode2.contains("../") || strDecode2.contains("..") || strDecode2.contains("%00") || strDecode2.contains(".\\.\\") || strDecode2.contains("./")) {
                throw new IllegalArgumentException("wisedist: Not a standard path");
            }
            try {
                File canonicalFile = new File(file, strDecode2).getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("wisedist: Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("wisedist: Failed to resolve canonical path for");
            }
        } catch (Exception e12) {
            throw new IllegalArgumentException("UpdateSDKFileProvider error: " + e12.toString());
        }
    }

    @Override // com.huawei.updatesdk.fileprovider.a
    public void a(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("wisedist Name must not be empty");
        }
        try {
            this.f363883b.put(str, file.getCanonicalFile());
        } catch (Exception unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for root");
        }
    }
}

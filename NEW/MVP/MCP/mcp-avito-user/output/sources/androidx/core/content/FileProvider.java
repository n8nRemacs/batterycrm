package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.camera.camera2.internal.G;
import j.B;
import j.InterfaceC42153i;
import j.N;
import j.P;
import j.X;
import j.k0;
import j.m0;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";

    @B
    private String mAuthority;

    @B
    @P
    private b mLocalPathStrategy;

    @N
    private final Object mLock;
    private final int mResourceId;
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");

    @B
    private static final HashMap<String, b> sCache = new HashMap<>();

    @X
    public static class a {
    }

    public interface b {
        Uri a(File file);

        File b(Uri uri);
    }

    public static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f44626a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap<String, File> f44627b = new HashMap<>();

        public c(String str) {
            this.f44626a = str;
        }

        public static boolean c(@N String str, @N String str2) {
            String strRemoveTrailingSlash = FileProvider.removeTrailingSlash(str);
            String strRemoveTrailingSlash2 = FileProvider.removeTrailingSlash(str2);
            if (!strRemoveTrailingSlash.equals(strRemoveTrailingSlash2)) {
                if (!strRemoveTrailingSlash.startsWith(strRemoveTrailingSlash2 + '/')) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.content.FileProvider.b
        public final Uri a(File file) throws IOException {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f44627b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (c(canonicalPath, path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(G.f("Failed to find configured root that contains ", canonicalPath));
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f44626a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.j(file, "Failed to resolve canonical path for "));
            }
        }

        @Override // androidx.core.content.FileProvider.b
        public final File b(Uri uri) throws IOException {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.f44627b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException(androidx.appcompat.app.r.n(uri, "Unable to find configured root for "));
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (c(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.j(file2, "Failed to resolve canonical path for "));
            }
        }
    }

    public FileProvider() {
        this(0);
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static String[] copyOf(String[] strArr, int i12) {
        String[] strArr2 = new String[i12];
        System.arraycopy(strArr, 0, strArr2, 0, i12);
        return strArr2;
    }

    @k0
    public static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, @P ProviderInfo providerInfo, int i12) {
        if (providerInfo == null) {
            throw new IllegalArgumentException(G.f("Couldn't find meta-data for provider with authority ", str));
        }
        if (providerInfo.metaData == null && i12 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(META_DATA_FILE_PROVIDER_PATHS, i12);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    @N
    private b getLocalPathStrategy() {
        b bVar;
        synchronized (this.mLock) {
            try {
                if (this.mAuthority == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.mLocalPathStrategy == null) {
                    this.mLocalPathStrategy = getPathStrategy(getContext(), this.mAuthority, this.mResourceId);
                }
                bVar = this.mLocalPathStrategy;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    private static b getPathStrategy(Context context, String str, int i12) {
        b pathStrategy;
        HashMap<String, b> map = sCache;
        synchronized (map) {
            try {
                pathStrategy = map.get(str);
                if (pathStrategy == null) {
                    try {
                        try {
                            pathStrategy = parsePathStrategy(context, str, i12);
                            map.put(str, pathStrategy);
                        } catch (IOException e12) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e12);
                        }
                    } catch (XmlPullParserException e13) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e13);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pathStrategy;
    }

    public static Uri getUriForFile(@N Context context, @N String str, @N File file) {
        return getPathStrategy(context, str, 0).a(file);
    }

    private static int modeToMode(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(G.f("Invalid mode: ", str));
    }

    private static b parsePathStrategy(Context context, String str, int i12) throws XmlPullParserException, IOException {
        c cVar = new c(str);
        XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i12);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = fileProviderPathsMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, ATTR_PATH);
                if (TAG_ROOT_PATH.equals(name)) {
                    externalStorageDirectory = DEVICE_ROOT;
                } else if (TAG_FILES_PATH.equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if (TAG_CACHE_PATH.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (TAG_EXTERNAL.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if (TAG_EXTERNAL_FILES.equals(name)) {
                    File[] externalFilesDirs = d.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if (TAG_EXTERNAL_CACHE.equals(name)) {
                    File[] externalCacheDirs = d.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if (TAG_EXTERNAL_MEDIA.equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        externalStorageDirectory = externalMediaDirs[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    File fileBuildPath = buildPath(externalStorageDirectory, attributeValue2);
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        cVar.f44627b.put(attributeValue, fileBuildPath.getCanonicalFile());
                    } catch (IOException e12) {
                        throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.j(fileBuildPath, "Failed to resolve canonical path for "), e12);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @N
    public static String removeTrailingSlash(@N String str) {
        return (str.length() <= 0 || str.charAt(str.length() - 1) != '/') ? str : androidx.compose.ui.graphics.colorspace.e.h(1, 0, str);
    }

    @Override // android.content.ContentProvider
    @InterfaceC42153i
    public void attachInfo(@N Context context, @N ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.mLock) {
            this.mAuthority = str;
        }
        HashMap<String, b> map = sCache;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@N Uri uri, @P String str, @P String[] strArr) {
        return getLocalPathStrategy().b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @P
    public String getType(@N Uri uri) {
        File fileB = getLocalPathStrategy().b(uri);
        int iLastIndexOf = fileB.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileB.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    @P
    public String getTypeAnonymous(@N Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(@N Uri uri, @N ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@N Uri uri, @N String str) {
        return ParcelFileDescriptor.open(getLocalPathStrategy().b(uri), modeToMode(str));
    }

    @Override // android.content.ContentProvider
    @N
    public Cursor query(@N Uri uri, @P String[] strArr, @P String str, @P String[] strArr2, @P String str2) {
        int i12;
        File fileB = getLocalPathStrategy().b(uri);
        String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i13 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i13] = "_display_name";
                i12 = i13 + 1;
                objArr[i13] = queryParameter == null ? fileB.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i13] = "_size";
                i12 = i13 + 1;
                objArr[i13] = Long.valueOf(fileB.length());
            }
            i13 = i12;
        }
        String[] strArrCopyOf = copyOf(strArr3, i13);
        Object[] objArrCopyOf = copyOf(objArr, i13);
        MatrixCursor matrixCursor = new MatrixCursor(strArrCopyOf, 1);
        matrixCursor.addRow(objArrCopyOf);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@N Uri uri, @N ContentValues contentValues, @P String str, @P String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public FileProvider(@m0 int i12) {
        this.mLock = new Object();
        this.mResourceId = i12;
    }

    private static Object[] copyOf(Object[] objArr, int i12) {
        Object[] objArr2 = new Object[i12];
        System.arraycopy(objArr, 0, objArr2, 0, i12);
        return objArr2;
    }

    @N
    @SuppressLint({"StreamFiles"})
    public static Uri getUriForFile(@N Context context, @N String str, @N File file, @N String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }
}

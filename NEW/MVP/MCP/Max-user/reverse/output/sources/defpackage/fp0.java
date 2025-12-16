package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Logger;
import org.apache.http.HttpHost;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes2.dex */
public final class fp0 extends AsyncTask {
    public final Context a;
    public Uri b;
    public final Uri c;
    public final int d;
    public final int e;
    public final s6b f;

    public fp0(Context context, Uri uri, Uri uri2, int i, int i2, s6b s6bVar) {
        this.a = context;
        this.b = uri;
        this.c = uri2;
        this.d = i;
        this.e = i2;
        this.f = s6bVar;
    }

    public final void a(Uri uri, Uri uri2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        Uri uri3 = this.c;
        Log.d("BitmapWorkerTask", "copyFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
        FileOutputStream fileOutputStream = null;
        try {
            inputStreamOpenInputStream = this.a.getContentResolver().openInputStream(uri);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(uri2.getPath()));
                try {
                    if (inputStreamOpenInputStream == null) {
                        throw new NullPointerException("InputStream for given input Uri is null");
                    }
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i <= 0) {
                            gvi.b(fileOutputStream2);
                            gvi.b(inputStreamOpenInputStream);
                            this.b = uri3;
                            return;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    gvi.b(fileOutputStream);
                    gvi.b(inputStreamOpenInputStream);
                    this.b = uri3;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenInputStream = null;
        }
    }

    public final void b(Uri uri, Uri uri2) throws Throwable {
        ood oodVarF;
        ux uxVar;
        Uri uri3 = this.c;
        Log.d("BitmapWorkerTask", "downloadFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        sua suaVar = new sua();
        fa6 fa6Var = suaVar.a;
        wv0 wv0Var = null;
        try {
            kw6 kw6Var = new kw6();
            kw6Var.m(uri.toString());
            oodVarF = suaVar.b(kw6Var.a()).f();
            try {
                qod qodVar = oodVarF.Y;
                wv0 wv0VarP = qodVar.P();
                try {
                    OutputStream outputStreamOpenOutputStream = this.a.getContentResolver().openOutputStream(uri2);
                    if (outputStreamOpenOutputStream == null) {
                        throw new NullPointerException("OutputStream for given output Uri is null");
                    }
                    Logger logger = yua.a;
                    uxVar = new ux(outputStreamOpenOutputStream, 1, new u9g());
                    try {
                        wv0VarP.H(uxVar);
                        gvi.b(wv0VarP);
                        gvi.b(uxVar);
                        gvi.b(qodVar);
                        fa6Var.r();
                        this.b = uri3;
                    } catch (Throwable th) {
                        th = th;
                        wv0Var = wv0VarP;
                        gvi.b(wv0Var);
                        gvi.b(uxVar);
                        if (oodVarF != null) {
                            gvi.b(oodVarF.Y);
                        }
                        fa6Var.r();
                        this.b = uri3;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    uxVar = null;
                }
            } catch (Throwable th3) {
                th = th3;
                uxVar = null;
            }
        } catch (Throwable th4) {
            th = th4;
            oodVarF = null;
            uxVar = null;
        }
    }

    public final String c() {
        Context context = this.a;
        Uri uri = null;
        if (z7.b(context, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            Uri uri2 = this.b;
            if (DocumentsContract.isDocumentUri(context, uri2)) {
                if ("com.android.externalstorage.documents".equals(uri2.getAuthority())) {
                    String[] strArrSplit = DocumentsContract.getDocumentId(uri2).split(":");
                    if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                    }
                } else if ("com.android.providers.downloads.documents".equals(uri2.getAuthority())) {
                    String documentId = DocumentsContract.getDocumentId(uri2);
                    if (!TextUtils.isEmpty(documentId)) {
                        try {
                            return mbj.a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                        } catch (NumberFormatException e) {
                            Log.i("FileUtils", e.getMessage());
                            return null;
                        }
                    }
                } else if ("com.android.providers.media.documents".equals(uri2.getAuthority())) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri2).split(":");
                    String str = strArrSplit2[0];
                    if ("image".equals(str)) {
                        uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(str)) {
                        uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(str)) {
                        uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return mbj.a(context, uri, "_id=?", new String[]{strArrSplit2[1]});
                }
            } else {
                if ("content".equalsIgnoreCase(uri2.getScheme())) {
                    return "com.google.android.apps.photos.content".equals(uri2.getAuthority()) ? uri2.getLastPathSegment() : mbj.a(context, uri2, null, null);
                }
                if ("file".equalsIgnoreCase(uri2.getScheme())) {
                    return uri2.getPath();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ep0 d() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp0.d():ep0");
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return d();
    }

    public final void e() throws IOException {
        String scheme = this.b.getScheme();
        Log.d("BitmapWorkerTask", "Uri scheme: " + scheme);
        boolean zEquals = HttpHost.DEFAULT_SCHEME_NAME.equals(scheme);
        Uri uri = this.c;
        if (zEquals || "https".equals(scheme)) {
            try {
                b(this.b, uri);
                return;
            } catch (IOException | NullPointerException e) {
                Log.e("BitmapWorkerTask", "Downloading failed", e);
                throw e;
            }
        }
        if (!"content".equals(scheme)) {
            if (TextUtils.isEmpty(scheme)) {
                File file = new File(this.b.getPath());
                if (!file.exists()) {
                    throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Invalid uri %s", this.b));
                }
                this.b = Uri.fromFile(file);
                return;
            }
            if ("file".equals(scheme)) {
                return;
            }
            Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
            throw new IllegalArgumentException(wy1.h("Invalid Uri scheme", scheme));
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.a.getContentResolver().openFileDescriptor(this.b, "r");
            try {
                if (!parcelFileDescriptorOpenFileDescriptor.getFileDescriptor().valid()) {
                    String strC = c();
                    File file2 = new File(strC);
                    if (TextUtils.isEmpty(strC) || !file2.exists()) {
                        try {
                            a(this.b, uri);
                        } catch (IOException | NullPointerException e2) {
                            Log.e("BitmapWorkerTask", "Copying failed", e2);
                            throw e2;
                        }
                    } else {
                        this.b = Uri.fromFile(file2);
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            } finally {
            }
        } catch (IOException e3) {
            Log.e("BitmapWorkerTask", "getBitmapFromPath: failed to get bitmap", e3);
            throw e3;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        ep0 ep0Var = (ep0) obj;
        Exception exc = ep0Var.b;
        s6b s6bVar = this.f;
        if (exc != null) {
            s6bVar.getClass();
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            ((ahg) s6bVar.a).getClass();
            return;
        }
        Bitmap bitmap = ep0Var.a;
        this.b.getPath();
        Uri uri = this.c;
        String path = uri == null ? null : uri.getPath();
        ahg ahgVar = (ahg) s6bVar.a;
        ahgVar.getClass();
        ahgVar.z0 = path;
        ahgVar.w0 = true;
        ahgVar.setImageBitmap(bitmap);
    }
}

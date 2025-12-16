package Pt;

import Y61.k;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.avito.android.cv_upload.util.ContentUriNotAvailableException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.io.c;

/* compiled from: ContentResolverUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_job_cv-upload_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14836a {
    public static final void a(@k ContentResolver contentResolver, @k Uri uri, @k File file) {
        FileDescriptor fileDescriptor;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        c.a(parcelFileDescriptorOpenFileDescriptor, th2);
                        throw th3;
                    }
                }
            } else {
                fileDescriptor = null;
            }
            if (fileDescriptor == null) {
                throw new ContentUriNotAvailableException();
            }
            FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int i12 = fileInputStream.read(bArr);
                    if (i12 < 0) {
                        G0 g02 = G0.f406611a;
                        c.a(fileInputStream, null);
                        c.a(parcelFileDescriptorOpenFileDescriptor, null);
                        c.a(fileOutputStream, null);
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i12);
                }
            } finally {
            }
        } finally {
        }
    }
}

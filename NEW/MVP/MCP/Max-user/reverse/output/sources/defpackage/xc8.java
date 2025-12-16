package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xc8 extends gd8 {
    public final /* synthetic */ int c;
    public final ContentResolver d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xc8(Executor executor, py0 py0Var, ContentResolver contentResolver, int i) {
        super(executor, py0Var);
        this.c = i;
        this.d = contentResolver;
    }

    @Override // defpackage.gd8
    public final ce5 d(rf7 rf7Var) throws IOException {
        ce5 ce5Var;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        InputStream inputStreamCreateInputStream;
        int i = this.c;
        ContentResolver contentResolver = this.d;
        switch (i) {
            case 0:
                Uri uri = rf7Var.b;
                Uri uri2 = mwg.a;
                if (uri.getPath() != null && "content".equals(mwg.b(uri)) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(mwg.a.getPath())) {
                    if (uri.toString().endsWith("/photo")) {
                        inputStreamCreateInputStream = contentResolver.openInputStream(uri);
                    } else if (uri.toString().endsWith("/display_photo")) {
                        try {
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                        } catch (IOException unused) {
                            throw new IOException(ctd.i(uri, "Contact photo does not exist: "));
                        }
                    } else {
                        InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
                        if (inputStreamOpenContactPhotoInputStream == null) {
                            throw new IOException(ctd.i(uri, "Contact photo does not exist: "));
                        }
                        inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
                    }
                    if (inputStreamCreateInputStream != null) {
                        return c(inputStreamCreateInputStream, -1);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                String string = uri.toString();
                if (string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                    } catch (FileNotFoundException unused2) {
                        ce5Var = null;
                    }
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    ce5 ce5VarC = c(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
                    parcelFileDescriptorOpenFileDescriptor.close();
                    ce5Var = ce5VarC;
                    if (ce5Var != null) {
                        return ce5Var;
                    }
                }
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    return c(inputStreamOpenInputStream, -1);
                }
                throw new IllegalStateException("Required value was null.");
            default:
                InputStream inputStreamOpenInputStream2 = contentResolver.openInputStream(rf7Var.b);
                if (inputStreamOpenInputStream2 != null) {
                    return c(inputStreamOpenInputStream2, -1);
                }
                throw new IllegalStateException("ContentResolver returned null InputStream");
        }
    }

    @Override // defpackage.gd8
    public final String e() {
        switch (this.c) {
            case 0:
                return "LocalContentUriFetchProducer";
            default:
                return "QualifiedResourceFetchProducer";
        }
    }
}

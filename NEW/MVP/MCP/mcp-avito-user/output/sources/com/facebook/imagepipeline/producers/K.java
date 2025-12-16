package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: LocalContentUriFetchProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class K extends M {

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f340563c;

    public K(Executor executor, wW0.g gVar, ContentResolver contentResolver) {
        super(executor, gVar);
        this.f340563c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.M
    public final YW0.d d(ImageRequest imageRequest) throws IOException {
        YW0.d dVarC;
        InputStream inputStreamCreateInputStream;
        Uri uri = imageRequest.f340782b;
        Uri uri2 = com.facebook.common.util.g.f339869a;
        String path = uri.getPath();
        ContentResolver contentResolver = this.f340563c;
        if (path == null || !"content".equals(com.facebook.common.util.g.a(uri)) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith(com.facebook.common.util.g.f339869a.getPath())) {
            if (com.facebook.common.util.g.b(uri)) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                    parcelFileDescriptorOpenFileDescriptor.getClass();
                    dVarC = c((int) parcelFileDescriptorOpenFileDescriptor.getStatSize(), new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()));
                } catch (FileNotFoundException unused) {
                    dVarC = null;
                }
                if (dVarC != null) {
                    return dVarC;
                }
            }
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            inputStreamOpenInputStream.getClass();
            return c(-1, inputStreamOpenInputStream);
        }
        if (uri.toString().endsWith("/photo")) {
            inputStreamCreateInputStream = contentResolver.openInputStream(uri);
        } else if (uri.toString().endsWith("/display_photo")) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                assetFileDescriptorOpenAssetFileDescriptor.getClass();
                inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
            } catch (IOException unused2) {
                throw new IOException(androidx.appcompat.app.r.n(uri, "Contact photo does not exist: "));
            }
        } else {
            InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
            if (inputStreamOpenContactPhotoInputStream == null) {
                throw new IOException(androidx.appcompat.app.r.n(uri, "Contact photo does not exist: "));
            }
            inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
        }
        inputStreamCreateInputStream.getClass();
        return c(-1, inputStreamCreateInputStream);
    }

    @Override // com.facebook.imagepipeline.producers.M
    public final String e() {
        return "LocalContentUriFetchProducer";
    }
}

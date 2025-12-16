package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: LocalResourceFetchProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class O extends M {

    /* renamed from: c, reason: collision with root package name */
    public final Resources f340582c;

    public O(Executor executor, wW0.g gVar, Resources resources) {
        super(executor, gVar);
        this.f340582c = resources;
    }

    @Override // com.facebook.imagepipeline.producers.M
    @I41.h
    public final YW0.d d(ImageRequest imageRequest) throws Resources.NotFoundException, NumberFormatException, IOException {
        int length;
        String path = imageRequest.f340782b.getPath();
        path.getClass();
        int i12 = Integer.parseInt(path.substring(1));
        Resources resources = this.f340582c;
        InputStream inputStreamOpenRawResource = resources.openRawResource(i12);
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
        try {
            String path2 = imageRequest.f340782b.getPath();
            path2.getClass();
            assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(Integer.parseInt(path2.substring(1)));
            length = (int) assetFileDescriptorOpenRawResourceFd.getLength();
            try {
                assetFileDescriptorOpenRawResourceFd.close();
            } catch (IOException unused) {
            }
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused3) {
                }
            }
            length = -1;
        } catch (Throwable th2) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
        return c(length, inputStreamOpenRawResource);
    }

    @Override // com.facebook.imagepipeline.producers.M
    public final String e() {
        return "LocalResourceFetchProducer";
    }
}

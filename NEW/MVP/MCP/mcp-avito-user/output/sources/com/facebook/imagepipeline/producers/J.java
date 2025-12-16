package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: LocalAssetFetchProducer.java */
/* loaded from: classes15.dex */
public class J extends M {

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager f340562c;

    public J(Executor executor, wW0.g gVar, AssetManager assetManager) {
        super(executor, gVar);
        this.f340562c = assetManager;
    }

    @Override // com.facebook.imagepipeline.producers.M
    public final YW0.d d(ImageRequest imageRequest) throws IOException {
        int length;
        String strSubstring = imageRequest.f340782b.getPath().substring(1);
        AssetManager assetManager = this.f340562c;
        InputStream inputStreamOpen = assetManager.open(strSubstring, 2);
        AssetFileDescriptor assetFileDescriptorOpenFd = null;
        try {
            assetFileDescriptorOpenFd = assetManager.openFd(imageRequest.f340782b.getPath().substring(1));
            length = (int) assetFileDescriptorOpenFd.getLength();
            try {
                assetFileDescriptorOpenFd.close();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused3) {
                }
            }
            length = -1;
        } catch (Throwable th2) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
        return c(length, inputStreamOpen);
    }

    @Override // com.facebook.imagepipeline.producers.M
    public final String e() {
        return "LocalAssetFetchProducer";
    }
}

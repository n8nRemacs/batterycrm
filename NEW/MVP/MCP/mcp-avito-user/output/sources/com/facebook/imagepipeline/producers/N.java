package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.io.FileInputStream;

/* compiled from: LocalFileFetchProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class N extends M {
    @Override // com.facebook.imagepipeline.producers.M
    @I41.h
    public final YW0.d d(ImageRequest imageRequest) {
        return c((int) imageRequest.a().length(), new FileInputStream(imageRequest.a().toString()));
    }

    @Override // com.facebook.imagepipeline.producers.M
    public final String e() {
        return "LocalFileFetchProducer";
    }
}

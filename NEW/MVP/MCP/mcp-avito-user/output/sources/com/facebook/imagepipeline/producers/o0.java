package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: QualifiedResourceFetchProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class o0 extends M {

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f340710c;

    public o0(Executor executor, wW0.g gVar, ContentResolver contentResolver) {
        super(executor, gVar);
        this.f340710c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.M
    @I41.h
    public final YW0.d d(ImageRequest imageRequest) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream = this.f340710c.openInputStream(imageRequest.f340782b);
        com.facebook.common.internal.o.c(inputStreamOpenInputStream, "ContentResolver returned null InputStream");
        return c(-1, inputStreamOpenInputStream);
    }

    @Override // com.facebook.imagepipeline.producers.M
    public final String e() {
        return "QualifiedResourceFetchProducer";
    }
}

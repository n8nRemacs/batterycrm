package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.A;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;

/* compiled from: BaseNetworkFetcher.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC36397c<FETCH_STATE extends A> implements V<FETCH_STATE> {
    @Override // com.facebook.imagepipeline.producers.V
    public final boolean c(FETCH_STATE fetch_state) {
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.V
    @I41.h
    public Map<String, String> d(FETCH_STATE fetch_state, int i12) {
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public void b(A a12) {
    }
}

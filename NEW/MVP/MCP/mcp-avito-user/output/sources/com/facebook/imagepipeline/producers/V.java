package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.A;
import java.io.InputStream;
import java.util.Map;

/* compiled from: NetworkFetcher.java */
/* loaded from: classes15.dex */
public interface V<FETCH_STATE extends A> {

    /* compiled from: NetworkFetcher.java */
    public interface a {
        void a(int i12, InputStream inputStream);

        void b();

        void onFailure(Exception exc);
    }

    FETCH_STATE a(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var);

    void b(A a12);

    boolean c(FETCH_STATE fetch_state);

    @I41.h
    Map<String, String> d(FETCH_STATE fetch_state, int i12);

    void e(FETCH_STATE fetch_state, a aVar);
}

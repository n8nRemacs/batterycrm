package ru.cyberity.cbr.core.common;

import io.noties.markwon.j;
import okhttp3.logging.HttpLoggingInterceptor;
import ru.cyberity.cbr.core.common.m;
import ru.cyberity.cbr.core.common.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class A implements HttpLoggingInterceptor.Logger, j.a {
    @Override // io.noties.markwon.j.a
    public void a(io.noties.markwon.j jVar) {
        s.a.a((io.noties.markwon.simple.ext.e) jVar);
    }

    @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
    public void log(String str) {
        m.b.a(str);
    }
}

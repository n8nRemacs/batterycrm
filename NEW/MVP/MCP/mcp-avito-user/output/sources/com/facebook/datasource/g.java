package com.facebook.datasource;

import com.facebook.common.internal.r;

/* compiled from: DataSources.java */
/* loaded from: classes5.dex */
final class g implements r<f<Object>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NullPointerException f339887a;

    public g(NullPointerException nullPointerException) {
        this.f339887a = nullPointerException;
    }

    @Override // com.facebook.common.internal.r
    public final f<Object> get() {
        o oVar = new o();
        NullPointerException nullPointerException = this.f339887a;
        nullPointerException.getClass();
        oVar.k(nullPointerException, null);
        return oVar;
    }
}

package com.facebook.drawee.controller;

import com.facebook.common.internal.n;
import com.facebook.common.internal.r;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;

/* compiled from: AbstractDraweeControllerBuilder.java */
/* loaded from: classes.dex */
class c implements r<com.facebook.datasource.f<Object>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.facebook.drawee.backends.pipeline.e f340011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f340012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f340013c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractDraweeControllerBuilder.CacheLevel f340014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractDraweeControllerBuilder f340015e;

    public c(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, com.facebook.drawee.backends.pipeline.e eVar, String str, Object obj, AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        this.f340015e = abstractDraweeControllerBuilder;
        this.f340011a = eVar;
        this.f340012b = str;
        this.f340013c = obj;
        this.f340014d = cacheLevel;
    }

    @Override // com.facebook.common.internal.r
    public final com.facebook.datasource.f<Object> get() {
        return this.f340015e.b(this.f340011a, this.f340012b, this.f340013c, this.f340014d);
    }

    public final String toString() {
        n.b bVarB = n.b(this);
        bVarB.b(this.f340013c.toString(), "request");
        return bVarB.toString();
    }
}

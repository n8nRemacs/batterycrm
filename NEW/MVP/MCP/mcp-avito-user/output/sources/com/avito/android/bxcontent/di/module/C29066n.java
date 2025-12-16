package com.avito.android.bxcontent.di.module;

import android.os.Bundle;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.p1;
import gj.InterfaceC40691b;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: BxContentKonveyorItemModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/di/module/n;", "LWQ/h;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.di.module.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29066n implements WQ.h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.util.groupable_item.b f111002a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f111003b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<vs0.d> f111004c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final p1 f111005d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Bundle f111006e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final SearchParams f111007f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f111008g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final rs0.c f111009h;

    public C29066n(com.avito.android.lib.util.groupable_item.b bVar, h31.e<InterfaceC47690b> eVar, h31.e<vs0.d> eVar2, p1 p1Var, Bundle bundle, SearchParams searchParams, InterfaceC40691b interfaceC40691b, rs0.c cVar) {
        this.f111002a = bVar;
        this.f111003b = eVar;
        this.f111004c = eVar2;
        this.f111005d = p1Var;
        this.f111006e = bundle;
        this.f111007f = searchParams;
        this.f111008g = interfaceC40691b;
        this.f111009h = cVar;
    }

    @Override // WQ.h
    @Y61.k
    /* renamed from: V, reason: from getter */
    public final InterfaceC40691b getF111008g() {
        return this.f111008g;
    }

    @Override // WQ.h
    @Y61.l
    /* renamed from: W, reason: from getter */
    public final SearchParams getF111007f() {
        return this.f111007f;
    }

    @Override // WQ.h
    @Y61.k
    public final h31.e<vs0.d> X() {
        return this.f111004c;
    }

    @Override // WQ.h
    @Y61.l
    /* renamed from: Y, reason: from getter */
    public final Bundle getF111006e() {
        return this.f111006e;
    }

    @Override // WQ.h
    @Y61.k
    /* renamed from: Z, reason: from getter */
    public final p1 getF111005d() {
        return this.f111005d;
    }

    @Override // WQ.h
    @Y61.k
    /* renamed from: a0, reason: from getter */
    public final com.avito.android.lib.util.groupable_item.b getF111002a() {
        return this.f111002a;
    }

    @Override // WQ.h
    @Y61.k
    public final h31.e<InterfaceC47690b> b0() {
        return this.f111003b;
    }

    @Override // WQ.h
    @Y61.k
    /* renamed from: c0, reason: from getter */
    public final rs0.c getF111009h() {
        return this.f111009h;
    }
}

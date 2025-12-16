package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;

/* loaded from: classes8.dex */
public final class ce<T extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f384238a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ViewGroup f384239b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final x80<T> f384240c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final w80<T> f384241d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final be<T> f384242e;

    public ce(@Y61.k Context context, @Y61.k com.yandex.mobile.ads.banner.h hVar, @Y61.k List list, @Y61.k ViewTreeObserver.OnPreDrawListener onPreDrawListener, @Y61.k x80 x80Var, @Y61.k w80 w80Var, @Y61.k be beVar) {
        this.f384238a = context;
        this.f384239b = hVar;
        this.f384240c = x80Var;
        this.f384241d = w80Var;
        this.f384242e = beVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        ViewGroup viewGroupA;
        u80<V> u80VarA = this.f384240c.a(this.f384238a);
        if (u80VarA == 0 || (viewGroupA = this.f384241d.a(this.f384239b, u80VarA)) == null) {
            return;
        }
        this.f384242e.a(this.f384239b, viewGroupA, u80VarA);
    }

    public final void b() {
        this.f384242e.a(this.f384239b);
    }

    public /* synthetic */ ce(Context context, com.yandex.mobile.ads.banner.h hVar, List list, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(context, hVar, list, onPreDrawListener, new x80(list), new w80(), new be(onPreDrawListener));
    }
}

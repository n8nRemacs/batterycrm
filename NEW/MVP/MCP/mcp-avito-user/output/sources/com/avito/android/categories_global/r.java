package com.avito.android.categories_global;

import Jn.InterfaceC14220a;
import Kn.C14332b;
import android.content.Context;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.C29972i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoriesScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "LJn/a;", "invoke", "(Landroid/content/Context;)LJn/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class r extends N implements Y41.l<Context, InterfaceC14220a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.m f116440l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.screens.compose.g f116441m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f116442n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f116443o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f116444p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.appcompat.app.m mVar, com.avito.android.analytics.screens.compose.g gVar, boolean z12, String str, String str2) {
        super(1);
        this.f116440l = mVar;
        this.f116441m = gVar;
        this.f116442n = z12;
        this.f116443o = str;
        this.f116444p = str2;
    }

    @Override // Y41.l
    public final InterfaceC14220a invoke(Context context) {
        return ((InterfaceC14220a.b) C29972i.a(C29972i.b(context), InterfaceC14220a.b.class)).dc().a(cv.c.c(this.f116440l), new C28478k(CategoriesScreenPerf.f116306d, this.f116441m.f90579b, "CategoriesGlobal"), this.f116442n, new C14332b(this.f116443o, this.f116444p));
    }
}

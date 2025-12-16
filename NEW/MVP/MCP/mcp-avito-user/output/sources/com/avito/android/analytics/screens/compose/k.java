package com.avito.android.analytics.screens.compose;

import Ac.InterfaceC13007a;
import android.content.Context;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22983P;
import com.avito.android.categories_global.CategoriesScreen;
import com.avito.android.di.C29972i;
import com.avito.android.memory.consumption.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ScreenMetadata.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/analytics/screens/compose/h;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/analytics/screens/compose/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k extends N implements Y41.l<C23060r0, h> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f90583l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CategoriesScreen f90584m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f90585n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, CategoriesScreen categoriesScreen, InterfaceC22983P interfaceC22983P) {
        super(1);
        this.f90583l = context;
        this.f90584m = categoriesScreen;
        this.f90585n = interfaceC22983P;
    }

    @Override // Y41.l
    public final h invoke(C23060r0 c23060r0) {
        InterfaceC22983P interfaceC22983P = this.f90585n;
        CategoriesScreen categoriesScreen = this.f90584m;
        f.a aVarA = ((InterfaceC13007a.b) C29972i.a(C29972i.b(this.f90583l), InterfaceC13007a.b.class)).Fb().a(new j(interfaceC22983P, categoriesScreen)).a();
        com.avito.android.time.c.f301452a.getClass();
        return new h(new g(aVarA, new com.avito.android.analytics.screens.r(categoriesScreen, Long.valueOf(com.avito.android.time.c.f301453b.a()), (String) null, 4, (C42822w) null)));
    }
}

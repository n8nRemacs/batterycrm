package com.avito.android.universal_map.map;

import com.avito.android.util.V2;
import kotlin.Metadata;
import qG0.C47292c;

/* compiled from: UniversalPointsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class X<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f304907b;

    public X(g0 g0Var) {
        this.f304907b = g0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        V2.f318762a.f(th2);
        g0 g0Var = this.f304907b;
        g0Var.f305197Z.postValue(new C47292c(g0Var.f305187P.getF419643a(), th2, null, 4, null));
    }
}

package com.akita.compose.component.navbar;

import androidx.compose.runtime.A;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavBarAction.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f62208l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62209m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f62210n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f62211o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u f62212p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Y41.a aVar, v.a aVar2, String str, u uVar) {
        super(2);
        this.f62208l = iVar;
        this.f62209m = aVar;
        this.f62210n = aVar2;
        this.f62211o = str;
        this.f62212p = uVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            h.b(this.f62208l, this.f62209m, this.f62210n, androidx.compose.runtime.internal.r.c(-617211602, new d(this.f62211o, this.f62212p), a13), a13, 3072, 0);
        }
        return G0.f406611a;
    }
}

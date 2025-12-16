package com.avito.android.categories_global.compose;

import Ln.C14417b;
import Ln.C14418c;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoriesScreenContentUi.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class q extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f116361l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C14418c f116362m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f116363n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C14417b, G0> f116364o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(boolean z12, C14418c c14418c, String str, Y41.l<? super C14417b, G0> lVar) {
        super(1);
        this.f116361l = z12;
        this.f116362m = c14418c;
        this.f116363n = str;
        this.f116364o = lVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        String str = this.f116363n;
        boolean z12 = this.f116361l;
        m0Var2.c(null, null, new C22096n(612121135, new l(z12, str), true));
        if (z12) {
            for (int i12 = 0; i12 < 10; i12++) {
                t.f116375a.getClass();
                m0Var2.c(null, null, t.f116377c);
            }
        } else {
            ?? r12 = this.f116362m.f10113a;
            m0Var2.a(r12.size(), null, new o(m.f116356l, r12), new C22096n(-632812321, new p(this.f116364o, r12), true));
        }
        return G0.f406611a;
    }
}

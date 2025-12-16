package com.avito.android.mnz_common.compose;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import wZ.C49578b;

/* compiled from: MnzNavBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class m extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C49578b f197913l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f197914m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(C49578b c49578b, Y41.l<? super DeepLink, G0> lVar) {
        super(2);
        this.f197913l = c49578b;
        this.f197914m = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            C49578b c49578b = this.f197913l;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.button.t tVarG0 = com.akita.compose.theme.re23.b.c(a13).g0();
            com.akita.compose.component.button.m.c(c49578b.f441546a, new l(c49578b, this.f197914m), tVarG0, null, null, null, null, false, false, null, a13, 512, 1016);
        }
        return G0.f406611a;
    }
}

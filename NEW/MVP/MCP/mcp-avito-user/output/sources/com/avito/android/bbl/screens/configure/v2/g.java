package com.avito.android.bbl.screens.configure.v2;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BblConfigureV2Fragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BblConfigureV2Fragment f99324l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ah.c f99325m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BblConfigureV2Fragment bblConfigureV2Fragment, Ah.c cVar) {
        super(2);
        this.f99324l = bblConfigureV2Fragment;
        this.f99325m = cVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, r.c(1233806825, new f(this.f99324l, this.f99325m), a13), a13, 48, 1);
        }
        return G0.f406611a;
    }
}

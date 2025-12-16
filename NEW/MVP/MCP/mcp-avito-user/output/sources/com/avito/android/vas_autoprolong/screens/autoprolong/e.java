package com.avito.android.vas_autoprolong.screens.autoprolong;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoprolongFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoprolongFragment f319527l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f319528m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AutoprolongFragment autoprolongFragment, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f319527l = autoprolongFragment;
        this.f319528m = interfaceC22204y1;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, r.c(-494602224, new d(this.f319527l, this.f319528m), a13), a13, 48, 1);
        }
        return G0.f406611a;
    }
}

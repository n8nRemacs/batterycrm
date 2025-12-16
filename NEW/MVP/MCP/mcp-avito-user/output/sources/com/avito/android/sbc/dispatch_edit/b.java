package com.avito.android.sbc.dispatch_edit;

import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SbcDispatchEditFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f260056l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SbcDispatchEditFragment f260057m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC22204y1 interfaceC22204y1, SbcDispatchEditFragment sbcDispatchEditFragment) {
        super(2);
        this.f260056l = interfaceC22204y1;
        this.f260057m = sbcDispatchEditFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            e.c((Wo0.d) this.f260056l.getF42167b(), new a(this.f260057m), a13, 8);
        }
        return G0.f406611a;
    }
}

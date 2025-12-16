package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.ui;

import Y41.p;
import androidx.compose.runtime.A;
import com.akita.compose.component.list_item.s;
import com.akita.compose.component.toggle.ToggleState;
import com.akita.compose.component.toggle.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacEnableBottomSheetContent.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f227876l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f227877m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ToggleState f227878n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f227879o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z12, s sVar, ToggleState toggleState, Y41.a<G0> aVar) {
        super(2);
        this.f227876l = z12;
        this.f227877m = sVar;
        this.f227878n = toggleState;
        this.f227879o = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            a13.C(746992440);
            Object objT = a13.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            ToggleState toggleState = this.f227878n;
            if (objT == c1651a) {
                objT = new e(toggleState, this.f227879o);
                a13.H(objT);
            }
            a13.h();
            r.a(this.f227876l, (Y41.a) objT, this.f227877m.f61957i, null, toggleState, null, a13, 48, 104);
        }
        return G0.f406611a;
    }
}

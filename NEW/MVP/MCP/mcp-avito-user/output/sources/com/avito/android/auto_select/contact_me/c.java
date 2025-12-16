package com.avito.android.auto_select.contact_me;

import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import gf.C40672c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectContactMeBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f95957l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AutoSelectContactMeBottomSheetFragment f95958m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC22204y1 interfaceC22204y1, AutoSelectContactMeBottomSheetFragment autoSelectContactMeBottomSheetFragment) {
        super(2);
        this.f95957l = interfaceC22204y1;
        this.f95958m = autoSelectContactMeBottomSheetFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            C40672c c40672c = (C40672c) this.f95957l.getF42167b();
            AutoSelectContactMeBottomSheetFragment autoSelectContactMeBottomSheetFragment = this.f95958m;
            p.b(c40672c, new a(autoSelectContactMeBottomSheetFragment), new b(autoSelectContactMeBottomSheetFragment), null, a13, 0);
        }
        return G0.f406611a;
    }
}

package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.device_replacement_bottom_sheet;

import Y41.p;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DeviceReplacementBottomSheetFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DeviceReplacementBottomSheetFragment f227557l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f227558m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DeviceReplacementBottomSheetFragment deviceReplacementBottomSheetFragment, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(2);
        this.f227557l = deviceReplacementBottomSheetFragment;
        this.f227558m = dVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            DeviceReplacementBottomSheetFragment deviceReplacementBottomSheetFragment = this.f227557l;
            h hVar = new h(deviceReplacementBottomSheetFragment.f227547h0);
            a13.C(314513925);
            Object objT = a13.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new d(this.f227558m);
                a13.H(objT);
            }
            a13.h();
            f.a(hVar, deviceReplacementBottomSheetFragment.f227548i0, (Y41.a) objT, null, a13, 384, 8);
        }
        return G0.f406611a;
    }
}

package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.device_replacement_bottom_sheet;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DeviceReplacementBottomSheetFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-phones_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f {

    /* compiled from: DeviceReplacementBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f227559l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f227559l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f227559l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: DeviceReplacementBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f227560l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f227561m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f227562n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(int i12, Y41.a aVar, l lVar) {
            super(0);
            this.f227560l = (N) lVar;
            this.f227561m = i12;
            this.f227562n = aVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f227560l.invoke(Integer.valueOf(this.f227561m));
            this.f227562n.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: DeviceReplacementBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ DeviceListItem f227563l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DeviceListItem deviceListItem) {
            super(2);
            this.f227563l = deviceListItem;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                DeviceListItem deviceListItem = this.f227563l;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.ui.p.b(deviceListItem.f227647d, com.akita.compose.theme.re23.b.m(a13).getF66432c().f61952d, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DeviceReplacementBottomSheetFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f227564l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f227565m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f227566n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f227567o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f227568p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f227569q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(h hVar, l<? super Integer, G0> lVar, Y41.a<G0> aVar, v vVar, int i12, int i13) {
            super(2);
            this.f227564l = hVar;
            this.f227565m = (N) lVar;
            this.f227566n = aVar;
            this.f227567o = vVar;
            this.f227568p = i12;
            this.f227569q = i13;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f227568p | 1);
            h hVar = this.f227564l;
            ?? r12 = this.f227565m;
            f.a(hVar, r12, this.f227566n, this.f227567o, a12, iA2, this.f227569q);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0316  */
    @androidx.compose.runtime.InterfaceC22132o
    @android.annotation.SuppressLint({"NotConstructor"})
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.device_replacement_bottom_sheet.h r44, @Y61.k Y41.l<? super java.lang.Integer, kotlin.G0> r45, @Y61.k Y41.a<kotlin.G0> r46, @Y61.l androidx.compose.ui.v r47, @Y61.l androidx.compose.runtime.A r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.device_replacement_bottom_sheet.f.a(com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.device_replacement_bottom_sheet.h, Y41.l, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }
}

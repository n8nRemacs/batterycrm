package com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_devices_block;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.list_item.m;
import com.akita.compose.component.list_item.s;
import com.akita.compose.foundation.ui.g;
import com.avito.android.R;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import u0.i;

/* compiled from: IacDevicesBlock.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-phones_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final List<DeviceListItem> f228192a = C42745f0.U(new DeviceListItem("", "iPhone 15 Pro Max", "Это устройство • ID: 5427574099", 0, false), new DeviceListItem("", "Nothing A015", "ID: 5427574099", 0, true), new DeviceListItem("", "Pixel 8 Pro", "ID: 5427574099", 0, true));

    /* compiled from: IacDevicesBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<DeviceListItem, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f228193l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(DeviceListItem deviceListItem) {
            return G0.f406611a;
        }
    }

    /* compiled from: IacDevicesBlock.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_devices_block.b$b, reason: collision with other inner class name */
    public static final class C6934b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f228194l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6934b(String str) {
            super(2);
            this.f228194l = str;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.ui.p.b(this.f228194l, com.akita.compose.theme.re23.b.m(a13).getF66432c().f61952d, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IacDevicesBlock.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<DeviceListItem, G0> f228195l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeviceListItem f228196m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(l<? super DeviceListItem, G0> lVar, DeviceListItem deviceListItem) {
            super(2);
            this.f228195l = lVar;
            this.f228196m = deviceListItem;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r13, java.lang.Integer r14) {
            /*
                r12 = this;
                r4 = r13
                androidx.compose.runtime.A r4 = (androidx.compose.runtime.A) r4
                java.lang.Number r14 = (java.lang.Number) r14
                int r13 = r14.intValue()
                r13 = r13 & 11
                r14 = 2
                if (r13 != r14) goto L1a
                boolean r13 = r4.c()
                if (r13 != 0) goto L15
                goto L1a
            L15:
                r4.f()
                goto La1
            L1a:
                androidx.compose.ui.v$a r5 = androidx.compose.ui.v.f42878y1
                r13 = -524695168(0xffffffffe0b9c980, float:-1.0709898E20)
                r4.C(r13)
                Y41.l<com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem, kotlin.G0> r13 = r12.f228195l
                boolean r14 = r4.B(r13)
                java.lang.Object r0 = r4.t()
                androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
                if (r14 != 0) goto L37
                r1.getClass()
                androidx.compose.runtime.A$a$a r14 = androidx.compose.runtime.A.a.f37868b
                if (r0 != r14) goto L41
            L37:
                com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_devices_block.c r0 = new com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_devices_block.c
                com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem r14 = r12.f228196m
                r0.<init>(r13, r14)
                r4.H(r0)
            L41:
                r10 = r0
                Y41.a r10 = (Y41.a) r10
                r4.h()
                r13 = -524691320(0xffffffffe0b9d888, float:-1.0713282E20)
                r4.C(r13)
                java.lang.Object r13 = r4.t()
                r1.getClass()
                androidx.compose.runtime.A$a$a r14 = androidx.compose.runtime.A.a.f37868b
                if (r13 != r14) goto L5f
                androidx.compose.foundation.interaction.m r13 = androidx.compose.foundation.interaction.l.a()
                r4.H(r13)
            L5f:
                r6 = r13
                androidx.compose.foundation.interaction.m r6 = (androidx.compose.foundation.interaction.m) r6
                r4.h()
                r13 = 0
                r0 = 6
                r1 = 0
                r2 = 0
                androidx.compose.foundation.v1 r7 = com.akita.compose.foundation.n.d(r2, r0, r13, r1)
                r8 = 1
                r11 = 24
                r9 = 0
                androidx.compose.ui.v r5 = androidx.compose.foundation.C21086w0.b(r5, r6, r7, r8, r9, r10, r11)
                com.akita.compose.theme.re23.b r13 = com.akita.compose.theme.re23.b.f63983a
                r13.getClass()
                com.akita.compose.theme.re23.e r13 = com.akita.compose.theme.re23.b.f63985c
                r13.getClass()
                int r13 = com.akita.compose.theme.re23.e.f64413Y9
                androidx.compose.ui.graphics.painter.e r6 = u0.e.a(r13, r1, r4)
                com.akita.compose.theme.re23.semantic.b r13 = com.akita.compose.theme.re23.b.f63987e
                r13.getClass()
                W2.q r13 = com.akita.compose.theme.re23.semantic.b.f65954b
                X2.h r13 = r13.getText()
                r13.getClass()
                com.akita.compose.foundation.p r13 = X2.h.f18556d
                long r2 = r13.c(r4)
                r7 = 0
                r0 = 56
                r1 = 0
                com.akita.compose.foundation.ui.e.b(r0, r1, r2, r4, r5, r6, r7)
            La1:
                kotlin.G0 r13 = kotlin.G0.f406611a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_devices_block.b.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: IacDevicesBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f228197l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f228198m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<DeviceListItem, G0> f228199n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f228200o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(e eVar, v vVar, l<? super DeviceListItem, G0> lVar, int i12, int i13) {
            super(2);
            this.f228197l = eVar;
            this.f228198m = vVar;
            this.f228199n = lVar;
            this.f228200o = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(49);
            e eVar = this.f228197l;
            int i12 = this.f228200o;
            b.a(eVar, this.f228198m, this.f228199n, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k e eVar, @Y61.l v vVar, @Y61.l l<? super DeviceListItem, G0> lVar, @Y61.l A a12, int i12, int i13) {
        l<? super DeviceListItem, G0> lVar2;
        int i14;
        C22096n c22096n;
        l<? super DeviceListItem, G0> lVar3;
        B bE2 = a12.E(1588707478);
        int i15 = i12 | (bE2.B(eVar) ? 4 : 2);
        int i16 = i13 & 4;
        if (i16 != 0) {
            i14 = i15 | 384;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            i14 = i15 | (bE2.u(lVar2) ? 256 : 128);
        }
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
            lVar3 = lVar2;
        } else {
            l<? super DeviceListItem, G0> lVar4 = i16 != 0 ? a.f228193l : lVar2;
            C20585k.f28659a.getClass();
            C20585k.l lVar5 = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar5, InterfaceC22215f.a.f39088n, bE2, 0);
            int i17 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            String strC = i.c(bE2, R.string.numbers_and_calls_iac_devices);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i18 = androidx.compose.ui.text.style.i.f42680g;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(strC, iVar.f65234e, null, false, 0L, androidx.compose.ui.text.style.i.a(i18), 0, 0, false, null, bE2, 0, 988);
            float f12 = 6;
            h.a aVar2 = h.f42849c;
            g.a(f12, null, bE2, 6);
            com.akita.compose.foundation.ui.p.b(i.c(bE2, R.string.numbers_and_calls_iac_devices_info), iVar.f65240k, null, false, 0L, androidx.compose.ui.text.style.i.a(i18), 0, 0, false, null, bE2, 0, 988);
            bE2.C(-1646957328);
            List<DeviceListItem> list = eVar.f228204a;
            if (list.isEmpty()) {
                c22096n = null;
            } else {
                c22096n = null;
                g.a(f12, null, bE2, 6);
            }
            bE2.X(false);
            bE2.C(-1646953211);
            for (DeviceListItem deviceListItem : list) {
                s sVarG = f.g(com.akita.compose.theme.re23.b.f63983a, bE2);
                String str = deviceListItem.f227646c;
                bE2.C(-1646947655);
                String str2 = deviceListItem.f227647d;
                C22096n c22096nC = str2 == null ? c22096n : r.c(947108470, new C6934b(str2), bE2);
                bE2.X(false);
                bE2.C(-1646937022);
                C22096n c22096nC2 = deviceListItem.f227648e ? r.c(-1475826042, new c(lVar4, deviceListItem), bE2) : c22096n;
                bE2.X(false);
                m.d(str, sVarG, null, c22096nC, null, c22096nC2, bE2, 0, 20);
            }
            bE2.X(false);
            bE2.X(true);
            lVar3 = lVar4;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(eVar, vVar, lVar3, i12, i13);
        }
    }
}

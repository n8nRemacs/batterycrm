package com.avito.android.iac_dialer_ui.pub.common_ui;

import Y41.r;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.C22491k0;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIAudioModePeerInfo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d f167479a = new d();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f167480b = new C22096n(-563483728, a.f167484l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f167481c = new C22096n(-1874226851, b.f167485l, false);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C22096n f167482d = new C22096n(-1328631999, c.f167486l, false);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C22096n f167483e = new C22096n(-198179586, C4964d.f167487l, false);

    /* compiled from: IacUIAudioModePeerInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "timeStr", "Landroidx/compose/ui/v;", "contentModifier", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements r<String, v, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f167484l = new a();

        public a() {
            super(4);
        }

        @Override // Y41.r
        public final G0 invoke(String str, v vVar, A a12, Integer num) {
            int i12;
            String str2 = str;
            v vVar2 = vVar;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                i12 = (a13.B(str2) ? 4 : 2) | iIntValue;
            } else {
                i12 = iIntValue;
            }
            if ((iIntValue & 112) == 0) {
                i12 |= a13.B(vVar2) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && a13.c()) {
                a13.f();
            } else {
                v vVarA = C22501m2.a(C20588k2.d(vVar2, 1.0f), "IacUIAudioModePeerInfoTestTags.TIMER");
                androidx.compose.ui.text.style.i.f42675b.getClass();
                int i13 = androidx.compose.ui.text.style.i.f42681h;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65235f;
                s.f42720b.getClass();
                com.akita.compose.foundation.ui.p.b(str2, rVar, vVarA, false, 0L, androidx.compose.ui.text.style.i.a(i13), 1, s.f42722d, false, null, a13, (i12 & 14) | 14155776, 792);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IacUIAudioModePeerInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "timeStr", "Landroidx/compose/ui/v;", "contentModifier", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements r<String, v, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f167485l = new b();

        public b() {
            super(4);
        }

        @Override // Y41.r
        public final G0 invoke(String str, v vVar, A a12, Integer num) {
            int i12;
            String str2 = str;
            v vVar2 = vVar;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                i12 = (a13.B(str2) ? 4 : 2) | iIntValue;
            } else {
                i12 = iIntValue;
            }
            if ((iIntValue & 112) == 0) {
                i12 |= a13.B(vVar2) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && a13.c()) {
                a13.f();
            } else {
                v vVarA = C22501m2.a(vVar2, "IacUIAudioModePeerInfoTestTags.STATUS_TIMER");
                String strA = C22491k0.a(')', " (", str2);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
                s.f42720b.getClass();
                com.akita.compose.foundation.ui.p.b(strA, rVar, vVarA, false, 0L, null, 1, s.f42722d, false, null, a13, 14155776, 824);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IacUIAudioModePeerInfo.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f167486l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                j.a(j.f167500a, com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f.f166925b, null, a13, 54, 4);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IacUIAudioModePeerInfo.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.iac_dialer_ui.pub.common_ui.d$d, reason: collision with other inner class name */
    public static final class C4964d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4964d f167487l = new C4964d();

        public C4964d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                j.a(new IacUIAudioModePeerInfoState(null, null, null, true, 100L, null), com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f.f166925b, null, a13, 54, 4);
            }
            return G0.f406611a;
        }
    }
}

package com.avito.android.iac_dialer_ui.pub.call_screen.video_mode_peer_info;

import Y41.r;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.v;
import com.akita.compose.foundation.ui.p;
import com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIVideoModePeerInfo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f167360a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22096n f167361b = new C22096n(-547332145, C4962a.f167364l, false);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C22096n f167362c = new C22096n(-2050477324, b.f167365l, false);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C22096n f167363d = new C22096n(-1763854185, c.f167366l, false);

    /* compiled from: IacUIVideoModePeerInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "timeStr", "Landroidx/compose/ui/v;", "contentModifier", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.iac_dialer_ui.pub.call_screen.video_mode_peer_info.a$a, reason: collision with other inner class name */
    public static final class C4962a extends N implements r<String, v, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4962a f167364l = new C4962a();

        public C4962a() {
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
                v vVarA = C22501m2.a(vVar2, "IacUITestTags.VideoModePeerInfo.TIMER");
                String strConcat = " · ".concat(str2);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
                s.f42720b.getClass();
                p.b(strConcat, rVar, vVarA, false, 0L, null, 1, s.f42722d, false, null, a13, 14155776, 824);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IacUIVideoModePeerInfo.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f167365l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.avito.android.iac_dialer_ui.pub.call_screen.video_mode_peer_info.c.a(com.avito.android.iac_dialer_ui.pub.call_screen.video_mode_peer_info.c.f167368a, f.f166925b, null, a13, 54, 4);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IacUIVideoModePeerInfo.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f167366l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.avito.android.iac_dialer_ui.pub.call_screen.video_mode_peer_info.c.a(new IacUIVideoModePeerInfoState(null, null, "Устанавливаем соединение", null, null), com.avito.android.iac_dialer_ui.pub.call_screen.video_mode_peer_info.b.f167367l, null, a13, 54, 4);
            }
            return G0.f406611a;
        }
    }
}

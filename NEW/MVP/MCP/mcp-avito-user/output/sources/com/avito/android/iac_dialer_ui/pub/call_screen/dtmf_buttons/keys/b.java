package com.avito.android.iac_dialer_ui.pub.call_screen.dtmf_buttons.keys;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIDtmfButtonsKey.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f167271a = new b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f167272b = new C22096n(1318193067, a.f167274l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f167273c = new C22096n(335137555, C4959b.f167275l, false);

    /* compiled from: IacUIDtmfButtonsKey.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f167274l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                j.a(new k("1", "1", null, 4, null), com.avito.android.iac_dialer_ui.pub.call_screen.dtmf_buttons.keys.a.f167270l, null, a13, 54);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IacUIDtmfButtonsKey.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.iac_dialer_ui.pub.call_screen.dtmf_buttons.keys.b$b, reason: collision with other inner class name */
    public static final class C4959b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4959b f167275l = new C4959b();

        public C4959b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                j.a(new k("1", null, Integer.valueOf(R.drawable.iac_dialer_ui_public_icon_asterisk_24), 2, null), c.f167276l, null, a13, 48);
            }
            return G0.f406611a;
        }
    }
}

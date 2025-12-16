package com.akita.compose.theme.re23.preview;

import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: BannerPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C0 f65267a = new C0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f65268b = new C22096n(-198958704, a.f65269l, false);

    /* compiled from: BannerPreview.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20640y, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f65269l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(InterfaceC20640y interfaceC20640y, androidx.compose.runtime.A a12, Integer num) {
            InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(interfaceC20640y2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65240k;
                v.a aVar = androidx.compose.ui.v.f42878y1;
                InterfaceC22215f.f39074a.getClass();
                com.akita.compose.foundation.ui.p.b("Side content", rVar, interfaceC20640y2.d(aVar, InterfaceC22215f.a.f39080f), false, 0L, null, 0, 0, false, null, a13, 6, 1016);
            }
            return kotlin.G0.f406611a;
        }
    }
}

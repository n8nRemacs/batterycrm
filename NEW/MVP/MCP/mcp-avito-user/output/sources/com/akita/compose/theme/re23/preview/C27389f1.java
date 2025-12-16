package com.akita.compose.theme.re23.preview;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import com.adjust.sdk.Constants;
import kotlin.Metadata;

/* compiled from: PullToRefreshPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.theme.re23.preview.f1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27389f1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C27389f1 f65660a = new C27389f1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f65661b = new C22096n(419777014, a.f65663l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f65662c = new C22096n(-1191236268, b.f65664l, false);

    /* compiled from: PullToRefreshPreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.f1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f65663l = new a();

        public a() {
            super(4);
        }

        @Override // Y41.r
        public final kotlin.G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, androidx.compose.runtime.A a12, Integer num2) {
            int iIntValue = num.intValue();
            androidx.compose.runtime.A a13 = a12;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 112) == 0) {
                iIntValue2 |= a13.m(iIntValue) ? 32 : 16;
            }
            if ((iIntValue2 & 721) == 144 && a13.c()) {
                a13.f();
            } else {
                String strG = AK.c.g(iIntValue, "Item ");
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65240k;
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.p.b(strG, rVar, androidx.compose.foundation.layout.R1.i(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 8), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PullToRefreshPreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.f1$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f65664l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
                float f12 = Constants.MINIMAL_ERROR_STATUS_CODE;
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarF = C20588k2.f(vVarD, f12);
                C20585k.f28659a.getClass();
                C20650b.a(vVarF, null, null, false, C20585k.g(8), null, null, false, null, C27394g1.f65676l, a13, 805330950, 494);
            }
            return kotlin.G0.f406611a;
        }
    }
}

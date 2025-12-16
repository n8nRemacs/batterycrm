package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: SegmentedControlComposablePreviewProvider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.theme.re23.preview.h1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27399h1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C27399h1 f65696a = new C27399h1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f65697b = new C22096n(-1296882220, a.f65698l, false);

    /* compiled from: SegmentedControlComposablePreviewProvider.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lcom/akita/compose/component/segmented_control/z;", "it", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.h1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<kotlin.Q<? extends String, ? extends com.akita.compose.component.segmented_control.z>, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f65698l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(kotlin.Q<? extends String, ? extends com.akita.compose.component.segmented_control.z> q12, androidx.compose.runtime.A a12, Integer num) {
            kotlin.Q<? extends String, ? extends com.akita.compose.component.segmented_control.z> q13 = q12;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(q13) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                R2.a(q13, a13, iIntValue & 14);
            }
            return kotlin.G0.f406611a;
        }
    }
}

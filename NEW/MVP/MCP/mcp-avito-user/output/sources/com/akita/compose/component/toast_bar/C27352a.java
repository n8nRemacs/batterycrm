package com.akita.compose.component.toast_bar;

import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastBarHost.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.component.toast_bar.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27352a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C27352a f63239a = new C27352a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f63240b = new C22096n(-1758244107, C2103a.f63241l, false);

    /* compiled from: ToastBarHost.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/akita/compose/component/toast_bar/f;", "it", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/toast_bar/f;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.component.toast_bar.a$a, reason: collision with other inner class name */
    public static final class C2103a extends N implements Y41.q<InterfaceC27357f, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2103a f63241l = new C2103a();

        public C2103a() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(InterfaceC27357f interfaceC27357f, androidx.compose.runtime.A a12, Integer num) {
            InterfaceC27357f interfaceC27357f2 = interfaceC27357f;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(interfaceC27357f2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                H.a(interfaceC27357f2, null, null, a13, iIntValue & 14, 14);
            }
            return G0.f406611a;
        }
    }
}

package com.akita.compose.theme.re23.preview;

import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.modal.C27348b;
import com.akita.compose.component.modal.C27349c;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ModalPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y0 f65572a = new Y0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f65573b = new C22096n(-1699769813, a.f65575l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f65574c = new C22096n(-1741703103, b.f65576l, false);

    /* compiled from: ModalPreview.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/modal/c;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/modal/c;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<C27349c, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f65575l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(C27349c c27349c, androidx.compose.runtime.A a12, Integer num) {
            C27349c c27349c2 = c27349c;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(c27349c2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                W0 w02 = W0.f65551l;
                a13.C(-790943608);
                androidx.compose.runtime.J3 j32 = com.akita.compose.component.modal.D.f62003a;
                com.akita.compose.component.button.t tVar = ((com.akita.compose.component.modal.C) a13.o(j32)).f61996n;
                ArrayList arrayList = c27349c2.f62038a;
                if (arrayList.size() >= 3) {
                    arrayList.remove(0);
                }
                arrayList.add(new C27348b("Primary", w02, tVar, null, null, null, false, true));
                a13.h();
                X0 x02 = X0.f65559l;
                a13.C(-1746700778);
                com.akita.compose.component.button.t tVar2 = ((com.akita.compose.component.modal.C) a13.o(j32)).f61997o;
                ArrayList arrayList2 = c27349c2.f62038a;
                if (arrayList2.size() >= 3) {
                    arrayList2.remove(0);
                }
                arrayList2.add(new C27348b("Secondary", x02, tVar2, null, null, null, false, true));
                a13.h();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ModalPreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f65576l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63985c.getClass();
                androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(com.akita.compose.theme.re23.e.f64826w9, 0, a13);
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                C20806p1.a(eVarA, null, C20588k2.o(androidx.compose.ui.v.f42878y1, 80), null, null, 0.0f, null, a13, 440, 120);
            }
            return kotlin.G0.f406611a;
        }
    }
}

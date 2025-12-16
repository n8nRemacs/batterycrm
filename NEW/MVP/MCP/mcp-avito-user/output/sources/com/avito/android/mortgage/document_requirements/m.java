package com.avito.android.mortgage.document_requirements;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import b00.C25383b;
import com.avito.android.mortgage.document_requirements.model.Document;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class m extends N implements Y41.r<InterfaceC20793y, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f198964l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C25383b f198965m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l f198966n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List list, C25383b c25383b, Y41.l lVar) {
        super(4);
        this.f198964l = list;
        this.f198965m = c25383b;
        this.f198966n = lVar;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, A a12, Integer num2) {
        int i12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i12 = (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if (a13.p(i12 & 1, (i12 & 147) != 146)) {
            Document document = (Document) this.f198964l.get(iIntValue);
            a13.C(-1935883732);
            a13.C(1461572571);
            C25383b c25383b = this.f198965m;
            if (document == c25383b.f56814e) {
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                C20608p2.a(a13, C20588k2.t(androidx.compose.ui.v.f42878y1, 16));
            }
            a13.h();
            n.b(document, c25383b.f56812c == document, this.f198966n, a13, 0);
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            float f12 = 8;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            C20608p2.a(a13, C20588k2.t(aVar2, f12));
            a13.C(1461579673);
            if (document == c25383b.f56815f) {
                C20608p2.a(a13, C20588k2.t(aVar2, f12));
            }
            a13.h();
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}

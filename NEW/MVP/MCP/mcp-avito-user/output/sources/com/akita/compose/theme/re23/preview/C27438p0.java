package com.akita.compose.theme.re23.preview;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LazyDsl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.akita.compose.theme.re23.preview.p0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27438p0 extends kotlin.jvm.internal.N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f65783l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.q f65784m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f65785n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27438p0(List list, Y41.q qVar, List list2) {
        super(4);
        this.f65783l = list;
        this.f65784m = qVar;
        this.f65785n = list2;
    }

    @Override // Y41.r
    public final kotlin.G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, androidx.compose.runtime.A a12, Integer num2) {
        int i12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        androidx.compose.runtime.A a13 = a12;
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
            kotlin.Q q12 = (kotlin.Q) this.f65783l.get(iIntValue);
            a13.C(1622203440);
            this.f65784m.invoke(q12, a13, 0);
            a13.C(-86217197);
            if (iIntValue != C42745f0.J(this.f65785n)) {
                androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.ui.c.a(vVarD, com.akita.compose.theme.re23.b.f63984b.f63933j0, 0.0f, 0.0f, a13, 6);
            }
            a13.h();
            a13.h();
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}

package com.akita.compose.theme.re23.preview;

import androidx.compose.foundation.lazy.InterfaceC20793y;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyDsl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.akita.compose.theme.re23.preview.m0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27423m0 extends kotlin.jvm.internal.N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f65750l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f65751m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f65752n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27423m0(List list, List list2, List list3) {
        super(4);
        this.f65750l = list;
        this.f65751m = list2;
        this.f65752n = list3;
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
        if (!a13.p(i12 & 1, (i12 & 147) != 146)) {
            a13.f();
            return kotlin.G0.f406611a;
        }
        U2.a aVar = (U2.a) this.f65750l.get(iIntValue);
        a13.C(1621843127);
        aVar.getClass();
        throw null;
    }
}

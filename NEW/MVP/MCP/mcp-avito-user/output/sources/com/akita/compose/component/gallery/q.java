package com.akita.compose.component.gallery;

import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryScope.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/akita/compose/component/gallery/d;", "", "it", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/gallery/d;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class q extends N implements Y41.r<d, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f61622l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(Y41.l lVar) {
        super(4);
        this.f61622l = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.r
    public final G0 invoke(d dVar, Integer num, A a12, Integer num2) {
        int i12;
        d dVar2 = dVar;
        int iIntValue = num.intValue();
        A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 14) == 0) {
            i12 = (a13.B(dVar2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 112) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if ((i12 & 731) == 146 && a13.c()) {
            a13.f();
        } else {
            b.a(dVar2, this.f61622l.invoke(Integer.valueOf(iIntValue)), b.f61591a, a13, (i12 & 14) | 64);
        }
        return G0.f406611a;
    }
}

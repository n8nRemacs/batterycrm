package com.akita.compose.component.gallery;

import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryScope.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/akita/compose/component/gallery/d;", "", "it", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/gallery/d;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class r extends N implements Y41.r<d, Integer, A, Integer, G0> {
    @Override // Y41.r
    public final G0 invoke(d dVar, Integer num, A a12, Integer num2) {
        d dVar2 = dVar;
        num.intValue();
        A a13 = a12;
        int iIntValue = num2.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(dVar2) ? 4 : 2;
        }
        if ((iIntValue & 651) != 130 || !a13.c()) {
            throw null;
        }
        a13.f();
        return G0.f406611a;
    }
}

package com.avito.android.messenger.conversation.mvi.messages.composables;

import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessageList.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j extends N implements Y41.r<InterfaceC20793y, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<T1> f192201l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<h0, G0> f192202m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Y41.l lVar, List list) {
        super(4);
        this.f192201l = list;
        this.f192202m = lVar;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, A a12, Integer num2) {
        int i12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 14) == 0) {
            i12 = (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 112) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if ((i12 & 731) == 146 && a13.c()) {
            a13.f();
        } else {
            List<T1> list = this.f192201l;
            list.get(iIntValue).getF189216f().f189048b.f189223a.a(list.get(iIntValue), this.f192202m, com.akita.compose.foundation.semantics.a.a(interfaceC20793y2.c(androidx.compose.ui.v.f42878y1), new a(iIntValue)), a13, 0);
        }
        return G0.f406611a;
    }
}

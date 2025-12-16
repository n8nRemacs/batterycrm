package com.akita.compose.component.date_picker.ui;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.date_picker.K;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VerticalMonthsList.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "firstVisibleItemIndex", "Lkotlin/G0;", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class r<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f61396b;

    public r(K k12) {
        this.f61396b = k12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        int iIntValue = ((Number) obj).intValue();
        K k12 = this.f61396b;
        P2.b bVarM = k12.f61177h.m(k12.f61180k, iIntValue);
        InterfaceC22204y1 interfaceC22204y1 = k12.f61184o;
        if (!L.f((P2.b) ((C22082i3) interfaceC22204y1).getF42167b(), bVarM)) {
            ((C22082i3) interfaceC22204y1).setValue(bVarM);
        }
        return G0.f406611a;
    }
}

package com.avito.android.str_calendar.seller.reject.mvi;

import Ly0.InterfaceC14455a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.str_calendar.seller.reject.mvi.entity.StrCalendarRejectInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrCalendarRejectActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_calendar/seller/reject/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LLy0/a;", "Lcom/avito/android/str_calendar/seller/reject/mvi/entity/StrCalendarRejectInternalAction;", "LLy0/c;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC14455a, StrCalendarRejectInternalAction, Ly0.c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StrCalendarRejectInternalAction> b(InterfaceC14455a interfaceC14455a, Ly0.c cVar) {
        InterfaceC14455a interfaceC14455a2 = interfaceC14455a;
        Ly0.c cVar2 = cVar;
        if (interfaceC14455a2.equals(InterfaceC14455a.C0650a.f10306a)) {
            return new C43210w(StrCalendarRejectInternalAction.CloseScreen.f288056b);
        }
        if (!interfaceC14455a2.equals(InterfaceC14455a.b.f10307a)) {
            throw new NoWhenBranchMatchedException();
        }
        DeepLink deeplink = cVar2.f10311b.getDeeplink();
        return deeplink != null ? new C43210w(new StrCalendarRejectInternalAction.OpenDeeplink(deeplink)) : C43175k.w();
    }
}

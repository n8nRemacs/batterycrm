package com.avito.android.str_calendar.seller.reject.mvi;

import Ly0.InterfaceC14456b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.str_calendar.seller.reject.mvi.entity.StrCalendarRejectInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StrCalendarRejectOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/seller/reject/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_calendar/seller/reject/mvi/entity/StrCalendarRejectInternalAction;", "LLy0/b;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements t<StrCalendarRejectInternalAction, InterfaceC14456b> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14456b b(StrCalendarRejectInternalAction strCalendarRejectInternalAction) {
        StrCalendarRejectInternalAction strCalendarRejectInternalAction2 = strCalendarRejectInternalAction;
        if (strCalendarRejectInternalAction2 instanceof StrCalendarRejectInternalAction.CloseScreen) {
            return InterfaceC14456b.a.f10308a;
        }
        if (strCalendarRejectInternalAction2 instanceof StrCalendarRejectInternalAction.OpenDeeplink) {
            return new InterfaceC14456b.C0651b(((StrCalendarRejectInternalAction.OpenDeeplink) strCalendarRejectInternalAction2).f288057b);
        }
        throw new NoWhenBranchMatchedException();
    }
}

package com.avito.android.send_esia_data_screen.mvi;

import com.avito.android.arch.mvi.u;
import dr0.AbstractC39790b;
import dr0.C39792d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SendEsiaDataReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/send_esia_data_screen/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Ldr0/b;", "Ldr0/d;", "<init>", "()V", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements u<AbstractC39790b, C39792d> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C39792d a(AbstractC39790b abstractC39790b, C39792d c39792d) {
        AbstractC39790b abstractC39790b2 = abstractC39790b;
        C39792d c39792d2 = c39792d;
        if (abstractC39790b2 instanceof AbstractC39790b.c) {
            return new C39792d(true, false);
        }
        if (abstractC39790b2 instanceof AbstractC39790b.C11042b) {
            return new C39792d(false, true);
        }
        if (abstractC39790b2 instanceof AbstractC39790b.d ? true : abstractC39790b2.equals(AbstractC39790b.a.f394154a)) {
            return c39792d2;
        }
        throw new NoWhenBranchMatchedException();
    }
}

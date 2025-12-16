package com.avito.android.send_esia_data_screen.mvi;

import com.avito.android.arch.mvi.t;
import dr0.AbstractC39790b;
import dr0.AbstractC39791c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SendEsiaDataOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/send_esia_data_screen/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Ldr0/b;", "Ldr0/c;", "<init>", "()V", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements t<AbstractC39790b, AbstractC39791c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final AbstractC39791c b(AbstractC39790b abstractC39790b) {
        AbstractC39790b abstractC39790b2 = abstractC39790b;
        if (abstractC39790b2 instanceof AbstractC39790b.a) {
            return AbstractC39791c.a.f394158a;
        }
        if (abstractC39790b2 instanceof AbstractC39790b.d) {
            return new AbstractC39791c.b(((AbstractC39790b.d) abstractC39790b2).f394157a);
        }
        if (abstractC39790b2.equals(AbstractC39790b.c.f394156a) ? true : abstractC39790b2.equals(AbstractC39790b.C11042b.f394155a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}

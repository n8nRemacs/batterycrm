package com.avito.android.support_bottom_sheet.mvi;

import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import xA0.AbstractC49804b;
import xA0.AbstractC49805c;

/* compiled from: SupportDialogOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/support_bottom_sheet/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "LxA0/b;", "LxA0/c;", "<init>", "()V", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements t<AbstractC49804b, AbstractC49805c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final AbstractC49805c b(AbstractC49804b abstractC49804b) {
        AbstractC49804b abstractC49804b2 = abstractC49804b;
        if (abstractC49804b2 instanceof AbstractC49804b.a) {
            return AbstractC49805c.a.f442286a;
        }
        if (abstractC49804b2 instanceof AbstractC49804b.d) {
            return AbstractC49805c.C12851c.f442288a;
        }
        if (abstractC49804b2 instanceof AbstractC49804b.C12850b) {
            return new AbstractC49805c.b(((AbstractC49804b.C12850b) abstractC49804b2).f442283a);
        }
        if (abstractC49804b2 instanceof AbstractC49804b.c) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}

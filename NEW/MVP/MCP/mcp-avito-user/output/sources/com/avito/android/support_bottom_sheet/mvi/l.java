package com.avito.android.support_bottom_sheet.mvi;

import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import xA0.AbstractC49804b;
import xA0.C49806d;

/* compiled from: SupportDialogReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/support_bottom_sheet/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "LxA0/b;", "LxA0/d;", "<init>", "()V", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements u<AbstractC49804b, C49806d> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C49806d a(AbstractC49804b abstractC49804b, C49806d c49806d) {
        C49806d c49806d2;
        AbstractC49804b abstractC49804b2 = abstractC49804b;
        C49806d c49806d3 = c49806d;
        if (abstractC49804b2 instanceof AbstractC49804b.c) {
            c49806d2 = new C49806d(UU.a.a(c49806d3.f442289a, null, false, true, false, null, 999), UU.a.a(c49806d3.f442290b, null, false, false, false, null, ErrorCodes.MALFORMED_URL_EXCEPTION));
        } else {
            if (!(abstractC49804b2 instanceof AbstractC49804b.a)) {
                return c49806d3;
            }
            c49806d2 = new C49806d(UU.a.a(c49806d3.f442289a, null, false, false, true, null, 999), UU.a.a(c49806d3.f442290b, null, true, false, true, null, ErrorCodes.MALFORMED_URL_EXCEPTION));
        }
        return c49806d2;
    }
}

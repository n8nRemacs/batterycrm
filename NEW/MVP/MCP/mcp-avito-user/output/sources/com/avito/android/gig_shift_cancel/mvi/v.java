package com.avito.android.gig_shift_cancel.mvi;

import android.content.res.Resources;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.gig_shift_cancel.mvi.q;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigShiftCancelReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/v;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/gig_shift_cancel/mvi/q;", "Lcom/avito/android/gig_shift_cancel/mvi/x;", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class v implements com.avito.android.arch.mvi.u<q, x> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Resources f160692b;

    @Inject
    public v(@Y61.k Resources resources) {
        this.f160692b = resources;
    }

    @Override // com.avito.android.arch.mvi.u
    public final x a(q qVar, x xVar) throws Resources.NotFoundException {
        r rVar;
        q qVar2 = qVar;
        x xVar2 = xVar;
        if (qVar2 instanceof q.c) {
            q.c cVar = (q.c) qVar2;
            return new x(false, false, null, false, cVar.f160670c, false, cVar.f160668a, cVar.f160669b, null, null, 548, null);
        }
        boolean z12 = qVar2 instanceof q.b;
        Resources resources = this.f160692b;
        if (z12) {
            return x.a(xVar2, false, true, resources.getString(R.string.shift_cancel_common_error_msg), false, null, null, null, resources.getString(R.string.cancel_retry_title), null, 560);
        }
        if (qVar2 instanceof q.e) {
            return x.a(xVar2, false, false, null, true, null, null, null, resources.getString(R.string.cancel_to_my_shifts), null, 756);
        }
        if (qVar2 instanceof q.f) {
            return x.a(xVar2, true, false, null, false, null, null, null, null, null, 500);
        }
        if (!(qVar2 instanceof q.g)) {
            if (!(qVar2 instanceof q.h)) {
                return xVar2;
            }
            return x.a(xVar2, false, false, null, false, null, resources.getString(R.string.cancel_interrupt_title), resources.getString(R.string.cancel_interrupt_description), null, resources.getString(R.string.cancel_back), 287);
        }
        r rVar2 = xVar2.f160698f;
        if (rVar2 != null) {
            rVar = new r(rVar2.f160677a, rVar2.f160678b, rVar2.f160679c, rVar2.f160680d, rVar2.f160681e, rVar2.f160682f, rVar2.f160683g, rVar2.f160684h, rVar2.f160685i, rVar2.f160686j, ((q.g) qVar2).f160675a, rVar2.f160688l, rVar2.f160689m);
        } else {
            rVar = null;
        }
        return x.a(xVar2, false, false, null, false, rVar, null, null, null, null, ErrorCodes.IO_EXCEPTION);
    }
}

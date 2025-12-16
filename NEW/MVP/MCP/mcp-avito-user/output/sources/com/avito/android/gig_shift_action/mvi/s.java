package com.avito.android.gig_shift_action.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig_shift_action.mvi.q;
import com.avito.android.gig_shift_action.mvi.r;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigShiftActionOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/s;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/gig_shift_action/mvi/q;", "Lcom/avito/android/gig_shift_action/mvi/r;", "<init>", "()V", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s implements com.avito.android.arch.mvi.t<q, r> {
    @Inject
    public s() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final r b(q qVar) {
        r dVar;
        q qVar2 = qVar;
        if (qVar2 instanceof q.d) {
            return r.a.f160515a;
        }
        if (qVar2 instanceof q.a) {
            DeepLink deepLink = ((q.a) qVar2).f160502a;
            if (deepLink == null) {
                return r.a.f160515a;
            }
            dVar = new r.c(deepLink);
        } else {
            if (qVar2 instanceof q.e) {
                return r.b.f160516a;
            }
            if (!(qVar2 instanceof q.h)) {
                return null;
            }
            dVar = new r.d(((q.h) qVar2).f160512a);
        }
        return dVar;
    }
}

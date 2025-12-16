package com.avito.android.gig_shift_action.mvi;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.gig_shift_action.mvi.q;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigShiftActionReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/u;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/gig_shift_action/mvi/q;", "Lcom/avito/android/gig_shift_action/mvi/w;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class u implements com.avito.android.arch.mvi.u<q, w> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Resources f160520b;

    @Inject
    public u(@Y61.k Resources resources) {
        this.f160520b = resources;
    }

    @Override // com.avito.android.arch.mvi.u
    public final w a(q qVar, w wVar) throws Resources.NotFoundException {
        w wVar2;
        z zVar;
        q qVar2 = qVar;
        w wVar3 = wVar;
        if (qVar2 instanceof q.c) {
            q.c cVar = (q.c) qVar2;
            return new w(false, false, false, null, null, false, cVar.f160506c, false, cVar.f160504a, cVar.f160505b, null, null, 2200, null);
        }
        boolean z12 = qVar2 instanceof q.b;
        Resources resources = this.f160520b;
        if (z12) {
            return w.a(wVar3, false, true, resources.getString(R.string.shift_action_common_error_msg), false, null, null, null, resources.getString(R.string.retry_title), null, 144);
        }
        if (qVar2 instanceof q.f) {
            return w.a(wVar3, false, false, null, true, null, null, null, resources.getString(R.string.to_my_shifts), null, 3032);
        }
        if (qVar2 instanceof q.g) {
            return w.a(wVar3, true, false, null, false, null, null, null, null, null, 2008);
        }
        if (!(qVar2 instanceof q.i)) {
            if (!(qVar2 instanceof q.j)) {
                return wVar3;
            }
            return w.a(wVar3, false, false, null, false, null, resources.getString(R.string.interrupt_title), resources.getString(R.string.interrupt_description), null, resources.getString(R.string.back_to_shift), 1151);
        }
        z zVar2 = wVar3.f160528h;
        if (zVar2 != null) {
            wVar2 = wVar3;
            zVar = new z(zVar2.f160536a, zVar2.f160537b, zVar2.f160538c, zVar2.f160539d, zVar2.f160540e, zVar2.f160541f, zVar2.f160542g, zVar2.f160543h, zVar2.f160544i, zVar2.f160545j, ((q.i) qVar2).f160513a, zVar2.f160547l, zVar2.f160548m, zVar2.f160549n);
        } else {
            wVar2 = wVar3;
            zVar = null;
        }
        return w.a(wVar2, false, false, null, false, zVar, null, null, null, null, 4031);
    }
}

package com.avito.android.delayed_ux_feedback;

import SK0.b;
import Y61.k;
import Y61.l;
import androidx.view.M0;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import lD.C43617a;

/* compiled from: RemoteFeedbackHelper.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delayed_ux_feedback/f;", "Lcom/avito/android/delayed_ux_feedback/d;", "Landroidx/lifecycle/M0;", "_avito_delayed-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends M0 implements d {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final SK0.b f134741E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final C43617a f134742J;

    /* renamed from: K, reason: collision with root package name */
    @l
    public List<UxFeedbackConfigOld> f134743K;

    @Inject
    public f(@k SK0.b bVar, @k C43617a c43617a) {
        this.f134741E = bVar;
        this.f134742J = c43617a;
    }

    @Override // com.avito.android.delayed_ux_feedback.d
    public final void Tb() {
        ke(null);
    }

    @Override // com.avito.android.delayed_ux_feedback.d
    public final void U9(@l List<UxFeedbackConfigOld> list) {
        this.f134743K = list;
        ke(null);
    }

    @Override // com.avito.android.delayed_ux_feedback.d
    public final void ga(@k c cVar) {
        ke(cVar);
    }

    @Override // com.avito.android.delayed_ux_feedback.d
    public final void ge(@l List<UxFeedbackConfigOld> list) {
        this.f134743K = list;
    }

    public final void ke(c cVar) {
        List<UxFeedbackConfigOld> list;
        C43617a c43617a = this.f134742J;
        c43617a.getClass();
        n<Object> nVar = C43617a.f413588V[26];
        if (((Boolean) c43617a.f413590B.a().invoke()).booleanValue() && (list = this.f134743K) != null) {
            ArrayList arrayList = new ArrayList();
            for (UxFeedbackConfigOld uxFeedbackConfigOld : list) {
                String pollId = cVar == null ? uxFeedbackConfigOld.getPollId() : uxFeedbackConfigOld.getPollId() + cVar.getF264416b();
                b bVar = pollId != null ? new b(pollId) : null;
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b.a.a(this.f134741E, (b) it.next(), null, null, null, 14);
            }
        }
    }
}

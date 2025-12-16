package com.avito.android.ab_groups;

import com.avito.android.ab_groups.q;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import q3.C47189a;

/* compiled from: AbExperimentsActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class b extends H implements Y41.l<q.d, G0> {
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(q.d dVar) {
        q.d dVar2 = dVar;
        AbExperimentsActivity abExperimentsActivity = (AbExperimentsActivity) this.receiver;
        int i12 = AbExperimentsActivity.f67644v;
        abExperimentsActivity.getClass();
        if (dVar2 instanceof q.d.b) {
            D6.w(abExperimentsActivity.f67647o);
            D6.w(abExperimentsActivity.f67649q);
            D6.G(abExperimentsActivity.f67648p, true);
        } else if (dVar2 instanceof q.d.c) {
            D6.G(abExperimentsActivity.f67652t, true);
            D6.G(abExperimentsActivity.f67650r, true);
            D6.G(abExperimentsActivity.f67651s, true);
            D6.G(abExperimentsActivity.f67647o, true);
            D6.w(abExperimentsActivity.f67649q);
            D6.w(abExperimentsActivity.f67648p);
            ?? r42 = ((q.d.c) dVar2).f67688a;
            if (r42.isEmpty()) {
                p pVar = abExperimentsActivity.f67646n;
                (pVar != null ? pVar : null).notifyDataSetChanged();
            } else {
                p pVar2 = abExperimentsActivity.f67646n;
                p pVar3 = pVar2 != null ? pVar2 : null;
                ArrayList<C47189a> arrayList = pVar3.f67670e;
                arrayList.clear();
                arrayList.addAll((Collection) r42);
                pVar3.notifyDataSetChanged();
            }
        } else if (dVar2 instanceof q.d.a) {
            D6.G(abExperimentsActivity.f67652t, false);
            D6.G(abExperimentsActivity.f67650r, false);
            D6.G(abExperimentsActivity.f67651s, false);
            D6.G(abExperimentsActivity.f67647o, false);
            D6.w(abExperimentsActivity.f67647o);
            D6.G(abExperimentsActivity.f67649q, true);
            D6.w(abExperimentsActivity.f67648p);
        }
        return G0.f406611a;
    }
}

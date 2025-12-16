package com.avito.android.blueprints.radio_card.radio_card_group;

import Y41.p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;

/* compiled from: RadioCardsGroupView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class j extends H implements p<JO.m, Boolean, G0> {
    @Override // Y41.p
    public final G0 invoke(JO.m mVar, Boolean bool) {
        int i12;
        JO.m mVar2 = mVar;
        Boolean bool2 = bool;
        boolean zBooleanValue = bool2.booleanValue();
        m mVar3 = (m) this.receiver;
        ArrayList arrayList = mVar3.f106554h;
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (true) {
            i12 = -1;
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (mVar2.getF74628b() == ((JO.m) it.next()).getF74628b()) {
                break;
            }
            i13++;
        }
        Iterator it2 = arrayList.iterator();
        int i14 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (((JO.m) it2.next()).f8964e) {
                i12 = i14;
                break;
            }
            i14++;
        }
        if (i12 != i13) {
            JO.m mVar4 = (JO.m) C42745f0.K(i12, arrayList);
            if (mVar4 != null) {
                mVar4.f8964e = false;
            }
            JO.m mVar5 = (JO.m) C42745f0.K(i13, arrayList);
            if (mVar5 != null) {
                mVar5.f8964e = zBooleanValue;
            }
            mVar3.f106550d.f338510e = new UV0.c(arrayList);
            RecyclerView.Adapter adapter = mVar3.f106549c.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            p<? super JO.m, ? super Boolean, G0> pVar = mVar3.f106551e;
            if (pVar != null) {
                ((d) pVar).invoke(mVar2, bool2);
            }
        }
        return G0.f406611a;
    }
}

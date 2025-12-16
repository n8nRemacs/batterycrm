package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import androidx.compose.ui.autofill.t;
import j.X;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidAutofill.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {
    @X
    public static final void a(@Y61.k a aVar, @Y61.k ViewStructure viewStructure) {
        if (aVar.f38867b.f38897a.isEmpty()) {
            return;
        }
        l lVar = l.f38888a;
        s sVar = aVar.f38867b;
        int size = sVar.f38897a.size();
        lVar.getClass();
        int iAddChildCount = viewStructure.addChildCount(size);
        for (Map.Entry entry : sVar.f38897a.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            q qVar = (q) entry.getValue();
            l.f38888a.getClass();
            ViewStructure viewStructureNewChild = viewStructure.newChild(iAddChildCount);
            viewStructureNewChild.setAutofillId(aVar.f38869d, iIntValue);
            viewStructureNewChild.setId(iIntValue, aVar.f38866a.getContext().getPackageName(), null, null);
            t.f38898a.getClass();
            viewStructureNewChild.setAutofillType(((i) t.a.f38900b).f38886b);
            List<AutofillType> list = qVar.f38894a;
            ArrayList arrayList = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str = g.f38885a.get(list.get(i12));
                if (str == null) {
                    throw new IllegalArgumentException("Unsupported autofill type");
                }
                arrayList.add(str);
            }
            viewStructureNewChild.setAutofillHints((String[]) arrayList.toArray(new String[0]));
            l0.j jVar = qVar.f38895b;
            if (jVar != null) {
                int iRound = Math.round(jVar.f413390a);
                int iRound2 = Math.round(jVar.f413391b);
                int iRound3 = Math.round(jVar.f413392c);
                int iRound4 = Math.round(jVar.f413393d) - iRound2;
                l.f38888a.getClass();
                viewStructureNewChild.setDimens(iRound, iRound2, 0, 0, iRound3 - iRound, iRound4);
            }
            iAddChildCount++;
        }
    }
}

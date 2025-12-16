package ei;

import QV.e;
import Y61.k;
import android.content.Context;
import com.avito.android.beduin.common.component.i;
import com.avito.android.beduin.common.component.spacing.BeduinSpacingModel;
import com.avito.android.beduin.common.m;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinGroupingProcessor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lei/c;", "Lei/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ei.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C40109c implements InterfaceC40108b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f395318a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final QV.d f395319b = new QV.d();

    @Inject
    public C40109c(@k Context context) {
        this.f395318a = context;
    }

    @Override // ei.InterfaceC40108b
    @k
    public final ArrayList a(@k List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            BeduinModel beduinModel = (BeduinModel) obj;
            if ((beduinModel instanceof InterfaceC40107a) || (beduinModel instanceof m) || (beduinModel instanceof i)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                ArrayList arrayListA = this.f395319b.a(arrayList2, new e(0, 0, 3, null));
                int iF2 = P0.f(C42745f0.q(arrayListA, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                Iterator it2 = arrayListA.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    linkedHashMap.put(Integer.valueOf(((QV.b) next).f13743a), next);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    int i14 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    BeduinModel beduinModel2 = (BeduinModel) next2;
                    QV.b bVar = (QV.b) linkedHashMap.get(Integer.valueOf(i12));
                    InterfaceC40107a interfaceC40107a = beduinModel2 instanceof InterfaceC40107a ? (InterfaceC40107a) beduinModel2 : null;
                    if (bVar == null || interfaceC40107a == null) {
                        arrayList3.add(beduinModel2);
                    } else {
                        arrayList3.add(interfaceC40107a.applyRoundEdges(bVar.f13744b));
                        arrayList3.add(new BeduinSpacingModel(UUID.randomUUID().toString(), null, Integer.valueOf(y6.e(this.f395318a.getResources().getDimensionPixelSize(bVar.f13745c))), null, 10, null));
                    }
                    i12 = i14;
                }
                return arrayList3;
            }
            Object next3 = it.next();
            int i15 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            BeduinModel beduinModel3 = (BeduinModel) next3;
            InterfaceC40107a interfaceC40107a2 = beduinModel3 instanceof InterfaceC40107a ? (InterfaceC40107a) beduinModel3 : null;
            QV.a aVar = interfaceC40107a2 != null ? new QV.a(i13, interfaceC40107a2.needToGroup()) : null;
            if (aVar != null) {
                arrayList2.add(aVar);
            }
            i13 = i15;
        }
    }
}

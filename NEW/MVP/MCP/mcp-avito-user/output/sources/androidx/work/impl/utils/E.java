package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.b0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.InterfaceC23568j;
import androidx.work.impl.model.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: StatusRunnable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/work/WorkInfo;", "db", "Landroidx/work/impl/WorkDatabase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class E extends kotlin.jvm.internal.N implements Y41.l<WorkDatabase, List<? extends WorkInfo>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b0 f55935l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(b0 b0Var) {
        super(1);
        this.f55935l = b0Var;
    }

    @Override // Y41.l
    public final List<? extends WorkInfo> invoke(WorkDatabase workDatabase) {
        String str;
        androidx.camera.core.processing.j jVar = androidx.work.impl.model.H.f55794z;
        InterfaceC23568j interfaceC23568jW = workDatabase.w();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("SELECT * FROM workspec");
        b0 b0Var = this.f55935l;
        List<WorkInfo.State> list = b0Var.f55469d;
        String str2 = " AND";
        if (list.isEmpty()) {
            str = " WHERE";
        } else {
            List<WorkInfo.State> list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(u0.k((WorkInfo.State) it.next())));
            }
            sb2.append(" WHERE state IN (");
            y.a(arrayList2.size(), sb2);
            sb2.append(")");
            arrayList.addAll(arrayList2);
            str = " AND";
        }
        List<UUID> list3 = b0Var.f55466a;
        if (!list3.isEmpty()) {
            List<UUID> list4 = list3;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((UUID) it2.next()).toString());
            }
            sb2.append(str.concat(" id IN ("));
            y.a(list3.size(), sb2);
            sb2.append(")");
            arrayList.addAll(arrayList3);
            str = " AND";
        }
        List<String> list5 = b0Var.f55468c;
        if (list5.isEmpty()) {
            str2 = str;
        } else {
            sb2.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            y.a(list5.size(), sb2);
            sb2.append("))");
            arrayList.addAll(list5);
        }
        List<String> list6 = b0Var.f55467b;
        if (!list6.isEmpty()) {
            sb2.append(str2.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
            y.a(list6.size(), sb2);
            sb2.append("))");
            arrayList.addAll(list6);
        }
        sb2.append(";");
        return (List) jVar.apply(interfaceC23568jW.a(new Z1.b(sb2.toString(), arrayList.toArray(new Object[0]))));
    }
}

package androidx.recyclerview.widget;

import android.util.SparseArray;
import defpackage.a6c;
import defpackage.cid;
import defpackage.mid;
import defpackage.phd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class b {
    private static final int DEFAULT_MAX_SCRAP = 5;
    SparseArray<cid> mScrap = new SparseArray<>();
    int mAttachCountForClearing = 0;
    Set<phd> mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());

    public void attach() {
        this.mAttachCountForClearing++;
    }

    public void attachForPoolingContainer(phd phdVar) {
        this.mAttachedAdaptersForPoolingContainer.add(phdVar);
    }

    public void clear() {
        for (int i = 0; i < this.mScrap.size(); i++) {
            cid cidVarValueAt = this.mScrap.valueAt(i);
            Iterator it = cidVarValueAt.a.iterator();
            while (it.hasNext()) {
                a6c.a(((mid) it.next()).a);
            }
            cidVarValueAt.a.clear();
        }
    }

    public void detach() {
        this.mAttachCountForClearing--;
    }

    public void detachForPoolingContainer(phd phdVar, boolean z) {
        this.mAttachedAdaptersForPoolingContainer.remove(phdVar);
        if (this.mAttachedAdaptersForPoolingContainer.size() != 0 || z) {
            return;
        }
        for (int i = 0; i < this.mScrap.size(); i++) {
            SparseArray<cid> sparseArray = this.mScrap;
            ArrayList arrayList = sparseArray.get(sparseArray.keyAt(i)).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                a6c.a(((mid) arrayList.get(i2)).a);
            }
        }
    }

    public void factorInBindTime(int i, long j) {
        cid scrapDataForType = getScrapDataForType(i);
        scrapDataForType.d = runningAverage(scrapDataForType.d, j);
    }

    public void factorInCreateTime(int i, long j) {
        cid scrapDataForType = getScrapDataForType(i);
        scrapDataForType.c = runningAverage(scrapDataForType.c, j);
    }

    public mid getRecycledView(int i) {
        cid cidVar = this.mScrap.get(i);
        if (cidVar == null) {
            return null;
        }
        ArrayList arrayList = cidVar.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((mid) arrayList.get(size)).l()) {
                return (mid) arrayList.remove(size);
            }
        }
        return null;
    }

    public final cid getScrapDataForType(int i) {
        cid cidVar = this.mScrap.get(i);
        if (cidVar != null) {
            return cidVar;
        }
        cid cidVar2 = new cid();
        this.mScrap.put(i, cidVar2);
        return cidVar2;
    }

    public void onAdapterChanged(phd phdVar, phd phdVar2, boolean z) {
        if (phdVar != null) {
            detach();
        }
        if (!z && this.mAttachCountForClearing == 0) {
            clear();
        }
        if (phdVar2 != null) {
            attach();
        }
    }

    public void putRecycledView(mid midVar) {
        int i = midVar.X;
        ArrayList arrayList = getScrapDataForType(i).a;
        if (this.mScrap.get(i).b <= arrayList.size()) {
            a6c.a(midVar.a);
        } else {
            if (RecyclerView.K1 && arrayList.contains(midVar)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            midVar.v();
            arrayList.add(midVar);
        }
    }

    public long runningAverage(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return (j2 / 4) + ((j / 4) * 3);
    }

    public void setMaxRecycledViews(int i, int i2) {
        cid scrapDataForType = getScrapDataForType(i);
        scrapDataForType.b = i2;
        ArrayList arrayList = scrapDataForType.a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < this.mScrap.size(); i++) {
            ArrayList arrayList = this.mScrap.valueAt(i).a;
            if (arrayList != null) {
                size = arrayList.size() + size;
            }
        }
        return size;
    }

    public boolean willBindInTime(int i, long j, long j2) {
        long j3 = getScrapDataForType(i).d;
        return j3 == 0 || j + j3 < j2;
    }

    public boolean willCreateInTime(int i, long j, long j2) {
        long j3 = getScrapDataForType(i).c;
        return j3 == 0 || j + j3 < j2;
    }
}

package com.facebook.imagepipeline.datasource;

import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseListBitmapDataSubscriber.java */
@Nullsafe
/* loaded from: classes12.dex */
public abstract class e extends com.facebook.datasource.e<List<com.facebook.common.references.a<YW0.b>>> {
    @Override // com.facebook.datasource.e
    public final void f(com.facebook.datasource.f<List<com.facebook.common.references.a<YW0.b>>> fVar) {
        if (fVar.g()) {
            List<com.facebook.common.references.a<YW0.b>> listA = fVar.a();
            if (listA == null) {
                g();
                return;
            }
            try {
                ArrayList arrayList = new ArrayList(listA.size());
                for (com.facebook.common.references.a<YW0.b> aVar : listA) {
                    if (aVar == null || !(aVar.i() instanceof YW0.a)) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(((YW0.a) aVar.i()).d());
                    }
                }
                g();
                Iterator<com.facebook.common.references.a<YW0.b>> it = listA.iterator();
                while (it.hasNext()) {
                    com.facebook.common.references.a.c(it.next());
                }
            } catch (Throwable th2) {
                Iterator<com.facebook.common.references.a<YW0.b>> it2 = listA.iterator();
                while (it2.hasNext()) {
                    com.facebook.common.references.a.c(it2.next());
                }
                throw th2;
            }
        }
    }

    public abstract void g();
}

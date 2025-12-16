package com.avito.android.beduin.common.component;

import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinPayloads.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/e;", "", "<init>", "()V", "a", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final e f101116a = new e();

    /* compiled from: BeduinPayloads.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin_models/BeduinModel;", "M", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a<M extends BeduinModel> {
        @Y61.k
        M a(@Y61.k M m12);
    }

    /* compiled from: BeduinPayloads.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0002 \u0001*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/e$b;", "Lcom/avito/android/beduin/common/component/e$a;", "C", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<C extends a<?>> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Set<C> f101117a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k Set<? extends C> set) {
            this.f101117a = set;
        }
    }

    public static void a(@Y61.k Y41.l lVar, @Y61.k List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            b bVar = obj instanceof b ? (b) obj : null;
            Collection collection = bVar != null ? bVar.f101117a : null;
            if (collection != null) {
                arrayList.add(collection);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C42745f0.h((Set) it.next(), linkedHashSet);
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            lVar.invoke((a) it2.next());
        }
    }
}

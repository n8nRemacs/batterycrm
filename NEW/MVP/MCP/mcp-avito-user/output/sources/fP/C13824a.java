package Fp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DealPayloadProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFp/a;", "Lcom/avito/android/recycler/data_aware/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13824a implements com.avito.android.recycler.data_aware.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Set<com.avito.android.recycler.data_aware.a> f5991a;

    @Inject
    public C13824a(@k Set<com.avito.android.recycler.data_aware.a> set) {
        this.f5991a = set;
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        Set<com.avito.android.recycler.data_aware.a> set = this.f5991a;
        ArrayList arrayList = new ArrayList(C42745f0.q(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.avito.android.recycler.data_aware.a) it.next()).a(aVar, aVar2));
        }
        for (Object obj : arrayList) {
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }
}

package leakcanary;

import android.content.res.Resources;
import com.avito.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C42745f0;
import leakcanary.internal.RealHeapAnalysisJob;
import leakcanary.r;
import shark.AndroidResourceIdNames;

/* compiled from: SaveResourceIdsInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/K;", "Lleakcanary/q;", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class K implements InterfaceC43759q {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f413999a;

    public K(@Y61.k Resources resources) {
        this.f413999a = resources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // leakcanary.InterfaceC43759q
    @Y61.k
    public final r.a a(@Y61.k RealHeapAnalysisJob realHeapAnalysisJob) {
        Integer numValueOf;
        AndroidResourceIdNames.Companion companion = AndroidResourceIdNames.INSTANCE;
        I i12 = new I(this);
        J j12 = new J(this);
        synchronized (companion) {
            try {
                if (AndroidResourceIdNames.holderField == null) {
                    ArrayList arrayList = new ArrayList();
                    int i13 = R.anim.abc_fade_in;
                    while (true) {
                        String str = (String) i12.invoke(Integer.valueOf(i13));
                        if (str == null) {
                            numValueOf = null;
                            break;
                        }
                        if (str.hashCode() == 3355 && str.equals("id")) {
                            numValueOf = Integer.valueOf(i13);
                            break;
                        }
                        i13 += AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
                    }
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        while (true) {
                            String str2 = (String) j12.invoke(Integer.valueOf(iIntValue));
                            if (str2 == null) {
                                break;
                            }
                            arrayList.add(new kotlin.Q(Integer.valueOf(iIntValue), str2));
                            iIntValue++;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Integer.valueOf(((Number) ((kotlin.Q) it.next()).f406619b).intValue()));
                    }
                    int[] iArrL0 = C42745f0.L0(arrayList2);
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add((String) ((kotlin.Q) it2.next()).f406620c);
                    }
                    Object[] array = arrayList3.toArray(new String[0]);
                    if (array == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    AndroidResourceIdNames.holderField = new AndroidResourceIdNames(iArrL0, (String[]) array, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return realHeapAnalysisJob.e();
    }
}

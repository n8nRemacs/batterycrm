package shark.internal;

import java.util.Comparator;
import kotlin.Metadata;
import shark.AbstractC48368z1;
import shark.M1;

/* compiled from: GcRootProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u00002&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "Lshark/M1;", "Lshark/z1;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "<name for destructuring parameter 1>", "", "compare", "(Lkotlin/Q;Lkotlin/Q;)I", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class M<T> implements Comparator<kotlin.Q<? extends M1, ? extends AbstractC48368z1>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l f438391b;

    public M(Y41.l lVar) {
        this.f438391b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(kotlin.Q<? extends M1, ? extends AbstractC48368z1> q12, kotlin.Q<? extends M1, ? extends AbstractC48368z1> q13) {
        kotlin.Q<? extends M1, ? extends AbstractC48368z1> q14 = q12;
        kotlin.Q<? extends M1, ? extends AbstractC48368z1> q15 = q13;
        M1 m12 = (M1) q14.f406619b;
        AbstractC48368z1 abstractC48368z1 = (AbstractC48368z1) q14.f406620c;
        M1 m13 = (M1) q15.f406619b;
        AbstractC48368z1 abstractC48368z12 = (AbstractC48368z1) q15.f406620c;
        boolean z12 = abstractC48368z1 instanceof AbstractC48368z1.m;
        if (z12 && !(abstractC48368z12 instanceof AbstractC48368z1.m)) {
            return -1;
        }
        if (!z12 && (abstractC48368z12 instanceof AbstractC48368z1.m)) {
            return 1;
        }
        int iCompareTo = abstractC48368z12.getClass().getName().compareTo(abstractC48368z1.getClass().getName());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        Y41.l lVar = this.f438391b;
        return ((String) lVar.invoke(m12)).compareTo((String) lVar.invoke(m13));
    }
}

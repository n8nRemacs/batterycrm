package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final v f408385a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<v> f408386b;

    public l() {
        this(null, null, 3, null);
    }

    public l(@Y61.l v vVar, @Y61.k List<v> list) {
        this.f408385a = vVar;
        this.f408386b = list;
    }

    public l(v vVar, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : vVar, (i12 & 2) != 0 ? C42784z0.f406748b : list);
    }
}

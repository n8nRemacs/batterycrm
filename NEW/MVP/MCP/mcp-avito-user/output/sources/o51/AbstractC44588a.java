package o51;

import Y61.k;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;

/* compiled from: DeprecationInfo.kt */
/* renamed from: o51.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44588a implements Comparable<AbstractC44588a> {
    @k
    public abstract void a();

    @Override // java.lang.Comparable
    public final int compareTo(AbstractC44588a abstractC44588a) {
        a();
        DeprecationLevelValue deprecationLevelValue = DeprecationLevelValue.f409611b;
        abstractC44588a.a();
        return deprecationLevelValue.compareTo(deprecationLevelValue);
    }
}

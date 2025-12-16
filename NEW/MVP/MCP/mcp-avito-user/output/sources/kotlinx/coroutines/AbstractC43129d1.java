package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: MainCoroutineDispatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/d1;", "Lkotlinx/coroutines/M;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.d1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43129d1 extends M {
    @Override // kotlinx.coroutines.M
    @Y61.k
    public String toString() {
        AbstractC43129d1 abstractC43129d1Y;
        String str;
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        AbstractC43129d1 abstractC43129d1 = kotlinx.coroutines.internal.K.f411877a;
        if (this == abstractC43129d1) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC43129d1Y = abstractC43129d1.y();
            } catch (UnsupportedOperationException unused) {
                abstractC43129d1Y = null;
            }
            str = this == abstractC43129d1Y ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + X.a(this);
    }

    @Y61.k
    public abstract AbstractC43129d1 y();
}

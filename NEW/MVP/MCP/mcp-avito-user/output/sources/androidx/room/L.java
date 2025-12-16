package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.AbstractCollection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: EntityInsertionAdapter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/L;", "T", "Landroidx/room/O0;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public abstract class L<T> extends O0 {
    public abstract void d(@Y61.k Z1.i iVar, T t12);

    public final void e(T t12) {
        Z1.i iVarA = a();
        try {
            d(iVarA, t12);
            iVarA.E2();
        } finally {
            c(iVarA);
        }
    }

    public final long f(T t12) {
        Z1.i iVarA = a();
        try {
            d(iVarA, t12);
            return iVarA.E2();
        } finally {
            c(iVarA);
        }
    }

    @Y61.k
    public final kotlin.collections.builders.b g(@Y61.k AbstractCollection abstractCollection) {
        Z1.i iVarA = a();
        try {
            kotlin.collections.builders.b bVarT = C42745f0.t();
            Iterator<T> it = abstractCollection.iterator();
            while (it.hasNext()) {
                d(iVarA, it.next());
                bVarT.add(Long.valueOf(iVarA.E2()));
            }
            kotlin.collections.builders.b bVarP = C42745f0.p(bVarT);
            c(iVarA);
            return bVarP;
        } catch (Throwable th2) {
            c(iVarA);
            throw th2;
        }
    }
}

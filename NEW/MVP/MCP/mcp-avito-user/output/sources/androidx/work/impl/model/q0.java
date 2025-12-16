package androidx.work.impl.model;

import androidx.room.InterfaceC23458l0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: WorkTagDao.kt */
@androidx.room.A
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/q0;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface q0 {

    /* compiled from: WorkTagDao.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    @InterfaceC23458l0
    void a(@Y61.k String str);

    @InterfaceC23458l0
    @Y61.k
    ArrayList b(@Y61.k String str);

    default void c(@Y61.k String str, @Y61.k HashSet hashSet) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            d(new p0((String) it.next(), str));
        }
    }

    @androidx.room.W
    void d(@Y61.k p0 p0Var);
}

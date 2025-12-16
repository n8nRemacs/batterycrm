package androidx.work.impl.model;

import androidx.room.InterfaceC23458l0;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SystemIdInfoDao.kt */
@androidx.room.A
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/q;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.impl.model.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC23575q {

    /* compiled from: SystemIdInfoDao.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.impl.model.q$a */
    public static final class a {
    }

    @androidx.room.W
    void a(@Y61.k C23574p c23574p);

    @InterfaceC23458l0
    @Y61.k
    ArrayList b();

    @InterfaceC23458l0
    void c(int i12, @Y61.k String str);

    default void d(@Y61.k C23580w c23580w) {
        c(c23580w.f55890b, c23580w.f55889a);
    }

    @InterfaceC23458l0
    @Y61.l
    C23574p e(int i12, @Y61.k String str);

    @Y61.l
    default C23574p f(@Y61.k C23580w c23580w) {
        return e(c23580w.f55890b, c23580w.f55889a);
    }

    @InterfaceC23458l0
    void g(@Y61.k String str);
}

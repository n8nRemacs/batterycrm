package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.U0;
import androidx.work.impl.model.InterfaceC23560b;
import androidx.work.impl.model.InterfaceC23564f;
import androidx.work.impl.model.InterfaceC23568j;
import androidx.work.impl.model.InterfaceC23575q;
import androidx.work.impl.model.InterfaceC23582y;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WorkDatabase.kt */
@U0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@androidx.room.B
/* loaded from: classes10.dex */
public abstract class WorkDatabase extends RoomDatabase {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final a f55542n = new a(null);

    /* compiled from: WorkDatabase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/WorkDatabase$a;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Y61.k
    public abstract androidx.work.impl.model.I A();

    @Y61.k
    public abstract androidx.work.impl.model.q0 B();

    @Y61.k
    public abstract InterfaceC23560b u();

    @Y61.k
    public abstract InterfaceC23564f v();

    @Y61.k
    public abstract InterfaceC23568j w();

    @Y61.k
    public abstract InterfaceC23575q x();

    @Y61.k
    public abstract InterfaceC23582y y();

    @Y61.k
    public abstract androidx.work.impl.model.C z();
}

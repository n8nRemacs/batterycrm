package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: SharedSQLiteStatement.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/O0;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public abstract class O0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RoomDatabase f54289a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f54290b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f54291c = C42727D.c(new a());

    /* compiled from: SharedSQLiteStatement.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LZ1/i;", "invoke", "()LZ1/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Z1.i> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Z1.i invoke() {
            O0 o02 = O0.this;
            return o02.f54289a.e(o02.b());
        }
    }

    public O0(@Y61.k RoomDatabase roomDatabase) {
        this.f54289a = roomDatabase;
    }

    @Y61.k
    public final Z1.i a() {
        RoomDatabase roomDatabase = this.f54289a;
        roomDatabase.a();
        return this.f54290b.compareAndSet(false, true) ? (Z1.i) this.f54291c.getValue() : roomDatabase.e(b());
    }

    @Y61.k
    public abstract String b();

    public final void c(@Y61.k Z1.i iVar) {
        if (iVar == ((Z1.i) this.f54291c.getValue())) {
            this.f54290b.set(false);
        }
    }
}

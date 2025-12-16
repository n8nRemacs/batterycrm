package androidx.room.rxjava3;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.operators.maybe.K;
import io.reactivex.rxjava3.internal.operators.observable.C;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import io.reactivex.rxjava3.internal.operators.observable.I1;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import j.N;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import l41.InterfaceC43543a;

/* compiled from: RxRoom.java */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @N
    public static final Object f54396a = new Object();

    @N
    @RestrictTo
    public static C41933a0 a(@N final RoomDatabase roomDatabase, boolean z12, @N final String[] strArr, @N Callable callable) {
        Executor executor;
        int i12 = 0;
        Executor executor2 = null;
        if (!z12 ? (executor = roomDatabase.f54298b) != null : (executor = roomDatabase.f54299c) != null) {
            executor2 = executor;
        }
        H h12 = io.reactivex.rxjava3.schedulers.b.f404941a;
        io.reactivex.rxjava3.internal.schedulers.d dVar = new io.reactivex.rxjava3.internal.schedulers.d(executor2, false, false);
        return new C41933a0(new I1(new C(new io.reactivex.rxjava3.core.C() { // from class: androidx.room.rxjava3.c
            @Override // io.reactivex.rxjava3.core.C
            public final void f(B b12) {
                final f fVar = new f(strArr, b12);
                final RoomDatabase roomDatabase2 = roomDatabase;
                roomDatabase2.f54301e.a(fVar);
                b12.a(io.reactivex.rxjava3.disposables.d.Q(new InterfaceC43543a() { // from class: androidx.room.rxjava3.d
                    @Override // l41.InterfaceC43543a
                    public final void run() {
                        roomDatabase2.f54301e.c(fVar);
                    }
                }));
                b12.onNext(g.f54396a);
            }
        }).x0(dVar), dVar).j0(dVar), new b(new K(callable), i12));
    }

    @N
    @RestrictTo
    public static C42006d b(@N Callable callable) {
        return new C42006d(new Ae0.c(callable, 16));
    }
}

package p41;

import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.operators.observable.C41962k;
import io.reactivex.rxjava3.internal.util.f;
import j41.InterfaceC42196c;
import j41.e;
import j41.g;
import java.util.Objects;

/* compiled from: ConnectableObservable.java */
/* renamed from: p41.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46894a<T> extends z<T> {
    @e
    @InterfaceC42196c
    @g
    public final C41962k M0() {
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        Objects.requireNonNull(gVar, "connection is null");
        return new C41962k(this, gVar);
    }

    @e
    @g
    public final d N0() {
        f fVar = new f();
        O0(fVar);
        return fVar.f404833b;
    }

    @g
    public abstract void O0(@e l41.g<? super d> gVar);

    @g
    public abstract void P0();
}

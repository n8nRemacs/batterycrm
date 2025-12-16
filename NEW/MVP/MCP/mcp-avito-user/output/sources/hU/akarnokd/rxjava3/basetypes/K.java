package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: NonoLambdaSubscriber.java */
/* loaded from: classes8.dex */
final class K extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Void>, io.reactivex.rxjava3.disposables.d {
    private static final long serialVersionUID = 2347769328526232927L;

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        SubscriptionHelper.f(this, eVar);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        SubscriptionHelper.a(this);
    }

    @Override // org.reactivestreams.d
    public final void e() {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return SubscriptionHelper.f404813b == get();
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        try {
            throw null;
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            C47998a.b(new CompositeException(th2, th3));
        }
    }

    @Override // org.reactivestreams.d
    public final /* bridge */ /* synthetic */ void onNext(Void r12) {
    }
}

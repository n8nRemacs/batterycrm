package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.core.t;
import s41.C47998a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class EmptyComponent implements InterfaceC41782o<Object>, G<Object>, t<Object>, L<Object>, InterfaceC41771d, org.reactivestreams.e, io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    public static final EmptyComponent f404817b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EmptyComponent[] f404818c;

    static {
        EmptyComponent emptyComponent = new EmptyComponent("INSTANCE", 0);
        f404817b = emptyComponent;
        f404818c = new EmptyComponent[]{emptyComponent};
    }

    public EmptyComponent() {
        throw null;
    }

    public static EmptyComponent valueOf(String str) {
        return (EmptyComponent) Enum.valueOf(EmptyComponent.class, str);
    }

    public static EmptyComponent[] values() {
        return (EmptyComponent[]) f404818c.clone();
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        eVar.cancel();
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        dVar.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return true;
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        C47998a.b(th2);
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
    }

    @Override // org.reactivestreams.d
    public final void e() {
    }

    @Override // org.reactivestreams.d
    public final void onNext(Object obj) {
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onSuccess(Object obj) {
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
    }
}

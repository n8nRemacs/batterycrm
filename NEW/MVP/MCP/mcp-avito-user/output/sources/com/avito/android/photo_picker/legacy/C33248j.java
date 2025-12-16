package com.avito.android.photo_picker.legacy;

import io.reactivex.rxjava3.internal.operators.completable.C41828t;
import kotlin.Metadata;
import n41.InterfaceC44186c;

/* compiled from: PhotoPickerPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_picker.legacy.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33248j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33245g f219827b;

    public C33248j(C33245g c33245g) {
        this.f219827b = c33245g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        io.reactivex.rxjava3.internal.operators.completable.M mCommit = this.f219827b.f219795c.commit();
        return new C41828t((mCommit instanceof InterfaceC44186c ? ((InterfaceC44186c) mCommit).f() : new io.reactivex.rxjava3.internal.operators.completable.Q(mCommit)).o(3L));
    }
}

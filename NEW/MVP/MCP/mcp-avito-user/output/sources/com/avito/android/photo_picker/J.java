package com.avito.android.photo_picker;

import io.reactivex.rxjava3.internal.operators.completable.C41828t;
import kotlin.Metadata;
import n41.InterfaceC44186c;

/* compiled from: PhotoPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Z)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class J<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhotoPickerViewModel f218758b;

    public J(PhotoPickerViewModel photoPickerViewModel) {
        this.f218758b = photoPickerViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        ((Boolean) obj).getClass();
        io.reactivex.rxjava3.internal.operators.completable.M mCommit = this.f218758b.f218813E.commit();
        return new C41828t((mCommit instanceof InterfaceC44186c ? ((InterfaceC44186c) mCommit).f() : new io.reactivex.rxjava3.internal.operators.completable.Q(mCommit)).o(3L));
    }
}

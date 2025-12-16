package com.avito.android.update;

import com.avito.android.serp.adapter.U;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.completable.r;
import kotlin.Metadata;
import l41.o;

/* compiled from: UpdateApplicationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f306639b;

    public d(f fVar) {
        this.f306639b = fVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        UpdateApplicationActivity updateApplicationActivity = this.f306639b.f306648b;
        return updateApplicationActivity != null ? new r(new U(updateApplicationActivity, 3)) : C41823n.f402260b;
    }
}

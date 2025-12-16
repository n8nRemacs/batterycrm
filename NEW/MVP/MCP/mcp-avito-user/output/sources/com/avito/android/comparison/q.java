package com.avito.android.comparison;

import android.view.MotionEvent;
import com.avito.android.di.B;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HorizontalScrollManager.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comparison/q;", "", "<init>", "()V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f124188a;

    /* renamed from: b, reason: collision with root package name */
    public int f124189b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<MotionEvent> f124190c = new io.reactivex.rxjava3.subjects.e<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<G0> f124191d = new io.reactivex.rxjava3.subjects.e<>();

    @Inject
    public q() {
    }

    public final void a(@Y61.l MotionEvent motionEvent) {
        this.f124190c.onNext(motionEvent);
    }
}

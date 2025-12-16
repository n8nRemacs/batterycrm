package com.avito.android.util;

import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.transition.L;
import kotlin.Metadata;

/* compiled from: Transitions.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/Q5;", "Landroidx/transition/L;", "T", "", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class Q5<T extends androidx.transition.L> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final T f318726a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super androidx.transition.L, kotlin.G0> f318727b = c.f318732l;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public kotlin.jvm.internal.N f318728c = b.f318731l;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public BaseInterpolator f318729d;

    /* compiled from: Transitions.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/util/Q5$a", "Landroidx/transition/P;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends androidx.transition.P {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q5<T> f318730a;

        public a(Q5<T> q52) {
            this.f318730a = q52;
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void d(@Y61.k androidx.transition.L l12) {
            ((c) this.f318730a.f318727b).getClass();
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.transition.P, androidx.transition.L.f
        public final void e(@Y61.k androidx.transition.L l12) {
            this.f318730a.f318728c.invoke(l12);
        }
    }

    /* compiled from: Transitions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/transition/L;", "T", "it", "Lkotlin/G0;", "invoke", "(Landroidx/transition/L;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<androidx.transition.L, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f318731l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(androidx.transition.L l12) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Transitions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/transition/L;", "T", "it", "Lkotlin/G0;", "invoke", "(Landroidx/transition/L;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<androidx.transition.L, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f318732l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(androidx.transition.L l12) {
            return kotlin.G0.f406611a;
        }
    }

    public Q5(@Y61.k T t12) {
        this.f318726a = t12;
    }

    public final void a(@j.D int i12) {
        d().c(i12);
    }

    public final void b(@Y61.k View view) {
        d().b(view);
    }

    @Y61.k
    public final androidx.transition.L c() {
        BaseInterpolator baseInterpolator = this.f318729d;
        if (baseInterpolator != null) {
            d().G(baseInterpolator);
        }
        d().a(new a(this));
        return d();
    }

    @Y61.k
    public T d() {
        return this.f318726a;
    }
}

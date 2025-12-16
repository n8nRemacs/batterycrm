package com.avito.android.util;

import android.view.ViewTreeObserver;
import kotlin.Metadata;

/* compiled from: ViewTreeObservers.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes5.dex */
public final class A6 {

    /* compiled from: ViewTreeObservers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/ViewTreeObserver;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/ViewTreeObserver;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<ViewTreeObserver, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserver f318520l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f318521m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            super(1);
            this.f318520l = viewTreeObserver;
            this.f318521m = onGlobalLayoutListener;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(ViewTreeObserver viewTreeObserver) {
            this.f318520l.removeOnGlobalLayoutListener(this.f318521m);
            return kotlin.G0.f406611a;
        }
    }

    public static final void a(@Y61.k ViewTreeObserver viewTreeObserver, @Y61.k Y41.l<? super ViewTreeObserver, kotlin.G0> lVar) {
        if (viewTreeObserver.isAlive()) {
            lVar.invoke(viewTreeObserver);
        }
    }

    public static final void b(@Y61.k ViewTreeObserver viewTreeObserver, @Y61.k ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        a(viewTreeObserver, new a(viewTreeObserver, onGlobalLayoutListener));
    }
}

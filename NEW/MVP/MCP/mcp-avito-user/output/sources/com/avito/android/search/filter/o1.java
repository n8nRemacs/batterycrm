package com.avito.android.search.filter;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.avito.android.util.A6;
import kotlin.Metadata;

/* compiled from: KeyboardVisibilityDetector.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/o1;", "", "b", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f263739a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f263740b;

    /* compiled from: KeyboardVisibilityDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/ViewTreeObserver;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/ViewTreeObserver;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<ViewTreeObserver, kotlin.G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(ViewTreeObserver viewTreeObserver) {
            viewTreeObserver.addOnGlobalLayoutListener(o1.this.f263740b);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: KeyboardVisibilityDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/o1$b;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final View f263742b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.l<Boolean, kotlin.G0> f263743c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Rect f263744d = new Rect();

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public Integer f263745e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k View view, @Y61.k Y41.l<? super Boolean, kotlin.G0> lVar) {
            this.f263742b = view;
            this.f263743c = lVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            View view = this.f263742b;
            Rect rect = this.f263744d;
            view.getWindowVisibleDisplayFrame(rect);
            int iHeight = rect.height();
            Integer num = this.f263745e;
            if (num == null) {
                this.f263745e = Integer.valueOf(iHeight);
                return;
            }
            int iIntValue = num.intValue();
            Y41.l<Boolean, kotlin.G0> lVar = this.f263743c;
            if (iIntValue > iHeight) {
                lVar.invoke(Boolean.TRUE);
            } else {
                lVar.invoke(Boolean.FALSE);
            }
        }
    }

    public o1(@Y61.k View view, @Y61.k Y41.l<? super Boolean, kotlin.G0> lVar) {
        this.f263739a = view;
        this.f263740b = new b(view, lVar);
        A6.a(view.getViewTreeObserver(), new a());
    }
}

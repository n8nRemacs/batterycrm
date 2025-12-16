package com.yandex.div.core.widget;

import kotlin.Metadata;

/* compiled from: AdaptiveMaxLines.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/widget/a;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.widget.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38045a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.divs.widgets.k f369245a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public ViewOnAttachStateChangeListenerC38046b f369246b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public ViewTreeObserverOnPreDrawListenerC38047c f369247c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public C10888a f369248d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f369249e;

    /* compiled from: AdaptiveMaxLines.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/widget/a$a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.widget.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10888a {

        /* renamed from: a, reason: collision with root package name */
        public final int f369250a;

        /* renamed from: b, reason: collision with root package name */
        public final int f369251b;

        public C10888a(int i12, int i13) {
            this.f369250a = i12;
            this.f369251b = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10888a)) {
                return false;
            }
            C10888a c10888a = (C10888a) obj;
            return this.f369250a == c10888a.f369250a && this.f369251b == c10888a.f369251b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f369251b) + (Integer.hashCode(this.f369250a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Params(maxLines=");
            sb2.append(this.f369250a);
            sb2.append(", minHiddenLines=");
            return androidx.appcompat.app.r.t(sb2, this.f369251b, ')');
        }
    }

    public C38045a(@Y61.k com.yandex.div.core.view2.divs.widgets.k kVar) {
        this.f369245a = kVar;
    }

    public final void a() {
        ViewTreeObserverOnPreDrawListenerC38047c viewTreeObserverOnPreDrawListenerC38047c = this.f369247c;
        if (viewTreeObserverOnPreDrawListenerC38047c != null) {
            this.f369245a.getViewTreeObserver().removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC38047c);
        }
        this.f369247c = null;
    }
}

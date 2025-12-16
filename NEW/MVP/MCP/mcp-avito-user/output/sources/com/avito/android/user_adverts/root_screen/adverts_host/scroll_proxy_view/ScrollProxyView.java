package com.avito.android.user_adverts.root_screen.adverts_host.scroll_proxy_view;

import QI0.a;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScrollProxyView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/scroll_proxy_view/ScrollProxyView;", "Landroid/view/View;", "LQI0/a;", "listener", "Lkotlin/G0;", "setProxyScrollListener", "(LQI0/a;)V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScrollProxyView extends View implements a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public a f313828b;

    @j
    public ScrollProxyView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // QI0.a
    public final void a(int i12) {
        a aVar = this.f313828b;
        if (aVar != null) {
            aVar.a(i12);
        }
    }

    public final void setProxyScrollListener(@l a listener) {
        this.f313828b = listener;
    }

    public ScrollProxyView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }
}

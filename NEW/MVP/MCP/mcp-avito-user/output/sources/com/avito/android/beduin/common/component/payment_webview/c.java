package com.avito.android.beduin.common.component.payment_webview;

import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.Metadata;

/* compiled from: BeduinWebPaymentComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class c<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public static final c<T> f101851b = new c<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        return ((PowerWebViewStateChangeEvent) obj).f392937a == PowerWebViewStateChangeEvent.State.f392943b;
    }
}

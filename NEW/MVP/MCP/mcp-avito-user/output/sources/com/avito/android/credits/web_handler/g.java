package com.avito.android.credits.web_handler;

import android.os.Build;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.Metadata;

/* compiled from: WebAnalyticsHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "it", "Lkotlin/G0;", "accept", "(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f129068b;

    public g(f fVar) {
        this.f129068b = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        PowerWebViewStateChangeEvent powerWebViewStateChangeEvent = (PowerWebViewStateChangeEvent) obj;
        f fVar = this.f129068b;
        fVar.getClass();
        int i12 = Build.VERSION.SDK_INT;
        if (powerWebViewStateChangeEvent.f392937a == (i12 >= 29 ? PowerWebViewStateChangeEvent.State.f392943b : i12 < 29 ? PowerWebViewStateChangeEvent.State.f392944c : PowerWebViewStateChangeEvent.State.f392944c)) {
            com.avito.android.ui.view.d dVar = fVar.f129065c;
            if (dVar != null) {
                dVar.d("javascript: " + fVar.getF129058e());
            }
            com.avito.android.ui.view.d dVar2 = fVar.f129065c;
            if (dVar2 != null) {
                dVar2.f304687a.evaluateJavascript(fVar.getF129058e(), null);
            }
        }
    }
}

package com.avito.android.beduin.common.component.payment_webview;

import com.avito.android.beduin_models.BeduinAction;
import java.util.Iterator;
import java.util.List;
import kd0.C42670a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinWebPaymentComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "it", "Lkotlin/G0;", "accept", "(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f101852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C28793a f101853c;

    public d(C28793a c28793a, m mVar) {
        this.f101852b = mVar;
        this.f101853c = c28793a;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C42670a.d(this.f101852b.f101878d);
        C28793a c28793a = this.f101853c;
        List<BeduinAction> onStartRedirectActions = c28793a.f101838e.getOnStartRedirectActions();
        if (onStartRedirectActions != null) {
            Iterator<T> it = onStartRedirectActions.iterator();
            while (it.hasNext()) {
                c28793a.f101839f.o((BeduinAction) it.next());
            }
        }
    }
}

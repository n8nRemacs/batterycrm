package com.avito.android.beduin.common.component.payment_webview;

import android.net.Uri;
import com.avito.android.beduin.common.component.payment_webview.C28793a;
import kotlin.Metadata;

/* compiled from: BeduinWebPaymentView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_webview/k;", "Lcom/yatatsu/powerwebview/d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements com.yatatsu.powerwebview.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Uri, Boolean> f101873a;

    /* JADX WARN: Multi-variable type inference failed */
    public k(Y41.l<? super Uri, Boolean> lVar) {
        this.f101873a = lVar;
    }

    @Override // com.yatatsu.powerwebview.d
    public final boolean b(boolean z12, @Y61.k Uri uri) {
        return ((Boolean) ((C28793a.d) this.f101873a).invoke(uri)).booleanValue();
    }
}

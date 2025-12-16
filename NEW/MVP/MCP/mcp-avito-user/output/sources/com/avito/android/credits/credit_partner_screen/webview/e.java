package com.avito.android.credits.credit_partner_screen.webview;

import Y41.l;
import Y61.k;
import android.webkit.WebResourceResponse;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: PartnerHttpErrorHandlerDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/webview/e;", "Lcom/yatatsu/powerwebview/b;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.yatatsu.powerwebview.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f128846a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Boolean, G0> f128847b;

    /* compiled from: PartnerHttpErrorHandlerDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f128848l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k String str, @k l<? super Boolean, G0> lVar) {
        this.f128846a = str;
        this.f128847b = lVar;
    }

    @Override // com.yatatsu.powerwebview.b
    public final void a(@k WebResourceResponse webResourceResponse) {
        V2.f318762a.d(this.f128846a, "HTTP error: code:" + webResourceResponse.getStatusCode() + " message:" + webResourceResponse.getReasonPhrase());
    }

    @Override // com.yatatsu.powerwebview.b
    public final void b(@k String str) {
        V2.f318762a.d(this.f128846a, "JS error: ".concat(str));
        this.f128847b.invoke(Boolean.TRUE);
    }

    public /* synthetic */ e(String str, l lVar, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? a.f128848l : lVar);
    }
}

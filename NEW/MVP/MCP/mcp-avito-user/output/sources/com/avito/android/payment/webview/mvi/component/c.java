package com.avito.android.payment.webview.mvi.component;

import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WebPaymentMviActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.payment.webview.mvi.component.WebPaymentMviActor", f = "WebPaymentMviActor.kt", i = {1, 1}, l = {182, 185}, m = "onPostMessageRedirectResult", n = {"this", Constants.DEEPLINK}, s = {"L$0", "L$1"})
/* loaded from: classes15.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f214871q;

    /* renamed from: r, reason: collision with root package name */
    public DeepLink f214872r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f214873s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f214874t;

    /* renamed from: u, reason: collision with root package name */
    public int f214875u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f214874t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f214873s = obj;
        this.f214875u |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.c(this.f214874t, null, null, this);
    }
}

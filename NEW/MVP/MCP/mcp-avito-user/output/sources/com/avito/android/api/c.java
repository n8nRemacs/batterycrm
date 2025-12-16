package com.avito.android.api;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApiErrorsHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f91302l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.m f91303m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, androidx.appcompat.app.m mVar) {
        super(1);
        this.f91302l = kVar;
        this.f91303m = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        this.f91302l.getClass();
        b.a.a(cv.c.a(this.f91303m).u4(), deepLink, null, null, 6);
        return G0.f406611a;
    }
}

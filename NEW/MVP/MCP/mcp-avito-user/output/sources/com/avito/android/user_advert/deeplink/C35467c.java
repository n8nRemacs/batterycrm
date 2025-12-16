package com.avito.android.user_advert.deeplink;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.profile.ItemActivateResponse;
import kotlin.Metadata;

/* compiled from: MyAdvertActivationV2DeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/profile/ItemActivateResponse;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/profile/ItemActivateResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.user_advert.deeplink.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35467c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35469e f310710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MyAdvertLink.ActivateV2 f310711c;

    public C35467c(C35469e c35469e, MyAdvertLink.ActivateV2 activateV2) {
        this.f310710b = c35469e;
        this.f310711c = activateV2;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ItemActivateResponse itemActivateResponse = (ItemActivateResponse) obj;
        DeepLink deepLink = itemActivateResponse.getDeepLink();
        boolean success = itemActivateResponse.getSuccess();
        C35469e c35469e = this.f310710b;
        if (success) {
            c35469e.j(new MyAdvertLink.ActivateV2.b.c(itemActivateResponse.getMessage()));
        } else if (deepLink != null) {
            c35469e.i(MyAdvertLink.ActivateV2.b.C4005b.f133471b, c35469e.f310716h, deepLink);
        } else {
            c35469e.j(new MyAdvertLink.ActivateV2.b.a(new ApiError.InternalError("Активация: Отсутствует параметр deeplink"), this.f310711c.f133466c));
        }
    }
}

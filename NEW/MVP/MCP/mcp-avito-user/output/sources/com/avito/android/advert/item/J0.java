package com.avito.android.advert.item;

import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_voip_call_request.IacVoipCallRequestDeeplink;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class J0<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public static final J0<T> f71761b = new J0<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        C43501a c43501a = (C43501a) obj;
        return (c43501a.f413261b instanceof IacVoipCallRequestDeeplink.b.C4980b) && kotlin.jvm.internal.L.f(c43501a.f413260a.f134521b, "VIDEO_CALL_REQUEST_KEY");
    }
}

package com.avito.android.code_confirmation.phone_management;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.Action;
import kotlin.Metadata;

/* compiled from: PhoneManagementPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Action f119700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f119701c;

    public r(Action action, w wVar) {
        this.f119700b = action;
        this.f119701c = wVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        DeepLink deepLink = this.f119700b.getDeepLink();
        w wVar = this.f119701c;
        E e12 = wVar.f119713h;
        if (e12 != null) {
            e12.b();
        }
        b.a.a(wVar.f119712g, deepLink, null, null, 6);
    }
}

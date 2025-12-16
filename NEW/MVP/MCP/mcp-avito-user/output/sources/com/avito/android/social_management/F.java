package com.avito.android.social_management;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: SocialManagementPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class F<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f284439b;

    public F(t tVar) {
        this.f284439b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        DeepLink deepLink = (DeepLink) obj;
        SocialManagementActivity socialManagementActivity = this.f284439b.f284711o;
        if (socialManagementActivity != null) {
            socialManagementActivity.f(deepLink);
        }
    }
}

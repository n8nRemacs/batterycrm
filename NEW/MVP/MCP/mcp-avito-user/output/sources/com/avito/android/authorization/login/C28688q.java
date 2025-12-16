package com.avito.android.authorization.login;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: LoginPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.authorization.login.q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28688q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f94057b;

    public C28688q(u uVar) {
        this.f94057b = uVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        DeepLink deepLink = (DeepLink) obj;
        LoginActivity loginActivity = this.f94057b.f94061A;
        if (loginActivity != null) {
            loginActivity.f(deepLink);
        }
    }
}

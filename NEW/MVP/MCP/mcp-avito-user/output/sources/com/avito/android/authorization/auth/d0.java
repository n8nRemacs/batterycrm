package com.avito.android.authorization.auth;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: AuthPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthFragment f92930b;

    public d0(AuthFragment authFragment) {
        this.f92930b = authFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f92930b.F5((DeepLink) obj);
    }
}

package com.avito.android.authorization.deep_linking;

import com.avito.android.authorization.AuthSource;
import com.avito.android.authorization.deep_linking.AuthResultLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AuthResultAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.authorization.deep_linking.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28648b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28649c f93748b;

    public C28648b(C28649c c28649c) {
        this.f93748b = c28649c;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        V2.f318762a.a("DEFAULT_TAG", "AuthResulAsyncLinkHandler process login failed", (Throwable) obj);
        C28649c c28649c = this.f93748b;
        c28649c.i(AuthResultLink.b.a.f93663b, c28649c.f93754g, new AuthenticateLink(AuthSource.f92711k0, false, (DeepLink) null, 6, (C42822w) null));
    }
}

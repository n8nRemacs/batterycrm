package com.avito.android.deep_linking.universal_deeplink;

import Mu.C14528a;
import android.net.Uri;
import kotlin.Metadata;

/* compiled from: UniversalDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMu/a;", "it", "Lkotlin/G0;", "accept", "(LMu/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f134040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UniversalDeepLink f134041c;

    public b(e eVar, UniversalDeepLink universalDeepLink) {
        this.f134040b = eVar;
        this.f134041c = universalDeepLink;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Uri uri = this.f134041c.f134035b;
        e eVar = this.f134040b;
        eVar.f134047i.a(((C14528a) obj).getDeepLink(), uri, new d(eVar));
    }
}

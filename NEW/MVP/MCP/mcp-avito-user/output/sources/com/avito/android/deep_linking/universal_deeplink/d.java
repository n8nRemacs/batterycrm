package com.avito.android.deep_linking.universal_deeplink;

import Y41.l;
import Y61.k;
import android.content.Intent;
import android.net.Uri;
import com.avito.android.deep_linking.InterfaceC29693p;
import com.avito.android.deep_linking.V;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.universal_deeplink.UniversalDeepLink;
import com.avito.android.deeplink_handler.view.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42801a;

/* compiled from: UniversalDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/universal_deeplink/d;", "Lcom/avito/android/deep_linking/p;", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements InterfaceC29693p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f134043b;

    /* compiled from: UniversalDeepLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            ((a.i) this.receiver).z1(str);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalDeepLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements l<Intent, G0> {
        @Override // Y41.l
        public final G0 invoke(Intent intent) {
            ((a.InterfaceC4053a) this.receiver).R(intent, com.avito.android.deeplink_handler.view.b.f134588l);
            return G0.f406611a;
        }
    }

    public d(e eVar) {
        this.f134043b = eVar;
    }

    @Override // com.avito.android.deep_linking.InterfaceC29693p
    public final void S0(@k Uri uri) {
        V v12 = V.f132879a;
        e eVar = this.f134043b;
        a aVar = new a(1, eVar.f134050l, a.i.class, "showToast", "showToast(Ljava/lang/String;I)V", 0);
        b bVar = new b(1, eVar.f134048j, a.InterfaceC4053a.class, "start", "start(Landroid/content/Intent;Lkotlin/jvm/functions/Function1;)V", 0);
        v12.getClass();
        V.a(eVar.f134051m, eVar.f134052n, uri, aVar, bVar);
        eVar.j(UniversalDeepLink.b.C4031b.f134037b);
    }

    @Override // com.avito.android.deep_linking.InterfaceC29693p
    public final void a(@k DeepLink deepLink) {
        UniversalDeepLink.b.c cVar = UniversalDeepLink.b.c.f134038b;
        e eVar = this.f134043b;
        eVar.i(cVar, eVar.f134046h, deepLink);
    }

    @Override // com.avito.android.deep_linking.InterfaceC29693p
    public final void close() {
    }
}

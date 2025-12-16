package com.avito.android.favorites.link;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.favorites.link.GetSimilarPushLink;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: GetSimilarPushLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/link/b;", "Lev/a;", "Lcom/avito/android/favorites/link/GetSimilarPushLink;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends AbstractC40161a<GetSimilarPushLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final f f157396f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f157397g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.i f157398h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC35741a1 f157399i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C43238h f157400j;

    /* compiled from: CoroutineExceptionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractCoroutineContextElement implements N {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f157401b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N.b bVar, b bVar2) {
            super(bVar);
            this.f157401b = bVar2;
        }

        @Override // kotlinx.coroutines.N
        public final void handleException(@k CoroutineContext coroutineContext, @k Throwable th2) {
            com.avito.android.bxcontent.mvi.entity.f.t("GetSimilarPushLinkHandler got error: ", th2, V2.f318762a, null);
            b bVar = this.f157401b;
            a.i.C4057a.d(bVar.f157398h, InterfaceC35741a1.a.a(bVar.f157399i, th2, null, null, 6), null, null, null, 0, null, null, null, 2046);
            bVar.j(GetSimilarPushLink.b.a.f157388b);
        }
    }

    @Inject
    public b(@k f fVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.i iVar, @k InterfaceC35741a1 interfaceC35741a1, @k R0 r02) {
        this.f157396f = fVar;
        this.f157397g = aVar;
        this.f157398h = iVar;
        this.f157399i = interfaceC35741a1;
        this.f157400j = U.a(r02.a().plus(new a(N.f410714t2, this)));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        GetSimilarPushLink getSimilarPushLink = (GetSimilarPushLink) deepLink;
        String str2 = getSimilarPushLink.f157384b;
        Long lZ02 = C43066x.z0(str2);
        if (lZ02 != null) {
            C43259k.d(this.f157400j, null, null, new com.avito.android.favorites.link.a(this, lZ02, getSimilarPushLink, null), 3);
        } else {
            V2.f318762a.e("GetSimilarPushLinkHandler got invalid itemId: ".concat(str2), null);
            a.i.C4057a.d(this.f157398h, com.avito.android.printable_text.b.c(R.string.unknown_server_error, new Serializable[0]), null, null, null, 0, null, null, null, 2046);
            j(GetSimilarPushLink.b.a.f157388b);
        }
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f157400j, null);
    }
}

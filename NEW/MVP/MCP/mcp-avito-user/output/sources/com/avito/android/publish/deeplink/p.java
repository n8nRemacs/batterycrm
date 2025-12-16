package com.avito.android.publish.deeplink;

import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DraftPublicationLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.PublishIntentFactory;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47918a;
import sv.C48421d;

/* compiled from: DraftPublicationDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/deeplink/p;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DraftPublicationLink;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p extends AbstractC40161a<DraftPublicationLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.b f232594f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final PublishIntentFactory f232595g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f232596h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f232597i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DraftPublicationDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(p.this);
        }
    }

    /* compiled from: DraftPublicationDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c.b c3997b;
            C47918a c47918a = (C47918a) obj;
            if (c47918a.f437156b == 0) {
                c3997b = DraftPublicationLink.b.a.f133291b;
            } else {
                Intent intent = c47918a.f437157c;
                c3997b = new DraftPublicationLink.b.C3997b(intent != null ? intent.getStringExtra("edited_advert_id") : null, intent != null ? (DeepLink) intent.getParcelableExtra("edited_advert_post_action") : null, intent != null ? intent.getStringExtra("status_message") : null);
            }
            p.this.j(c3997b);
        }
    }

    @Inject
    public p(@Y61.k a.b bVar, @Y61.k PublishIntentFactory publishIntentFactory, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f232594f = bVar;
        this.f232595g = publishIntentFactory;
        this.f232596h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DraftPublicationLink draftPublicationLink = (DraftPublicationLink) deepLink;
        this.f232596h.J(PublishIntentFactory.a.b(this.f232595g, draftPublicationLink.f133289b, draftPublicationLink.f133290c, 2), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f232597i.b(this.f232594f.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f232597i.e();
    }
}

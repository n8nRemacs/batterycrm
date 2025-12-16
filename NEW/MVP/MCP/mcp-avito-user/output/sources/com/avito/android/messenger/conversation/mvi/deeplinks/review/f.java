package com.avito.android.messenger.conversation.mvi.deeplinks.review;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.RequestReviewLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.analytics.a0;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RequestReviewLinkDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/review/f;", "Lev/a;", "Lcom/avito/android/deep_linking/links/RequestReviewLink;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f extends AbstractC40161a<RequestReviewLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final b f190656f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC28373a f190657g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.i f190658h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f190659i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final hu.akarnokd.rxjava3.schedulers.c f190660j;

    /* compiled from: RequestReviewLinkDeeplinkHandler.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/review/f$a;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/deeplinks/review/f$a$a;", "Lcom/avito/android/messenger/conversation/mvi/deeplinks/review/f$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a implements InterfaceC14249c.b {

        /* compiled from: RequestReviewLinkDeeplinkHandler.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/review/f$a$a;", "Lcom/avito/android/messenger/conversation/mvi/deeplinks/review/f$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.deeplinks.review.f$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5640a extends a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final com.avito.android.messenger.conversation.mvi.deeplinks.review.a f190661b;

            public C5640a(@k com.avito.android.messenger.conversation.mvi.deeplinks.review.a aVar) {
                super(null);
                this.f190661b = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5640a) && L.f(this.f190661b, ((C5640a) obj).f190661b);
            }

            public final int hashCode() {
                return this.f190661b.hashCode();
            }

            @k
            public final String toString() {
                return "Failure(error=" + this.f190661b + ')';
            }
        }

        /* compiled from: RequestReviewLinkDeeplinkHandler.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/review/f$a$b;", "Lcom/avito/android/messenger/conversation/mvi/deeplinks/review/f$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f190662b;

            public b(@l String str) {
                super(null);
                this.f190662b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f190662b, ((b) obj).f190662b);
            }

            public final int hashCode() {
                String str = this.f190662b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Success(message="), this.f190662b, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public f(@k b bVar, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC28373a interfaceC28373a, @k a.i iVar) {
        this.f190656f = bVar;
        this.f190657g = interfaceC28373a;
        this.f190658h = iVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f190659i = cVar;
        hu.akarnokd.rxjava3.schedulers.c cVar2 = new hu.akarnokd.rxjava3.schedulers.c(interfaceC35745a5.a());
        cVar.b(io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar2, 0)));
        this.f190660j = cVar2;
    }

    public static final void k(f fVar, a.C5640a c5640a) {
        com.avito.android.messenger.conversation.mvi.deeplinks.review.a aVar = c5640a.f190661b;
        String str = aVar.f190646a;
        f.c.f125255c.getClass();
        a.i.C4057a.e(fVar.f190658h, str, f.c.a.a(aVar.f190647b, aVar.f190648c), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
        fVar.j(c5640a);
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        RequestReviewLink requestReviewLink = (RequestReviewLink) deepLink;
        this.f190657g.c(new a0(requestReviewLink.f133640c));
        this.f190659i.b(this.f190656f.d(requestReviewLink.f133639b).x0(this.f190660j).v0(new g(this), new h(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f190659i.e();
    }
}

package com.avito.android.saved_searches.deeplinks;

import Go0.InterfaceC13902a;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.libs.saved_searches.deeplinks.SearchSubscriptionOpenDeeplink;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchSubscriptionOpenDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/deeplinks/j;", "Lev/a;", "Lcom/avito/android/libs/saved_searches/deeplinks/SearchSubscriptionOpenDeeplink;", "a", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends AbstractC40161a<SearchSubscriptionOpenDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f258272f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f258273g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13902a f258274h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f258275i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: SearchSubscriptionOpenDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/saved_searches/deeplinks/j$a;", "", "<init>", "()V", "a", "Lcom/avito/android/saved_searches/deeplinks/j$a$a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: SearchSubscriptionOpenDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/deeplinks/j$a$a;", "Lcom/avito/android/saved_searches/deeplinks/j$a;", "LJu/c$a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.saved_searches.deeplinks.j$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7753a extends a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DeepLink f258276b;

            public C7753a(@Y61.k DeepLink deepLink) {
                super(null);
                this.f258276b = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7753a) && L.f(this.f258276b, ((C7753a) obj).f258276b);
            }

            public final int hashCode() {
                return this.f258276b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("SavedSearchLoaded(deeplink="), this.f258276b, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public j(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC13902a interfaceC13902a) {
        this.f258272f = aVar;
        this.f258273g = interfaceC35745a5;
        this.f258274h = interfaceC13902a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        SearchSubscriptionOpenDeeplink searchSubscriptionOpenDeeplink = (SearchSubscriptionOpenDeeplink) deepLink;
        String str2 = searchSubscriptionOpenDeeplink.f181441b;
        if (str2 != null) {
            B0 b0D0 = this.f258274h.a(str2, searchSubscriptionOpenDeeplink.f181442c).d0(k.f258277b);
            InterfaceC35745a5 interfaceC35745a5 = this.f258273g;
            this.f258275i.b(A1.h(b0D0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()), l.f258278l, new m(this), 2));
        }
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f258275i.e();
    }
}

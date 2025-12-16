package com.avito.android.user_advert.deeplink;

import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertDetailsResult;
import com.avito.android.deep_linking.links.MyDraftAdvertDetailsLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.user_advert.AdvertActionTransferData;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import nI0.InterfaceC44261b;
import rv.C47918a;
import sv.C48421d;

/* compiled from: MyDraftDetailsDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/deeplink/H;", "Lev/a;", "Lcom/avito/android/deep_linking/links/MyDraftAdvertDetailsLink;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class H extends AbstractC40161a<MyDraftAdvertDetailsLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.b f310693f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44261b f310694g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final eH0.c f310695h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f310696i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f310697j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: MyDraftDetailsDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(H.this);
        }
    }

    /* compiled from: MyDraftDetailsDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            AdvertActionTransferData advertActionTransferData;
            DeepLink deepLink;
            InterfaceC14249c.b stopped;
            C47918a c47918a = (C47918a) obj;
            Intent intent = c47918a.f437157c;
            if (intent != null) {
                advertActionTransferData = (AdvertActionTransferData) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("advert_action", AdvertActionTransferData.class) : intent.getParcelableExtra("advert_action"));
            } else {
                advertActionTransferData = null;
            }
            switch (c47918a.f437156b) {
                case 6:
                    String stringExtra = intent != null ? intent.getStringExtra("soa_update_message") : null;
                    boolean booleanExtra = intent != null ? intent.getBooleanExtra("should_show_app_rater", false) : false;
                    if (intent != null) {
                        deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("delivery_restriction", DeepLink.class) : intent.getParcelableExtra("delivery_restriction"));
                    } else {
                        deepLink = null;
                    }
                    stopped = new MyAdvertDetailsResult.Stopped(deepLink, advertActionTransferData != null ? advertActionTransferData.f308187c : null, advertActionTransferData != null ? advertActionTransferData.f308186b : null, stringExtra, booleanExtra);
                    break;
                case 7:
                    stopped = new MyAdvertDetailsResult.Activated(advertActionTransferData != null ? advertActionTransferData.f308187c : null, advertActionTransferData != null ? advertActionTransferData.f308188d : null);
                    break;
                case 8:
                case 9:
                case 10:
                    stopped = new MyAdvertDetailsResult.StatusChanged(advertActionTransferData != null ? advertActionTransferData.f308187c : null);
                    break;
                default:
                    stopped = MyAdvertDetailsResult.Default.f133455b;
                    break;
            }
            H.this.j(stopped);
        }
    }

    @Inject
    public H(@Y61.k a.b bVar, @Y61.k InterfaceC44261b interfaceC44261b, @Y61.k eH0.c cVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f310693f = bVar;
        this.f310694g = interfaceC44261b;
        this.f310695h = cVar;
        this.f310696i = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        Intent intentAddFlags;
        MyDraftAdvertDetailsLink myDraftAdvertDetailsLink = (MyDraftAdvertDetailsLink) deepLink;
        if (bundle == null || !bundle.containsKey("up_intent")) {
            intentAddFlags = InterfaceC44261b.a.a(this.f310694g, null, null, null, null, 31).addFlags(603979776);
        } else {
            intentAddFlags = (Intent) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("up_intent", Intent.class) : bundle.getParcelable("up_intent"));
        }
        this.f310696i.J(this.f310695h.g(myDraftAdvertDetailsLink.f133513b).putExtra("up_intent", intentAddFlags), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f310697j.b(this.f310693f.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f310697j.e();
    }
}

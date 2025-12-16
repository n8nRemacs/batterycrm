package com.avito.android.rating_form.deep_link.rating_form;

import Y61.k;
import Yg0.C18264a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import bv.C25719a;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.ToastInfo;
import com.avito.android.rating_form.deep_link.RatingFormLink;
import com.avito.android.rating_form.o;
import ev.AbstractC40161a;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: RatingFormDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/deep_link/rating_form/a;", "Lev/a;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends AbstractC40161a<RatingFormLink> {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f248049m = 0;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f248050f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.b f248051g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f248052h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.i f248053i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final o f248054j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f248055k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f248056l = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: RatingFormDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/deep_link/rating_form/a$a;", "", "<init>", "()V", "", "QUERY_MAP_SCORE_KEY", "Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating_form.deep_link.rating_form.a$a, reason: collision with other inner class name */
    public static final class C7460a {
        public /* synthetic */ C7460a(C42822w c42822w) {
            this();
        }

        public C7460a() {
        }
    }

    /* compiled from: RatingFormDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: RatingFormDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink;
            C47918a c47918a = (C47918a) obj;
            Intent intent = c47918a.f437157c;
            a aVar = a.this;
            DeepLink deepLink2 = null;
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = aVar.f248055k;
            int i12 = c47918a.f437156b;
            if (i12 == -1) {
                a.k(aVar, intent);
                String stringExtra = intent != null ? intent.getStringExtra("key_published_rating_user_key") : null;
                if (intent != null) {
                    deepLink2 = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_redirect_deeplink", DeepLink.class) : intent.getParcelableExtra("key_redirect_deeplink"));
                }
                if (deepLink2 != null) {
                    aVar.i(new RatingFormLink.b.c.a(stringExtra), aVar2, deepLink2);
                    return;
                } else {
                    aVar.j(new RatingFormLink.b.c.C7458b(stringExtra));
                    return;
                }
            }
            if (i12 != 2) {
                if (i12 != 3) {
                    aVar.j(RatingFormLink.b.C7457b.f248037b);
                    return;
                } else {
                    a.k(aVar, intent);
                    aVar.j(RatingFormLink.b.a.f248036b);
                    return;
                }
            }
            a.k(aVar, intent);
            if (intent != null) {
                deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_redirect_deeplink", DeepLink.class) : intent.getParcelableExtra("key_redirect_deeplink"));
            } else {
                deepLink = null;
            }
            if (intent != null ? intent.getBooleanExtra("key_need_to_reload", false) : false) {
                aVar.j(RatingFormLink.b.d.c.f248043b);
            } else if (deepLink != null) {
                com.avito.android.deeplink_handler.handler.bundle.a aVarD = aVar.d();
                aVar.i(new RatingFormLink.b.d.C7459b(aVarD != null ? aVarD.f134522c : null), aVar2, deepLink);
            } else {
                com.avito.android.deeplink_handler.handler.bundle.a aVarD2 = aVar.d();
                aVar.j(new RatingFormLink.b.d.a(aVarD2 != null ? aVarD2.f134522c : null));
            }
        }
    }

    static {
        new C7460a(null);
    }

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k C25719a c25719a, @k a.i iVar, @k o oVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f248050f = interfaceC4053a;
        this.f248051g = bVar;
        this.f248052h = c25719a;
        this.f248053i = iVar;
        this.f248054j = oVar;
        this.f248055k = aVar;
    }

    public static final void k(a aVar, Intent intent) {
        if (intent == null) {
            return;
        }
        ToastInfo toastInfo = (ToastInfo) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_toast_info", ToastInfo.class) : intent.getParcelableExtra("key_toast_info"));
        if (toastInfo == null) {
            return;
        }
        String strO = C42745f0.O(C42756l.B(new String[]{toastInfo.f247926b, toastInfo.f247927c}), "\n", null, null, null, 62);
        if (C43066x.K(strO)) {
            return;
        }
        ToastBarPosition toastBarPosition = toastInfo.f247930f == ToastInfo.Position.f247934b ? ToastBarPosition.f181046d : ToastBarPosition.f181047e;
        if (toastInfo.f247931g == null || toastInfo.f247932h == null) {
            PrintableText printableTextF = com.avito.android.printable_text.b.f(strO);
            ToastInfo.f247925j.getClass();
            a.i.C4057a.d(aVar.f248053i, printableTextF, null, null, ToastInfo.a.a(toastInfo), 0, toastBarPosition, null, null, 1966);
        } else {
            PrintableText printableTextF2 = com.avito.android.printable_text.b.f(strO);
            List listSingletonList = Collections.singletonList(new c.a.C3719a(toastInfo.f247931g, toastInfo.f247933i, null, new com.avito.android.rating_form.deep_link.rating_form.c(aVar, toastInfo), 4, null));
            ToastInfo.f247925j.getClass();
            f fVarA = ToastInfo.a.a(toastInfo);
            Integer num = toastInfo.f247928d;
            a.i.C4057a.d(aVar.f248053i, printableTextF2, null, listSingletonList, fVarA, num != null ? num.intValue() : 2750, toastBarPosition, null, null, 1930);
        }
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        RatingFormLink ratingFormLink = (RatingFormLink) deepLink;
        if (ratingFormLink.f248035d) {
            l(ratingFormLink, bundle);
        } else {
            this.f248052h.b(ratingFormLink, this, null, new com.avito.android.rating_form.deep_link.rating_form.b(this, ratingFormLink, bundle));
        }
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f248056l.b(this.f248051g.Q().N(new b()).t0(new c()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f248056l.e();
    }

    public final void l(RatingFormLink ratingFormLink, Bundle bundle) {
        C18264a.f19609a.getClass();
        Integer numValueOf = (bundle == null || !bundle.containsKey("key_score")) ? null : Integer.valueOf(bundle.getInt("key_score"));
        if (bundle != null) {
            bundle.getString("key_item_id");
        }
        if (bundle != null && bundle.containsKey("key_is_auto")) {
            bundle.getBoolean("key_is_auto");
        }
        String string = bundle != null ? bundle.getString("key_published_rating_user_key") : null;
        String str = ratingFormLink.f248033b;
        Map<String, Serializable> map = ratingFormLink.f248034c;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("score", String.valueOf(iIntValue));
            map = linkedHashMap;
        }
        this.f248050f.J(this.f248054j.b(str, string, map), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }
}

package com.avito.android.user_advert.advert.delegate.realty_verification;

import AK0.l;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.BannerEvent;
import com.avito.android.error.z;
import com.avito.android.user_advert.advert.delegate.realty_verification.b;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import fH0.AbstractC40291a;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.b1;
import l41.g;

/* compiled from: RealtyVerificationDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/realty_verification/c;", "LfH0/a;", "Lcom/avito/android/user_advert/advert/delegate/realty_verification/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40291a implements com.avito.android.user_advert.advert.delegate.realty_verification.a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.user_advert.advert.realty_verification.a f308784d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f308785e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final l f308786f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC28373a f308787g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.provider.a f308788h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public Object f308789i = EmptyDisposable.f401988b;

    /* compiled from: RealtyVerificationDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", "it", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_advert.advert.items.realty.verification.a f308791c;

        public a(com.avito.android.user_advert.advert.items.realty.verification.a aVar) {
            this.f308791c = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.c;
            com.avito.android.user_advert.advert.items.realty.verification.a aVar = this.f308791c;
            c cVar = c.this;
            if (z12) {
                cVar.f395801b.accept(new b.a(com.avito.android.user_advert.advert.items.realty.verification.a.a(aVar)));
            } else if (p22 instanceof P2.a) {
                cVar.f395801b.accept(new b.c(com.avito.android.user_advert.advert.items.realty.verification.a.a(aVar), z.k(((P2.a) p22).f318719a)));
            } else if (p22 instanceof P2.b) {
                cVar.f395801b.accept(b.d.f308783a);
            }
        }
    }

    /* compiled from: RealtyVerificationDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f308792b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    @Inject
    public c(@k com.avito.android.user_advert.advert.realty_verification.a aVar, @k InterfaceC35745a5 interfaceC35745a5, @k l lVar, @k InterfaceC28373a interfaceC28373a, @k com.avito.android.analytics.provider.a aVar2) {
        this.f308784d = aVar;
        this.f308785e = interfaceC35745a5;
        this.f308786f = lVar;
        this.f308787g = interfaceC28373a;
        this.f308788h = aVar2;
    }

    @Override // com.avito.android.user_advert.advert.delegate.realty_verification.a
    public final void L(@k String str) {
        String strA = this.f308788h.a();
        if (strA != null) {
            this.f308787g.c(new iI0.z(str, strA));
        }
    }

    @Override // com.avito.android.user_advert.advert.delegate.realty_verification.a
    public final void e(@k com.avito.android.user_advert.advert.items.realty.verification.a aVar) {
        l lVar = this.f308786f;
        Set<String> setF = lVar.f("pref_key_adverts_with_closed_realty_verification_block");
        if (setF == null) {
            setF = B0.f406639b;
        }
        lVar.putStringSet("pref_key_adverts_with_closed_realty_verification_block", b1.i(setF, aVar.f309950c));
        this.f395801b.accept(new b.C9476b(aVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // com.avito.android.user_advert.advert.delegate.realty_verification.a
    public final void g(@k com.avito.android.user_advert.advert.items.realty.verification.a aVar, @k String str) {
        String strA = this.f308788h.a();
        if (strA != null) {
            this.f308787g.c(new BannerEvent.b("re_owner_verification", "item_view", "button_click", aVar.f309950c, strA));
        }
        this.f308789i.dispose();
        this.f308789i = this.f308784d.a(aVar.f309950c, str).j0(this.f308785e.e()).v0(new a(aVar), b.f308792b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.user_advert.advert.delegate.realty_verification.a
    public final void y(@k String str) {
        String strA = this.f308788h.a();
        if (strA != null) {
            this.f308787g.c(new BannerEvent.i("re_owner_verification", "item_view", str, strA));
        }
    }
}

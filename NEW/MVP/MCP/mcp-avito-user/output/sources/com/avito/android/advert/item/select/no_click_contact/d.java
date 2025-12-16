package com.avito.android.advert.item.select.no_click_contact;

import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: AutoSelectNoClickContactPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/select/no_click_contact/d;", "Lcom/avito/android/advert/item/select/no_click_contact/c;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f79443j = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f79444b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f79445c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.select.number_input.g f79446d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final E f79447e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.deep_linking.x> f79448f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C43238h f79449g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public N0 f79450h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public String f79451i;

    /* compiled from: AutoSelectNoClickContactPresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/advert/item/select/no_click_contact/d$a;", "", "<init>", "()V", "", "COUNTRY_CODE_END_INDEX", "I", "", "NO_CLICK_CONTACT_PHONE_KEY", "Ljava/lang/String;", "PHONE_NUMBER_LENGTH", "REPLACE_PHONE_KEY", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@Y61.k @InterfaceC30174s String str, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.advert.item.select.number_input.g gVar, @Y61.k E e12, @Y61.k h31.e<com.avito.android.deep_linking.x> eVar, @Y61.k R0 r02, @P6.b @Y61.l Kundle kundle) {
        this.f79444b = str;
        this.f79445c = aVar;
        this.f79446d = gVar;
        this.f79447e = e12;
        this.f79448f = eVar;
        this.f79449g = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
        this.f79451i = kundle != null ? kundle.g("no_click_contact_phone_key") : null;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        t tVar = (t) eVar;
        AutoSelectNoClickContactItem autoSelectNoClickContactItem = (AutoSelectNoClickContactItem) aVar;
        b.a.a(this.f79445c, autoSelectNoClickContactItem.f79430h.f79436b, null, null, 6);
        tVar.s30(autoSelectNoClickContactItem, new e(1, this, d.class, "handleDeeplink", "handleDeeplink(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0), new f(this), new g(this, tVar));
        String str = this.f79451i;
        if (str != null && str.length() != 0) {
            String str2 = this.f79451i;
            this.f79451i = str2;
            tVar.Mb(str2);
        } else if (this.f79447e.b()) {
            N0 n02 = this.f79450h;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            this.f79450h = C43259k.d(this.f79449g, null, null, new h(this, tVar, null), 3);
        }
    }

    @Override // com.avito.android.advert.item.select.no_click_contact.c
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.m("no_click_contact_phone_key", this.f79451i);
        return kundle;
    }
}

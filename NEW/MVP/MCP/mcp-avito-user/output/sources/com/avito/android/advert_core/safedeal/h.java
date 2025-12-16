package com.avito.android.advert_core.safedeal;

import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.x;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import com.avito.android.remote.model.PromoBlockIconType;
import com.avito.android.util.C35809h6;
import com.avito.android.util.D6;
import j.InterfaceC42165v;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertSafeDealServicesView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/safedeal/h;", "", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f84206a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q f84207b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f84208c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f84209d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f84210e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f84211f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f84212g;

    /* compiled from: MyAdvertSafeDealServicesView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safedeal/h$a;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void g(@Y61.k DeepLink deepLink);
    }

    /* compiled from: MyAdvertSafeDealServicesView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84213a;

        static {
            int[] iArr = new int[PromoBlockIconType.values().length];
            try {
                iArr[PromoBlockIconType.DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PromoBlockIconType.DELIVERY_COURIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PromoBlockIconType.SAFE_PAYMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PromoBlockIconType.DELIVERY_UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PromoBlockIconType.ARROW_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f84213a = iArr;
        }
    }

    /* compiled from: MyAdvertSafeDealServicesView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f84214b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l lVar) {
            this.f84214b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f84214b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f84214b;
        }

        public final int hashCode() {
            return this.f84214b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f84214b.invoke(obj);
        }
    }

    public h(@Y61.k ViewGroup viewGroup, @Y61.k q qVar, @Y61.k x xVar, @Y61.k a aVar, @Y61.k AdvertDetailsFragment advertDetailsFragment) {
        this.f84206a = viewGroup;
        this.f84207b = qVar;
        this.f84208c = xVar;
        this.f84209d = aVar;
        D6.H(viewGroup);
        qVar.K().observe(advertDetailsFragment, new c(new m(this)));
        qVar.dd().observe(advertDetailsFragment, new c(new n(this)));
        qVar.v4().observe(advertDetailsFragment, new c(new o(this)));
        qVar.x5().observe(advertDetailsFragment, new c(new p(this)));
        this.f84210e = LayoutInflater.from(viewGroup.getContext());
        this.f84211f = new LinkedHashMap();
        this.f84212g = new LinkedHashSet();
    }

    public static final void a(h hVar, ListItemSwitcher listItemSwitcher, MyAdvertSafeDeal.Service.TextWithLinkContent textWithLinkContent) {
        DeepLink deepLinkE;
        hVar.getClass();
        listItemSwitcher.setTitle(textWithLinkContent.getTitle());
        SpannableString spannableString = new SpannableString(textWithLinkContent.getLink().getText());
        Uri uri = textWithLinkContent.getLink().getUri();
        if (C42756l.H(uri.getScheme(), C35809h6.f318899b) >= 0) {
            deepLinkE = new WebViewLink.AnyDomain(uri, null, null, 6, null);
        } else {
            deepLinkE = hVar.f84208c.e(uri);
        }
        spannableString.setSpan(new OK0.b(deepLinkE, new j(hVar.f84209d), false, 4, null), 0, textWithLinkContent.getLink().getText().length(), 33);
        listItemSwitcher.setLink(spannableString);
        listItemSwitcher.setLinkMovementMethod(LinkMovementMethod.getInstance());
    }

    @InterfaceC42165v
    public static Integer b(PromoBlockIconType promoBlockIconType) {
        int i12 = promoBlockIconType == null ? -1 : b.f84213a[promoBlockIconType.ordinal()];
        if (i12 == 1) {
            return Integer.valueOf(R.drawable.ic_delivery_24_gray);
        }
        if (i12 == 2) {
            return Integer.valueOf(R.drawable.ic_courier_24_gray);
        }
        if (i12 == 3) {
            return Integer.valueOf(R.drawable.ic_card_24_gray);
        }
        if (i12 == 4) {
            return Integer.valueOf(R.drawable.ic_delivery_unavailable_24_gray);
        }
        if (i12 != 5) {
            return null;
        }
        return Integer.valueOf(R.drawable.ic_arrow_right_24_gray);
    }
}

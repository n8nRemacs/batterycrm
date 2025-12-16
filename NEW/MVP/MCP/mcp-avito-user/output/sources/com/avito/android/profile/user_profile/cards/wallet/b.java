package com.avito.android.profile.user_profile.cards.wallet;

import Wa0.d;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AvitoFinanceBackground;
import com.avito.android.remote.model.AvitoFinanceBaseCard;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.user_profile.items.Account;
import com.avito.android.remote.model.user_profile.items.AccountType;
import com.avito.android.remote.model.user_profile.items.Background;
import com.avito.android.remote.model.user_profile.items.Feature;
import com.avito.android.remote.model.user_profile.items.FeatureType;
import com.avito.android.remote.model.user_profile.items.State;
import com.avito.android.util.InterfaceC35945t1;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoFinanceItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/b;", "Lcom/avito/android/profile/user_profile/cards/wallet/a;", "a", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.profile.user_profile.cards.wallet.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<d.b> f225636a;

    /* compiled from: AvitoFinanceItemConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/b$a;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BigInteger f225637a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BigInteger f225638b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f225639c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final AvitoFinanceBaseCard f225640d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final AvitoFinanceBaseCard f225641e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final AvitoFinanceBaseCard f225642f;

        public a(@Y61.k BigInteger bigInteger, @Y61.k BigInteger bigInteger2, @Y61.k DeepLink deepLink, @Y61.l AvitoFinanceBaseCard avitoFinanceBaseCard, @Y61.l AvitoFinanceBaseCard avitoFinanceBaseCard2, @Y61.l AvitoFinanceBaseCard avitoFinanceBaseCard3) {
            this.f225637a = bigInteger;
            this.f225638b = bigInteger2;
            this.f225639c = deepLink;
            this.f225640d = avitoFinanceBaseCard;
            this.f225641e = avitoFinanceBaseCard2;
            this.f225642f = avitoFinanceBaseCard3;
        }
    }

    /* compiled from: AvitoFinanceItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile.user_profile.cards.wallet.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C6854b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f225643a;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.PURCHASE_WALLET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f225643a = iArr;
        }
    }

    @Inject
    public b(@Y61.k InterfaceC35945t1<d.b> interfaceC35945t1) {
        this.f225636a = interfaceC35945t1;
    }

    public static Account b(List list, AccountType accountType) {
        Object next;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Account) next).getType() == accountType) {
                break;
            }
        }
        Account account = (Account) next;
        if (account == null || account.getState() != State.EXISTS) {
            return null;
        }
        return account;
    }

    public static AvitoFinanceBaseCard c(Feature feature) {
        UniversalImage icon = feature.getIcon();
        String title = feature.getTitle();
        String subtitle = feature.getSubtitle();
        Background background = feature.getBackground();
        String gradient = background != null ? background.getGradient() : null;
        Background background2 = feature.getBackground();
        return new AvitoFinanceBaseCard(icon, title, subtitle, new AvitoFinanceBackground(gradient, background2 != null ? background2.getColor() : null));
    }

    public static Feature d(List list, FeatureType featureType) {
        Object next;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Feature) next).getFeatureType() == featureType) {
                break;
            }
        }
        Feature feature = (Feature) next;
        if (feature == null || feature.getState() != State.EXISTS) {
            return null;
        }
        return feature;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    @Override // com.avito.android.profile.user_profile.cards.wallet.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.profile.user_profile.cards.CardItem a(@Y61.k java.lang.String r30, @Y61.k com.avito.android.remote.model.user_profile.items.AvitoFinanceResponse r31) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.cards.wallet.b.a(java.lang.String, com.avito.android.remote.model.user_profile.items.AvitoFinanceResponse):com.avito.android.profile.user_profile.cards.CardItem");
    }
}

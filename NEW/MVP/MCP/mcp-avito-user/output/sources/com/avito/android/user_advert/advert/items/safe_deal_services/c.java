package com.avito.android.user_advert.advert.items.safe_deal_services;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SafeDealServiceItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_deal_services/c;", "Lcom/avito/conveyor_item/a;", "<init>", "()V", "a", "b", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/c$a;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/c$b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class c implements com.avito.conveyor_item.a {

    /* compiled from: SafeDealServiceItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_deal_services/c$a;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f310028b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f310029c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f310030d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final DeepLink f310031e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final com.avito.android.user_advert.advert.items.safe_deal_services.a f310032f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final com.avito.android.user_advert.advert.items.safe_deal_services.a f310033g;

        public a(@k String str, @k String str2, @k String str3, @k DeepLink deepLink, @l com.avito.android.user_advert.advert.items.safe_deal_services.a aVar, @l com.avito.android.user_advert.advert.items.safe_deal_services.a aVar2) {
            super(null);
            this.f310028b = str;
            this.f310029c = str2;
            this.f310030d = str3;
            this.f310031e = deepLink;
            this.f310032f = aVar;
            this.f310033g = aVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f310028b, aVar.f310028b) && L.f(this.f310029c, aVar.f310029c) && L.f(this.f310030d, aVar.f310030d) && L.f(this.f310031e, aVar.f310031e) && L.f(null, null) && L.f(null, null) && L.f(this.f310032f, aVar.f310032f) && L.f(this.f310033g, aVar.f310033g);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF309261b() {
            return this.f310028b;
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f310031e, H.d(H.d(this.f310028b.hashCode() * 31, 31, this.f310029c), 31, this.f310030d), 29791);
            com.avito.android.user_advert.advert.items.safe_deal_services.a aVar = this.f310032f;
            int iHashCode = (iE2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            com.avito.android.user_advert.advert.items.safe_deal_services.a aVar2 = this.f310033g;
            return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "List(stringId=" + this.f310028b + ", title=" + this.f310029c + ", subtitle=" + this.f310030d + ", onClickDeepLink=" + this.f310031e + ", linkText=null, linkUri=null, leftIconRes=" + this.f310032f + ", rightIconRes=" + this.f310033g + ')';
        }
    }

    /* compiled from: SafeDealServiceItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_deal_services/c$b;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/c;", "<init>", "()V", "a", "b", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/c$b$a;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/c$b$b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b extends c {

        /* compiled from: SafeDealServiceItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_deal_services/c$b$a;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/c$b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f310034b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f310035c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f310036d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f310037e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final DeepLink f310038f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final com.avito.android.user_advert.advert.items.safe_deal_services.a f310039g;

            /* renamed from: h, reason: collision with root package name */
            @k
            public final String f310040h;

            /* renamed from: i, reason: collision with root package name */
            public final boolean f310041i;

            /* renamed from: j, reason: collision with root package name */
            public final boolean f310042j;

            /* renamed from: k, reason: collision with root package name */
            public final boolean f310043k;

            public a(@k String str, @k String str2, @k String str3, @k String str4, @k DeepLink deepLink, @l com.avito.android.user_advert.advert.items.safe_deal_services.a aVar, @k String str5, boolean z12, boolean z13, boolean z14) {
                super(null);
                this.f310034b = str;
                this.f310035c = str2;
                this.f310036d = str3;
                this.f310037e = str4;
                this.f310038f = deepLink;
                this.f310039g = aVar;
                this.f310040h = str5;
                this.f310041i = z12;
                this.f310042j = z13;
                this.f310043k = z14;
            }

            public static a P(a aVar, boolean z12, boolean z13) {
                String str = aVar.f310034b;
                String str2 = aVar.f310035c;
                String str3 = aVar.f310036d;
                String str4 = aVar.f310037e;
                DeepLink deepLink = aVar.f310038f;
                com.avito.android.user_advert.advert.items.safe_deal_services.a aVar2 = aVar.f310039g;
                String str5 = aVar.f310040h;
                boolean z14 = aVar.f310043k;
                aVar.getClass();
                return new a(str, str2, str3, str4, deepLink, aVar2, str5, z12, z13, z14);
            }

            @Override // com.avito.android.user_advert.advert.items.safe_deal_services.c.b
            @k
            /* renamed from: L, reason: from getter */
            public final String getF310046d() {
                return this.f310036d;
            }

            @Override // com.avito.android.user_advert.advert.items.safe_deal_services.c.b
            @l
            /* renamed from: a, reason: from getter */
            public final com.avito.android.user_advert.advert.items.safe_deal_services.a getF310049g() {
                return this.f310039g;
            }

            @Override // com.avito.android.user_advert.advert.items.safe_deal_services.c.b
            @k
            /* renamed from: b, reason: from getter */
            public final String getF310047e() {
                return this.f310037e;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f310034b, aVar.f310034b) && L.f(this.f310035c, aVar.f310035c) && L.f(this.f310036d, aVar.f310036d) && L.f(this.f310037e, aVar.f310037e) && L.f(this.f310038f, aVar.f310038f) && L.f(this.f310039g, aVar.f310039g) && L.f(this.f310040h, aVar.f310040h) && this.f310041i == aVar.f310041i && this.f310042j == aVar.f310042j && this.f310043k == aVar.f310043k;
            }

            @Override // com.avito.android.user_advert.advert.items.safe_deal_services.c.b
            @k
            /* renamed from: f, reason: from getter */
            public final DeepLink getF310048f() {
                return this.f310038f;
            }

            @Override // com.avito.conveyor_item.a
            @k
            /* renamed from: getStringId, reason: from getter */
            public final String getF309261b() {
                return this.f310034b;
            }

            public final int hashCode() {
                int iE2 = com.avito.android.actions_sheet.a.e(this.f310038f, H.d(H.d(H.d(this.f310034b.hashCode() * 31, 31, this.f310035c), 31, this.f310036d), 31, this.f310037e), 31);
                com.avito.android.user_advert.advert.items.safe_deal_services.a aVar = this.f310039g;
                return Boolean.hashCode(this.f310043k) + r.i(r.i(H.d((iE2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f310040h), 31, this.f310041i), 31, this.f310042j);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Active(stringId=");
                sb2.append(this.f310034b);
                sb2.append(", advertId=");
                sb2.append(this.f310035c);
                sb2.append(", contentTitle=");
                sb2.append(this.f310036d);
                sb2.append(", contentLinkText=");
                sb2.append(this.f310037e);
                sb2.append(", contentLinkUri=");
                sb2.append(this.f310038f);
                sb2.append(", contentIcon=");
                sb2.append(this.f310039g);
                sb2.append(", contentSwitcherId=");
                sb2.append(this.f310040h);
                sb2.append(", isChecked=");
                sb2.append(this.f310041i);
                sb2.append(", isLoading=");
                sb2.append(this.f310042j);
                sb2.append(", shouldReloadInstallments=");
                return r.x(sb2, this.f310043k, ')');
            }
        }

        /* compiled from: SafeDealServiceItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_deal_services/c$b$b;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/c$b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_advert.advert.items.safe_deal_services.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C9502b extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f310044b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f310045c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f310046d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f310047e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final DeepLink f310048f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final com.avito.android.user_advert.advert.items.safe_deal_services.a f310049g;

            public C9502b(@k String str, @k String str2, @k String str3, @k String str4, @k DeepLink deepLink, @l com.avito.android.user_advert.advert.items.safe_deal_services.a aVar) {
                super(null);
                this.f310044b = str;
                this.f310045c = str2;
                this.f310046d = str3;
                this.f310047e = str4;
                this.f310048f = deepLink;
                this.f310049g = aVar;
            }

            @Override // com.avito.android.user_advert.advert.items.safe_deal_services.c.b
            @k
            /* renamed from: L, reason: from getter */
            public final String getF310046d() {
                return this.f310046d;
            }

            @Override // com.avito.android.user_advert.advert.items.safe_deal_services.c.b
            @l
            /* renamed from: a, reason: from getter */
            public final com.avito.android.user_advert.advert.items.safe_deal_services.a getF310049g() {
                return this.f310049g;
            }

            @Override // com.avito.android.user_advert.advert.items.safe_deal_services.c.b
            @k
            /* renamed from: b, reason: from getter */
            public final String getF310047e() {
                return this.f310047e;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9502b)) {
                    return false;
                }
                C9502b c9502b = (C9502b) obj;
                return L.f(this.f310044b, c9502b.f310044b) && L.f(this.f310045c, c9502b.f310045c) && L.f(this.f310046d, c9502b.f310046d) && L.f(this.f310047e, c9502b.f310047e) && L.f(this.f310048f, c9502b.f310048f) && L.f(this.f310049g, c9502b.f310049g);
            }

            @Override // com.avito.android.user_advert.advert.items.safe_deal_services.c.b
            @k
            /* renamed from: f, reason: from getter */
            public final DeepLink getF310048f() {
                return this.f310048f;
            }

            @Override // com.avito.conveyor_item.a
            @k
            /* renamed from: getStringId, reason: from getter */
            public final String getF309490b() {
                return this.f310044b;
            }

            public final int hashCode() {
                int iE2 = com.avito.android.actions_sheet.a.e(this.f310048f, H.d(H.d(H.d(this.f310044b.hashCode() * 31, 31, this.f310045c), 31, this.f310046d), 31, this.f310047e), 31);
                com.avito.android.user_advert.advert.items.safe_deal_services.a aVar = this.f310049g;
                return iE2 + (aVar == null ? 0 : aVar.hashCode());
            }

            @k
            public final String toString() {
                return "Inactive(stringId=" + this.f310044b + ", advertId=" + this.f310045c + ", contentTitle=" + this.f310046d + ", contentLinkText=" + this.f310047e + ", contentLinkUri=" + this.f310048f + ", contentIcon=" + this.f310049g + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @k
        /* renamed from: L */
        public abstract String getF310046d();

        @l
        /* renamed from: a */
        public abstract com.avito.android.user_advert.advert.items.safe_deal_services.a getF310049g();

        @k
        /* renamed from: b */
        public abstract String getF310047e();

        @k
        /* renamed from: f */
        public abstract DeepLink getF310048f();

        public b() {
            super(null);
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF309490b().hashCode();
    }

    public c() {
    }
}

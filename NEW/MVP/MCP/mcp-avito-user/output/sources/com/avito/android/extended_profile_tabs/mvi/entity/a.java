package com.avito.android.extended_profile_tabs.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.extended_profile_tabs.ExtendedProfileTabsArguments;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileTabsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/entity/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f153239b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f153240c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Throwable f153241d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f153242e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C4472a f153243f;

    /* compiled from: ExtendedProfileTabsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/entity/a$a;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile_tabs.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C4472a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ExtendedProfileTabsArguments.ExtendedProfileTab f153244a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f153245b;

        public C4472a(@k ExtendedProfileTabsArguments.ExtendedProfileTab extendedProfileTab, boolean z12) {
            this.f153244a = extendedProfileTab;
            this.f153245b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4472a)) {
                return false;
            }
            C4472a c4472a = (C4472a) obj;
            return L.f(this.f153244a, c4472a.f153244a) && this.f153245b == c4472a.f153245b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f153245b) + (this.f153244a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ExtendedProfileCurrentTab(tab=");
            sb2.append(this.f153244a);
            sb2.append(", forceCreate=");
            return r.x(sb2, this.f153245b, ')');
        }
    }

    /* compiled from: ExtendedProfileTabsState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/entity/a$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/extended_profile_tabs/mvi/entity/a$b$a;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/a$b$b;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: ExtendedProfileTabsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/entity/a$b$a;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/a$b;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.extended_profile_tabs.mvi.entity.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C4473a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ExtendedProfileTabsArguments.ExtendedProfileTab.Profile f153246a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ExtendedProfileTabsArguments.ExtendedProfileTab.Search f153247b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final ExtendedProfileTabsArguments.ExtendedProfileTab.Rating f153248c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f153249d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f153250e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final String f153251f;

            public C4473a(@k ExtendedProfileTabsArguments.ExtendedProfileTab.Profile profile, @k ExtendedProfileTabsArguments.ExtendedProfileTab.Search search, @k ExtendedProfileTabsArguments.ExtendedProfileTab.Rating rating, @k String str, @k String str2, @k String str3) {
                super(null);
                this.f153246a = profile;
                this.f153247b = search;
                this.f153248c = rating;
                this.f153249d = str;
                this.f153250e = str2;
                this.f153251f = str3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4473a)) {
                    return false;
                }
                C4473a c4473a = (C4473a) obj;
                return L.f(this.f153246a, c4473a.f153246a) && L.f(this.f153247b, c4473a.f153247b) && L.f(this.f153248c, c4473a.f153248c) && L.f(this.f153249d, c4473a.f153249d) && L.f(this.f153250e, c4473a.f153250e) && L.f(this.f153251f, c4473a.f153251f);
            }

            public final int hashCode() {
                return this.f153251f.hashCode() + H.d(H.d((this.f153248c.hashCode() + ((this.f153247b.hashCode() + (this.f153246a.hashCode() * 31)) * 31)) * 31, 31, this.f153249d), 31, this.f153250e);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("WithTabs(brandTabArguments=");
                sb2.append(this.f153246a);
                sb2.append(", searchTabArguments=");
                sb2.append(this.f153247b);
                sb2.append(", ratingTabArguments=");
                sb2.append(this.f153248c);
                sb2.append(", profileTabTitle=");
                sb2.append(this.f153249d);
                sb2.append(", searchTabTitle=");
                sb2.append(this.f153250e);
                sb2.append(", ratingTabTitle=");
                return C22026a.c(sb2, this.f153251f, ')');
            }
        }

        /* compiled from: ExtendedProfileTabsState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/entity/a$b$b;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/a$b;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.extended_profile_tabs.mvi.entity.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4474b extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C4474b f153252a = new C4474b();

            public C4474b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C4474b);
            }

            public final int hashCode() {
                return 1783274238;
            }

            @k
            public final String toString() {
                return "WithoutTabs";
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ a(b bVar, boolean z12, Throwable th2, Image image, C4472a c4472a, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? b.C4474b.f153252a : bVar, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? null : th2, (i12 & 8) != 0 ? null : image, c4472a);
    }

    public static a a(a aVar, b bVar, boolean z12, Throwable th2, Image image, C4472a c4472a, int i12) {
        if ((i12 & 1) != 0) {
            bVar = aVar.f153239b;
        }
        b bVar2 = bVar;
        if ((i12 & 2) != 0) {
            z12 = aVar.f153240c;
        }
        boolean z13 = z12;
        if ((i12 & 4) != 0) {
            th2 = aVar.f153241d;
        }
        Throwable th3 = th2;
        if ((i12 & 8) != 0) {
            image = aVar.f153242e;
        }
        Image image2 = image;
        if ((i12 & 16) != 0) {
            c4472a = aVar.f153243f;
        }
        aVar.getClass();
        return new a(bVar2, z13, th3, image2, c4472a);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f153239b, aVar.f153239b) && this.f153240c == aVar.f153240c && L.f(this.f153241d, aVar.f153241d) && L.f(this.f153242e, aVar.f153242e) && L.f(this.f153243f, aVar.f153243f);
    }

    public final int hashCode() {
        int i12 = r.i(this.f153239b.hashCode() * 31, 31, this.f153240c);
        Throwable th2 = this.f153241d;
        int iHashCode = (i12 + (th2 == null ? 0 : th2.hashCode())) * 31;
        Image image = this.f153242e;
        return this.f153243f.hashCode() + ((iHashCode + (image != null ? image.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "ExtendedProfileTabsState(tabs=" + this.f153239b + ", isLoading=" + this.f153240c + ", loadingError=" + this.f153241d + ", avatar=" + this.f153242e + ", currentTab=" + this.f153243f + ')';
    }

    public a(@k b bVar, boolean z12, @l Throwable th2, @l Image image, @k C4472a c4472a) {
        this.f153239b = bVar;
        this.f153240c = z12;
        this.f153241d = th2;
        this.f153242e = image;
        this.f153243f = c4472a;
    }
}

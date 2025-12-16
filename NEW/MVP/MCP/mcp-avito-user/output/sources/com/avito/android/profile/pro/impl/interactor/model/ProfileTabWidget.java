package com.avito.android.profile.pro.impl.interactor.model;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileTabWidget.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u0010\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "", "a", "b", "c", "d", "e", "f", "g", "h", "Passport", "i", "j", "ReputationAndRating", "k", "l", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$a;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$b;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$c;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$d;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$e;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$f;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$g;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$h;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$Passport;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$i;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$j;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$ReputationAndRating;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$k;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$l;", "LB90/b;", "LB90/d;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ProfileTabWidget {

    /* compiled from: ProfileTabWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$Passport;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "a", "b", "Status", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Passport implements ProfileTabWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222735a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f222736b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f222737c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ProfileTabWidget.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$Passport$Status;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Status {

            /* renamed from: b, reason: collision with root package name */
            public static final Status f222738b;

            /* renamed from: c, reason: collision with root package name */
            public static final Status f222739c;

            /* renamed from: d, reason: collision with root package name */
            public static final Status f222740d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ Status[] f222741e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f222742f;

            static {
                Status status = new Status("WARNING", 0);
                f222738b = status;
                Status status2 = new Status("PENDING", 1);
                f222739c = status2;
                Status status3 = new Status("FINALIZED", 2);
                f222740d = status3;
                Status[] statusArr = {status, status2, status3};
                f222741e = statusArr;
                f222742f = kotlin.enums.c.a(statusArr);
            }

            public Status() {
                throw null;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) f222741e.clone();
            }
        }

        /* compiled from: ProfileTabWidget.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$Passport$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Image f222743a;

            public a(@Y61.l Image image) {
                this.f222743a = image;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                aVar.getClass();
                return L.f(null, null) && this.f222743a.equals(aVar.f222743a);
            }

            public final int hashCode() {
                return this.f222743a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return AK.c.o(new StringBuilder("Avatar(defaultUrl=null, image="), this.f222743a, ')');
            }
        }

        /* compiled from: ProfileTabWidget.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$Passport$b;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f222744a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Boolean f222745b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f222746c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final String f222747d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final a f222748e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final Status f222749f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.l
            public final String f222750g;

            public b(@Y61.l String str, @Y61.l Boolean bool, @Y61.l String str2, @Y61.l String str3, @Y61.l a aVar, @Y61.l Status status, @Y61.l String str4) {
                this.f222744a = str;
                this.f222745b = bool;
                this.f222746c = str2;
                this.f222747d = str3;
                this.f222748e = aVar;
                this.f222749f = status;
                this.f222750g = str4;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f222744a, bVar.f222744a) && L.f(this.f222745b, bVar.f222745b) && L.f(this.f222746c, bVar.f222746c) && L.f(this.f222747d, bVar.f222747d) && L.f(this.f222748e, bVar.f222748e) && this.f222749f == bVar.f222749f && L.f(this.f222750g, bVar.f222750g);
            }

            public final int hashCode() {
                String str = this.f222744a;
                int iHashCode = (this.f222745b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
                String str2 = this.f222746c;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f222747d;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                a aVar = this.f222748e;
                int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.f222743a.hashCode())) * 31;
                Status status = this.f222749f;
                int iHashCode5 = (iHashCode4 + (status == null ? 0 : status.hashCode())) * 31;
                String str4 = this.f222750g;
                return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Profile(id=");
                sb2.append(this.f222744a);
                sb2.append(", isCurrent=");
                sb2.append(this.f222745b);
                sb2.append(", name=");
                sb2.append(this.f222746c);
                sb2.append(", title=");
                sb2.append(this.f222747d);
                sb2.append(", avatar=");
                sb2.append(this.f222748e);
                sb2.append(", status=");
                sb2.append(this.f222749f);
                sb2.append(", description=");
                return C22026a.c(sb2, this.f222750g, ')');
            }
        }

        public Passport(@Y61.k String str, @Y61.l Integer num, @Y61.k ArrayList arrayList) {
            this.f222735a = str;
            this.f222736b = num;
            this.f222737c = arrayList;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF971a() {
            return this.f222735a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Passport)) {
                return false;
            }
            Passport passport = (Passport) obj;
            return L.f(this.f222735a, passport.f222735a) && this.f222736b.equals(passport.f222736b) && this.f222737c.equals(passport.f222737c);
        }

        public final int hashCode() {
            return this.f222737c.hashCode() + ((this.f222736b.hashCode() + (this.f222735a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Passport(analyticsType=");
            sb2.append(this.f222735a);
            sb2.append(", count=");
            sb2.append(this.f222736b);
            sb2.append(", profiles=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f222737c, ')');
        }
    }

    /* compiled from: ProfileTabWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$ReputationAndRating;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "RepColor", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReputationAndRating implements ProfileTabWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222751a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f222752b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f222753c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f222754d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final RepColor f222755e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f222756f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final String f222757g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Float f222758h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final DeepLink f222759i;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ProfileTabWidget.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$ReputationAndRating$RepColor;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RepColor {

            /* renamed from: b, reason: collision with root package name */
            public static final RepColor f222760b;

            /* renamed from: c, reason: collision with root package name */
            public static final RepColor f222761c;

            /* renamed from: d, reason: collision with root package name */
            public static final RepColor f222762d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ RepColor[] f222763e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f222764f;

            static {
                RepColor repColor = new RepColor("RED", 0);
                f222760b = repColor;
                RepColor repColor2 = new RepColor("YELLOW", 1);
                f222761c = repColor2;
                RepColor repColor3 = new RepColor("GREEN", 2);
                f222762d = repColor3;
                RepColor[] repColorArr = {repColor, repColor2, repColor3};
                f222763e = repColorArr;
                f222764f = kotlin.enums.c.a(repColorArr);
            }

            public RepColor() {
                throw null;
            }

            public static RepColor valueOf(String str) {
                return (RepColor) Enum.valueOf(RepColor.class, str);
            }

            public static RepColor[] values() {
                return (RepColor[]) f222763e.clone();
            }
        }

        public ReputationAndRating(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l Integer num, @Y61.l RepColor repColor, @Y61.k DeepLink deepLink, @Y61.k String str4, @Y61.l Float f12, @Y61.k DeepLink deepLink2) {
            this.f222751a = str;
            this.f222752b = str2;
            this.f222753c = str3;
            this.f222754d = num;
            this.f222755e = repColor;
            this.f222756f = deepLink;
            this.f222757g = str4;
            this.f222758h = f12;
            this.f222759i = deepLink2;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF971a() {
            return this.f222751a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReputationAndRating)) {
                return false;
            }
            ReputationAndRating reputationAndRating = (ReputationAndRating) obj;
            return L.f(this.f222751a, reputationAndRating.f222751a) && L.f(this.f222752b, reputationAndRating.f222752b) && L.f(this.f222753c, reputationAndRating.f222753c) && L.f(this.f222754d, reputationAndRating.f222754d) && this.f222755e == reputationAndRating.f222755e && L.f(this.f222756f, reputationAndRating.f222756f) && L.f(this.f222757g, reputationAndRating.f222757g) && L.f(this.f222758h, reputationAndRating.f222758h) && L.f(this.f222759i, reputationAndRating.f222759i);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f222751a.hashCode() * 31, 31, this.f222752b);
            String str = this.f222753c;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f222754d;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            RepColor repColor = this.f222755e;
            int iD3 = H.d(com.avito.android.actions_sheet.a.e(this.f222756f, (iHashCode2 + (repColor == null ? 0 : repColor.hashCode())) * 31, 31), 31, this.f222757g);
            Float f12 = this.f222758h;
            return this.f222759i.hashCode() + ((iD3 + (f12 != null ? f12.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReputationAndRating(analyticsType=");
            sb2.append(this.f222751a);
            sb2.append(", reputationWidgetText=");
            sb2.append(this.f222752b);
            sb2.append(", reputationTag=");
            sb2.append(this.f222753c);
            sb2.append(", reputationScore=");
            sb2.append(this.f222754d);
            sb2.append(", reputationColor=");
            sb2.append(this.f222755e);
            sb2.append(", reputationUri=");
            sb2.append(this.f222756f);
            sb2.append(", ratingWidgetText=");
            sb2.append(this.f222757g);
            sb2.append(", ratingScore=");
            sb2.append(this.f222758h);
            sb2.append(", ratingUri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f222759i, ')');
        }
    }

    /* compiled from: ProfileTabWidget.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$a;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements ProfileTabWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222765a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f222766b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Image f222767c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final DeepLink f222768d;

        public a(@Y61.k String str, @Y61.l String str2, @Y61.l Image image, @Y61.l DeepLink deepLink) {
            this.f222765a = str;
            this.f222766b = str2;
            this.f222767c = image;
            this.f222768d = deepLink;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF971a() {
            return this.f222765a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f222765a, aVar.f222765a) && L.f(this.f222766b, aVar.f222766b) && L.f(this.f222767c, aVar.f222767c) && L.f(this.f222768d, aVar.f222768d);
        }

        public final int hashCode() {
            int iHashCode = this.f222765a.hashCode() * 31;
            String str = this.f222766b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Image image = this.f222767c;
            int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            DeepLink deepLink = this.f222768d;
            return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Avatar(analyticsType=");
            sb2.append(this.f222765a);
            sb2.append(", defaultUrl=");
            sb2.append(this.f222766b);
            sb2.append(", image=");
            sb2.append(this.f222767c);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f222768d, ')');
        }
    }

    /* compiled from: ProfileTabWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$b;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements ProfileTabWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222769a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f222770b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final a f222771c;

        /* compiled from: ProfileTabWidget.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$b$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f222772a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final DeepLink f222773b;

            public a(@Y61.l String str, @Y61.l DeepLink deepLink) {
                this.f222772a = str;
                this.f222773b = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f222772a, aVar.f222772a) && L.f(this.f222773b, aVar.f222773b);
            }

            public final int hashCode() {
                String str = this.f222772a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                DeepLink deepLink = this.f222773b;
                return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Action(title=");
                sb2.append(this.f222772a);
                sb2.append(", uri=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f222773b, ')');
            }
        }

        public b(@Y61.k String str, @Y61.l String str2, @Y61.l a aVar) {
            this.f222769a = str;
            this.f222770b = str2;
            this.f222771c = aVar;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF971a() {
            return this.f222769a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f222769a, bVar.f222769a) && L.f(this.f222770b, bVar.f222770b) && L.f(this.f222771c, bVar.f222771c);
        }

        public final int hashCode() {
            int iHashCode = this.f222769a.hashCode() * 31;
            String str = this.f222770b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.f222771c;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "AvitoFinance(analyticsType=" + this.f222769a + ", title=" + this.f222770b + ", action=" + this.f222771c + ')';
        }
    }

    /* compiled from: ProfileTabWidget.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$c;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements ProfileTabWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222774a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f222775b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final AttributedText f222776c;

        public c(@Y61.k String str, @Y61.l String str2, @Y61.l AttributedText attributedText) {
            this.f222774a = str;
            this.f222775b = str2;
            this.f222776c = attributedText;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF971a() {
            return this.f222774a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f222774a, cVar.f222774a) && L.f(this.f222775b, cVar.f222775b) && L.f(this.f222776c, cVar.f222776c);
        }

        public final int hashCode() {
            int iHashCode = this.f222774a.hashCode() * 31;
            String str = this.f222775b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AttributedText attributedText = this.f222776c;
            return iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Dashboard(analyticsType=");
            sb2.append(this.f222774a);
            sb2.append(", title=");
            sb2.append(this.f222775b);
            sb2.append(", value=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f222776c, ')');
        }
    }

    /* compiled from: ProfileTabWidget.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$d;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements ProfileTabWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222777a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f222778b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f222779c;

        public d(@Y61.k String str, @Y61.l String str2, @Y61.k String str3) {
            this.f222777a = str;
            this.f222778b = str2;
            this.f222779c = str3;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF971a() {
            return this.f222777a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f222777a, dVar.f222777a) && L.f(this.f222778b, dVar.f222778b) && L.f(this.f222779c, dVar.f222779c);
        }

        public final int hashCode() {
            int iHashCode = this.f222777a.hashCode() * 31;
            String str = this.f222778b;
            return this.f222779c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DashboardBeduin(analyticsType=");
            sb2.append(this.f222777a);
            sb2.append(", title=");
            sb2.append(this.f222778b);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f222779c, ')');
        }
    }

    /* compiled from: ProfileTabWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$e;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements ProfileTabWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222780a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AttributedText f222781b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final a f222782c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final UniversalImage f222783d;

        /* compiled from: ProfileTabWidget.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$e$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f222784a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DeepLink f222785b;

            public a(@Y61.k String str, @Y61.k DeepLink deepLink) {
                this.f222784a = str;
                this.f222785b = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f222784a, aVar.f222784a) && L.f(this.f222785b, aVar.f222785b);
            }

            public final int hashCode() {
                return this.f222785b.hashCode() + (this.f222784a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("BannerButton(title=");
                sb2.append(this.f222784a);
                sb2.append(", deeplink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f222785b, ')');
            }
        }

        public e(@Y61.k String str, @Y61.k AttributedText attributedText, @Y61.k a aVar, @Y61.k UniversalImage universalImage) {
            this.f222780a = str;
            this.f222781b = attributedText;
            this.f222782c = aVar;
            this.f222783d = universalImage;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF971a() {
            return this.f222780a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f222780a, eVar.f222780a) && L.f(this.f222781b, eVar.f222781b) && L.f(this.f222782c, eVar.f222782c) && L.f(this.f222783d, eVar.f222783d);
        }

        public final int hashCode() {
            return this.f222783d.hashCode() + ((this.f222782c.hashCode() + com.avito.android.actions_sheet.a.b(this.f222780a.hashCode() * 31, 31, this.f222781b)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeliveryRestriction(analyticsType=");
            sb2.append(this.f222780a);
            sb2.append(", title=");
            sb2.append(this.f222781b);
            sb2.append(", action=");
            sb2.append(this.f222782c);
            sb2.append(", image=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f222783d, ')');
        }
    }

    /* compiled from: ProfileTabWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$f;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements ProfileTabWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222786a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f222787b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f222788c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f222789d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final AttributedText f222790e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final a f222791f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f222792g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final UniversalImage f222793h;

        /* compiled from: ProfileTabWidget.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$f$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final DeepLink f222794a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f222795b;

            public a(@Y61.l DeepLink deepLink, @Y61.k String str) {
                this.f222794a = deepLink;
                this.f222795b = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f222794a, aVar.f222794a) && L.f(this.f222795b, aVar.f222795b);
            }

            public final int hashCode() {
                DeepLink deepLink = this.f222794a;
                return this.f222795b.hashCode() + ((deepLink == null ? 0 : deepLink.hashCode()) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Action(uri=");
                sb2.append(this.f222794a);
                sb2.append(", title=");
                return C22026a.c(sb2, this.f222795b, ')');
            }
        }

        public f(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l AttributedText attributedText, @Y61.l a aVar, boolean z12, @Y61.l UniversalImage universalImage) {
            this.f222786a = str;
            this.f222787b = str2;
            this.f222788c = str3;
            this.f222789d = str4;
            this.f222790e = attributedText;
            this.f222791f = aVar;
            this.f222792g = z12;
            this.f222793h = universalImage;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF971a() {
            return this.f222786a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f222786a, fVar.f222786a) && L.f(this.f222787b, fVar.f222787b) && L.f(this.f222788c, fVar.f222788c) && L.f(this.f222789d, fVar.f222789d) && L.f(this.f222790e, fVar.f222790e) && L.f(this.f222791f, fVar.f222791f) && this.f222792g == fVar.f222792g && L.f(this.f222793h, fVar.f222793h);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(H.d(this.f222786a.hashCode() * 31, 31, this.f222787b), 31, this.f222788c), 31, this.f222789d);
            AttributedText attributedText = this.f222790e;
            int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            a aVar = this.f222791f;
            int i12 = r.i((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f222792g);
            UniversalImage universalImage = this.f222793h;
            return i12 + (universalImage != null ? universalImage.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GeoBanner(analyticsType=");
            sb2.append(this.f222786a);
            sb2.append(", id=");
            sb2.append(this.f222787b);
            sb2.append(", title=");
            sb2.append(this.f222788c);
            sb2.append(", subtitle=");
            sb2.append(this.f222789d);
            sb2.append(", addressAttrText=");
            sb2.append(this.f222790e);
            sb2.append(", action=");
            sb2.append(this.f222791f);
            sb2.append(", closable=");
            sb2.append(this.f222792g);
            sb2.append(", image=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f222793h, ')');
        }
    }

    /* compiled from: ProfileTabWidget.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$g;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements ProfileTabWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222796a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final AttributedText f222797b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final DeepLink f222798c;

        public g(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.l AttributedText attributedText) {
            this.f222796a = str;
            this.f222797b = attributedText;
            this.f222798c = deepLink;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF971a() {
            return this.f222796a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f222796a, gVar.f222796a) && L.f(this.f222797b, gVar.f222797b) && L.f(this.f222798c, gVar.f222798c);
        }

        public final int hashCode() {
            int iHashCode = this.f222796a.hashCode() * 31;
            AttributedText attributedText = this.f222797b;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            DeepLink deepLink = this.f222798c;
            return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Name(analyticsType=");
            sb2.append(this.f222796a);
            sb2.append(", value=");
            sb2.append(this.f222797b);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f222798c, ')');
        }
    }

    /* compiled from: ProfileTabWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$h;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements ProfileTabWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222799a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f222800b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final a f222801c;

        /* compiled from: ProfileTabWidget.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$h$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f222802a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final DeepLink f222803b;

            public a(@Y61.l String str, @Y61.l DeepLink deepLink) {
                this.f222802a = str;
                this.f222803b = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f222802a, aVar.f222802a) && L.f(this.f222803b, aVar.f222803b);
            }

            public final int hashCode() {
                String str = this.f222802a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                DeepLink deepLink = this.f222803b;
                return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Action(title=");
                sb2.append(this.f222802a);
                sb2.append(", uri=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f222803b, ')');
            }
        }

        public h(@Y61.k String str, @Y61.l String str2, @Y61.l a aVar) {
            this.f222799a = str;
            this.f222800b = str2;
            this.f222801c = aVar;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF971a() {
            return this.f222799a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f222799a, hVar.f222799a) && L.f(this.f222800b, hVar.f222800b) && L.f(this.f222801c, hVar.f222801c);
        }

        public final int hashCode() {
            int iHashCode = this.f222799a.hashCode() * 31;
            String str = this.f222800b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.f222801c;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Orders(analyticsType=" + this.f222799a + ", title=" + this.f222800b + ", action=" + this.f222801c + ')';
        }
    }

    /* compiled from: ProfileTabWidget.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$i;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements ProfileTabWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222804a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final AttributedText f222805b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final DeepLink f222806c;

        public i(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.l AttributedText attributedText) {
            this.f222804a = str;
            this.f222805b = attributedText;
            this.f222806c = deepLink;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF971a() {
            return this.f222804a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f222804a, iVar.f222804a) && L.f(this.f222805b, iVar.f222805b) && L.f(this.f222806c, iVar.f222806c);
        }

        public final int hashCode() {
            int iHashCode = this.f222804a.hashCode() * 31;
            AttributedText attributedText = this.f222805b;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            DeepLink deepLink = this.f222806c;
            return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Rating(analyticsType=");
            sb2.append(this.f222804a);
            sb2.append(", value=");
            sb2.append(this.f222805b);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f222806c, ')');
        }
    }

    /* compiled from: ProfileTabWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$j;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements ProfileTabWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222807a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f222808b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final DeepLink f222809c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f222810d;

        /* compiled from: ProfileTabWidget.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$j$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final AttributedText f222811a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Image f222812b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f222813c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final String f222814d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final AttributedText f222815e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final Object f222816f;

            public a(@Y61.k List list, @Y61.k AttributedText attributedText, @Y61.l Image image, @Y61.k String str, @Y61.l String str2, @Y61.l AttributedText attributedText2) {
                this.f222811a = attributedText;
                this.f222812b = image;
                this.f222813c = str;
                this.f222814d = str2;
                this.f222815e = attributedText2;
                this.f222816f = list;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f222811a, aVar.f222811a) && L.f(this.f222812b, aVar.f222812b) && this.f222813c.equals(aVar.f222813c) && L.f(this.f222814d, aVar.f222814d) && L.f(this.f222815e, aVar.f222815e) && L.f(this.f222816f, aVar.f222816f);
            }

            public final int hashCode() {
                int iHashCode = this.f222811a.hashCode() * 31;
                Image image = this.f222812b;
                int iD2 = H.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f222813c);
                String str = this.f222814d;
                int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                AttributedText attributedText = this.f222815e;
                return this.f222816f.hashCode() + ((iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Item(title=");
                sb2.append(this.f222811a);
                sb2.append(", image=");
                sb2.append(this.f222812b);
                sb2.append(", price=");
                sb2.append(this.f222813c);
                sb2.append(", oldPrice=");
                sb2.append(this.f222814d);
                sb2.append(", additionalInfo=");
                sb2.append(this.f222815e);
                sb2.append(", actions=");
                return H.n(sb2, this.f222816f, ')');
            }
        }

        public j(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.l String str2, @Y61.k ArrayList arrayList) {
            this.f222807a = str;
            this.f222808b = str2;
            this.f222809c = deepLink;
            this.f222810d = arrayList;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF971a() {
            return this.f222807a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f222807a, jVar.f222807a) && L.f(this.f222808b, jVar.f222808b) && L.f(this.f222809c, jVar.f222809c) && this.f222810d.equals(jVar.f222810d);
        }

        public final int hashCode() {
            int iHashCode = this.f222807a.hashCode() * 31;
            String str = this.f222808b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DeepLink deepLink = this.f222809c;
            return this.f222810d.hashCode() + ((iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Recommendations(analyticsType=");
            sb2.append(this.f222807a);
            sb2.append(", title=");
            sb2.append(this.f222808b);
            sb2.append(", deeplink=");
            sb2.append(this.f222809c);
            sb2.append(", items=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f222810d, ')');
        }
    }

    /* compiled from: ProfileTabWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$k;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "a", "b", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements ProfileTabWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222817a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f222818b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f222819c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final b f222820d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f222821e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f222822f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final a f222823g;

        /* compiled from: ProfileTabWidget.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$k$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final DeepLink f222824a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final AttributedText f222825b;

            public a(@Y61.l DeepLink deepLink, @Y61.k AttributedText attributedText) {
                this.f222824a = deepLink;
                this.f222825b = attributedText;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f222824a, aVar.f222824a) && L.f(this.f222825b, aVar.f222825b);
            }

            public final int hashCode() {
                DeepLink deepLink = this.f222824a;
                return this.f222825b.hashCode() + ((deepLink == null ? 0 : deepLink.hashCode()) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Action(deepLink=");
                sb2.append(this.f222824a);
                sb2.append(", value=");
                return com.avito.android.actions_sheet.a.w(sb2, this.f222825b, ')');
            }
        }

        /* compiled from: ProfileTabWidget.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$k$b;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f222826a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final DeepLink f222827b;

            public b(@Y61.k String str, @Y61.l DeepLink deepLink) {
                this.f222826a = str;
                this.f222827b = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f222826a, bVar.f222826a) && L.f(this.f222827b, bVar.f222827b);
            }

            public final int hashCode() {
                int iHashCode = this.f222826a.hashCode() * 31;
                DeepLink deepLink = this.f222827b;
                return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Icon(name=");
                sb2.append(this.f222826a);
                sb2.append(", deepLink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f222827b, ')');
            }
        }

        public k(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l b bVar, @Y61.l String str4, @Y61.l String str5, @Y61.l a aVar) {
            this.f222817a = str;
            this.f222818b = str2;
            this.f222819c = str3;
            this.f222820d = bVar;
            this.f222821e = str4;
            this.f222822f = str5;
            this.f222823g = aVar;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF971a() {
            return this.f222817a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f222817a, kVar.f222817a) && L.f(this.f222818b, kVar.f222818b) && L.f(this.f222819c, kVar.f222819c) && L.f(this.f222820d, kVar.f222820d) && L.f(this.f222821e, kVar.f222821e) && L.f(this.f222822f, kVar.f222822f) && L.f(this.f222823g, kVar.f222823g);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f222817a.hashCode() * 31, 31, this.f222818b), 31, this.f222819c);
            b bVar = this.f222820d;
            int iHashCode = (iD2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.f222821e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f222822f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            a aVar = this.f222823g;
            return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "ServiceBooking(analyticsType=" + this.f222817a + ", title=" + this.f222818b + ", fromPage=" + this.f222819c + ", icon=" + this.f222820d + ", badge=" + this.f222821e + ", badgeKey=" + this.f222822f + ", action=" + this.f222823g + ')';
        }
    }

    /* compiled from: ProfileTabWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$l;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "a", "b", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements ProfileTabWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222828a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final b f222829b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final a f222830c;

        /* compiled from: ProfileTabWidget.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$l$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f222831a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f222832b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final AttributedText f222833c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final DeepLink f222834d;

            public a(@Y61.l String str, @Y61.l String str2, @Y61.l AttributedText attributedText, @Y61.l DeepLink deepLink) {
                this.f222831a = str;
                this.f222832b = str2;
                this.f222833c = attributedText;
                this.f222834d = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f222831a, aVar.f222831a) && L.f(this.f222832b, aVar.f222832b) && L.f(this.f222833c, aVar.f222833c) && L.f(this.f222834d, aVar.f222834d);
            }

            public final int hashCode() {
                String str = this.f222831a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f222832b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                AttributedText attributedText = this.f222833c;
                int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                DeepLink deepLink = this.f222834d;
                return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Prepayment(title=");
                sb2.append(this.f222831a);
                sb2.append(", subtitle=");
                sb2.append(this.f222832b);
                sb2.append(", value=");
                sb2.append(this.f222833c);
                sb2.append(", uri=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f222834d, ')');
            }
        }

        /* compiled from: ProfileTabWidget.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget$l$b;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f222835a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f222836b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final AttributedText f222837c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final DeepLink f222838d;

            public b(@Y61.l String str, @Y61.l String str2, @Y61.l AttributedText attributedText, @Y61.l DeepLink deepLink) {
                this.f222835a = str;
                this.f222836b = str2;
                this.f222837c = attributedText;
                this.f222838d = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f222835a, bVar.f222835a) && L.f(this.f222836b, bVar.f222836b) && L.f(this.f222837c, bVar.f222837c) && L.f(this.f222838d, bVar.f222838d);
            }

            public final int hashCode() {
                String str = this.f222835a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f222836b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                AttributedText attributedText = this.f222837c;
                int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                DeepLink deepLink = this.f222838d;
                return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Wallet(title=");
                sb2.append(this.f222835a);
                sb2.append(", subtitle=");
                sb2.append(this.f222836b);
                sb2.append(", value=");
                sb2.append(this.f222837c);
                sb2.append(", uri=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f222838d, ')');
            }
        }

        public l(@Y61.k String str, @Y61.l b bVar, @Y61.l a aVar) {
            this.f222828a = str;
            this.f222829b = bVar;
            this.f222830c = aVar;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF971a() {
            return this.f222828a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f222828a, lVar.f222828a) && L.f(this.f222829b, lVar.f222829b) && L.f(this.f222830c, lVar.f222830c);
        }

        public final int hashCode() {
            int iHashCode = this.f222828a.hashCode() * 31;
            b bVar = this.f222829b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            a aVar = this.f222830c;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "WalletAndPrepayment(analyticsType=" + this.f222828a + ", wallet=" + this.f222829b + ", prepayment=" + this.f222830c + ')';
        }
    }

    @Y61.k
    /* renamed from: a */
    String getF971a();
}

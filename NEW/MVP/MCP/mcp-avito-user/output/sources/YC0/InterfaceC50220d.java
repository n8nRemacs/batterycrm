package yc0;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lyc0/d;", "Lyc0/D;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "Lyc0/d$a;", "Lyc0/d$b;", "Lyc0/d$c;", "Lyc0/d$d;", "Lyc0/d$e;", "Lyc0/d$f;", "Lyc0/d$g;", "Lyc0/d$h;", "Lyc0/d$i;", "Lyc0/d$j;", "Lyc0/d$k;", "Lyc0/d$l;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yc0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC50220d extends D {

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/d$a;", "Lyc0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.d$a */
    public static final /* data */ class a implements InterfaceC50220d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BasicInfoV2Item f443230a;

        public a(@Y61.k BasicInfoV2Item basicInfoV2Item) {
            this.f443230a = basicInfoV2Item;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f443230a, ((a) obj).f443230a);
        }

        public final int hashCode() {
            return this.f443230a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "AvatarClick(item=" + this.f443230a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/d$b;", "Lyc0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.d$b */
    public static final /* data */ class b implements InterfaceC50220d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f443231a;

        public b(@Y61.k DeepLink deepLink) {
            this.f443231a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443231a, ((b) obj).f443231a);
        }

        public final int hashCode() {
            return this.f443231a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DisableVertical(deeplink="), this.f443231a, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/d$c;", "Lyc0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.d$c */
    public static final /* data */ class c implements InterfaceC50220d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BasicInfoV2Item f443232a;

        public c(@Y61.k BasicInfoV2Item basicInfoV2Item) {
            this.f443232a = basicInfoV2Item;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f443232a, ((c) obj).f443232a);
        }

        public final int hashCode() {
            return this.f443232a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "EditClick(item=" + this.f443232a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/d$d;", "Lyc0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C12910d implements InterfaceC50220d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BasicInfoV2Item f443233a;

        public C12910d(@Y61.k BasicInfoV2Item basicInfoV2Item) {
            this.f443233a = basicInfoV2Item;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12910d) && L.f(this.f443233a, ((C12910d) obj).f443233a);
        }

        public final int hashCode() {
            return this.f443233a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "MoreButtonClick(item=" + this.f443233a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/d$e;", "Lyc0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.d$e */
    public static final /* data */ class e implements InterfaceC50220d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BasicInfoV2Item.PersonalLink f443234a;

        public e(@Y61.k BasicInfoV2Item.PersonalLink personalLink) {
            this.f443234a = personalLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f443234a, ((e) obj).f443234a);
        }

        public final int hashCode() {
            return this.f443234a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PersonalLinkCopy(personalLink=" + this.f443234a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/d$f;", "Lyc0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.d$f */
    public static final /* data */ class f implements InterfaceC50220d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BasicInfoV2Item.PersonalLink f443235a;

        public f(@Y61.k BasicInfoV2Item.PersonalLink personalLink) {
            this.f443235a = personalLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f443235a, ((f) obj).f443235a);
        }

        public final int hashCode() {
            return this.f443235a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PersonalLinkOpen(personalLink=" + this.f443235a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/d$g;", "Lyc0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.d$g */
    public static final /* data */ class g implements InterfaceC50220d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BasicInfoV2Item.PersonalLink f443236a;

        public g(@Y61.k BasicInfoV2Item.PersonalLink personalLink) {
            this.f443236a = personalLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f443236a, ((g) obj).f443236a);
        }

        public final int hashCode() {
            return this.f443236a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PersonalLinkShare(personalLink=" + this.f443236a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/d$h;", "Lyc0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.d$h */
    public static final /* data */ class h implements InterfaceC50220d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443237a;

        public h(@Y61.k String str) {
            this.f443237a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f443237a, ((h) obj).f443237a);
        }

        public final int hashCode() {
            return this.f443237a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SellerTypeOnboardingShown(onceShowId="), this.f443237a, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/d$i;", "Lyc0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.d$i */
    public static final /* data */ class i implements InterfaceC50220d {

        /* renamed from: a, reason: collision with root package name */
        public final int f443238a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BasicInfoV2Item.Onboarding f443239b;

        public i(int i12, @Y61.k BasicInfoV2Item.Onboarding onboarding) {
            this.f443238a = i12;
            this.f443239b = onboarding;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f443238a == iVar.f443238a && L.f(this.f443239b, iVar.f443239b);
        }

        public final int hashCode() {
            return this.f443239b.hashCode() + (Integer.hashCode(this.f443238a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "SellerTypeOnboardingTargetViewVisible(targetViewId=" + this.f443238a + ", onboarding=" + this.f443239b + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/d$j;", "Lyc0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.d$j */
    public static final /* data */ class j implements InterfaceC50220d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BasicInfoV2Item f443240a;

        public j(@Y61.k BasicInfoV2Item basicInfoV2Item) {
            this.f443240a = basicInfoV2Item;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f443240a, ((j) obj).f443240a);
        }

        public final int hashCode() {
            return this.f443240a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UserIdClick(item=" + this.f443240a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/d$k;", "Lyc0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.d$k */
    public static final /* data */ class k implements InterfaceC50220d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BasicInfoV2Item f443241a;

        public k(@Y61.k BasicInfoV2Item basicInfoV2Item) {
            this.f443241a = basicInfoV2Item;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f443241a, ((k) obj).f443241a);
        }

        public final int hashCode() {
            return this.f443241a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UserNameClick(item=" + this.f443241a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/d$l;", "Lyc0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.d$l */
    public static final /* data */ class l implements InterfaceC50220d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BasicInfoV2Item.Verification f443242a;

        public l(@Y61.k BasicInfoV2Item.Verification verification) {
            this.f443242a = verification;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f443242a, ((l) obj).f443242a);
        }

        public final int hashCode() {
            return this.f443242a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "VerificationButtonClick(verification=" + this.f443242a + ')';
        }
    }
}

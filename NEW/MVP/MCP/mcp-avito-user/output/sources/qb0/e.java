package Qb0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import com.avito.android.profile_settings_basic.adapter.setting_item.SettingItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BasicProfileSettingsAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"LQb0/e;", "LQb0/a;", "a", "b", "c", "d", "e", "f", "g", "h", "LQb0/a$a;", "LQb0/e$a;", "LQb0/e$b;", "LQb0/e$c;", "LQb0/e$d;", "LQb0/e$e;", "LQb0/e$f;", "LQb0/e$g;", "LQb0/e$h;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface e extends InterfaceC14878a {

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/e$a;", "LQb0/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BadgeItem f13916b;

        public a(@k BadgeItem badgeItem) {
            this.f13916b = badgeItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f13916b, ((a) obj).f13916b);
        }

        public final int hashCode() {
            return this.f13916b.hashCode();
        }

        @k
        public final String toString() {
            return "BadgeBarItemAction(item=" + this.f13916b + ')';
        }
    }

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/e$b;", "LQb0/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13917b;

        public b(boolean z12) {
            this.f13917b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f13917b == ((b) obj).f13917b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13917b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("BasicInfoAvatarClickAction(isAvatarLoading="), this.f13917b, ')');
        }
    }

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/e$c;", "LQb0/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BasicInfoItem f13918b;

        public c(@k BasicInfoItem basicInfoItem) {
            this.f13918b = basicInfoItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13918b, ((c) obj).f13918b);
        }

        public final int hashCode() {
            return this.f13918b.hashCode();
        }

        @k
        public final String toString() {
            return "BasicInfoEditNameAction(item=" + this.f13918b + ')';
        }
    }

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/e$d;", "LQb0/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BasicInfoItem.TextField f13919b;

        public d(@k BasicInfoItem.TextField textField) {
            this.f13919b = textField;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f13919b, ((d) obj).f13919b);
        }

        public final int hashCode() {
            return this.f13919b.hashCode();
        }

        @k
        public final String toString() {
            return "BasicInfoFieldClickedAction(field=" + this.f13919b + ')';
        }
    }

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/e$e;", "LQb0/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.e$e, reason: collision with other inner class name */
    public static final /* data */ class C0916e implements e {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0916e)) {
                return false;
            }
            ((C0916e) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "DeeplinkItemAction(deepLink=null)";
        }
    }

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb0/e$f;", "LQb0/e;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final f f13920b = new f();

        @k
        public final String toString() {
            return "ErrorItemAction";
        }
    }

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/e$g;", "LQb0/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SettingItem f13921b;

        public g(@k SettingItem settingItem) {
            this.f13921b = settingItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f13921b, ((g) obj).f13921b);
        }

        public final int hashCode() {
            return this.f13921b.hashCode();
        }

        @k
        public final String toString() {
            return "SettingItemAction(item=" + this.f13921b + ')';
        }
    }

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/e$h;", "LQb0/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f13922b;

        public h(@k DeepLink deepLink) {
            this.f13922b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f13922b, ((h) obj).f13922b);
        }

        public final int hashCode() {
            return this.f13922b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("VerificationItemAction(deepLink="), this.f13922b, ')');
        }
    }
}

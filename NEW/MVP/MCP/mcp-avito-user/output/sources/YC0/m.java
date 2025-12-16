package yc0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.authorization.AuthSource;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import com.avito.android.edit_carousel.entity.CarouselEditorData;
import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditConfig;
import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetCreateArguments;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import com.avito.android.profile_settings_extended.adapter.about.AboutItem;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import com.avito.android.profile_settings_extended.adapter.count.CountItem;
import com.avito.android.profile_settings_extended.adapter.gallery.image.GalleryImageItem;
import com.avito.android.profile_settings_extended.adapter.link_edit.LinkEditItem;
import com.avito.android.profile_settings_extended.adapter.select.SelectItem;
import com.avito.android.profile_settings_extended.adapter.setting.SettingItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import yc0.InterfaceC50219c;

/* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u001d\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u0082\u0001\u001d\u001f !\"#$%&'()*+,-./0123456789:;¨\u0006<"}, d2 = {"Lyc0/m;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "Lyc0/m$a;", "Lyc0/m$b;", "Lyc0/m$c;", "Lyc0/m$d;", "Lyc0/m$e;", "Lyc0/m$f;", "Lyc0/m$g;", "Lyc0/m$h;", "Lyc0/m$i;", "Lyc0/m$j;", "Lyc0/m$k;", "Lyc0/m$l;", "Lyc0/m$m;", "Lyc0/m$n;", "Lyc0/m$o;", "Lyc0/m$p;", "Lyc0/m$q;", "Lyc0/m$r;", "Lyc0/m$s;", "Lyc0/m$t;", "Lyc0/m$u;", "Lyc0/m$v;", "Lyc0/m$w;", "Lyc0/m$x;", "Lyc0/m$y;", "Lyc0/m$z;", "Lyc0/m$A;", "Lyc0/m$B;", "Lyc0/m$C;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface m {

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$A;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class A implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UniversalWidgetCreateArguments f443266a;

        public A(@Y61.k UniversalWidgetCreateArguments universalWidgetCreateArguments) {
            this.f443266a = universalWidgetCreateArguments;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && L.f(this.f443266a, ((A) obj).f443266a);
        }

        public final int hashCode() {
            return this.f443266a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UniversalWidgetCreateSection(arguments=" + this.f443266a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$B;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class B implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UniversalWidgetEditArguments f443267a;

        public B(@Y61.k UniversalWidgetEditArguments universalWidgetEditArguments) {
            this.f443267a = universalWidgetEditArguments;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof B) && L.f(this.f443267a, ((B) obj).f443267a);
        }

        public final int hashCode() {
            return this.f443267a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UniversalWidgetEditSection(arguments=" + this.f443267a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc0/m$C;", "Lyc0/m;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class C implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C f443268a = new C();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C);
        }

        public final int hashCode() {
            return -162409981;
        }

        @Y61.k
        public final String toString() {
            return "UpdateExtendedProfileLazyColumnComponent";
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc0/m$a;", "Lyc0/m;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.m$a, reason: case insensitive filesystem */
    public static final class C50221a implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C50221a f443269a = new C50221a();
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$b;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.m$b, reason: case insensitive filesystem */
    public static final /* data */ class C50222b implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443270a;

        public C50222b(@Y61.k String str) {
            this.f443270a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C50222b) && L.f(this.f443270a, ((C50222b) obj).f443270a);
        }

        public final int hashCode() {
            return this.f443270a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenAddPhoneForReplacementScreenEvent(phoneToBeReplaced="), this.f443270a, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$c;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.m$c, reason: case insensitive filesystem */
    public static final /* data */ class C50223c implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443271a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final ExtendedProfilesSettingsAddress f443272b;

        public C50223c(@Y61.k String str, @Y61.l ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress) {
            this.f443271a = str;
            this.f443272b = extendedProfilesSettingsAddress;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C50223c)) {
                return false;
            }
            C50223c c50223c = (C50223c) obj;
            return L.f(this.f443271a, c50223c.f443271a) && L.f(this.f443272b, c50223c.f443272b);
        }

        public final int hashCode() {
            int iHashCode = this.f443271a.hashCode() * 31;
            ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress = this.f443272b;
            return iHashCode + (extendedProfilesSettingsAddress == null ? 0 : extendedProfilesSettingsAddress.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "OpenAddressEditor(fieldName=" + this.f443271a + ", address=" + this.f443272b + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$d;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements m {
        public d() {
            AuthSource authSource = AuthSource.f92694c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            AuthSource authSource = AuthSource.f92694c;
            ((d) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return AuthSource.f92728t.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenAuthScreen(source=" + AuthSource.f92728t + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$e;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BasicInfoV2Item f443273a;

        public e(@Y61.k BasicInfoV2Item basicInfoV2Item) {
            this.f443273a = basicInfoV2Item;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f443273a, ((e) obj).f443273a);
        }

        public final int hashCode() {
            return this.f443273a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenBasicInfoEditor(item=" + this.f443273a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$f;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CarouselEditorData f443274a;

        public f(@Y61.k CarouselEditorData carouselEditorData) {
            this.f443274a = carouselEditorData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f443274a, ((f) obj).f443274a);
        }

        public final int hashCode() {
            return this.f443274a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenCarouselEditor(data=" + this.f443274a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$g;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CountItem f443275a;

        public g(@Y61.k CountItem countItem) {
            this.f443275a = countItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f443275a, ((g) obj).f443275a);
        }

        public final int hashCode() {
            return this.f443275a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenCountEdit(item=" + this.f443275a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$h;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Image> f443276a;

        /* renamed from: b, reason: collision with root package name */
        public final int f443277b;

        public h(@Y61.k List<Image> list, int i12) {
            this.f443276a = list;
            this.f443277b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f443276a, hVar.f443276a) && this.f443277b == hVar.f443277b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f443277b) + (this.f443276a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenGalleryEvent(images=");
            sb2.append(this.f443276a);
            sb2.append(", position=");
            return androidx.appcompat.app.r.t(sb2, this.f443277b, ')');
        }

        public /* synthetic */ h(List list, int i12, int i13, C42822w c42822w) {
            this(list, (i13 & 2) != 0 ? 0 : i12);
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$i;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443278a;

        /* renamed from: b, reason: collision with root package name */
        public final int f443279b;

        /* renamed from: c, reason: collision with root package name */
        public final int f443280c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f443281d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f443282e;

        public i(int i12, int i13, @Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
            this.f443278a = str;
            this.f443279b = i12;
            this.f443280c = i13;
            this.f443281d = str2;
            this.f443282e = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f443278a, iVar.f443278a) && this.f443279b == iVar.f443279b && this.f443280c == iVar.f443280c && L.f(this.f443281d, iVar.f443281d) && L.f(this.f443282e, iVar.f443282e);
        }

        public final int hashCode() {
            return this.f443282e.hashCode() + H.d(androidx.appcompat.app.r.e(this.f443280c, androidx.appcompat.app.r.e(this.f443279b, this.f443278a.hashCode() * 31, 31), 31), 31, this.f443281d);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenImageEditor(fieldName=");
            sb2.append(this.f443278a);
            sb2.append(", minWidth=");
            sb2.append(this.f443279b);
            sb2.append(", minHeight=");
            sb2.append(this.f443280c);
            sb2.append(", warningDialogTitle=");
            sb2.append(this.f443281d);
            sb2.append(", warningDialogBody=");
            return C22026a.c(sb2, this.f443282e, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$j;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443283a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f443284b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final AttributedText f443285c;

        public j(@Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText) {
            this.f443283a = str;
            this.f443284b = str2;
            this.f443285c = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            jVar.getClass();
            return L.f(this.f443283a, jVar.f443283a) && L.f(this.f443284b, jVar.f443284b) && this.f443285c.equals(jVar.f443285c);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + com.avito.android.actions_sheet.a.b(H.d(H.d(Integer.hashCode(0) * 31, 31, this.f443283a), 31, this.f443284b), 961, this.f443285c);
        }

        @Y61.k
        public final String toString() {
            return "OpenLandlinePhoneVerificationStatusScreen(callId=0, title=" + this.f443283a + ", subtitle=" + this.f443284b + ", description=" + this.f443285c + ", phone=, isManual=true)";
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$k;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PersonalLinkEditConfig f443286a;

        public k(@Y61.k PersonalLinkEditConfig personalLinkEditConfig) {
            this.f443286a = personalLinkEditConfig;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f443286a, ((k) obj).f443286a);
        }

        public final int hashCode() {
            return this.f443286a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenPersonalLinkEditScreen(editorConfig=" + this.f443286a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$l;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ExtendedProfileSelectionCreateConfig f443287a;

        public l(@Y61.k ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig) {
            this.f443287a = extendedProfileSelectionCreateConfig;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f443287a, ((l) obj).f443287a);
        }

        public final int hashCode() {
            return this.f443287a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenSelectionCreateScreen(config=" + this.f443287a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$m;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.m$m, reason: collision with other inner class name */
    public static final /* data */ class C12912m implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SelectItem f443288a;

        public C12912m(@Y61.k SelectItem selectItem) {
            this.f443288a = selectItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12912m) && L.f(this.f443288a, ((C12912m) obj).f443288a);
        }

        public final int hashCode() {
            return this.f443288a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenSelector(item=" + this.f443288a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$n;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443289a;

        public n(@Y61.k String str) {
            this.f443289a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            nVar.getClass();
            return L.f(null, null) && L.f(this.f443289a, nVar.f443289a);
        }

        public final int hashCode() {
            return this.f443289a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenShareDialog(title=null, url="), this.f443289a, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$o;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AboutItem f443290a;

        public o(@Y61.k AboutItem aboutItem) {
            this.f443290a = aboutItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f443290a, ((o) obj).f443290a);
        }

        public final int hashCode() {
            return this.f443290a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenTextFieldEditor(item=" + this.f443290a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$p;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443291a;

        /* renamed from: b, reason: collision with root package name */
        public final int f443292b;

        public p(@Y61.k String str, int i12) {
            this.f443291a = str;
            this.f443292b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return L.f(this.f443291a, pVar.f443291a) && this.f443292b == pVar.f443292b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f443292b) + (this.f443291a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PickImages(fieldName=");
            sb2.append(this.f443291a);
            sb2.append(", maxPhotoCount=");
            return androidx.appcompat.app.r.t(sb2, this.f443292b, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc0/m$q;", "Lyc0/m;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class q implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final q f443293a = new q();
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$r;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<String> f443294a;

        public r(@Y61.k List<String> list) {
            this.f443294a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && L.f(this.f443294a, ((r) obj).f443294a);
        }

        public final int hashCode() {
            return this.f443294a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("ScrollToWidgets(widgetsToScroll="), this.f443294a, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$s;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f443295a;

        public s(@Y61.k Throwable th2) {
            this.f443295a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s) {
                return L.f(this.f443295a, ((s) obj).f443295a) && L.f(null, null);
            }
            return false;
        }

        public final int hashCode() {
            return this.f443295a.hashCode() * 31;
        }

        @Y61.k
        public final String toString() {
            return "ShowCommonErrorToastBar(throwable=" + this.f443295a + ", buttonAction=null)";
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$t;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443296a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f443297b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f443298c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f443299d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final InterfaceC50219c.C12909c f443300e;

        public t(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k InterfaceC50219c.C12909c c12909c) {
            this.f443296a = str;
            this.f443297b = str2;
            this.f443298c = str3;
            this.f443299d = str4;
            this.f443300e = c12909c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return L.f(this.f443296a, tVar.f443296a) && L.f(this.f443297b, tVar.f443297b) && L.f(this.f443298c, tVar.f443298c) && L.f(this.f443299d, tVar.f443299d) && this.f443300e.equals(tVar.f443300e);
        }

        public final int hashCode() {
            return this.f443300e.hashCode() + H.d(H.d(H.d(this.f443296a.hashCode() * 31, 31, this.f443297b), 31, this.f443298c), 31, this.f443299d);
        }

        @Y61.k
        public final String toString() {
            return "ShowDialogEvent(title=" + this.f443296a + ", message=" + this.f443297b + ", primaryButtonText=" + this.f443298c + ", secondaryButtonText=" + this.f443299d + ", action=" + this.f443300e + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$u;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class u implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final GalleryImageItem f443301a;

        /* renamed from: b, reason: collision with root package name */
        public final int f443302b;

        /* renamed from: c, reason: collision with root package name */
        public final int f443303c;

        /* renamed from: d, reason: collision with root package name */
        public final int f443304d;

        /* renamed from: e, reason: collision with root package name */
        public final int f443305e;

        public u(@Y61.k GalleryImageItem galleryImageItem, int i12, int i13, int i14, int i15) {
            this.f443301a = galleryImageItem;
            this.f443302b = i12;
            this.f443303c = i13;
            this.f443304d = i14;
            this.f443305e = i15;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return L.f(this.f443301a, uVar.f443301a) && this.f443302b == uVar.f443302b && this.f443303c == uVar.f443303c && this.f443304d == uVar.f443304d && this.f443305e == uVar.f443305e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f443305e) + androidx.appcompat.app.r.e(this.f443304d, androidx.appcompat.app.r.e(this.f443303c, androidx.appcompat.app.r.e(this.f443302b, this.f443301a.hashCode() * 31, 31), 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowGalleryImagePlaceholder(item=");
            sb2.append(this.f443301a);
            sb2.append(", x=");
            sb2.append(this.f443302b);
            sb2.append(", y=");
            sb2.append(this.f443303c);
            sb2.append(", width=");
            sb2.append(this.f443304d);
            sb2.append(", height=");
            return androidx.appcompat.app.r.t(sb2, this.f443305e, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$v;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class v implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkEditItem f443306a;

        public v(@Y61.k LinkEditItem linkEditItem) {
            this.f443306a = linkEditItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && L.f(this.f443306a, ((v) obj).f443306a);
        }

        public final int hashCode() {
            return this.f443306a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowLinkEditActionsBottomMenu(item=" + this.f443306a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$w;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class w implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443307a;

        public w(@Y61.k String str) {
            this.f443307a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && L.f(this.f443307a, ((w) obj).f443307a);
        }

        public final int hashCode() {
            return this.f443307a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowScreenByJson(beduinJson="), this.f443307a, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$x;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class x implements m {

        /* renamed from: a, reason: collision with root package name */
        public final int f443308a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BasicInfoV2Item.Onboarding f443309b;

        public x(int i12, @Y61.k BasicInfoV2Item.Onboarding onboarding) {
            this.f443308a = i12;
            this.f443309b = onboarding;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return this.f443308a == xVar.f443308a && L.f(this.f443309b, xVar.f443309b);
        }

        public final int hashCode() {
            return this.f443309b.hashCode() + (Integer.hashCode(this.f443308a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowSellerTypeOnboarding(targetViewId=" + this.f443308a + ", onboarding=" + this.f443309b + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$y;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class y implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SettingItem f443310a;

        public y(@Y61.k SettingItem settingItem) {
            this.f443310a = settingItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && L.f(this.f443310a, ((y) obj).f443310a);
        }

        public final int hashCode() {
            return this.f443310a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowSettingActionsBottomMenu(item=" + this.f443310a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/m$z;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class z implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443311a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f443312b;

        public z(@Y61.k String str, boolean z12) {
            this.f443311a = str;
            this.f443312b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return L.f(this.f443311a, zVar.f443311a) && this.f443312b == zVar.f443312b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f443312b) + (this.f443311a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowToastBar(message=");
            sb2.append(this.f443311a);
            sb2.append(", isError=");
            return androidx.appcompat.app.r.x(sb2, this.f443312b, ')');
        }

        public /* synthetic */ z(String str, boolean z12, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? false : z12);
        }
    }
}

package ky;

import android.net.Uri;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.edit_seller_type.EditSellerTypeResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditBasicInfoAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lky/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lky/a$a;", "Lky/a$b;", "Lky/a$c;", "Lky/a$d;", "Lky/a$e;", "Lky/a$f;", "Lky/a$g;", "Lky/a$h;", "Lky/a$i;", "Lky/a$j;", "Lky/a$k;", "Lky/a$l;", "Lky/a$m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ky.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC43512a {

    /* compiled from: EditBasicInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lky/a$a;", "Lky/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11765a implements InterfaceC43512a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f413299a;

        public C11765a(@Y61.k Uri uri) {
            this.f413299a = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11765a) && L.f(this.f413299a, ((C11765a) obj).f413299a);
        }

        public final int hashCode() {
            return this.f413299a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("AvatarSelected(uri="), this.f413299a, ')');
        }
    }

    /* compiled from: EditBasicInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lky/a$b;", "Lky/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.a$b */
    public static final /* data */ class b implements InterfaceC43512a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f413300a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2130613555;
        }

        @Y61.k
        public final String toString() {
            return "CloseActionsBottomMenu";
        }
    }

    /* compiled from: EditBasicInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lky/a$c;", "Lky/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.a$c */
    public static final /* data */ class c implements InterfaceC43512a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f413301a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 273585977;
        }

        @Y61.k
        public final String toString() {
            return "DeleteAvatarImage";
        }
    }

    /* compiled from: EditBasicInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lky/a$d;", "Lky/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.a$d */
    public static final /* data */ class d implements InterfaceC43512a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f413302a;

        public d(@Y61.k String str) {
            this.f413302a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f413302a, ((d) obj).f413302a);
        }

        public final int hashCode() {
            return this.f413302a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("NameInputText(text="), this.f413302a, ')');
        }
    }

    /* compiled from: EditBasicInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lky/a$e;", "Lky/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.a$e */
    public static final /* data */ class e implements InterfaceC43512a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f413303a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1676516131;
        }

        @Y61.k
        public final String toString() {
            return "OnActionButtonClick";
        }
    }

    /* compiled from: EditBasicInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lky/a$f;", "Lky/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.a$f */
    public static final /* data */ class f implements InterfaceC43512a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f413304a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1988051890;
        }

        @Y61.k
        public final String toString() {
            return "OnAvatarClick";
        }
    }

    /* compiled from: EditBasicInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lky/a$g;", "Lky/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.a$g */
    public static final /* data */ class g implements InterfaceC43512a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final EditSellerTypeResult f413305a;

        public g(@Y61.k EditSellerTypeResult editSellerTypeResult) {
            this.f413305a = editSellerTypeResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f413305a, ((g) obj).f413305a);
        }

        public final int hashCode() {
            return this.f413305a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnSellerTypeChanged(result=" + this.f413305a + ')';
        }
    }

    /* compiled from: EditBasicInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lky/a$h;", "Lky/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.a$h */
    public static final /* data */ class h implements InterfaceC43512a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f413306a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 298788537;
        }

        @Y61.k
        public final String toString() {
            return "OnSpecificClick";
        }
    }

    /* compiled from: EditBasicInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lky/a$i;", "Lky/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.a$i */
    public static final /* data */ class i implements InterfaceC43512a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f413307a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -2118520075;
        }

        @Y61.k
        public final String toString() {
            return "OnVerticalClick";
        }
    }

    /* compiled from: EditBasicInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lky/a$j;", "Lky/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.a$j */
    public static final /* data */ class j implements InterfaceC43512a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f413308a;

        public j(@Y61.k String str) {
            this.f413308a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f413308a, ((j) obj).f413308a);
        }

        public final int hashCode() {
            return this.f413308a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("PersonalLinkInputText(text="), this.f413308a, ')');
        }
    }

    /* compiled from: EditBasicInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lky/a$k;", "Lky/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.a$k */
    public static final /* data */ class k implements InterfaceC43512a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f413309a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 110227601;
        }

        @Y61.k
        public final String toString() {
            return "SellerTypeClick";
        }
    }

    /* compiled from: EditBasicInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lky/a$l;", "Lky/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.a$l */
    public static final /* data */ class l implements InterfaceC43512a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f413310a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 2030845951;
        }

        @Y61.k
        public final String toString() {
            return "SellerTypeWasShown";
        }
    }

    /* compiled from: EditBasicInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lky/a$m;", "Lky/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.a$m */
    public static final /* data */ class m implements InterfaceC43512a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f413311a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 868530512;
        }

        @Y61.k
        public final String toString() {
            return "UploadAvatarClick";
        }
    }
}

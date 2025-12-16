package B90;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileTabWidgetComposite.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LB90/b;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "a", "b", "c", "d", "LB90/b$b;", "LB90/b$c;", "LB90/b$d;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface b extends ProfileTabWidget {

    /* compiled from: ProfileTabWidgetComposite.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB90/b$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @l
        /* renamed from: getType */
        String getF956a();
    }

    /* compiled from: ProfileTabWidgetComposite.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LB90/b$b;", "LB90/b;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: B90.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0038b implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f933a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f934b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f935c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f936d;

        /* compiled from: ProfileTabWidgetComposite.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LB90/b$b$a;", "LB90/b$a;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: B90.b$b$a */
        public static final /* data */ class a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f937a;

            /* renamed from: b, reason: collision with root package name */
            public final long f938b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final DeepLink f939c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final C0039a f940d;

            /* compiled from: ProfileTabWidgetComposite.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB90/b$b$a$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: B90.b$b$a$a, reason: collision with other inner class name */
            public static final /* data */ class C0039a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f941a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f942b;

                public C0039a(@k String str, @k String str2) {
                    this.f941a = str;
                    this.f942b = str2;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0039a)) {
                        return false;
                    }
                    C0039a c0039a = (C0039a) obj;
                    return L.f(this.f941a, c0039a.f941a) && L.f(this.f942b, c0039a.f942b);
                }

                public final int hashCode() {
                    return this.f942b.hashCode() + (this.f941a.hashCode() * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Value(icon=");
                    sb2.append(this.f941a);
                    sb2.append(", title=");
                    return C22026a.c(sb2, this.f942b, ')');
                }
            }

            public a(@k String str, long j12, @k DeepLink deepLink, @k C0039a c0039a) {
                this.f937a = str;
                this.f938b = j12;
                this.f939c = deepLink;
                this.f940d = c0039a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f937a, aVar.f937a) && this.f938b == aVar.f938b && L.f(this.f939c, aVar.f939c) && L.f(this.f940d, aVar.f940d);
            }

            @Override // B90.b.a
            @k
            /* renamed from: getType, reason: from getter */
            public final String getF956a() {
                return this.f937a;
            }

            public final int hashCode() {
                return this.f940d.hashCode() + com.avito.android.actions_sheet.a.e(this.f939c, r.g(this.f937a.hashCode() * 31, 31, this.f938b), 31);
            }

            @k
            public final String toString() {
                return "Component(type=" + this.f937a + ", notificationsCount=" + this.f938b + ", uri=" + this.f939c + ", value=" + this.f940d + ')';
            }
        }

        public C0038b(@l DeepLink deepLink, @l String str, @l String str2, @k ArrayList arrayList) {
            this.f933a = str;
            this.f934b = str2;
            this.f935c = deepLink;
            this.f936d = arrayList;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @k
        /* renamed from: a */
        public final String getF222828a() {
            String str = this.f933a;
            return str == null ? "" : str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0038b)) {
                return false;
            }
            C0038b c0038b = (C0038b) obj;
            return L.f(this.f933a, c0038b.f933a) && L.f(this.f934b, c0038b.f934b) && L.f(this.f935c, c0038b.f935c) && this.f936d.equals(c0038b.f936d);
        }

        @Override // B90.b
        @k
        public final List<a> getItems() {
            return this.f936d;
        }

        public final int hashCode() {
            String str = this.f933a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f934b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.f935c;
            return this.f936d.hashCode() + ((iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Grid(id=");
            sb2.append(this.f933a);
            sb2.append(", title=");
            sb2.append(this.f934b);
            sb2.append(", uri=");
            sb2.append(this.f935c);
            sb2.append(", items=");
            return e.p(sb2, this.f936d, ')');
        }
    }

    /* compiled from: ProfileTabWidgetComposite.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LB90/b$c;", "LB90/b;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f943a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f944b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f945c;

        /* compiled from: ProfileTabWidgetComposite.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB90/b$c$a;", "LB90/b$a;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f946a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final AttributedText f947b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f948c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f949d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final DeepLink f950e;

            public a(@l String str, @l String str2, @l DeepLink deepLink, @l String str3, @l AttributedText attributedText) {
                this.f946a = str;
                this.f947b = attributedText;
                this.f948c = str2;
                this.f949d = str3;
                this.f950e = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f946a, aVar.f946a) && L.f(this.f947b, aVar.f947b) && L.f(this.f948c, aVar.f948c) && L.f(this.f949d, aVar.f949d) && L.f(this.f950e, aVar.f950e);
            }

            @Override // B90.b.a
            @l
            /* renamed from: getType, reason: from getter */
            public final String getF956a() {
                return this.f946a;
            }

            public final int hashCode() {
                String str = this.f946a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                AttributedText attributedText = this.f947b;
                int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                String str2 = this.f948c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f949d;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                DeepLink deepLink = this.f950e;
                return iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Item(type=");
                sb2.append(this.f946a);
                sb2.append(", value=");
                sb2.append(this.f947b);
                sb2.append(", notificationsCount=");
                sb2.append(this.f948c);
                sb2.append(", badgeText=");
                sb2.append(this.f949d);
                sb2.append(", uri=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f950e, ')');
            }
        }

        public c(@l String str, @l String str2, @k ArrayList arrayList) {
            this.f943a = str;
            this.f944b = str2;
            this.f945c = arrayList;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @k
        /* renamed from: a */
        public final String getF971a() {
            String str = this.f944b;
            return str == null ? "" : str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f943a, cVar.f943a) && L.f(this.f944b, cVar.f944b) && this.f945c.equals(cVar.f945c);
        }

        @Override // B90.b
        @k
        public final List<a> getItems() {
            return this.f945c;
        }

        public final int hashCode() {
            String str = this.f943a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f944b;
            return this.f945c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Group(title=");
            sb2.append(this.f943a);
            sb2.append(", id=");
            sb2.append(this.f944b);
            sb2.append(", items=");
            return e.p(sb2, this.f945c, ')');
        }
    }

    /* compiled from: ProfileTabWidgetComposite.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LB90/b$d;", "LB90/b;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f951a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f952b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f953c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f954d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ArrayList f955e;

        /* compiled from: ProfileTabWidgetComposite.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LB90/b$d$a;", "LB90/b$a;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f956a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final DeepLink f957b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final C0040a f958c;

            /* compiled from: ProfileTabWidgetComposite.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB90/b$d$a$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: B90.b$d$a$a, reason: collision with other inner class name */
            public static final /* data */ class C0040a {

                /* renamed from: a, reason: collision with root package name */
                @l
                public final String f959a;

                /* renamed from: b, reason: collision with root package name */
                @l
                public final UniversalImage f960b;

                /* renamed from: c, reason: collision with root package name */
                @l
                public final String f961c;

                public C0040a(@l UniversalImage universalImage, @l String str, @l String str2) {
                    this.f959a = str;
                    this.f960b = universalImage;
                    this.f961c = str2;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0040a)) {
                        return false;
                    }
                    C0040a c0040a = (C0040a) obj;
                    return L.f(this.f959a, c0040a.f959a) && L.f(this.f960b, c0040a.f960b) && L.f(this.f961c, c0040a.f961c);
                }

                public final int hashCode() {
                    String str = this.f959a;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    UniversalImage universalImage = this.f960b;
                    int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
                    String str2 = this.f961c;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Value(description=");
                    sb2.append(this.f959a);
                    sb2.append(", img=");
                    sb2.append(this.f960b);
                    sb2.append(", title=");
                    return C22026a.c(sb2, this.f961c, ')');
                }
            }

            public a(@k String str, @l DeepLink deepLink, @k C0040a c0040a) {
                this.f956a = str;
                this.f957b = deepLink;
                this.f958c = c0040a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f956a, aVar.f956a) && L.f(this.f957b, aVar.f957b) && L.f(this.f958c, aVar.f958c);
            }

            @Override // B90.b.a
            @k
            /* renamed from: getType, reason: from getter */
            public final String getF956a() {
                return this.f956a;
            }

            public final int hashCode() {
                int iHashCode = this.f956a.hashCode() * 31;
                DeepLink deepLink = this.f957b;
                return this.f958c.hashCode() + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
            }

            @k
            public final String toString() {
                return "Item(type=" + this.f956a + ", uri=" + this.f957b + ", value=" + this.f958c + ')';
            }
        }

        public d(@l DeepLink deepLink, @l String str, @l String str2, @l String str3, @k ArrayList arrayList) {
            this.f951a = str;
            this.f952b = str2;
            this.f953c = deepLink;
            this.f954d = str3;
            this.f955e = arrayList;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @k
        /* renamed from: a */
        public final String getF971a() {
            String str = this.f951a;
            return str == null ? "" : str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f951a, dVar.f951a) && L.f(this.f952b, dVar.f952b) && L.f(this.f953c, dVar.f953c) && L.f(this.f954d, dVar.f954d) && this.f955e.equals(dVar.f955e);
        }

        @Override // B90.b
        @k
        public final List<a> getItems() {
            return this.f955e;
        }

        public final int hashCode() {
            String str = this.f951a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f952b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.f953c;
            int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            String str3 = this.f954d;
            return this.f955e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WidgetsGroup(type=");
            sb2.append(this.f951a);
            sb2.append(", title=");
            sb2.append(this.f952b);
            sb2.append(", uri=");
            sb2.append(this.f953c);
            sb2.append(", badgeText=");
            sb2.append(this.f954d);
            sb2.append(", items=");
            return e.p(sb2, this.f955e, ')');
        }
    }

    @k
    List<a> getItems();
}

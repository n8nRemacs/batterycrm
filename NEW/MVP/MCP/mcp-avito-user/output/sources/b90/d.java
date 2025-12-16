package B90;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileTabWidgetEmployee.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LB90/d;", "Lcom/avito/android/profile/pro/impl/interactor/model/ProfileTabWidget;", "a", "b", "c", "LB90/d$a;", "LB90/d$b;", "LB90/d$c;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface d extends ProfileTabWidget {

    /* compiled from: ProfileTabWidgetEmployee.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LB90/d$a;", "LB90/d;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f962a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f963b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final C0041a f964c;

        /* compiled from: ProfileTabWidgetEmployee.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB90/d$a$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: B90.d$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0041a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f965a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Image f966b;

            public C0041a(@l String str, @l Image image) {
                this.f965a = str;
                this.f966b = image;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0041a)) {
                    return false;
                }
                C0041a c0041a = (C0041a) obj;
                return L.f(this.f965a, c0041a.f965a) && L.f(this.f966b, c0041a.f966b);
            }

            public final int hashCode() {
                String str = this.f965a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Image image = this.f966b;
                return iHashCode + (image != null ? image.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Avatar(defaultImage=");
                sb2.append(this.f965a);
                sb2.append(", image=");
                return AK.c.o(sb2, this.f966b, ')');
            }
        }

        public a(@k String str, @k String str2, @l C0041a c0041a) {
            this.f962a = str;
            this.f963b = str2;
            this.f964c = c0041a;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @k
        /* renamed from: a, reason: from getter */
        public final String getF222828a() {
            return this.f962a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f962a, aVar.f962a) && L.f(this.f963b, aVar.f963b) && L.f(this.f964c, aVar.f964c);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f962a.hashCode() * 31, 31, this.f963b);
            C0041a c0041a = this.f964c;
            return iD2 + (c0041a == null ? 0 : c0041a.hashCode());
        }

        @k
        public final String toString() {
            return "Company(analyticsType=" + this.f962a + ", title=" + this.f963b + ", companyAvatar=" + this.f964c + ')';
        }
    }

    /* compiled from: ProfileTabWidgetEmployee.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LB90/d$b;", "LB90/d;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f967a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ArrayList f968b;

        /* compiled from: ProfileTabWidgetEmployee.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB90/d$b$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f969a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f970b;

            public a(@k String str, @k String str2) {
                this.f969a = str;
                this.f970b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f969a, aVar.f969a) && L.f(this.f970b, aVar.f970b);
            }

            public final int hashCode() {
                return this.f970b.hashCode() + (this.f969a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Limit(header=");
                sb2.append(this.f969a);
                sb2.append(", value=");
                return C22026a.c(sb2, this.f970b, ')');
            }
        }

        public b(@k String str, @l ArrayList arrayList) {
            this.f967a = str;
            this.f968b = arrayList;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @k
        /* renamed from: a, reason: from getter */
        public final String getF222828a() {
            return this.f967a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f967a, bVar.f967a) && this.f968b.equals(bVar.f968b);
        }

        public final int hashCode() {
            return this.f968b.hashCode() + (this.f967a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Limits(analyticsType=");
            sb2.append(this.f967a);
            sb2.append(", limits=");
            return e.p(sb2, this.f968b, ')');
        }
    }

    /* compiled from: ProfileTabWidgetEmployee.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB90/d$c;", "LB90/d;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f971a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f972b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f973c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f974d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final AttributedText f975e;

        public c(@k AttributedText attributedText, @k String str, @k String str2, @k String str3, boolean z12) {
            this.f971a = str;
            this.f972b = z12;
            this.f973c = str2;
            this.f974d = str3;
            this.f975e = attributedText;
        }

        @Override // com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget
        @k
        /* renamed from: a, reason: from getter */
        public final String getF222828a() {
            return this.f971a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f971a, cVar.f971a) && this.f972b == cVar.f972b && L.f(this.f973c, cVar.f973c) && L.f(this.f974d, cVar.f974d) && L.f(this.f975e, cVar.f975e);
        }

        public final int hashCode() {
            return this.f975e.hashCode() + H.d(H.d(r.i(this.f971a.hashCode() * 31, 31, this.f972b), 31, this.f973c), 31, this.f974d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ModeButton(analyticsType=");
            sb2.append(this.f971a);
            sb2.append(", isOnEmployeeMode=");
            sb2.append(this.f972b);
            sb2.append(", title=");
            sb2.append(this.f973c);
            sb2.append(", subtitle=");
            sb2.append(this.f974d);
            sb2.append(", icon=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f975e, ')');
        }
    }
}

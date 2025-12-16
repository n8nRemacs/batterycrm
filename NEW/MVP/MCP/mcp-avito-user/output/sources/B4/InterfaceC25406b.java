package b4;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IcebreakersEditorInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lb4/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Lb4/b$a;", "Lb4/b$b;", "Lb4/b$c;", "Lb4/b$d;", "Lb4/b$e;", "Lb4/b$f;", "Lb4/b$g;", "Lb4/b$h;", "Lb4/b$i;", "Lb4/b$j;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b4.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC25406b {

    /* compiled from: IcebreakersEditorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb4/b$a;", "Lb4/b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.b$a */
    public static final /* data */ class a implements InterfaceC25406b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f56869a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 558442514;
        }

        @k
        public final String toString() {
            return "BottomSheetEditorClosed";
        }
    }

    /* compiled from: IcebreakersEditorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb4/b$b;", "Lb4/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1990b implements InterfaceC25406b {

        /* renamed from: a, reason: collision with root package name */
        public final int f56870a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f56871b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f56872c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f56873d;

        public C1990b(int i12, @l Long l12, @l String str, boolean z12) {
            this.f56870a = i12;
            this.f56871b = l12;
            this.f56872c = str;
            this.f56873d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1990b)) {
                return false;
            }
            C1990b c1990b = (C1990b) obj;
            return this.f56870a == c1990b.f56870a && L.f(this.f56871b, c1990b.f56871b) && L.f(this.f56872c, c1990b.f56872c) && this.f56873d == c1990b.f56873d;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f56870a) * 31;
            Long l12 = this.f56871b;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str = this.f56872c;
            return Boolean.hashCode(this.f56873d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetEditorOpened(title=");
            sb2.append(this.f56870a);
            sb2.append(", icebreakerId=");
            sb2.append(this.f56871b);
            sb2.append(", icebreakerText=");
            sb2.append(this.f56872c);
            sb2.append(", isOpenForEdit=");
            return r.x(sb2, this.f56873d, ')');
        }
    }

    /* compiled from: IcebreakersEditorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb4/b$c;", "Lb4/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.b$c */
    public static final /* data */ class c implements InterfaceC25406b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f56874a;

        public c(@k String str) {
            this.f56874a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f56874a, ((c) obj).f56874a);
        }

        public final int hashCode() {
            return this.f56874a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("BottomSheetInputTextEdited(icebreakerText="), this.f56874a, ')');
        }
    }

    /* compiled from: IcebreakersEditorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb4/b$d;", "Lb4/b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.b$d */
    public static final /* data */ class d implements InterfaceC25406b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f56875a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 755622967;
        }

        @k
        public final String toString() {
            return "CloseIcebreakerEditorScreen";
        }
    }

    /* compiled from: IcebreakersEditorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb4/b$e;", "Lb4/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.b$e */
    public static final /* data */ class e implements InterfaceC25406b {

        /* renamed from: a, reason: collision with root package name */
        public final long f56876a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f56877b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f56878c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Uri f56879d;

        public e(long j12, @k String str, @l String str2, @l Uri uri) {
            this.f56876a = j12;
            this.f56877b = str;
            this.f56878c = str2;
            this.f56879d = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f56876a == eVar.f56876a && L.f(this.f56877b, eVar.f56877b) && L.f(this.f56878c, eVar.f56878c) && L.f(this.f56879d, eVar.f56879d);
        }

        public final int hashCode() {
            int iD2 = H.d(Long.hashCode(this.f56876a) * 31, 31, this.f56877b);
            String str = this.f56878c;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            Uri uri = this.f56879d;
            return iHashCode + (uri != null ? uri.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IcebreakerAdded(newIcebreakerId=");
            sb2.append(this.f56876a);
            sb2.append(", newIcebreakerText=");
            sb2.append(this.f56877b);
            sb2.append(", newIcebreakerPreviewText=");
            sb2.append(this.f56878c);
            sb2.append(", newIcebreakerUri=");
            return com.avito.android.actions_sheet.a.t(sb2, this.f56879d, ')');
        }
    }

    /* compiled from: IcebreakersEditorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb4/b$f;", "Lb4/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.b$f */
    public static final /* data */ class f implements InterfaceC25406b {

        /* renamed from: a, reason: collision with root package name */
        public final long f56880a;

        public f(long j12) {
            this.f56880a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f56880a == ((f) obj).f56880a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f56880a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("IcebreakerDeleted(deletedIcebreakerId="), this.f56880a, ')');
        }
    }

    /* compiled from: IcebreakersEditorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb4/b$g;", "Lb4/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.b$g */
    public static final /* data */ class g implements InterfaceC25406b {

        /* renamed from: a, reason: collision with root package name */
        public final long f56881a;

        /* renamed from: b, reason: collision with root package name */
        public final long f56882b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f56883c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f56884d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Uri f56885e;

        public g(long j12, long j13, @k String str, @l String str2, @l Uri uri) {
            this.f56881a = j12;
            this.f56882b = j13;
            this.f56883c = str;
            this.f56884d = str2;
            this.f56885e = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f56881a == gVar.f56881a && this.f56882b == gVar.f56882b && L.f(this.f56883c, gVar.f56883c) && L.f(this.f56884d, gVar.f56884d) && L.f(this.f56885e, gVar.f56885e);
        }

        public final int hashCode() {
            int iD2 = H.d(r.g(Long.hashCode(this.f56881a) * 31, 31, this.f56882b), 31, this.f56883c);
            String str = this.f56884d;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            Uri uri = this.f56885e;
            return iHashCode + (uri != null ? uri.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IcebreakerEdited(oldIcebreakerId=");
            sb2.append(this.f56881a);
            sb2.append(", newIcebreakerId=");
            sb2.append(this.f56882b);
            sb2.append(", icebreakerText=");
            sb2.append(this.f56883c);
            sb2.append(", icebreakerPreviewText=");
            sb2.append(this.f56884d);
            sb2.append(", icebreakerUri=");
            return com.avito.android.actions_sheet.a.t(sb2, this.f56885e, ')');
        }
    }

    /* compiled from: IcebreakersEditorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb4/b$h;", "Lb4/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.b$h */
    public static final /* data */ class h implements InterfaceC25406b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            ((h) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0) + (Integer.hashCode(0) * 31);
        }

        @k
        public final String toString() {
            return "IcebreakersReordered(fromIndex=0, toIndex=0)";
        }
    }

    /* compiled from: IcebreakersEditorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb4/b$i;", "Lb4/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.b$i */
    public static final /* data */ class i implements InterfaceC25406b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f56886a;

        public i(@k ArrayList arrayList) {
            this.f56886a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f56886a.equals(((i) obj).f56886a);
        }

        public final int hashCode() {
            return this.f56886a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("InitIcebreakersListLoaded(icebreakersList="), this.f56886a, ')');
        }
    }

    /* compiled from: IcebreakersEditorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb4/b$j;", "Lb4/b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.b$j */
    public static final /* data */ class j implements InterfaceC25406b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final j f56887a = new j();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1424587477;
        }

        @k
        public final String toString() {
            return "NetworkError";
        }
    }
}

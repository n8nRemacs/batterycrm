package b4;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IcebreakersEditorAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lb4/a;", "", "a", "b", "c", "d", "e", "f", "g", "Lb4/a$a;", "Lb4/a$b;", "Lb4/a$c;", "Lb4/a$d;", "Lb4/a$e;", "Lb4/a$f;", "Lb4/a$g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC25405a {

    /* compiled from: IcebreakersEditorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb4/a$a;", "Lb4/a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1989a implements InterfaceC25405a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1989a f56858a = new C1989a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1989a);
        }

        public final int hashCode() {
            return 2087249084;
        }

        @k
        public final String toString() {
            return "BottomSheetClose";
        }
    }

    /* compiled from: IcebreakersEditorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb4/a$b;", "Lb4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.a$b */
    public static final /* data */ class b implements InterfaceC25405a {

        /* renamed from: a, reason: collision with root package name */
        public final int f56859a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f56860b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f56861c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f56862d;

        public b(int i12, @l Long l12, @l String str, boolean z12) {
            this.f56859a = i12;
            this.f56860b = l12;
            this.f56861c = str;
            this.f56862d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f56859a == bVar.f56859a && L.f(this.f56860b, bVar.f56860b) && L.f(this.f56861c, bVar.f56861c) && this.f56862d == bVar.f56862d;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f56859a) * 31;
            Long l12 = this.f56860b;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str = this.f56861c;
            return Boolean.hashCode(this.f56862d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetEditorOpen(title=");
            sb2.append(this.f56859a);
            sb2.append(", icebreakerId=");
            sb2.append(this.f56860b);
            sb2.append(", icebreakerText=");
            sb2.append(this.f56861c);
            sb2.append(", isOpenForEdit=");
            return r.x(sb2, this.f56862d, ')');
        }
    }

    /* compiled from: IcebreakersEditorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb4/a$c;", "Lb4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.a$c */
    public static final /* data */ class c implements InterfaceC25405a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Long f56863a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f56864b;

        public c(@l Long l12, @k String str) {
            this.f56863a = l12;
            this.f56864b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f56863a, cVar.f56863a) && L.f(this.f56864b, cVar.f56864b);
        }

        public final int hashCode() {
            Long l12 = this.f56863a;
            return this.f56864b.hashCode() + ((l12 == null ? 0 : l12.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetSaveClicked(icebreakerId=");
            sb2.append(this.f56863a);
            sb2.append(", icebreakerText=");
            return C22026a.c(sb2, this.f56864b, ')');
        }
    }

    /* compiled from: IcebreakersEditorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb4/a$d;", "Lb4/a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.a$d */
    public static final /* data */ class d implements InterfaceC25405a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f56865a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -498134886;
        }

        @k
        public final String toString() {
            return "CloseIcebreakerEditorScreen";
        }
    }

    /* compiled from: IcebreakersEditorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb4/a$e;", "Lb4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.a$e */
    public static final /* data */ class e implements InterfaceC25405a {

        /* renamed from: a, reason: collision with root package name */
        public final long f56866a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f56867b;

        public e(long j12, @k String str) {
            this.f56866a = j12;
            this.f56867b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f56866a == eVar.f56866a && L.f(this.f56867b, eVar.f56867b);
        }

        public final int hashCode() {
            return this.f56867b.hashCode() + (Long.hashCode(this.f56866a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeleteIcebreaker(icebreakerId=");
            sb2.append(this.f56866a);
            sb2.append(", icebreakerText=");
            return C22026a.c(sb2, this.f56867b, ')');
        }
    }

    /* compiled from: IcebreakersEditorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb4/a$f;", "Lb4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.a$f */
    public static final /* data */ class f implements InterfaceC25405a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f56868a;

        public f(@k String str) {
            this.f56868a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f56868a, ((f) obj).f56868a);
        }

        public final int hashCode() {
            return this.f56868a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("IcebreakerTextChanged(icebreakerText="), this.f56868a, ')');
        }
    }

    /* compiled from: IcebreakersEditorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb4/a$g;", "Lb4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.a$g */
    public static final /* data */ class g implements InterfaceC25405a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0) + (Integer.hashCode(0) * 31);
        }

        @k
        public final String toString() {
            return "ReorderIcebreakers(fromIndex=0, toIndex=0)";
        }
    }
}

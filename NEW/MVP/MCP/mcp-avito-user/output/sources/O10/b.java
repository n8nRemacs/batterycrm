package O10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageCategoryContent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LO10/b;", "", "a", "b", "c", "LO10/b$a;", "LO10/b$b;", "LO10/b$c;", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: MortgageCategoryContent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LO10/b$a;", "LO10/b;", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final O10.c f11900a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UniversalImage f11901b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f11902c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f11903d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final O10.a f11904e;

        public a(@k O10.c cVar, @k UniversalImage universalImage, @k String str, @k String str2, @k O10.a aVar) {
            this.f11900a = cVar;
            this.f11901b = universalImage;
            this.f11902c = str;
            this.f11903d = str2;
            this.f11904e = aVar;
        }

        @Override // O10.b
        @k
        public final b L9(boolean z12) {
            O10.a aVarA = O10.a.a(this.f11904e, z12);
            return new a(this.f11900a, this.f11901b, this.f11902c, this.f11903d, aVarA);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f11900a, aVar.f11900a) && L.f(this.f11901b, aVar.f11901b) && L.f(this.f11902c, aVar.f11902c) && L.f(this.f11903d, aVar.f11903d) && L.f(this.f11904e, aVar.f11904e);
        }

        @Override // O10.b
        @k
        /* renamed from: getAction, reason: from getter */
        public final O10.a getF11914e() {
            return this.f11904e;
        }

        @Override // O10.b
        @k
        /* renamed from: getHeader, reason: from getter */
        public final O10.c getF11910a() {
            return this.f11900a;
        }

        public final int hashCode() {
            return this.f11904e.hashCode() + H.d(H.d(com.avito.android.actions_sheet.a.a(this.f11900a.hashCode() * 31, 31, this.f11901b), 31, this.f11902c), 31, this.f11903d);
        }

        @k
        public final String toString() {
            return "Archived(header=" + this.f11900a + ", image=" + this.f11901b + ", title=" + this.f11902c + ", subtitle=" + this.f11903d + ", action=" + this.f11904e + ')';
        }
    }

    /* compiled from: MortgageCategoryContent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LO10/b$b;", "LO10/b;", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: O10.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0773b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final O10.c f11905a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f11906b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<String> f11907c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f11908d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final O10.a f11909e;

        public C0773b(@k O10.c cVar, @k String str, @k List<String> list, @k String str2, @k O10.a aVar) {
            this.f11905a = cVar;
            this.f11906b = str;
            this.f11907c = list;
            this.f11908d = str2;
            this.f11909e = aVar;
        }

        @Override // O10.b
        @k
        public final b L9(boolean z12) {
            O10.a aVarA = O10.a.a(this.f11909e, z12);
            return new C0773b(this.f11905a, this.f11906b, this.f11907c, this.f11908d, aVarA);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0773b)) {
                return false;
            }
            C0773b c0773b = (C0773b) obj;
            return L.f(this.f11905a, c0773b.f11905a) && L.f(this.f11906b, c0773b.f11906b) && L.f(this.f11907c, c0773b.f11907c) && L.f(this.f11908d, c0773b.f11908d) && L.f(this.f11909e, c0773b.f11909e);
        }

        @Override // O10.b
        @k
        /* renamed from: getAction, reason: from getter */
        public final O10.a getF11914e() {
            return this.f11909e;
        }

        @Override // O10.b
        @k
        /* renamed from: getHeader, reason: from getter */
        public final O10.c getF11910a() {
            return this.f11905a;
        }

        public final int hashCode() {
            return this.f11909e.hashCode() + H.d(H.e(H.d(this.f11905a.hashCode() * 31, 31, this.f11906b), 31, this.f11907c), 31, this.f11908d);
        }

        @k
        public final String toString() {
            return "WithCalculation(header=" + this.f11905a + ", title=" + this.f11906b + ", banksIconsUrls=" + this.f11907c + ", terms=" + this.f11908d + ", action=" + this.f11909e + ')';
        }
    }

    /* compiled from: MortgageCategoryContent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LO10/b$c;", "LO10/b;", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final O10.c f11910a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UniversalImage f11911b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f11912c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f11913d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final O10.a f11914e;

        public c(@k O10.c cVar, @k UniversalImage universalImage, @k String str, @k String str2, @k O10.a aVar) {
            this.f11910a = cVar;
            this.f11911b = universalImage;
            this.f11912c = str;
            this.f11913d = str2;
            this.f11914e = aVar;
        }

        @Override // O10.b
        @k
        public final b L9(boolean z12) {
            O10.a aVarA = O10.a.a(this.f11914e, z12);
            return new c(this.f11910a, this.f11911b, this.f11912c, this.f11913d, aVarA);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f11910a, cVar.f11910a) && L.f(this.f11911b, cVar.f11911b) && L.f(this.f11912c, cVar.f11912c) && L.f(this.f11913d, cVar.f11913d) && L.f(this.f11914e, cVar.f11914e);
        }

        @Override // O10.b
        @k
        /* renamed from: getAction, reason: from getter */
        public final O10.a getF11914e() {
            return this.f11914e;
        }

        @Override // O10.b
        @k
        /* renamed from: getHeader, reason: from getter */
        public final O10.c getF11910a() {
            return this.f11910a;
        }

        public final int hashCode() {
            return this.f11914e.hashCode() + H.d(H.d(com.avito.android.actions_sheet.a.a(this.f11910a.hashCode() * 31, 31, this.f11911b), 31, this.f11912c), 31, this.f11913d);
        }

        @k
        public final String toString() {
            return "WithoutCalculation(header=" + this.f11910a + ", image=" + this.f11911b + ", title=" + this.f11912c + ", subtitle=" + this.f11913d + ", action=" + this.f11914e + ')';
        }
    }

    @k
    b L9(boolean z12);

    @k
    /* renamed from: getAction */
    O10.a getF11914e();

    @k
    /* renamed from: getHeader */
    O10.c getF11910a();
}

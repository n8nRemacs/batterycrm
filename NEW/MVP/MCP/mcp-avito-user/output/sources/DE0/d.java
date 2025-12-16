package De0;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VinScannerState.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"LDe0/d;", "", "a", "b", "c", "d", "e", "f", "LDe0/d$a;", "LDe0/d$b;", "LDe0/d$c;", "LDe0/d$d;", "LDe0/d$e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f3335a;

    /* compiled from: VinScannerState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDe0/d$a;", "LDe0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f3336b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f3337c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f3338d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f3339e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final f f3340f;

        public a(@l String str, @l String str2, @l String str3, @l String str4, @k f fVar) {
            super(fVar, null);
            this.f3336b = str;
            this.f3337c = str2;
            this.f3338d = str3;
            this.f3339e = str4;
            this.f3340f = fVar;
        }

        @Override // De0.d
        @k
        /* renamed from: a, reason: from getter */
        public final f getF3335a() {
            return this.f3340f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f3336b, aVar.f3336b) && L.f(this.f3337c, aVar.f3337c) && L.f(this.f3338d, aVar.f3338d) && L.f(this.f3339e, aVar.f3339e) && L.f(this.f3340f, aVar.f3340f);
        }

        public final int hashCode() {
            String str = this.f3336b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f3337c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f3338d;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f3339e;
            return this.f3340f.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            return "Error(errorMessage=" + this.f3336b + ", instructionButtonTitle=" + this.f3337c + ", retryButtonText=" + this.f3338d + ", skipButtonTitle=" + this.f3339e + ", viewState=" + this.f3340f + ')';
        }
    }

    /* compiled from: VinScannerState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDe0/d$b;", "LDe0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f3341b;

        public b(@k f fVar) {
            super(fVar, null);
            this.f3341b = fVar;
        }

        @Override // De0.d
        @k
        /* renamed from: a, reason: from getter */
        public final f getF3335a() {
            return this.f3341b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f3341b, ((b) obj).f3341b);
        }

        public final int hashCode() {
            return this.f3341b.hashCode();
        }

        @k
        public final String toString() {
            return "HideLoading(viewState=" + this.f3341b + ')';
        }
    }

    /* compiled from: VinScannerState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDe0/d$c;", "LDe0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f3342b;

        public c(@k f fVar) {
            super(fVar, null);
            this.f3342b = fVar;
        }

        @Override // De0.d
        @k
        /* renamed from: a, reason: from getter */
        public final f getF3335a() {
            return this.f3342b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f3342b, ((c) obj).f3342b);
        }

        public final int hashCode() {
            return this.f3342b.hashCode();
        }

        @k
        public final String toString() {
            return "Initial(viewState=" + this.f3342b + ')';
        }
    }

    /* compiled from: VinScannerState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDe0/d$d;", "LDe0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: De0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C0179d extends d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f3343b;

        public C0179d(@k f fVar) {
            super(fVar, null);
            this.f3343b = fVar;
        }

        @Override // De0.d
        @k
        /* renamed from: a, reason: from getter */
        public final f getF3335a() {
            return this.f3343b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0179d) && L.f(this.f3343b, ((C0179d) obj).f3343b);
        }

        public final int hashCode() {
            return this.f3343b.hashCode();
        }

        @k
        public final String toString() {
            return "Reset(viewState=" + this.f3343b + ')';
        }
    }

    /* compiled from: VinScannerState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDe0/d$e;", "LDe0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f3344b;

        public e(@k f fVar) {
            super(fVar, null);
            this.f3344b = fVar;
        }

        @Override // De0.d
        @k
        /* renamed from: a, reason: from getter */
        public final f getF3335a() {
            return this.f3344b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f3344b, ((e) obj).f3344b);
        }

        public final int hashCode() {
            return this.f3344b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowLoading(viewState=" + this.f3344b + ')';
        }
    }

    /* compiled from: VinScannerState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDe0/d$f;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f3345a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f3346b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f3347c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f3348d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f3349e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final Uri f3350f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f3351g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f3352h;

        public f(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @k Uri uri, boolean z12, boolean z13) {
            this.f3345a = str;
            this.f3346b = str2;
            this.f3347c = str3;
            this.f3348d = str4;
            this.f3349e = str5;
            this.f3350f = uri;
            this.f3351g = z12;
            this.f3352h = z13;
        }

        public static f a(f fVar, String str, Uri uri, boolean z12, boolean z13, int i12) {
            String str2 = fVar.f3345a;
            if ((i12 & 2) != 0) {
                str = fVar.f3346b;
            }
            String str3 = str;
            String str4 = fVar.f3347c;
            String str5 = fVar.f3348d;
            String str6 = fVar.f3349e;
            if ((i12 & 32) != 0) {
                uri = fVar.f3350f;
            }
            Uri uri2 = uri;
            if ((i12 & 64) != 0) {
                z12 = fVar.f3351g;
            }
            boolean z14 = z12;
            if ((i12 & 128) != 0) {
                z13 = fVar.f3352h;
            }
            fVar.getClass();
            return new f(str2, str3, str4, str5, str6, uri2, z14, z13);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f3345a, fVar.f3345a) && L.f(this.f3346b, fVar.f3346b) && L.f(this.f3347c, fVar.f3347c) && L.f(this.f3348d, fVar.f3348d) && L.f(this.f3349e, fVar.f3349e) && L.f(this.f3350f, fVar.f3350f) && this.f3351g == fVar.f3351g && this.f3352h == fVar.f3352h;
        }

        public final int hashCode() {
            String str = this.f3345a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f3346b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f3347c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f3348d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f3349e;
            return Boolean.hashCode(this.f3352h) + r.i(m.e(this.f3350f, (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31, 31), 31, this.f3351g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VinScannerViewState(helpDescription=");
            sb2.append(this.f3345a);
            sb2.append(", scannerDescription=");
            sb2.append(this.f3346b);
            sb2.append(", permissionTitle=");
            sb2.append(this.f3347c);
            sb2.append(", permissionDescription=");
            sb2.append(this.f3348d);
            sb2.append(", skipButtonTitle=");
            sb2.append(this.f3349e);
            sb2.append(", uriPreview=");
            sb2.append(this.f3350f);
            sb2.append(", manualButtonHasError=");
            sb2.append(this.f3351g);
            sb2.append(", isTakeShotButtonAvailable=");
            return r.x(sb2, this.f3352h, ')');
        }
    }

    public d(f fVar, C42822w c42822w) {
        this.f3335a = fVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public f getF3335a() {
        return this.f3335a;
    }
}

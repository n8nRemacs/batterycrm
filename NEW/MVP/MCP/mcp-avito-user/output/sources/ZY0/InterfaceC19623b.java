package Zy0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrInsuranceOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LZy0/b;", "", "a", "b", "c", "d", "e", "LZy0/b$a;", "LZy0/b$b;", "LZy0/b$c;", "LZy0/b$d;", "LZy0/b$e;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zy0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC19623b {

    /* compiled from: StrInsuranceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZy0/b$a;", "LZy0/b;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zy0.b$a */
    public static final /* data */ class a implements InterfaceC19623b {

        /* renamed from: a, reason: collision with root package name */
        public final int f20600a;

        public a(int i12) {
            this.f20600a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f20600a == ((a) obj).f20600a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f20600a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("CloseScreen(resultCode="), this.f20600a, ')');
        }
    }

    /* compiled from: StrInsuranceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZy0/b$b;", "LZy0/b;", "<init>", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zy0.b$b, reason: collision with other inner class name */
    public static final class C1474b implements InterfaceC19623b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1474b f20601a = new C1474b();
    }

    /* compiled from: StrInsuranceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZy0/b$c;", "LZy0/b;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zy0.b$c */
    public static final /* data */ class c implements InterfaceC19623b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f20602a;

        public c(@k DeepLink deepLink) {
            this.f20602a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f20602a, ((c) obj).f20602a);
        }

        public final int hashCode() {
            return this.f20602a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f20602a, ')');
        }
    }

    /* compiled from: StrInsuranceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZy0/b$d;", "LZy0/b;", "<init>", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zy0.b$d */
    public static final class d implements InterfaceC19623b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f20603a = new d();
    }

    /* compiled from: StrInsuranceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZy0/b$e;", "LZy0/b;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zy0.b$e */
    public static final /* data */ class e implements InterfaceC19623b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f20604a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f20605b;

        public e(@k ApiError apiError, @k String str) {
            this.f20604a = str;
            this.f20605b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f20604a, eVar.f20604a) && L.f(this.f20605b, eVar.f20605b);
        }

        public final int hashCode() {
            return this.f20605b.hashCode() + (this.f20604a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(message=");
            sb2.append(this.f20604a);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f20605b, ')');
        }
    }
}

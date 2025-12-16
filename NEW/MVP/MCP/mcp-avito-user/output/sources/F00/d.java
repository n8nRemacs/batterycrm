package f00;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DocumentUploadState.kt */
@F3
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lf00/d;", "", "a", "c", "Lf00/d$a;", "Lf00/d$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d {

    /* compiled from: DocumentUploadState.kt */
    @F3
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf00/d$a;", "Lf00/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f395563a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f395564b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f395565c;

        /* renamed from: d, reason: collision with root package name */
        public final int f395566d;

        /* renamed from: e, reason: collision with root package name */
        public final int f395567e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f395568f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final AttributedText f395569g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final String f395570h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f395571i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final String f395572j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f395573k;

        public a(@k ArrayList arrayList, boolean z12, @k String str, int i12, int i13, @k String str2, @k AttributedText attributedText, @k String str3, boolean z13, @l String str4) {
            this.f395563a = arrayList;
            this.f395564b = z12;
            this.f395565c = str;
            this.f395566d = i12;
            this.f395567e = i13;
            this.f395568f = str2;
            this.f395569g = attributedText;
            this.f395570h = str3;
            this.f395571i = z13;
            this.f395572j = str4;
            this.f395573k = str4 != null;
        }

        @Override // f00.d
        public final boolean a() {
            return this.f395566d > 1;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f395563a.equals(aVar.f395563a) && this.f395564b == aVar.f395564b && L.f(this.f395565c, aVar.f395565c) && this.f395566d == aVar.f395566d && this.f395567e == aVar.f395567e && L.f(this.f395568f, aVar.f395568f) && L.f(this.f395569g, aVar.f395569g) && L.f(this.f395570h, aVar.f395570h) && this.f395571i == aVar.f395571i && L.f(this.f395572j, aVar.f395572j);
        }

        public final int hashCode() {
            int i12 = r.i(H.d(com.avito.android.actions_sheet.a.b(H.d(r.e(this.f395567e, r.e(this.f395566d, H.d(r.i(this.f395563a.hashCode() * 31, 31, this.f395564b), 31, this.f395565c), 31), 31), 31, this.f395568f), 31, this.f395569g), 31, this.f395570h), 31, this.f395571i);
            String str = this.f395572j;
            return i12 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(documents=");
            sb2.append(this.f395563a);
            sb2.append(", isLoading=");
            sb2.append(this.f395564b);
            sb2.append(", name=");
            sb2.append(this.f395565c);
            sb2.append(", screenNumber=");
            sb2.append(this.f395566d);
            sb2.append(", screensCount=");
            sb2.append(this.f395567e);
            sb2.append(", title=");
            sb2.append(this.f395568f);
            sb2.append(", description=");
            sb2.append(this.f395569g);
            sb2.append(", fileLimits=");
            sb2.append(this.f395570h);
            sb2.append(", canSubmit=");
            sb2.append(this.f395571i);
            sb2.append(", error=");
            return C22026a.c(sb2, this.f395572j, ')');
        }
    }

    /* compiled from: DocumentUploadState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: DocumentUploadState.kt */
    @F3
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf00/d$c;", "Lf00/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395574a;

        /* renamed from: b, reason: collision with root package name */
        public final int f395575b;

        /* renamed from: c, reason: collision with root package name */
        public final int f395576c;

        public c(@k String str, int i12, int i13) {
            this.f395574a = str;
            this.f395575b = i12;
            this.f395576c = i13;
        }

        @Override // f00.d
        public final boolean a() {
            return this.f395575b > 1;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f395574a, cVar.f395574a) && this.f395575b == cVar.f395575b && this.f395576c == cVar.f395576c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f395576c) + r.e(this.f395575b, this.f395574a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loading(name=");
            sb2.append(this.f395574a);
            sb2.append(", screenNumber=");
            sb2.append(this.f395575b);
            sb2.append(", screensCount=");
            return r.t(sb2, this.f395576c, ')');
        }
    }

    boolean a();
}

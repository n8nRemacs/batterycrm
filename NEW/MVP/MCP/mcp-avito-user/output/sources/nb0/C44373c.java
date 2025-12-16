package nb0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddPhoneState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lnb0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nb0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C44373c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f415212d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C44373c f415213e = new C44373c(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f415214b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f415215c;

    /* compiled from: AddPhoneState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnb0/c$a;", "", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nb0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C44373c() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44373c)) {
            return false;
        }
        C44373c c44373c = (C44373c) obj;
        return this.f415214b == c44373c.f415214b && L.f(this.f415215c, c44373c.f415215c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f415214b) * 31;
        String str = this.f415215c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddPhoneState(buttonLoading=");
        sb2.append(this.f415214b);
        sb2.append(", errorMessage=");
        return C22026a.c(sb2, this.f415215c, ')');
    }

    public /* synthetic */ C44373c(boolean z12, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : str);
    }

    public C44373c(boolean z12, @l String str) {
        this.f415214b = z12;
        this.f415215c = str;
    }
}

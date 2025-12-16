package mp;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CommentState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lmp/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mp.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C44116d extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f414758e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f414759b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f414760c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f414761d;

    /* compiled from: CommentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmp/d$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mp.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44116d(boolean z12, @k String str, @l String str2) {
        this.f414759b = z12;
        this.f414760c = str;
        this.f414761d = str2;
    }

    public static C44116d a(C44116d c44116d, boolean z12, String str, int i12) {
        if ((i12 & 1) != 0) {
            z12 = c44116d.f414759b;
        }
        String str2 = c44116d.f414760c;
        if ((i12 & 4) != 0) {
            str = c44116d.f414761d;
        }
        c44116d.getClass();
        return new C44116d(z12, str2, str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44116d)) {
            return false;
        }
        C44116d c44116d = (C44116d) obj;
        return this.f414759b == c44116d.f414759b && L.f(this.f414760c, c44116d.f414760c) && L.f(this.f414761d, c44116d.f414761d);
    }

    public final int hashCode() {
        int iD2 = H.d(Boolean.hashCode(this.f414759b) * 31, 31, this.f414760c);
        String str = this.f414761d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommentState(isLoading=");
        sb2.append(this.f414759b);
        sb2.append(", dealId=");
        sb2.append(this.f414760c);
        sb2.append(", comment=");
        return C22026a.c(sb2, this.f414761d, ')');
    }
}

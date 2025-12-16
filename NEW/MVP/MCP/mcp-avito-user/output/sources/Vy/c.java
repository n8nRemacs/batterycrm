package VY;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BottomSheetInputState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LVY/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f17191d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final c f17192e = new c(false, false);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17193b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17194c;

    /* compiled from: BottomSheetInputState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVY/c$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(boolean z12, boolean z13) {
        this.f17193b = z12;
        this.f17194c = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f17193b == cVar.f17193b && this.f17194c == cVar.f17194c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17194c) + (Boolean.hashCode(this.f17193b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BottomSheetInputState(isButtonEnabled=");
        sb2.append(this.f17193b);
        sb2.append(", isLoadingVisible=");
        return r.x(sb2, this.f17194c, ')');
    }
}

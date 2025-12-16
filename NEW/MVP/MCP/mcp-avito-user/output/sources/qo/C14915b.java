package Qo;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.code_check.phone_list.adapter.PhoneListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneListState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LQo/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qo.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14915b extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f14010c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<PhoneListItem> f14011b;

    /* compiled from: PhoneListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQo/b$a;", "", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qo.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14915b(@k List<? extends PhoneListItem> list) {
        this.f14011b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14915b) && L.f(this.f14011b, ((C14915b) obj).f14011b);
    }

    public final int hashCode() {
        return this.f14011b.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("PhoneListState(filteredPhones="), this.f14011b, ')');
    }
}

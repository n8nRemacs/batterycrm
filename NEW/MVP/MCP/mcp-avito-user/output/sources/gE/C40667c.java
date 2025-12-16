package ge;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmEmailListState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lge/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ge.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C40667c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f396649d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f396650b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f396651c;

    /* compiled from: ConfirmEmailListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lge/c$a;", "", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ge.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40667c(@k ArrayList arrayList, boolean z12) {
        this.f396650b = arrayList;
        this.f396651c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40667c)) {
            return false;
        }
        C40667c c40667c = (C40667c) obj;
        return L.f(this.f396650b, c40667c.f396650b) && this.f396651c == c40667c.f396651c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f396651c) + (this.f396650b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmEmailListState(emails=");
        sb2.append(this.f396650b);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f396651c, ')');
    }
}

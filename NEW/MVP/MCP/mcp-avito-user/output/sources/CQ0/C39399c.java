package cq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GroupClearanceState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcq0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cq0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C39399c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f392964g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C39399c f392965h = new C39399c(null, C42784z0.f406748b, true, 0.5f, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final com.avito.android.select.group_clearance_select.a f392966b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f392967c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f392968d;

    /* renamed from: e, reason: collision with root package name */
    public final float f392969e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f392970f;

    /* compiled from: GroupClearanceState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcq0/c$a;", "", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cq0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C39399c(@l com.avito.android.select.group_clearance_select.a aVar, @k List<? extends com.avito.android.select.group_clearance_select.a> list, boolean z12, float f12, boolean z13) {
        this.f392966b = aVar;
        this.f392967c = list;
        this.f392968d = z12;
        this.f392969e = f12;
        this.f392970f = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39399c)) {
            return false;
        }
        C39399c c39399c = (C39399c) obj;
        return L.f(this.f392966b, c39399c.f392966b) && L.f(this.f392967c, c39399c.f392967c) && this.f392968d == c39399c.f392968d && Float.compare(this.f392969e, c39399c.f392969e) == 0 && this.f392970f == c39399c.f392970f;
    }

    public final int hashCode() {
        com.avito.android.select.group_clearance_select.a aVar = this.f392966b;
        return Boolean.hashCode(this.f392970f) + r.d(this.f392969e, r.i(C23088b.a((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f392967c), 31, this.f392968d), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupClearanceState(clearanceSelected=");
        sb2.append(this.f392966b);
        sb2.append(", clearanceList=");
        sb2.append(this.f392967c);
        sb2.append(", isClearButtonEnabled=");
        sb2.append(this.f392968d);
        sb2.append(", valueForAnimation=");
        sb2.append(this.f392969e);
        sb2.append(", isGodzillaTriggered=");
        return r.x(sb2, this.f392970f, ')');
    }
}

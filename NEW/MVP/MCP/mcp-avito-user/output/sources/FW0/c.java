package Fw0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.silent_update.permissions.mvi.entity.RequestState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PermissionsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LFw0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f6038c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final c f6039d = new c(RequestState.f283737b);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RequestState f6040b;

    /* compiled from: PermissionsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFw0/c$a;", "", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k RequestState requestState) {
        this.f6040b = requestState;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f6040b == ((c) obj).f6040b;
    }

    public final int hashCode() {
        return this.f6040b.hashCode();
    }

    @k
    public final String toString() {
        return "PermissionsState(requestState=" + this.f6040b + ')';
    }
}

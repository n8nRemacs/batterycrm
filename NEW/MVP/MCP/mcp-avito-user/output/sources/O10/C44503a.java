package o10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SignState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lo10/a;", "", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C44503a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C12155a f419291b = new C12155a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C44503a f419292c = new C44503a(C42784z0.f406748b);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f419293a;

    /* compiled from: SignState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo10/a$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o10.a$a, reason: collision with other inner class name */
    public static final class C12155a {
        public /* synthetic */ C12155a(C42822w c42822w) {
            this();
        }

        public C12155a() {
        }
    }

    public C44503a(@k List<? extends com.avito.android.mortgage.sign.draw.b> list) {
        this.f419293a = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44503a) && L.f(this.f419293a, ((C44503a) obj).f419293a);
    }

    public final int hashCode() {
        return this.f419293a.hashCode();
    }

    @k
    public final String toString() {
        return H.n(new StringBuilder("DrawState(elements="), this.f419293a, ')');
    }
}

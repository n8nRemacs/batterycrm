package Hn0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.ReasonRds;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RdsOrderCancellationReasonsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LHn0/b;", "", "a", "b", "c", "LHn0/b$a;", "LHn0/b$b;", "LHn0/b$c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: RdsOrderCancellationReasonsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHn0/b$a;", "LHn0/b;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f7699a = new a();
    }

    /* compiled from: RdsOrderCancellationReasonsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHn0/b$b;", "LHn0/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hn0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0437b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ReasonRds f7700a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7701b;

        public C0437b(@k ReasonRds reasonRds, int i12) {
            this.f7700a = reasonRds;
            this.f7701b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0437b)) {
                return false;
            }
            C0437b c0437b = (C0437b) obj;
            return L.f(this.f7700a, c0437b.f7700a) && this.f7701b == c0437b.f7701b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f7701b) + (this.f7700a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenReasonDetails(reasonItem=");
            sb2.append(this.f7700a);
            sb2.append(", commentMaxLength=");
            return r.t(sb2, this.f7701b, ')');
        }
    }

    /* compiled from: RdsOrderCancellationReasonsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHn0/b$c;", "LHn0/b;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f7702a = new c();
    }
}

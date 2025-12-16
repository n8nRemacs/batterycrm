package mp;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommentState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lmp/e;", "", "a", "b", "Lmp/e$a;", "Lmp/e$b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mp.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44117e {

    /* compiled from: CommentState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmp/e$a;", "Lmp/e;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mp.e$a */
    public static final /* data */ class a implements InterfaceC44117e {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f414762a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f414763b;

        public a(@l String str, boolean z12) {
            this.f414762a = str;
            this.f414763b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f414762a, aVar.f414762a) && this.f414763b == aVar.f414763b;
        }

        public final int hashCode() {
            String str = this.f414762a;
            return Boolean.hashCode(this.f414763b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(comment=");
            sb2.append(this.f414762a);
            sb2.append(", readyForSave=");
            return r.x(sb2, this.f414763b, ')');
        }
    }

    /* compiled from: CommentState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmp/e$b;", "Lmp/e;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mp.e$b */
    public static final /* data */ class b implements InterfaceC44117e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f414764a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1501133173;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}

package SU0;

import androidx.compose.runtime.C22026a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ParamEntry.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LSU0/o;", "", "<init>", "()V", "a", "b", "LSU0/o$a;", "LSU0/o$b;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class o {

    /* compiled from: ParamEntry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSU0/o$a;", "LSU0/o;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String[] f15028a;

        public a(@Y61.k String[] strArr) {
            super(null);
            this.f15028a = strArr;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return Arrays.equals(this.f15028a, ((a) obj).f15028a);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f15028a);
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("StringArrayValue(value="), Arrays.toString(this.f15028a), ')');
        }
    }

    /* compiled from: ParamEntry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSU0/o$b;", "LSU0/o;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f15029a;

        public b(@Y61.k String str) {
            super(null);
            this.f15029a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f15029a, ((b) obj).f15029a);
        }

        public final int hashCode() {
            return this.f15029a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("StringValue(value="), this.f15029a, ')');
        }
    }

    public /* synthetic */ o(C42822w c42822w) {
        this();
    }

    public o() {
    }
}

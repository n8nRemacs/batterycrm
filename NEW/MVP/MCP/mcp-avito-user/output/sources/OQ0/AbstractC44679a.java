package oQ0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LoQ0/a;", "", "<init>", "()V", "a", "b", "LoQ0/a$a;", "LoQ0/a$b;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oQ0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC44679a {

    /* compiled from: GigAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoQ0/a$a;", "LoQ0/a;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oQ0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12187a extends AbstractC44679a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f419760a;

        public C12187a(@k DeepLink deepLink) {
            super(null);
            this.f419760a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12187a) && L.f(this.f419760a, ((C12187a) obj).f419760a);
        }

        public final int hashCode() {
            return this.f419760a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ButtonClick(deeplink="), this.f419760a, ')');
        }
    }

    /* compiled from: GigAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoQ0/a$b;", "LoQ0/a;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oQ0.a$b */
    public static final /* data */ class b extends AbstractC44679a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f419761a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -487433438;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ AbstractC44679a(C42822w c42822w) {
        this();
    }

    public AbstractC44679a() {
    }
}

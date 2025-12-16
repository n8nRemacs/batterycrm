package GE;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeesMethodsV2Action.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LGE/a;", "", "a", "b", "c", "d", "e", "LGE/a$a;", "LGE/a$b;", "LGE/a$c;", "LGE/a$d;", "LGE/a$e;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {

    /* compiled from: FeesMethodsV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGE/a$a;", "LGE/a;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: GE.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0333a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0333a f6379a = new C0333a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0333a);
        }

        public final int hashCode() {
            return -185436167;
        }

        @k
        public final String toString() {
            return "BackPressed";
        }
    }

    /* compiled from: FeesMethodsV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGE/a$b;", "LGE/a;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f6380a;

        public b(@k DeepLink deepLink) {
            this.f6380a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f6380a, ((b) obj).f6380a);
        }

        public final int hashCode() {
            return this.f6380a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeepLinkClicked(deeplink="), this.f6380a, ')');
        }
    }

    /* compiled from: FeesMethodsV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGE/a$c;", "LGE/a;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f6381a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f6382b;

        public c(@k DeepLink deepLink, @k String str) {
            this.f6381a = deepLink;
            this.f6382b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f6381a, cVar.f6381a) && L.f(this.f6382b, cVar.f6382b);
        }

        public final int hashCode() {
            return this.f6382b.hashCode() + (this.f6381a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FeesMethodClicked(deeplink=");
            sb2.append(this.f6381a);
            sb2.append(", feesMethodId=");
            return C22026a.c(sb2, this.f6382b, ')');
        }
    }

    /* compiled from: FeesMethodsV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGE/a$d;", "LGE/a;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f6383a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 876678723;
        }

        @k
        public final String toString() {
            return "Help";
        }
    }

    /* compiled from: FeesMethodsV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGE/a$e;", "LGE/a;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f6384a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -280568679;
        }

        @k
        public final String toString() {
            return "Refresh";
        }
    }
}

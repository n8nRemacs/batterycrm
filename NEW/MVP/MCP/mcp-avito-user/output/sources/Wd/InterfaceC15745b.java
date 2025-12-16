package Wd;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.util.J;
import java.security.MessageDigest;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import kotlin.text.C43066x;

/* compiled from: TrackerUID.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LWd/b;", "", "a", "b", "LWd/b$a;", "LWd/b$b;", "_avito_auth-tracker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wd.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC15745b {

    /* compiled from: TrackerUID.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LWd/b$a;", "LWd/b;", "a", "_avito_auth-tracker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wd.b$a */
    public static final /* data */ class a implements InterfaceC15745b {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C1277a f17990c = new C1277a(null);

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17991a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f17992b;

        /* compiled from: TrackerUID.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWd/b$a$a;", "", "<init>", "()V", "_avito_auth-tracker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Wd.b$a$a, reason: collision with other inner class name */
        public static final class C1277a {
            public /* synthetic */ C1277a(C42822w c42822w) {
                this();
            }

            @k
            public static a a(@k C1278b c1278b, @l String str) {
                String string;
                String str2 = c1278b.f17994a;
                if (str != null) {
                    StringBuilder sb2 = new StringBuilder();
                    a.f17990c.getClass();
                    sb2.append(J.a(MessageDigest.getInstance("SHA-256").digest(str.getBytes(C43047d.f410589b))));
                    sb2.append('.');
                    sb2.append(str2);
                    string = sb2.toString();
                } else {
                    string = null;
                }
                return new a(str2, string);
            }

            public C1277a() {
            }
        }

        public a(@k String str, @l String str2) {
            this.f17991a = str;
            this.f17992b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f17991a, aVar.f17991a) && L.f(this.f17992b, aVar.f17992b);
        }

        public final int hashCode() {
            int iHashCode = this.f17991a.hashCode() * 31;
            String str = this.f17992b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PostAuth(id=");
            sb2.append(this.f17991a);
            sb2.append(", idWithUserHash=");
            return C22026a.c(sb2, this.f17992b, ')');
        }
    }

    /* compiled from: TrackerUID.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LWd/b$b;", "LWd/b;", "<init>", "()V", "a", "_avito_auth-tracker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wd.b$b, reason: collision with other inner class name */
    public static final class C1278b implements InterfaceC15745b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f17993b = new a(null);

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17994a;

        /* compiled from: TrackerUID.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWd/b$b$a;", "", "<init>", "()V", "_avito_auth-tracker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Wd.b$b$a */
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public C1278b() {
            f17993b.getClass();
            List listF0 = C43066x.f0(UUID.randomUUID().toString(), new String[]{"-"}, 0, 6);
            this.f17994a = ((String) C42745f0.E(listF0)) + ((String) C42745f0.Q(listF0));
        }
    }
}

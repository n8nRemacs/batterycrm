package Lz;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.esiasdk.android.data.network.model.ClientSessionInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EsiaSdkOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LLz/c;", "", "<init>", "()V", "a", "b", "c", "LLz/c$a;", "LLz/c$b;", "LLz/c$c;", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lz.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC14459c {

    /* compiled from: EsiaSdkOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLz/c$a;", "LLz/c;", "<init>", "()V", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lz.c$a */
    public static final /* data */ class a extends AbstractC14459c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f10324a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 335008533;
        }

        @k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: EsiaSdkOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLz/c$b;", "LLz/c;", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lz.c$b */
    public static final /* data */ class b extends AbstractC14459c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ClientSessionInfo f10325a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f10326b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f10327c;

        public b(@k ClientSessionInfo clientSessionInfo, @k String str, @k String str2) {
            super(null);
            this.f10325a = clientSessionInfo;
            this.f10326b = str;
            this.f10327c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f10325a, bVar.f10325a) && L.f(this.f10326b, bVar.f10326b) && L.f(this.f10327c, bVar.f10327c);
        }

        public final int hashCode() {
            return this.f10327c.hashCode() + H.d(this.f10325a.hashCode() * 31, 31, this.f10326b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSdk(clientSessionInfo=");
            sb2.append(this.f10325a);
            sb2.append(", permissions=");
            sb2.append(this.f10326b);
            sb2.append(", apiUrl=");
            return C22026a.c(sb2, this.f10327c, ')');
        }
    }

    /* compiled from: EsiaSdkOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLz/c$c;", "LLz/c;", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lz.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0654c extends AbstractC14459c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10328a;

        public C0654c(@k String str) {
            super(null);
            this.f10328a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0654c) && L.f(this.f10328a, ((C0654c) obj).f10328a);
        }

        public final int hashCode() {
            return this.f10328a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SendSdkErrorAnalyticsEvent(errorResponse="), this.f10328a, ')');
        }
    }

    public /* synthetic */ AbstractC14459c(C42822w c42822w) {
        this();
    }

    public AbstractC14459c() {
    }
}

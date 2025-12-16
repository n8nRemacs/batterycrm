package Gn0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.remote.model.ReasonRds;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FbsEntryPointOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LGn0/b;", "", "a", "b", "c", "LGn0/b$a;", "LGn0/b$b;", "LGn0/b$c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: FbsEntryPointOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGn0/b$a;", "LGn0/b;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f6730a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1707172462;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: FbsEntryPointOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGn0/b$b;", "LGn0/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gn0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0370b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinUniversalPageLink f6731a;

        public C0370b(@k BeduinUniversalPageLink beduinUniversalPageLink) {
            this.f6731a = beduinUniversalPageLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0370b) && this.f6731a.equals(((C0370b) obj).f6731a);
        }

        public final int hashCode() {
            return this.f6731a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleDeeplink(deeplink=" + this.f6731a + ')';
        }
    }

    /* compiled from: FbsEntryPointOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGn0/b$c;", "LGn0/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6732a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReasonRds f6733b;

        public c(@k ReasonRds reasonRds, @k String str) {
            this.f6732a = str;
            this.f6733b = reasonRds;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f6732a, cVar.f6732a) && L.f(this.f6733b, cVar.f6733b);
        }

        public final int hashCode() {
            return this.f6733b.hashCode() + (this.f6732a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ScreenShown(orderId=" + this.f6732a + ", reasonRds=" + this.f6733b + ')';
        }
    }
}

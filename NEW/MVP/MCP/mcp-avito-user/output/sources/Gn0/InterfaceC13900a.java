package Gn0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import kotlin.Metadata;

/* compiled from: FbsEntryPointAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LGn0/a;", "", "a", "b", "LGn0/a$a;", "LGn0/a$b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Gn0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13900a {

    /* compiled from: FbsEntryPointAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGn0/a$a;", "LGn0/a;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gn0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0369a implements InterfaceC13900a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0369a f6728a = new C0369a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0369a);
        }

        public final int hashCode() {
            return -1148422911;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: FbsEntryPointAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGn0/a$b;", "LGn0/a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gn0.a$b */
    public static final /* data */ class b implements InterfaceC13900a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinUniversalPageLink f6729a;

        public b(@k BeduinUniversalPageLink beduinUniversalPageLink) {
            this.f6729a = beduinUniversalPageLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f6729a.equals(((b) obj).f6729a);
        }

        public final int hashCode() {
            return this.f6729a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleDeeplink(deeplink=" + this.f6729a + ')';
        }
    }
}

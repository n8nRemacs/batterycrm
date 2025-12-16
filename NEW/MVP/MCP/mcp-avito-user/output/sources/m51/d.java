package m51;

import Y61.k;
import Y61.l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JvmMemberSignature.kt */
/* loaded from: classes8.dex */
public abstract class d {

    /* compiled from: JvmMemberSignature.kt */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f414315a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f414316b;

        public a(@k String str, @k String str2) {
            super(null);
            this.f414315a = str;
            this.f414316b = str2;
        }

        @Override // m51.d
        @k
        public final String a() {
            return this.f414315a + ':' + this.f414316b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f414315a, aVar.f414315a) && L.f(this.f414316b, aVar.f414316b);
        }

        public final int hashCode() {
            return this.f414316b.hashCode() + (this.f414315a.hashCode() * 31);
        }
    }

    /* compiled from: JvmMemberSignature.kt */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f414317a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f414318b;

        public b(@k String str, @k String str2) {
            super(null);
            this.f414317a = str;
            this.f414318b = str2;
        }

        @Override // m51.d
        @k
        public final String a() {
            return this.f414317a + this.f414318b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f414317a, bVar.f414317a) && L.f(this.f414318b, bVar.f414318b);
        }

        public final int hashCode() {
            return this.f414318b.hashCode() + (this.f414317a.hashCode() * 31);
        }
    }

    public /* synthetic */ d(C42822w c42822w) {
        this();
    }

    @k
    public abstract String a();

    @k
    public final String toString() {
        return a();
    }

    public d() {
    }
}

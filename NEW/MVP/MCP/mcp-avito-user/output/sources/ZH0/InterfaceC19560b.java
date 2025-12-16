package Zh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import ci0.C27200b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckerboardState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LZh0/b;", "", "a", "b", "c", "LZh0/b$a;", "LZh0/b$b;", "LZh0/b$c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zh0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC19560b {

    /* compiled from: CheckerboardState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/b$a;", "LZh0/b;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.b$a */
    public static final /* data */ class a implements InterfaceC19560b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f20416a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -564468019;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: CheckerboardState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/b$b;", "LZh0/b;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1458b implements InterfaceC19560b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f20417a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20418b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<C27200b> f20419c;

        public C1458b(@k String str, int i12, @k List<C27200b> list) {
            this.f20417a = str;
            this.f20418b = i12;
            this.f20419c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1458b)) {
                return false;
            }
            C1458b c1458b = (C1458b) obj;
            return L.f(this.f20417a, c1458b.f20417a) && this.f20418b == c1458b.f20418b && L.f(this.f20419c, c1458b.f20419c);
        }

        public final int hashCode() {
            return this.f20419c.hashCode() + r.e(this.f20418b, this.f20417a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(section=");
            sb2.append(this.f20417a);
            sb2.append(", matchingObjectsCount=");
            sb2.append(this.f20418b);
            sb2.append(", floors=");
            return H.p(sb2, this.f20419c, ')');
        }
    }

    /* compiled from: CheckerboardState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/b$c;", "LZh0/b;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.b$c */
    public static final /* data */ class c implements InterfaceC19560b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f20420a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 527751361;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}

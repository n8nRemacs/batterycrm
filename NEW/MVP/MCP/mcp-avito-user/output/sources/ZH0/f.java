package Zh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: CheckerboardState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LZh0/f;", "", "a", "b", "c", "LZh0/f$a;", "LZh0/f$b;", "LZh0/f$c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface f {

    /* compiled from: CheckerboardState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/f$a;", "LZh0/f;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f20475a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 792231538;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: CheckerboardState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/f$b;", "LZh0/f;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f20476a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20477b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f20478c;

        /* renamed from: d, reason: collision with root package name */
        public final long f20479d;

        public b(@k ArrayList arrayList, boolean z12, boolean z13, long j12) {
            this.f20476a = arrayList;
            this.f20477b = z12;
            this.f20478c = z13;
            this.f20479d = j12;
        }

        public static b a(b bVar, boolean z12) {
            ArrayList arrayList = bVar.f20476a;
            boolean z13 = bVar.f20478c;
            long j12 = bVar.f20479d;
            bVar.getClass();
            return new b(arrayList, z12, z13, j12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f20476a.equals(bVar.f20476a) && this.f20477b == bVar.f20477b && this.f20478c == bVar.f20478c && this.f20479d == bVar.f20479d;
        }

        public final int hashCode() {
            return Long.hashCode(this.f20479d) + r.i(r.i(this.f20476a.hashCode() * 31, 31, this.f20477b), 31, this.f20478c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(list=");
            sb2.append(this.f20476a);
            sb2.append(", loadingNewPage=");
            sb2.append(this.f20477b);
            sb2.append(", canLoadMore=");
            sb2.append(this.f20478c);
            sb2.append(", lastLoadedPage=");
            return r.u(sb2, this.f20479d, ')');
        }
    }

    /* compiled from: CheckerboardState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/f$c;", "LZh0/f;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f20480a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1354032346;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}

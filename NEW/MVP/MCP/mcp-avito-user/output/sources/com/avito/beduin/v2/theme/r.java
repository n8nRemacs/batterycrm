package com.avito.beduin.v2.theme;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ThemeColor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/theme/r;", "", "a", "b", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class r {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f338365d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f338366a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f338367b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f338368c;

    /* compiled from: ThemeColor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/theme/r$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ThemeColor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<String> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return r.this.f338366a;
        }
    }

    /* compiled from: ThemeColor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<String> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return r.this.f338367b;
        }
    }

    public r(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        this.f338366a = str;
        this.f338367b = str2;
        this.f338368c = str3;
    }

    @Y61.k
    public final String a(boolean z12) {
        String str = this.f338368c;
        return str != null ? str : z12 ? this.f338367b : this.f338366a;
    }

    @Y61.k
    public final r b(@Y61.k f<b> fVar) {
        if (fVar.isEmpty()) {
            return this;
        }
        b bVar = fVar.get();
        String strC = bVar.f338369a.c(new c());
        String strC2 = bVar.f338370b.c(new d());
        String strA = bVar.f338371c.a();
        if (strA == null) {
            strA = this.f338368c;
        }
        return new r(strC, strC2, strA);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.f338366a, rVar.f338366a) && L.f(this.f338367b, rVar.f338367b) && L.f(this.f338368c, rVar.f338368c);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f338366a.hashCode() * 31, 31, this.f338367b);
        String str = this.f338368c;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThemeColor(light=");
        sb2.append(this.f338366a);
        sb2.append(", dark=");
        sb2.append(this.f338367b);
        sb2.append(", token=");
        return C22026a.c(sb2, this.f338368c, ')');
    }

    /* compiled from: ThemeColor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/theme/r$b;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final f<String> f338369a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final f<String> f338370b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final f<String> f338371c;

        /* compiled from: ThemeColor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/theme/r$b$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        public b(@Y61.k f<String> fVar, @Y61.k f<String> fVar2, @Y61.k f<String> fVar3) {
            this.f338369a = fVar;
            this.f338370b = fVar2;
            this.f338371c = fVar3;
        }

        @Y61.k
        public final f<String> a(boolean z12) {
            f<String> fVar = this.f338371c;
            return !fVar.isEmpty() ? fVar : z12 ? this.f338370b : this.f338369a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f338369a, bVar.f338369a) && L.f(this.f338370b, bVar.f338370b) && L.f(this.f338371c, bVar.f338371c);
        }

        public final int hashCode() {
            return this.f338371c.hashCode() + C31685o.f(this.f338370b, this.f338369a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Patch(light=");
            sb2.append(this.f338369a);
            sb2.append(", dark=");
            sb2.append(this.f338370b);
            sb2.append(", token=");
            return C31685o.o(sb2, this.f338371c, ')');
        }

        public /* synthetic */ b(f fVar, f fVar2, f fVar3, int i12, C42822w c42822w) {
            this(fVar, fVar2, (i12 & 4) != 0 ? new g() : fVar3);
        }
    }

    public /* synthetic */ r(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3);
    }
}

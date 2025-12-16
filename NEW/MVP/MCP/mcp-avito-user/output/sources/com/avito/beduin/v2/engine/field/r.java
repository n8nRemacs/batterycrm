package com.avito.beduin.v2.engine.field;

import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: Field.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/r;", "", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f336879a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q f336880b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f336881c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f336882d;

    /* compiled from: Field.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/r$a;", "", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final C10441a f336883c = new C10441a(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f336884a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f336885b;

        /* compiled from: Field.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/r$a$a;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.engine.field.r$a$a, reason: collision with other inner class name */
        public static final class C10441a {
            public /* synthetic */ C10441a(C42822w c42822w) {
                this();
            }

            public C10441a() {
            }
        }

        public a(@Y61.k String str, boolean z12) {
            this.f336884a = str;
            this.f336885b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f336884a, aVar.f336884a) && this.f336885b == aVar.f336885b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f336885b) + (this.f336884a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Node(name=");
            sb2.append(this.f336884a);
            sb2.append(", isNullable=");
            return androidx.appcompat.app.r.x(sb2, this.f336885b, ')');
        }
    }

    public r(@Y61.k String str) {
        this.f336879a = str;
        List listF0 = C43066x.f0(str, new String[]{"."}, 0, 6);
        a.C10441a c10441a = a.f336883c;
        String str2 = (String) listF0.get(0);
        c10441a.getClass();
        boolean z12 = C43066x.L(str2) == '?';
        q qVar = new q(z12 ? C43066x.y(1, str2) : str2);
        this.f336880b = qVar;
        this.f336881c = new a(qVar.f336877b, z12);
        List<String> listW = C42745f0.w(listF0, 1);
        ArrayList arrayList = new ArrayList(C42745f0.q(listW, 10));
        for (String strY : listW) {
            a.f336883c.getClass();
            boolean z13 = C43066x.L(strY) == '?';
            if (z13) {
                strY = C43066x.y(1, strY);
            }
            arrayList.add(new a(strY, z13));
        }
        this.f336882d = arrayList;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && L.f(this.f336879a, ((r) obj).f336879a);
    }

    public final int hashCode() {
        return this.f336879a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("RefPath(full="), this.f336879a, ')');
    }
}

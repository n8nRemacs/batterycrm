package com.yandex.div.evaluable.internal;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.a;
import com.yandex.div.evaluable.internal.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Parser.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/a;", "", "<init>", "()V", "a", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f369949a = new a();

    /* compiled from: Parser.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/internal/a$a;", "", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.evaluable.internal.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10893a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f369950a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f369951b;

        /* renamed from: c, reason: collision with root package name */
        public int f369952c;

        public C10893a(@k ArrayList arrayList, @k String str) {
            this.f369950a = arrayList;
            this.f369951b = str;
        }

        @k
        public final b a() {
            return (b) this.f369950a.get(this.f369952c);
        }

        public final int b() {
            int i12 = this.f369952c;
            this.f369952c = i12 + 1;
            return i12;
        }

        public final boolean c() {
            return !(this.f369952c >= this.f369950a.size());
        }

        @k
        public final b d() {
            return (b) this.f369950a.get(b());
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10893a)) {
                return false;
            }
            C10893a c10893a = (C10893a) obj;
            return L.f(this.f369950a, c10893a.f369950a) && L.f(this.f369951b, c10893a.f369951b);
        }

        public final int hashCode() {
            return this.f369951b.hashCode() + (this.f369950a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ParsingState(tokens=");
            sb2.append(this.f369950a);
            sb2.append(", rawExpr=");
            return C22026a.c(sb2, this.f369951b, ')');
        }
    }

    public static com.yandex.div.evaluable.a a(C10893a c10893a) {
        com.yandex.div.evaluable.a aVarC = c(c10893a);
        while (c10893a.c() && (c10893a.a() instanceof b.d.a.InterfaceC10911d.C10912a)) {
            c10893a.b();
            aVarC = new a.C10891a(b.d.a.InterfaceC10911d.C10912a.f369970a, aVarC, c(c10893a), c10893a.f369951b);
        }
        return aVarC;
    }

    public static com.yandex.div.evaluable.a b(C10893a c10893a) {
        com.yandex.div.evaluable.a aVarG = g(c10893a);
        while (c10893a.c() && (c10893a.a() instanceof b.d.a.InterfaceC10901a)) {
            aVarG = new a.C10891a((b.d.a) c10893a.d(), aVarG, g(c10893a), c10893a.f369951b);
        }
        return aVarG;
    }

    public static com.yandex.div.evaluable.a c(C10893a c10893a) {
        com.yandex.div.evaluable.a aVarB = b(c10893a);
        while (c10893a.c() && (c10893a.a() instanceof b.d.a.InterfaceC10905b)) {
            aVarB = new a.C10891a((b.d.a) c10893a.d(), aVarB, b(c10893a), c10893a.f369951b);
        }
        return aVarB;
    }

    public static com.yandex.div.evaluable.a d(C10893a c10893a) {
        com.yandex.div.evaluable.a aVarA = a(c10893a);
        while (c10893a.c() && (c10893a.a() instanceof b.d.a.InterfaceC10911d.C10913b)) {
            c10893a.b();
            aVarA = new a.C10891a(b.d.a.InterfaceC10911d.C10913b.f369971a, aVarA, a(c10893a), c10893a.f369951b);
        }
        if (!c10893a.c() || !(c10893a.a() instanceof b.d.c)) {
            return aVarA;
        }
        c10893a.b();
        com.yandex.div.evaluable.a aVarD = d(c10893a);
        if (!(c10893a.a() instanceof b.d.C10916b)) {
            throw new EvaluableException("':' expected in ternary-if-else expression", null, 2, null);
        }
        c10893a.b();
        return new a.f(b.d.C10917d.f369977a, aVarA, aVarD, d(c10893a), c10893a.f369951b);
    }

    public static com.yandex.div.evaluable.a e(C10893a c10893a) {
        com.yandex.div.evaluable.a aVarH = h(c10893a);
        while (c10893a.c() && (c10893a.a() instanceof b.d.a.c)) {
            aVarH = new a.C10891a((b.d.a) c10893a.d(), aVarH, h(c10893a), c10893a.f369951b);
        }
        return aVarH;
    }

    @k
    public static com.yandex.div.evaluable.a f(@k String str, @k ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        C10893a c10893a = new C10893a(arrayList, str);
        com.yandex.div.evaluable.a aVarD = d(c10893a);
        if (c10893a.c()) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        return aVarD;
    }

    public static com.yandex.div.evaluable.a g(C10893a c10893a) {
        com.yandex.div.evaluable.a aVarE = e(c10893a);
        while (c10893a.c() && (c10893a.a() instanceof b.d.a.f)) {
            aVarE = new a.C10891a((b.d.a) c10893a.d(), aVarE, e(c10893a), c10893a.f369951b);
        }
        return aVarE;
    }

    public static com.yandex.div.evaluable.a h(C10893a c10893a) {
        com.yandex.div.evaluable.a eVar;
        boolean zC2 = c10893a.c();
        String str = c10893a.f369951b;
        if (zC2 && (c10893a.a() instanceof b.d.e)) {
            return new a.g((b.d) c10893a.d(), h(c10893a), str);
        }
        if (c10893a.f369952c >= c10893a.f369950a.size()) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        b bVarD = c10893a.d();
        if (bVarD instanceof b.c.a) {
            eVar = new a.h((b.c.a) bVarD, str);
        } else if (bVarD instanceof b.c.C10900b) {
            eVar = new a.i(((b.c.C10900b) bVarD).f369960a, str, null);
        } else if (bVarD instanceof b.C10896b) {
            if (!(c10893a.d() instanceof b.a.C10894a)) {
                throw new EvaluableException("'(' expected after function call", null, 2, null);
            }
            ArrayList arrayList = new ArrayList();
            while (!(c10893a.a() instanceof b.a.C10895b)) {
                arrayList.add(d(c10893a));
                if (c10893a.a() instanceof b.C10896b.a) {
                    c10893a.b();
                }
            }
            if (!(c10893a.d() instanceof b.a.C10895b)) {
                throw new EvaluableException("expected ')' after a function call", null, 2, null);
            }
            eVar = new a.c((b.C10896b) bVarD, arrayList, str);
        } else if (bVarD instanceof b.a.C10894a) {
            eVar = d(c10893a);
            if (!(c10893a.d() instanceof b.a.C10895b)) {
                throw new EvaluableException("')' expected after expression", null, 2, null);
            }
        } else {
            if (!(bVarD instanceof b.e.c)) {
                throw new EvaluableException("Expression expected", null, 2, null);
            }
            ArrayList arrayList2 = new ArrayList();
            while (c10893a.c() && !(c10893a.a() instanceof b.e.a)) {
                if ((c10893a.a() instanceof b.e.d) || (c10893a.a() instanceof b.e.C10919b)) {
                    c10893a.b();
                } else {
                    arrayList2.add(d(c10893a));
                }
            }
            if (!(c10893a.d() instanceof b.e.a)) {
                throw new EvaluableException("expected ''' at end of a string template", null, 2, null);
            }
            eVar = new a.e(arrayList2, str);
        }
        if (!c10893a.c() || !(c10893a.a() instanceof b.d.a.e)) {
            return eVar;
        }
        c10893a.b();
        return new a.C10891a(b.d.a.e.f369972a, eVar, h(c10893a), str);
    }
}

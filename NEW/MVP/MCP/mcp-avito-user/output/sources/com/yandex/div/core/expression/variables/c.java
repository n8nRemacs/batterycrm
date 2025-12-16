package com.yandex.div.core.expression.variables;

import C21.h;
import com.yandex.div.internal.parser.x;
import com.yandex.div2.AbstractC38363g8;
import com.yandex.div2.C38231a;
import com.yandex.div2.C38271c;
import com.yandex.div2.C38291e;
import com.yandex.div2.C8;
import com.yandex.div2.F8;
import com.yandex.div2.H8;
import com.yandex.div2.J8;
import java.util.List;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;

/* compiled from: DivVariablesParser.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c {

    /* compiled from: DivVariablesParser.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a implements x, D {
        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof x) && (obj instanceof D)) {
                return L.f(null, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // com.yandex.div.internal.parser.x
        public final /* synthetic */ boolean isValid(List list) {
            throw null;
        }
    }

    @Y61.k
    public static final C21.h a(@Y61.k AbstractC38363g8 abstractC38363g8) {
        if (abstractC38363g8 instanceof AbstractC38363g8.a) {
            C38231a c38231a = ((AbstractC38363g8.a) abstractC38363g8).f375232c;
            return new h.a(c38231a.f374128a, c38231a.f374129b);
        }
        if (abstractC38363g8 instanceof AbstractC38363g8.f) {
            C8 c82 = ((AbstractC38363g8.f) abstractC38363g8).f375236c;
            return new h.e(c82.f371160a, c82.f371161b);
        }
        if (abstractC38363g8 instanceof AbstractC38363g8.g) {
            F8 f82 = ((AbstractC38363g8.g) abstractC38363g8).f375237c;
            return new h.d(f82.f372305a, f82.f372306b);
        }
        if (abstractC38363g8 instanceof AbstractC38363g8.h) {
            H8 h82 = ((AbstractC38363g8.h) abstractC38363g8).f375238c;
            return new h.f(h82.f372536a, h82.f372537b);
        }
        if (abstractC38363g8 instanceof AbstractC38363g8.b) {
            C38271c c38271c = ((AbstractC38363g8.b) abstractC38363g8).f375233c;
            return new h.b(c38271c.f374684a, c38271c.f374685b);
        }
        if (abstractC38363g8 instanceof AbstractC38363g8.i) {
            J8 j82 = ((AbstractC38363g8.i) abstractC38363g8).f375239c;
            return new h.g(j82.f372632a, j82.f372633b);
        }
        if (!(abstractC38363g8 instanceof AbstractC38363g8.e)) {
            throw new NoWhenBranchMatchedException();
        }
        C38291e c38291e = ((AbstractC38363g8.e) abstractC38363g8).f375235c;
        return new h.c(c38291e.f374722a, c38291e.f374723b);
    }
}

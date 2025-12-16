package androidx.compose.foundation.text.input;

import P.a;
import androidx.compose.foundation.text.input.internal.undo.TextDeleteType;
import androidx.compose.foundation.text.input.internal.undo.TextEditType;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.saveable.x;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.runtime.snapshots.D;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TextUndoManager.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/u;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31528c = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final P.d<P.a> f31529a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31530b;

    /* compiled from: TextUndoManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/u$a;", "", "<init>", "()V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: TextUndoManager.kt */
        @P
        @s0
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/u$a$a;", "Landroidx/compose/runtime/saveable/u;", "Landroidx/compose/foundation/text/input/u;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text.input.u$a$a, reason: collision with other inner class name */
        public static final class C1624a implements androidx.compose.runtime.saveable.u<u, Object> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1624a f31531a = new C1624a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C1625a f31532b;

            /* compiled from: UndoManager.kt */
            @s0
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"P/c", "Landroidx/compose/runtime/saveable/u;", "LP/d;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: androidx.compose.foundation.text.input.u$a$a$a, reason: collision with other inner class name */
            public static final class C1625a implements androidx.compose.runtime.saveable.u<P.d<P.a>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ a.C0825a f31533a;

                public C1625a(a.C0825a c0825a) {
                    this.f31533a = c0825a;
                }

                @Override // androidx.compose.runtime.saveable.u
                public final Object a(x xVar, P.d<P.a> dVar) {
                    a.C0825a c0825a;
                    P.d<P.a> dVar2 = dVar;
                    kotlin.collections.builders.b bVarT = C42745f0.t();
                    bVarT.add(Integer.valueOf(dVar2.f12759a));
                    D<P.a> d12 = dVar2.f12760b;
                    bVarT.add(Integer.valueOf(d12.size()));
                    D<P.a> d13 = dVar2.f12761c;
                    bVarT.add(Integer.valueOf(d13.size()));
                    int size = d12.size();
                    int i12 = 0;
                    while (true) {
                        c0825a = this.f31533a;
                        if (i12 >= size) {
                            break;
                        }
                        bVarT.add(c0825a.a(xVar, d12.get(i12)));
                        i12++;
                    }
                    int size2 = d13.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        bVarT.add(c0825a.a(xVar, d13.get(i13)));
                    }
                    return C42745f0.p(bVarT);
                }
            }

            static {
                int i12 = P.d.f12758d;
                P.a.f12748i.getClass();
                f31532b = new C1625a(P.a.f12749j);
            }

            @Y61.k
            public static List b(@Y61.k x xVar, @Y61.k u uVar) {
                Object objA;
                int i12 = u.f31528c;
                P.a aVar = (P.a) ((C22082i3) uVar.f31530b).getF42167b();
                if (aVar != null) {
                    P.a.f12748i.getClass();
                    objA = P.a.f12749j.a(xVar, aVar);
                } else {
                    objA = null;
                }
                return C42745f0.U(objA, f31532b.a(xVar, uVar.f31529a));
            }

            @Override // androidx.compose.runtime.saveable.u
            public final /* bridge */ /* synthetic */ Object a(x xVar, u uVar) {
                return b(xVar, uVar);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public u() {
        this(null, null, 3, null);
    }

    public final void a() {
        D<P.a> d12;
        AbstractC22167l.f38720e.getClass();
        AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
        Y41.l<Object, G0> lVarE = abstractC22167lA != null ? abstractC22167lA.getF38696h() : null;
        AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
        InterfaceC22204y1 interfaceC22204y1 = this.f31530b;
        try {
            P.a aVar = (P.a) ((C22082i3) interfaceC22204y1).getF42167b();
            if (aVar != null) {
                P.d<P.a> dVar = this.f31529a;
                dVar.f12761c.clear();
                while (true) {
                    int size = dVar.f12761c.size() + dVar.f12760b.size();
                    int i12 = dVar.f12759a - 1;
                    d12 = dVar.f12760b;
                    if (size <= i12) {
                        break;
                    } else {
                        C42745f0.m0(d12);
                    }
                }
                d12.add(aVar);
            }
            ((C22082i3) interfaceC22204y1).setValue(null);
        } finally {
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, lVarE);
        }
    }

    public final void b(@Y61.k P.a aVar) {
        AbstractC22167l.f38720e.getClass();
        AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
        P.a aVar2 = null;
        Y41.l<Object, G0> lVarE = abstractC22167lA != null ? abstractC22167lA.getF38696h() : null;
        AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
        InterfaceC22204y1 interfaceC22204y1 = this.f31530b;
        try {
            P.a aVar3 = (P.a) ((C22082i3) interfaceC22204y1).getF42167b();
            if (aVar3 == null) {
                ((C22082i3) interfaceC22204y1).setValue(aVar);
                return;
            }
            if (aVar3.f12756g && aVar.f12756g) {
                long j12 = aVar.f12755f;
                long j13 = aVar3.f12755f;
                if (j12 >= j13 && j12 - j13 < 5000) {
                    String str = aVar3.f12752c;
                    if (!L.f(str, "\n") && !L.f(str, "\r\n")) {
                        String str2 = aVar.f12752c;
                        if (!L.f(str2, "\n") && !L.f(str2, "\r\n")) {
                            TextEditType textEditType = aVar.f12757h;
                            TextEditType textEditType2 = aVar3.f12757h;
                            if (textEditType2 == textEditType) {
                                TextEditType textEditType3 = TextEditType.f31472b;
                                int i12 = aVar3.f12750a;
                                int i13 = aVar.f12750a;
                                if (textEditType2 == textEditType3 && str.length() + i12 == i13) {
                                    aVar2 = new P.a(aVar3.f12750a, "", androidx.appcompat.app.r.q(str, str2), aVar3.f12753d, aVar.f12754e, aVar3.f12755f, false, 64, null);
                                } else if (textEditType2 == TextEditType.f31473c && aVar3.a() == aVar.a() && (aVar3.a() == TextDeleteType.f31466b || aVar3.a() == TextDeleteType.f31467c)) {
                                    String str3 = aVar.f12751b;
                                    int length = str3.length() + i13;
                                    String str4 = aVar3.f12751b;
                                    if (i12 == length) {
                                        aVar2 = new P.a(aVar.f12750a, androidx.appcompat.app.r.q(str3, str4), "", aVar3.f12753d, aVar.f12754e, aVar3.f12755f, false, 64, null);
                                    } else if (i12 == i13) {
                                        aVar2 = new P.a(aVar3.f12750a, androidx.appcompat.app.r.q(str4, str3), "", aVar3.f12753d, aVar.f12754e, aVar3.f12755f, false, 64, null);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (aVar2 != null) {
                ((C22082i3) interfaceC22204y1).setValue(aVar2);
            } else {
                a();
                ((C22082i3) interfaceC22204y1).setValue(aVar);
            }
        } finally {
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, lVarE);
        }
    }

    public u(P.a aVar, P.d dVar, int i12, C42822w c42822w) {
        aVar = (i12 & 1) != 0 ? null : aVar;
        this.f31529a = (i12 & 2) != 0 ? new P.d(null, null, 100, 3, null) : dVar;
        this.f31530b = C22126m3.g(aVar);
    }
}

package Fc1;

import Fc1.AbstractC13567a6;
import androidx.compose.ui.text.C22602e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class N3 extends kotlin.jvm.internal.N implements Y41.l<AbstractC13567a6, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e.b f5107l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C13575b5 f5108m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J4 f5109n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N3(C22602e.b bVar, C13575b5 c13575b5, J4 j42) {
        super(1);
        this.f5107l = bVar;
        this.f5108m = c13575b5;
        this.f5109n = j42;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(AbstractC13567a6 abstractC13567a6) {
        int i12;
        androidx.compose.ui.text.e0 e0VarB;
        int i13;
        int i14;
        AbstractC13567a6 abstractC13567a62 = abstractC13567a6;
        boolean z12 = abstractC13567a62 instanceof AbstractC13567a6.b;
        C13575b5 c13575b5 = this.f5108m;
        C22602e.b bVar = this.f5107l;
        if (z12) {
            e0VarB = c13575b5.b(abstractC13567a62);
            AbstractC13567a6.b bVar2 = (AbstractC13567a6.b) abstractC13567a62;
            i13 = bVar2.f5395a;
            i14 = bVar2.f5396b;
        } else if (abstractC13567a62 instanceof AbstractC13567a6.a.C0297a) {
            e0VarB = c13575b5.b(abstractC13567a62);
            AbstractC13567a6.a.C0297a c0297a = (AbstractC13567a6.a.C0297a) abstractC13567a62;
            i13 = c0297a.f5392a;
            i14 = c0297a.f5393b;
        } else if (abstractC13567a62 instanceof AbstractC13567a6.a.b) {
            e0VarB = c13575b5.b(abstractC13567a62);
            AbstractC13567a6.a.b bVar3 = (AbstractC13567a6.a.b) abstractC13567a62;
            i13 = bVar3.f5392a;
            i14 = bVar3.f5393b;
        } else if (abstractC13567a62 instanceof AbstractC13567a6.d) {
            e0VarB = c13575b5.b(abstractC13567a62);
            AbstractC13567a6.d dVar = (AbstractC13567a6.d) abstractC13567a62;
            i13 = dVar.f5399a;
            i14 = dVar.f5400b;
        } else if (abstractC13567a62 instanceof AbstractC13567a6.e) {
            e0VarB = c13575b5.b(abstractC13567a62);
            AbstractC13567a6.e eVar = (AbstractC13567a6.e) abstractC13567a62;
            i13 = eVar.f5401a;
            i14 = eVar.f5402b;
        } else if (abstractC13567a62 instanceof AbstractC13567a6.f) {
            e0VarB = c13575b5.b(abstractC13567a62);
            AbstractC13567a6.f fVar = (AbstractC13567a6.f) abstractC13567a62;
            i13 = fVar.f5403a;
            i14 = fVar.f5404b;
        } else {
            if (!(abstractC13567a62 instanceof AbstractC13567a6.c)) {
                if (abstractC13567a62 instanceof AbstractC13567a6.g) {
                    this.f5109n.getClass();
                    int iOrdinal = ((AbstractC13567a6.g) abstractC13567a62).f5408d.ordinal();
                    if (iOrdinal == 0) {
                        androidx.compose.ui.text.style.i.f42675b.getClass();
                        i12 = androidx.compose.ui.text.style.i.f42678e;
                    } else if (iOrdinal == 1) {
                        androidx.compose.ui.text.style.i.f42675b.getClass();
                        i12 = androidx.compose.ui.text.style.i.f42676c;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        androidx.compose.ui.text.style.i.f42675b.getClass();
                        i12 = androidx.compose.ui.text.style.i.f42677d;
                    }
                    int iK2 = bVar.k(new androidx.compose.ui.text.S(i12, 0, 0L, (androidx.compose.ui.text.style.p) null, (androidx.compose.ui.text.W) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.r) null, 510, (C42822w) null));
                    try {
                        int iL2 = bVar.l(c13575b5.b(abstractC13567a62));
                        try {
                            bVar.f(((AbstractC13567a6.g) abstractC13567a62).f5405a);
                            kotlin.G0 g02 = kotlin.G0.f406611a;
                        } finally {
                            bVar.h(iL2);
                        }
                    } finally {
                        bVar.h(iK2);
                    }
                }
                return kotlin.G0.f406611a;
            }
            e0VarB = c13575b5.b(abstractC13567a62);
            AbstractC13567a6.c cVar = (AbstractC13567a6.c) abstractC13567a62;
            i13 = cVar.f5397a;
            i14 = cVar.f5398b;
        }
        bVar.b(e0VarB, i13, i14);
        return kotlin.G0.f406611a;
    }
}

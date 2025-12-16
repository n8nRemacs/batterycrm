package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.yandex.metrica.impl.ob.C38979mf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class Ga implements Fa {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Ha f378180a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Ca f378181b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38937kn f378182c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final La f378183d;

    public Ga() {
        this(new Ha(), new Ca(), new C38937kn(100), new La());
    }

    private C38979mf a(@j.N C38979mf c38979mf) {
        C38979mf c38979mf2 = new C38979mf();
        c38979mf2.f381055a = c38979mf.f381055a;
        C38979mf.h hVar = new C38979mf.h();
        c38979mf2.f381060f = hVar;
        hVar.f381080a = new C38979mf.f();
        C38979mf.f fVar = c38979mf2.f381060f.f381080a;
        C38979mf.f fVar2 = c38979mf.f381060f.f381080a;
        fVar.f381073b = fVar2.f381073b;
        fVar.f381072a = fVar2.f381072a;
        fVar.f381076e = fVar2.f381076e;
        fVar.f381074c = fVar2.f381074c;
        return c38979mf2;
    }

    @Override // com.yandex.metrica.impl.ob.Fa, com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        Na<C38979mf.i, Vm> naFromModel;
        Va va2 = (Va) obj;
        C38979mf c38979mf = new C38979mf();
        c38979mf.f381055a = va2.f379778b;
        c38979mf.f381060f = new C38979mf.h();
        Wa wa2 = va2.f379779c;
        C38979mf.f fVar = new C38979mf.f();
        fVar.f381072a = C38689b.b(wa2.f379811a);
        C38838gn<String, Vm> c38838gnA = this.f378182c.a(wa2.f379812b);
        fVar.f381073b = C38689b.b(c38838gnA.f380668a);
        fVar.f381076e = wa2.f379813c.size();
        Map<String, String> map = wa2.f379814d;
        if (map != null) {
            naFromModel = this.f378180a.fromModel(map);
            fVar.f381074c = naFromModel.f378989a;
        } else {
            naFromModel = null;
        }
        c38979mf.f381060f.f381080a = fVar;
        Vm vmA = Um.a(c38838gnA, naFromModel);
        List<Ua> list = wa2.f379813c;
        ArrayList arrayList = new ArrayList();
        this.f378183d.getClass();
        int iComputeInt32Size = c38979mf.f381055a != new C38979mf().f381055a ? CodedOutputByteBufferNano.computeInt32Size(1, c38979mf.f381055a) : 0;
        C38979mf.q qVar = c38979mf.f381056b;
        if (qVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, qVar);
        }
        C38979mf.o oVar = c38979mf.f381057c;
        if (oVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, oVar);
        }
        C38979mf.p pVar = c38979mf.f381058d;
        int i12 = 4;
        if (pVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, pVar);
        }
        C38979mf.b bVar = c38979mf.f381059e;
        if (bVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, bVar);
        }
        C38979mf.h hVar = c38979mf.f381060f;
        if (hVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, hVar);
        }
        ArrayList arrayList2 = new ArrayList();
        C38979mf c38979mfA = a(c38979mf);
        int i13 = 0;
        Vm vmA2 = vmA;
        int i14 = iComputeInt32Size;
        while (i13 < list.size()) {
            Ua ua2 = list.get(i13);
            C38979mf.g gVar = new C38979mf.g();
            gVar.f381078a = i13;
            Na<C38979mf.c, Vm> naFromModel2 = this.f378181b.fromModel(ua2);
            gVar.f381079b = naFromModel2.f378989a;
            this.f378183d.getClass();
            int iComputeTagSize = CodedOutputByteBufferNano.computeTagSize(i12);
            int iComputeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(gVar);
            int iComputeRawVarint32Size = iComputeTagSize + iComputeMessageSizeNoTag + ((iComputeMessageSizeNoTag & (-128)) == 0 ? 0 : CodedOutputByteBufferNano.computeRawVarint32Size(iComputeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i14 + iComputeRawVarint32Size > 204800) {
                c38979mfA.f381060f.f381080a.f381075d = (C38979mf.g[]) arrayList2.toArray(new C38979mf.g[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Na(c38979mfA, vmA2));
                vmA2 = vmA;
                i14 = iComputeInt32Size;
                c38979mfA = a(c38979mf);
                arrayList2 = arrayList3;
            }
            arrayList2.add(gVar);
            vmA2 = Um.a(vmA2, naFromModel2);
            i14 += iComputeRawVarint32Size;
            i13++;
            i12 = 4;
        }
        c38979mfA.f381060f.f381080a.f381075d = (C38979mf.g[]) arrayList2.toArray(new C38979mf.g[arrayList2.size()]);
        arrayList.add(new Na(c38979mfA, vmA2));
        return arrayList;
    }

    @Override // com.yandex.metrica.impl.ob.Fa, com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public Ga(@j.N Ha ha2, @j.N Ca ca2, @j.N C38937kn c38937kn, @j.N La la2) {
        this.f378180a = ha2;
        this.f378181b = ca2;
        this.f378182c = c38937kn;
        this.f378183d = la2;
    }
}

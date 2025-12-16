package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.yandex.metrica.impl.ob.C39078qf;
import java.util.List;

/* loaded from: classes7.dex */
class O1 implements InterfaceC38685ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C39078qf f379026a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P1 f379027b;

    public O1(P1 p12, C39078qf c39078qf) {
        this.f379027b = p12;
        this.f379026a = c39078qf;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38685ak
    public void a(@j.N Zj zj2) {
        C39078qf c39078qf = this.f379026a;
        List<Tj> listC = zj2.c();
        if (A2.b(listC)) {
            return;
        }
        c39078qf.f381498d = new C39078qf.e[listC.size()];
        for (int i12 = 0; i12 < listC.size(); i12++) {
            Tj tj2 = listC.get(i12);
            C39078qf.e[] eVarArr = c39078qf.f381498d;
            int i13 = J1.f378553e;
            C39078qf.e eVar = new C39078qf.e();
            if (tj2.b() != null) {
                eVar.f381571a = tj2.b().intValue();
            }
            if (tj2.c() != null) {
                eVar.f381572b = tj2.c().intValue();
            }
            if (!TextUtils.isEmpty(tj2.a())) {
                eVar.f381573c = tj2.a();
            }
            eVar.f381574d = tj2.d();
            eVarArr[i12] = eVar;
            P1.a(this.f379027b, CodedOutputByteBufferNano.computeMessageSizeNoTag(c39078qf.f381498d[i12]));
            P1.a(this.f379027b, CodedOutputByteBufferNano.computeTagSize(10));
        }
    }
}

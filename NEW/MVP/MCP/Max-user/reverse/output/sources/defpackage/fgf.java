package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class fgf implements gu3, tm6 {
    public final /* synthetic */ igf a;

    public /* synthetic */ fgf(igf igfVar) {
        this.a = igfVar;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        List list = (List) obj;
        kgf kgfVar = this.a.a;
        kgfVar.getClass();
        azi.b(new ik3(new ora(vqa.i(list), new vef(13), 5).s(), 2, new ggf(kgfVar, 1)).i(), pdf.e, new oh2(23, list), new mr5(6, list));
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        xff xffVar = (xff) obj;
        igf igfVar = this.a;
        return igfVar.b.b(xffVar.h).h(new u4e(igfVar, 15, xffVar));
    }
}

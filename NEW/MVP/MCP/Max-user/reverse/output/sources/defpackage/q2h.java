package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
public final /* synthetic */ class q2h implements gu3, tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l2h b;

    public /* synthetic */ q2h(l2h l2hVar, int i) {
        this.a = i;
        this.b = l2hVar;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        Locale locale = Locale.ENGLISH;
        wqi.e("u2h", "removeFromRepository: failed conversionData = " + this.b, (Throwable) obj);
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                o2h o2hVar = (o2h) obj;
                l2h l2hVar = this.b;
                String str = l2hVar.a;
                p2h p2hVar = l2hVar.b;
                gsc gscVar = p2hVar.a;
                float f = p2hVar.b;
                float f2 = p2hVar.c;
                boolean z = p2hVar.d;
                o2hVar.getClass();
                dsd dsdVarC = dsd.c(5, "SELECT * FROM video_conversions WHERE source_uri=? AND quality=? AND start_trim_position=? AND end_trim_position=? AND mute=?");
                if (str == null) {
                    dsdVarC.S(1);
                } else {
                    dsdVarC.f(1, str);
                }
                dsdVarC.k(2, gscVar.b);
                dsdVarC.g(3, f);
                dsdVarC.g(4, f2);
                dsdVarC.k(5, z ? 1L : 0L);
                return new yr8(new jad(o2hVar, 18, dsdVarC));
            default:
                o2h o2hVar2 = (o2h) obj;
                l2h l2hVar2 = this.b;
                String str2 = l2hVar2.a;
                p2h p2hVar2 = l2hVar2.b;
                gsc gscVar2 = p2hVar2.a;
                float f3 = p2hVar2.b;
                float f4 = p2hVar2.c;
                boolean z2 = p2hVar2.d;
                o2hVar2.getClass();
                return new kk3(2, new euf(o2hVar2, str2, gscVar2, f3, f4, z2, 1));
        }
    }
}

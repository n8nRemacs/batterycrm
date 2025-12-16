package defpackage;

import androidx.work.WorkRequest;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d6i extends u08 implements cm6 {
    public final /* synthetic */ WorkRequest a;
    public final /* synthetic */ c5i b;
    public final /* synthetic */ String c;
    public final /* synthetic */ wib d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6i(nrb nrbVar, c5i c5iVar, String str, wib wibVar) {
        super(0);
        this.a = nrbVar;
        this.b = c5iVar;
        this.c = str;
        this.d = wibVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        List listSingletonList = Collections.singletonList(this.a);
        new lg5(new p4i(this.b, this.c, uk5.b, listSingletonList, 0), this.d).run();
        return qqg.a;
    }
}

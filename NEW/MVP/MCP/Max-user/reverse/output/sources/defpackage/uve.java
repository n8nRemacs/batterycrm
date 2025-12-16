package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class uve {
    public final Context a;
    public final bwf b = new bwf(new nte(5));
    public final tve c;

    /* JADX WARN: Type inference failed for: r3v2, types: [tve] */
    public uve(final k18 k18Var, Context context) {
        this.a = context;
        this.c = new bx5() { // from class: tve
            @Override // defpackage.bx5
            public final z74 a() {
                return ((q2b) ((lzf) k18Var.getValue())).b();
            }
        };
    }
}

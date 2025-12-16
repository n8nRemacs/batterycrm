package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ww4 extends w5 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ww4(int i, a1e a1eVar) {
        super(a1eVar);
        this.b = i;
    }

    @Override // defpackage.w5
    public ArrayList a(int i) {
        switch (this.b) {
            case 1:
                return this.a.b(i);
            default:
                return super.a(i);
        }
    }
}

package defpackage;

import android.text.style.StyleSpan;

/* loaded from: classes2.dex */
public final class zq0 extends StyleSpan implements ep8 {
    public final /* synthetic */ int a;
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq0(int i) {
        super(1);
        this.a = i;
        switch (i) {
            case 1:
                super(2);
                this.b = 3;
                break;
            default:
                this.b = 2;
                break;
        }
    }

    @Override // defpackage.g74
    public final g74 copy() {
        switch (this.a) {
            case 0:
                return new zq0(0);
            default:
                return new zq0(1);
        }
    }

    @Override // defpackage.ep8
    public final int getType() {
        switch (this.a) {
        }
        return this.b;
    }
}

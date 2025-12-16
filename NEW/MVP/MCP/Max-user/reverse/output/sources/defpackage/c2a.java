package defpackage;

import android.text.style.TypefaceSpan;

/* loaded from: classes2.dex */
public final class c2a extends TypefaceSpan implements ep8 {
    public final int a;

    public c2a() {
        super("monospace");
        this.a = 5;
    }

    @Override // defpackage.g74
    public final g74 copy() {
        return new c2a();
    }

    @Override // defpackage.ep8
    public final int getType() {
        return this.a;
    }
}

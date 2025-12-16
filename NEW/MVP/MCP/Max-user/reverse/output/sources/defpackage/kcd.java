package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class kcd extends d2f {
    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(icd icdVar) {
        boolean z = icdVar.Y;
        View view = this.a;
        if (z) {
            ((jcd) view).setAvatarShape(mxa.a);
        }
        ((jcd) view).setAvatar(icdVar.c);
        ((jcd) view).setAbbreviation(fui.a(icdVar.d, Long.valueOf(this.o)));
        ((jcd) view).setName(icdVar.b);
        ((jcd) view).setVerified(icdVar.X);
        ((jcd) view).setOnline(icdVar.o);
    }
}

package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g7g extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ h7g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g7g(Object obj, h7g h7gVar, int i) {
        super(12, obj);
        this.c = i;
        this.d = h7gVar;
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!fni.a(obj, obj2)) {
                    h7g h7gVar = this.d;
                    h7gVar.onThemeChanged(h7gVar.getTheme());
                    break;
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    this.d.setBackground((Drawable) obj2);
                    break;
                }
                break;
        }
    }
}

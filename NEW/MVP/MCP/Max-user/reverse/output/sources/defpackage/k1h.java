package defpackage;

import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.TextPaint;

/* loaded from: classes2.dex */
public final class k1h extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ l1h d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1h(l1h l1hVar, int i) {
        super(12, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.d = l1hVar;
                super(12, bool);
                break;
            case 2:
                Boolean bool2 = Boolean.TRUE;
                this.d = l1hVar;
                super(12, bool2);
                break;
            case 3:
                Boolean bool3 = Boolean.TRUE;
                this.d = l1hVar;
                super(12, bool3);
                break;
            default:
                this.d = l1hVar;
                break;
        }
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        Drawable drawableMutate;
        switch (this.c) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                if (!fni.a((CharSequence) obj, charSequence) && charSequence != null && charSequence.length() != 0) {
                    l1h l1hVar = this.d;
                    BoringLayout.Metrics metrics = l1hVar.getMetrics();
                    TextPaint textPaint = l1h.C0;
                    metrics.width = kti.d(textPaint.measureText(charSequence, 0, charSequence.length()));
                    textPaint.setColor(l1hVar.t0);
                    l1hVar.y0 = h18.a(l1hVar.a, charSequence, textPaint, metrics.width, 1, false, null, 0.0f, false, 464);
                    l1hVar.invalidate();
                    l1hVar.requestLayout();
                    break;
                }
                break;
            case 1:
                if (!fni.a(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    this.d.invalidate();
                    break;
                }
                break;
            case 2:
                if (!fni.a(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    this.d.invalidate();
                    break;
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    l1h l1hVar2 = this.d;
                    if (zBooleanValue) {
                        drawableMutate = r34.b(l1hVar2.getContext(), yud.f2).mutate();
                        int i = l1hVar2.c;
                        drawableMutate.setBounds(0, 0, i, i);
                        drawableMutate.setTint(l1hVar2.getDrawableColor());
                    } else {
                        drawableMutate = null;
                    }
                    l1hVar2.x0 = drawableMutate;
                    l1hVar2.requestLayout();
                    l1hVar2.invalidate();
                    break;
                }
                break;
        }
    }
}

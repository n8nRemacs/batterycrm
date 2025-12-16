package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class f83 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ f83(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                i83 i83Var = ((Chip) this.b).o;
                if (i83Var == null) {
                    outline.setAlpha(0.0f);
                    break;
                } else {
                    i83Var.getOutline(outline);
                    break;
                }
            case 1:
                mf3 mf3Var = (mf3) this.b;
                outline.setOval(0, 0, mf3Var.getWidth(), mf3Var.getHeight());
                break;
            case 2:
                i44 i44Var = (i44) this.b;
                if (outline != null) {
                    outline.setRoundRect(i44Var.getLeft(), i44Var.getTop(), i44Var.getRight(), i44Var.getBottom(), i44Var.a);
                    break;
                }
                break;
            case 3:
                ImageView imageView = (ImageView) this.b;
                if (outline != null) {
                    outline.setOval(0, 0, imageView.getWidth(), imageView.getHeight());
                    break;
                }
                break;
            case 4:
                h7g h7gVar = (h7g) this.b;
                if (outline != null) {
                    outline.setRoundRect(0, 0, h7gVar.getWidth(), h7gVar.getHeight(), vw4.d().getDisplayMetrics().density * 10.0f);
                    break;
                }
                break;
            default:
                l5h l5hVar = (l5h) this.b;
                if (outline != null) {
                    outline.setOval(0, 0, view != null ? view.getMeasuredWidth() : l5hVar.getMeasuredWidth(), view != null ? view.getMeasuredHeight() : l5hVar.getMeasuredHeight());
                    break;
                }
                break;
        }
    }
}

package Jh;

import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.avito.android.R;
import ej.InterfaceC40116e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinAttributedTextPairViewContainer.kt */
@s0
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010 \u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010)\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010\u0016¨\u0006*"}, d2 = {"LJh/d;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lej/e;", "Landroid/view/View;", "b", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getLeftText", "()Landroid/widget/TextView;", "leftText", "d", "getRightText", "rightText", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "getLeftPartLeftIcon", "()Landroid/widget/ImageView;", "leftPartLeftIcon", "f", "getLeftPartRightIcon", "leftPartRightIcon", "g", "getRightPartLeftIcon", "rightPartLeftIcon", "h", "getRightPartRightIcon", "rightPartRightIcon", "Landroidx/constraintlayout/widget/Guideline;", "i", "Landroidx/constraintlayout/widget/Guideline;", "getGuideline", "()Landroidx/constraintlayout/widget/Guideline;", "guideline", "j", "getLine", "line", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends ConstraintLayout implements InterfaceC40116e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f9101b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public final TextView leftText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    public final TextView rightText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    public final ImageView leftPartLeftIcon;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    public final ImageView leftPartRightIcon;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    public final ImageView rightPartLeftIcon;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    public final ImageView rightPartRightIcon;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    public final Guideline guideline;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    public final ImageView line;

    public d(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f9101b = this;
        LayoutInflater.from(context).inflate(R.layout.beduin_component_attributed_text_pair, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.leftText);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.leftText = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.rightText);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.rightText = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.leftPartLeftIcon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.leftPartLeftIcon = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.leftPartRightIcon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.leftPartRightIcon = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.rightPartLeftIcon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.rightPartLeftIcon = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.rightPartRightIcon);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.rightPartRightIcon = (ImageView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.guideline);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Guideline");
        }
        this.guideline = (Guideline) viewFindViewById7;
        this.line = (ImageView) findViewById(R.id.dots);
    }

    @k
    public final Guideline getGuideline() {
        return this.guideline;
    }

    @k
    public final ImageView getLeftPartLeftIcon() {
        return this.leftPartLeftIcon;
    }

    @k
    public final ImageView getLeftPartRightIcon() {
        return this.leftPartRightIcon;
    }

    @k
    public final TextView getLeftText() {
        return this.leftText;
    }

    @k
    public final ImageView getLine() {
        return this.line;
    }

    @k
    public final ImageView getRightPartLeftIcon() {
        return this.rightPartLeftIcon;
    }

    @k
    public final ImageView getRightPartRightIcon() {
        return this.rightPartRightIcon;
    }

    @k
    public final TextView getRightText() {
        return this.rightText;
    }

    @Override // ej.InterfaceC40116e
    @k
    /* renamed from: getRoot */
    public View getF101723b() {
        return this.f9101b;
    }
}

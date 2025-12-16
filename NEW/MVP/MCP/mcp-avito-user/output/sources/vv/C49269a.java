package vV;

import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import wK0.AbstractC49526a;

/* compiled from: PhotoUploaderLabel.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LvV/a;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/res/ColorStateList;", "color", "Lkotlin/G0;", "setBackgroundColor", "(Landroid/content/res/ColorStateList;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vV.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49269a extends AppCompatTextView {

    /* renamed from: b, reason: collision with root package name */
    public final int f440795b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C49269a(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.photoUploaderLabel : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_PhotoUploaderLabel : i13;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178977k0, i12, i13);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        this.f440795b = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, x.a(typedArrayObtainStyledAttributes, getContext(), 11), null, this.f440795b, null, 0, 122));
        }
        D6.b(this, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0)), Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0)), Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0)), Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setBackgroundColor(@l ColorStateList color) {
        setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, color, null, this.f440795b, null, 0, 122));
    }
}

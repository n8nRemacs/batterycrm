package BV;

import LV.d;
import Y61.k;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.util.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SpinnerWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LBV/a;", "Landroid/widget/FrameLayout;", "LLV/d;", "Lcom/avito/android/lib/design/spinner/a;", "newStyle", "Lkotlin/G0;", "setStyle", "(Lcom/avito/android/lib/design/spinner/a;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends FrameLayout implements d<com.avito.android.lib.design.spinner.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Spinner f1411b;

    public a(@k Context context) {
        super(context);
        Spinner spinner = new Spinner(context);
        this.f1411b = spinner;
        addView(spinner);
        ViewGroup.LayoutParams layoutParams = spinner.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = 17;
        }
        spinner.setLayoutParams(layoutParams);
    }

    @Override // LV.d
    public void setStyle(@k com.avito.android.lib.design.spinner.a newStyle) {
        if (new c(newStyle, null).f181333c) {
            return;
        }
        int i12 = newStyle.f180563c;
        if (!L.f(Integer.valueOf(i12), null)) {
            setMinimumHeight(i12);
        }
        int i13 = newStyle.f180562b;
        if (!L.f(Integer.valueOf(i13), null)) {
            setMinimumWidth(i13);
        }
        this.f1411b.setStyle(newStyle);
    }
}

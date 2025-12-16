package NS;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.lib.design.switcher.Switcher;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SwitcherWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LNS/c;", "Landroid/widget/FrameLayout;", "LLV/a;", "LEV/c;", "Lcom/avito/android/lib/design/switcher/a;", "newStyle", "Lkotlin/G0;", "setStyle", "(Lcom/avito/android/lib/design/switcher/a;)V", "newState", "setState", "(LEV/c;)V", "_design-modules_beduin-v2_renderer_component_switcher"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends FrameLayout implements LV.a<EV.c, com.avito.android.lib.design.switcher.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Switcher f11523b;

    public c(@k Context context) {
        super(context);
        Switcher switcher = new Switcher(context, null);
        this.f11523b = switcher;
        addView(switcher);
        ViewGroup.LayoutParams layoutParams = switcher.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -2;
        layoutParams.height = -2;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = 3;
        }
        switcher.setLayoutParams(layoutParams);
    }

    @Override // LV.b
    public void setState(@k EV.c newState) throws Resources.NotFoundException {
        this.f11523b.setState(newState);
    }

    @Override // LV.d
    public void setStyle(@k com.avito.android.lib.design.switcher.a newStyle) {
        this.f11523b.setStyle(newStyle);
    }
}

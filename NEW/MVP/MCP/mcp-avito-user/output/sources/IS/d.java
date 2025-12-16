package IS;

import Y61.k;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.lib.design.stepper.Stepper;
import com.avito.android.lib.design.stepper.StepperState;
import com.avito.android.lib.design.stepper.i;
import com.avito.beduin.v2.avito.component.stepper.state.WidthStrategy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: StepperWrapper.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LIS/d;", "Landroid/widget/FrameLayout;", "LLV/a;", "Lcom/avito/android/lib/design/stepper/StepperState;", "Lcom/avito/android/lib/design/stepper/i;", "newStyle", "Lkotlin/G0;", "setStyle", "(Lcom/avito/android/lib/design/stepper/i;)V", "newState", "setState", "(Lcom/avito/android/lib/design/stepper/StepperState;)V", "Lcom/avito/beduin/v2/avito/component/stepper/state/WidthStrategy;", "strategy", "setWidthStrategy", "(Lcom/avito/beduin/v2/avito/component/stepper/state/WidthStrategy;)V", "_design-modules_beduin-v2_renderer_component_stepper"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends FrameLayout implements LV.a<StepperState, i> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Stepper f8182b;

    public d(@k Context context) {
        super(context);
        Stepper stepper = new Stepper(context, null, 0, 0, 14, null);
        this.f8182b = stepper;
        addView(stepper);
        ViewGroup.LayoutParams layoutParams = stepper.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -2;
        layoutParams.height = -2;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = 3;
        }
        stepper.setLayoutParams(layoutParams);
    }

    public final void setWidthStrategy(@k WidthStrategy strategy) {
        int i12;
        Stepper stepper = this.f8182b;
        ViewGroup.LayoutParams layoutParams = stepper.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int iOrdinal = strategy.ordinal();
        if (iOrdinal == 0) {
            i12 = -1;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = -2;
        }
        layoutParams.width = i12;
        stepper.setLayoutParams(layoutParams);
    }

    @Override // LV.b
    public void setState(@k StepperState newState) {
        this.f8182b.setState(newState);
    }

    @Override // LV.d
    public void setStyle(@k i newStyle) {
        this.f8182b.setStyle(newStyle);
    }
}

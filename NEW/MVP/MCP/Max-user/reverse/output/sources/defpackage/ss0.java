package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes.dex */
public final class ss0 extends z4 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ss0(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.z4
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).d);
                break;
            case 5:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(ViewPager.class.getName());
                accessibilityEvent.setScrollable(false);
                accessibilityEvent.getEventType();
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.z4
    public final void d(View view, m5 m5Var) {
        int i = this.d;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = m5Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (!((vs0) obj).u0) {
                    accessibilityNodeInfo.setDismissable(false);
                    break;
                } else {
                    m5Var.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                    break;
                }
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = m5Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.o);
                accessibilityNodeInfo2.setChecked(checkableImageButton.d);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, m5Var.a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i2 = MaterialButtonToggleGroup.x0;
                int i3 = -1;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i4) == view) {
                                i3 = i5;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.c(i4)) {
                                    i5++;
                                }
                                i4++;
                            }
                        }
                    }
                }
                m5Var.i(l5.a(((MaterialButton) view).B0, 0, 1, i3, 1));
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo3 = m5Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                accessibilityNodeInfo3.setHintText(materialCalendar.t1.getVisibility() == 0 ? materialCalendar.y(s2d.mtrl_picker_toggle_to_year_selection) : materialCalendar.y(s2d.mtrl_picker_toggle_to_day_selection));
                break;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo4 = m5Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).v0);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, m5Var.a);
                m5Var.h(ViewPager.class.getName());
                m5Var.j(false);
                break;
        }
    }

    @Override // defpackage.z4
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 0:
                if (i == 1048576) {
                    vs0 vs0Var = (vs0) this.e;
                    if (vs0Var.u0) {
                        vs0Var.cancel();
                        break;
                    }
                }
                break;
            case 5:
                ViewPager viewPager = (ViewPager) this.e;
                if (!super.g(view, i, bundle)) {
                    if (i == 4096 || i == 8192) {
                        viewPager.getClass();
                    }
                    break;
                }
                break;
        }
        return super.g(view, i, bundle);
    }
}

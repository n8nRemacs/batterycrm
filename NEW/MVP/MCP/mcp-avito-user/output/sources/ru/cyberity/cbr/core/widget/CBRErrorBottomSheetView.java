package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import n11.RunnableC44167a;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;

/* compiled from: CBRErrorBottomSheetView.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 /2\u00020\u0001:\u0001/B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJU\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fR\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R*\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRErrorBottomSheetView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/G0;", "onDetachedFromWindow", "()V", "", "text", "primaryButton", "secondaryButton", "Lkotlin/Function0;", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "show", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;LY41/a;LY41/a;)V", ConstraintKt.CONDITION_FLOW_HIDE, "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/graphics/drawable/ColorDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/ColorDrawable;", "bottomSheet", "Landroid/view/View;", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "Landroid/widget/Button;", "Landroid/widget/Button;", "", "value", "dismissOnTouchOutside", "Z", "getDismissOnTouchOutside", "()Z", "setDismissOnTouchOutside", "(Z)V", "Ljava/lang/Runnable;", "showCallback", "Ljava/lang/Runnable;", "Companion", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRErrorBottomSheetView extends CoordinatorLayout {

    @k
    private final ColorDrawable backgroundDrawable;

    @l
    private BottomSheetBehavior<View> behavior;

    @k
    private final View bottomSheet;
    private boolean dismissOnTouchOutside;

    @l
    private final Button primaryButton;

    @l
    private final Button secondaryButton;

    @k
    private final Runnable showCallback;

    @l
    private final TextView text;

    @j
    public CBRErrorBottomSheetView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _set_dismissOnTouchOutside_$lambda-0, reason: not valid java name */
    public static final void m291_set_dismissOnTouchOutside_$lambda0(boolean z12, CBRErrorBottomSheetView cBRErrorBottomSheetView, View view) {
        if (z12) {
            cBRErrorBottomSheetView.hide();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void show$default(CBRErrorBottomSheetView cBRErrorBottomSheetView, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Y41.a aVar, Y41.a aVar2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = null;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = null;
        }
        if ((i12 & 4) != 0) {
            charSequence3 = null;
        }
        if ((i12 & 8) != 0) {
            aVar = null;
        }
        if ((i12 & 16) != 0) {
            aVar2 = null;
        }
        cBRErrorBottomSheetView.show(charSequence, charSequence2, charSequence3, aVar, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-6, reason: not valid java name */
    public static final void m292show$lambda6(Y41.a aVar, CBRErrorBottomSheetView cBRErrorBottomSheetView, View view) {
        if (aVar != null) {
            aVar.invoke();
        }
        cBRErrorBottomSheetView.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-7, reason: not valid java name */
    public static final void m293show$lambda7(Y41.a aVar, CBRErrorBottomSheetView cBRErrorBottomSheetView, View view) {
        if (aVar != null) {
            aVar.invoke();
        }
        cBRErrorBottomSheetView.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showCallback$lambda-1, reason: not valid java name */
    public static final void m294showCallback$lambda1(CBRErrorBottomSheetView cBRErrorBottomSheetView) {
        BottomSheetBehavior<View> bottomSheetBehavior = cBRErrorBottomSheetView.behavior;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.b(3);
    }

    public final boolean getDismissOnTouchOutside() {
        return this.dismissOnTouchOutside;
    }

    public final void hide() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.b(5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.showCallback);
    }

    public final void setDismissOnTouchOutside(boolean z12) {
        this.dismissOnTouchOutside = z12;
        setOnClickListener(new O91.j(5, this, z12));
    }

    public final void show(@l CharSequence text, @l CharSequence primaryButton, @l CharSequence secondaryButton, @l final Y41.a<G0> onPrimaryButtonClicked, @l final Y41.a<G0> onSecondaryButtonClicked) {
        TextView textView = this.text;
        if (textView != null) {
            s.a(textView, text);
        }
        Button button = this.primaryButton;
        if (button != null) {
            s.a(button, primaryButton);
        }
        Button button2 = this.secondaryButton;
        if (button2 != null) {
            s.a(button2, secondaryButton);
        }
        Button button3 = this.primaryButton;
        if (button3 != null) {
            final int i12 = 0;
            button3.setOnClickListener(new View.OnClickListener() { // from class: ru.cyberity.cbr.core.widget.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            CBRErrorBottomSheetView.m292show$lambda6(onPrimaryButtonClicked, this, view);
                            break;
                        default:
                            CBRErrorBottomSheetView.m293show$lambda7(onPrimaryButtonClicked, this, view);
                            break;
                    }
                }
            });
        }
        Button button4 = this.secondaryButton;
        if (button4 != null) {
            final int i13 = 1;
            button4.setOnClickListener(new View.OnClickListener() { // from class: ru.cyberity.cbr.core.widget.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            CBRErrorBottomSheetView.m292show$lambda6(onSecondaryButtonClicked, this, view);
                            break;
                        default:
                            CBRErrorBottomSheetView.m293show$lambda7(onSecondaryButtonClicked, this, view);
                            break;
                    }
                }
            });
        }
        setVisibility(0);
        postDelayed(this.showCallback, 250L);
    }

    public /* synthetic */ CBRErrorBottomSheetView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.cbr_BottomSheetViewStyle : i12);
    }

    @j
    public CBRErrorBottomSheetView(@k Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        ColorDrawable colorDrawable = new ColorDrawable(context.getResources().getColor(android.R.color.black));
        this.backgroundDrawable = colorDrawable;
        this.dismissOnTouchOutside = true;
        this.showCallback = new RunnableC44167a(this, 7);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.cbr_layout_error_bottom_sheet, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R.id.cbr_bottom_sheet);
        this.bottomSheet = viewFindViewById;
        this.text = (TextView) viewInflate.findViewById(R.id.cbr_text);
        this.primaryButton = (Button) viewInflate.findViewById(R.id.cbr_primary_button);
        this.secondaryButton = (Button) viewInflate.findViewById(R.id.cbr_secondary_button);
        ((ImageView) viewInflate.findViewById(R.id.cbr_start_icon)).setImageDrawable(n0.f432787a.getIconHandler().onResolveIcon(context, CBRIconHandler.CBRCommonIcons.WARNING_OUTLINE.getImageName()));
        colorDrawable.setAlpha(0);
        setBackground(colorDrawable);
        BottomSheetBehavior<View> bottomSheetBehaviorB = BottomSheetBehavior.B(viewFindViewById);
        bottomSheetBehaviorB.M(true);
        bottomSheetBehaviorB.f355974K = true;
        bottomSheetBehaviorB.f355973J = true;
        bottomSheetBehaviorB.v(new BottomSheetBehavior.c() { // from class: ru.cyberity.cbr.core.widget.CBRErrorBottomSheetView$3$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
            public void onSlide(@k View bottomSheet, float slideOffset) {
                this.this$0.backgroundDrawable.setAlpha((int) ((slideOffset + 1.0f) * 128));
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
            public void onStateChanged(@k View bottomSheet, int newState) {
                this.this$0.setVisibility(newState == 5 ? 8 : 0);
            }
        });
        this.behavior = bottomSheetBehaviorB;
        setDismissOnTouchOutside(true);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (isAttachedToWindow()) {
            BottomSheetBehavior bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.b(5);
            }
            setVisibility(8);
            return;
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.cyberity.cbr.core.widget.CBRErrorBottomSheetView$special$$inlined$doOnAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@k View view) {
                this.removeOnAttachStateChangeListener(this);
                BottomSheetBehavior bottomSheetBehavior2 = this.behavior;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.b(5);
                }
                this.setVisibility(8);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@k View view) {
            }
        });
    }
}

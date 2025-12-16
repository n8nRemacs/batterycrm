package com.avito.android.lib.design.toast_bar;

import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ToastBarView.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!¨\u0006'"}, d2 = {"Lcom/avito/android/lib/design/toast_bar/f;", "Lcom/avito/android/lib/design/toast_bar/i;", "", "F", "Ljava/lang/String;", "getActionText", "()Ljava/lang/String;", "setActionText", "(Ljava/lang/String;)V", "actionText", "Lkotlin/Function0;", "Lkotlin/G0;", "G", "LY41/a;", "getAction", "()LY41/a;", "setAction", "(LY41/a;)V", "action", "H", "getNegativeActionText", "setNegativeActionText", "negativeActionText", "I", "getNegativeAction", "setNegativeAction", "negativeAction", "", "J", "Z", "getContentHorizontal", "()Z", "setContentHorizontal", "(Z)V", "contentHorizontal", "K", "getCloseOnAction", "setCloseOnAction", "closeOnAction", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends i {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    @l
    public String actionText;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.a<G0> action;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    @l
    public String negativeActionText;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.a<G0> negativeAction;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public boolean contentHorizontal;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    public boolean closeOnAction;

    /* renamed from: L, reason: collision with root package name */
    public TextView f181076L;

    /* renamed from: M, reason: collision with root package name */
    public Button f181077M;

    /* renamed from: N, reason: collision with root package name */
    public Button f181078N;

    public /* synthetic */ f(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.toastBar : i12, (i14 & 8) != 0 ? R.style.Design_Widget_ToastBar_Default : i13);
    }

    @l
    public final Y41.a<G0> getAction() {
        return this.action;
    }

    @l
    public final String getActionText() {
        return this.actionText;
    }

    public final boolean getCloseOnAction() {
        return this.closeOnAction;
    }

    public final boolean getContentHorizontal() {
        return this.contentHorizontal;
    }

    @l
    public final Y41.a<G0> getNegativeAction() {
        return this.negativeAction;
    }

    @l
    public final String getNegativeActionText() {
        return this.negativeActionText;
    }

    @Override // com.avito.android.lib.design.toast_bar.i
    public final void h(@Y61.k LayoutInflater layoutInflater) {
        layoutInflater.inflate(R.layout.design_toast_bar, (ViewGroup) this, true);
        this.f181076L = (TextView) findViewById(R.id.text);
        this.f181077M = (Button) findViewById(R.id.actionButton);
        this.f181078N = (Button) findViewById(R.id.negativeActionButton);
    }

    @Override // com.avito.android.lib.design.toast_bar.i
    public final void i() {
        TextView textView = this.f181076L;
        if (textView == null) {
            textView = null;
        }
        textView.setText(getText());
        TextView textView2 = this.f181076L;
        D6.c(textView2 == null ? null : textView2, null, Integer.valueOf(getTextVerticalOffsetPx()), null, null, 13);
        Button button = this.f181077M;
        if (button == null) {
            button = null;
        }
        String str = this.actionText;
        if (str == null) {
            str = "";
        }
        button.setText(str);
        Button button2 = this.f181077M;
        if (button2 == null) {
            button2 = null;
        }
        final int i12 = 0;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.lib.design.toast_bar.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f181069c;

            {
                this.f181069c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        f fVar = this.f181069c;
                        Y41.a<G0> aVar = fVar.action;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        if (fVar.closeOnAction) {
                            fVar.f();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar2 = this.f181069c.negativeAction;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        Button button3 = this.f181078N;
        if (button3 == null) {
            button3 = null;
        }
        String str2 = this.negativeActionText;
        button3.setText(str2 != null ? str2 : "");
        Button button4 = this.f181078N;
        if (button4 == null) {
            button4 = null;
        }
        final int i13 = 1;
        button4.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.lib.design.toast_bar.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f181069c;

            {
                this.f181069c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        f fVar = this.f181069c;
                        Y41.a<G0> aVar = fVar.action;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        if (fVar.closeOnAction) {
                            fVar.f();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar2 = this.f181069c.negativeAction;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        boolean z12 = this.actionText != null;
        boolean z13 = this.negativeActionText != null;
        Button button5 = this.f181077M;
        if (button5 == null) {
            button5 = null;
        }
        button5.setVisibility(z12 ? 0 : 8);
        Button button6 = this.f181078N;
        if (button6 == null) {
            button6 = null;
        }
        button6.setVisibility(z13 ? 0 : 8);
        if (z12 || z13) {
            boolean z14 = this.contentHorizontal;
            if (z14) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                TextView textView3 = this.f181076L;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                Button button7 = this.f181077M;
                if (button7 == null) {
                    button7 = null;
                }
                button7.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                Button button8 = this.f181078N;
                if (button8 == null) {
                    button8 = null;
                }
                button8.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                TextView textView4 = this.f181076L;
                if (textView4 == null) {
                    textView4 = null;
                }
                int measuredWidth = textView4.getMeasuredWidth();
                Button button9 = this.f181077M;
                if (button9 == null) {
                    button9 = null;
                }
                int rightItemToTextHorizontalSpacing = getRightItemToTextHorizontalSpacing() + button9.getMeasuredWidth() + measuredWidth;
                if (this.negativeActionText != null) {
                    Button button10 = this.f181078N;
                    if (button10 == null) {
                        button10 = null;
                    }
                    int measuredWidth2 = button10.getMeasuredWidth();
                    Button button11 = this.f181078N;
                    if (button11 == null) {
                        button11 = null;
                    }
                    ViewGroup.LayoutParams layoutParams = button11.getLayoutParams();
                    rightItemToTextHorizontalSpacing += measuredWidth2 + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
                }
                z14 = rightItemToTextHorizontalSpacing <= (((getDisplayWidthPx() - getMarginLeftPx()) - getMarginRightPx()) - getToastBarPaddingLeftPx()) - getToastBarPaddingRightPx();
            }
            if (!z14) {
                setOrientation(1);
                Button button12 = this.f181077M;
                D6.c(button12 == null ? null : button12, null, Integer.valueOf(getRightItemToTextVerticalSpacing()), null, null, 13);
                return;
            }
            TextView textView5 = this.f181076L;
            View view = textView5 != null ? textView5 : null;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.setMargins(((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, 0, ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
            layoutParams3.width = 0;
            layoutParams3.weight = 1.0f;
            view.setLayoutParams(layoutParams3);
        }
    }

    public final void setAction(@l Y41.a<G0> aVar) {
        this.action = aVar;
    }

    public final void setActionText(@l String str) {
        this.actionText = str;
    }

    public final void setCloseOnAction(boolean z12) {
        this.closeOnAction = z12;
    }

    public final void setContentHorizontal(boolean z12) {
        this.contentHorizontal = z12;
    }

    public final void setNegativeAction(@l Y41.a<G0> aVar) {
        this.negativeAction = aVar;
    }

    public final void setNegativeActionText(@l String str) {
        this.negativeActionText = str;
    }

    @X41.j
    public f(@Y61.k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.contentHorizontal = true;
        setOrientation(0);
        setGravity(8388627);
        setBackgroundResource(R.drawable.design_background_toastbar);
    }
}

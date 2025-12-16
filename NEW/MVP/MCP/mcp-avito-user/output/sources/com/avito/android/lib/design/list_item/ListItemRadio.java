package com.avito.android.lib.design.list_item;

import Au.C13079a;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.h;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35821j2;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import j.f0;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.c;
import kotlin.jvm.internal.s0;
import lV.InterfaceC43686b;
import lV.e;

/* compiled from: ListItemRadio.kt */
@s0
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001:\u0001TB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b!\u0010\fJ\u0015\u0010\"\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\"\u0010\fJ\u0017\u0010%\u001a\u00020\n2\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0017\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010'¢\u0006\u0004\b%\u0010(J\u0017\u0010+\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\fJ\u0019\u00100\u001a\u00020\n2\b\b\u0003\u0010/\u001a\u00020#H\u0007¢\u0006\u0004\b0\u0010&J\u0019\u00103\u001a\u00020\n2\n\b\u0002\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u001b\u0010@\u001a\u00020\n2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020#H\u0016¢\u0006\u0004\bC\u0010&J\u0017\u0010D\u001a\u00020\n2\b\b\u0001\u0010B\u001a\u00020#¢\u0006\u0004\bD\u0010&J\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020EH\u0002¢\u0006\u0004\b\u000f\u0010FJ\u0017\u0010G\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bG\u0010\u0018R\u001c\u0010M\u001a\u0004\u0018\u00010H8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR.\u0010S\u001a\u0004\u0018\u00010H2\b\u0010N\u001a\u0004\u0018\u00010H8\u0014@VX\u0094\u000e¢\u0006\u0012\n\u0004\bO\u0010J\u001a\u0004\bP\u0010L\"\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemRadio;", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Lkotlin/G0;", "setEnabled", "(Z)V", "LlV/b;", "newStyle", "setStyle", "(LlV/b;)V", "LkV/b;", "newState", "setState", "(LkV/b;)V", "Lcom/avito/android/lib/design/list_item/ListItemRadio$RadioButtonPosition;", "radioButtonPosition", "setRadioButtonPositionNonUdf", "(Lcom/avito/android/lib/design/list_item/ListItemRadio$RadioButtonPosition;)V", "Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;", "alignment", "setRightAlignmentNonUdf", "(Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;)V", "", VoiceInfo.STATE, "setRadioState", "([I)V", "setIconDuplicateParentStateEnabled", "setIconEnabled", "", "color", "setImageColor", "(I)V", "Landroid/content/res/ColorStateList;", "(Landroid/content/res/ColorStateList;)V", "Landroid/view/View$OnClickListener;", "listener", "setImageClickedListener", "(Landroid/view/View$OnClickListener;)V", BeduinCartItemModel.CHECKED_STRING, "setChecked", "drawableRes", "setImageResource", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/graphics/Bitmap;", "bitmap", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "", "text", "setSecondSubtitle", "(Ljava/lang/CharSequence;)V", "", "Landroid/view/View;", "contentViews", "setCustomContent", "(Ljava/util/List;)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "setRadioAppearance", "LlV/e;", "(LlV/e;)V", "setRadioButtonPosition", "Lcom/avito/android/lib/design/toggle/RadioButton;", "r", "Lcom/avito/android/lib/design/toggle/RadioButton;", "getRadio", "()Lcom/avito/android/lib/design/toggle/RadioButton;", "radio", "<set-?>", "w", "getButtonView", "setButtonView", "(Lcom/avito/android/lib/design/toggle/RadioButton;)V", "buttonView", "RadioButtonPosition", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class ListItemRadio extends ListItemCompoundButton {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f179549A = 0;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final ImageView f179550q;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @l
    public final RadioButton radio;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final LinearLayout f179552s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final FrameLayout f179553t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final TextView f179554u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public final RadioButton f179555v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @l
    public RadioButton buttonView;

    /* renamed from: x, reason: collision with root package name */
    @l
    public e f179557x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public kV.e f179558y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public C13079a f179559z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListItemRadio.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemRadio$RadioButtonPosition;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RadioButtonPosition {

        /* renamed from: b, reason: collision with root package name */
        public static final RadioButtonPosition f179560b;

        /* renamed from: c, reason: collision with root package name */
        public static final RadioButtonPosition f179561c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ RadioButtonPosition[] f179562d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f179563e;

        static {
            RadioButtonPosition radioButtonPosition = new RadioButtonPosition("START", 0);
            f179560b = radioButtonPosition;
            RadioButtonPosition radioButtonPosition2 = new RadioButtonPosition("END", 1);
            f179561c = radioButtonPosition2;
            RadioButtonPosition[] radioButtonPositionArr = {radioButtonPosition, radioButtonPosition2};
            f179562d = radioButtonPositionArr;
            f179563e = c.a(radioButtonPositionArr);
        }

        public RadioButtonPosition() {
            throw null;
        }

        public static RadioButtonPosition valueOf(String str) {
            return (RadioButtonPosition) Enum.valueOf(RadioButtonPosition.class, str);
        }

        public static RadioButtonPosition[] values() {
            return (RadioButtonPosition[]) f179562d.clone();
        }
    }

    /* compiled from: ListItemRadio.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[RadioButtonPosition.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RadioButtonPosition radioButtonPosition = RadioButtonPosition.f179560b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ListItemRadio(@l Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.listItemRadio);
        this.f179550q = (ImageView) findViewById(R.id.design_item_icon);
        RadioButton radioButton = (RadioButton) findViewById(R.id.design_item_radio);
        this.radio = radioButton;
        this.f179552s = (LinearLayout) findViewById(R.id.design_item_text_container);
        this.f179553t = (FrameLayout) findViewById(R.id.design_item_title_right_container);
        this.f179554u = (TextView) findViewById(R.id.design_item_second_subtitle);
        this.f179555v = (RadioButton) findViewById(R.id.design_right_item_radio);
        this.buttonView = radioButton;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178951V, R.attr.listItemRadio, R.style.Design_Widget_ListItemRadio);
        e.a aVar = e.f413793h;
        Context context2 = getContext();
        aVar.getClass();
        setStyle(e.a.c(typedArrayObtainStyledAttributes, context2));
        int i12 = typedArrayObtainStyledAttributes.getInt(4, -1);
        BaseListItem.Alignment alignment = i12 != 0 ? i12 != 1 ? null : BaseListItem.Alignment.f179501c : BaseListItem.Alignment.f179500b;
        if (alignment != null) {
            AlignmentFrameLayout alignmentFrameLayout = this.f179494g;
            if (alignmentFrameLayout != null) {
                d(alignmentFrameLayout, alignment, alignment);
            }
            AlignmentFrameLayout alignmentFrameLayout2 = this.f179495h;
            if (alignmentFrameLayout2 != null) {
                d(alignmentFrameLayout2, alignment, alignment);
            }
        } else {
            BaseListItem.Alignment alignment2 = BaseListItem.Alignment.f179500b;
            BaseListItem.Alignment alignment3 = BaseListItem.Alignment.f179501c;
            AlignmentFrameLayout alignmentFrameLayout3 = this.f179494g;
            if (alignmentFrameLayout3 != null) {
                d(alignmentFrameLayout3, alignment2, alignment3);
            }
            AlignmentFrameLayout alignmentFrameLayout4 = this.f179495h;
            if (alignmentFrameLayout4 != null) {
                d(alignmentFrameLayout4, alignment2, alignment3);
            }
        }
        b();
        c();
        setEnabled(isEnabled());
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setRadioButtonPosition(RadioButtonPosition radioButtonPosition) {
        RadioButton buttonView = getButtonView();
        if (buttonView != null) {
            buttonView.setOnCheckedChangeListener(null);
        }
        RadioButton radioButton = this.radio;
        if (radioButton != null) {
            D6.w(radioButton);
        }
        RadioButton radioButton2 = this.f179555v;
        if (radioButton2 != null) {
            D6.w(radioButton2);
        }
        int iOrdinal = radioButtonPosition.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            radioButton = radioButton2;
        }
        setButtonView(radioButton);
        D6.H(getButtonView());
        RadioButton buttonView2 = getButtonView();
        if (buttonView2 != null) {
            buttonView2.setOnCheckedChangeListener(new h(this, 2));
        }
        b();
        c();
        requestLayout();
        invalidate();
    }

    @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton
    public void g(@k C13079a c13079a) {
        this.f179559z = c13079a;
        RadioButton buttonView = getButtonView();
        if (buttonView != null) {
            buttonView.setOnCheckedChangeListener(new com.avito.android.lib.deprecated_design.radio_button.c(3, c13079a, this));
        }
    }

    @l
    public final RadioButton getRadio() {
        return this.radio;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        RadioButton radioButton = this.radio;
        if (!(radioButton != null ? radioButton.isChecked() : false)) {
            RadioButton radioButton2 = this.f179555v;
            if (!(radioButton2 != null ? radioButton2.isChecked() : false)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem, pK0.InterfaceC46971a
    public void setAppearance(int style) {
        e.a aVar = e.f413793h;
        Context context = getContext();
        aVar.getClass();
        setStyle(e.a.b(style, context));
    }

    public void setButtonView(@l RadioButton radioButton) {
        this.buttonView = radioButton;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        RadioButton radioButton = this.radio;
        if (radioButton != null) {
            radioButton.setChecked(checked);
        }
        RadioButton radioButton2 = this.f179555v;
        if (radioButton2 == null) {
            return;
        }
        radioButton2.setChecked(checked);
    }

    public final void setCustomContent(@k List<? extends View> contentViews) {
        LinearLayout linearLayout = this.f179552s;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        for (View view : contentViews) {
            if (linearLayout != null) {
                linearLayout.addView(view);
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ImageView imageView = this.f179550q;
        if (imageView != null && imageView.isDuplicateParentStateEnabled()) {
            imageView.setEnabled(enabled);
        }
        RadioButton radioButton = this.radio;
        if (radioButton != null) {
            radioButton.setEnabled(enabled);
        }
        RadioButton radioButton2 = this.f179555v;
        if (radioButton2 == null) {
            return;
        }
        radioButton2.setEnabled(enabled);
    }

    public final void setIconDuplicateParentStateEnabled(boolean enabled) {
        ImageView imageView = this.f179550q;
        if (imageView != null) {
            imageView.setDuplicateParentStateEnabled(enabled);
        }
        if (!enabled || imageView == null) {
            return;
        }
        imageView.setEnabled(isEnabled());
    }

    public final void setIconEnabled(boolean enabled) {
        ImageView imageView = this.f179550q;
        if (imageView == null || imageView.isDuplicateParentStateEnabled()) {
            return;
        }
        imageView.setEnabled(enabled);
    }

    public final void setImageBitmap(@l Bitmap bitmap) {
        ImageView imageView = this.f179550q;
        if (bitmap != null) {
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
            if (imageView != null) {
                D6.H(imageView);
            }
        } else if (imageView != null) {
            D6.w(imageView);
        }
        c();
    }

    public final void setImageClickedListener(@l View.OnClickListener listener) {
        ImageView imageView = this.f179550q;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setImageColor(@InterfaceC42156l int color) {
        setImageColor(ColorStateList.valueOf(color));
    }

    public final void setImageDrawable(@l Drawable drawable) {
        ImageView imageView = this.f179550q;
        if (imageView != null) {
            C35821j2.a(imageView, drawable);
        }
        c();
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public final void setImageResource(@InterfaceC42165v int drawableRes) {
        Integer numValueOf = Integer.valueOf(drawableRes);
        Drawable drawable = null;
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            drawable = getContext().getDrawable(numValueOf.intValue());
        }
        setImageDrawable(drawable);
    }

    public final void setRadioAppearance(@f0 int style) {
        RadioButton radioButton = this.radio;
        if (radioButton != null) {
            radioButton.setAppearance(style);
        }
    }

    @InterfaceC42830m
    public final void setRadioButtonPositionNonUdf(@k RadioButtonPosition radioButtonPosition) {
        setRadioButtonPosition(radioButtonPosition);
    }

    public final void setRadioState(@k int[] state) {
        RadioButton radioButton = this.radio;
        if (radioButton != null) {
            radioButton.setState(state);
        }
        RadioButton radioButton2 = this.f179555v;
        if (radioButton2 != null) {
            radioButton2.setState(state);
        }
    }

    @InterfaceC42830m
    public final void setRightAlignmentNonUdf(@k BaseListItem.Alignment alignment) {
        AlignmentFrameLayout alignmentFrameLayout = this.f179495h;
        if (alignmentFrameLayout != null) {
            d(alignmentFrameLayout, alignment, alignment);
        }
    }

    public final void setSecondSubtitle(@l CharSequence text) {
        TextView textView = this.f179554u;
        if (textView != null) {
            I5.a(textView, text, false);
        }
        if (textView == null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        RadioButton radioButton = this.radio;
        if (radioButton != null && radioButton.getVisibility() == 0) {
            radioButton.toggle();
        }
        RadioButton radioButton2 = this.f179555v;
        if (radioButton2 == null || radioButton2.getVisibility() != 0) {
            return;
        }
        radioButton2.toggle();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setStyle(lV.e r8) {
        /*
            r7 = this;
            lV.e r0 = r7.f179557x
            com.avito.android.lib.util.c r1 = new com.avito.android.lib.util.c
            r1.<init>(r8, r0)
            boolean r1 = r1.f181333c
            if (r1 != 0) goto Lca
            if (r8 == 0) goto Lca
            r7.f179557x = r8
            r1 = 0
            if (r0 == 0) goto L15
            lV.a r2 = r0.f413794a
            goto L16
        L15:
            r2 = r1
        L16:
            com.avito.android.lib.util.c r3 = new com.avito.android.lib.util.c
            lV.a r4 = r8.f413794a
            r3.<init>(r4, r2)
            boolean r2 = r3.f181333c
            if (r2 != 0) goto L26
            if (r4 == 0) goto L26
            super.setStyle(r4)
        L26:
            if (r0 == 0) goto L2b
            com.avito.android.lib.design.toggle.a r2 = r0.f413795b
            goto L2c
        L2b:
            r2 = r1
        L2c:
            com.avito.android.lib.util.c r3 = new com.avito.android.lib.util.c
            com.avito.android.lib.design.toggle.a r5 = r8.f413795b
            r3.<init>(r5, r2)
            boolean r2 = r3.f181333c
            if (r2 != 0) goto L47
            if (r5 == 0) goto L47
            com.avito.android.lib.design.toggle.RadioButton r2 = r7.radio
            if (r2 == 0) goto L40
            r2.setStyle(r5)
        L40:
            com.avito.android.lib.design.toggle.RadioButton r2 = r7.f179555v
            if (r2 == 0) goto L47
            r2.setStyle(r5)
        L47:
            if (r0 == 0) goto L4c
            com.avito.android.util.c0 r2 = r0.f413796c
            goto L4d
        L4c:
            r2 = r1
        L4d:
            com.avito.android.lib.util.c r3 = new com.avito.android.lib.util.c
            com.avito.android.util.c0 r6 = r8.f413796c
            r3.<init>(r6, r2)
            boolean r2 = r3.f181333c
            if (r2 != 0) goto L61
            if (r6 == 0) goto L61
            android.content.res.ColorStateList r2 = r6.b()
            r7.setImageColor(r2)
        L61:
            if (r0 == 0) goto L66
            com.avito.android.lib.design.toggle.a r2 = r0.f413795b
            goto L67
        L66:
            r2 = r1
        L67:
            boolean r2 = kotlin.jvm.internal.L.f(r5, r2)
            if (r2 == 0) goto L85
            if (r0 == 0) goto L72
            com.avito.android.util.c0 r2 = r0.f413796c
            goto L73
        L72:
            r2 = r1
        L73:
            boolean r2 = kotlin.jvm.internal.L.f(r6, r2)
            if (r2 == 0) goto L85
            if (r0 == 0) goto L7e
            lV.a r2 = r0.f413794a
            goto L7f
        L7e:
            r2 = r1
        L7f:
            boolean r2 = kotlin.jvm.internal.L.f(r4, r2)
            if (r2 != 0) goto L88
        L85:
            r7.requestLayout()
        L88:
            if (r0 == 0) goto L8d
            android.graphics.drawable.Drawable r2 = r0.f413798e
            goto L8e
        L8d:
            r2 = r1
        L8e:
            android.graphics.drawable.Drawable r3 = r8.f413798e
            boolean r2 = kotlin.jvm.internal.L.f(r3, r2)
            if (r2 != 0) goto L9a
            r7.setImageDrawable(r3)
            goto Lb0
        L9a:
            if (r3 != 0) goto Lb0
            android.widget.ImageView r2 = r7.f179550q
            if (r2 == 0) goto Lb0
            boolean r3 = com.avito.android.util.D6.y(r2)
            r4 = 1
            if (r3 != r4) goto Lb0
            com.avito.android.util.D6.w(r2)
            r7.b()
            r7.c()
        Lb0:
            if (r0 == 0) goto Lb4
            com.avito.android.lib.design.list_item.BaseListItem$Alignment r1 = r0.f413799f
        Lb4:
            com.avito.android.lib.util.c r0 = new com.avito.android.lib.util.c
            com.avito.android.lib.design.list_item.BaseListItem$Alignment r8 = r8.f413799f
            r0.<init>(r8, r1)
            boolean r0 = r0.f181333c
            if (r0 != 0) goto Lca
            if (r8 == 0) goto Lca
            com.avito.android.lib.design.list_item.BaseListItem$Alignment r0 = com.avito.android.lib.design.list_item.BaseListItem.Alignment.f179500b
            com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout r1 = r7.f179495h
            if (r1 == 0) goto Lca
            r7.d(r1, r0, r8)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.list_item.ListItemRadio.setStyle(lV.e):void");
    }

    @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton
    @l
    public RadioButton getButtonView() {
        return this.buttonView;
    }

    public final void setImageColor(@l ColorStateList color) {
        ImageView imageView = this.f179550q;
        if (imageView == null) {
            return;
        }
        imageView.setImageTintList(color);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0133  */
    @Override // com.avito.android.lib.design.list_item.BaseListItem, LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k kV.b r18) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.list_item.ListItemRadio.setState(kV.b):void");
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem, LV.d
    public void setStyle(@k InterfaceC43686b newStyle) {
        if (newStyle instanceof e) {
            setStyle((e) newStyle);
        }
    }
}

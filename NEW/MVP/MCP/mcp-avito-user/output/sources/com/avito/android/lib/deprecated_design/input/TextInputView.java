package com.avito.android.lib.deprecated_design.input;

import Y61.k;
import Y61.l;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import ca1.C27140f;
import com.avito.android.util.C35777d6;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.TypefaceType;
import fw.C40487a;
import hw.InterfaceC41179d;
import j.f0;
import java.util.Arrays;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlin.reflect.n;

/* compiled from: TextInputView.kt */
@s0
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002deJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\u00052\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R+\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0010R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R.\u0010.\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R?\u00109\u001a\u001f\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u0005\u0018\u00010/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R?\u0010>\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u0005\u0018\u00010/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b;\u00104\u001a\u0004\b<\u00106\"\u0004\b=\u00108R*\u0010D\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00038\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\u0007R+\u0010H\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u001e8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u0013\u001a\u0004\bF\u0010\"\"\u0004\bG\u0010$R*\u0010L\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00038\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010@\u001a\u0004\bJ\u0010B\"\u0004\bK\u0010\u0007R(\u0010R\u001a\u0004\u0018\u00010M2\b\u0010'\u001a\u0004\u0018\u00010M8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010U\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u0010\"\"\u0004\bT\u0010$R$\u0010[\u001a\u00020V2\u0006\u0010'\u001a\u00020V8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010\n\u001a\u00020V2\u0006\u0010'\u001a\u00020V8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010ZR$\u0010`\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b^\u0010B\"\u0004\b_\u0010\u0007R$\u0010c\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\ba\u0010B\"\u0004\bb\u0010\u0007¨\u0006f"}, d2 = {"Lcom/avito/android/lib/deprecated_design/input/TextInputView;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/lib/deprecated_design/input/b;", "", "stringId", "Lkotlin/G0;", "setHintResId", "(I)V", "", "", "hint", "setAutofillHints", "([Ljava/lang/String;)V", "Landroid/widget/EditText;", "editText", "setEditView", "(Landroid/widget/EditText;)V", "<set-?>", "b", "Lkotlin/properties/h;", "getCurrentEditText", "()Landroid/widget/EditText;", "setCurrentEditText", "currentEditText", "Landroid/graphics/drawable/Drawable;", "e", "Lkotlin/C;", "getBorderDrawable", "()Landroid/graphics/drawable/Drawable;", "borderDrawable", "", "f", "Z", "getDrawBorder", "()Z", "setDrawBorder", "(Z)V", "drawBorder", "Landroid/text/TextWatcher;", "value", "g", "Landroid/text/TextWatcher;", "getTextChangeListener", "()Landroid/text/TextWatcher;", "setTextChangeListener", "(Landroid/text/TextWatcher;)V", "textChangeListener", "Lkotlin/Function1;", "Lkotlin/S;", "name", "hasFocus", "h", "LY41/l;", "getFocusChangeListener", "()LY41/l;", "setFocusChangeListener", "(LY41/l;)V", "focusChangeListener", "actionId", "i", "getActionListener", "setActionListener", "actionListener", "j", "I", "getTextLength", "()I", "setTextLength", "textLength", "k", "getHasError", "setHasError", "hasError", "l", "getMaxLines", "setMaxLines", "maxLines", "Landroid/text/method/TransformationMethod;", "getTransformationMethod", "()Landroid/text/method/TransformationMethod;", "setTransformationMethod", "(Landroid/text/method/TransformationMethod;)V", "transformationMethod", "getEnable", "setEnable", "enable", "", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "getHint", "setHint", "getInputType", "setInputType", "inputType", "getImeOptions", "setImeOptions", "imeOptions", "a", "SavedState", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class TextInputView extends FrameLayout implements b {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f178012o;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public final kotlin.properties.h currentEditText;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final j f178014c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ValueAnimator f178015d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C borderDrawable;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean drawBorder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    public TextWatcher textChangeListener;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.l<? super Boolean, G0> focusChangeListener;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.l<? super Integer, G0> actionListener;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int textLength;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final e f178022k;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int maxLines;

    /* renamed from: m, reason: collision with root package name */
    public final int f178024m;

    /* renamed from: n, reason: collision with root package name */
    public final int f178025n;

    /* compiled from: TextInputView.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/input/TextInputView$SavedState;", "Landroid/view/AbsSavedState;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends AbsSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f178026b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Parcelable f178027c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Parcelable f178028d;

        /* compiled from: TextInputView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readInt() != 0, parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(boolean z12, @k Parcelable parcelable, @k Parcelable parcelable2) {
            super(parcelable2);
            this.f178026b = z12;
            this.f178027c = parcelable;
            this.f178028d = parcelable2;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f178026b ? 1 : 0);
            parcel.writeParcelable(this.f178027c, i12);
            parcel.writeParcelable(this.f178028d, i12);
        }
    }

    /* compiled from: TextInputView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/lib/deprecated_design/input/TextInputView$a;", "", "<init>", "()V", "", "ANIMATION_DURATION", "J", "", "COLLAPSED_FRACTION", "F", "EXPANDED_FRACTION", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        Y y12 = new Y(TextInputView.class, "currentEditText", "getCurrentEditText()Landroid/widget/EditText;", 0);
        n0 n0Var = m0.f406844a;
        f178012o = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(TextInputView.class, "hasError", "getHasError()Z", 0, n0Var)};
        new a(null);
    }

    @X41.j
    public TextInputView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static final void a(TextInputView textInputView) {
        String[] strArr;
        EditText currentEditText = textInputView.getCurrentEditText();
        int i12 = textInputView.getHasError() ? textInputView.f178025n : textInputView.f178024m;
        currentEditText.setOnFocusChangeListener(null);
        com.avito.android.lib.design.input.a aVarD = textInputView.d(i12);
        aVarD.setImeOptions(currentEditText.getImeOptions());
        aVarD.setInputType(currentEditText.getInputType());
        aVarD.onRestoreInstanceState(currentEditText.onSaveInstanceState());
        String[] autofillHints = currentEditText.getAutofillHints();
        if (autofillHints == null || (strArr = (String[]) C42756l.B(autofillHints).toArray(new String[0])) == null) {
            strArr = new String[0];
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        aVarD.setAutofillHints((String[]) Arrays.copyOf(strArr2, strArr2.length));
        if (textInputView.getMaxLines() < Integer.MAX_VALUE) {
            int maxLines = textInputView.getMaxLines();
            aVarD.setMaxLines(maxLines);
            aVarD.setSingleLine(maxLines == 1);
        }
        if (textInputView.getTextLength() < Integer.MAX_VALUE) {
            aVarD.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(textInputView.getTextLength())});
        }
        if (textInputView.getTextChangeListener() != null) {
            aVarD.addTextChangedListener(textInputView.getTextChangeListener());
        }
        EditText currentEditText2 = textInputView.getCurrentEditText();
        boolean zHasFocus = currentEditText2.hasFocus();
        textInputView.setEditView(aVarD);
        if (zHasFocus) {
            K2.i(aVarD);
        }
        textInputView.removeView(currentEditText2);
    }

    private final Drawable getBorderDrawable() {
        return (Drawable) this.borderDrawable.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final EditText getCurrentEditText() {
        return (EditText) this.currentEditText.getValue(this, f178012o[0]);
    }

    private final void setCurrentEditText(EditText editText) {
        this.currentEditText.setValue(this, f178012o[0], editText);
    }

    private final void setEditView(EditText editText) {
        setCurrentEditText(editText);
        addView(getCurrentEditText());
    }

    public final void b(float f12) {
        j jVar = this.f178014c;
        if (jVar.a() == f12) {
            return;
        }
        ValueAnimator valueAnimator = this.f178015d;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fA2 = jVar.a();
        float fA3 = jVar.a();
        if (fA2 == 0.0f) {
            fA3 += 0.005f;
        }
        valueAnimator.setFloatValues(fA3, f12);
        valueAnimator.start();
    }

    public final int[] c(boolean z12) {
        return new int[]{isEnabled() ? R.attr.state_enabled : -16842910, isFocused() ? R.attr.state_focused : -16842908, z12 ? R.attr.state_pressed : -16842919};
    }

    public final com.avito.android.lib.design.input.a d(@f0 int i12) {
        com.avito.android.lib.design.input.a aVar = new com.avito.android.lib.design.input.a(new ContextThemeWrapper(getContext(), i12), null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = getResources().getDimensionPixelSize(com.avito.android.R.dimen.text_input_top_padding);
        aVar.setLayoutParams(layoutParams);
        aVar.setBackground(new ColorDrawable(0));
        aVar.setPadding(0, 0, 0, 0);
        aVar.setTextSize(0, getResources().getDimensionPixelSize(com.avito.android.R.dimen.text_input_text_size));
        Context context = getContext();
        TypefaceType typefaceType = TypefaceType.f318743c;
        int i13 = C35777d6.f318863a;
        aVar.setTypeface(androidx.core.content.res.i.c(C35835l0.j(com.avito.android.R.attr.fontRegular, context), context));
        aVar.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 11));
        aVar.setOnEditorActionListener(new C27140f(this, 7));
        aVar.addTextChangedListener(new d(this));
        return aVar;
    }

    @Override // android.view.View
    public final void draw(@k Canvas canvas) {
        super.draw(canvas);
        j jVar = this.f178014c;
        jVar.getClass();
        n<?>[] nVarArr = j.f178036u;
        n<?> nVar = nVarArr[3];
        i iVar = jVar.f178042f;
        canvas.drawText(iVar.getValue(jVar, nVar), 0, iVar.getValue(jVar, nVarArr[3]).length(), jVar.f178052p, jVar.f178053q, jVar.f178043g);
        if (this.drawBorder) {
            getBorderDrawable().draw(canvas);
        }
    }

    public final void e() {
        getCurrentEditText().setText(getText());
    }

    public final void f() {
        float f12 = (getCurrentEditText().getText().length() <= 0 && !hasFocus()) ? 1.0f : 0.0f;
        j jVar = this.f178014c;
        jVar.getClass();
        jVar.f178040d.setValue(jVar, j.f178036u[2], Float.valueOf(f12));
    }

    @l
    public Y41.l<Integer, G0> getActionListener() {
        return this.actionListener;
    }

    public final boolean getDrawBorder() {
        return this.drawBorder;
    }

    public boolean getEnable() {
        return getCurrentEditText().isEnabled();
    }

    @l
    public Y41.l<Boolean, G0> getFocusChangeListener() {
        return this.focusChangeListener;
    }

    public boolean getHasError() {
        return this.f178022k.getValue(this, f178012o[1]).booleanValue();
    }

    @k
    public CharSequence getHint() {
        j jVar = this.f178014c;
        jVar.getClass();
        return jVar.f178042f.getValue(jVar, j.f178036u[3]);
    }

    public int getImeOptions() {
        return getCurrentEditText().getImeOptions();
    }

    public int getInputType() {
        return getCurrentEditText().getInputType();
    }

    public int getMaxLines() {
        return this.maxLines;
    }

    @k
    public CharSequence getText() {
        return getCurrentEditText().getText();
    }

    @l
    public TextWatcher getTextChangeListener() {
        return this.textChangeListener;
    }

    public int getTextLength() {
        return this.textLength;
    }

    @l
    public final TransformationMethod getTransformationMethod() {
        return getCurrentEditText().getTransformationMethod();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@k MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        int paddingLeft = getPaddingLeft();
        int height = getHeight();
        j jVar = this.f178014c;
        jVar.f178041e = height;
        jVar.f178052p = paddingLeft;
        jVar.f178055s = height != 0 ? (jVar.f178044h / 4.0f) + (height / 2.0f) : 0.0f;
        jVar.f178056t = height != 0 ? jVar.f178046j + jVar.f178054r : 0.0f;
        jVar.b();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setHasError(savedState.f178026b);
        getCurrentEditText().onRestoreInstanceState(savedState.f178027c);
        f();
    }

    @Override // android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        return new SavedState(getHasError(), getCurrentEditText().onSaveInstanceState(), super.onSaveInstanceState());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@k MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
            getBackground().setState(c(true));
        } else if (action == 1 || action == 3) {
            getBackground().setState(c(false));
        }
        float fC2 = s.c(motionEvent.getX() - getCurrentEditText().getLeft(), getCurrentEditText().getWidth());
        float fC3 = s.c(motionEvent.getY() - getCurrentEditText().getTop(), getCurrentEditText().getHeight());
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(fC2, fC3);
        if (getCurrentEditText().onTouchEvent(motionEventObtain)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionListener(@l Y41.l<? super Integer, G0> lVar) {
        this.actionListener = lVar;
    }

    @Override // android.view.View
    public void setAutofillHints(@k String... hint) {
        EditText currentEditText = getCurrentEditText();
        String[] strArr = (String[]) Arrays.copyOf(hint, hint.length);
        currentEditText.setAutofillHints((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void setDrawBorder(boolean z12) {
        this.drawBorder = z12;
    }

    public void setEnable(boolean z12) {
        getCurrentEditText().setEnabled(z12);
    }

    public void setFocusChangeListener(@l Y41.l<? super Boolean, G0> lVar) {
        this.focusChangeListener = lVar;
    }

    public void setHasError(boolean z12) {
        this.f178022k.setValue(this, f178012o[1], Boolean.valueOf(z12));
    }

    public void setHint(@k CharSequence charSequence) {
        j jVar = this.f178014c;
        jVar.getClass();
        jVar.f178042f.setValue(jVar, j.f178036u[3], charSequence);
    }

    public void setHintResId(int stringId) {
        String string = getContext().getString(stringId);
        j jVar = this.f178014c;
        jVar.getClass();
        jVar.f178042f.setValue(jVar, j.f178036u[3], string);
    }

    public void setImeOptions(int i12) {
        getCurrentEditText().setImeOptions(i12);
    }

    public void setInputType(int i12) {
        getCurrentEditText().setInputType(i12);
    }

    public void setMaxLines(int i12) {
        this.maxLines = i12;
        EditText currentEditText = getCurrentEditText();
        currentEditText.setMaxLines(i12);
        currentEditText.setSingleLine(i12 == 1);
    }

    public void setText(@k CharSequence charSequence) {
        getCurrentEditText().setText(charSequence);
    }

    public void setTextChangeListener(@l TextWatcher textWatcher) {
        getCurrentEditText().removeTextChangedListener(this.textChangeListener);
        this.textChangeListener = textWatcher;
        getCurrentEditText().addTextChangedListener(textWatcher);
    }

    public void setTextLength(int i12) {
        this.textLength = i12;
        getCurrentEditText().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i12)});
    }

    public final void setTransformationMethod(@l TransformationMethod transformationMethod) {
        int selectionStart = getCurrentEditText().getSelectionStart();
        int selectionEnd = getCurrentEditText().getSelectionEnd();
        getCurrentEditText().setTransformationMethod(transformationMethod);
        int length = getCurrentEditText().getText().length();
        getCurrentEditText().setSelection(Math.min(selectionStart, length), Math.min(selectionEnd, length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) throws Resources.NotFoundException {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        kotlin.properties.c.f406879a.getClass();
        this.currentEditText = kotlin.properties.c.a();
        this.f178014c = new j(this);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(new AccelerateInterpolator());
        valueAnimator.setDuration(200L);
        valueAnimator.addUpdateListener(new AV.a(this, 8));
        this.f178015d = valueAnimator;
        this.borderDrawable = C42727D.c(new c(this));
        this.textLength = Integer.MAX_VALUE;
        this.f178022k = new e(this);
        this.maxLines = Integer.MAX_VALUE;
        this.f178024m = com.avito.android.R.style.TextInputAppearance;
        this.f178025n = com.avito.android.R.style.TextInputAppearanceError;
        setWillNotDraw(false);
        setEditView(d(com.avito.android.R.style.TextInputAppearance));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C40487a.l.f396193h);
        CharSequence text = typedArrayObtainStyledAttributes.getText(3);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(4);
        int i14 = typedArrayObtainStyledAttributes.getInt(5, 0);
        int i15 = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.drawBorder = typedArrayObtainStyledAttributes.getBoolean(7, false);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        setBackground(drawable == null ? D6.u(this, com.avito.android.R.drawable.bg_btn_flat) : drawable);
        D6.f(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0), 0, typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), 0, 10);
        if (i14 != 0) {
            setInputType(i14);
        }
        if (i15 != 0) {
            setImeOptions(i15);
        }
        if (text != null) {
            setText(text);
        }
        if (text2 != null) {
            setHint(text2);
        }
        typedArrayObtainStyledAttributes.recycle();
        Resources resources = getResources();
        setMinimumHeight(resources.getDimensionPixelSize(com.avito.android.R.dimen.text_input_min_height));
        int dimensionPixelSize = resources.getDimensionPixelSize(com.avito.android.R.dimen.text_input_small_padding);
        D6.f(this, 0, dimensionPixelSize, 0, dimensionPixelSize, 5);
    }
}

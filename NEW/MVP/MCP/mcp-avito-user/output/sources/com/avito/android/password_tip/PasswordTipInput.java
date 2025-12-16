package com.avito.android.password_tip;

import CE0.b;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.util.C35835l0;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import j.k0;
import java.util.Arrays;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.o;
import l41.r;
import sK0.C48063a;

/* compiled from: PasswordTipInput.kt */
@s0
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001'J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015¨\u0006("}, d2 = {"Lcom/avito/android/password_tip/PasswordTipInput;", "Landroid/widget/LinearLayout;", "", "text", "Lkotlin/G0;", "setPassword", "(Ljava/lang/String;)V", "", "hint", "setHint", "(Ljava/lang/CharSequence;)V", "Landroid/text/SpannedString;", "getTipSpanned", "()Landroid/text/SpannedString;", "", "enabled", "setEnabled", "(Z)V", "g", "Lkotlin/C;", "getTextFillThisInput", "()Ljava/lang/String;", "textFillThisInput", "h", "getTipTextPlaceholder", "tipTextPlaceholder", "Lio/reactivex/rxjava3/core/z;", "getDoneCallbacks", "()Lio/reactivex/rxjava3/core/z;", "doneCallbacks", "getInputChanges", "inputChanges", "Lcom/jakewharton/rxbinding4/a;", "getTextChanges", "()Lcom/jakewharton/rxbinding4/a;", "textChanges", "getOnFocused", "onFocused", "getText", "SavedState", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PasswordTipInput extends LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f213950i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f213951b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f213952c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f213953d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public String f213954e;

    /* renamed from: f, reason: collision with root package name */
    public final int f213955f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C textFillThisInput;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C tipTextPlaceholder;

    /* compiled from: PasswordTipInput.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/password_tip/PasswordTipInput$SavedState;", "Landroid/view/AbsSavedState;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends AbsSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f213958b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f213959c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Parcelable f213960d;

        /* compiled from: PasswordTipInput.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readInt() != 0, parcel.readString(), parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(boolean z12, @l String str, @k Parcelable parcelable) {
            super(parcelable);
            this.f213958b = z12;
            this.f213959c = str;
            this.f213960d = parcelable;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f213958b ? 1 : 0);
            parcel.writeString(this.f213959c);
            parcel.writeParcelable(this.f213960d, i12);
        }
    }

    /* compiled from: PasswordTipInput.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f213961b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((CharSequence) obj).toString();
        }
    }

    /* compiled from: PasswordTipInput.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f213962b = new b<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((Boolean) obj).booleanValue();
        }
    }

    /* compiled from: PasswordTipInput.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "apply", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f213963b = new c<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            ((Boolean) obj).booleanValue();
            return G0.f406611a;
        }
    }

    @j
    public PasswordTipInput(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final String getTextFillThisInput() {
        return (String) this.textFillThisInput.getValue();
    }

    private final String getTipTextPlaceholder() {
        return (String) this.tipTextPlaceholder.getValue();
    }

    public final void a(SpannableString spannableString, boolean z12, int i12, int i13) {
        if (z12) {
            spannableString.setSpan(new ForegroundColorSpan(this.f213955f), i12, i13, 33);
        }
    }

    public final boolean b() {
        String text = getText();
        boolean z12 = false;
        if (text.length() == 0) {
            d(getTextFillThisInput());
        } else {
            com.avito.android.password_tip.b bVarA = com.avito.android.password_tip.c.a(text);
            if (bVarA.f213964a && bVarA.f213965b && bVarA.f213966c && bVarA.f213967d) {
                z12 = true;
            }
            if (!z12) {
                Input.f179303W.getClass();
                this.f213951b.setState(Input.f179305b0);
            }
        }
        return z12;
    }

    public final void c(String str, boolean z12) {
        if (!L.f(str, this.f213954e) || z12) {
            this.f213954e = str;
            com.avito.android.password_tip.b bVarA = com.avito.android.password_tip.c.a(str);
            boolean z13 = false;
            boolean z14 = str.length() == 0;
            boolean z15 = (bVarA.f213964a || z14) ? false : true;
            boolean z16 = (bVarA.f213965b || z14) ? false : true;
            boolean z17 = (bVarA.f213966c || z14) ? false : true;
            if (!bVarA.f213967d && !z14) {
                z13 = true;
            }
            SpannableString spannableString = new SpannableString(getTipTextPlaceholder());
            a(spannableString, z15, 21, 29);
            a(spannableString, z16, 34, 38);
            a(spannableString, z17, 41, 55);
            a(spannableString, z13, 57, 84);
            this.f213952c.setText(spannableString);
            Input input = this.f213951b;
            int[] f179312e = input.getF179312E();
            Input.f179303W.getClass();
            int[] iArr = Input.f179304a0;
            if (Arrays.equals(f179312e, iArr)) {
                return;
            }
            input.setState(iArr);
        }
    }

    public final void d(@k String str) {
        SpannableString spannableString = new SpannableString(str);
        a(spannableString, true, 0, str.length());
        this.f213952c.setText(spannableString);
        Input.f179303W.getClass();
        this.f213951b.setState(Input.f179305b0);
    }

    public final void e() {
        Input input = this.f213951b;
        input.v();
        input.q();
    }

    @k
    public final z<G0> getDoneCallbacks() {
        return n.d(this.f213951b);
    }

    @k
    public final z<String> getInputChanges() {
        return n.e(this.f213951b).d0(a.f213961b);
    }

    @k
    public final z<G0> getOnFocused() {
        return C37722i.c(this.f213951b).N(b.f213962b).d0(c.f213963b);
    }

    @k
    public final String getText() {
        return String.valueOf(this.f213951b.m53getText());
    }

    @k
    public final com.jakewharton.rxbinding4.a<CharSequence> getTextChanges() {
        return n.e(this.f213951b);
    }

    @k0
    @l
    public final SpannedString getTipSpanned() {
        CharSequence text = this.f213952c.getText();
        if (text instanceof SpannedString) {
            return (SpannedString) text;
        }
        return null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        boolean z12 = savedState.f213958b;
        this.f213953d = z12;
        CE0.a.a(this.f213951b, z12, null, null);
        this.f213954e = savedState.f213959c;
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        return new SavedState(this.f213953d, this.f213954e, super.onSaveInstanceState());
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (enabled == isEnabled()) {
            return;
        }
        this.f213951b.setEnabled(enabled);
        super.setEnabled(enabled);
    }

    public final void setHint(@l CharSequence hint) {
        String string = hint != null ? hint.toString() : null;
        if (string == null) {
            string = "";
        }
        this.f213951b.setHint(string);
    }

    public final void setPassword(@k String text) {
        Input.t(this.f213951b, text, false, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PasswordTipInput(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) throws Resources.NotFoundException {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12);
        this.f213953d = true;
        this.f213955f = C48063a.f437606a.b(context, "red600", null);
        this.textFillThisInput = C42727D.c(new e(context));
        this.tipTextPlaceholder = C42727D.c(new f(context));
        LayoutInflater.from(context).inflate(R.layout.password_tip_input, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.password_tip_layout_input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById;
        this.f213951b = input;
        View viewFindViewById2 = findViewById(R.id.password_tip_layout_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f213952c = textView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.g.f2054a, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            input.setAppearanceAndContent(typedArrayObtainStyledAttributes.getResourceId(1, 0));
        } else {
            input.setAppearanceAndContent(C35835l0.j(R.attr.input, context));
        }
        input.setAutofillHints((String[]) Arrays.copyOf(new String[]{"newPassword"}, 1));
        input.setImeOptions(268435462);
        input.setInputType(144);
        String string = typedArrayObtainStyledAttributes.getString(0);
        setHint(string == null ? "" : string);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            textView.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(2, 0));
        } else {
            textView.setTextAppearance(C35835l0.j(R.attr.textS1, context));
        }
        typedArrayObtainStyledAttributes.recycle();
        n.c(input, new d(this));
        CE0.a.a(input, this.f213953d, null, null);
        input.setRightIconListener(new com.avito.android.order.feature.c(this, 13));
        c(getText(), false);
        requestLayout();
    }
}

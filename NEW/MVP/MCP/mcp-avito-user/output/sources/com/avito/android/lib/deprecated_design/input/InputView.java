package com.avito.android.lib.deprecated_design.input;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.input.a;
import com.avito.android.util.K2;
import hw.InterfaceC41179d;
import j.I;
import j.InterfaceC42165v;
import j.e0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InputView.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u00020\u0006:\u0003=>?J\u001f\u0010\u000b\u001a\u00020\n2\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\n2\b\b\u0001\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001d\u001a\u00020\n2\b\b\u0001\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u0010J\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\r¢\u0006\u0004\b*\u0010\u0010J\u0015\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\r¢\u0006\u0004\b,\u0010\u0010R$\u00104\u001a\u0004\u0018\u00010-8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00109\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b5\u00106\u0012\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\r8EX\u0084\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006@"}, d2 = {"Lcom/avito/android/lib/deprecated_design/input/InputView;", "Landroid/widget/RelativeLayout;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnFocusChangeListener;", "Lcom/avito/android/lib/deprecated_design/input/a;", "", "Landroid/widget/TextView$OnEditorActionListener;", "", "Landroid/text/InputFilter;", "filters", "Lkotlin/G0;", "setFilters", "([Landroid/text/InputFilter;)V", "", "mode", "setFloatingLabelMode", "(I)V", "resId", "setValueBackground", "getValue", "()Ljava/lang/String;", "text", "setValue", "(Ljava/lang/String;)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "iconId", "setIcon", "", "enabled", "setEnabled", "(Z)V", "Lcom/avito/android/lib/deprecated_design/input/a$a;", "listener", "setOnFieldValueChangedListener", "(Lcom/avito/android/lib/deprecated_design/input/a$a;)V", "actionListener", "setOnEditorActionListener", "(Landroid/widget/TextView$OnEditorActionListener;)V", "type", "setInputType", "imeOptions", "setImeOptions", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getMTextView", "()Landroid/widget/TextView;", "setMTextView", "(Landroid/widget/TextView;)V", "mTextView", "e", "I", "getMFloatingLabelMode$annotations", "()V", "mFloatingLabelMode", "getDefaultLayoutId", "()I", "defaultLayoutId", "a", "b", "SavedState", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class InputView extends RelativeLayout implements TextWatcher, View.OnFocusChangeListener, com.avito.android.lib.deprecated_design.input.a<String>, TextView.OnEditorActionListener {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final InputFilter[] f178002f;

    /* renamed from: b, reason: collision with root package name */
    public int f178003b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public a.InterfaceC5245a f178004c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public TextView mTextView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int mFloatingLabelMode;

    /* compiled from: InputView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/input/InputView$SavedState;", "Landroid/view/View$BaseSavedState;", "CREATOR", "a", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name */
        @l
        public Parcelable f178007b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Parcelable f178008c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public Parcelable f178009d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f178010e;

        /* renamed from: f, reason: collision with root package name */
        @InterfaceC42165v
        public int f178011f;

        /* compiled from: InputView.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/deprecated_design/input/InputView$SavedState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/lib/deprecated_design/input/InputView$SavedState;", "<init>", "()V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.deprecated_design.input.InputView$SavedState$a, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<SavedState> {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f178007b = parcel.readParcelable(TextView.class.getClassLoader());
                savedState.f178008c = parcel.readParcelable(TextView.class.getClassLoader());
                savedState.f178009d = parcel.readParcelable(TextView.class.getClassLoader());
                savedState.f178010e = parcel.readInt() == 1;
                savedState.f178011f = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }

            public Companion() {
            }
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeParcelable(this.f178007b, 0);
            parcel.writeParcelable(this.f178008c, 0);
            parcel.writeParcelable(this.f178009d, 0);
            parcel.writeInt(this.f178010e ? 1 : 0);
            parcel.writeInt(this.f178011f);
        }
    }

    /* compiled from: InputView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/lib/deprecated_design/input/InputView$a;", "", "<init>", "()V", "", "Landroid/text/InputFilter;", "NO_FILTERS", "[Landroid/text/InputFilter;", "", "TAG", "Ljava/lang/String;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: InputView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\b\u0086\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/deprecated_design/input/InputView$b;", "", "<init>", "()V", "a", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {

        /* compiled from: InputView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/input/InputView$b$a;", "", "<init>", "()V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            static {
                new a();
            }
        }
    }

    static {
        new a(null);
        f178002f = new InputFilter[0];
    }

    public final void a() {
        TextView textView;
        int i12 = this.mFloatingLabelMode;
        if (i12 == 0) {
            throw null;
        }
        if (i12 == 1) {
            if ((!hasFocus() && this.mTextView.getText().length() <= 0) || (textView = this.mTextView) == null) {
                throw null;
            }
            textView.setHint((CharSequence) null);
            throw null;
        }
        if (i12 != 2) {
            return;
        }
        TextView textView2 = this.mTextView;
        if (textView2 == null) {
            throw null;
        }
        textView2.setHint((CharSequence) null);
        throw null;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@k Editable editable) {
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setBackgroundResource(this.f178003b);
        }
        a.InterfaceC5245a interfaceC5245a = this.f178004c;
        if (interfaceC5245a != null) {
            editable.toString();
            interfaceC5245a.a();
        }
    }

    @I
    public final int getDefaultLayoutId() {
        return R.layout.input_view;
    }

    @l
    public final TextView getMTextView() {
        return this.mTextView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(@k TextView textView, int i12, @l KeyEvent keyEvent) {
        if (textView != this.mTextView) {
            return false;
        }
        if (i12 != 6 && (textView.getImeOptions() != 6 || keyEvent == null || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        K2.d(this, true);
        return false;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(@k View view, boolean z12) {
        TextView textView;
        int i12 = this.mFloatingLabelMode;
        if (i12 == 0) {
            throw null;
        }
        if (i12 == 1) {
            if ((!z12 && this.mTextView.getText().length() <= 0) || (textView = this.mTextView) == null) {
                throw null;
            }
            textView.setHint((CharSequence) null);
            throw null;
        }
        if (i12 != 2) {
            this.mTextView.removeTextChangedListener(this);
            this.mTextView.addTextChangedListener(this);
        } else {
            TextView textView2 = this.mTextView;
            if (textView2 == null) {
                throw null;
            }
            textView2.setHint((CharSequence) null);
            throw null;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@k Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            super.onRestoreInstanceState(((SavedState) parcelable).getSuperState());
            throw null;
        }
        super.onRestoreInstanceState(parcelable);
        throw null;
    }

    @Override // android.view.View
    @l
    public final Parcelable onSaveInstanceState() {
        new SavedState(super.onSaveInstanceState());
        throw null;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.mTextView.setEnabled(enabled);
    }

    public final void setFilters(@l InputFilter[] filters) {
        if (filters == null || filters.length == 0) {
            this.mTextView.setFilters(f178002f);
        } else {
            this.mTextView.setFilters(filters);
        }
    }

    public final void setFloatingLabelMode(@b int mode) {
        this.mFloatingLabelMode = mode;
        a();
    }

    public final void setImeOptions(int imeOptions) {
        this.mTextView.setImeOptions(imeOptions);
    }

    public final void setInputType(int type) {
        this.mTextView.setInputType(type);
    }

    public final void setMTextView(@l TextView textView) {
        this.mTextView = textView;
    }

    public final void setOnEditorActionListener(@l TextView.OnEditorActionListener actionListener) {
        this.mTextView.setOnEditorActionListener(actionListener);
    }

    public void setOnFieldValueChangedListener(@l a.InterfaceC5245a listener) {
        this.f178004c = listener;
    }

    public void setTitle(@l CharSequence title) {
    }

    public final void setValueBackground(@InterfaceC42165v int resId) {
        this.f178003b = resId;
        this.mTextView.setBackgroundResource(resId);
    }

    @k
    public String getValue() {
        return this.mTextView.getText().toString();
    }

    public final void setTitle(@e0 int title) {
        throw null;
    }

    public void setValue(@l String text) {
        a.InterfaceC5245a interfaceC5245a = this.f178004c;
        if (interfaceC5245a != null) {
            interfaceC5245a.a();
        }
        this.mTextView.removeTextChangedListener(this);
        this.mTextView.setText(text);
        this.mTextView.addTextChangedListener(this);
        a();
    }

    @b
    private static /* synthetic */ void getMFloatingLabelMode$annotations() {
    }

    public final void setIcon(@InterfaceC42165v int iconId) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@k CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@k CharSequence charSequence, int i12, int i13, int i14) {
    }
}

package ru.mts.biometry.sdk.view;

import B91.C13115h;
import Ca1.ViewOnTouchListenerC13234a;
import Ca1.ViewOnTouchListenerC13235b;
import Ca1.g;
import Ca1.h;
import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import g2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import z91.c;

@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001c\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R(\u0010\u001f\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u0006 "}, d2 = {"Lru/mts/biometry/sdk/view/SdkBioEditText;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/G0;", "setupAttrs", "(Landroid/util/AttributeSet;)V", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "", "enabled", "setEnabled", "(Z)V", "", "value", "getTopLabel", "()Ljava/lang/String;", "setTopLabel", "(Ljava/lang/String;)V", "topLabel", "getText", "setText", "text", "getBottomLabelText", "setBottomLabelText", "bottomLabelText", "sdk_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes9.dex */
public final class SdkBioEditText extends ConstraintLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f436531f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C13115h f436532b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f436533c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f436534d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f436535e;

    @j
    public SdkBioEditText(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.sdk_bio_edittext, this);
        int i12 = R.id.edittext;
        AppCompatEditText appCompatEditText = (AppCompatEditText) d.a(this, R.id.edittext);
        if (appCompatEditText != null) {
            i12 = R.id.tv_bottom_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) d.a(this, R.id.tv_bottom_text);
            if (appCompatTextView != null) {
                i12 = R.id.tv_label;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) d.a(this, R.id.tv_label);
                if (appCompatTextView2 != null) {
                    this.f436532b = new C13115h(this, appCompatEditText, appCompatTextView, appCompatTextView2);
                    if (attributeSet != null) {
                        setupAttrs(attributeSet);
                    }
                    if (this.f436534d) {
                        EditText editText = getEditText();
                        editText.addTextChangedListener(new g(this, editText));
                        editText.setOnTouchListener(new ViewOnTouchListenerC13235b(editText, 0));
                        return;
                    }
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i12)));
    }

    private final void setupAttrs(AttributeSet attrs) {
        C13115h c13115h = this.f436532b;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, c.m.f443894b, R.attr.sdkBioEditTextStyle, R.style.Widget_Biometry_EditText);
        try {
            c13115h.f1117b.setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(4);
            AppCompatEditText appCompatEditText = c13115h.f1117b;
            appCompatEditText.setBackground(drawable);
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            if (color != 0) {
                appCompatEditText.setTextColor(color);
            }
            int color2 = typedArrayObtainStyledAttributes.getColor(3, 0);
            if (color2 != 0) {
                appCompatEditText.setHintTextColor(color2);
            }
            String string = typedArrayObtainStyledAttributes.getString(14);
            if (string != null) {
                appCompatEditText.setHint(string);
            }
            int integer = typedArrayObtainStyledAttributes.getInteger(8, 0);
            if (integer > 0) {
                appCompatEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(integer)});
            }
            setTopLabel(typedArrayObtainStyledAttributes.getString(21));
            setBottomLabelText(typedArrayObtainStyledAttributes.getString(13));
            appCompatEditText.setInputType(typedArrayObtainStyledAttributes.getInt(10, 1));
            if (appCompatEditText.getInputType() == 131073) {
                appCompatEditText.setGravity(8388659);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(19, 0);
            if (resourceId != 0) {
                c13115h.f1119d.setTextAppearance(resourceId);
            }
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(16, 0);
            if (resourceId2 != 0) {
                c13115h.f1118c.setTextAppearance(resourceId2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                appCompatEditText.setLines(typedArrayObtainStyledAttributes.getInt(6, 1));
            }
            if (typedArrayObtainStyledAttributes.hasValue(7)) {
                appCompatEditText.setMinLines(typedArrayObtainStyledAttributes.getInt(6, 1));
            }
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(12);
            Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
            Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(11);
            this.f436533c = drawable3 != null ? drawable3.mutate() : null;
            int color3 = typedArrayObtainStyledAttributes.getColor(5, 0);
            if (color3 != 0) {
                if (drawableMutate != null) {
                    drawableMutate.setTint(color3);
                }
                Drawable drawable4 = this.f436533c;
                if (drawable4 != null) {
                    drawable4.setTint(color3);
                }
            }
            this.f436534d = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f436535e = typedArrayObtainStyledAttributes.getDrawable(17);
            if (typedArrayObtainStyledAttributes.hasValue(9)) {
                appCompatEditText.setCompoundDrawablePadding(typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0));
            }
            if (typedArrayObtainStyledAttributes.getBoolean(20, false)) {
                appCompatEditText.addTextChangedListener(new h(this, appCompatEditText));
                appCompatEditText.setOnTouchListener(new ViewOnTouchListenerC13234a(appCompatEditText, 0));
            }
            appCompatEditText.setCompoundDrawablesWithIntrinsicBounds(this.f436533c, (Drawable) null, drawableMutate, (Drawable) null);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            callOnClick();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @l
    public String getBottomLabelText() {
        return this.f436532b.f1118c.getText().toString();
    }

    @k
    public EditText getEditText() {
        return this.f436532b.f1117b;
    }

    @l
    public String getText() {
        return String.valueOf(this.f436532b.f1117b.getText());
    }

    @l
    public String getTopLabel() {
        return this.f436532b.f1119d.getText().toString();
    }

    public void setBottomLabelText(@l String str) {
        C13115h c13115h = this.f436532b;
        c13115h.f1118c.setText(str);
        c13115h.f1118c.setVisibility(str == null || C43066x.K(str) ? 8 : 0);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.f436532b.f1117b.setEnabled(enabled);
    }

    public void setText(@l String str) {
        this.f436532b.f1117b.setText(str);
    }

    public void setTopLabel(@l String str) {
        C13115h c13115h = this.f436532b;
        c13115h.f1119d.setText(str);
        c13115h.f1119d.setVisibility(str == null || C43066x.K(str) ? 8 : 0);
    }

    public /* synthetic */ SdkBioEditText(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }
}

package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRTypographyElement;

/* compiled from: CBRTextView.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002BE\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRTextView;", "LAY0/a;", "Lru/cyberity/cbr/core/widget/CBRStepStateProvider;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/cyberity/cbr/core/theme/CBRTypographyElement;", "typographyElementName", "Lru/cyberity/cbr/core/theme/CBRColorElement;", "colorElementName", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/cyberity/cbr/core/theme/CBRTypographyElement;Lru/cyberity/cbr/core/theme/CBRColorElement;)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lru/cyberity/cbr/core/widget/CBRStepState;", "getCBRStepState", "()Lru/cyberity/cbr/core/widget/CBRStepState;", VoiceInfo.STATE, "Lkotlin/G0;", "setCBRStepState", "(Lru/cyberity/cbr/core/widget/CBRStepState;)V", "stepState", "Lru/cyberity/cbr/core/widget/CBRStepState;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public class CBRTextView extends AY0.a implements CBRStepStateProvider {

    @l
    private CBRStepState stepState;

    @j
    public CBRTextView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, null, 60, null);
    }

    @Override // ru.cyberity.cbr.core.widget.CBRStepStateProvider
    @k
    public CBRStepState getCBRStepState() {
        CBRStepState cBRStepState = this.stepState;
        return cBRStepState == null ? CBRStepState.INIT : cBRStepState;
    }

    @Override // android.widget.TextView, android.view.View
    @k
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? CBRStepStateKt.getCBRStepStateDrawable(this) : new int[]{R.attr.cbr_stateInit});
    }

    @Override // ru.cyberity.cbr.core.widget.CBRStepStateProvider
    public void setCBRStepState(@k CBRStepState state) {
        if (state != this.stepState) {
            this.stepState = state;
            refreshDrawableState();
        }
    }

    public /* synthetic */ CBRTextView(Context context, AttributeSet attributeSet, int i12, int i13, CBRTypographyElement cBRTypographyElement, CBRColorElement cBRColorElement, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_BodyTextViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRTextView_Body : i13, (i14 & 16) != 0 ? CBRTypographyElement.BODY : cBRTypographyElement, (i14 & 32) != 0 ? CBRColorElement.CONTENT_NEUTRAL : cBRColorElement);
    }

    @j
    public CBRTextView(@k Context context, @l AttributeSet attributeSet, int i12, int i13, @k CBRTypographyElement cBRTypographyElement, @k CBRColorElement cBRColorElement) {
        super(context, attributeSet, i12, i13);
        this.stepState = CBRStepState.INIT;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRTextView, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextView_android_textAppearance)) {
            setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRTextView_android_textAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextView_android_gravity)) {
            setGravity(typedArrayObtainStyledAttributes.getInteger(R.styleable.CBRTextView_android_gravity, 8388611));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextView_android_background)) {
            setBackground(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CBRTextView_android_background));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextView_cbr_textColor)) {
            setTextColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CBRTextView_cbr_textColor, androidx.core.content.d.getColor(context, android.R.color.white)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextView_android_drawableStart)) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.CBRTextView_android_drawableStart);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                G0 g02 = G0.f406611a;
            } else {
                drawable = null;
            }
            compoundDrawables[0] = drawable;
            setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextView_android_drawablePadding)) {
            setCompoundDrawablePadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRTextView_android_drawablePadding, 0));
        }
        G0 g03 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
        ThemeHelper.INSTANCE.applyTheme(this, cBRTypographyElement, cBRColorElement);
    }
}

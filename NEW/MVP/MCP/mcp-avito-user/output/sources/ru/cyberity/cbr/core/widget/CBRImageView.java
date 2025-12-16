package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.C22823h0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;

/* compiled from: CBRImageView.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/cyberity/cbr/core/widget/CBRStepStateProvider;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lru/cyberity/cbr/core/widget/CBRStepState;", "getCBRStepState", "()Lru/cyberity/cbr/core/widget/CBRStepState;", VoiceInfo.STATE, "Lkotlin/G0;", "setCBRStepState", "(Lru/cyberity/cbr/core/widget/CBRStepState;)V", "stepState", "Lru/cyberity/cbr/core/widget/CBRStepState;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRImageView extends AppCompatImageView implements CBRStepStateProvider {

    @l
    private CBRStepState stepState;

    @j
    public CBRImageView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // ru.cyberity.cbr.core.widget.CBRStepStateProvider
    @k
    public CBRStepState getCBRStepState() {
        CBRStepState cBRStepState = this.stepState;
        return cBRStepState == null ? CBRStepState.INIT : cBRStepState;
    }

    @Override // android.widget.ImageView, android.view.View
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

    public /* synthetic */ CBRImageView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_ImageViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRImageView : i13);
    }

    @j
    public CBRImageView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12);
        this.stepState = CBRStepState.INIT;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRImageView, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRImageView_android_tint)) {
            setImageTintList(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRImageView_android_tint));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRImageView_android_backgroundTint)) {
            C22823h0.F(this, s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRImageView_android_backgroundTint));
        }
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        if (themeHelper.getCustomTheme() != null) {
            int[][] defaultStepStateList = themeHelper.getDefaultStepStateList();
            CBRColorElement cBRColorElement = CBRColorElement.BACKGROUND_NEUTRAL;
            Integer themeColor = themeHelper.getThemeColor(this, cBRColorElement);
            int iIntValue = themeColor != null ? themeColor.intValue() : 0;
            CBRColorElement cBRColorElement2 = CBRColorElement.BACKGROUND_WARNING;
            Integer themeColor2 = themeHelper.getThemeColor(this, cBRColorElement2);
            int iIntValue2 = themeColor2 != null ? themeColor2.intValue() : 0;
            Integer themeColor3 = themeHelper.getThemeColor(this, CBRColorElement.BACKGROUND_SUCCESS);
            int iIntValue3 = themeColor3 != null ? themeColor3.intValue() : 0;
            Integer themeColor4 = themeHelper.getThemeColor(this, CBRColorElement.BACKGROUND_CRITICAL);
            int iIntValue4 = themeColor4 != null ? themeColor4.intValue() : 0;
            Integer themeColor5 = themeHelper.getThemeColor(this, cBRColorElement2);
            int iIntValue5 = themeColor5 != null ? themeColor5.intValue() : 0;
            Integer themeColor6 = themeHelper.getThemeColor(this, cBRColorElement);
            C22823h0.F(this, new ColorStateList(defaultStepStateList, new int[]{iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, themeColor6 != null ? themeColor6.intValue() : 0}));
        }
    }
}

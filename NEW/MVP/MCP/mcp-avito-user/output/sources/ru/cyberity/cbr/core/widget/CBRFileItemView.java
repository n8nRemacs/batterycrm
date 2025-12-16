package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.q;
import com.squareup.picasso.A;
import com.squareup.picasso.B;
import com.squareup.picasso.Picasso;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.ExtensionsKt;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRMetricElement;

/* compiled from: CBRFileItemView.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0007H\u0014¢\u0006\u0004\b*\u0010+R\u0016\u0010-\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0016\u00101\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010B\u001a\u0004\u0018\u00010A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRFileItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/cyberity/cbr/core/widget/CBRStepStateProvider;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "text", "Lkotlin/G0;", "setText", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "icon", "setStartIcon", "(Landroid/graphics/drawable/Drawable;)V", "", ContextActionHandler.Link.URL, "loadImage", "(Ljava/lang/String;)V", "setEndIcon", "Landroid/view/View$OnClickListener;", "listener", "setEndIconClickListener", "(Landroid/view/View$OnClickListener;)V", "", "visible", "setProgressVisibility", "(Z)V", "Lru/cyberity/cbr/core/widget/CBRStepState;", "getCBRStepState", "()Lru/cyberity/cbr/core/widget/CBRStepState;", VoiceInfo.STATE, "setCBRStepState", "(Lru/cyberity/cbr/core/widget/CBRStepState;)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Landroid/widget/ImageView;", "ivStartIcon", "Landroid/widget/ImageView;", "ivEndIcon", "Landroid/widget/TextView;", "tvText", "Landroid/widget/TextView;", "Landroid/view/View;", "endProgressBar", "Landroid/view/View;", "ivPreview", "Lcom/google/android/material/shape/q;", "shapeAppearanceModel", "Lcom/google/android/material/shape/q;", "stepState", "Lru/cyberity/cbr/core/widget/CBRStepState;", "Lcom/google/android/material/shape/k;", "boxBackground", "Lcom/google/android/material/shape/k;", "getBoxBackground$cyberity_mobile_sdk_ui_release", "()Lcom/google/android/material/shape/k;", "Lcom/squareup/picasso/Picasso;", "picasso", "Lcom/squareup/picasso/Picasso;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public class CBRFileItemView extends ConstraintLayout implements CBRStepStateProvider {

    @k
    private final com.google.android.material.shape.k boxBackground;

    @l
    private final View endProgressBar;

    @l
    private final ImageView ivEndIcon;

    @l
    private final ImageView ivPreview;

    @l
    private final ImageView ivStartIcon;

    @l
    private final Picasso picasso;

    @k
    private final q shapeAppearanceModel;

    @l
    private CBRStepState stepState;

    @l
    private final TextView tvText;

    public /* synthetic */ CBRFileItemView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_fileItemViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRFileItemView : i13);
    }

    @k
    /* renamed from: getBoxBackground$cyberity_mobile_sdk_ui_release, reason: from getter */
    public final com.google.android.material.shape.k getBoxBackground() {
        return this.boxBackground;
    }

    @Override // ru.cyberity.cbr.core.widget.CBRStepStateProvider
    @k
    public CBRStepState getCBRStepState() {
        CBRStepState cBRStepState = this.stepState;
        return cBRStepState == null ? CBRStepState.INIT : cBRStepState;
    }

    public final void loadImage(@l String url) {
        Picasso picasso;
        if (url == null) {
            ImageView imageView = this.ivPreview;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.ivStartIcon;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ImageView imageView3 = this.ivPreview;
            if (imageView3 == null || (picasso = this.picasso) == null) {
                return;
            }
            picasso.a(imageView3);
            return;
        }
        ImageView imageView4 = this.ivPreview;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        ImageView imageView5 = this.ivStartIcon;
        if (imageView5 != null) {
            imageView5.setVisibility(8);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.cbr_icon_size_normal_large);
        Picasso picasso2 = this.picasso;
        if (picasso2 != null) {
            if (url.trim().length() == 0) {
                throw new IllegalArgumentException("Path must not be empty.");
            }
            B b12 = new B(picasso2, Uri.parse(url));
            A.b bVar = b12.f366325b;
            if (dimensionPixelSize < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (dimensionPixelSize < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (dimensionPixelSize == 0 && dimensionPixelSize == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            bVar.f366309d = dimensionPixelSize;
            bVar.f366310e = dimensionPixelSize;
            b12.a(this.ivPreview);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @k
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? CBRStepStateKt.getCBRStepStateDrawable(this) : new int[]{R.attr.cbr_stateInit});
    }

    @Override // ru.cyberity.cbr.core.widget.CBRStepStateProvider
    public void setCBRStepState(@k CBRStepState state) {
        if (state != this.stepState) {
            this.stepState = state;
            getBackground().setState(CBRStepStateKt.getCBRStepStateDrawable(this));
            refreshDrawableState();
        }
    }

    public final void setEndIcon(@l Drawable icon) {
        ImageView imageView = this.ivEndIcon;
        if (imageView != null) {
            imageView.setImageDrawable(icon);
            imageView.setVisibility(icon != null ? 0 : 8);
        }
    }

    public final void setEndIconClickListener(@l View.OnClickListener listener) {
        ImageView imageView = this.ivEndIcon;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setProgressVisibility(boolean visible) {
        View view = this.endProgressBar;
        if (view != null) {
            view.setVisibility(visible ? 0 : 8);
        }
        ImageView imageView = this.ivEndIcon;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(visible ? 8 : 0);
    }

    public final void setStartIcon(@l Drawable icon) {
        ImageView imageView = this.ivStartIcon;
        if (imageView != null) {
            imageView.setImageDrawable(icon);
        }
    }

    public final void setText(@l CharSequence text) {
        TextView textView = this.tvText;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    @j
    public CBRFileItemView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        float dimensionPixelSize;
        Integer color;
        super(context, attributeSet, i12);
        q qVarA = q.c(context, attributeSet, i12, i13).a();
        this.shapeAppearanceModel = qVarA;
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(qVarA);
        this.boxBackground = kVar;
        this.picasso = ExtensionsKt.getPicasso(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRFileItemView, i12, i13);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRFileItemView_cbr_fileItemViewLayout, R.layout.cbr_layout_questionnaire_file), (ViewGroup) this, true);
        this.endProgressBar = findViewById(R.id.cbr_progress_bar);
        ImageView imageView = (ImageView) findViewById(R.id.cbr_end_icon);
        this.ivEndIcon = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.cbr_start_icon);
        this.ivStartIcon = imageView2;
        TextView textView = (TextView) findViewById(R.id.cbr_text);
        this.tvText = textView;
        ImageView imageView3 = (ImageView) findViewById(R.id.cbr_image);
        this.ivPreview = imageView3;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRFileItemView_cbr_startIconTint) && imageView2 != null) {
            imageView2.setImageTintList(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRFileItemView_cbr_startIconTint));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRFileItemView_cbr_endIconTint) && imageView != null) {
            imageView.setImageTintList(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRFileItemView_cbr_endIconTint));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRFileItemView_android_textColor) && textView != null) {
            textView.setTextColor(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRFileItemView_android_textColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRFileItemView_boxBackgroundColor)) {
            kVar.n(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRFileItemView_boxBackgroundColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRFileItemView_boxStrokeColor)) {
            kVar.u(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRFileItemView_boxStrokeColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRFileItemView_boxStrokeWidth)) {
            kVar.v(typedArrayObtainStyledAttributes.getDimension(R.styleable.CBRFileItemView_boxStrokeWidth, 0.0f));
        }
        setBackground(typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRFileItemView_background) ? typedArrayObtainStyledAttributes.getDrawable(R.styleable.CBRFileItemView_background) : kVar);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRFileItemView_previewCornerRadius)) {
            ShapeableImageView shapeableImageView = imageView3 instanceof ShapeableImageView ? (ShapeableImageView) imageView3 : null;
            if (shapeableImageView != null) {
                q.b bVar = new q.b();
                bVar.c(typedArrayObtainStyledAttributes.getDimension(R.styleable.CBRFileItemView_previewCornerRadius, 0.0f));
                shapeableImageView.setShapeAppearanceModel(bVar.a());
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null) {
            Integer themeColor = themeHelper.getThemeColor(this, CBRColorElement.FIELD_BACKGROUND);
            Integer themeColor2 = themeHelper.getThemeColor(this, CBRColorElement.FIELD_BACKGROUND_INVALID);
            themeColor2 = themeColor2 == null ? themeHelper.getThemeColor(this, CBRColorElement.BACKGROUND_CRITICAL) : themeColor2;
            Integer themeColor3 = themeHelper.getThemeColor(this, CBRColorElement.CONTENT_WEAK);
            Float metricDimension = themeHelper.getMetricDimension(customTheme, CBRMetricElement.FIELD_CORNER_RADIUS);
            if (themeColor != null || themeColor3 != null || metricDimension != null) {
                int[][] iArr = {new int[]{R.attr.cbr_stateInit}, new int[]{R.attr.cbr_stateRejected}, new int[0]};
                int iA2 = s.a(context, android.R.attr.colorBackground);
                int iA3 = s.a(context, R.attr.cbr_colorRejected);
                GradientDrawable gradientDrawable = new GradientDrawable();
                setBackground(gradientDrawable);
                gradientDrawable.setColor(new ColorStateList(iArr, new int[]{themeColor != null ? themeColor.intValue() : iA2, themeColor2 != null ? themeColor2.intValue() : iA3, themeColor != null ? themeColor.intValue() : iA2}));
                if (metricDimension != null) {
                    dimensionPixelSize = metricDimension.floatValue();
                } else {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.cbr_file_attachment_corner_radius);
                }
                gradientDrawable.setCornerRadius(dimensionPixelSize);
                if (themeColor3 != null) {
                    int iA4 = s.a(1);
                    float fA2 = s.a(4);
                    gradientDrawable.setStroke(iA4, ColorStateList.valueOf(themeColor3.intValue()), fA2, fA2);
                }
            }
            if (themeColor3 != null) {
                int iIntValue = themeColor3.intValue();
                if (imageView2 != null) {
                    imageView2.setImageTintList(ColorStateList.valueOf(iIntValue));
                }
            }
            CBRColorElement cBRColorElement = CBRColorElement.CONTENT_LINK;
            ru.cyberity.cbr.core.theme.d customTheme2 = themeHelper.getCustomTheme();
            if (customTheme2 == null || (color = themeHelper.getColor(customTheme2, cBRColorElement, themeHelper.isDarkTheme(this))) == null) {
                return;
            }
            int iIntValue2 = color.intValue();
            if (textView != null) {
                textView.setTextColor(iIntValue2);
            }
        }
    }
}

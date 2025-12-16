package com.avito.android.publish.items.video.video_preview;

import Cf0.C13299a;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.design.State;
import com.avito.android.lib.util.x;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import gw.InterfaceC40743a;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import wK0.AbstractC49526a;

/* compiled from: VideoPreview.kt */
@P
@s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001<R*\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR.\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R*\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00188\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR.\u0010'\u001a\u0004\u0018\u00010 2\b\u0010\u0004\u001a\u0004\u0018\u00010 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R.\u0010+\u001a\u0004\u0018\u00010 2\b\u0010\u0004\u001a\u0004\u0018\u00010 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R*\u00103\u001a\u00020,2\u0006\u0010\u0004\u001a\u00020,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010;\u001a\u0004\u0018\u0001048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/avito/android/publish/items/video/video_preview/VideoPreview;", "Landroidx/cardview/widget/CardView;", "Lgw/a;", "Lcom/avito/android/publish/items/video/video_preview/VideoPreview$PreviewState;", "value", "h", "Lcom/avito/android/publish/items/video/video_preview/VideoPreview$PreviewState;", "getPreviewState", "()Lcom/avito/android/publish/items/video/video_preview/VideoPreview$PreviewState;", "setPreviewState", "(Lcom/avito/android/publish/items/video/video_preview/VideoPreview$PreviewState;)V", "previewState", "Landroid/graphics/drawable/Drawable;", "i", "Landroid/graphics/drawable/Drawable;", "getImage", "()Landroid/graphics/drawable/Drawable;", "setImage", "(Landroid/graphics/drawable/Drawable;)V", "image", "j", "getPlaceholderBackground", "setPlaceholderBackground", "placeholderBackground", "Lcom/avito/android/design/State;", "k", "Lcom/avito/android/design/State;", "getState", "()Lcom/avito/android/design/State;", "setState", "(Lcom/avito/android/design/State;)V", VoiceInfo.STATE, "", "l", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "m", "getError", "setError", "error", "", "n", "F", "getCornerRadius", "()F", "setCornerRadius", "(F)V", "cornerRadius", "Landroid/view/View;", "o", "Landroid/view/View;", "getImageContainerView", "()Landroid/view/View;", "setImageContainerView", "(Landroid/view/View;)V", "imageContainerView", "PreviewState", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VideoPreview extends CardView implements InterfaceC40743a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ProgressBar f237234b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f237235c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f237236d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f237237e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f237238f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final CardView f237239g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    public PreviewState previewState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable image;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable placeholderBackground;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @k
    public State state;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @l
    public String title;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @l
    public String error;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float cornerRadius;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @l
    public View imageContainerView;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoPreview.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/video/video_preview/VideoPreview$PreviewState;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PreviewState {

        /* renamed from: c, reason: collision with root package name */
        public static final PreviewState f237248c;

        /* renamed from: d, reason: collision with root package name */
        public static final PreviewState f237249d;

        /* renamed from: e, reason: collision with root package name */
        public static final PreviewState f237250e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ PreviewState[] f237251f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f237252g;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final int[] f237253b;

        static {
            PreviewState previewState = new PreviewState("LOADING", 0, null);
            f237248c = previewState;
            PreviewState previewState2 = new PreviewState("CONTENT", 1, null);
            f237249d = previewState2;
            PreviewState previewState3 = new PreviewState("ERROR", 2, Integer.valueOf(R.attr.state_error));
            f237250e = previewState3;
            PreviewState[] previewStateArr = {previewState, previewState2, previewState3};
            f237251f = previewStateArr;
            f237252g = c.a(previewStateArr);
        }

        public PreviewState(String str, int i12, Integer num) {
            this.f237253b = num != null ? new int[]{num.intValue()} : new int[0];
        }

        public static PreviewState valueOf(String str) {
            return (PreviewState) Enum.valueOf(PreviewState.class, str);
        }

        public static PreviewState[] values() {
            return (PreviewState[]) f237251f.clone();
        }
    }

    /* compiled from: VideoPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                State.a aVar = State.f135879c;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                State.a aVar2 = State.f135879c;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PreviewState.values().length];
            try {
                iArr2[PreviewState.f237250e.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PreviewState.f237248c.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PreviewState.f237249d.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @j
    public VideoPreview(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void c() {
        int iOrdinal = getState().ordinal();
        ImageView imageView = this.f237237e;
        if (iOrdinal == 0) {
            Drawable drawable = this.placeholderBackground;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            imageView.setImageDrawable(this.placeholderBackground);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            imageView.setImageDrawable(getImage());
        }
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @l
    public final String getError() {
        return this.error;
    }

    @Override // gw.InterfaceC40743a
    @l
    public Drawable getImage() {
        return this.image;
    }

    @Override // gw.InterfaceC40743a
    @l
    public View getImageContainerView() {
        return this.imageContainerView;
    }

    @l
    public final Drawable getPlaceholderBackground() {
        return this.placeholderBackground;
    }

    @k
    public final PreviewState getPreviewState() {
        return this.previewState;
    }

    @k
    public State getState() {
        return this.state;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.view.ViewGroup, android.view.View
    @k
    public final int[] onCreateDrawableState(int i12) {
        return View.mergeDrawableStates(super.onCreateDrawableState(i12 + this.previewState.f237253b.length), this.previewState.f237253b);
    }

    public final void setCornerRadius(float f12) {
        this.cornerRadius = f12;
        this.f237239g.setRadius(f12);
    }

    public final void setError(@l String str) {
        this.error = str;
        this.f237235c.setText(str);
    }

    @Override // gw.InterfaceC40743a
    public void setImage(@l Drawable drawable) {
        this.image = drawable;
        c();
    }

    public void setImageContainerView(@l View view) {
        this.imageContainerView = view;
    }

    public final void setPlaceholderBackground(@l Drawable drawable) {
        this.placeholderBackground = drawable;
        c();
    }

    public final void setPreviewState(@k PreviewState previewState) {
        this.previewState = previewState;
        int iOrdinal = previewState.ordinal();
        ProgressBar progressBar = this.f237234b;
        View view = this.f237236d;
        TextView textView = this.f237235c;
        if (iOrdinal == 0) {
            textView.setVisibility(8);
            view.setVisibility(8);
            progressBar.setVisibility(0);
        } else if (iOrdinal == 1) {
            textView.setVisibility(8);
            view.setVisibility(0);
            progressBar.setVisibility(8);
        } else if (iOrdinal == 2) {
            textView.setVisibility(0);
            view.setVisibility(8);
            progressBar.setVisibility(8);
        }
        refreshDrawableState();
    }

    @Override // gw.InterfaceC40743a
    public void setState(@k State state) {
        this.state = state;
        c();
    }

    public final void setTitle(@l String str) {
        this.title = str;
        this.f237238f.setText(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoPreview(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? R.style.Widget_Avito_VideoPreview : i13;
        super(context, attributeSet, i12);
        this.previewState = PreviewState.f237248c;
        this.state = State.f135882f;
        this.imageContainerView = this;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_preview, (ViewGroup) this, true);
        this.f237234b = (ProgressBar) viewInflate.findViewById(R.id.video_loader);
        this.f237235c = (TextView) viewInflate.findViewById(R.id.video_error);
        this.f237236d = viewInflate.findViewById(R.id.video_content);
        this.f237237e = (ImageView) viewInflate.findViewById(R.id.video_preview_image);
        TextView textView = (TextView) viewInflate.findViewById(R.id.video_title);
        this.f237238f = textView;
        this.f237239g = (CardView) viewInflate.findViewById(R.id.video_preview_image_container);
        setCardElevation(0.0f);
        setPreventCornerOverlap(false);
        setUseCompatPadding(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13299a.f.f2574b, i12, i13);
        setPlaceholderBackground(typedArrayObtainStyledAttributes.getDrawable(3));
        setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, x.a(typedArrayObtainStyledAttributes, getContext(), 0), null, typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0), null, 0, 122));
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setCornerRadius(typedArrayObtainStyledAttributes.getDimension(2, this.cornerRadius));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            textView.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(4, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

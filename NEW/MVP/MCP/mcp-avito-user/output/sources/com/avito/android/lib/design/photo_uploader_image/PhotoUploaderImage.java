package com.avito.android.lib.design.photo_uploader_image;

import X41.j;
import Y41.a;
import Y61.k;
import Y61.l;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.design.State;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.util.x;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import gw.InterfaceC40743a;
import j.InterfaceC42150f;
import j.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import pK0.InterfaceC46971a;
import wK0.AbstractC49526a;
import wK0.AbstractC49528c;
import wK0.C49530e;

/* compiled from: PhotoUploaderImage.kt */
@s0
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0010J\u0019\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010-\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0016R*\u00101\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00138\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010\u0016R*\u00105\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00138\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+\"\u0004\b4\u0010\u0016R*\u00109\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00138\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+\"\u0004\b8\u0010\u0016R*\u0010=\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00138\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010)\u001a\u0004\b;\u0010+\"\u0004\b<\u0010\u0016R*\u0010A\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00138\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010)\u001a\u0004\b?\u0010+\"\u0004\b@\u0010\u0016R*\u0010E\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00138\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010)\u001a\u0004\bC\u0010+\"\u0004\bD\u0010\u0016R*\u0010I\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00138\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010)\u001a\u0004\bG\u0010+\"\u0004\bH\u0010\u0016R\"\u0010Q\u001a\u00020J8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010W\u001a\u0004\u0018\u00010R2\b\u0010 \u001a\u0004\u0018\u00010R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lcom/avito/android/lib/design/photo_uploader_image/PhotoUploaderImage;", "Landroidx/cardview/widget/CardView;", "LpK0/a;", "Lgw/a;", "Landroid/widget/ImageView$ScaleType;", "scaleType", "Lkotlin/G0;", "setImageScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "", "visible", "setWarningBadgeVisible", "(Z)V", "Lkotlin/Function0;", "listener", "setErrorClickedListener", "(LY41/a;)V", "setRetryClickedListener", "setRemoveClickedListener", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "(I)V", "Landroid/view/View;", "t", "Landroid/view/View;", "getImageContainerView", "()Landroid/view/View;", "setImageContainerView", "(Landroid/view/View;)V", "imageContainerView", "", "value", "u", "F", "getCornerRadius", "()F", "setCornerRadius", "(F)V", "cornerRadius", "v", "I", "getActionsPadding", "()I", "setActionsPadding", "actionsPadding", "w", "getSpinnerStyle", "setSpinnerStyle", "spinnerStyle", "x", "getErrorIconStyle", "setErrorIconStyle", "errorIconStyle", "y", "getWarningIconStyle", "setWarningIconStyle", "warningIconStyle", "z", "getMinorRemoveIconStyle", "setMinorRemoveIconStyle", "minorRemoveIconStyle", "A", "getMinorRetryIconStyle", "setMinorRetryIconStyle", "minorRetryIconStyle", "B", "getMajorRemoveIconStyle", "setMajorRemoveIconStyle", "majorRemoveIconStyle", "C", "getAuxiliaryIconStyle", "setAuxiliaryIconStyle", "auxiliaryIconStyle", "Lcom/avito/android/design/State;", "D", "Lcom/avito/android/design/State;", "getState", "()Lcom/avito/android/design/State;", "setState", "(Lcom/avito/android/design/State;)V", VoiceInfo.STATE, "Landroid/graphics/drawable/Drawable;", "getImage", "()Landroid/graphics/drawable/Drawable;", "setImage", "(Landroid/graphics/drawable/Drawable;)V", "image", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoUploaderImage extends CardView implements InterfaceC46971a, InterfaceC40743a {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f179945E = 0;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    @f0
    public int minorRetryIconStyle;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    @f0
    public int majorRemoveIconStyle;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    @f0
    public int auxiliaryIconStyle;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    @k
    public State state;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f179950b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f179951c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f179952d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f179953e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f179954f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f179955g;

    /* renamed from: h, reason: collision with root package name */
    public final View f179956h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f179957i;

    /* renamed from: j, reason: collision with root package name */
    public final View f179958j;

    /* renamed from: k, reason: collision with root package name */
    public final Spinner f179959k;

    /* renamed from: l, reason: collision with root package name */
    public final ImageView f179960l;

    /* renamed from: m, reason: collision with root package name */
    public final List<? extends View> f179961m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public ColorStateList f179962n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public ColorStateList f179963o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public ColorStateList f179964p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public ColorStateList f179965q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public ColorStateList f179966r;

    /* renamed from: s, reason: collision with root package name */
    public int f179967s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @l
    public View imageContainerView;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public float cornerRadius;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public int actionsPadding;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @f0
    public int spinnerStyle;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @f0
    public int errorIconStyle;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @f0
    public int warningIconStyle;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @f0
    public int minorRemoveIconStyle;

    @j
    public PhotoUploaderImage(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @SuppressLint({"CustomViewStyleable"})
    public static void g(ImageView imageView, @f0 int i12) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = imageView.getContext().obtainStyledAttributes(i12, d.n.f178975j0);
        imageView.setImageTintList(x.a(typedArrayObtainStyledAttributes, imageView.getContext(), 3));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        imageView.getLayoutParams().width = dimensionPixelSize;
        imageView.getLayoutParams().height = dimensionPixelSize;
        AbstractC49528c.a aVar = AbstractC49528c.f441377b;
        aVar.getClass();
        imageView.setBackground(AbstractC49528c.a.b(aVar, AbstractC49528c.a.a(), 0, 0, 0, 0, x.a(typedArrayObtainStyledAttributes, imageView.getContext(), 0), x.a(typedArrayObtainStyledAttributes, imageView.getContext(), 1), null, null, 414));
        typedArrayObtainStyledAttributes.recycle();
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void c(TypedArray typedArray) throws Resources.NotFoundException {
        Integer numValueOf;
        if (typedArray.hasValue(6)) {
            setCornerRadius(typedArray.getDimension(6, this.cornerRadius));
            d();
        }
        if (typedArray.hasValue(0)) {
            setActionsPadding(typedArray.getDimensionPixelSize(0, this.actionsPadding));
        }
        if (typedArray.hasValue(20)) {
            setSpinnerStyle(typedArray.getResourceId(20, this.spinnerStyle));
        }
        if (typedArray.hasValue(13)) {
            ImageView imageView = this.f179953e;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setImageDrawable(typedArray.getDrawable(13));
        }
        if (typedArray.hasValue(14)) {
            setMinorRemoveIconStyle(typedArray.getResourceId(14, 0));
        }
        if (typedArray.hasValue(15)) {
            ImageView imageView2 = this.f179957i;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setImageDrawable(typedArray.getDrawable(15));
        }
        if (typedArray.hasValue(16)) {
            setMinorRetryIconStyle(typedArray.getResourceId(16, 0));
        }
        if (typedArray.hasValue(10)) {
            ImageView imageView3 = this.f179952d;
            if (imageView3 == null) {
                imageView3 = null;
            }
            imageView3.setImageDrawable(typedArray.getDrawable(10));
        }
        if (typedArray.hasValue(11)) {
            setMajorRemoveIconStyle(typedArray.getResourceId(11, 0));
        }
        if (typedArray.hasValue(7)) {
            ImageView imageView4 = this.f179955g;
            if (imageView4 == null) {
                imageView4 = null;
            }
            imageView4.setImageDrawable(typedArray.getDrawable(7));
        }
        if (typedArray.hasValue(8)) {
            setErrorIconStyle(typedArray.getResourceId(8, 0));
        }
        if (typedArray.hasValue(21)) {
            ImageView imageView5 = this.f179954f;
            if (imageView5 == null) {
                imageView5 = null;
            }
            imageView5.setImageDrawable(typedArray.getDrawable(21));
        }
        if (typedArray.hasValue(22)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(22, 0);
            ImageView imageView6 = this.f179954f;
            if (imageView6 == null) {
                imageView6 = null;
            }
            D6.b(imageView6, Integer.valueOf(dimensionPixelSize), Integer.valueOf(dimensionPixelSize), Integer.valueOf(dimensionPixelSize), Integer.valueOf(dimensionPixelSize));
        }
        if (typedArray.hasValue(23)) {
            setWarningIconStyle(typedArray.getResourceId(23, 0));
        }
        if (typedArray.hasValue(3)) {
            ImageView imageView7 = this.f179950b;
            if (imageView7 == null) {
                imageView7 = null;
            }
            C49530e c49530e = new C49530e(new RectShape());
            c49530e.f441390a.f441394c = x.a(typedArray, getContext(), 3);
            c49530e.a();
            imageView7.setBackground(c49530e);
        }
        int[] iArr = {17, 18};
        int i12 = 0;
        while (true) {
            if (i12 >= 2) {
                numValueOf = null;
                break;
            }
            int i13 = iArr[i12];
            if (typedArray.hasValue(i13)) {
                numValueOf = Integer.valueOf(i13);
                break;
            }
            i12++;
        }
        if (numValueOf != null) {
            this.f179962n = x.a(typedArray, getContext(), 17);
            ColorStateList colorStateListA = x.a(typedArray, getContext(), 18);
            this.f179963o = colorStateListA;
            this.f179964p = colorStateListA;
            ColorStateList colorStateList = this.f179962n;
            this.f179965q = colorStateList;
            ImageView imageView8 = this.f179951c;
            if (imageView8 == null) {
                imageView8 = null;
            }
            imageView8.setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, colorStateList, colorStateListA, 0, null, 0, 124));
        }
        if (typedArray.hasValue(19)) {
            this.f179964p = x.a(typedArray, getContext(), 19);
        }
        if (typedArray.hasValue(12)) {
            this.f179965q = x.a(typedArray, getContext(), 12);
        }
        if (typedArray.hasValue(1)) {
            ImageView imageView9 = this.f179960l;
            (imageView9 != null ? imageView9 : null).setImageDrawable(typedArray.getDrawable(1));
        }
        if (typedArray.hasValue(2)) {
            setAuxiliaryIconStyle(typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f179966r = x.a(typedArray, getContext(), 4);
        }
        if (typedArray.hasValue(5)) {
            this.f179967s = typedArray.getDimensionPixelSize(5, 0);
        }
    }

    public final void d() {
        float fMin = Math.min(getHeight(), getWidth()) / 2.0f;
        float f12 = this.cornerRadius;
        if (fMin > f12) {
            fMin = f12;
        }
        setRadius(fMin);
    }

    public final void e(View view) {
        List<? extends View> list = this.f179961m;
        if (list == null) {
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!L.f((View) obj, view)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            D6.g((View) it.next());
        }
        D6.H(view);
    }

    public final int getActionsPadding() {
        return this.actionsPadding;
    }

    public final int getAuxiliaryIconStyle() {
        return this.auxiliaryIconStyle;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getErrorIconStyle() {
        return this.errorIconStyle;
    }

    @Override // gw.InterfaceC40743a
    @l
    /* renamed from: getImage */
    public Drawable getF179015b() {
        ImageView imageView = this.f179950b;
        if (imageView == null) {
            imageView = null;
        }
        return imageView.getDrawable();
    }

    @Override // gw.InterfaceC40743a
    @l
    public View getImageContainerView() {
        return this.imageContainerView;
    }

    public final int getMajorRemoveIconStyle() {
        return this.majorRemoveIconStyle;
    }

    public final int getMinorRemoveIconStyle() {
        return this.minorRemoveIconStyle;
    }

    public final int getMinorRetryIconStyle() {
        return this.minorRetryIconStyle;
    }

    public final int getSpinnerStyle() {
        return this.spinnerStyle;
    }

    @k
    public State getState() {
        return this.state;
    }

    public final int getWarningIconStyle() {
        return this.warningIconStyle;
    }

    public final void i() {
        ImageView imageView = this.f179951c;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, this.f179962n, null, 0, null, 0, 124));
        ImageView imageView2 = this.f179951c;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setClickable(false);
        ImageView imageView3 = this.f179960l;
        e(imageView3 != null ? imageView3 : null);
    }

    public final void j() {
        ImageView imageView = this.f179951c;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, null, this.f179963o, 0, null, 0, 125));
        ImageView imageView2 = this.f179951c;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setClickable(false);
        List<? extends View> list = this.f179961m;
        Iterator<T> it = (list != null ? list : null).iterator();
        while (it.hasNext()) {
            D6.g((View) it.next());
        }
    }

    public final void k(boolean z12) {
        ImageView imageView = this.f179951c;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, this.f179962n, null, 0, null, 0, 124));
        ImageView imageView2 = this.f179951c;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setClickable(false);
        View view = this.f179958j;
        if (view == null) {
            view = null;
        }
        D6.G(view, z12);
        View view2 = this.f179956h;
        e(view2 != null ? view2 : null);
    }

    public final void l(boolean z12, boolean z13) {
        ImageView imageView = this.f179951c;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, this.f179962n, null, b.b(this.cornerRadius), this.f179966r, this.f179967s, 96));
        ImageView imageView2 = this.f179951c;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setClickable(!z12);
        if (z13) {
            ImageView imageView3 = this.f179955g;
            e(imageView3 != null ? imageView3 : null);
        } else {
            List<? extends View> list = this.f179961m;
            Iterator<T> it = (list != null ? list : null).iterator();
            while (it.hasNext()) {
                D6.g((View) it.next());
            }
        }
    }

    public final void n() {
        ImageView imageView = this.f179951c;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, this.f179962n, this.f179964p, 0, null, 0, 124));
        ImageView imageView2 = this.f179951c;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setClickable(false);
        Spinner spinner = this.f179959k;
        e(spinner != null ? spinner : null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        d();
    }

    public final void setActionsPadding(int i12) {
        this.actionsPadding = i12;
        View view = this.f179956h;
        if (view == null) {
            view = null;
        }
        D6.f(view, i12, 0, i12, 0, 10);
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178973i0);
        c(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setAuxiliaryIconStyle(int i12) throws Resources.NotFoundException {
        this.auxiliaryIconStyle = i12;
        ImageView imageView = this.f179960l;
        if (imageView == null) {
            imageView = null;
        }
        g(imageView, i12);
    }

    public final void setCornerRadius(float f12) {
        this.cornerRadius = f12;
        d();
    }

    public final void setErrorClickedListener(@l a<G0> listener) {
        if (listener != null) {
            ImageView imageView = this.f179955g;
            (imageView != null ? imageView : null).setOnClickListener(new ru.avito.component.payments.method.b(5, listener));
        } else {
            ImageView imageView2 = this.f179955g;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setOnClickListener(null);
        }
    }

    public final void setErrorIconStyle(int i12) throws Resources.NotFoundException {
        this.errorIconStyle = i12;
        ImageView imageView = this.f179955g;
        if (imageView == null) {
            imageView = null;
        }
        g(imageView, i12);
    }

    @Override // gw.InterfaceC40743a
    public void setImage(@l Drawable drawable) {
        ImageView imageView = this.f179950b;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
    }

    public void setImageContainerView(@l View view) {
        this.imageContainerView = view;
    }

    public final void setImageScaleType(@k ImageView.ScaleType scaleType) {
        ImageView imageView = this.f179950b;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setScaleType(scaleType);
    }

    public final void setMajorRemoveIconStyle(int i12) throws Resources.NotFoundException {
        this.majorRemoveIconStyle = i12;
        ImageView imageView = this.f179952d;
        if (imageView == null) {
            imageView = null;
        }
        g(imageView, i12);
    }

    public final void setMinorRemoveIconStyle(int i12) throws Resources.NotFoundException {
        this.minorRemoveIconStyle = i12;
        ImageView imageView = this.f179953e;
        if (imageView == null) {
            imageView = null;
        }
        g(imageView, i12);
    }

    public final void setMinorRetryIconStyle(int i12) throws Resources.NotFoundException {
        this.minorRetryIconStyle = i12;
        ImageView imageView = this.f179957i;
        if (imageView == null) {
            imageView = null;
        }
        g(imageView, i12);
    }

    public final void setRemoveClickedListener(@l a<G0> listener) {
        if (listener != null) {
            ImageView imageView = this.f179952d;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setOnClickListener(new ru.avito.component.payments.method.b(3, listener));
            ImageView imageView2 = this.f179953e;
            (imageView2 != null ? imageView2 : null).setOnClickListener(new ru.avito.component.payments.method.b(4, listener));
            return;
        }
        ImageView imageView3 = this.f179952d;
        if (imageView3 == null) {
            imageView3 = null;
        }
        imageView3.setOnClickListener(null);
        ImageView imageView4 = this.f179953e;
        if (imageView4 == null) {
            imageView4 = null;
        }
        imageView4.setOnClickListener(null);
    }

    public final void setRetryClickedListener(@l a<G0> listener) {
        if (listener != null) {
            ImageView imageView = this.f179957i;
            (imageView != null ? imageView : null).setOnClickListener(new ru.avito.component.payments.method.b(6, listener));
        } else {
            ImageView imageView2 = this.f179957i;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setOnClickListener(null);
        }
    }

    public final void setSpinnerStyle(int i12) throws Resources.NotFoundException {
        this.spinnerStyle = i12;
        Spinner spinner = this.f179959k;
        if (spinner == null) {
            spinner = null;
        }
        spinner.setAppearance(i12);
    }

    @Override // gw.InterfaceC40743a
    public void setState(@k State state) {
        this.state = state;
    }

    public final void setWarningBadgeVisible(boolean visible) {
        ImageView imageView = this.f179954f;
        if (imageView == null) {
            imageView = null;
        }
        D6.G(imageView, visible);
    }

    public final void setWarningIconStyle(int i12) throws Resources.NotFoundException {
        this.warningIconStyle = i12;
        ImageView imageView = this.f179954f;
        if (imageView == null) {
            imageView = null;
        }
        g(imageView, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PhotoUploaderImage(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) throws Resources.NotFoundException {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.photoUploaderImage : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_PhotoUploaderImage : i13;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178973i0, i12, i13);
        LayoutInflater.from(getContext()).inflate(typedArrayObtainStyledAttributes.getResourceId(9, R.layout.photo_uploader_image), (ViewGroup) this, true);
        setCardElevation(0.0f);
        setPreventCornerOverlap(false);
        setUseCompatPadding(false);
        setLayoutTransition(new LayoutTransition());
        View viewFindViewById = findViewById(R.id.image_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f179950b = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.overlay_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f179951c = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.progress_bar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f179959k = (Spinner) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.big_delete_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f179952d = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.warning_icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f179954f = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.error_icon);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f179955g = (ImageView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.error_actions_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f179956h = viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.minor_retry_icon);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f179957i = (ImageView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.minor_retry_icon_container);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f179958j = viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.minor_remove_icon);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f179953e = (ImageView) viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.auxiliary_icon);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById11;
        this.f179960l = imageView;
        Spinner spinner = this.f179959k;
        spinner = spinner == null ? null : spinner;
        View view = this.f179956h;
        view = view == null ? null : view;
        ImageView imageView2 = this.f179955g;
        imageView2 = imageView2 == null ? null : imageView2;
        ImageView imageView3 = this.f179952d;
        imageView3 = imageView3 == null ? null : imageView3;
        ImageView imageView4 = this.f179954f;
        this.f179961m = C42745f0.U(spinner, view, imageView2, imageView3, imageView4 != null ? imageView4 : null, imageView);
        c(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        this.imageContainerView = this;
        this.state = State.f135880d;
    }
}

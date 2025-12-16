package com.avito.android.photo_picker.camera_mvi.ui;

import X41.j;
import Y61.k;
import Y61.l;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SelectedPhotosView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/ui/SelectedPhotosView;", "Landroid/widget/FrameLayout;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SelectedPhotosView extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f219261k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f219262b;

    /* renamed from: c, reason: collision with root package name */
    public final int f219263c;

    /* renamed from: d, reason: collision with root package name */
    public final int f219264d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final f f219265e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final f f219266f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final f f219267g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f219268h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final IntEvaluator f219269i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public ValueAnimator f219270j;

    @j
    public SelectedPhotosView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final f a(int i12, int i13) {
        f fVar = new f(getContext(), null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i12);
        layoutParams.setMarginStart(i13);
        layoutParams.gravity = 16;
        fVar.setLayoutParams(layoutParams);
        return fVar;
    }

    public final void b(@k CameraState.c cVar, @k String str, @k InterfaceC28373a interfaceC28373a) {
        Bitmap bitmap = cVar.f219177a;
        f fVar = this.f219265e;
        fVar.f219304h = interfaceC28373a;
        if (bitmap == null) {
            D6.w(fVar);
        } else {
            fVar.f219301e = bitmap;
            fVar.invalidate();
            D6.H(fVar);
        }
        f fVar2 = this.f219266f;
        fVar2.f219304h = interfaceC28373a;
        Bitmap bitmap2 = cVar.f219178b;
        if (bitmap2 == null) {
            D6.w(fVar2);
        } else {
            fVar2.f219301e = bitmap2;
            fVar2.invalidate();
            D6.H(fVar2);
        }
        f fVar3 = this.f219267g;
        fVar3.f219304h = interfaceC28373a;
        Bitmap bitmap3 = cVar.f219179c;
        if (bitmap3 == null) {
            D6.w(fVar3);
        } else {
            fVar3.f219301e = bitmap3;
            fVar3.invalidate();
            D6.H(fVar3);
        }
        this.f219268h.setText(str);
    }

    public SelectedPhotosView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        int iB2 = y6.b(54);
        this.f219262b = iB2;
        int iB3 = y6.b(46);
        this.f219263c = iB3;
        int iB4 = y6.b(14);
        this.f219264d = iB4;
        f fVarA = a(iB2, 0);
        this.f219265e = fVarA;
        f fVarA2 = a(iB3, iB4);
        this.f219266f = fVarA2;
        f fVarA3 = a(iB3, iB4);
        this.f219267g = fVarA3;
        TextView textView = new TextView(getContext());
        textView.setTextAppearance(C35835l0.j(R.attr.textM20, textView.getContext()));
        textView.setTextColor(C35835l0.d(R.attr.constantWhite, textView.getContext()));
        textView.setLayoutParams(new FrameLayout.LayoutParams(iB2, -2, 16));
        textView.setGravity(17);
        this.f219268h = textView;
        this.f219269i = new IntEvaluator();
        addView(fVarA3);
        addView(fVarA2);
        addView(fVarA);
        addView(textView);
    }
}

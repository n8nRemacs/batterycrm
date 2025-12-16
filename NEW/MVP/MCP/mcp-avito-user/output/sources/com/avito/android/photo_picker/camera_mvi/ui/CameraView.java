package com.avito.android.photo_picker.camera_mvi.ui;

import X41.j;
import Y41.p;
import Y61.k;
import Y61.l;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.core.CameraControl;
import androidx.camera.core.InterfaceC20127n;
import androidx.camera.core.M;
import androidx.camera.core.impl.utils.t;
import androidx.camera.view.AbstractC20193e;
import androidx.camera.view.PreviewView;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CameraView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/ui/CameraView;", "Landroid/widget/FrameLayout;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CameraView extends FrameLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f219252j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Size f219253b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PreviewView f219254c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e f219255d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final d f219256e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final IntEvaluator f219257f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final FloatEvaluator f219258g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public ValueAnimator f219259h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public p<? super Boolean, ? super Integer, G0> f219260i;

    /* compiled from: CameraView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CameraState.Ratio.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CameraState.Ratio ratio = CameraState.Ratio.f219166c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CameraState.Ratio ratio2 = CameraState.Ratio.f219166c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @j
    public CameraView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final Size a(CameraState.Ratio ratio) {
        int iOrdinal = ratio.ordinal();
        Size size = this.f219253b;
        if (iOrdinal == 0) {
            return new Size(size.getWidth(), size.getWidth());
        }
        if (iOrdinal == 1) {
            return new Size(size.getWidth(), (size.getWidth() / 3) * 4);
        }
        if (iOrdinal == 2) {
            return new Size(size.getWidth(), (size.getWidth() / 4) * 3);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(float f12, int i12, int i13, boolean z12) {
        PreviewView previewView = this.f219254c;
        previewView.setY(f12);
        ViewGroup.LayoutParams layoutParams = previewView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i12;
        layoutParams.height = i13;
        previewView.setLayoutParams(layoutParams);
        e eVar = this.f219255d;
        eVar.setY(f12);
        ViewGroup.LayoutParams layoutParams2 = eVar.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = i12;
        layoutParams2.height = i13;
        eVar.setLayoutParams(layoutParams2);
        d dVar = this.f219256e;
        dVar.setY(f12);
        ViewGroup.LayoutParams layoutParams3 = dVar.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.width = i12;
        layoutParams3.height = i13;
        dVar.setLayoutParams(layoutParams3);
        p<? super Boolean, ? super Integer, G0> pVar = this.f219260i;
        if (pVar != null) {
            pVar.invoke(Boolean.valueOf(z12), Integer.valueOf(((int) f12) + i13));
        }
    }

    public CameraView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f219253b = new Size(C35835l0.g(context).x, C35835l0.g(context).y);
        PreviewView previewView = new PreviewView(context, null);
        this.f219254c = previewView;
        e eVar = new e(context, null, 0, 6, null);
        this.f219255d = eVar;
        d dVar = new d(context, null, 0, 6, null);
        this.f219256e = dVar;
        this.f219257f = new IntEvaluator();
        this.f219258g = new FloatEvaluator();
        previewView.setImplementationMode(PreviewView.ImplementationMode.COMPATIBLE);
        addView(previewView);
        addView(eVar);
        addView(dVar);
        previewView.setOnTouchListener(new View.OnTouchListener() { // from class: com.avito.android.photo_picker.camera_mvi.ui.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i14 = CameraView.f219252j;
                if (motionEvent.getAction() != 0) {
                    return true;
                }
                CameraView cameraView = this.f219271b;
                PreviewView previewView2 = cameraView.f219254c;
                M m12 = new M(new M.a(previewView2.getMeteringPointFactory().b(motionEvent.getX(), motionEvent.getY(), 0.15f)));
                AbstractC20193e controller = previewView2.getController();
                if (controller != null) {
                    t.a();
                    InterfaceC20127n interfaceC20127n = controller.f25421g;
                    CameraControl cameraControlA = interfaceC20127n == null ? null : interfaceC20127n.a();
                    if (cameraControlA != null) {
                        cameraControlA.g(m12);
                    }
                }
                float x12 = motionEvent.getX();
                float y12 = motionEvent.getY();
                d dVar2 = cameraView.f219256e;
                dVar2.f219289k = x12;
                dVar2.f219290l = y12;
                dVar2.f219291m = dVar2.a(dVar2.f219284f, dVar2.f219285g);
                dVar2.invalidate();
                AnimatorSet animatorSet = dVar2.f219280b;
                animatorSet.cancel();
                animatorSet.start();
                return true;
            }
        });
    }
}

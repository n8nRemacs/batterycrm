package com.avito.android.photo_picker.camera_mvi;

import Cd.C13243a;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.C20056e0;
import androidx.camera.core.C20144v;
import androidx.camera.core.InterfaceC20120j0;
import androidx.camera.core.impl.utils.t;
import androidx.camera.view.C20197i;
import androidx.camera.view.PreviewView;
import androidx.core.util.z;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.permissions.x;
import com.avito.android.photo_cache.PhotoSource;
import com.avito.android.photo_permission.PhotoPermission;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_picker.SelectedPhoto;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.b;
import com.avito.android.photo_picker.camera_mvi.ui.CameraView;
import com.avito.android.photo_picker.camera_mvi.ui.SelectedPhotosView;
import com.avito.android.photo_picker.r;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import i.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.reactive.A;
import kotlinx.coroutines.rx3.y;
import o80.InterfaceC44600a;
import z1.AbstractC50339a;

/* compiled from: CameraFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/CameraFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CameraFragment extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_picker.camera_mvi.h f219044n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f219045o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.device_orientation.i f219046p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f219047q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public x f219048r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final O0 f219049s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public a f219050t0;

    /* renamed from: u0, reason: collision with root package name */
    public C20197i f219051u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final d f219052v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f219053w0;

    /* compiled from: CameraFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/CameraFragment$a;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ImageView f219054a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ImageView f219055b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ImageView f219056c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ImageView f219057d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ImageView f219058e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final TextView f219059f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final TextView f219060g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final CameraView f219061h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final View f219062i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final Button f219063j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final Button f219064k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final SelectedPhotosView f219065l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final C42670a f219066m;

        public a(@Y61.k ImageView imageView, @Y61.k ImageView imageView2, @Y61.k ImageView imageView3, @Y61.k ImageView imageView4, @Y61.k ImageView imageView5, @Y61.k TextView textView, @Y61.k TextView textView2, @Y61.k CameraView cameraView, @Y61.k View view, @Y61.k Button button, @Y61.k Button button2, @Y61.k SelectedPhotosView selectedPhotosView, @Y61.k C42670a c42670a) {
            this.f219054a = imageView;
            this.f219055b = imageView2;
            this.f219056c = imageView3;
            this.f219057d = imageView4;
            this.f219058e = imageView5;
            this.f219059f = textView;
            this.f219060g = textView2;
            this.f219061h = cameraView;
            this.f219062i = view;
            this.f219063j = button;
            this.f219064k = button2;
            this.f219065l = selectedPhotosView;
            this.f219066m = c42670a;
        }
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[CameraState.CameraType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CameraState.CameraType cameraType = CameraState.CameraType.f219157b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[CameraState.Flash.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CameraState.Flash flash = CameraState.Flash.f219161c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isInitial", "", "previewBottom", "Lkotlin/G0;", "invoke", "(ZI)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<Boolean, Integer, G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(Boolean bool, Integer num) {
            boolean zBooleanValue = bool.booleanValue();
            final int iIntValue = num.intValue();
            final CameraFragment cameraFragment = CameraFragment.this;
            if (zBooleanValue) {
                a aVarS5 = cameraFragment.s5();
                aVarS5.f219059f.post(new Runnable() { // from class: com.avito.android.photo_picker.camera_mvi.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraFragment cameraFragment2 = cameraFragment;
                        CameraFragment.q5(cameraFragment2, cameraFragment2.s5(), iIntValue);
                        cameraFragment2.s5().f219059f.setAlpha(1.0f);
                    }
                });
            } else {
                CameraFragment.q5(cameraFragment, cameraFragment.s5(), iIntValue);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/photo_picker/camera_mvi/CameraFragment$d", "Landroidx/camera/core/e0$j;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends C20056e0.j {
        public d() {
        }

        @Override // androidx.camera.core.C20056e0.j
        public final void a(@Y61.k InterfaceC20120j0 interfaceC20120j0) {
            CameraFragment.this.u5().accept(new InterfaceC44600a.j(interfaceC20120j0));
        }
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<com.avito.android.photo_picker.camera_mvi.mvi.entity.b, G0> {
        public final void f(@Y61.k com.avito.android.photo_picker.camera_mvi.mvi.entity.b bVar) {
            C20197i c20197i;
            C20144v c20144v;
            int i12 = 2;
            CameraFragment cameraFragment = (CameraFragment) this.receiver;
            cameraFragment.getClass();
            if (bVar instanceof b.m) {
                Executor mainExecutor = androidx.core.content.d.getMainExecutor(cameraFragment.requireContext());
                C20197i c20197i2 = cameraFragment.f219051u0;
                c20197i = c20197i2 != null ? c20197i2 : null;
                c20197i.getClass();
                t.a();
                z.g("Camera not initialized.", c20197i.f25422h != null);
                t.a();
                z.g("ImageCapture disabled.", (c20197i.f25416b & 1) != 0);
                c20197i.f25418d.K(mainExecutor, cameraFragment.f219052v0);
                return;
            }
            if (bVar instanceof b.g) {
                PhotoPickerViewModel.Be(cameraFragment.t5(), ((b.g) bVar).f219210a, PhotoSource.f216295e, null, 12);
                return;
            }
            if (bVar instanceof b.a) {
                int iOrdinal = ((b.a) bVar).f219204a.ordinal();
                if (iOrdinal == 0) {
                    c20144v = C20144v.f24563c;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c20144v = C20144v.f24562b;
                }
                C20197i c20197i3 = cameraFragment.f219051u0;
                if (c20197i3 == null) {
                    c20197i3 = null;
                }
                if (c20197i3.c(c20144v)) {
                    C20197i c20197i4 = cameraFragment.f219051u0;
                    if (c20197i4 == null) {
                        c20197i4 = null;
                    }
                    c20197i4.getClass();
                    t.a();
                    if (!L.f(c20197i4.f25415a, c20144v)) {
                        cameraFragment.s5().f219057d.animate().rotationBy(-180.0f);
                        C20197i c20197i5 = cameraFragment.f219051u0;
                        (c20197i5 != null ? c20197i5 : null).e(c20144v);
                        return;
                    }
                }
                com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, cameraFragment.s5().f219058e, com.avito.android.printable_text.b.c(R.string.camera_error_change_type, new Serializable[0]), null, null, null, null, 0, null, null, false, false, null, null, 4094);
                cameraFragment.u5().accept(InterfaceC44600a.d.f419452a);
                return;
            }
            if (bVar instanceof b.C6588b) {
                b.C6588b c6588b = (b.C6588b) bVar;
                C20197i c20197i6 = cameraFragment.f219051u0;
                c20197i = c20197i6 != null ? c20197i6 : null;
                int iOrdinal2 = c6588b.f219205a.ordinal();
                if (iOrdinal2 == 0) {
                    i12 = 1;
                } else if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                c20197i.getClass();
                t.a();
                c20197i.f25418d.J(i12);
                return;
            }
            if (bVar instanceof b.j) {
                b.j jVar = (b.j) bVar;
                final CameraView cameraView = cameraFragment.s5().f219061h;
                ValueAnimator valueAnimator = cameraView.f219259h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                PreviewView previewView = cameraView.f219254c;
                final Size size = new Size(previewView.getWidth(), previewView.getHeight());
                final float y12 = previewView.getY();
                final Size sizeA = cameraView.a(jVar.f219214a);
                final float height = (cameraView.f219253b.getHeight() - sizeA.getHeight()) * (jVar.f219215b ? 0.5f : 0.2f);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(300L);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.avito.android.photo_picker.camera_mvi.ui.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        int i13 = CameraView.f219252j;
                        float animatedFraction = valueAnimator2.getAnimatedFraction();
                        CameraView cameraView2 = cameraView;
                        IntEvaluator intEvaluator = cameraView2.f219257f;
                        Size size2 = size;
                        Integer numValueOf = Integer.valueOf(size2.getWidth());
                        Size size3 = sizeA;
                        cameraView2.b(cameraView2.f219258g.evaluate(animatedFraction, (Number) Float.valueOf(y12), (Number) Float.valueOf(height)).floatValue(), intEvaluator.evaluate(animatedFraction, numValueOf, Integer.valueOf(size3.getWidth())).intValue(), intEvaluator.evaluate(animatedFraction, Integer.valueOf(size2.getHeight()), Integer.valueOf(size3.getHeight())).intValue(), false);
                    }
                });
                cameraView.f219259h = valueAnimatorOfFloat;
                valueAnimatorOfFloat.start();
                return;
            }
            if (bVar instanceof b.i) {
                b.i iVar = (b.i) bVar;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = cameraFragment.s5().f219054a.animate();
                float f12 = iVar.f219212a;
                viewPropertyAnimatorAnimate.rotation(f12);
                cameraFragment.s5().f219055b.animate().rotation(f12);
                cameraFragment.s5().f219056c.animate().rotation(f12);
                cameraFragment.s5().f219057d.animate().rotation(f12);
                cameraFragment.s5().f219057d.animate().rotation(f12);
                cameraFragment.s5().f219064k.animate().rotation(f12);
                cameraFragment.s5().f219065l.animate().rotation(f12);
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = cameraFragment.s5().f219059f.animate();
                float f13 = iVar.f219213b;
                viewPropertyAnimatorAnimate2.alpha(f13);
                cameraFragment.s5().f219060g.animate().alpha(1 - f13);
                return;
            }
            if (bVar instanceof b.k) {
                SelectedPhotosView selectedPhotosView = cameraFragment.s5().f219065l;
                ValueAnimator valueAnimator2 = selectedPhotosView.f219270j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.setDuration(300L);
                valueAnimatorOfFloat2.addUpdateListener(new com.avito.android.photo_picker.camera_mvi.ui.c(selectedPhotosView, 3));
                selectedPhotosView.f219270j = valueAnimatorOfFloat2;
                valueAnimatorOfFloat2.start();
                return;
            }
            if (L.f(bVar, b.f.f219209a)) {
                cameraFragment.t5().ve();
                return;
            }
            if (L.f(bVar, b.e.f219208a)) {
                cameraFragment.t5().ue();
                return;
            }
            if (L.f(bVar, b.c.f219206a)) {
                cameraFragment.t5().Ce();
                cameraFragment.t5().me();
                return;
            }
            if (L.f(bVar, b.h.f219211a)) {
                PhotoPermission.Camera.f218689b.getClass();
                cameraFragment.f219053w0.b(PhotoPermission.Camera.f218690c);
            } else if (bVar instanceof b.d) {
                cameraFragment.t5().f218825U.setValue(PhotoPickerViewModel.a.h.f218851a);
            } else {
                if (!L.f(bVar, b.l.f219217a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cameraFragment.u5().accept(InterfaceC44600a.b.f419449a);
                C20197i c20197i7 = cameraFragment.f219051u0;
                ((androidx.camera.core.impl.utils.futures.d) (c20197i7 != null ? c20197i7 : null).f25436v).N(new com.avito.android.inline_filters.dialog.group.item.double_input.e(cameraFragment, 18), androidx.core.content.d.getMainExecutor(cameraFragment.requireContext()));
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(com.avito.android.photo_picker.camera_mvi.mvi.entity.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<CameraState, G0> {
        public final void f(@Y61.k CameraState cameraState) {
            CameraFragment cameraFragment = (CameraFragment) this.receiver;
            cameraFragment.getClass();
            CameraState.a aVar = cameraState.f219145a;
            boolean z12 = aVar instanceof CameraState.a.d;
            D6.G(cameraFragment.s5().f219061h, z12);
            boolean z13 = aVar instanceof CameraState.a.c;
            D6.G(cameraFragment.s5().f219062i, z13);
            if (z12) {
                cameraFragment.s5().f219066m.b();
            } else if (aVar instanceof CameraState.a.b) {
                C42670a.d(cameraFragment.s5().f219066m);
            } else if (aVar instanceof CameraState.a.C6586a) {
                cameraFragment.s5().f219066m.c(null, new com.avito.android.photo_picker.camera_mvi.c(cameraFragment, cameraState));
            } else if (z13) {
                cameraFragment.s5().f219063j.setText(cameraFragment.requireContext().getString(((CameraState.a.c) aVar).f219175a ? R.string.go_to_settings : R.string.allow_access));
                cameraFragment.s5().f219066m.b();
            }
            cameraFragment.s5().f219055b.setEnabled(z12);
            a aVarS5 = cameraFragment.s5();
            int iJ2 = C35835l0.j(cameraState.f219146b.f219171b, cameraFragment.requireContext());
            ImageView imageView = aVarS5.f219055b;
            imageView.setImageResource(iJ2);
            D6.H(imageView);
            cameraFragment.s5().f219056c.setEnabled(z12);
            a aVarS52 = cameraFragment.s5();
            int iJ3 = C35835l0.j(cameraState.f219148d.f219165b, cameraFragment.requireContext());
            ImageView imageView2 = aVarS52.f219056c;
            imageView2.setImageResource(iJ3);
            D6.H(imageView2);
            cameraFragment.s5().f219057d.setEnabled(z12);
            boolean z14 = false;
            cameraFragment.s5().f219058e.setEnabled(cameraState.f219150f && z12);
            a aVarS53 = cameraFragment.s5();
            CameraState.c cVar = cameraState.f219152h;
            Bitmap bitmap = cVar.f219177a;
            Bitmap bitmap2 = cVar.f219179c;
            Bitmap bitmap3 = cVar.f219178b;
            D6.G(aVarS53.f219065l, (bitmap == null && bitmap3 == null && bitmap2 == null) ? false : true);
            a aVarS54 = cameraFragment.s5();
            InterfaceC28373a interfaceC28373a = cameraFragment.f219047q0;
            aVarS54.f219065l.b(cVar, cameraState.f219151g, interfaceC28373a != null ? interfaceC28373a : null);
            D6.G(cameraFragment.s5().f219064k, (cVar.f219177a == null && bitmap3 == null && bitmap2 == null) ? false : true);
            cameraFragment.s5().f219064k.setLoading(cameraState.f219154j);
            cameraFragment.s5().f219064k.setClickable(cameraState.f219155k);
            a aVarS55 = cameraFragment.s5();
            boolean z15 = cameraState.f219156l;
            D6.G(aVarS55.f219059f, z15 && z12);
            a aVarS56 = cameraFragment.s5();
            if (z15 && z12) {
                z14 = true;
            }
            D6.G(aVarS56.f219060g, z14);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(CameraState cameraState) {
            f(cameraState);
            return G0.f406611a;
        }
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_picker.camera_mvi.CameraFragment$onViewCreated$3", f = "CameraFragment.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f219069q;

        /* compiled from: CameraFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.photo_picker.camera_mvi.CameraFragment$onViewCreated$3$1", f = "CameraFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f219071q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f219072r;

            /* compiled from: CameraFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.photo_picker.camera_mvi.CameraFragment$onViewCreated$3$1$1", f = "CameraFragment.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.photo_picker.camera_mvi.CameraFragment$g$a$a, reason: collision with other inner class name */
            public static final class C6577a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f219073q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CameraFragment f219074r;

                /* compiled from: CameraFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/device_orientation/c;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/device_orientation/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.photo_picker.camera_mvi.CameraFragment$g$a$a$a, reason: collision with other inner class name */
                public static final class C6578a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CameraFragment f219075b;

                    public C6578a(CameraFragment cameraFragment) {
                        this.f219075b = cameraFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f219075b.u5().accept(new InterfaceC44600a.m((com.avito.android.device_orientation.c) obj));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6577a(CameraFragment cameraFragment, Continuation<? super C6577a> continuation) {
                    super(2, continuation);
                    this.f219074r = cameraFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6577a(this.f219074r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6577a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f219073q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        CameraFragment cameraFragment = this.f219074r;
                        com.avito.android.device_orientation.i iVar = cameraFragment.f219046p0;
                        if (iVar == null) {
                            iVar = null;
                        }
                        InterfaceC43160i interfaceC43160iA = A.a(iVar.a());
                        C6578a c6578a = new C6578a(cameraFragment);
                        this.f219073q = 1;
                        if (interfaceC43160iA.collect(c6578a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* compiled from: CameraFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.photo_picker.camera_mvi.CameraFragment$onViewCreated$3$1$2", f = "CameraFragment.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f219076q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CameraFragment f219077r;

                /* compiled from: CameraFragment.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.avito.android.photo_picker.camera_mvi.CameraFragment$onViewCreated$3$1$2$1", f = "CameraFragment.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.avito.android.photo_picker.camera_mvi.CameraFragment$g$a$b$a, reason: collision with other inner class name */
                public static final class C6579a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super G0>, Continuation<? super G0>, Object> {

                    /* renamed from: q, reason: collision with root package name */
                    public int f219078q;

                    /* renamed from: r, reason: collision with root package name */
                    public /* synthetic */ Object f219079r;

                    public C6579a() {
                        throw null;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.k
                    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                        C6579a c6579a = new C6579a(2, continuation);
                        c6579a.f219079r = obj;
                        return c6579a;
                    }

                    @Override // Y41.p
                    public final Object invoke(InterfaceC43172j<? super G0> interfaceC43172j, Continuation<? super G0> continuation) {
                        return ((C6579a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = this.f219078q;
                        if (i12 == 0) {
                            C42729a0.b(obj);
                            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f219079r;
                            G0 g02 = G0.f406611a;
                            this.f219078q = 1;
                            if (interfaceC43172j.emit(g02, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C42729a0.b(obj);
                        }
                        return G0.f406611a;
                    }
                }

                /* compiled from: CameraFragment.kt */
                @s0
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.photo_picker.camera_mvi.CameraFragment$g$a$b$b, reason: collision with other inner class name */
                public static final class C6580b<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CameraFragment f219080b;

                    public C6580b(CameraFragment cameraFragment) {
                        this.f219080b = cameraFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        CameraFragment cameraFragment = this.f219080b;
                        int size = cameraFragment.t5().f218829Y.size();
                        List listF0 = C42745f0.F0(3, cameraFragment.t5().f218829Y);
                        ArrayList arrayList = new ArrayList(C42745f0.q(listF0, 10));
                        Iterator<T> it = listF0.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((SelectedPhoto) it.next()).f218866b);
                        }
                        cameraFragment.u5().accept(new InterfaceC44600a.n(size, arrayList));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(CameraFragment cameraFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f219077r = cameraFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f219077r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f219076q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        CameraFragment cameraFragment = this.f219077r;
                        C43137a0 c43137a0 = new C43137a0(new C6579a(2, null), y.a(cameraFragment.t5().f218831a0));
                        C6580b c6580b = new C6580b(cameraFragment);
                        this.f219076q = 1;
                        if (c43137a0.collect(c6580b, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* compiled from: CameraFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.photo_picker.camera_mvi.CameraFragment$onViewCreated$3$1$3", f = "CameraFragment.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f219081q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CameraFragment f219082r;

                /* compiled from: CameraFragment.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.photo_picker.camera_mvi.CameraFragment$g$a$c$a, reason: collision with other inner class name */
                public static final class C6581a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CameraFragment f219083b;

                    public C6581a(CameraFragment cameraFragment) {
                        this.f219083b = cameraFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f219083b.u5().accept(InterfaceC44600a.q.f419466a);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(CameraFragment cameraFragment, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f219082r = cameraFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f219082r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f219081q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        CameraFragment cameraFragment = this.f219082r;
                        InterfaceC43160i interfaceC43160iA = y.a(cameraFragment.t5().f218832b0);
                        C6581a c6581a = new C6581a(cameraFragment);
                        this.f219081q = 1;
                        if (((AbstractC43168f) interfaceC43160iA).collect(c6581a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CameraFragment cameraFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f219072r = cameraFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f219072r, continuation);
                aVar.f219071q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f219071q;
                CameraFragment cameraFragment = this.f219072r;
                C43259k.d(t12, null, null, new C6577a(cameraFragment, null), 3);
                C43259k.d(t12, null, null, new b(cameraFragment, null), 3);
                C43259k.d(t12, null, null, new c(cameraFragment, null), 3);
                return G0.f406611a;
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CameraFragment.this.new g(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f219069q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46683f;
                CameraFragment cameraFragment = CameraFragment.this;
                a aVar = new a(cameraFragment, null);
                this.f219069q = 1;
                if (C23056p0.b(cameraFragment, state, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h implements androidx.view.result.a, D {
        public h() {
        }

        @Override // androidx.view.result.a
        public final void a(Object obj) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            CameraFragment cameraFragment = CameraFragment.this;
            cameraFragment.u5().accept(new InterfaceC44600a.c(zBooleanValue, cameraFragment.v5()));
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof androidx.view.result.a) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(1, CameraFragment.this, CameraFragment.class, "onCameraPermissionResult", "onCameraPermissionResult(Z)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/U", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return CameraFragment.this.requireActivity().getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return CameraFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/W", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<P0.c> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return CameraFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f219088l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Y41.a aVar) {
            super(0);
            this.f219088l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f219088l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<Fragment> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CameraFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ m f219090l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(m mVar) {
            super(0);
            this.f219090l = mVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f219090l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f219091l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f219091l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f219091l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f219092l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f219092l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f219092l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/photo_picker/camera_mvi/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<com.avito.android.photo_picker.camera_mvi.g> {
        public q() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.photo_picker.camera_mvi.g invoke() {
            com.avito.android.photo_picker.camera_mvi.h hVar = CameraFragment.this.f219044n0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.photo_picker.camera_mvi.g) hVar.get();
        }
    }

    public CameraFragment() {
        super(R.layout.fragment_camera_mvi);
        l lVar = new l(new q());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new n(new m()));
        n0 n0Var = m0.f406844a;
        this.f219045o0 = new O0(n0Var.b(com.avito.android.photo_picker.camera_mvi.g.class), new o(interfaceC42726CB), lVar, new p(interfaceC42726CB));
        this.f219049s0 = new O0(n0Var.b(PhotoPickerViewModel.class), new i(), new k(), new j());
        this.f219052v0 = new d();
        this.f219053w0 = registerForActivityResult(new b.l(), new h());
    }

    public static final void q5(CameraFragment cameraFragment, a aVar, int i12) {
        cameraFragment.getClass();
        int iB2 = y6.b(8);
        TextView textView = aVar.f219059f;
        float height = textView.getHeight() + i12 + iB2;
        ImageView imageView = aVar.f219058e;
        if (height > imageView.getY()) {
            textView.setY(imageView.getY() - textView.getHeight());
        } else {
            textView.setY(i12 + iB2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f219050t0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.avito.android.device_orientation.i iVar = this.f219046p0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.start();
        androidx.core.content.j jVarL1 = l1();
        r rVar = jVarL1 instanceof r ? (r) jVarL1 : null;
        if (rVar != null) {
            rVar.b(false);
        }
        u5().accept(new InterfaceC44600a.f(v5()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.avito.android.device_orientation.i iVar = this.f219046p0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.stop();
        androidx.core.content.j jVarL1 = l1();
        r rVar = jVarL1 instanceof r ? (r) jVarL1 : null;
        if (rVar != null) {
            rVar.b(true);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f219050t0 = new a((ImageView) view.findViewById(R.id.close), (ImageView) view.findViewById(R.id.ratio), (ImageView) view.findViewById(R.id.flash), (ImageView) view.findViewById(R.id.camera_type), (ImageView) view.findViewById(R.id.take_photo), (TextView) view.findViewById(R.id.hint), (TextView) view.findViewById(R.id.landscape_hint), (CameraView) view.findViewById(R.id.camera), view.findViewById(R.id.no_permission), (Button) view.findViewById(R.id.allow_access_btn), (Button) view.findViewById(R.id.done), (SelectedPhotosView) view.findViewById(R.id.selected_photos), new C42670a((ViewGroup) view.findViewById(R.id.camera_loader), new com.avito.android.photo_picker.camera_mvi.d(view), R.layout.progress_overlay_loader_inverse));
        C20197i c20197i = new C20197i(requireContext());
        this.f219051u0 = c20197i;
        t.a();
        c20197i.f25439w = this;
        c20197i.h(null);
        C20197i c20197i2 = this.f219051u0;
        if (c20197i2 == null) {
            c20197i2 = null;
        }
        c20197i2.e(C20144v.f24563c);
        C20197i c20197i3 = this.f219051u0;
        if (c20197i3 == null) {
            c20197i3 = null;
        }
        c20197i3.getClass();
        t.a();
        c20197i3.f25418d.J(2);
        C20197i c20197i4 = this.f219051u0;
        if (c20197i4 == null) {
            c20197i4 = null;
        }
        c20197i4.getClass();
        t.a();
        c20197i4.f25427m = false;
        C20197i c20197i5 = this.f219051u0;
        if (c20197i5 == null) {
            c20197i5 = null;
        }
        c20197i5.getClass();
        t.a();
        int i12 = c20197i5.f25416b;
        if (1 != i12) {
            c20197i5.f25416b = 1;
            t.a();
            t.a();
            c20197i5.h(new androidx.camera.view.A(i12, 1, c20197i5));
        }
        final int i13 = 0;
        s5().f219058e.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.camera_mvi.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f219095c;

            {
                this.f219095c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f219095c.u5().accept(InterfaceC44600a.p.f419465a);
                        break;
                    case 1:
                        this.f219095c.u5().accept(InterfaceC44600a.k.f419459a);
                        break;
                    case 2:
                        this.f219095c.u5().accept(InterfaceC44600a.i.f419457a);
                        break;
                    case 3:
                        this.f219095c.u5().accept(InterfaceC44600a.d.f419452a);
                        break;
                    case 4:
                        this.f219095c.u5().accept(InterfaceC44600a.g.f419455a);
                        break;
                    case 5:
                        this.f219095c.u5().accept(InterfaceC44600a.o.f419464a);
                        break;
                    case 6:
                        this.f219095c.u5().accept(InterfaceC44600a.h.f419456a);
                        break;
                    default:
                        CameraFragment cameraFragment = this.f219095c;
                        cameraFragment.u5().accept(new InterfaceC44600a.l(cameraFragment.v5()));
                        break;
                }
            }
        });
        final int i14 = 1;
        s5().f219055b.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.camera_mvi.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f219095c;

            {
                this.f219095c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f219095c.u5().accept(InterfaceC44600a.p.f419465a);
                        break;
                    case 1:
                        this.f219095c.u5().accept(InterfaceC44600a.k.f419459a);
                        break;
                    case 2:
                        this.f219095c.u5().accept(InterfaceC44600a.i.f419457a);
                        break;
                    case 3:
                        this.f219095c.u5().accept(InterfaceC44600a.d.f419452a);
                        break;
                    case 4:
                        this.f219095c.u5().accept(InterfaceC44600a.g.f419455a);
                        break;
                    case 5:
                        this.f219095c.u5().accept(InterfaceC44600a.o.f419464a);
                        break;
                    case 6:
                        this.f219095c.u5().accept(InterfaceC44600a.h.f419456a);
                        break;
                    default:
                        CameraFragment cameraFragment = this.f219095c;
                        cameraFragment.u5().accept(new InterfaceC44600a.l(cameraFragment.v5()));
                        break;
                }
            }
        });
        final int i15 = 2;
        s5().f219056c.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.camera_mvi.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f219095c;

            {
                this.f219095c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        this.f219095c.u5().accept(InterfaceC44600a.p.f419465a);
                        break;
                    case 1:
                        this.f219095c.u5().accept(InterfaceC44600a.k.f419459a);
                        break;
                    case 2:
                        this.f219095c.u5().accept(InterfaceC44600a.i.f419457a);
                        break;
                    case 3:
                        this.f219095c.u5().accept(InterfaceC44600a.d.f419452a);
                        break;
                    case 4:
                        this.f219095c.u5().accept(InterfaceC44600a.g.f419455a);
                        break;
                    case 5:
                        this.f219095c.u5().accept(InterfaceC44600a.o.f419464a);
                        break;
                    case 6:
                        this.f219095c.u5().accept(InterfaceC44600a.h.f419456a);
                        break;
                    default:
                        CameraFragment cameraFragment = this.f219095c;
                        cameraFragment.u5().accept(new InterfaceC44600a.l(cameraFragment.v5()));
                        break;
                }
            }
        });
        final int i16 = 3;
        s5().f219057d.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.camera_mvi.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f219095c;

            {
                this.f219095c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        this.f219095c.u5().accept(InterfaceC44600a.p.f419465a);
                        break;
                    case 1:
                        this.f219095c.u5().accept(InterfaceC44600a.k.f419459a);
                        break;
                    case 2:
                        this.f219095c.u5().accept(InterfaceC44600a.i.f419457a);
                        break;
                    case 3:
                        this.f219095c.u5().accept(InterfaceC44600a.d.f419452a);
                        break;
                    case 4:
                        this.f219095c.u5().accept(InterfaceC44600a.g.f419455a);
                        break;
                    case 5:
                        this.f219095c.u5().accept(InterfaceC44600a.o.f419464a);
                        break;
                    case 6:
                        this.f219095c.u5().accept(InterfaceC44600a.h.f419456a);
                        break;
                    default:
                        CameraFragment cameraFragment = this.f219095c;
                        cameraFragment.u5().accept(new InterfaceC44600a.l(cameraFragment.v5()));
                        break;
                }
            }
        });
        final int i17 = 4;
        s5().f219054a.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.camera_mvi.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f219095c;

            {
                this.f219095c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        this.f219095c.u5().accept(InterfaceC44600a.p.f419465a);
                        break;
                    case 1:
                        this.f219095c.u5().accept(InterfaceC44600a.k.f419459a);
                        break;
                    case 2:
                        this.f219095c.u5().accept(InterfaceC44600a.i.f419457a);
                        break;
                    case 3:
                        this.f219095c.u5().accept(InterfaceC44600a.d.f419452a);
                        break;
                    case 4:
                        this.f219095c.u5().accept(InterfaceC44600a.g.f419455a);
                        break;
                    case 5:
                        this.f219095c.u5().accept(InterfaceC44600a.o.f419464a);
                        break;
                    case 6:
                        this.f219095c.u5().accept(InterfaceC44600a.h.f419456a);
                        break;
                    default:
                        CameraFragment cameraFragment = this.f219095c;
                        cameraFragment.u5().accept(new InterfaceC44600a.l(cameraFragment.v5()));
                        break;
                }
            }
        });
        final int i18 = 5;
        s5().f219065l.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.camera_mvi.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f219095c;

            {
                this.f219095c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        this.f219095c.u5().accept(InterfaceC44600a.p.f419465a);
                        break;
                    case 1:
                        this.f219095c.u5().accept(InterfaceC44600a.k.f419459a);
                        break;
                    case 2:
                        this.f219095c.u5().accept(InterfaceC44600a.i.f419457a);
                        break;
                    case 3:
                        this.f219095c.u5().accept(InterfaceC44600a.d.f419452a);
                        break;
                    case 4:
                        this.f219095c.u5().accept(InterfaceC44600a.g.f419455a);
                        break;
                    case 5:
                        this.f219095c.u5().accept(InterfaceC44600a.o.f419464a);
                        break;
                    case 6:
                        this.f219095c.u5().accept(InterfaceC44600a.h.f419456a);
                        break;
                    default:
                        CameraFragment cameraFragment = this.f219095c;
                        cameraFragment.u5().accept(new InterfaceC44600a.l(cameraFragment.v5()));
                        break;
                }
            }
        });
        final int i19 = 6;
        s5().f219064k.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.camera_mvi.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f219095c;

            {
                this.f219095c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i19) {
                    case 0:
                        this.f219095c.u5().accept(InterfaceC44600a.p.f419465a);
                        break;
                    case 1:
                        this.f219095c.u5().accept(InterfaceC44600a.k.f419459a);
                        break;
                    case 2:
                        this.f219095c.u5().accept(InterfaceC44600a.i.f419457a);
                        break;
                    case 3:
                        this.f219095c.u5().accept(InterfaceC44600a.d.f419452a);
                        break;
                    case 4:
                        this.f219095c.u5().accept(InterfaceC44600a.g.f419455a);
                        break;
                    case 5:
                        this.f219095c.u5().accept(InterfaceC44600a.o.f419464a);
                        break;
                    case 6:
                        this.f219095c.u5().accept(InterfaceC44600a.h.f419456a);
                        break;
                    default:
                        CameraFragment cameraFragment = this.f219095c;
                        cameraFragment.u5().accept(new InterfaceC44600a.l(cameraFragment.v5()));
                        break;
                }
            }
        });
        final int i22 = 7;
        s5().f219063j.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.camera_mvi.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f219095c;

            {
                this.f219095c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i22) {
                    case 0:
                        this.f219095c.u5().accept(InterfaceC44600a.p.f419465a);
                        break;
                    case 1:
                        this.f219095c.u5().accept(InterfaceC44600a.k.f419459a);
                        break;
                    case 2:
                        this.f219095c.u5().accept(InterfaceC44600a.i.f419457a);
                        break;
                    case 3:
                        this.f219095c.u5().accept(InterfaceC44600a.d.f419452a);
                        break;
                    case 4:
                        this.f219095c.u5().accept(InterfaceC44600a.g.f419455a);
                        break;
                    case 5:
                        this.f219095c.u5().accept(InterfaceC44600a.o.f419464a);
                        break;
                    case 6:
                        this.f219095c.u5().accept(InterfaceC44600a.h.f419456a);
                        break;
                    default:
                        CameraFragment cameraFragment = this.f219095c;
                        cameraFragment.u5().accept(new InterfaceC44600a.l(cameraFragment.v5()));
                        break;
                }
            }
        });
        TextView textView = s5().f219060g;
        textView.post(new com.avito.android.inline_filters.dialog.group.item.double_input.e(textView, 17));
        com.avito.android.arch.mvi.android.f.a(u5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new e(1, this, CameraFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraOneTimeEvent;)V", 0), new f(1, this, CameraFragment.class, "render", "render(Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState;)V", 0));
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new g(null), 3);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.photo_picker.camera_mvi.di.d.a().a((com.avito.android.photo_picker.camera_mvi.di.b) C29972i.a(C29972i.b(this), com.avito.android.photo_picker.camera_mvi.di.b.class), this, requireArguments().getInt("arg_key_max_count")).a(this);
    }

    public final void r5() {
        a aVarS5 = s5();
        C20197i c20197i = this.f219051u0;
        if (c20197i == null) {
            c20197i = null;
        }
        CameraState.Ratio ratio = u5().getState().getValue().f219147c;
        c cVar = new c();
        CameraView cameraView = aVarS5.f219061h;
        cameraView.f219254c.setController(c20197i);
        cameraView.f219260i = cVar;
        Size sizeA = cameraView.a(ratio);
        cameraView.b((cameraView.f219253b.getHeight() - sizeA.getHeight()) * 0.2f, sizeA.getWidth(), sizeA.getHeight(), true);
    }

    public final a s5() {
        a aVar = this.f219050t0;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final PhotoPickerViewModel t5() {
        return (PhotoPickerViewModel) this.f219049s0.getValue();
    }

    public final com.avito.android.photo_picker.camera_mvi.g u5() {
        return (com.avito.android.photo_picker.camera_mvi.g) this.f219045o0.getValue();
    }

    public final boolean v5() {
        x xVar = this.f219048r0;
        if (xVar == null) {
            xVar = null;
        }
        PhotoPermission.Camera.f218689b.getClass();
        return xVar.a(PhotoPermission.Camera.f218690c);
    }
}

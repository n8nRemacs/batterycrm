package com.avito.android.photo_picker.camera;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC23040h0;
import androidx.view.P0;
import androidx.view.R0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.permissions.G;
import com.avito.android.photo_picker.CameraType;
import com.avito.android.photo_picker.FlashMode;
import com.avito.android.photo_picker.FocusMode;
import com.avito.android.photo_picker.InterfaceC33224a;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_picker.camera.di.a;
import com.avito.android.photo_picker.camera.i;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import i.b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CameraFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/photo_picker/camera/CameraFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CameraFragment extends Fragment implements InterfaceC28477j.b {

    /* renamed from: f0, reason: collision with root package name */
    @Inject
    public q f218921f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f218922g0 = C42727D.c(new b());

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f218923h0 = registerForActivityResult(new b.l(), new c());

    /* renamed from: i0, reason: collision with root package name */
    public SimpleDraweeView f218924i0;

    /* renamed from: j0, reason: collision with root package name */
    public ImageButton f218925j0;

    /* renamed from: k0, reason: collision with root package name */
    public ImageView f218926k0;

    /* renamed from: l0, reason: collision with root package name */
    public View f218927l0;

    /* renamed from: m0, reason: collision with root package name */
    public View f218928m0;

    /* renamed from: n0, reason: collision with root package name */
    public ImageButton f218929n0;

    /* renamed from: o0, reason: collision with root package name */
    public TextView f218930o0;

    /* renamed from: p0, reason: collision with root package name */
    public TextView f218931p0;

    /* renamed from: q0, reason: collision with root package name */
    public v f218932q0;

    /* renamed from: r0, reason: collision with root package name */
    public i f218933r0;

    /* renamed from: s0, reason: collision with root package name */
    public View f218934s0;

    /* renamed from: t0, reason: collision with root package name */
    public View f218935t0;

    /* renamed from: u0, reason: collision with root package name */
    public View f218936u0;

    /* renamed from: v0, reason: collision with root package name */
    public PhotoPickerIntentFactory.PhotoPickerMode f218937v0;

    /* renamed from: w0, reason: collision with root package name */
    public AspectRatio f218938w0;

    /* compiled from: CameraFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PhotoPickerIntentFactory.CropType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PhotoPickerIntentFactory.CropType cropType = PhotoPickerIntentFactory.CropType.f218802b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(CameraFragment.this.requireArguments().getBoolean("is_redesign"));
        }
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c implements androidx.view.result.a, D {
        public c() {
        }

        @Override // androidx.view.result.a
        public final void a(Object obj) {
            ((Boolean) obj).getClass();
            CameraFragment cameraFragment = CameraFragment.this;
            i iVar = cameraFragment.f218933r0;
            if (iVar == null) {
                iVar = null;
            }
            iVar.me();
            cameraFragment.c5();
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

    public final boolean b5() {
        return ((Boolean) this.f218922g0.getValue()).booleanValue();
    }

    public final void c5() {
        v vVar = this.f218932q0;
        if (vVar == null) {
            vVar = null;
        }
        if (!vVar.f219038c.isAvailable()) {
            v vVar2 = this.f218932q0;
            if (vVar2 == null) {
                vVar2 = null;
            }
            i iVar = this.f218933r0;
            vVar2.f219038c.setSurfaceTextureListener((iVar != null ? iVar : null).f218991e0);
            return;
        }
        v vVar3 = this.f218932q0;
        if (vVar3 == null) {
            vVar3 = null;
        }
        TextureView textureView = vVar3.f219038c;
        int width = textureView.getWidth();
        int height = textureView.getHeight();
        i iVar2 = this.f218933r0;
        if (iVar2 == null) {
            iVar2 = null;
        }
        v vVar4 = this.f218932q0;
        iVar2.pe((vVar4 != null ? vVar4 : null).f219038c.getSurfaceTexture(), width, height);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(@Y61.l Bundle bundle) {
        super.onActivityCreated(bundle);
        i iVar = this.f218933r0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.f218989c0 = (PhotoPickerViewModel) new P0(requireActivity()).a(PhotoPickerViewModel.class);
        iVar.ne();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        boolean z12;
        super.onCreate(bundle);
        Point point = new Point();
        requireActivity().getWindowManager().getDefaultDisplay().getSize(point);
        Bundle arguments = getArguments();
        PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode = arguments != null ? (PhotoPickerIntentFactory.PhotoPickerMode) arguments.getParcelable("mode") : null;
        if (photoPickerMode == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f218937v0 = photoPickerMode;
        if (photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd) {
            z12 = ((PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd) photoPickerMode).f218806b instanceof PhotoPickerIntentFactory.AddType.GigDocuments;
        } else {
            if (!(photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar) && !(photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit) && !(photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeView) && !(photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeCrop)) {
                throw new NoWhenBranchMatchedException();
            }
            z12 = false;
        }
        this.f218938w0 = z12 ? AspectRatio.f218902e : AspectRatio.f218901d;
        a.InterfaceC6574a interfaceC6574aA = com.avito.android.photo_picker.camera.di.e.a();
        interfaceC6574aA.h((com.avito.android.photo_picker.camera.di.b) C29972i.a(C29972i.b(this), Object.class));
        interfaceC6574aA.g(requireActivity().getContentResolver());
        interfaceC6574aA.b(point);
        interfaceC6574aA.c(requireActivity().getWindowManager().getDefaultDisplay());
        interfaceC6574aA.d(requireActivity());
        PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode2 = this.f218937v0;
        if (photoPickerMode2 == null) {
            photoPickerMode2 = null;
        }
        interfaceC6574aA.f(photoPickerMode2 instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar ? CameraType.FrontCamera.f218741c : CameraType.BackCamera.f218740c);
        AspectRatio aspectRatio = this.f218938w0;
        if (aspectRatio == null) {
            aspectRatio = null;
        }
        interfaceC6574aA.e(aspectRatio);
        interfaceC6574aA.a(b5());
        interfaceC6574aA.build().a(this);
        q qVar = this.f218921f0;
        this.f218933r0 = (i) R0.a(this, qVar != null ? qVar : null).a(i.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(b5() ? R.layout.fragment_camera_re23 : R.layout.fragment_camera, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        i iVar = this.f218933r0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.f218988b0.removeObservers(getViewLifecycleOwner());
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        i iVar = this.f218933r0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.me();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        c5();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        final int i12 = 4;
        final int i13 = 3;
        final int i14 = 2;
        final int i15 = 1;
        final int i16 = 0;
        super.onViewCreated(view, bundle);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.take_shot_button);
        this.f218929n0 = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.camera.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f218942c;

            {
                this.f218942c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        i iVar = this.f218942c.f218933r0;
                        if (iVar == null) {
                            iVar = null;
                        }
                        InterfaceC33224a interfaceC33224a = iVar.f218979S;
                        if (interfaceC33224a != null) {
                            iVar.f218988b0.setValue(i.a.g.f218998a);
                            FocusMode focusMode = iVar.f218990d0;
                            boolean z12 = focusMode == FocusMode.f218751b;
                            boolean z13 = focusMode == FocusMode.f218752c;
                            io.reactivex.rxjava3.internal.observers.y yVar = iVar.f218981U;
                            if (yVar != null) {
                                DisposableHelper.a(yVar);
                            }
                            io.reactivex.rxjava3.core.z<R> zVarU = interfaceC33224a.i(z12).u(new k(iVar, interfaceC33224a));
                            l lVar = new l(iVar, z13);
                            l41.g<? super Throwable> mVar = new m<>(iVar);
                            zVarU.getClass();
                            iVar.f218981U = (io.reactivex.rxjava3.internal.observers.y) zVarU.v0(lVar, mVar, io.reactivex.rxjava3.internal.functions.a.f401993c);
                            break;
                        }
                        break;
                    case 1:
                        i iVar2 = this.f218942c.f218933r0;
                        if (iVar2 == null) {
                            iVar2 = null;
                        }
                        List<? extends FlashMode> list = iVar2.f218987a0;
                        PhotoPickerViewModel photoPickerViewModel = iVar2.f218989c0;
                        FlashMode flashMode = (FlashMode) C35755b0.e(list, (photoPickerViewModel != null ? photoPickerViewModel : null).f218830Z, true);
                        if (flashMode == null) {
                            flashMode = FlashMode.Off.f218749c;
                        }
                        InterfaceC33224a interfaceC33224a2 = iVar2.f218979S;
                        if (interfaceC33224a2 != null) {
                            iVar2.f218980T.b(interfaceC33224a2.j(flashMode).v0(new n(iVar2, flashMode), o.f219019b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                            break;
                        }
                        break;
                    case 2:
                        i iVar3 = this.f218942c.f218933r0;
                        if (iVar3 == null) {
                            iVar3 = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel2 = iVar3.f218989c0;
                        if (photoPickerViewModel2 == null) {
                            photoPickerViewModel2 = null;
                        }
                        photoPickerViewModel2.Ce();
                        PhotoPickerViewModel photoPickerViewModel3 = iVar3.f218989c0;
                        (photoPickerViewModel3 != null ? photoPickerViewModel3 : null).ve();
                        break;
                    case 3:
                        i iVar4 = this.f218942c.f218933r0;
                        if (iVar4 == null) {
                            iVar4 = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel4 = iVar4.f218989c0;
                        (photoPickerViewModel4 != null ? photoPickerViewModel4 : null).ve();
                        break;
                    case 4:
                        i iVar5 = this.f218942c.f218933r0;
                        if (iVar5 == null) {
                            iVar5 = null;
                        }
                        iVar5.f218985Y = (CameraType) C35755b0.e(iVar5.f218986Z, iVar5.f218985Y, true);
                        iVar5.me();
                        io.reactivex.rxjava3.internal.observers.m mVar2 = iVar5.f218982V;
                        if (mVar2 != null) {
                            DisposableHelper.a(mVar2);
                        }
                        iVar5.f218982V = null;
                        iVar5.f218988b0.setValue(i.a.d.f218995a);
                        break;
                    default:
                        i iVar6 = this.f218942c.f218933r0;
                        if (iVar6 == null) {
                            iVar6 = null;
                        }
                        boolean z14 = iVar6.f218977Q;
                        com.avito.android.permissions.x xVar = iVar6.f218970J;
                        if (!z14) {
                            if (!xVar.a("android.permission.CAMERA")) {
                                PhotoPickerViewModel photoPickerViewModel5 = iVar6.f218989c0;
                                (photoPickerViewModel5 != null ? photoPickerViewModel5 : null).f218825U.setValue(PhotoPickerViewModel.a.h.f218851a);
                                break;
                            } else {
                                xVar.d(1001, "android.permission.CAMERA");
                                break;
                            }
                        } else {
                            G g12 = iVar6.f218978R;
                            boolean zA2 = g12.a();
                            boolean zA3 = xVar.a("android.permission.CAMERA");
                            if (zA2 && !zA3) {
                                PhotoPickerViewModel photoPickerViewModel6 = iVar6.f218989c0;
                                (photoPickerViewModel6 != null ? photoPickerViewModel6 : null).f218825U.setValue(PhotoPickerViewModel.a.h.f218851a);
                                break;
                            } else {
                                g12.n();
                                iVar6.f218988b0.setValue(i.a.C6576i.f219000a);
                                break;
                            }
                        }
                }
            }
        });
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.gallery_button);
        this.f218924i0 = simpleDraweeView;
        simpleDraweeView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.camera.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f218942c;

            {
                this.f218942c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        i iVar = this.f218942c.f218933r0;
                        if (iVar == null) {
                            iVar = null;
                        }
                        InterfaceC33224a interfaceC33224a = iVar.f218979S;
                        if (interfaceC33224a != null) {
                            iVar.f218988b0.setValue(i.a.g.f218998a);
                            FocusMode focusMode = iVar.f218990d0;
                            boolean z12 = focusMode == FocusMode.f218751b;
                            boolean z13 = focusMode == FocusMode.f218752c;
                            io.reactivex.rxjava3.internal.observers.y yVar = iVar.f218981U;
                            if (yVar != null) {
                                DisposableHelper.a(yVar);
                            }
                            io.reactivex.rxjava3.core.z<R> zVarU = interfaceC33224a.i(z12).u(new k(iVar, interfaceC33224a));
                            l lVar = new l(iVar, z13);
                            l41.g<? super Throwable> mVar = new m<>(iVar);
                            zVarU.getClass();
                            iVar.f218981U = (io.reactivex.rxjava3.internal.observers.y) zVarU.v0(lVar, mVar, io.reactivex.rxjava3.internal.functions.a.f401993c);
                            break;
                        }
                        break;
                    case 1:
                        i iVar2 = this.f218942c.f218933r0;
                        if (iVar2 == null) {
                            iVar2 = null;
                        }
                        List<? extends FlashMode> list = iVar2.f218987a0;
                        PhotoPickerViewModel photoPickerViewModel = iVar2.f218989c0;
                        FlashMode flashMode = (FlashMode) C35755b0.e(list, (photoPickerViewModel != null ? photoPickerViewModel : null).f218830Z, true);
                        if (flashMode == null) {
                            flashMode = FlashMode.Off.f218749c;
                        }
                        InterfaceC33224a interfaceC33224a2 = iVar2.f218979S;
                        if (interfaceC33224a2 != null) {
                            iVar2.f218980T.b(interfaceC33224a2.j(flashMode).v0(new n(iVar2, flashMode), o.f219019b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                            break;
                        }
                        break;
                    case 2:
                        i iVar3 = this.f218942c.f218933r0;
                        if (iVar3 == null) {
                            iVar3 = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel2 = iVar3.f218989c0;
                        if (photoPickerViewModel2 == null) {
                            photoPickerViewModel2 = null;
                        }
                        photoPickerViewModel2.Ce();
                        PhotoPickerViewModel photoPickerViewModel3 = iVar3.f218989c0;
                        (photoPickerViewModel3 != null ? photoPickerViewModel3 : null).ve();
                        break;
                    case 3:
                        i iVar4 = this.f218942c.f218933r0;
                        if (iVar4 == null) {
                            iVar4 = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel4 = iVar4.f218989c0;
                        (photoPickerViewModel4 != null ? photoPickerViewModel4 : null).ve();
                        break;
                    case 4:
                        i iVar5 = this.f218942c.f218933r0;
                        if (iVar5 == null) {
                            iVar5 = null;
                        }
                        iVar5.f218985Y = (CameraType) C35755b0.e(iVar5.f218986Z, iVar5.f218985Y, true);
                        iVar5.me();
                        io.reactivex.rxjava3.internal.observers.m mVar2 = iVar5.f218982V;
                        if (mVar2 != null) {
                            DisposableHelper.a(mVar2);
                        }
                        iVar5.f218982V = null;
                        iVar5.f218988b0.setValue(i.a.d.f218995a);
                        break;
                    default:
                        i iVar6 = this.f218942c.f218933r0;
                        if (iVar6 == null) {
                            iVar6 = null;
                        }
                        boolean z14 = iVar6.f218977Q;
                        com.avito.android.permissions.x xVar = iVar6.f218970J;
                        if (!z14) {
                            if (!xVar.a("android.permission.CAMERA")) {
                                PhotoPickerViewModel photoPickerViewModel5 = iVar6.f218989c0;
                                (photoPickerViewModel5 != null ? photoPickerViewModel5 : null).f218825U.setValue(PhotoPickerViewModel.a.h.f218851a);
                                break;
                            } else {
                                xVar.d(1001, "android.permission.CAMERA");
                                break;
                            }
                        } else {
                            G g12 = iVar6.f218978R;
                            boolean zA2 = g12.a();
                            boolean zA3 = xVar.a("android.permission.CAMERA");
                            if (zA2 && !zA3) {
                                PhotoPickerViewModel photoPickerViewModel6 = iVar6.f218989c0;
                                (photoPickerViewModel6 != null ? photoPickerViewModel6 : null).f218825U.setValue(PhotoPickerViewModel.a.h.f218851a);
                                break;
                            } else {
                                g12.n();
                                iVar6.f218988b0.setValue(i.a.C6576i.f219000a);
                                break;
                            }
                        }
                }
            }
        });
        ((ImageButton) view.findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.camera.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f218942c;

            {
                this.f218942c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        i iVar = this.f218942c.f218933r0;
                        if (iVar == null) {
                            iVar = null;
                        }
                        InterfaceC33224a interfaceC33224a = iVar.f218979S;
                        if (interfaceC33224a != null) {
                            iVar.f218988b0.setValue(i.a.g.f218998a);
                            FocusMode focusMode = iVar.f218990d0;
                            boolean z12 = focusMode == FocusMode.f218751b;
                            boolean z13 = focusMode == FocusMode.f218752c;
                            io.reactivex.rxjava3.internal.observers.y yVar = iVar.f218981U;
                            if (yVar != null) {
                                DisposableHelper.a(yVar);
                            }
                            io.reactivex.rxjava3.core.z<R> zVarU = interfaceC33224a.i(z12).u(new k(iVar, interfaceC33224a));
                            l lVar = new l(iVar, z13);
                            l41.g<? super Throwable> mVar = new m<>(iVar);
                            zVarU.getClass();
                            iVar.f218981U = (io.reactivex.rxjava3.internal.observers.y) zVarU.v0(lVar, mVar, io.reactivex.rxjava3.internal.functions.a.f401993c);
                            break;
                        }
                        break;
                    case 1:
                        i iVar2 = this.f218942c.f218933r0;
                        if (iVar2 == null) {
                            iVar2 = null;
                        }
                        List<? extends FlashMode> list = iVar2.f218987a0;
                        PhotoPickerViewModel photoPickerViewModel = iVar2.f218989c0;
                        FlashMode flashMode = (FlashMode) C35755b0.e(list, (photoPickerViewModel != null ? photoPickerViewModel : null).f218830Z, true);
                        if (flashMode == null) {
                            flashMode = FlashMode.Off.f218749c;
                        }
                        InterfaceC33224a interfaceC33224a2 = iVar2.f218979S;
                        if (interfaceC33224a2 != null) {
                            iVar2.f218980T.b(interfaceC33224a2.j(flashMode).v0(new n(iVar2, flashMode), o.f219019b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                            break;
                        }
                        break;
                    case 2:
                        i iVar3 = this.f218942c.f218933r0;
                        if (iVar3 == null) {
                            iVar3 = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel2 = iVar3.f218989c0;
                        if (photoPickerViewModel2 == null) {
                            photoPickerViewModel2 = null;
                        }
                        photoPickerViewModel2.Ce();
                        PhotoPickerViewModel photoPickerViewModel3 = iVar3.f218989c0;
                        (photoPickerViewModel3 != null ? photoPickerViewModel3 : null).ve();
                        break;
                    case 3:
                        i iVar4 = this.f218942c.f218933r0;
                        if (iVar4 == null) {
                            iVar4 = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel4 = iVar4.f218989c0;
                        (photoPickerViewModel4 != null ? photoPickerViewModel4 : null).ve();
                        break;
                    case 4:
                        i iVar5 = this.f218942c.f218933r0;
                        if (iVar5 == null) {
                            iVar5 = null;
                        }
                        iVar5.f218985Y = (CameraType) C35755b0.e(iVar5.f218986Z, iVar5.f218985Y, true);
                        iVar5.me();
                        io.reactivex.rxjava3.internal.observers.m mVar2 = iVar5.f218982V;
                        if (mVar2 != null) {
                            DisposableHelper.a(mVar2);
                        }
                        iVar5.f218982V = null;
                        iVar5.f218988b0.setValue(i.a.d.f218995a);
                        break;
                    default:
                        i iVar6 = this.f218942c.f218933r0;
                        if (iVar6 == null) {
                            iVar6 = null;
                        }
                        boolean z14 = iVar6.f218977Q;
                        com.avito.android.permissions.x xVar = iVar6.f218970J;
                        if (!z14) {
                            if (!xVar.a("android.permission.CAMERA")) {
                                PhotoPickerViewModel photoPickerViewModel5 = iVar6.f218989c0;
                                (photoPickerViewModel5 != null ? photoPickerViewModel5 : null).f218825U.setValue(PhotoPickerViewModel.a.h.f218851a);
                                break;
                            } else {
                                xVar.d(1001, "android.permission.CAMERA");
                                break;
                            }
                        } else {
                            G g12 = iVar6.f218978R;
                            boolean zA2 = g12.a();
                            boolean zA3 = xVar.a("android.permission.CAMERA");
                            if (zA2 && !zA3) {
                                PhotoPickerViewModel photoPickerViewModel6 = iVar6.f218989c0;
                                (photoPickerViewModel6 != null ? photoPickerViewModel6 : null).f218825U.setValue(PhotoPickerViewModel.a.h.f218851a);
                                break;
                            } else {
                                g12.n();
                                iVar6.f218988b0.setValue(i.a.C6576i.f219000a);
                                break;
                            }
                        }
                }
            }
        });
        ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.camera_toggle);
        this.f218925j0 = imageButton2;
        imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.camera.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f218942c;

            {
                this.f218942c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        i iVar = this.f218942c.f218933r0;
                        if (iVar == null) {
                            iVar = null;
                        }
                        InterfaceC33224a interfaceC33224a = iVar.f218979S;
                        if (interfaceC33224a != null) {
                            iVar.f218988b0.setValue(i.a.g.f218998a);
                            FocusMode focusMode = iVar.f218990d0;
                            boolean z12 = focusMode == FocusMode.f218751b;
                            boolean z13 = focusMode == FocusMode.f218752c;
                            io.reactivex.rxjava3.internal.observers.y yVar = iVar.f218981U;
                            if (yVar != null) {
                                DisposableHelper.a(yVar);
                            }
                            io.reactivex.rxjava3.core.z<R> zVarU = interfaceC33224a.i(z12).u(new k(iVar, interfaceC33224a));
                            l lVar = new l(iVar, z13);
                            l41.g<? super Throwable> mVar = new m<>(iVar);
                            zVarU.getClass();
                            iVar.f218981U = (io.reactivex.rxjava3.internal.observers.y) zVarU.v0(lVar, mVar, io.reactivex.rxjava3.internal.functions.a.f401993c);
                            break;
                        }
                        break;
                    case 1:
                        i iVar2 = this.f218942c.f218933r0;
                        if (iVar2 == null) {
                            iVar2 = null;
                        }
                        List<? extends FlashMode> list = iVar2.f218987a0;
                        PhotoPickerViewModel photoPickerViewModel = iVar2.f218989c0;
                        FlashMode flashMode = (FlashMode) C35755b0.e(list, (photoPickerViewModel != null ? photoPickerViewModel : null).f218830Z, true);
                        if (flashMode == null) {
                            flashMode = FlashMode.Off.f218749c;
                        }
                        InterfaceC33224a interfaceC33224a2 = iVar2.f218979S;
                        if (interfaceC33224a2 != null) {
                            iVar2.f218980T.b(interfaceC33224a2.j(flashMode).v0(new n(iVar2, flashMode), o.f219019b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                            break;
                        }
                        break;
                    case 2:
                        i iVar3 = this.f218942c.f218933r0;
                        if (iVar3 == null) {
                            iVar3 = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel2 = iVar3.f218989c0;
                        if (photoPickerViewModel2 == null) {
                            photoPickerViewModel2 = null;
                        }
                        photoPickerViewModel2.Ce();
                        PhotoPickerViewModel photoPickerViewModel3 = iVar3.f218989c0;
                        (photoPickerViewModel3 != null ? photoPickerViewModel3 : null).ve();
                        break;
                    case 3:
                        i iVar4 = this.f218942c.f218933r0;
                        if (iVar4 == null) {
                            iVar4 = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel4 = iVar4.f218989c0;
                        (photoPickerViewModel4 != null ? photoPickerViewModel4 : null).ve();
                        break;
                    case 4:
                        i iVar5 = this.f218942c.f218933r0;
                        if (iVar5 == null) {
                            iVar5 = null;
                        }
                        iVar5.f218985Y = (CameraType) C35755b0.e(iVar5.f218986Z, iVar5.f218985Y, true);
                        iVar5.me();
                        io.reactivex.rxjava3.internal.observers.m mVar2 = iVar5.f218982V;
                        if (mVar2 != null) {
                            DisposableHelper.a(mVar2);
                        }
                        iVar5.f218982V = null;
                        iVar5.f218988b0.setValue(i.a.d.f218995a);
                        break;
                    default:
                        i iVar6 = this.f218942c.f218933r0;
                        if (iVar6 == null) {
                            iVar6 = null;
                        }
                        boolean z14 = iVar6.f218977Q;
                        com.avito.android.permissions.x xVar = iVar6.f218970J;
                        if (!z14) {
                            if (!xVar.a("android.permission.CAMERA")) {
                                PhotoPickerViewModel photoPickerViewModel5 = iVar6.f218989c0;
                                (photoPickerViewModel5 != null ? photoPickerViewModel5 : null).f218825U.setValue(PhotoPickerViewModel.a.h.f218851a);
                                break;
                            } else {
                                xVar.d(1001, "android.permission.CAMERA");
                                break;
                            }
                        } else {
                            G g12 = iVar6.f218978R;
                            boolean zA2 = g12.a();
                            boolean zA3 = xVar.a("android.permission.CAMERA");
                            if (zA2 && !zA3) {
                                PhotoPickerViewModel photoPickerViewModel6 = iVar6.f218989c0;
                                (photoPickerViewModel6 != null ? photoPickerViewModel6 : null).f218825U.setValue(PhotoPickerViewModel.a.h.f218851a);
                                break;
                            } else {
                                g12.n();
                                iVar6.f218988b0.setValue(i.a.C6576i.f219000a);
                                break;
                            }
                        }
                }
            }
        });
        ImageView imageView = (ImageView) view.findViewById(R.id.flash_toggle);
        this.f218926k0 = imageView;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.camera.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f218942c;

            {
                this.f218942c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        i iVar = this.f218942c.f218933r0;
                        if (iVar == null) {
                            iVar = null;
                        }
                        InterfaceC33224a interfaceC33224a = iVar.f218979S;
                        if (interfaceC33224a != null) {
                            iVar.f218988b0.setValue(i.a.g.f218998a);
                            FocusMode focusMode = iVar.f218990d0;
                            boolean z12 = focusMode == FocusMode.f218751b;
                            boolean z13 = focusMode == FocusMode.f218752c;
                            io.reactivex.rxjava3.internal.observers.y yVar = iVar.f218981U;
                            if (yVar != null) {
                                DisposableHelper.a(yVar);
                            }
                            io.reactivex.rxjava3.core.z<R> zVarU = interfaceC33224a.i(z12).u(new k(iVar, interfaceC33224a));
                            l lVar = new l(iVar, z13);
                            l41.g<? super Throwable> mVar = new m<>(iVar);
                            zVarU.getClass();
                            iVar.f218981U = (io.reactivex.rxjava3.internal.observers.y) zVarU.v0(lVar, mVar, io.reactivex.rxjava3.internal.functions.a.f401993c);
                            break;
                        }
                        break;
                    case 1:
                        i iVar2 = this.f218942c.f218933r0;
                        if (iVar2 == null) {
                            iVar2 = null;
                        }
                        List<? extends FlashMode> list = iVar2.f218987a0;
                        PhotoPickerViewModel photoPickerViewModel = iVar2.f218989c0;
                        FlashMode flashMode = (FlashMode) C35755b0.e(list, (photoPickerViewModel != null ? photoPickerViewModel : null).f218830Z, true);
                        if (flashMode == null) {
                            flashMode = FlashMode.Off.f218749c;
                        }
                        InterfaceC33224a interfaceC33224a2 = iVar2.f218979S;
                        if (interfaceC33224a2 != null) {
                            iVar2.f218980T.b(interfaceC33224a2.j(flashMode).v0(new n(iVar2, flashMode), o.f219019b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                            break;
                        }
                        break;
                    case 2:
                        i iVar3 = this.f218942c.f218933r0;
                        if (iVar3 == null) {
                            iVar3 = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel2 = iVar3.f218989c0;
                        if (photoPickerViewModel2 == null) {
                            photoPickerViewModel2 = null;
                        }
                        photoPickerViewModel2.Ce();
                        PhotoPickerViewModel photoPickerViewModel3 = iVar3.f218989c0;
                        (photoPickerViewModel3 != null ? photoPickerViewModel3 : null).ve();
                        break;
                    case 3:
                        i iVar4 = this.f218942c.f218933r0;
                        if (iVar4 == null) {
                            iVar4 = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel4 = iVar4.f218989c0;
                        (photoPickerViewModel4 != null ? photoPickerViewModel4 : null).ve();
                        break;
                    case 4:
                        i iVar5 = this.f218942c.f218933r0;
                        if (iVar5 == null) {
                            iVar5 = null;
                        }
                        iVar5.f218985Y = (CameraType) C35755b0.e(iVar5.f218986Z, iVar5.f218985Y, true);
                        iVar5.me();
                        io.reactivex.rxjava3.internal.observers.m mVar2 = iVar5.f218982V;
                        if (mVar2 != null) {
                            DisposableHelper.a(mVar2);
                        }
                        iVar5.f218982V = null;
                        iVar5.f218988b0.setValue(i.a.d.f218995a);
                        break;
                    default:
                        i iVar6 = this.f218942c.f218933r0;
                        if (iVar6 == null) {
                            iVar6 = null;
                        }
                        boolean z14 = iVar6.f218977Q;
                        com.avito.android.permissions.x xVar = iVar6.f218970J;
                        if (!z14) {
                            if (!xVar.a("android.permission.CAMERA")) {
                                PhotoPickerViewModel photoPickerViewModel5 = iVar6.f218989c0;
                                (photoPickerViewModel5 != null ? photoPickerViewModel5 : null).f218825U.setValue(PhotoPickerViewModel.a.h.f218851a);
                                break;
                            } else {
                                xVar.d(1001, "android.permission.CAMERA");
                                break;
                            }
                        } else {
                            G g12 = iVar6.f218978R;
                            boolean zA2 = g12.a();
                            boolean zA3 = xVar.a("android.permission.CAMERA");
                            if (zA2 && !zA3) {
                                PhotoPickerViewModel photoPickerViewModel6 = iVar6.f218989c0;
                                (photoPickerViewModel6 != null ? photoPickerViewModel6 : null).f218825U.setValue(PhotoPickerViewModel.a.h.f218851a);
                                break;
                            } else {
                                g12.n();
                                iVar6.f218988b0.setValue(i.a.C6576i.f219000a);
                                break;
                            }
                        }
                }
            }
        });
        View viewFindViewById = view.findViewById(R.id.allow_access_btn);
        this.f218927l0 = viewFindViewById;
        final int i17 = 5;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.camera.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f218942c;

            {
                this.f218942c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        i iVar = this.f218942c.f218933r0;
                        if (iVar == null) {
                            iVar = null;
                        }
                        InterfaceC33224a interfaceC33224a = iVar.f218979S;
                        if (interfaceC33224a != null) {
                            iVar.f218988b0.setValue(i.a.g.f218998a);
                            FocusMode focusMode = iVar.f218990d0;
                            boolean z12 = focusMode == FocusMode.f218751b;
                            boolean z13 = focusMode == FocusMode.f218752c;
                            io.reactivex.rxjava3.internal.observers.y yVar = iVar.f218981U;
                            if (yVar != null) {
                                DisposableHelper.a(yVar);
                            }
                            io.reactivex.rxjava3.core.z<R> zVarU = interfaceC33224a.i(z12).u(new k(iVar, interfaceC33224a));
                            l lVar = new l(iVar, z13);
                            l41.g<? super Throwable> mVar = new m<>(iVar);
                            zVarU.getClass();
                            iVar.f218981U = (io.reactivex.rxjava3.internal.observers.y) zVarU.v0(lVar, mVar, io.reactivex.rxjava3.internal.functions.a.f401993c);
                            break;
                        }
                        break;
                    case 1:
                        i iVar2 = this.f218942c.f218933r0;
                        if (iVar2 == null) {
                            iVar2 = null;
                        }
                        List<? extends FlashMode> list = iVar2.f218987a0;
                        PhotoPickerViewModel photoPickerViewModel = iVar2.f218989c0;
                        FlashMode flashMode = (FlashMode) C35755b0.e(list, (photoPickerViewModel != null ? photoPickerViewModel : null).f218830Z, true);
                        if (flashMode == null) {
                            flashMode = FlashMode.Off.f218749c;
                        }
                        InterfaceC33224a interfaceC33224a2 = iVar2.f218979S;
                        if (interfaceC33224a2 != null) {
                            iVar2.f218980T.b(interfaceC33224a2.j(flashMode).v0(new n(iVar2, flashMode), o.f219019b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                            break;
                        }
                        break;
                    case 2:
                        i iVar3 = this.f218942c.f218933r0;
                        if (iVar3 == null) {
                            iVar3 = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel2 = iVar3.f218989c0;
                        if (photoPickerViewModel2 == null) {
                            photoPickerViewModel2 = null;
                        }
                        photoPickerViewModel2.Ce();
                        PhotoPickerViewModel photoPickerViewModel3 = iVar3.f218989c0;
                        (photoPickerViewModel3 != null ? photoPickerViewModel3 : null).ve();
                        break;
                    case 3:
                        i iVar4 = this.f218942c.f218933r0;
                        if (iVar4 == null) {
                            iVar4 = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel4 = iVar4.f218989c0;
                        (photoPickerViewModel4 != null ? photoPickerViewModel4 : null).ve();
                        break;
                    case 4:
                        i iVar5 = this.f218942c.f218933r0;
                        if (iVar5 == null) {
                            iVar5 = null;
                        }
                        iVar5.f218985Y = (CameraType) C35755b0.e(iVar5.f218986Z, iVar5.f218985Y, true);
                        iVar5.me();
                        io.reactivex.rxjava3.internal.observers.m mVar2 = iVar5.f218982V;
                        if (mVar2 != null) {
                            DisposableHelper.a(mVar2);
                        }
                        iVar5.f218982V = null;
                        iVar5.f218988b0.setValue(i.a.d.f218995a);
                        break;
                    default:
                        i iVar6 = this.f218942c.f218933r0;
                        if (iVar6 == null) {
                            iVar6 = null;
                        }
                        boolean z14 = iVar6.f218977Q;
                        com.avito.android.permissions.x xVar = iVar6.f218970J;
                        if (!z14) {
                            if (!xVar.a("android.permission.CAMERA")) {
                                PhotoPickerViewModel photoPickerViewModel5 = iVar6.f218989c0;
                                (photoPickerViewModel5 != null ? photoPickerViewModel5 : null).f218825U.setValue(PhotoPickerViewModel.a.h.f218851a);
                                break;
                            } else {
                                xVar.d(1001, "android.permission.CAMERA");
                                break;
                            }
                        } else {
                            G g12 = iVar6.f218978R;
                            boolean zA2 = g12.a();
                            boolean zA3 = xVar.a("android.permission.CAMERA");
                            if (zA2 && !zA3) {
                                PhotoPickerViewModel photoPickerViewModel6 = iVar6.f218989c0;
                                (photoPickerViewModel6 != null ? photoPickerViewModel6 : null).f218825U.setValue(PhotoPickerViewModel.a.h.f218851a);
                                break;
                            } else {
                                g12.n();
                                iVar6.f218988b0.setValue(i.a.C6576i.f219000a);
                                break;
                            }
                        }
                }
            }
        });
        this.f218928m0 = view.findViewById(R.id.no_permission);
        v vVar = new v(view);
        this.f218932q0 = vVar;
        i iVar = this.f218933r0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.getClass();
        iVar.f218980T.b(vVar.f219040e.t0(new p(iVar)));
        this.f218930o0 = (TextView) view.findViewById(R.id.info_bottom);
        this.f218931p0 = (TextView) view.findViewById(R.id.info_top);
        this.f218934s0 = view.findViewById(R.id.photo_view);
        this.f218935t0 = view.findViewById(R.id.default_overlay);
        this.f218936u0 = view.findViewById(R.id.avatar_overlay);
        if (!b5()) {
            i iVar2 = this.f218933r0;
            if (iVar2 == null) {
                iVar2 = null;
            }
            com.avito.android.permissions.x xVar = iVar2.f218970J;
            if (!xVar.b("android.permission.CAMERA")) {
                xVar.d(1001, "android.permission.CAMERA");
            }
        }
        PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode = this.f218937v0;
        PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode2 = photoPickerMode == null ? null : photoPickerMode;
        if (photoPickerMode2 instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd) {
            View view2 = this.f218936u0;
            if (view2 == null) {
                view2 = null;
            }
            D6.w(view2);
            PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode3 = this.f218937v0;
            if (photoPickerMode3 == null) {
                photoPickerMode3 = null;
            }
            PhotoPickerIntentFactory.AddType addType = ((PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd) photoPickerMode3).f218806b;
            if (addType instanceof PhotoPickerIntentFactory.AddType.Default) {
                AspectRatio aspectRatio = AspectRatio.f218901d;
                View view3 = this.f218934s0;
                if (view3 == null) {
                    view3 = null;
                }
                D6.E(view3, 4, 3);
                View view4 = this.f218935t0;
                if (view4 == null) {
                    view4 = null;
                }
                D6.H(view4);
                View view5 = this.f218935t0;
                if (view5 == null) {
                    view5 = null;
                }
                view5.setBackgroundResource(R.drawable.photo_frame);
                TextView textView = this.f218930o0;
                if (textView == null) {
                    textView = null;
                }
                I5.a(textView, requireContext().getString(R.string.camera_screen_hint_default), false);
            } else if (addType instanceof PhotoPickerIntentFactory.AddType.GigDocuments) {
                TextView textView2 = this.f218930o0;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setVisibility(4);
                AspectRatio aspectRatio2 = AspectRatio.f218901d;
                View view6 = this.f218934s0;
                if (view6 == null) {
                    view6 = null;
                }
                D6.E(view6, 8, 10);
                View view7 = this.f218935t0;
                if (view7 == null) {
                    view7 = null;
                }
                D6.H(view7);
                View view8 = this.f218935t0;
                if (view8 == null) {
                    view8 = null;
                }
                view8.setBackgroundResource(R.drawable.gig_documents_mask);
                int iB2 = y6.b(22);
                View view9 = this.f218935t0;
                if (view9 == null) {
                    view9 = null;
                }
                D6.b(view9, Integer.valueOf(iB2), Integer.valueOf(iB2), Integer.valueOf(iB2), Integer.valueOf(iB2));
                TextView textView3 = this.f218931p0;
                if (textView3 == null) {
                    textView3 = null;
                }
                I5.a(textView3, ((PhotoPickerIntentFactory.AddType.GigDocuments) addType).f218798b, false);
            }
        } else {
            if (!(photoPickerMode2 instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar)) {
                throw new IllegalStateException();
            }
            if (photoPickerMode == null) {
                photoPickerMode = null;
            }
            int iOrdinal = ((PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar) photoPickerMode).f218807b.ordinal();
            if (iOrdinal == 0) {
                View view10 = this.f218934s0;
                if (view10 == null) {
                    view10 = null;
                }
                D6.E(view10, 1, 1);
                View view11 = this.f218936u0;
                if (view11 == null) {
                    view11 = null;
                }
                D6.H(view11);
                View view12 = this.f218935t0;
                if (view12 == null) {
                    view12 = null;
                }
                D6.w(view12);
                TextView textView4 = this.f218930o0;
                if (textView4 == null) {
                    textView4 = null;
                }
                I5.a(textView4, requireContext().getString(R.string.camera_screen_hint_avatar), false);
            } else if (iOrdinal == 1) {
                View view13 = this.f218934s0;
                if (view13 == null) {
                    view13 = null;
                }
                D6.E(view13, 3, 2);
                View view14 = this.f218935t0;
                if (view14 == null) {
                    view14 = null;
                }
                D6.H(view14);
                View view15 = this.f218936u0;
                if (view15 == null) {
                    view15 = null;
                }
                D6.w(view15);
            }
        }
        i iVar3 = this.f218933r0;
        (iVar3 != null ? iVar3 : null).f218988b0.observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.photo_picker.camera.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f218944c;

            {
                this.f218944c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                switch (i16) {
                    case 0:
                        i.a aVar = (i.a) obj;
                        boolean z12 = aVar instanceof i.a.e;
                        CameraFragment cameraFragment = this.f218944c;
                        if (!z12) {
                            if (!(aVar instanceof i.a.b)) {
                                if (!(aVar instanceof i.a.d)) {
                                    if (!(aVar instanceof i.a.l)) {
                                        if (!(aVar instanceof i.a.c)) {
                                            if (!(aVar instanceof i.a.j)) {
                                                if (!(aVar instanceof i.a.C6575a)) {
                                                    if (!(aVar instanceof i.a.k)) {
                                                        if (!(aVar instanceof i.a.g)) {
                                                            if (!(aVar instanceof i.a.h)) {
                                                                if (!(aVar instanceof i.a.f)) {
                                                                    if (aVar instanceof i.a.C6576i) {
                                                                        cameraFragment.f218923h0.b("android.permission.CAMERA");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    ImageButton imageButton3 = cameraFragment.f218929n0;
                                                                    if (imageButton3 == null) {
                                                                        imageButton3 = null;
                                                                    }
                                                                    D6.k(imageButton3);
                                                                    ImageButton imageButton4 = cameraFragment.f218925j0;
                                                                    if (imageButton4 == null) {
                                                                        imageButton4 = null;
                                                                    }
                                                                    D6.k(imageButton4);
                                                                    ImageView imageView2 = cameraFragment.f218926k0;
                                                                    D6.k(imageView2 != null ? imageView2 : null);
                                                                    break;
                                                                }
                                                            } else {
                                                                boolean z13 = ((i.a.h) aVar).f218999a;
                                                                v vVar2 = cameraFragment.f218932q0;
                                                                if (vVar2 == null) {
                                                                    vVar2 = null;
                                                                }
                                                                CameraAnimationCanvas cameraAnimationCanvas = vVar2.f219037b;
                                                                cameraAnimationCanvas.startAnimation(cameraAnimationCanvas.f218918f);
                                                                ImageButton imageButton5 = cameraFragment.f218929n0;
                                                                if (imageButton5 == null) {
                                                                    imageButton5 = null;
                                                                }
                                                                D6.k(imageButton5);
                                                                ImageButton imageButton6 = cameraFragment.f218925j0;
                                                                if (imageButton6 == null) {
                                                                    imageButton6 = null;
                                                                }
                                                                D6.k(imageButton6);
                                                                ImageView imageView3 = cameraFragment.f218926k0;
                                                                if (imageView3 == null) {
                                                                    imageView3 = null;
                                                                }
                                                                D6.k(imageView3);
                                                                if (z13) {
                                                                    i iVar4 = cameraFragment.f218933r0;
                                                                    (iVar4 != null ? iVar4 : null).me();
                                                                    cameraFragment.c5();
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            ImageButton imageButton7 = cameraFragment.f218929n0;
                                                            if (imageButton7 == null) {
                                                                imageButton7 = null;
                                                            }
                                                            D6.h(imageButton7);
                                                            ImageButton imageButton8 = cameraFragment.f218925j0;
                                                            if (imageButton8 == null) {
                                                                imageButton8 = null;
                                                            }
                                                            D6.h(imageButton8);
                                                            ImageView imageView4 = cameraFragment.f218926k0;
                                                            D6.h(imageView4 != null ? imageView4 : null);
                                                            break;
                                                        }
                                                    } else {
                                                        v vVar3 = cameraFragment.f218932q0;
                                                        v vVar4 = vVar3 != null ? vVar3 : null;
                                                        i.a.k kVar = (i.a.k) aVar;
                                                        float f12 = kVar.f219002a;
                                                        CameraAnimationCanvas cameraAnimationCanvas2 = vVar4.f219037b;
                                                        cameraAnimationCanvas2.f218914b = f12;
                                                        cameraAnimationCanvas2.f218915c = kVar.f219003b;
                                                        cameraAnimationCanvas2.f218916d = 0.0f;
                                                        cameraAnimationCanvas2.invalidate();
                                                        break;
                                                    }
                                                } else {
                                                    ImageView imageView5 = cameraFragment.f218926k0;
                                                    (imageView5 != null ? imageView5 : null).setImageResource(((i.a.C6575a) aVar).f218992a);
                                                    break;
                                                }
                                            } else {
                                                String string = cameraFragment.getString(((i.a.j) aVar).f219001a);
                                                View view16 = cameraFragment.f218927l0;
                                                if (view16 == null) {
                                                    view16 = null;
                                                }
                                                if (view16 instanceof Button) {
                                                    ((Button) view16).setText(string);
                                                } else if (view16 instanceof com.avito.android.lib.design.button.Button) {
                                                    ((com.avito.android.lib.design.button.Button) view16).setText(string);
                                                }
                                                if (cameraFragment.b5()) {
                                                    View view17 = cameraFragment.f218934s0;
                                                    if (view17 == null) {
                                                        view17 = null;
                                                    }
                                                    view17.setBackgroundColor(0);
                                                    View view18 = cameraFragment.f218935t0;
                                                    if (view18 == null) {
                                                        view18 = null;
                                                    }
                                                    D6.w(view18);
                                                }
                                                View view19 = cameraFragment.f218928m0;
                                                (view19 != null ? view19 : null).setVisibility(0);
                                                break;
                                            }
                                        } else {
                                            if (cameraFragment.b5()) {
                                                int iD2 = C35835l0.d(R.attr.gray4, cameraFragment.requireContext());
                                                View view20 = cameraFragment.f218934s0;
                                                if (view20 == null) {
                                                    view20 = null;
                                                }
                                                view20.setBackgroundColor(iD2);
                                                View view21 = cameraFragment.f218935t0;
                                                if (view21 == null) {
                                                    view21 = null;
                                                }
                                                D6.H(view21);
                                            }
                                            View view22 = cameraFragment.f218928m0;
                                            (view22 != null ? view22 : null).setVisibility(8);
                                            break;
                                        }
                                    } else {
                                        v vVar5 = cameraFragment.f218932q0;
                                        (vVar5 != null ? vVar5 : null).f219038c.setTransform(((i.a.l) aVar).f219004a);
                                        break;
                                    }
                                } else {
                                    cameraFragment.c5();
                                    break;
                                }
                            } else {
                                Bitmap bitmap = ((i.a.b) aVar).f218993a;
                                SimpleDraweeView simpleDraweeView2 = cameraFragment.f218924i0;
                                if (simpleDraweeView2 == null) {
                                    simpleDraweeView2 = null;
                                }
                                simpleDraweeView2.setClickable(true);
                                SimpleDraweeView simpleDraweeView3 = cameraFragment.f218924i0;
                                if (simpleDraweeView3 == null) {
                                    simpleDraweeView3 = null;
                                }
                                ImageRequest.a aVarA = C35949t5.a(simpleDraweeView3);
                                aVarA.f169484b = new ImageRequest.d.a(new BitmapDrawable(cameraFragment.getResources(), bitmap), null);
                                aVarA.c();
                                break;
                            }
                        } else {
                            SimpleDraweeView simpleDraweeView4 = cameraFragment.f218924i0;
                            if (simpleDraweeView4 == null) {
                                simpleDraweeView4 = null;
                            }
                            simpleDraweeView4.setClickable(true);
                            SimpleDraweeView simpleDraweeView5 = cameraFragment.f218924i0;
                            if (simpleDraweeView5 == null) {
                                simpleDraweeView5 = null;
                            }
                            ImageRequest.a aVarA2 = C35949t5.a(simpleDraweeView5);
                            aVarA2.f169484b = new ImageRequest.d.a(cameraFragment.requireContext().getDrawable(R.drawable.img_gallery_placeholder_48), null);
                            aVarA2.c();
                            break;
                        }
                        break;
                    default:
                        PhotoPickerViewModel.b bVar = (PhotoPickerViewModel.b) obj;
                        boolean z14 = bVar instanceof PhotoPickerViewModel.b.e;
                        CameraFragment cameraFragment2 = this.f218944c;
                        if (!z14) {
                            if (!(bVar instanceof PhotoPickerViewModel.b.a)) {
                                if (!L.f(bVar, PhotoPickerViewModel.b.C6571b.f218853a) && !L.f(bVar, PhotoPickerViewModel.b.c.f218854a) && !L.f(bVar, PhotoPickerViewModel.b.d.f218855a)) {
                                    L.f(bVar, PhotoPickerViewModel.b.f.f218857a);
                                    break;
                                }
                            } else {
                                PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode4 = cameraFragment2.f218937v0;
                                if (photoPickerMode4 == null) {
                                    photoPickerMode4 = null;
                                }
                                PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd modeAdd = photoPickerMode4 instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd ? (PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd) photoPickerMode4 : null;
                                if (!((modeAdd != null ? modeAdd.f218806b : null) instanceof PhotoPickerIntentFactory.AddType.GigDocuments)) {
                                    TextView textView5 = cameraFragment2.f218930o0;
                                    (textView5 != null ? textView5 : null).setVisibility(0);
                                    break;
                                } else {
                                    TextView textView6 = cameraFragment2.f218931p0;
                                    (textView6 != null ? textView6 : null).setVisibility(0);
                                    break;
                                }
                            }
                        } else {
                            PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode5 = cameraFragment2.f218937v0;
                            if (photoPickerMode5 == null) {
                                photoPickerMode5 = null;
                            }
                            PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd modeAdd2 = photoPickerMode5 instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd ? (PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd) photoPickerMode5 : null;
                            if (!((modeAdd2 != null ? modeAdd2.f218806b : null) instanceof PhotoPickerIntentFactory.AddType.GigDocuments)) {
                                TextView textView7 = cameraFragment2.f218930o0;
                                (textView7 != null ? textView7 : null).setVisibility(4);
                                break;
                            } else {
                                TextView textView8 = cameraFragment2.f218931p0;
                                (textView8 != null ? textView8 : null).setVisibility(4);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ((PhotoPickerViewModel) new P0(requireActivity()).a(PhotoPickerViewModel.class)).f218833c0.observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.photo_picker.camera.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraFragment f218944c;

            {
                this.f218944c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                switch (i15) {
                    case 0:
                        i.a aVar = (i.a) obj;
                        boolean z12 = aVar instanceof i.a.e;
                        CameraFragment cameraFragment = this.f218944c;
                        if (!z12) {
                            if (!(aVar instanceof i.a.b)) {
                                if (!(aVar instanceof i.a.d)) {
                                    if (!(aVar instanceof i.a.l)) {
                                        if (!(aVar instanceof i.a.c)) {
                                            if (!(aVar instanceof i.a.j)) {
                                                if (!(aVar instanceof i.a.C6575a)) {
                                                    if (!(aVar instanceof i.a.k)) {
                                                        if (!(aVar instanceof i.a.g)) {
                                                            if (!(aVar instanceof i.a.h)) {
                                                                if (!(aVar instanceof i.a.f)) {
                                                                    if (aVar instanceof i.a.C6576i) {
                                                                        cameraFragment.f218923h0.b("android.permission.CAMERA");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    ImageButton imageButton3 = cameraFragment.f218929n0;
                                                                    if (imageButton3 == null) {
                                                                        imageButton3 = null;
                                                                    }
                                                                    D6.k(imageButton3);
                                                                    ImageButton imageButton4 = cameraFragment.f218925j0;
                                                                    if (imageButton4 == null) {
                                                                        imageButton4 = null;
                                                                    }
                                                                    D6.k(imageButton4);
                                                                    ImageView imageView2 = cameraFragment.f218926k0;
                                                                    D6.k(imageView2 != null ? imageView2 : null);
                                                                    break;
                                                                }
                                                            } else {
                                                                boolean z13 = ((i.a.h) aVar).f218999a;
                                                                v vVar2 = cameraFragment.f218932q0;
                                                                if (vVar2 == null) {
                                                                    vVar2 = null;
                                                                }
                                                                CameraAnimationCanvas cameraAnimationCanvas = vVar2.f219037b;
                                                                cameraAnimationCanvas.startAnimation(cameraAnimationCanvas.f218918f);
                                                                ImageButton imageButton5 = cameraFragment.f218929n0;
                                                                if (imageButton5 == null) {
                                                                    imageButton5 = null;
                                                                }
                                                                D6.k(imageButton5);
                                                                ImageButton imageButton6 = cameraFragment.f218925j0;
                                                                if (imageButton6 == null) {
                                                                    imageButton6 = null;
                                                                }
                                                                D6.k(imageButton6);
                                                                ImageView imageView3 = cameraFragment.f218926k0;
                                                                if (imageView3 == null) {
                                                                    imageView3 = null;
                                                                }
                                                                D6.k(imageView3);
                                                                if (z13) {
                                                                    i iVar4 = cameraFragment.f218933r0;
                                                                    (iVar4 != null ? iVar4 : null).me();
                                                                    cameraFragment.c5();
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            ImageButton imageButton7 = cameraFragment.f218929n0;
                                                            if (imageButton7 == null) {
                                                                imageButton7 = null;
                                                            }
                                                            D6.h(imageButton7);
                                                            ImageButton imageButton8 = cameraFragment.f218925j0;
                                                            if (imageButton8 == null) {
                                                                imageButton8 = null;
                                                            }
                                                            D6.h(imageButton8);
                                                            ImageView imageView4 = cameraFragment.f218926k0;
                                                            D6.h(imageView4 != null ? imageView4 : null);
                                                            break;
                                                        }
                                                    } else {
                                                        v vVar3 = cameraFragment.f218932q0;
                                                        v vVar4 = vVar3 != null ? vVar3 : null;
                                                        i.a.k kVar = (i.a.k) aVar;
                                                        float f12 = kVar.f219002a;
                                                        CameraAnimationCanvas cameraAnimationCanvas2 = vVar4.f219037b;
                                                        cameraAnimationCanvas2.f218914b = f12;
                                                        cameraAnimationCanvas2.f218915c = kVar.f219003b;
                                                        cameraAnimationCanvas2.f218916d = 0.0f;
                                                        cameraAnimationCanvas2.invalidate();
                                                        break;
                                                    }
                                                } else {
                                                    ImageView imageView5 = cameraFragment.f218926k0;
                                                    (imageView5 != null ? imageView5 : null).setImageResource(((i.a.C6575a) aVar).f218992a);
                                                    break;
                                                }
                                            } else {
                                                String string = cameraFragment.getString(((i.a.j) aVar).f219001a);
                                                View view16 = cameraFragment.f218927l0;
                                                if (view16 == null) {
                                                    view16 = null;
                                                }
                                                if (view16 instanceof Button) {
                                                    ((Button) view16).setText(string);
                                                } else if (view16 instanceof com.avito.android.lib.design.button.Button) {
                                                    ((com.avito.android.lib.design.button.Button) view16).setText(string);
                                                }
                                                if (cameraFragment.b5()) {
                                                    View view17 = cameraFragment.f218934s0;
                                                    if (view17 == null) {
                                                        view17 = null;
                                                    }
                                                    view17.setBackgroundColor(0);
                                                    View view18 = cameraFragment.f218935t0;
                                                    if (view18 == null) {
                                                        view18 = null;
                                                    }
                                                    D6.w(view18);
                                                }
                                                View view19 = cameraFragment.f218928m0;
                                                (view19 != null ? view19 : null).setVisibility(0);
                                                break;
                                            }
                                        } else {
                                            if (cameraFragment.b5()) {
                                                int iD2 = C35835l0.d(R.attr.gray4, cameraFragment.requireContext());
                                                View view20 = cameraFragment.f218934s0;
                                                if (view20 == null) {
                                                    view20 = null;
                                                }
                                                view20.setBackgroundColor(iD2);
                                                View view21 = cameraFragment.f218935t0;
                                                if (view21 == null) {
                                                    view21 = null;
                                                }
                                                D6.H(view21);
                                            }
                                            View view22 = cameraFragment.f218928m0;
                                            (view22 != null ? view22 : null).setVisibility(8);
                                            break;
                                        }
                                    } else {
                                        v vVar5 = cameraFragment.f218932q0;
                                        (vVar5 != null ? vVar5 : null).f219038c.setTransform(((i.a.l) aVar).f219004a);
                                        break;
                                    }
                                } else {
                                    cameraFragment.c5();
                                    break;
                                }
                            } else {
                                Bitmap bitmap = ((i.a.b) aVar).f218993a;
                                SimpleDraweeView simpleDraweeView2 = cameraFragment.f218924i0;
                                if (simpleDraweeView2 == null) {
                                    simpleDraweeView2 = null;
                                }
                                simpleDraweeView2.setClickable(true);
                                SimpleDraweeView simpleDraweeView3 = cameraFragment.f218924i0;
                                if (simpleDraweeView3 == null) {
                                    simpleDraweeView3 = null;
                                }
                                ImageRequest.a aVarA = C35949t5.a(simpleDraweeView3);
                                aVarA.f169484b = new ImageRequest.d.a(new BitmapDrawable(cameraFragment.getResources(), bitmap), null);
                                aVarA.c();
                                break;
                            }
                        } else {
                            SimpleDraweeView simpleDraweeView4 = cameraFragment.f218924i0;
                            if (simpleDraweeView4 == null) {
                                simpleDraweeView4 = null;
                            }
                            simpleDraweeView4.setClickable(true);
                            SimpleDraweeView simpleDraweeView5 = cameraFragment.f218924i0;
                            if (simpleDraweeView5 == null) {
                                simpleDraweeView5 = null;
                            }
                            ImageRequest.a aVarA2 = C35949t5.a(simpleDraweeView5);
                            aVarA2.f169484b = new ImageRequest.d.a(cameraFragment.requireContext().getDrawable(R.drawable.img_gallery_placeholder_48), null);
                            aVarA2.c();
                            break;
                        }
                        break;
                    default:
                        PhotoPickerViewModel.b bVar = (PhotoPickerViewModel.b) obj;
                        boolean z14 = bVar instanceof PhotoPickerViewModel.b.e;
                        CameraFragment cameraFragment2 = this.f218944c;
                        if (!z14) {
                            if (!(bVar instanceof PhotoPickerViewModel.b.a)) {
                                if (!L.f(bVar, PhotoPickerViewModel.b.C6571b.f218853a) && !L.f(bVar, PhotoPickerViewModel.b.c.f218854a) && !L.f(bVar, PhotoPickerViewModel.b.d.f218855a)) {
                                    L.f(bVar, PhotoPickerViewModel.b.f.f218857a);
                                    break;
                                }
                            } else {
                                PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode4 = cameraFragment2.f218937v0;
                                if (photoPickerMode4 == null) {
                                    photoPickerMode4 = null;
                                }
                                PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd modeAdd = photoPickerMode4 instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd ? (PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd) photoPickerMode4 : null;
                                if (!((modeAdd != null ? modeAdd.f218806b : null) instanceof PhotoPickerIntentFactory.AddType.GigDocuments)) {
                                    TextView textView5 = cameraFragment2.f218930o0;
                                    (textView5 != null ? textView5 : null).setVisibility(0);
                                    break;
                                } else {
                                    TextView textView6 = cameraFragment2.f218931p0;
                                    (textView6 != null ? textView6 : null).setVisibility(0);
                                    break;
                                }
                            }
                        } else {
                            PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode5 = cameraFragment2.f218937v0;
                            if (photoPickerMode5 == null) {
                                photoPickerMode5 = null;
                            }
                            PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd modeAdd2 = photoPickerMode5 instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd ? (PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd) photoPickerMode5 : null;
                            if (!((modeAdd2 != null ? modeAdd2.f218806b : null) instanceof PhotoPickerIntentFactory.AddType.GigDocuments)) {
                                TextView textView7 = cameraFragment2.f218930o0;
                                (textView7 != null ? textView7 : null).setVisibility(4);
                                break;
                            } else {
                                TextView textView8 = cameraFragment2.f218931p0;
                                (textView8 != null ? textView8 : null).setVisibility(4);
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }
}

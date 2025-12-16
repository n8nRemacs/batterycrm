package com.avito.android.photo_picker.gallery;

import Y61.k;
import Y61.l;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.P0;
import androidx.view.R0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.permissions.G;
import com.avito.android.permissions.x;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_picker.gallery.di.b;
import com.avito.android.util.C35966w1;
import com.avito.android.util.V2;
import i.b;
import java.io.IOException;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import r80.C47508a;

/* compiled from: GalleryPickerFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_picker/gallery/GalleryPickerFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GalleryPickerFragment extends Fragment implements InterfaceC28477j.b {

    /* renamed from: C0, reason: collision with root package name */
    @k
    public static final a f219444C0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @l
    public Camera f219445A0;

    /* renamed from: f0, reason: collision with root package name */
    @Inject
    public h f219447f0;

    /* renamed from: g0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f219448g0;

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f219449h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f219450i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public x f219451j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public G f219452k0;

    /* renamed from: m0, reason: collision with root package name */
    public View f219454m0;

    /* renamed from: n0, reason: collision with root package name */
    public View f219455n0;

    /* renamed from: o0, reason: collision with root package name */
    public ViewGroup f219456o0;

    /* renamed from: p0, reason: collision with root package name */
    public View f219457p0;

    /* renamed from: q0, reason: collision with root package name */
    public TextureView f219458q0;

    /* renamed from: r0, reason: collision with root package name */
    public View f219459r0;

    /* renamed from: s0, reason: collision with root package name */
    public TextView f219460s0;

    /* renamed from: t0, reason: collision with root package name */
    public C47508a f219461t0;

    /* renamed from: u0, reason: collision with root package name */
    public View f219462u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public NavBar f219463v0;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public TextView f219464w0;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public RecyclerView f219465x0;

    /* renamed from: y0, reason: collision with root package name */
    public RecyclerView f219466y0;

    /* renamed from: z0, reason: collision with root package name */
    public com.avito.android.photo_picker.gallery.e f219467z0;

    /* renamed from: l0, reason: collision with root package name */
    @k
    public final androidx.view.result.h<String[]> f219453l0 = registerForActivityResult(new b.k(), new e());

    /* renamed from: B0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f219446B0 = C42727D.c(new b());

    /* compiled from: GalleryPickerFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/photo_picker/gallery/GalleryPickerFragment$a;", "", "<init>", "()V", "", "ARG_IS_REDESIGN", "Ljava/lang/String;", "TAG", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: GalleryPickerFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.photo_picker.gallery.GalleryPickerFragment$a$a, reason: collision with other inner class name */
        public static final class C6597a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ boolean f219468l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6597a(boolean z12) {
                super(1);
                this.f219468l = z12;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putBoolean("arg_is_redesign", this.f219468l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static GalleryPickerFragment a(boolean z12) {
            GalleryPickerFragment galleryPickerFragment = new GalleryPickerFragment();
            C35966w1.a(galleryPickerFragment, -1, new C6597a(z12));
            return galleryPickerFragment;
        }

        public a() {
        }
    }

    /* compiled from: GalleryPickerFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(GalleryPickerFragment.this.requireArguments().getBoolean("arg_is_redesign"));
        }
    }

    /* compiled from: GalleryPickerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.photo_picker.gallery.e eVar = GalleryPickerFragment.this.f219467z0;
            if (eVar == null) {
                eVar = null;
            }
            PhotoPickerViewModel photoPickerViewModel = eVar.f219510T;
            (photoPickerViewModel != null ? photoPickerViewModel : null).pe();
            return G0.f406611a;
        }
    }

    /* compiled from: GalleryPickerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e implements androidx.view.result.a, D {
        public e() {
        }

        @Override // androidx.view.result.a
        public final void a(Object obj) {
            com.avito.android.photo_picker.gallery.e eVar = GalleryPickerFragment.this.f219467z0;
            if (eVar == null) {
                eVar = null;
            }
            eVar.O();
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof androidx.view.result.a) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(1, GalleryPickerFragment.this, GalleryPickerFragment.class, "onGalleryPermissionsResult", "onGalleryPermissionsResult(Ljava/util/Map;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public final boolean b5() {
        return ((Boolean) this.f219446B0.getValue()).booleanValue();
    }

    public final void c5(SurfaceTexture surfaceTexture) throws IOException {
        com.avito.android.photo_picker.gallery.e eVar = this.f219467z0;
        TextureView textureView = null;
        if (eVar == null) {
            eVar = null;
        }
        if (eVar.f219499E.b("android.permission.CAMERA")) {
            try {
                this.f219445A0 = Camera.open();
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                int i12 = 0;
                Camera.getCameraInfo(0, cameraInfo);
                int rotation = requireActivity().getWindowManager().getDefaultDisplay().getRotation();
                if (rotation != 0) {
                    if (rotation == 1) {
                        i12 = 90;
                    } else if (rotation == 2) {
                        i12 = 180;
                    } else if (rotation == 3) {
                        i12 = 270;
                    }
                }
                int i13 = ((cameraInfo.orientation - i12) + 360) % 360;
                Camera camera = this.f219445A0;
                if (camera != null) {
                    camera.setDisplayOrientation(i13);
                }
                Camera camera2 = this.f219445A0;
                if (camera2 != null) {
                    camera2.setPreviewTexture(surfaceTexture);
                }
                Camera camera3 = this.f219445A0;
                if (camera3 != null) {
                    camera3.startPreview();
                }
                TextureView textureView2 = this.f219458q0;
                if (textureView2 == null) {
                    textureView2 = null;
                }
                float width = textureView2.getWidth();
                TextureView textureView3 = this.f219458q0;
                if (textureView3 == null) {
                    textureView3 = null;
                }
                float height = textureView3.getHeight();
                TextureView textureView4 = this.f219458q0;
                if (textureView4 == null) {
                    textureView4 = null;
                }
                float width2 = textureView4.getWidth();
                float f12 = width2 / 0.75f;
                TextureView textureView5 = this.f219458q0;
                if (textureView5 != null) {
                    textureView = textureView5;
                }
                Matrix matrix = new Matrix();
                matrix.setScale(width2 / width, f12 / height);
                matrix.postTranslate((width - width2) / 2.0f, (height - f12) / 2.0f);
                textureView.setTransform(matrix);
            } catch (Exception e12) {
                V2.f318762a.a("GalleryPickerFragment", "Can't open camera or start preview", e12);
            }
        }
    }

    public final void d5() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorRotation;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator duration;
        View view = this.f219454m0;
        if (view == null) {
            view = null;
        }
        if (view.findViewById(R.id.folders_dropdown_container).getVisibility() != 0) {
            View view2 = this.f219454m0;
            View viewFindViewById = (view2 != null ? view2 : null).findViewById(R.id.folders_dropdown_container);
            viewFindViewById.setVisibility(0);
            viewFindViewById.post(new com.avito.android.photo_picker.gallery.b(viewFindViewById, this, 0));
            return;
        }
        View view3 = this.f219454m0;
        View viewFindViewById2 = (view3 != null ? view3 : null).findViewById(R.id.folders_dropdown_container);
        viewFindViewById2.animate().translationY(-viewFindViewById2.getHeight()).setDuration(200L).withEndAction(new com.avito.android.photo_picker.gallery.b(viewFindViewById2, this, 1)).start();
        TextView textView = this.f219464w0;
        if (textView == null || (viewPropertyAnimatorAnimate = textView.animate()) == null || (viewPropertyAnimatorRotation = viewPropertyAnimatorAnimate.rotation(0.0f)) == null || (viewPropertyAnimatorTranslationY = viewPropertyAnimatorRotation.translationY(0.0f)) == null || (duration = viewPropertyAnimatorTranslationY.setDuration(200L)) == null) {
            return;
        }
        duration.start();
    }

    public final void e5(ArrayList arrayList) {
        UV0.c cVar = new UV0.c(arrayList);
        com.avito.konveyor.adapter.a aVar = this.f219448g0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.c(cVar);
        RecyclerView recyclerView = this.f219466y0;
        RecyclerView.Adapter adapter = (recyclerView != null ? recyclerView : null).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(@l Bundle bundle) {
        super.onActivityCreated(bundle);
        com.avito.android.photo_picker.gallery.e eVar = this.f219467z0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.f219510T = (PhotoPickerViewModel) new P0(requireActivity()).a(PhotoPickerViewModel.class);
        eVar.f219508R.b(eVar.f219502L.getF219537d().x0(eVar.f219500J.e()).v0(new f(eVar), g.f219524b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        b.a aVarA = com.avito.android.photo_picker.gallery.di.a.a();
        aVarA.c((com.avito.android.photo_picker.gallery.di.c) C29972i.a(C29972i.b(this), com.avito.android.photo_picker.gallery.di.c.class));
        aVarA.b(this);
        aVarA.a(b5());
        aVarA.build().a(this);
        h hVar = this.f219447f0;
        if (hVar == null) {
            hVar = null;
        }
        this.f219467z0 = (com.avito.android.photo_picker.gallery.e) R0.a(this, hVar).a(com.avito.android.photo_picker.gallery.e.class);
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        View viewInflate = layoutInflater.inflate(b5() ? R.layout.fragment_gallery_re23 : R.layout.fragment_gallery, (ViewGroup) null);
        this.f219454m0 = viewInflate;
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i12, @k String[] strArr, @k int[] iArr) {
        if (i12 == 1000) {
            com.avito.android.photo_picker.gallery.e eVar = this.f219467z0;
            if (eVar == null) {
                eVar = null;
            }
            eVar.O();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() throws IOException {
        super.onResume();
        TextureView textureView = this.f219458q0;
        if (textureView == null) {
            textureView = null;
        }
        if (textureView.isAvailable()) {
            TextureView textureView2 = this.f219458q0;
            c5((textureView2 != null ? textureView2 : null).getSurfaceTexture());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.avito.android.photo_picker.gallery.e eVar = this.f219467z0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.O();
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x01d5  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(@Y61.k android.view.View r6, @Y61.l android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_picker.gallery.GalleryPickerFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* compiled from: GalleryPickerFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/photo_picker/gallery/GalleryPickerFragment$d", "Landroid/view/TextureView$SurfaceTextureListener;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements TextureView.SurfaceTextureListener {
        public d() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(@k SurfaceTexture surfaceTexture, int i12, int i13) throws IOException {
            a aVar = GalleryPickerFragment.f219444C0;
            GalleryPickerFragment.this.c5(surfaceTexture);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(@k SurfaceTexture surfaceTexture) {
            a aVar = GalleryPickerFragment.f219444C0;
            GalleryPickerFragment galleryPickerFragment = GalleryPickerFragment.this;
            try {
                Camera camera = galleryPickerFragment.f219445A0;
                if (camera != null) {
                    camera.stopPreview();
                }
                Camera camera2 = galleryPickerFragment.f219445A0;
                if (camera2 == null) {
                    return true;
                }
                camera2.release();
                return true;
            } catch (Exception e12) {
                V2.f318762a.a("GalleryPickerFragment", "Can't stop preview or release camera", e12);
                return true;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(@k SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(@k SurfaceTexture surfaceTexture, int i12, int i13) {
        }
    }
}

package com.avito.android.photo_picker.edit;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.view.C23038g0;
import androidx.view.P0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.krop.KropView;
import com.avito.android.krop.util.Transformation;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_picker.SelectedPhoto;
import com.avito.android.photo_picker.edit.EditPhotoFragment;
import com.avito.android.photo_picker.edit.EditPhotoFragment.c;
import com.avito.android.photo_picker.edit.di.b;
import com.avito.android.photo_picker.edit.h;
import com.avito.android.photo_picker.edit.k;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import io.reactivex.rxjava3.internal.operators.maybe.K;
import io.reactivex.rxjava3.kotlin.A1;
import io.reactivex.rxjava3.kotlin.z1;
import j.InterfaceC42156l;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EditPhotoFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_picker/edit/EditPhotoFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EditPhotoFragment extends Fragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f219347y0 = new a(null);

    /* renamed from: f0, reason: collision with root package name */
    @Inject
    public k f219348f0;

    /* renamed from: g0, reason: collision with root package name */
    public PhotoPickerViewModel f219349g0;

    /* renamed from: h0, reason: collision with root package name */
    public Toolbar f219350h0;

    /* renamed from: i0, reason: collision with root package name */
    public View f219351i0;

    /* renamed from: j0, reason: collision with root package name */
    public View f219352j0;

    /* renamed from: k0, reason: collision with root package name */
    public KropView f219353k0;

    /* renamed from: l0, reason: collision with root package name */
    public com.avito.android.krop.e f219354l0;

    /* renamed from: m0, reason: collision with root package name */
    public com.avito.android.krop.e f219355m0;

    /* renamed from: n0, reason: collision with root package name */
    public View f219356n0;

    /* renamed from: o0, reason: collision with root package name */
    public Button f219357o0;

    /* renamed from: p0, reason: collision with root package name */
    public Button f219358p0;

    /* renamed from: q0, reason: collision with root package name */
    public View f219359q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public com.facebook.datasource.c f219360r0;

    /* renamed from: u0, reason: collision with root package name */
    public ValueAnimator f219363u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f219364v0;

    /* renamed from: w0, reason: collision with root package name */
    public PhotoPickerIntentFactory.PhotoPickerMode f219365w0;

    /* renamed from: s0, reason: collision with root package name */
    public final int f219361s0 = R.attr.white;

    /* renamed from: t0, reason: collision with root package name */
    public final int f219362t0 = R.attr.whiteAlpha80;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f219366x0 = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: EditPhotoFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/edit/EditPhotoFragment$a;", "", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: EditPhotoFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.photo_picker.edit.EditPhotoFragment$a$a, reason: collision with other inner class name */
        public static final class C6592a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f219367l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ PhotoPickerIntentFactory.PhotoPickerMode f219368m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6592a(String str, PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode) {
                super(1);
                this.f219367l = str;
                this.f219368m = photoPickerMode;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putString("photo_id", this.f219367l);
                bundle2.putParcelable("mode", this.f219368m);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static EditPhotoFragment a(@Y61.k String str, @Y61.k PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode) {
            EditPhotoFragment editPhotoFragment = new EditPhotoFragment();
            C35966w1.a(editPhotoFragment, -1, new C6592a(str, photoPickerMode));
            return editPhotoFragment;
        }

        public a() {
        }
    }

    /* compiled from: EditPhotoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
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

    /* compiled from: EditPhotoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Bitmap> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Bitmap invoke() {
            KropView kropView = EditPhotoFragment.this.f219353k0;
            if (kropView == null) {
                kropView = null;
            }
            return kropView.getCroppedBitmap();
        }
    }

    /* compiled from: EditPhotoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_picker/SelectedPhoto;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/photo_picker/SelectedPhoto;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<SelectedPhoto, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SelectedPhoto selectedPhoto) {
            SelectedPhoto selectedPhoto2 = selectedPhoto;
            k kVar = EditPhotoFragment.this.f219348f0;
            if (kVar == null) {
                kVar = null;
            }
            C23038g0<k.a> c23038g0 = kVar.f219417P;
            kVar.f219416O = selectedPhoto2;
            Uri uri = selectedPhoto2.f218869e;
            if (uri == null) {
                uri = selectedPhoto2.f218866b;
            }
            if (selectedPhoto2 == null) {
                selectedPhoto2 = null;
            }
            c23038g0.setValue(new k.a.f(uri, selectedPhoto2.f218870f));
            G0 g02 = G0.f406611a;
            if (g02 == null) {
                c23038g0.setValue(k.a.b.f219419a);
            }
            return g02;
        }
    }

    public final void b5(@InterfaceC42156l int i12) {
        KropView kropView = this.f219353k0;
        if (kropView == null) {
            kropView = null;
        }
        kropView.f174750f = i12;
        kropView.f174755k.setOverlayColor(i12);
        kropView.invalidate();
        Toolbar toolbar = this.f219350h0;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setBackgroundColor(i12);
        View view = this.f219352j0;
        (view != null ? view : null).setBackgroundColor(i12);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(C35835l0.d(this.f219362t0, requireContext()), C35835l0.d(this.f219361s0, requireContext()));
        valueAnimatorOfArgb.setDuration(200L);
        valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.avito.android.photo_picker.edit.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                EditPhotoFragment.a aVar = EditPhotoFragment.f219347y0;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                EditPhotoFragment editPhotoFragment = this.f219371a;
                editPhotoFragment.f219364v0 = false;
                editPhotoFragment.b5(iIntValue);
            }
        });
        this.f219363u0 = valueAnimatorOfArgb;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode = arguments != null ? (PhotoPickerIntentFactory.PhotoPickerMode) arguments.getParcelable("mode") : null;
        if (photoPickerMode == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f219365w0 = photoPickerMode;
        b.a aVarA = com.avito.android.photo_picker.edit.di.a.a();
        aVarA.a((com.avito.android.photo_picker.edit.di.c) C29972i.a(C29972i.b(this), Object.class));
        aVarA.c(this);
        PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode2 = this.f219365w0;
        aVarA.b(photoPickerMode2 != null ? photoPickerMode2 : null);
        aVarA.build().a(this);
        this.f219349g0 = (PhotoPickerViewModel) new P0(requireActivity()).a(PhotoPickerViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_edit_photo, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        k kVar = this.f219348f0;
        if (kVar == null) {
            kVar = null;
        }
        kVar.f219417P.removeObservers(getViewLifecycleOwner());
        com.facebook.datasource.c cVar = this.f219360r0;
        if (cVar != null) {
            cVar.close();
        }
        this.f219360r0 = null;
        this.f219366x0.e();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        ValueAnimator valueAnimator = this.f219363u0;
        if (valueAnimator == null) {
            valueAnimator = null;
        }
        valueAnimator.cancel();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ValueAnimator valueAnimator = this.f219363u0;
        if (valueAnimator == null) {
            valueAnimator = null;
        }
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f219356n0 = view.findViewById(R.id.progress_overlay);
        this.f219353k0 = (KropView) view.findViewById(R.id.edit_photo_view);
        this.f219355m0 = (com.avito.android.krop.e) view.findViewById(R.id.edit_photo_bounds_default);
        this.f219354l0 = (com.avito.android.krop.e) view.findViewById(R.id.edit_photo_bounds_avatar);
        this.f219357o0 = (Button) view.findViewById(R.id.cancel_button);
        this.f219358p0 = (Button) view.findViewById(R.id.save_button);
        this.f219359q0 = view.findViewById(R.id.rotate_button);
        this.f219350h0 = (Toolbar) view.findViewById(R.id.toolbar);
        this.f219351i0 = view.findViewById(R.id.toolbar_text);
        this.f219352j0 = view.findViewById(R.id.controls_background);
        KropView kropView = this.f219353k0;
        if (kropView == null) {
            kropView = null;
        }
        kropView.setMaxScale(3.0f);
        Button button = this.f219357o0;
        if (button == null) {
            button = null;
        }
        final int i12 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.edit.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ EditPhotoFragment f219373c;

            {
                this.f219373c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        EditPhotoFragment editPhotoFragment = this.f219373c;
                        Button button2 = editPhotoFragment.f219357o0;
                        if (button2 == null) {
                            button2 = null;
                        }
                        button2.setEnabled(false);
                        Button button3 = editPhotoFragment.f219358p0;
                        if (button3 == null) {
                            button3 = null;
                        }
                        button3.setLoading(true);
                        final k kVar = editPhotoFragment.f219348f0;
                        if (kVar == null) {
                            kVar = null;
                        }
                        KropView kropView2 = editPhotoFragment.f219353k0;
                        if (kropView2 == null) {
                            kropView2 = null;
                        }
                        Transformation transformation = kropView2.getTransformation();
                        final EditPhotoFragment.c cVar = editPhotoFragment.new c();
                        SelectedPhoto selectedPhoto = kVar.f219416O;
                        if (selectedPhoto == null) {
                            selectedPhoto = null;
                        }
                        SelectedPhoto selectedPhotoA = SelectedPhoto.a(selectedPhoto, null, null, transformation, 111);
                        kVar.f219416O = selectedPhotoA;
                        Uri uri = selectedPhotoA.f218869e;
                        if (uri == null) {
                            uri = selectedPhotoA.f218866b;
                        }
                        io.reactivex.rxjava3.core.q<Map<String, String>> qVarA = kVar.f219413L.a(uri);
                        InterfaceC35745a5 interfaceC35745a5 = kVar.f219411J;
                        kVar.f219415N.b(z1.a(new K(new Callable() { // from class: com.avito.android.photo_picker.edit.j
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Q q12;
                                Bitmap bitmapCreateScaledBitmap = (Bitmap) ((EditPhotoFragment.c) cVar).invoke();
                                if (bitmapCreateScaledBitmap == null) {
                                    return C41928w.f403335b;
                                }
                                PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode = kVar.f219414M;
                                if (!(photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar)) {
                                    return io.reactivex.rxjava3.core.q.i(bitmapCreateScaledBitmap);
                                }
                                int iOrdinal = ((PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar) photoPickerMode).f218807b.ordinal();
                                if (iOrdinal == 0) {
                                    int iMin = Math.min(1024, bitmapCreateScaledBitmap.getWidth());
                                    q12 = new Q(Integer.valueOf(iMin), Integer.valueOf(iMin));
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    int iMin2 = (Math.min(1024, bitmapCreateScaledBitmap.getWidth()) / 3) * 2;
                                    q12 = new Q(Integer.valueOf((int) (iMin2 * 1.5d)), Integer.valueOf(iMin2));
                                }
                                int iIntValue = ((Number) q12.f406619b).intValue();
                                int iIntValue2 = ((Number) q12.f406620c).intValue();
                                if (bitmapCreateScaledBitmap.getWidth() != iIntValue || bitmapCreateScaledBitmap.getHeight() != iIntValue2) {
                                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, iIntValue, iIntValue2, false);
                                }
                                return io.reactivex.rxjava3.core.q.i(bitmapCreateScaledBitmap);
                            }
                        }).h(o.f219428b).r().z(interfaceC35745a5.c()), qVarA.p(interfaceC35745a5.a()).j(p.f219429b).r().B(5000L, TimeUnit.MILLISECONDS, interfaceC35745a5.c(), null).u(new C32102w0(4))).s(interfaceC35745a5.a()).r(new l(kVar)).s(interfaceC35745a5.e()).x(new m(kVar), new n(kVar)));
                        break;
                    case 1:
                        k kVar2 = this.f219373c.f219348f0;
                        if (kVar2 == null) {
                            kVar2 = null;
                        }
                        kVar2.f219417P.setValue(k.a.C6596a.f219418a);
                        break;
                    case 2:
                        k kVar3 = this.f219373c.f219348f0;
                        if (kVar3 == null) {
                            kVar3 = null;
                        }
                        SelectedPhoto selectedPhoto2 = kVar3.f219416O;
                        kVar3.f219412K.a(new m80.i((selectedPhoto2 != null ? selectedPhoto2 : null).f218871g));
                        kVar3.f219417P.setValue(new k.a.c());
                        break;
                    default:
                        k kVar4 = this.f219373c.f219348f0;
                        if (kVar4 == null) {
                            kVar4 = null;
                        }
                        kVar4.f219417P.setValue(k.a.C6596a.f219418a);
                        break;
                }
            }
        });
        Button button2 = this.f219358p0;
        if (button2 == null) {
            button2 = null;
        }
        final int i13 = 0;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.edit.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ EditPhotoFragment f219373c;

            {
                this.f219373c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        EditPhotoFragment editPhotoFragment = this.f219373c;
                        Button button22 = editPhotoFragment.f219357o0;
                        if (button22 == null) {
                            button22 = null;
                        }
                        button22.setEnabled(false);
                        Button button3 = editPhotoFragment.f219358p0;
                        if (button3 == null) {
                            button3 = null;
                        }
                        button3.setLoading(true);
                        final k kVar = editPhotoFragment.f219348f0;
                        if (kVar == null) {
                            kVar = null;
                        }
                        KropView kropView2 = editPhotoFragment.f219353k0;
                        if (kropView2 == null) {
                            kropView2 = null;
                        }
                        Transformation transformation = kropView2.getTransformation();
                        final Y41.a cVar = editPhotoFragment.new c();
                        SelectedPhoto selectedPhoto = kVar.f219416O;
                        if (selectedPhoto == null) {
                            selectedPhoto = null;
                        }
                        SelectedPhoto selectedPhotoA = SelectedPhoto.a(selectedPhoto, null, null, transformation, 111);
                        kVar.f219416O = selectedPhotoA;
                        Uri uri = selectedPhotoA.f218869e;
                        if (uri == null) {
                            uri = selectedPhotoA.f218866b;
                        }
                        io.reactivex.rxjava3.core.q<Map<String, String>> qVarA = kVar.f219413L.a(uri);
                        InterfaceC35745a5 interfaceC35745a5 = kVar.f219411J;
                        kVar.f219415N.b(z1.a(new K(new Callable() { // from class: com.avito.android.photo_picker.edit.j
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Q q12;
                                Bitmap bitmapCreateScaledBitmap = (Bitmap) ((EditPhotoFragment.c) cVar).invoke();
                                if (bitmapCreateScaledBitmap == null) {
                                    return C41928w.f403335b;
                                }
                                PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode = kVar.f219414M;
                                if (!(photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar)) {
                                    return io.reactivex.rxjava3.core.q.i(bitmapCreateScaledBitmap);
                                }
                                int iOrdinal = ((PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar) photoPickerMode).f218807b.ordinal();
                                if (iOrdinal == 0) {
                                    int iMin = Math.min(1024, bitmapCreateScaledBitmap.getWidth());
                                    q12 = new Q(Integer.valueOf(iMin), Integer.valueOf(iMin));
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    int iMin2 = (Math.min(1024, bitmapCreateScaledBitmap.getWidth()) / 3) * 2;
                                    q12 = new Q(Integer.valueOf((int) (iMin2 * 1.5d)), Integer.valueOf(iMin2));
                                }
                                int iIntValue = ((Number) q12.f406619b).intValue();
                                int iIntValue2 = ((Number) q12.f406620c).intValue();
                                if (bitmapCreateScaledBitmap.getWidth() != iIntValue || bitmapCreateScaledBitmap.getHeight() != iIntValue2) {
                                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, iIntValue, iIntValue2, false);
                                }
                                return io.reactivex.rxjava3.core.q.i(bitmapCreateScaledBitmap);
                            }
                        }).h(o.f219428b).r().z(interfaceC35745a5.c()), qVarA.p(interfaceC35745a5.a()).j(p.f219429b).r().B(5000L, TimeUnit.MILLISECONDS, interfaceC35745a5.c(), null).u(new C32102w0(4))).s(interfaceC35745a5.a()).r(new l(kVar)).s(interfaceC35745a5.e()).x(new m(kVar), new n(kVar)));
                        break;
                    case 1:
                        k kVar2 = this.f219373c.f219348f0;
                        if (kVar2 == null) {
                            kVar2 = null;
                        }
                        kVar2.f219417P.setValue(k.a.C6596a.f219418a);
                        break;
                    case 2:
                        k kVar3 = this.f219373c.f219348f0;
                        if (kVar3 == null) {
                            kVar3 = null;
                        }
                        SelectedPhoto selectedPhoto2 = kVar3.f219416O;
                        kVar3.f219412K.a(new m80.i((selectedPhoto2 != null ? selectedPhoto2 : null).f218871g));
                        kVar3.f219417P.setValue(new k.a.c());
                        break;
                    default:
                        k kVar4 = this.f219373c.f219348f0;
                        if (kVar4 == null) {
                            kVar4 = null;
                        }
                        kVar4.f219417P.setValue(k.a.C6596a.f219418a);
                        break;
                }
            }
        });
        View view2 = this.f219359q0;
        if (view2 == null) {
            view2 = null;
        }
        final int i14 = 2;
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.edit.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ EditPhotoFragment f219373c;

            {
                this.f219373c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i14) {
                    case 0:
                        EditPhotoFragment editPhotoFragment = this.f219373c;
                        Button button22 = editPhotoFragment.f219357o0;
                        if (button22 == null) {
                            button22 = null;
                        }
                        button22.setEnabled(false);
                        Button button3 = editPhotoFragment.f219358p0;
                        if (button3 == null) {
                            button3 = null;
                        }
                        button3.setLoading(true);
                        final k kVar = editPhotoFragment.f219348f0;
                        if (kVar == null) {
                            kVar = null;
                        }
                        KropView kropView2 = editPhotoFragment.f219353k0;
                        if (kropView2 == null) {
                            kropView2 = null;
                        }
                        Transformation transformation = kropView2.getTransformation();
                        final Y41.a cVar = editPhotoFragment.new c();
                        SelectedPhoto selectedPhoto = kVar.f219416O;
                        if (selectedPhoto == null) {
                            selectedPhoto = null;
                        }
                        SelectedPhoto selectedPhotoA = SelectedPhoto.a(selectedPhoto, null, null, transformation, 111);
                        kVar.f219416O = selectedPhotoA;
                        Uri uri = selectedPhotoA.f218869e;
                        if (uri == null) {
                            uri = selectedPhotoA.f218866b;
                        }
                        io.reactivex.rxjava3.core.q<Map<String, String>> qVarA = kVar.f219413L.a(uri);
                        InterfaceC35745a5 interfaceC35745a5 = kVar.f219411J;
                        kVar.f219415N.b(z1.a(new K(new Callable() { // from class: com.avito.android.photo_picker.edit.j
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Q q12;
                                Bitmap bitmapCreateScaledBitmap = (Bitmap) ((EditPhotoFragment.c) cVar).invoke();
                                if (bitmapCreateScaledBitmap == null) {
                                    return C41928w.f403335b;
                                }
                                PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode = kVar.f219414M;
                                if (!(photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar)) {
                                    return io.reactivex.rxjava3.core.q.i(bitmapCreateScaledBitmap);
                                }
                                int iOrdinal = ((PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar) photoPickerMode).f218807b.ordinal();
                                if (iOrdinal == 0) {
                                    int iMin = Math.min(1024, bitmapCreateScaledBitmap.getWidth());
                                    q12 = new Q(Integer.valueOf(iMin), Integer.valueOf(iMin));
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    int iMin2 = (Math.min(1024, bitmapCreateScaledBitmap.getWidth()) / 3) * 2;
                                    q12 = new Q(Integer.valueOf((int) (iMin2 * 1.5d)), Integer.valueOf(iMin2));
                                }
                                int iIntValue = ((Number) q12.f406619b).intValue();
                                int iIntValue2 = ((Number) q12.f406620c).intValue();
                                if (bitmapCreateScaledBitmap.getWidth() != iIntValue || bitmapCreateScaledBitmap.getHeight() != iIntValue2) {
                                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, iIntValue, iIntValue2, false);
                                }
                                return io.reactivex.rxjava3.core.q.i(bitmapCreateScaledBitmap);
                            }
                        }).h(o.f219428b).r().z(interfaceC35745a5.c()), qVarA.p(interfaceC35745a5.a()).j(p.f219429b).r().B(5000L, TimeUnit.MILLISECONDS, interfaceC35745a5.c(), null).u(new C32102w0(4))).s(interfaceC35745a5.a()).r(new l(kVar)).s(interfaceC35745a5.e()).x(new m(kVar), new n(kVar)));
                        break;
                    case 1:
                        k kVar2 = this.f219373c.f219348f0;
                        if (kVar2 == null) {
                            kVar2 = null;
                        }
                        kVar2.f219417P.setValue(k.a.C6596a.f219418a);
                        break;
                    case 2:
                        k kVar3 = this.f219373c.f219348f0;
                        if (kVar3 == null) {
                            kVar3 = null;
                        }
                        SelectedPhoto selectedPhoto2 = kVar3.f219416O;
                        kVar3.f219412K.a(new m80.i((selectedPhoto2 != null ? selectedPhoto2 : null).f218871g));
                        kVar3.f219417P.setValue(new k.a.c());
                        break;
                    default:
                        k kVar4 = this.f219373c.f219348f0;
                        if (kVar4 == null) {
                            kVar4 = null;
                        }
                        kVar4.f219417P.setValue(k.a.C6596a.f219418a);
                        break;
                }
            }
        });
        String string = requireArguments().getString("photo_id");
        PhotoPickerViewModel photoPickerViewModel = this.f219349g0;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        this.f219366x0.b(A1.g(photoPickerViewModel.re(string), null, new d(), 1));
        k kVar = this.f219348f0;
        if (kVar == null) {
            kVar = null;
        }
        kVar.f219417P.observe(getViewLifecycleOwner(), new h.a(new com.avito.android.photo_picker.edit.d(this)));
        PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode = this.f219365w0;
        if (photoPickerMode == null) {
            photoPickerMode = null;
        }
        if (photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar) {
            View view3 = this.f219351i0;
            if (view3 == null) {
                view3 = null;
            }
            D6.w(view3);
            Toolbar toolbar = this.f219350h0;
            if (toolbar == null) {
                toolbar = null;
            }
            toolbar.setNavigationIcon(R.drawable.ic_back_24_black);
            Toolbar toolbar2 = this.f219350h0;
            final int i15 = 3;
            (toolbar2 != null ? toolbar2 : null).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.edit.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ EditPhotoFragment f219373c;

                {
                    this.f219373c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i15) {
                        case 0:
                            EditPhotoFragment editPhotoFragment = this.f219373c;
                            Button button22 = editPhotoFragment.f219357o0;
                            if (button22 == null) {
                                button22 = null;
                            }
                            button22.setEnabled(false);
                            Button button3 = editPhotoFragment.f219358p0;
                            if (button3 == null) {
                                button3 = null;
                            }
                            button3.setLoading(true);
                            final k kVar2 = editPhotoFragment.f219348f0;
                            if (kVar2 == null) {
                                kVar2 = null;
                            }
                            KropView kropView2 = editPhotoFragment.f219353k0;
                            if (kropView2 == null) {
                                kropView2 = null;
                            }
                            Transformation transformation = kropView2.getTransformation();
                            final Y41.a cVar = editPhotoFragment.new c();
                            SelectedPhoto selectedPhoto = kVar2.f219416O;
                            if (selectedPhoto == null) {
                                selectedPhoto = null;
                            }
                            SelectedPhoto selectedPhotoA = SelectedPhoto.a(selectedPhoto, null, null, transformation, 111);
                            kVar2.f219416O = selectedPhotoA;
                            Uri uri = selectedPhotoA.f218869e;
                            if (uri == null) {
                                uri = selectedPhotoA.f218866b;
                            }
                            io.reactivex.rxjava3.core.q<Map<String, String>> qVarA = kVar2.f219413L.a(uri);
                            InterfaceC35745a5 interfaceC35745a5 = kVar2.f219411J;
                            kVar2.f219415N.b(z1.a(new K(new Callable() { // from class: com.avito.android.photo_picker.edit.j
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    Q q12;
                                    Bitmap bitmapCreateScaledBitmap = (Bitmap) ((EditPhotoFragment.c) cVar).invoke();
                                    if (bitmapCreateScaledBitmap == null) {
                                        return C41928w.f403335b;
                                    }
                                    PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode2 = kVar2.f219414M;
                                    if (!(photoPickerMode2 instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar)) {
                                        return io.reactivex.rxjava3.core.q.i(bitmapCreateScaledBitmap);
                                    }
                                    int iOrdinal = ((PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar) photoPickerMode2).f218807b.ordinal();
                                    if (iOrdinal == 0) {
                                        int iMin = Math.min(1024, bitmapCreateScaledBitmap.getWidth());
                                        q12 = new Q(Integer.valueOf(iMin), Integer.valueOf(iMin));
                                    } else {
                                        if (iOrdinal != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int iMin2 = (Math.min(1024, bitmapCreateScaledBitmap.getWidth()) / 3) * 2;
                                        q12 = new Q(Integer.valueOf((int) (iMin2 * 1.5d)), Integer.valueOf(iMin2));
                                    }
                                    int iIntValue = ((Number) q12.f406619b).intValue();
                                    int iIntValue2 = ((Number) q12.f406620c).intValue();
                                    if (bitmapCreateScaledBitmap.getWidth() != iIntValue || bitmapCreateScaledBitmap.getHeight() != iIntValue2) {
                                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, iIntValue, iIntValue2, false);
                                    }
                                    return io.reactivex.rxjava3.core.q.i(bitmapCreateScaledBitmap);
                                }
                            }).h(o.f219428b).r().z(interfaceC35745a5.c()), qVarA.p(interfaceC35745a5.a()).j(p.f219429b).r().B(5000L, TimeUnit.MILLISECONDS, interfaceC35745a5.c(), null).u(new C32102w0(4))).s(interfaceC35745a5.a()).r(new l(kVar2)).s(interfaceC35745a5.e()).x(new m(kVar2), new n(kVar2)));
                            break;
                        case 1:
                            k kVar22 = this.f219373c.f219348f0;
                            if (kVar22 == null) {
                                kVar22 = null;
                            }
                            kVar22.f219417P.setValue(k.a.C6596a.f219418a);
                            break;
                        case 2:
                            k kVar3 = this.f219373c.f219348f0;
                            if (kVar3 == null) {
                                kVar3 = null;
                            }
                            SelectedPhoto selectedPhoto2 = kVar3.f219416O;
                            kVar3.f219412K.a(new m80.i((selectedPhoto2 != null ? selectedPhoto2 : null).f218871g));
                            kVar3.f219417P.setValue(new k.a.c());
                            break;
                        default:
                            k kVar4 = this.f219373c.f219348f0;
                            if (kVar4 == null) {
                                kVar4 = null;
                            }
                            kVar4.f219417P.setValue(k.a.C6596a.f219418a);
                            break;
                    }
                }
            });
        }
    }
}

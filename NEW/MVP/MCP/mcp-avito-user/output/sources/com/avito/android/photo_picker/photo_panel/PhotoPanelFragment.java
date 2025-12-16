package com.avito.android.photo_picker.photo_panel;

import L91.e;
import VU.d;
import Y41.l;
import Y61.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.layout.ForegroundLinearLayout;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoPanelFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_picker/photo_panel/PhotoPanelFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoPanelFragment extends Fragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @k
    public static final a f219916n0 = new a(null);

    /* renamed from: f0, reason: collision with root package name */
    public FrameLayout f219917f0;

    /* renamed from: g0, reason: collision with root package name */
    public TextView f219918g0;

    /* renamed from: h0, reason: collision with root package name */
    public TextView f219919h0;

    /* renamed from: i0, reason: collision with root package name */
    public Button f219920i0;

    /* renamed from: j0, reason: collision with root package name */
    public SimpleDraweeView f219921j0;

    /* renamed from: k0, reason: collision with root package name */
    public SimpleDraweeView f219922k0;

    /* renamed from: l0, reason: collision with root package name */
    public com.avito.android.photo_picker.photo_panel.b f219923l0;

    /* renamed from: m0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f219924m0 = C42727D.c(new b());

    /* compiled from: PhotoPanelFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_picker/photo_panel/PhotoPanelFragment$a;", "", "<init>", "()V", "", "ARG_IS_REDESIGN", "Ljava/lang/String;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: PhotoPanelFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.photo_picker.photo_panel.PhotoPanelFragment$a$a, reason: collision with other inner class name */
        public static final class C6610a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ boolean f219925l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6610a(boolean z12) {
                super(1);
                this.f219925l = z12;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putBoolean("arg_is_redesign", this.f219925l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static PhotoPanelFragment a(boolean z12) {
            PhotoPanelFragment photoPanelFragment = new PhotoPanelFragment();
            C35966w1.a(photoPanelFragment, -1, new C6610a(z12));
            return photoPanelFragment;
        }

        public a() {
        }
    }

    /* compiled from: PhotoPanelFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(PhotoPanelFragment.this.requireArguments().getBoolean("arg_is_redesign"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(@Y61.l Bundle bundle) {
        super.onActivityCreated(bundle);
        com.avito.android.photo_picker.photo_panel.b bVar = this.f219923l0;
        if (bVar == null) {
            bVar = null;
        }
        PhotoPickerViewModel photoPickerViewModel = (PhotoPickerViewModel) new P0(requireActivity()).a(PhotoPickerViewModel.class);
        bVar.f219930J = photoPickerViewModel;
        bVar.f219929E = (y) photoPickerViewModel.f218831a0.t0(new c(bVar));
        PhotoPickerViewModel photoPickerViewModel2 = bVar.f219930J;
        bVar.ke((photoPickerViewModel2 != null ? photoPickerViewModel2 : null).f218829Y);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        this.f219923l0 = (com.avito.android.photo_picker.photo_panel.b) new P0(this).a(com.avito.android.photo_picker.photo_panel.b.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(((Boolean) this.f219924m0.getValue()).booleanValue() ? R.layout.fragment_photo_panel_re23 : R.layout.fragment_photo_panel, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.photo_picker.photo_panel.b bVar = this.f219923l0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.f219931K.removeObservers(getViewLifecycleOwner());
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f219919h0 = (TextView) view.findViewById(R.id.photo_counter);
        Button button = (Button) view.findViewById(R.id.main_button);
        this.f219920i0 = button;
        final int i12 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.photo_panel.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PhotoPanelFragment f219928c;

            {
                this.f219928c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        PhotoPanelFragment photoPanelFragment = this.f219928c;
                        b bVar = photoPanelFragment.f219923l0;
                        if (bVar == null) {
                            bVar = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel = bVar.f219930J;
                        if (photoPickerViewModel == null) {
                            photoPickerViewModel = null;
                        }
                        photoPickerViewModel.Ce();
                        PhotoPickerViewModel photoPickerViewModel2 = bVar.f219930J;
                        if (photoPickerViewModel2 == null) {
                            photoPickerViewModel2 = null;
                        }
                        photoPickerViewModel2.me();
                        Button button2 = photoPanelFragment.f219920i0;
                        if (button2 == null) {
                            button2 = null;
                        }
                        button2.setLoading(true);
                        Button button3 = photoPanelFragment.f219920i0;
                        (button3 != null ? button3 : null).setClickable(false);
                        break;
                    default:
                        b bVar2 = this.f219928c.f219923l0;
                        if (bVar2 == null) {
                            bVar2 = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel3 = bVar2.f219930J;
                        (photoPickerViewModel3 != null ? photoPickerViewModel3 : null).ue();
                        break;
                }
            }
        });
        this.f219918g0 = (TextView) view.findViewById(R.id.no_photo_selected);
        this.f219917f0 = (FrameLayout) view.findViewById(R.id.photo_count_container);
        final int i13 = 1;
        ((FrameLayout) view.findViewById(R.id.photos_container)).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_picker.photo_panel.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PhotoPanelFragment f219928c;

            {
                this.f219928c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        PhotoPanelFragment photoPanelFragment = this.f219928c;
                        b bVar = photoPanelFragment.f219923l0;
                        if (bVar == null) {
                            bVar = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel = bVar.f219930J;
                        if (photoPickerViewModel == null) {
                            photoPickerViewModel = null;
                        }
                        photoPickerViewModel.Ce();
                        PhotoPickerViewModel photoPickerViewModel2 = bVar.f219930J;
                        if (photoPickerViewModel2 == null) {
                            photoPickerViewModel2 = null;
                        }
                        photoPickerViewModel2.me();
                        Button button2 = photoPanelFragment.f219920i0;
                        if (button2 == null) {
                            button2 = null;
                        }
                        button2.setLoading(true);
                        Button button3 = photoPanelFragment.f219920i0;
                        (button3 != null ? button3 : null).setClickable(false);
                        break;
                    default:
                        b bVar2 = this.f219928c.f219923l0;
                        if (bVar2 == null) {
                            bVar2 = null;
                        }
                        PhotoPickerViewModel photoPickerViewModel3 = bVar2.f219930J;
                        (photoPickerViewModel3 != null ? photoPickerViewModel3 : null).ue();
                        break;
                }
            }
        });
        this.f219921j0 = (SimpleDraweeView) view.findViewById(R.id.top_photo);
        this.f219922k0 = (SimpleDraweeView) view.findViewById(R.id.bottom_photo);
        if (((Boolean) this.f219924m0.getValue()).booleanValue()) {
            ForegroundLinearLayout foregroundLinearLayout = (ForegroundLinearLayout) view.findViewById(R.id.shadow_layout);
            foregroundLinearLayout.f181408c.h(D6.i(28, requireContext()), new d(0, D6.i(1, requireContext()), 218103808, D6.i(3, requireContext())), new d(0, D6.i(4, requireContext()), 520093696, D6.i(24, requireContext())), true);
            foregroundLinearLayout.requestLayout();
        }
        com.avito.android.photo_picker.photo_panel.b bVar = this.f219923l0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.f219931K.observe(getViewLifecycleOwner(), new e(this, 8));
    }
}

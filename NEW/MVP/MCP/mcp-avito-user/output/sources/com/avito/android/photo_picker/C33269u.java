package com.avito.android.photo_picker;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_picker.gallery.GalleryPickerFragment;
import com.avito.android.photo_picker.legacy.InterfaceC33244f;
import com.avito.android.photo_picker.photo_panel.PhotoPanelFragment;
import com.avito.android.util.D6;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.u0;

/* compiled from: PhotoPickerActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/photo_picker/PhotoPickerViewModel$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_picker.u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33269u extends kotlin.jvm.internal.N implements Y41.l<PhotoPickerViewModel.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhotoPickerActivity f219940l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33269u(PhotoPickerActivity photoPickerActivity) {
        super(1);
        this.f219940l = photoPickerActivity;
    }

    @Override // Y41.l
    public final G0 invoke(PhotoPickerViewModel.b bVar) {
        PhotoPickerViewModel.b bVar2 = bVar;
        boolean z12 = bVar2 instanceof PhotoPickerViewModel.b.c;
        PhotoPickerActivity photoPickerActivity = this.f219940l;
        if (z12) {
            int i12 = PhotoPickerActivity.f218778C;
            PhotoPanelFragment.a aVar = PhotoPanelFragment.f219916n0;
            boolean zA2 = photoPickerActivity.a2();
            aVar.getClass();
            PhotoPanelFragment photoPanelFragmentA = PhotoPanelFragment.a.a(zA2);
            if (photoPickerActivity.a2()) {
                FrameLayout frameLayout = (FrameLayout) photoPickerActivity.findViewById(R.id.panel_fragment_container);
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                }
                CoordinatorLayout.g gVar = (CoordinatorLayout.g) layoutParams;
                ((ViewGroup.MarginLayoutParams) gVar).height = D6.i(112, photoPickerActivity);
                gVar.setMargins(0, 0, 0, 0);
                gVar.b(null);
                frameLayout.setLayoutParams(gVar);
            }
            androidx.fragment.app.H hE2 = photoPickerActivity.getSupportFragmentManager().e();
            hE2.n(R.id.panel_fragment_container, photoPanelFragmentA, "tag.photo_panel");
            hE2.e();
        } else if (bVar2 instanceof PhotoPickerViewModel.b.a) {
            int i13 = PhotoPickerActivity.f218778C;
            Fragment fragmentH = photoPickerActivity.getSupportFragmentManager().H("tag.photo_panel");
            if (fragmentH != null) {
                androidx.fragment.app.H hE3 = photoPickerActivity.getSupportFragmentManager().e();
                hE3.m(fragmentH);
                hE3.e();
            }
        } else if (bVar2 instanceof PhotoPickerViewModel.b.e) {
            int i14 = ((PhotoPickerViewModel.b.e) bVar2).f218856a;
            int i15 = PhotoPickerActivity.f218778C;
            if (!(photoPickerActivity.getSupportFragmentManager().G(R.id.fragment_container) instanceof GalleryPickerFragment) || !photoPickerActivity.a2()) {
                View viewFindViewById = photoPickerActivity.findViewById(R.id.snackbar_root);
                u0 u0Var = u0.f406856a;
                com.avito.android.component.snackbar.h.c(viewFindViewById, String.format(photoPickerActivity.getString(R.string.max_photo), Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1)), 0, null, null, null, null, 254);
            }
        } else if (bVar2 instanceof PhotoPickerViewModel.b.d) {
            InterfaceC33244f interfaceC33244f = photoPickerActivity.f218782n;
            (interfaceC33244f != null ? interfaceC33244f : null).a();
        } else if (bVar2 instanceof PhotoPickerViewModel.b.C6571b) {
            InterfaceC33244f interfaceC33244f2 = photoPickerActivity.f218782n;
            (interfaceC33244f2 != null ? interfaceC33244f2 : null).s();
        } else {
            kotlin.jvm.internal.L.f(bVar2, PhotoPickerViewModel.b.f.f218857a);
        }
        return G0.f406611a;
    }
}

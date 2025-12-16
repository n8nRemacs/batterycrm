package L91;

import aa1.C19854d;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.component.snackbar.d;
import com.avito.android.component.snackbar.e;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L;
import com.avito.android.permissions.t;
import com.avito.android.photo_picker.gallery.GalleryPickerFragment;
import com.avito.android.photo_picker.gallery.e;
import com.avito.android.photo_picker.photo_panel.PhotoPanelFragment;
import com.avito.android.photo_picker.photo_panel.b;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.h1;
import com.avito.android.theme_settings.ThemeSettingsFragment;
import com.avito.android.universal_map.map.UniversalMapFragment;
import com.avito.android.universal_map.map.pin_filters.j;
import com.avito.android.util.C35949t5;
import com.avito.android.vas_performance.ui.PerformanceVasFragment;
import com.facebook.drawee.view.SimpleDraweeView;
import da1.C39689a;
import ha1.C40906d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.I0;
import oa1.C44724c;
import q80.C47254a;
import r80.C47508a;
import r80.C47511d;
import ru.cyberity.cbr.core.domain.camera.CameraX;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class e implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9821c;

    public /* synthetic */ e(L l12, com.avito.android.home.navbar.f fVar) {
        this.f9820b = 6;
        this.f9821c = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v27 */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(Object obj) {
        G0 g02;
        G0 g03;
        boolean z12 = false;
        Object obj2 = this.f9821c;
        switch (this.f9820b) {
            case 0:
                ((d) obj2).invoke(obj);
                break;
            case 1:
                kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.document.camera.ui.n.f436424m0;
                ((k) obj2).invoke(obj);
                break;
            case 2:
                kotlin.reflect.n[] nVarArr2 = ru.mts.biometry.sdk.feature.main.ui.m.f436474l0;
                ((X91.j) obj2).invoke(obj);
                break;
            case 3:
                ((C19854d) obj2).invoke(obj);
                break;
            case 4:
                ((I0) obj2).w(obj);
                break;
            case 5:
                L.f(((com.avito.android.beduin.common.component.cart_icon.d) obj2).f100862b.getChildAt(0), (InterfaceC31171n) obj);
                break;
            case 6:
                L.f(((com.avito.android.home.navbar.f) obj2).f162454h, (InterfaceC31171n) obj);
                break;
            case 7:
                e.a aVar = (e.a) obj;
                GalleryPickerFragment.a aVar2 = GalleryPickerFragment.f219444C0;
                GalleryPickerFragment galleryPickerFragment = (GalleryPickerFragment) obj2;
                if (!(aVar instanceof e.a.h)) {
                    if (!(aVar instanceof e.a.f)) {
                        if (!(aVar instanceof e.a.C6600a)) {
                            if (!(aVar instanceof e.a.g)) {
                                if (!(aVar instanceof e.a.b)) {
                                    if (!(aVar instanceof e.a.c)) {
                                        if (!(aVar instanceof e.a.C6601e)) {
                                            if (aVar instanceof e.a.d) {
                                                kotlin.collections.builders.b bVarT = C42745f0.t();
                                                com.avito.android.permissions.t.f215141z.getClass();
                                                bVarT.add(t.a.f215144c);
                                                if (Build.VERSION.SDK_INT >= 33) {
                                                    bVarT.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
                                                }
                                                galleryPickerFragment.f219453l0.b((String[]) C42745f0.p(bVarT).toArray(new String[0]));
                                                break;
                                            }
                                        } else {
                                            PrintableText printableText = ((e.a.C6601e) aVar).f219516a;
                                            if (galleryPickerFragment.b5()) {
                                                galleryPickerFragment.d5();
                                            } else {
                                                C47508a c47508a = galleryPickerFragment.f219461t0;
                                                if (c47508a == null) {
                                                    c47508a = null;
                                                }
                                                c47508a.dismiss();
                                            }
                                            TextView textView = galleryPickerFragment.f219460s0;
                                            ?? r22 = textView;
                                            if (textView == null) {
                                                r22 = 0;
                                            }
                                            Context context = galleryPickerFragment.getContext();
                                            r22.setText(context != null ? printableText.k0(context) : 0);
                                            break;
                                        }
                                    } else {
                                        e.a.c cVar = (e.a.c) aVar;
                                        ArrayList arrayList = cVar.f219513a;
                                        com.avito.android.offlinization.ui.a aVar3 = new com.avito.android.offlinization.ui.a(galleryPickerFragment, 5);
                                        boolean zB5 = galleryPickerFragment.b5();
                                        ArrayList arrayList2 = cVar.f219514b;
                                        if (zB5) {
                                            C47511d c47511d = new C47511d(arrayList2, true);
                                            c47511d.f429638e = aVar3;
                                            RecyclerView recyclerView = galleryPickerFragment.f219465x0;
                                            if (recyclerView != null) {
                                                recyclerView.setAdapter(c47511d);
                                            }
                                        } else {
                                            C47508a c47508a2 = galleryPickerFragment.f219461t0;
                                            if (c47508a2 == null) {
                                                c47508a2 = null;
                                            }
                                            c47508a2.getClass();
                                            C47511d c47511d2 = new C47511d(arrayList2, z12, 2, );
                                            c47508a2.f429633b = c47511d2;
                                            RecyclerView recyclerView2 = c47508a2.f429632a;
                                            if (recyclerView2 != null) {
                                                recyclerView2.setAdapter(c47511d2);
                                            }
                                            C47508a c47508a3 = galleryPickerFragment.f219461t0;
                                            if (c47508a3 == null) {
                                                c47508a3 = null;
                                            }
                                            C47511d c47511d3 = c47508a3.f429633b;
                                            if (c47511d3 != null) {
                                                c47511d3.f429638e = aVar3;
                                            }
                                        }
                                        TextView textView2 = galleryPickerFragment.f219460s0;
                                        if (textView2 == null) {
                                            textView2 = null;
                                        }
                                        Context context2 = galleryPickerFragment.getContext();
                                        textView2.setText(context2 != null ? ((C47254a) arrayList2.get(0)).f429050b.k0(context2) : null);
                                        galleryPickerFragment.e5(arrayList);
                                        break;
                                    }
                                } else {
                                    RecyclerView recyclerView3 = galleryPickerFragment.f219466y0;
                                    if (recyclerView3 == null) {
                                        recyclerView3 = null;
                                    }
                                    recyclerView3.setVisibility(0);
                                    View view = galleryPickerFragment.f219455n0;
                                    (view != null ? view : null).setVisibility(8);
                                    break;
                                }
                            } else {
                                RecyclerView recyclerView4 = galleryPickerFragment.f219466y0;
                                if (recyclerView4 == null) {
                                    recyclerView4 = null;
                                }
                                recyclerView4.setVisibility(8);
                                View view2 = galleryPickerFragment.f219455n0;
                                (view2 != null ? view2 : null).setVisibility(0);
                                break;
                            }
                        } else {
                            ViewGroup viewGroup = galleryPickerFragment.f219456o0;
                            if (viewGroup == null) {
                                viewGroup = null;
                            }
                            viewGroup.setVisibility(8);
                            View view3 = galleryPickerFragment.f219457p0;
                            if (view3 == null) {
                                view3 = null;
                            }
                            view3.setVisibility(0);
                            RecyclerView recyclerView5 = galleryPickerFragment.f219466y0;
                            (recyclerView5 != null ? recyclerView5 : null).setVisibility(0);
                            TextView textView3 = galleryPickerFragment.f219464w0;
                            if (textView3 != null) {
                                textView3.setVisibility(0);
                                break;
                            }
                        }
                    } else {
                        String string = galleryPickerFragment.getString(((e.a.f) aVar).f219517a);
                        View view4 = galleryPickerFragment.f219462u0;
                        if (view4 == null) {
                            view4 = null;
                        }
                        if (view4 instanceof Button) {
                            ((Button) view4).setText(string);
                        } else if (view4 instanceof com.avito.android.lib.design.button.Button) {
                            ((com.avito.android.lib.design.button.Button) view4).setText(string);
                        }
                        ViewGroup viewGroup2 = galleryPickerFragment.f219456o0;
                        if (viewGroup2 == null) {
                            viewGroup2 = null;
                        }
                        viewGroup2.setVisibility(0);
                        RecyclerView recyclerView6 = galleryPickerFragment.f219466y0;
                        if (recyclerView6 == null) {
                            recyclerView6 = null;
                        }
                        recyclerView6.setVisibility(8);
                        View view5 = galleryPickerFragment.f219457p0;
                        (view5 != null ? view5 : null).setVisibility(8);
                        TextView textView4 = galleryPickerFragment.f219464w0;
                        if (textView4 != null) {
                            textView4.setVisibility(8);
                            break;
                        }
                    }
                } else {
                    galleryPickerFragment.e5(((e.a.h) aVar).f219519a);
                    break;
                }
                break;
            case 8:
                b.a aVar4 = (b.a) obj;
                PhotoPanelFragment.a aVar5 = PhotoPanelFragment.f219916n0;
                if (aVar4 instanceof b.a.C6611a) {
                    b.a.C6611a c6611a = (b.a.C6611a) aVar4;
                    int i12 = c6611a.f219932a;
                    PhotoPanelFragment photoPanelFragment = (PhotoPanelFragment) obj2;
                    if (i12 == 0) {
                        FrameLayout frameLayout = photoPanelFragment.f219917f0;
                        if (frameLayout == null) {
                            frameLayout = null;
                        }
                        frameLayout.setVisibility(8);
                        TextView textView5 = photoPanelFragment.f219918g0;
                        if (textView5 == null) {
                            textView5 = null;
                        }
                        textView5.setVisibility(0);
                    } else {
                        TextView textView6 = photoPanelFragment.f219919h0;
                        if (textView6 == null) {
                            textView6 = null;
                        }
                        u0 u0Var = u0.f406856a;
                        textView6.setText(String.format(photoPanelFragment.getResources().getString(R.string.photo_panel_count), Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1)));
                        Uri uri = c6611a.f219933b;
                        if (uri != null) {
                            SimpleDraweeView simpleDraweeView = photoPanelFragment.f219921j0;
                            if (simpleDraweeView == null) {
                                simpleDraweeView = null;
                            }
                            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                            aVarA.f(uri);
                            aVarA.c();
                            g02 = G0.f406611a;
                        } else {
                            g02 = null;
                        }
                        if (g02 == null) {
                            SimpleDraweeView simpleDraweeView2 = photoPanelFragment.f219921j0;
                            if (simpleDraweeView2 == null) {
                                simpleDraweeView2 = null;
                            }
                            C35949t5.a(simpleDraweeView2).b();
                        }
                        TextView textView7 = photoPanelFragment.f219918g0;
                        if (textView7 == null) {
                            textView7 = null;
                        }
                        textView7.setVisibility(8);
                        FrameLayout frameLayout2 = photoPanelFragment.f219917f0;
                        if (frameLayout2 == null) {
                            frameLayout2 = null;
                        }
                        frameLayout2.setVisibility(0);
                    }
                    if (!((Boolean) photoPanelFragment.f219924m0.getValue()).booleanValue()) {
                        Uri uri2 = c6611a.f219934c;
                        if (i12 != 0) {
                            if (uri2 != null) {
                                SimpleDraweeView simpleDraweeView3 = photoPanelFragment.f219922k0;
                                if (simpleDraweeView3 == null) {
                                    simpleDraweeView3 = null;
                                }
                                ImageRequest.a aVarA2 = C35949t5.a(simpleDraweeView3);
                                aVarA2.f(uri2);
                                aVarA2.c();
                                g03 = G0.f406611a;
                            } else {
                                g03 = null;
                            }
                            if (g03 == null) {
                                SimpleDraweeView simpleDraweeView4 = photoPanelFragment.f219922k0;
                                if (simpleDraweeView4 == null) {
                                    simpleDraweeView4 = null;
                                }
                                C35949t5.a(simpleDraweeView4).b();
                            }
                        }
                        SimpleDraweeView simpleDraweeView5 = photoPanelFragment.f219922k0;
                        (simpleDraweeView5 != null ? simpleDraweeView5 : null).setVisibility(uri2 != null ? 0 : 8);
                        break;
                    }
                }
                break;
            case 9:
                j.a aVar6 = (j.a) obj;
                UniversalMapFragment.a aVar7 = UniversalMapFragment.f304838X0;
                if (aVar6 != null) {
                    d.a.b(com.avito.android.component.snackbar.d.f125235c, (View) obj2, aVar6.f305746a, 0, new e.b(aVar6.f305747b), null, 0, null, null, 0, 0, 2032).b();
                    break;
                }
                break;
            case 10:
                com.avito.android.vas_performance.ui.recycler.g gVar = (com.avito.android.vas_performance.ui.recycler.g) obj;
                if (gVar != null) {
                    PerformanceVasFragment performanceVasFragment = (PerformanceVasFragment) obj2;
                    com.avito.konveyor.adapter.a aVar8 = performanceVasFragment.f321387o0;
                    if (aVar8 == null) {
                        aVar8 = null;
                    }
                    aVar8.c(new UV0.c(gVar.f321911a));
                    RecyclerView recyclerView7 = performanceVasFragment.f321393u0;
                    RecyclerView.Adapter adapter = (recyclerView7 != null ? recyclerView7 : null).getAdapter();
                    if (adapter != null) {
                        gVar.f321912b.b(adapter);
                        break;
                    }
                } else {
                    PerformanceVasFragment.a aVar9 = PerformanceVasFragment.f321384B0;
                    break;
                }
                break;
            case 11:
                C39689a c39689a = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436486m0;
                ((da1.i) obj2).invoke(obj);
                break;
            case 12:
                ThemeSettingsFragment.a aVar10 = ThemeSettingsFragment.f301289o0;
                UV0.c cVar2 = new UV0.c((List) obj);
                ThemeSettingsFragment themeSettingsFragment = (ThemeSettingsFragment) obj2;
                com.avito.konveyor.adapter.a aVar11 = themeSettingsFragment.f301291g0;
                if (aVar11 == null) {
                    aVar11 = null;
                }
                aVar11.c(cVar2);
                h1 h1Var = themeSettingsFragment.f301294j0;
                if (h1Var == null) {
                    h1Var = null;
                }
                h1Var.c(cVar2);
                Y0 y02 = themeSettingsFragment.f301296l0;
                if (y02 == null) {
                    y02 = null;
                }
                y02.c(cVar2);
                com.avito.konveyor.adapter.j jVar = themeSettingsFragment.f301290f0;
                (jVar != null ? jVar : null).notifyDataSetChanged();
                break;
            case 13:
                ((C40906d) obj2).invoke(obj);
                break;
            case 14:
                ((ha1.l) obj2).invoke(obj);
                break;
            case 15:
                kotlin.reflect.n[] nVarArr3 = ru.mts.biometry.sdk.feature.registration.ui.camera.h.f436507m0;
                ((C44724c) obj2).invoke(obj);
                break;
            case 16:
                CameraX.a((CameraX) obj2, (PreviewView.StreamState) obj);
                break;
            case 17:
                ((ta1.f) obj2).invoke(obj);
                break;
            default:
                ((ta1.g) obj2).invoke(obj);
                break;
        }
    }

    public /* synthetic */ e(Object obj, int i12) {
        this.f9820b = i12;
        this.f9821c = obj;
    }
}

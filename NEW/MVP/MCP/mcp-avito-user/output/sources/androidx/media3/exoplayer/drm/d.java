package androidx.media3.exoplayer.drm;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.H;
import androidx.media3.exoplayer.drm.f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.multiprocess.AbstractC23623d;
import androidx.work.multiprocess.BinderC23624e;
import androidx.work.multiprocess.InterfaceC23622c;
import com.avito.android.R;
import com.avito.android.mortgage.person_form.MortgagePersonFormFragment;
import com.avito.android.mortgage.person_form.model.PersonFormArguments;
import com.avito.android.photo_gallery_carousel.gallery_view.CarouselPhotoGalleryView;
import com.avito.android.short_term_rent.bookingform.page.j;
import com.avito.android.util.K2;
import com.google.android.exoplayer2.drm.e;
import com.yandex.mobile.ads.exo.drm.f;
import java.io.Serializable;
import java.util.List;
import kotlinx.coroutines.N0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49105b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f49106c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f49107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f49108e;

    public /* synthetic */ d(int i12, RecyclerView recyclerView, com.avito.android.bxcontent.utils.e eVar) {
        this.f49105b = 3;
        this.f49106c = i12;
        this.f49107d = recyclerView;
        this.f49108e = eVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.media3.exoplayer.drm.f, com.google.android.exoplayer2.drm.e, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i12 = this.f49106c;
        ?? r22 = this.f49108e;
        Object obj = this.f49107d;
        switch (this.f49105b) {
            case 0:
                f.a aVar = (f.a) obj;
                int i13 = aVar.f49112a;
                r22.getClass();
                r22.A(i13, aVar.f49113b, i12);
                break;
            case 1:
                ((androidx.profileinstaller.b) obj).f53600b.b(i12, (Serializable) r22);
                break;
            case 2:
                byte[] bArr = BinderC23624e.f56142u;
                ((N0) obj).c(new WorkerStoppedException(i12));
                AbstractC23623d.a.b((InterfaceC23622c) r22, BinderC23624e.f56142u);
                break;
            case 3:
                int i14 = com.avito.android.bxcontent.utils.e.f113026g;
                boolean z12 = i12 == 0;
                RecyclerView recyclerView = (RecyclerView) obj;
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                boolean z13 = (adapter != null ? adapter.getItemCount() : 0) > 0;
                if (recyclerView.isLaidOut() && z12 && z13) {
                    recyclerView.A0(0);
                    ((com.avito.android.bxcontent.utils.e) r22).f113028b.reset();
                    break;
                }
                break;
            case 4:
                MortgagePersonFormFragment.a aVar2 = MortgagePersonFormFragment.f200441y0;
                String canonicalName = MortgagePersonFormFragment.class.getCanonicalName();
                MortgagePersonFormFragment mortgagePersonFormFragment = (MortgagePersonFormFragment) obj;
                PersonFormArguments personFormArgumentsQ5 = mortgagePersonFormFragment.q5();
                PersonFormArguments personFormArguments = new PersonFormArguments(personFormArgumentsQ5.f200852b, (List) r22, this.f49106c, personFormArgumentsQ5.f200855e, personFormArgumentsQ5.f200856f, personFormArgumentsQ5.f200857g, personFormArgumentsQ5.f200858h);
                H hE2 = mortgagePersonFormFragment.getParentFragmentManager().e();
                MortgagePersonFormFragment.f200441y0.getClass();
                hE2.n(R.id.container, MortgagePersonFormFragment.a.a(personFormArguments), null);
                hE2.c(canonicalName);
                hE2.e();
                break;
            case 5:
                CarouselPhotoGalleryView.b((CarouselPhotoGalleryView) obj, i12, (List) r22);
                break;
            case 6:
                j.a aVar3 = ((com.avito.android.short_term_rent.bookingform.page.j) obj).f282043d;
                aVar3.f53878a = i12;
                RecyclerView.m layoutManager = ((RecyclerView) r22).getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.x1(aVar3);
                    break;
                }
                break;
            case 7:
                K2.l((View) obj, (InputMethodManager) r22, i12 - 1);
                break;
            case 8:
                e.a aVar4 = (e.a) obj;
                int i15 = aVar4.f344336a;
                r22.getClass();
                r22.e(i15, aVar4.f344337b, i12);
                break;
            default:
                ((f.a) obj).a((com.yandex.mobile.ads.exo.drm.f) r22, i12);
                break;
        }
    }

    public /* synthetic */ d(androidx.profileinstaller.b bVar, int i12, Serializable serializable) {
        this.f49105b = 1;
        this.f49107d = bVar;
        this.f49106c = i12;
        this.f49108e = serializable;
    }

    public /* synthetic */ d(Object obj, int i12, Object obj2, int i13) {
        this.f49105b = i13;
        this.f49107d = obj;
        this.f49106c = i12;
        this.f49108e = obj2;
    }

    public /* synthetic */ d(Object obj, Object obj2, int i12, int i13) {
        this.f49105b = i13;
        this.f49107d = obj;
        this.f49108e = obj2;
        this.f49106c = i12;
    }
}

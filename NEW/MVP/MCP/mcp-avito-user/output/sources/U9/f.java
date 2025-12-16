package U9;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.compose.ui.platform.AndroidComposeView;
import com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.AdProfilePromoGalleryViewHolderImpl;
import com.avito.android.advertising.adapter.items.buzzoola.media_x2.k;
import com.avito.android.gig_apply.ui.s;
import com.avito.android.mortgage.root.list.items.navigation.l;
import com.avito.beduin.v2.render.android_view.J;
import com.avito.beduin.v2.render.android_view.K;
import kotlin.G0;
import pH.i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class f implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16228b;

    public /* synthetic */ f(Object obj, int i12) {
        this.f16227a = i12;
        this.f16228b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        Object obj = this.f16228b;
        switch (this.f16227a) {
            case 0:
                g gVar = (g) obj;
                gVar.f16231c.setVisibility(gVar.f16229a.getScrollY() <= 0 ? 8 : 0);
                break;
            case 1:
                AndroidComposeView.a aVar = AndroidComposeView.f40963H0;
                ((AndroidComposeView) obj).P();
                break;
            case 2:
                io.reactivex.rxjava3.subjects.b<G0> bVar = ((AdProfilePromoGalleryViewHolderImpl) obj).f87221n;
                if (bVar != null) {
                    bVar.onNext(G0.f406611a);
                    break;
                }
                break;
            case 3:
                int i12 = k.f87352k;
                ((k) obj).B80();
                break;
            case 4:
                s sVar = (s) obj;
                ScrollView scrollView = sVar.f160037R;
                if (scrollView.getChildAt(0).getBottom() == scrollView.getScrollY() + scrollView.getHeight()) {
                    sVar.f160047b.accept(i.v.f428373a);
                    break;
                }
                break;
            case 5:
                int i13 = l.f202721g;
                ((l) obj).B80();
                break;
            default:
                K k12 = (K) obj;
                k12.getClass();
                k12.f337927a.post(new J(k12, 0));
                break;
        }
    }
}

package Yt;

import Xt.InterfaceC17045a;
import Xt.h;
import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.video_snippets.g;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CircularGalleryVideoViewProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYt/e;", "LYt/c;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final g f19716b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final l41.g<com.avito.android.video_snippets.b> f19717c;

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // Yt.c
    @k
    public final View a(@k ViewPager viewPager, @k InterfaceC17045a interfaceC17045a) {
        View viewInflate = LayoutInflater.from(viewPager.getContext()).inflate(R.layout.constructor_advert_video_page, (ViewGroup) viewPager, false);
        h hVar = (h) interfaceC17045a;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewInflate.findViewById(R.id.thumbnail_view);
        viewPager.addView(viewInflate);
        if (hVar.getThumbnail() != null) {
            D6.H(simpleDraweeView);
        }
        com.avito.android.image_loader.k thumbnail = hVar.getThumbnail();
        if (thumbnail != null) {
            Drawable drawableA = d.a.a(new com.avito.android.image_loader.e().a(simpleDraweeView.getContext()), simpleDraweeView.getContext(), hVar.getThumbnail(), null, null, 28);
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(thumbnail);
            aVarA.f169501s = drawableA;
            aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
            aVarA.c();
        }
        g gVar = this.f19716b;
        if (gVar != null) {
            gVar.a(hVar.getF19114b());
            String f19113a = hVar.getF19113a();
            if (f19113a == null) {
                f19113a = hVar.getF19114b();
            }
            gVar.b(f19113a, hVar.getThumbnail() != null, simpleDraweeView, this.f19717c);
        }
        return viewInflate;
    }

    public e(@l g gVar, @l l41.g<com.avito.android.video_snippets.b> gVar2) {
        this.f19716b = gVar;
        this.f19717c = gVar2;
    }

    public /* synthetic */ e(g gVar, l41.g gVar2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : gVar, (i12 & 2) != 0 ? null : gVar2);
    }
}

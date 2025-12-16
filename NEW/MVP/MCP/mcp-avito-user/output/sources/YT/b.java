package Yt;

import Xt.InterfaceC17045a;
import Y61.k;
import Y61.l;
import Yt.c;
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

/* compiled from: CircularGalleryExtendedVideoViewProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYt/b;", "LYt/c;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements c {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19708b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final g f19709c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final l41.g<com.avito.android.video_snippets.b> f19710d;

    public b() {
        this(false, null, null, 7, null);
    }

    @Override // Yt.c
    @k
    public final View a(@k ViewPager viewPager, @k InterfaceC17045a interfaceC17045a) {
        View viewInflate = LayoutInflater.from(viewPager.getContext()).inflate(R.layout.constructor_advert_extended_video_page, (ViewGroup) viewPager, false);
        Xt.c cVar = (Xt.c) interfaceC17045a;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewInflate.findViewById(R.id.thumbnail_view);
        viewPager.addView(viewInflate);
        D6.H(simpleDraweeView);
        com.avito.android.image_loader.a aVar = cVar.f19115c;
        Drawable drawableA = d.a.a(new com.avito.android.image_loader.e().a(simpleDraweeView.getContext()), simpleDraweeView.getContext(), aVar, null, null, 28);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(aVar);
        aVarA.f169501s = drawableA;
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.c();
        g gVar = this.f19709c;
        if (gVar != null) {
            String str = cVar.f19114b;
            gVar.a(str);
            String str2 = cVar.f19113a;
            if (str2 != null) {
                str = str2;
            }
            gVar.b(str, true, simpleDraweeView, this.f19710d);
        }
        c.f19711a.getClass();
        c.a.a(viewInflate, cVar.f19116d, this.f19708b);
        return viewInflate;
    }

    public b(boolean z12, @l g gVar, @l l41.g<com.avito.android.video_snippets.b> gVar2) {
        this.f19708b = z12;
        this.f19709c = gVar;
        this.f19710d = gVar2;
    }

    public /* synthetic */ b(boolean z12, g gVar, l41.g gVar2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? null : gVar, (i12 & 4) != 0 ? null : gVar2);
    }
}

package Yt;

import Xt.InterfaceC17045a;
import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.image_loader.From;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.lib.util.v;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import j.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CircularGalleryPictureViewProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYt/d;", "LYt/c;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public final int f19713b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19714c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f19715d;

    public d(@I int i12, boolean z12, @l Integer num) {
        this.f19713b = i12;
        this.f19714c = z12;
        this.f19715d = num;
    }

    @Override // Yt.c
    @k
    public final View a(@k ViewPager viewPager, @k InterfaceC17045a interfaceC17045a) {
        View viewInflate = LayoutInflater.from(viewPager.getContext()).inflate(this.f19713b, (ViewGroup) viewPager, false);
        Xt.d dVar = (Xt.d) interfaceC17045a;
        com.avito.android.image_loader.k f19117a = dVar.getF19117a();
        Drawable drawableA = d.a.a(new com.avito.android.image_loader.e().a(viewPager.getContext()), viewPager.getContext(), f19117a, dVar.getF19118b() ? From.f169444d : From.f169443c, this.f19715d, 16);
        View viewFindViewById = viewInflate.findViewById(R.id.image_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
        if (this.f19715d != null) {
            v.a(viewInflate, r2.intValue());
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f169500r = this.f19714c;
        aVarA.d(f19117a);
        aVarA.f169501s = drawableA;
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.c();
        viewPager.addView(viewInflate);
        return viewInflate;
    }

    public /* synthetic */ d(int i12, boolean z12, Integer num, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? true : z12, (i13 & 4) != 0 ? null : num);
    }
}

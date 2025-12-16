package Yt;

import Xt.InterfaceC17045a;
import Y61.k;
import Y61.l;
import Yt.c;
import android.content.Context;
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
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CircularGalleryExtendedPictureViewProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYt/a;", "LYt/c;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18324a implements c {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19706b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f19707c;

    /* JADX WARN: Multi-variable type inference failed */
    public C18324a() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // Yt.c
    @k
    public final View a(@k ViewPager viewPager, @k InterfaceC17045a interfaceC17045a) {
        View viewInflate = LayoutInflater.from(viewPager.getContext()).inflate(R.layout.constructor_advert_extended_image_page, (ViewGroup) viewPager, false);
        Xt.b bVar = (Xt.b) interfaceC17045a;
        From from = bVar.f19111b ? From.f169444d : From.f169443c;
        com.avito.android.image_loader.d dVarA = new com.avito.android.image_loader.e().a(viewPager.getContext());
        Context context = viewPager.getContext();
        Integer num = this.f19707c;
        com.avito.android.image_loader.k kVar = bVar.f19110a;
        Drawable drawableA = d.a.a(dVarA, context, kVar, from, num, 16);
        if (this.f19707c != null) {
            v.a(viewInflate, r3.intValue());
        }
        View viewFindViewById = viewInflate.findViewById(R.id.image_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        ImageRequest.a aVarA = C35949t5.a((SimpleDraweeView) viewFindViewById);
        boolean z12 = this.f19706b;
        aVarA.f169500r = z12;
        aVarA.d(kVar);
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.c();
        viewInflate.setForeground(drawableA);
        c.f19711a.getClass();
        c.a.a(viewInflate, bVar.f19112c, z12);
        viewPager.addView(viewInflate);
        return viewInflate;
    }

    public C18324a(boolean z12, @l Integer num) {
        this.f19706b = z12;
        this.f19707c = num;
    }

    public /* synthetic */ C18324a(boolean z12, Integer num, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? null : num);
    }
}

package com.avito.android.advert.item.auto_media.preview;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.drawable.s;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoMediaPreviewView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/auto_media/preview/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/auto_media/preview/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f72955b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f72956c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f72957d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f72958e;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.article_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f72955b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.article_tag);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f72956c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.article_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f72957d = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.article_video_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f72958e = viewFindViewById4;
    }

    @Override // com.avito.android.advert.item.auto_media.preview.f
    public final void QF(boolean z12) {
        D6.G(this.f72958e, z12);
    }

    @Override // com.avito.android.advert.item.auto_media.preview.f
    public final void S(@l Y41.a<G0> aVar) {
        D6.a(aVar, this.itemView);
    }

    @Override // com.avito.android.advert.item.auto_media.preview.f
    public final void WL(@l String str) {
        I5.a(this.f72956c, str, false);
    }

    @Override // com.avito.android.advert.item.auto_media.preview.f
    public final void b(@k String str) {
        I5.a(this.f72955b, str, false);
    }

    @Override // com.avito.android.advert.item.auto_media.preview.f
    public final void m20(boolean z12) {
        s.c cVar = z12 ? s.c.f340133e : s.c.f340137i;
        SimpleDraweeView simpleDraweeView = this.f72957d;
        GW0.a hierarchy = simpleDraweeView.getHierarchy();
        if (L.f(!(hierarchy.k(2) instanceof r) ? null : hierarchy.l(2).f340122f, cVar)) {
            return;
        }
        simpleDraweeView.getHierarchy().n(cVar);
    }

    @Override // com.avito.android.advert.item.auto_media.preview.f
    public final void z1(@k Image image) {
        SimpleDraweeView simpleDraweeView = this.f72957d;
        Uri uriD = C35829k2.c(image, simpleDraweeView, 1, 22).d();
        if (uriD == null) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uriD);
        aVarA.c();
    }
}

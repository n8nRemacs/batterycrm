package com.avito.android.advert_collection_list.adapter.advert_collection;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_collection_list.adapter.advert_collection.AdvertCollectionItem;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCollectionView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection_list/adapter/advert_collection/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_collection_list/adapter/advert_collection/i;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f82062l = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f82063b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f82064c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f82065d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f82066e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageButton f82067f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.image_loader.d f82068g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f82069h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final DockingBadge f82070i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SimpleDraweeView f82071j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f82072k;

    public j(@k View view) {
        super(view);
        this.f82063b = view;
        View viewFindViewById = view.findViewById(R.id.collectionTitle);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f82064c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.collectionSize);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f82065d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById3;
        this.f82066e = simpleDraweeView;
        View viewFindViewById4 = view.findViewById(R.id.more_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f82067f = (ImageButton) viewFindViewById4;
        this.f82068g = new com.avito.android.image_loader.e().a(view.getContext());
        View viewFindViewById5 = view.findViewById(R.id.collectionDescription);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f82069h = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.moderationStatusBadge);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.docking_badge.DockingBadge");
        }
        this.f82070i = (DockingBadge) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.authorAvatarImage);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f82071j = (SimpleDraweeView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.authorName);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f82072k = (TextView) viewFindViewById8;
        Drawable drawableH = C35835l0.h(R.attr.ic_camera36, view.getContext());
        if (drawableH != null) {
            drawableH.setTint(C35835l0.d(R.attr.gray16, view.getContext()));
        }
        GW0.a hierarchy = simpleDraweeView.getHierarchy();
        s.a aVar = (s.a) s.c.f340135g;
        hierarchy.o(drawableH, 5);
        hierarchy.l(5).r(aVar);
    }

    @Override // com.avito.android.advert_collection_list.adapter.advert_collection.i
    public final void L0(@l Y41.a<G0> aVar) {
        this.f82063b.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(3, aVar));
    }

    @Override // com.avito.android.advert_collection_list.adapter.advert_collection.i
    public final void TM(@l AdvertCollectionItem.AuthorInfo authorInfo) {
        String str;
        Image image;
        int i12 = (authorInfo != null ? authorInfo.f82043c : null) != null ? 0 : 8;
        TextView textView = this.f82072k;
        textView.setVisibility(i12);
        this.f82071j.setVisibility((authorInfo != null ? authorInfo.f82042b : null) == null ? 8 : 0);
        if (authorInfo == null || (str = authorInfo.f82043c) == null) {
            str = "";
        }
        textView.setText(str);
        if (authorInfo == null || (image = authorInfo.f82042b) == null) {
            return;
        }
        C35949t5.c(this.f82071j, com.avito.android.image_loader.b.b(image), null, null, null, 14);
    }

    @Override // com.avito.android.advert_collection_list.adapter.advert_collection.i
    public final void aX(@l AdvertCollectionItem.ModerationStatusInfo moderationStatusInfo) {
        int i12 = moderationStatusInfo != null ? 0 : 8;
        DockingBadge dockingBadge = this.f82070i;
        dockingBadge.setVisibility(i12);
        String str = moderationStatusInfo != null ? moderationStatusInfo.f82044b : null;
        if (str == null) {
            str = "";
        }
        dockingBadge.setText(str);
        String str2 = moderationStatusInfo != null ? moderationStatusInfo.f82045c : null;
        Integer numA = com.avito.android.lib.util.e.a(str2 != null ? str2 : "");
        if (numA != null) {
            dockingBadge.setBadgeColor(C35835l0.d(numA.intValue(), dockingBadge.getContext()));
        }
    }

    @Override // com.avito.android.advert_collection_list.adapter.advert_collection.i
    public final void ea(@l Y41.a<G0> aVar) {
        this.f82067f.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(2, aVar));
    }

    @Override // com.avito.android.advert_collection_list.adapter.advert_collection.i
    public final void h(@k String str) {
        I5.a(this.f82069h, str, false);
    }

    @Override // com.avito.android.advert_collection_list.adapter.advert_collection.i
    public final void setTitle(@k String str) {
        I5.a(this.f82064c, str, false);
    }

    @Override // com.avito.android.advert_collection_list.adapter.advert_collection.i
    public final void v6(@k String str) {
        I5.a(this.f82065d, str, false);
    }

    @Override // com.avito.android.advert_collection_list.adapter.advert_collection.i
    public final void x(@k com.avito.android.image_loader.k kVar) {
        Drawable drawableA = d.a.a(this.f82068g, this.f82063b.getContext(), kVar, null, null, 28);
        ImageRequest.a aVarA = C35949t5.a(this.f82066e);
        aVarA.d(kVar);
        aVarA.f169501s = drawableA;
        aVarA.c();
    }
}

package com.avito.android.feed_shortcuts.element;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FeedShortcutsWidgetElementItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/feed_shortcuts/element/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/feed_shortcuts/element/e;", "_avito_bx-content_widget_feed-shortcuts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f157685g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f157686b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f157687c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f157688d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f157689e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f157690f;

    public g(@k View view) {
        super(view);
        this.f157686b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f157687c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f157688d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f157689e = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.img_skeleton);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f157690f = viewFindViewById4;
    }

    @Override // com.avito.android.feed_shortcuts.element.e
    public final void hP(@k FeedShortcutsWidgetElementItem feedShortcutsWidgetElementItem, @k com.avito.android.feed_shortcuts.widget.g gVar, int i12) {
        this.f157687c.setText(feedShortcutsWidgetElementItem.getTitle());
        this.f157688d.setText(feedShortcutsWidgetElementItem.getSubtitle());
        UniversalImage image = feedShortcutsWidgetElementItem.getImage();
        View view = this.f157686b;
        Image imageG = image != null ? l.g(view, image) : null;
        if (imageG != null) {
            ImageRequest.a aVar = new ImageRequest.a(new DM.a(this.f157689e));
            aVar.d(com.avito.android.image_loader.b.b(imageG));
            aVar.f169491i = true;
            aVar.e(y6.b(16));
            aVar.f169490h = new f(this);
            aVar.c();
        }
        view.setOnClickListener(new C(gVar, feedShortcutsWidgetElementItem, i12, 5));
    }
}

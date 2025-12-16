package com.avito.android.rubricator.list.service.item;

import Y41.l;
import Y61.k;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.image_loader.p;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.rubricator.list.service.model.ServiceListItem;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ServiceItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rubricator/list/service/item/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rubricator/list/service/item/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f256002g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RelativeLayout f256003b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f256004c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f256005d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f256006e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f256007f;

    public i(@k View view) {
        super(view);
        this.f256003b = (RelativeLayout) view.findViewById(R.id.service_list_item_root);
        this.f256004c = (SimpleDraweeView) view.findViewById(R.id.icon);
        this.f256005d = (SimpleDraweeView) view.findViewById(R.id.image);
        this.f256006e = (TextView) view.findViewById(R.id.title);
        this.f256007f = (TextView) view.findViewById(R.id.subtitle);
    }

    @Override // com.avito.android.rubricator.list.service.item.h
    public final void NP(@k ServiceListItem serviceListItem, @k l<? super DeepLink, G0> lVar) {
        Uri uri = serviceListItem.f256011c;
        SimpleDraweeView simpleDraweeView = this.f256004c;
        if (uri == null) {
            D6.w(simpleDraweeView);
        } else {
            simpleDraweeView.setColorFilter(new PorterDuffColorFilter(C35835l0.d(R.attr.black, simpleDraweeView.getContext()), PorterDuff.Mode.SRC_IN));
            C35949t5.c(this.f256004c, new p(uri), null, null, null, 14);
            D6.H(simpleDraweeView);
        }
        SimpleDraweeView simpleDraweeView2 = this.f256005d;
        UniversalImage universalImage = serviceListItem.f256015g;
        if (universalImage == null) {
            D6.w(simpleDraweeView2);
        } else {
            simpleDraweeView2.e(C35829k2.c(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView2.getContext())), simpleDraweeView2, 0, 30).d());
            D6.H(simpleDraweeView2);
        }
        I5.a(this.f256006e, serviceListItem.f256012d, false);
        I5.a(this.f256007f, serviceListItem.f256013e, false);
        this.f256003b.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(21, (Object) lVar, (Object) serviceListItem));
    }
}

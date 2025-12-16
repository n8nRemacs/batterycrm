package com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.p;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: ItemsListSnippetView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/snippet/b;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/snippet/a;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends com.avito.konveyor.adapter.b implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a.C5742a f194003b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f194004c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f194005d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f194006e;

    /* renamed from: f, reason: collision with root package name */
    public final DockingBadgeContainer f194007f;

    /* renamed from: g, reason: collision with root package name */
    public final SimpleDraweeView f194008g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Drawable f194009h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public Y41.a<G0> f194010i;

    public b(@k View view, @k a.C5742a c5742a) {
        super(view);
        this.f194003b = c5742a;
        Context context = view.getContext();
        this.f194004c = (TextView) view.findViewById(R.id.platform_items_list_snippet_title);
        this.f194005d = (TextView) view.findViewById(R.id.platform_items_list_snippet_price);
        this.f194006e = (TextView) view.findViewById(R.id.platform_items_list_snippet_location);
        this.f194007f = (DockingBadgeContainer) view.findViewById(R.id.platform_items_list_snippet_badge_container);
        this.f194008g = (SimpleDraweeView) view.findViewById(R.id.platform_items_list_snippet_image);
        this.f194009h = C43852a.a(context, R.drawable.ic_messenger_item_no_image);
        view.setOnClickListener(new ViewOnClickListenerC31873b(this, 5));
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.a
    public final void V(@l String str) {
        I5.a(this.f194006e, str, false);
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.a
    public final void a(@k Y41.a<G0> aVar) {
        this.f194010i = aVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.a
    public final void p(@k String str) {
        I5.a(this.f194005d, str, false);
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.a
    public final void setTitle(@k String str) {
        I5.a(this.f194004c, str, false);
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.a
    public final void wI(boolean z12) {
        DockingBadgeContainer dockingBadgeContainer = this.f194007f;
        if (!z12) {
            D6.w(dockingBadgeContainer);
            return;
        }
        D6.H(dockingBadgeContainer);
        a.C5742a c5742a = this.f194003b;
        dockingBadgeContainer.setSize(c5742a.f194002b);
        dockingBadgeContainer.setBadgeItems(c5742a.f194001a);
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.a
    public final void z2(@l Image image) {
        Map<Size, Uri> variants;
        Set<Map.Entry<Size, Uri>> setEntrySet;
        Object next;
        SimpleDraweeView simpleDraweeView = this.f194008g;
        Uri uriD = C35829k2.c(image, simpleDraweeView, 0, 30).d();
        if (uriD == null) {
            uriD = null;
            if (image != null && (variants = image.getVariants()) != null && (setEntrySet = variants.entrySet()) != null) {
                Iterator<T> it = setEntrySet.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int iArea = ((Size) ((Map.Entry) next).getKey()).area();
                        do {
                            Object next2 = it.next();
                            int iArea2 = ((Size) ((Map.Entry) next2).getKey()).area();
                            if (iArea < iArea2) {
                                next = next2;
                                iArea = iArea2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    uriD = (Uri) entry.getValue();
                }
            }
            if (uriD == null) {
                uriD = Uri.EMPTY;
            }
        }
        C35949t5.c(simpleDraweeView, new p(uriD), this.f194009h, null, null, 12);
    }
}

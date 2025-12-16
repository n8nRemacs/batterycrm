package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.a;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: FeesMethodsV2FeesMethodItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/fees_method/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/fees_method/h;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f158374j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f158375b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DockingBadgeContainer f158376c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f158377d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f158378e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f158379f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f158380g;

    /* renamed from: h, reason: collision with root package name */
    public final int f158381h;

    /* renamed from: i, reason: collision with root package name */
    public final int f158382i;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f158375b = aVar;
        View viewFindViewById = view.findViewById(R.id.fees_methods_v2_fees_method_badge_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.docking_badge.DockingBadgeContainer");
        }
        this.f158376c = (DockingBadgeContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.fees_methods_v2_fees_method_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f158377d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.fees_methods_v2_fees_method_price);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f158378e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.fees_methods_v2_fees_method_description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f158379f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.fees_methods_v2_fees_method_icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f158380g = (SimpleDraweeView) viewFindViewById5;
        this.f158381h = y6.b(4);
        this.f158382i = y6.b(6);
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.h
    public final void A5(@l wZ.l lVar) {
        C35949t5.c(this.f158380g, com.avito.android.image_loader.b.b(lVar != null ? lVar.a(this.itemView.getContext()) : null), null, null, null, 14);
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.h
    public final void L(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f158378e, attributedText, this.f158375b);
        D6.c(this.f158379f, null, Integer.valueOf(attributedText == null ? this.f158381h : this.f158382i), null, null, 13);
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.h
    public final void g(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f158379f, attributedText, this.f158375b);
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.h
    public final void setListener(@k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(29, aVar));
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.h
    public final void setTitle(@k String str) {
        this.f158377d.setText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.avito.android.lib.design.docking_badge.DockingBadgeContainer] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.h
    public final void t0(@l List<a.C4627a> list) {
        ?? arrayList;
        if (list != null) {
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (a.C4627a c4627a : list) {
                Context context = this.itemView.getContext();
                String str = c4627a.f158361a;
                DockingBadgeType customColors = c4627a.f158362b;
                if (customColors == null) {
                    customColors = new DockingBadgeType.CustomColors(com.avito.android.lib.util.f.f(context, "greenMedium"), null, null, null, null, 30, null);
                }
                DockingBadgeType dockingBadgeType = customColors;
                DockingBadgeEdgeType dockingBadgeEdgeType = c4627a.f158363c;
                if (dockingBadgeEdgeType == null) {
                    dockingBadgeEdgeType = DockingBadgeEdgeType.Flag;
                }
                DockingBadgeEdgeType dockingBadgeEdgeType2 = dockingBadgeEdgeType;
                DockingBadgeEdgeType dockingBadgeEdgeType3 = c4627a.f158364d;
                if (dockingBadgeEdgeType3 == null) {
                    dockingBadgeEdgeType3 = DockingBadgeEdgeType.Pipka;
                }
                arrayList.add(new DockingBadgeItem(str, dockingBadgeType, dockingBadgeEdgeType2, dockingBadgeEdgeType3, null, 16, null));
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        ?? r12 = this.f158376c;
        r12.setBadgeItems(arrayList);
        D6.G(r12, !((Collection) arrayList).isEmpty());
    }
}

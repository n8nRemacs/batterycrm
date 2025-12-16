package com.avito.android.publish.slots.delivery_all_toggles.item;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryAllTogglesFeaturesAdapter.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_all_toggles/item/d;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/publish/slots/delivery_all_toggles/item/d$a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<s> f243492c;

    /* compiled from: DeliveryAllTogglesFeaturesAdapter.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_all_toggles/item/d$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SimpleDraweeView f243493b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f243494c;

        public a(@Y61.k View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.all_toggles_features_item_icon);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
            }
            this.f243493b = (SimpleDraweeView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.all_toggles_features_item_label);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f243494c = (TextView) viewFindViewById2;
        }
    }

    public d(@Y61.k List<s> list) {
        this.f243492c = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f243492c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        a aVar = (a) c12;
        s sVar = this.f243492c.get(i12);
        C35949t5.c(aVar.f243493b, com.avito.android.image_loader.b.b(sVar.f243547a), null, null, null, 14);
        aVar.f243494c.setText(sVar.f243548b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new a(C0.b(viewGroup, R.layout.delivery_all_toggles_feature_item, viewGroup, false));
    }
}

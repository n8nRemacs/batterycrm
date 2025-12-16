package com.avito.android.serp.adapter.model_card.item;

import Y41.q;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ModelCardWidgetItemAdapter.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/model_card/item/a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/serp/adapter/model_card/item/a$b;", "b", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public q<? super String, ? super Integer, ? super DeepLink, G0> f270422c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<ModelCardWidgetItem> f270423d;

    /* compiled from: ModelCardWidgetItemAdapter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lcom/avito/android/deep_linking/links/DeepLink;", "<anonymous parameter 2>", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;ILcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.model_card.item.a$a, reason: collision with other inner class name */
    public static final class C8060a extends N implements q<String, Integer, DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8060a f270424l = new C8060a();

        public C8060a() {
            super(3);
        }

        @Override // Y41.q
        public final /* bridge */ /* synthetic */ G0 invoke(String str, Integer num, DeepLink deepLink) {
            num.intValue();
            return G0.f406611a;
        }
    }

    /* compiled from: ModelCardWidgetItemAdapter.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/model_card/item/a$b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final View f270425b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final TextView f270426c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final TextView f270427d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final SimpleDraweeView f270428e;

        public b(@k View view) {
            super(view);
            this.f270425b = view.getRootView();
            View viewFindViewById = view.findViewById(R.id.title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f270426c = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.price);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f270427d = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.image);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
            }
            this.f270428e = (SimpleDraweeView) viewFindViewById3;
        }
    }

    public a() {
        this(null, null, 3, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f270423d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        b bVar = (b) c12;
        ModelCardWidgetItem modelCardWidgetItem = this.f270423d.get(i12);
        bVar.f270426c.setText(modelCardWidgetItem.f270418b);
        bVar.f270427d.setText(modelCardWidgetItem.f270420d);
        SimpleDraweeView simpleDraweeView = bVar.f270428e;
        UniversalImage universalImage = modelCardWidgetItem.f270421e;
        if (universalImage != null) {
            simpleDraweeView.setVisibility(0);
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))), null, null, null, 14);
        } else {
            simpleDraweeView.setVisibility(8);
        }
        bVar.f270425b.setOnClickListener(new C(this, modelCardWidgetItem, i12, 12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new b(C0.b(viewGroup, R.layout.widget_model_card_entry_item, viewGroup, false));
    }

    public a(q qVar, List list, int i12, C42822w c42822w) {
        qVar = (i12 & 1) != 0 ? C8060a.f270424l : qVar;
        list = (i12 & 2) != 0 ? new ArrayList() : list;
        this.f270422c = qVar;
        this.f270423d = list;
    }
}

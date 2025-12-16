package com.avito.android.advert_core.auto_select_parameters_v2;

import Y41.l;
import Y61.k;
import android.graphics.Rect;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert_core.auto_select_parameters_v2.advantage.AutoSelectExpandableAdvantageItem;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.konveyor.adapter.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectParametersV2View.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/auto_select_parameters_v2/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/auto_select_parameters_v2/g;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f82989h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f82990b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f82991c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f82992d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f82993e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f82994f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final j f82995g;

    /* compiled from: AutoSelectParametersV2View.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert_core/auto_select_parameters_v2/h$a", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.l {

        /* renamed from: b, reason: collision with root package name */
        public final int f82996b;

        public a(View view) {
            this.f82996b = com.avito.android.actions_sheet.a.d(view, R.dimen.auto_select_parameter_v2_items_spacing);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
            rect.bottom = this.f82996b;
        }
    }

    public h(@k View view, @k com.avito.konveyor.a aVar) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f82990b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f82991c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f82992d = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.footer_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f82993e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.advantages_list);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById5;
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.l(new a(view), -1);
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
        this.f82994f = hVar;
        j jVar = new j(hVar, aVar);
        this.f82995g = jVar;
        recyclerView.setAdapter(jVar);
    }

    @Override // com.avito.android.advert_core.auto_select_parameters_v2.g
    public final void e(@k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f82990b, attributedText, null);
    }

    @Override // com.avito.android.advert_core.auto_select_parameters_v2.g
    public final void g(@k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f82991c, attributedText, null);
    }

    @Override // com.avito.android.advert_core.auto_select_parameters_v2.g
    public final void l(@k Image image) {
        SimpleDraweeView simpleDraweeView = this.f82992d;
        Uri uriD = C35829k2.c(image, simpleDraweeView, 0, 30).d();
        if (uriD != null) {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.f(uriD);
            aVarA.c();
        }
    }

    @Override // com.avito.android.advert_core.auto_select_parameters_v2.g
    public final void n1(@k List<AutoSelectExpandableAdvantageItem> list) {
        this.f82994f.f338510e = new UV0.c(list);
        this.f82995g.notifyDataSetChanged();
    }

    @Override // com.avito.android.advert_core.auto_select_parameters_v2.g
    public final void yj(@k l lVar, @k AttributedText attributedText) {
        attributedText.setOnDeepLinkClickListener(new SE0.a(5, lVar));
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f82993e;
        textView.setMovementMethod(linkMovementMethod);
        com.avito.android.util.text.j.c(textView, attributedText, null);
    }
}

package com.avito.android.upload_doc.view.sections;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.H;
import com.avito.android.upload_doc.mvi.interactor.m;
import com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.avito.konveyor.adapter.j;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GigUploadDocSectionsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/upload_doc/view/sections/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/upload_doc/view/sections/f;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f307067b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final j f307068c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f307069d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final GigUploadDocDeeplink.FlowType f307070e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC28373a f307071f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final E f307072g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final H f307073h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f307074i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final RecyclerView f307075j;

    /* compiled from: GigUploadDocSectionsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f307077m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeepLink deepLink) {
            super(0);
            this.f307077m = deepLink;
        }

        @Override // Y41.a
        public final G0 invoke() {
            g gVar = g.this;
            gVar.f307071f.c(new LG0.a(gVar.f307072g.a(), gVar.f307073h.getF253025a(), m.a(gVar.f307070e), "hint"));
            b.a.a(gVar.f307069d, this.f307077m, null, null, 6);
            return G0.f406611a;
        }
    }

    public g(@k View view, @k com.avito.konveyor.adapter.h hVar, @k j jVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k GigUploadDocDeeplink.FlowType flowType, @k InterfaceC28373a interfaceC28373a, @k E e12, @k H h12) {
        super(view);
        this.f307067b = hVar;
        this.f307068c = jVar;
        this.f307069d = aVar;
        this.f307070e = flowType;
        this.f307071f = interfaceC28373a;
        this.f307072g = e12;
        this.f307073h = h12;
        View viewFindViewById = view.findViewById(R.id.section_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f307074i = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.documents_list);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f307075j = recyclerView;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(jVar);
    }

    @Override // com.avito.android.upload_doc.view.sections.f
    public final void FB(@l DeepLink deepLink, @l String str) {
        TextView textView = this.f307074i;
        I5.a(textView, str, false);
        G0 g02 = null;
        if (deepLink != null) {
            I5.d(textView, null, C35835l0.h(R.attr.ic_help24, textView.getContext()), 11);
            textView.setCompoundDrawablePadding(y6.b(4));
            I5.e(textView, null, Integer.valueOf(androidx.core.content.d.getColor(textView.getContext(), R.color.common_gray_20)), 11);
            I5.b(textView, new a(deepLink));
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            FV.a.f4720a.getClass();
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    @Override // com.avito.android.upload_doc.view.sections.f
    @SuppressLint({"NotifyDataSetChanged"})
    public final void rq(@k List<GigUploadDocDocumentItem> list) {
        boolean zIsEmpty = list.isEmpty();
        RecyclerView recyclerView = this.f307075j;
        if (zIsEmpty) {
            D6.w(recyclerView);
        } else {
            D6.H(recyclerView);
        }
        this.f307067b.f338510e = new UV0.c(list);
        this.f307068c.notifyDataSetChanged();
    }
}

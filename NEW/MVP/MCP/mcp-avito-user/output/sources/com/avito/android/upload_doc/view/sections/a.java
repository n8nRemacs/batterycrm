package com.avito.android.upload_doc.view.sections;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.remote.H;
import com.avito.konveyor.adapter.j;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigUploadDocSectionsBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/upload_doc/view/sections/a;", "LTV0/b;", "Lcom/avito/android/upload_doc/view/sections/f;", "Lcom/avito/android/upload_doc/view/sections/GigUploadDocSectionsItem;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.b<f, GigUploadDocSectionsItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f307050a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f307051b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f307052c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final GigUploadDocDeeplink.FlowType f307053d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC28373a f307054e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final E f307055f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final H f307056g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final g.a<g> f307057h = new g.a<>(R.layout.gig_upload_doc_section, new C9436a());

    /* compiled from: GigUploadDocSectionsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/upload_doc/view/sections/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/upload_doc/view/sections/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.upload_doc.view.sections.a$a, reason: collision with other inner class name */
    public static final class C9436a extends N implements p<ViewGroup, View, g> {
        public C9436a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            a aVar = a.this;
            com.avito.konveyor.a aVar2 = aVar.f307051b;
            com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar2, aVar2, null, 4, null);
            return new g(view2, hVar, new j(hVar, aVar.f307051b), aVar.f307052c, aVar.f307053d, aVar.f307054e, aVar.f307055f, aVar.f307056g);
        }
    }

    @Inject
    public a(@k c cVar, @PG0.a @k com.avito.konveyor.a aVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k GigUploadDocDeeplink.FlowType flowType, @k InterfaceC28373a interfaceC28373a, @k E e12, @k H h12) {
        this.f307050a = cVar;
        this.f307051b = aVar;
        this.f307052c = aVar2;
        this.f307053d = flowType;
        this.f307054e = interfaceC28373a;
        this.f307055f = e12;
        this.f307056g = h12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f307050a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f307057h;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof GigUploadDocSectionsItem;
    }
}

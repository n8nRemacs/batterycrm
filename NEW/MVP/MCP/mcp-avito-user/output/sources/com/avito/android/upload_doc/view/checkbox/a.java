package com.avito.android.upload_doc.view.checkbox;

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
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigUploadDocCheckboxBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/upload_doc/view/checkbox/a;", "LTV0/b;", "Lcom/avito/android/upload_doc/view/checkbox/g;", "Lcom/avito/android/upload_doc/view/checkbox/GigUploadDocCheckboxItem;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.b<g, GigUploadDocCheckboxItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f306973a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final GigUploadDocDeeplink.FlowType f306974b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f306975c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f306976d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final E f306977e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final H f306978f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final g.a<h> f306979g = new g.a<>(R.layout.gig_upload_doc_checkbox, new C9433a());

    /* compiled from: GigUploadDocCheckboxBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/upload_doc/view/checkbox/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/upload_doc/view/checkbox/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.upload_doc.view.checkbox.a$a, reason: collision with other inner class name */
    public static final class C9433a extends N implements p<ViewGroup, View, h> {
        public C9433a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            a aVar = a.this;
            return new h(view2, aVar.f306974b, aVar.f306975c, aVar.f306976d, aVar.f306977e, aVar.f306978f);
        }
    }

    @Inject
    public a(@k c cVar, @k GigUploadDocDeeplink.FlowType flowType, @k com.avito.android.util.text.a aVar, @k InterfaceC28373a interfaceC28373a, @k E e12, @k H h12) {
        this.f306973a = cVar;
        this.f306974b = flowType;
        this.f306975c = aVar;
        this.f306976d = interfaceC28373a;
        this.f306977e = e12;
        this.f306978f = h12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f306973a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f306979g;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof GigUploadDocCheckboxItem;
    }
}

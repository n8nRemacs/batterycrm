package com.avito.android.evidence_request.details.params.disclaimer;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.blueprints.publish.infomation.item.DisclaimerItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DisclaimerBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/details/params/disclaimer/a;", "LTV0/b;", "Lcom/avito/android/blueprints/publish/infomation/item/e;", "Lcom/avito/android/blueprints/publish/infomation/item/DisclaimerItem;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<com.avito.android.blueprints.publish.infomation.item.e, DisclaimerItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f148545a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f148546b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.android.blueprints.publish.infomation.item.f> f148547c = new g.a<>(R.layout.evidence_disclaimer, new C4352a());

    /* compiled from: DisclaimerBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprints/publish/infomation/item/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprints/publish/infomation/item/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.evidence_request.details.params.disclaimer.a$a, reason: collision with other inner class name */
    public static final class C4352a extends N implements p<ViewGroup, View, com.avito.android.blueprints.publish.infomation.item.f> {
        public C4352a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.blueprints.publish.infomation.item.f invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            return new com.avito.android.blueprints.publish.infomation.item.f(view2, a.this.f148546b, (TextView) view2.findViewById(R.id.text), null, null, 24, null);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar) {
        this.f148545a = cVar;
        this.f148546b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f148545a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.android.blueprints.publish.infomation.item.f> b() {
        return this.f148547c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof DisclaimerItem;
    }
}

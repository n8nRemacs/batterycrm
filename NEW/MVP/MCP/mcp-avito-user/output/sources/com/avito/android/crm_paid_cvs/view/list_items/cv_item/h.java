package com.avito.android.crm_paid_cvs.view.list_items.cv_item;

import bt.C25708f;
import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CvItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f130837l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CvItem f130838m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DeepLink f130839n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, CvItem cvItem, DeepLink deepLink) {
        super(0);
        this.f130837l = jVar;
        this.f130838m = cvItem;
        this.f130839n = deepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        j jVar = this.f130837l;
        jVar.f130845d.c(new C25708f(jVar.f130846e, this.f130838m.f130326b, jVar.f130847f));
        jVar.f130844c.invoke(this.f130839n);
        return G0.f406611a;
    }
}

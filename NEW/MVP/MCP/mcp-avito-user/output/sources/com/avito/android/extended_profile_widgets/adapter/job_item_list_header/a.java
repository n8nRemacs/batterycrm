package com.avito.android.extended_profile_widgets.adapter.job_item_list_header;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: JobCompanyItemListHeaderBlueprint.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/job_item_list_header/a;", "LTV0/b;", "Lcom/avito/android/extended_profile_widgets/adapter/job_item_list_header/f;", "Lcom/avito/android/extended_profile_widgets/adapter/job_item_list_header/JobCompanyItemListHeaderItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<f, JobCompanyItemListHeaderItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f154531a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f154532b = new g.a<>(R.layout.extended_profile_job_company_item_list_header_item, C4518a.f154533l);

    /* compiled from: JobCompanyItemListHeaderBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/extended_profile_widgets/adapter/job_item_list_header/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/extended_profile_widgets/adapter/job_item_list_header/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_widgets.adapter.job_item_list_header.a$a, reason: collision with other inner class name */
    public static final class C4518a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4518a f154533l = new C4518a();

        public C4518a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view);
        }
    }

    @Inject
    public a(@k d dVar) {
        this.f154531a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f154531a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f154532b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (!(aVar instanceof JobCompanyItemListHeaderItem)) {
            return false;
        }
        String str = ((JobCompanyItemListHeaderItem) aVar).f154529d;
        return !(str == null || C43066x.K(str));
    }
}

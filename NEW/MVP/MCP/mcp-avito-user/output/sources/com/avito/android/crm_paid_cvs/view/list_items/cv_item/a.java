package com.avito.android.crm_paid_cvs.view.list_items.cv_item;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.crm_paid_cvs.dto.CvItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CvItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/cv_item/a;", "LTV0/b;", "Lcom/avito/android/crm_paid_cvs/view/list_items/cv_item/l;", "Lcom/avito/android/crm_paid_cvs/dto/CvItem;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements TV0.b<l, CvItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f130827a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<s> f130828b = new g.a<>(R.layout.crm_paid_cvs_cv_item, C3887a.f130829l);

    /* compiled from: CvItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/crm_paid_cvs/view/list_items/cv_item/s;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/crm_paid_cvs/view/list_items/cv_item/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.crm_paid_cvs.view.list_items.cv_item.a$a, reason: collision with other inner class name */
    public static final class C3887a extends N implements Y41.p<ViewGroup, View, s> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3887a f130829l = new C3887a();

        public C3887a() {
            super(2);
        }

        @Override // Y41.p
        public final s invoke(ViewGroup viewGroup, View view) {
            return new s(view);
        }
    }

    @Inject
    public a(@Y61.k d dVar) {
        this.f130827a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f130827a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<s> b() {
        return this.f130828b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof CvItem;
    }
}

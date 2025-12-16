package com.avito.android.advert.item.job_cv_info;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertCvInfoBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/job_cv_info/a;", "LTV0/b;", "Lcom/avito/android/advert/item/job_cv_info/i;", "Lcom/avito/android/advert/item/job_cv_info/AdvertCvInfoItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<i, AdvertCvInfoItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f77202a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f77203b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f77204c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<j> f77205d = new g.a<>(R.layout.advert_job_cv_info_layout, new C2275a());

    /* compiled from: AdvertCvInfoBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/job_cv_info/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/job_cv_info/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.job_cv_info.a$a, reason: collision with other inner class name */
    public static final class C2275a extends N implements p<ViewGroup, View, j> {
        public C2275a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new j(view, aVar.f77203b, aVar.f77204c);
        }
    }

    @Inject
    public a(@k e eVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k R0 r02) {
        this.f77202a = eVar;
        this.f77203b = aVar;
        this.f77204c = r02;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f77202a;
    }

    @Override // TV0.b
    @k
    public final g.a<j> b() {
        return this.f77205d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AdvertCvInfoItem;
    }
}

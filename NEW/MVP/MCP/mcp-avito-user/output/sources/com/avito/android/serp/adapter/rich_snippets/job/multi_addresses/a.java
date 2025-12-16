package com.avito.android.serp.adapter.rich_snippets.job.multi_addresses;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.rich_snippets.job.j;
import com.avito.android.serp.adapter.rich_snippets.job.m;
import com.avito.android.serp.adapter.rich_snippets.job.n;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertRichJobMultiAddressesItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/job/multi_addresses/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/rich_snippets/job/m;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<m, AdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f270827a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<n> f270828b = new g.a<>(R.layout.advert_item_rich_job_with_geo, C8071a.f270829l);

    /* compiled from: AdvertRichJobMultiAddressesItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/rich_snippets/job/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/rich_snippets/job/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.rich_snippets.job.multi_addresses.a$a, reason: collision with other inner class name */
    public static final class C8071a extends N implements p<ViewGroup, View, n> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8071a f270829l = new C8071a();

        public C8071a() {
            super(2);
        }

        @Override // Y41.p
        public final n invoke(ViewGroup viewGroup, View view) {
            return new n(view, 0, false, null, 14, null);
        }
    }

    @Inject
    public a(@k j jVar) {
        this.f270827a = jVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f270827a;
    }

    @Override // TV0.b
    @k
    public final g.a<n> b() {
        return this.f270828b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        boolean zA2 = b.a(aVar);
        if (aVar instanceof AdvertItem) {
            AdvertItem advertItem = (AdvertItem) aVar;
            if (advertItem.f268374D == SerpViewType.f268582b && advertItem.f268378F.isVacancy() && zA2) {
                return true;
            }
        }
        return false;
    }
}

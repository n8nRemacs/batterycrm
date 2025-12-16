package com.avito.android.serp.adapter.rich_snippets.job;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertXlRichJobItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/job/o;", "LTV0/b;", "Lcom/avito/android/serp/adapter/rich_snippets/job/m;", "Lcom/avito/android/serp/adapter/advert_xl/AdvertXlItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements TV0.b<m, AdvertXlItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f270837a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<n> f270838b = new g.a<>(R.layout.advert_item_rich_job, a.f270839l);

    /* compiled from: AdvertXlRichJobItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/rich_snippets/job/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/rich_snippets/job/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, n> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f270839l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final n invoke(ViewGroup viewGroup, View view) {
            return new n(view, 0, false, null, 14, null);
        }
    }

    @Inject
    public o(@Y61.k x xVar) {
        this.f270837a = xVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f270837a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<n> b() {
        return this.f270838b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // TV0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(@Y61.k TV0.a r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.avito.android.serp.adapter.advert_xl.AdvertXlItem
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L25
            com.avito.android.remote.model.GeoReference$AdditionalInfo$Companion r3 = com.avito.android.remote.model.GeoReference.AdditionalInfo.INSTANCE
            r4 = r6
            com.avito.android.serp.adapter.advert_xl.AdvertXlItem r4 = (com.avito.android.serp.adapter.advert_xl.AdvertXlItem) r4
            java.util.List<com.avito.android.remote.model.GeoReference> r4 = r4.f268765R
            if (r4 == 0) goto L1c
            java.lang.Object r4 = kotlin.collections.C42745f0.E(r4)
            com.avito.android.remote.model.GeoReference r4 = (com.avito.android.remote.model.GeoReference) r4
            if (r4 == 0) goto L1c
            com.avito.android.remote.model.GeoReference$AdditionalInfo r4 = r4.getAdditionalInfo()
            goto L1d
        L1c:
            r4 = 0
        L1d:
            boolean r3 = r3.isNotNullAndNotEmpty(r4)
            if (r3 == 0) goto L25
            r3 = r2
            goto L26
        L25:
            r3 = r1
        L26:
            if (r0 == 0) goto L35
            com.avito.android.serp.adapter.advert_xl.AdvertXlItem r6 = (com.avito.android.serp.adapter.advert_xl.AdvertXlItem) r6
            com.avito.android.remote.model.SerpDisplayType r6 = r6.f268789i
            boolean r6 = r6.isVacancy()
            if (r6 == 0) goto L35
            if (r3 != 0) goto L35
            r1 = r2
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.rich_snippets.job.o.d(TV0.a):boolean");
    }
}

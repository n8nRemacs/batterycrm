package com.avito.android.advert_core.feature_teasers.common.dialog;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsFeatureTeaserDialogTextItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/dialog/f;", "LTV0/b;", "Lcom/avito/android/advert_core/feature_teasers/common/dialog/j;", "Lcom/avito/android/advert_core/feature_teasers/common/dialog/e;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements TV0.b<j, e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f83633a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f83634b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<j> f83635c = new g.a<>(R.layout.advert_details_features_dialog_text_item, new a());

    /* compiled from: AdvertDetailsFeatureTeaserDialogTextItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_core/feature_teasers/common/dialog/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_core/feature_teasers/common/dialog/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, j> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view, f.this.f83634b);
        }
    }

    @Inject
    public f(@B9.a @Y61.k h hVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f83633a = hVar;
        this.f83634b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f83633a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<j> b() {
        return this.f83635c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof e;
    }
}

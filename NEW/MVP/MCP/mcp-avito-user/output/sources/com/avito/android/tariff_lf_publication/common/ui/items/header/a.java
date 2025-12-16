package com.avito.android.tariff_lf_publication.common.ui.items.header;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffLfPublicationHeaderBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_publication/common/ui/items/header/a;", "LTV0/b;", "Lcom/avito/android/tariff_lf_publication/common/ui/items/header/h;", "Lcom/avito/android/tariff_lf_publication/common/ui/items/header/c;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.b<h, c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f300708a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<i> f300709b;

    /* compiled from: TariffLfPublicationHeaderBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/tariff_lf_publication/common/ui/items/header/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/tariff_lf_publication/common/ui/items/header/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.tariff_lf_publication.common.ui.items.header.a$a, reason: collision with other inner class name */
    public static final class C9197a extends N implements p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.util.text.a f300710l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9197a(com.avito.android.util.text.a aVar) {
            super(2);
            this.f300710l = aVar;
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view, this.f300710l);
        }
    }

    @Inject
    public a(@k e eVar, @k com.avito.android.util.text.a aVar) {
        this.f300708a = eVar;
        this.f300709b = new g.a<>(R.layout.tariff_lf_publication_header_item, new C9197a(aVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f300708a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f300709b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof c;
    }
}

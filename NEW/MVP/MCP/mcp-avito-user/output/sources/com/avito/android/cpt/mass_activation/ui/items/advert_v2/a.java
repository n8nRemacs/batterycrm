package com.avito.android.cpt.mass_activation.ui.items.advert_v2;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CptMassActivationAdvertV2Blueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpt/mass_activation/ui/items/advert_v2/a;", "LTV0/b;", "Lcom/avito/android/cpt/mass_activation/ui/items/advert_v2/g;", "Lcom/avito/android/cpt/mass_activation/ui/items/advert_v2/c;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements TV0.b<g, c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f126630a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<j> f126631b;

    /* compiled from: CptMassActivationAdvertV2Blueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/cpt/mass_activation/ui/items/advert_v2/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/cpt/mass_activation/ui/items/advert_v2/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cpt.mass_activation.ui.items.advert_v2.a$a, reason: collision with other inner class name */
    public static final class C3769a extends N implements p<ViewGroup, View, j> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.util.text.a f126632l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3769a(com.avito.android.util.text.a aVar) {
            super(2);
            this.f126632l = aVar;
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view, this.f126632l);
        }
    }

    @Inject
    public a(@Y61.k d dVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f126630a = dVar;
        this.f126631b = new g.a<>(R.layout.cpt_mass_activation_advert_v2_item, new C3769a(aVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f126630a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<j> b() {
        return this.f126631b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof c;
    }
}

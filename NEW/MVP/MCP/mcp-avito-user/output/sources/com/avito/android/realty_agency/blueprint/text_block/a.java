package com.avito.android.realty_agency.blueprint.text_block;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TextBlockItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/realty_agency/blueprint/text_block/a;", "LTV0/b;", "Lcom/avito/android/realty_agency/blueprint/text_block/e;", "Lcom/avito/android/realty_agency/blueprint/text_block/TextBlockItem;", "_avito_realty-agency_shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<e, TextBlockItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f250893a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<f> f250894b = new g.a<>(R.layout.item_text_block, C7530a.f250895l);

    /* compiled from: TextBlockItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/realty_agency/blueprint/text_block/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/realty_agency/blueprint/text_block/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.realty_agency.blueprint.text_block.a$a, reason: collision with other inner class name */
    public static final class C7530a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7530a f250895l = new C7530a();

        public C7530a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f250893a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f250893a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f250894b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof TextBlockItem;
    }
}

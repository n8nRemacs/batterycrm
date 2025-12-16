package com.avito.android.mandatory_verification.items.header;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MandatoryVerificationHeaderItemBlueprintImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/items/header/c;", "Lcom/avito/android/mandatory_verification/items/header/a;", "_avito_mandatory-verification-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.mandatory_verification.items.header.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f184652a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f184653b;

    /* compiled from: MandatoryVerificationHeaderItemBlueprintImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/mandatory_verification/items/header/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/mandatory_verification/items/header/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, k> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            c cVar = c.this;
            return new k(view, cVar.f184653b, new b(cVar));
        }
    }

    @Inject
    public c(@Y61.k e eVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f184652a = eVar;
        this.f184653b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f184652a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.mandatory_verification_header_item, new a());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof MandatoryVerificationHeaderItem;
    }
}

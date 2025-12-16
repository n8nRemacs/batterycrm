package com.avito.android.rubricator;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.rubricator.items.RubricatorRefinedItem;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SerpVerticalRubricatorPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rubricator/f;", "Lcom/avito/android/rubricator/e;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<RubricatorRefinedItem> f255740b = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((h) eVar).ql((b) aVar);
    }

    @Override // com.avito.android.rubricator.e
    @k
    public final C41981q0 c2() {
        com.jakewharton.rxrelay3.c<RubricatorRefinedItem> cVar = this.f255740b;
        return l.l(cVar, cVar);
    }

    @Override // com.avito.android.rubricator.e
    public final void r1(@k RubricatorRefinedItem rubricatorRefinedItem) {
        this.f255740b.accept(rubricatorRefinedItem);
    }
}

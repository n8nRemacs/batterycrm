package com.avito.android.mandatory_verification.items.header;

import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: MandatoryVerificationHeaderItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/items/header/h;", "Lcom/avito/android/mandatory_verification/items/header/e;", "_avito_mandatory-verification-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f184659b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f184660c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43238h f184661d;

    @Inject
    public h(@Y61.k R0 r02) {
        e2 e2VarB = f2.b(0, 0, null, 7);
        this.f184659b = e2VarB;
        this.f184660c = e2VarB;
        this.f184661d = U.a(r02.b());
    }

    @Override // TX.a
    @Y61.k
    /* renamed from: F, reason: from getter */
    public final e2 getF184660c() {
        return this.f184660c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((j) eVar).wx((MandatoryVerificationHeaderItem) aVar, new g(this));
    }

    @Override // TX.a
    public final void j5() {
        Q0.d(this.f184661d.f411905b);
    }
}

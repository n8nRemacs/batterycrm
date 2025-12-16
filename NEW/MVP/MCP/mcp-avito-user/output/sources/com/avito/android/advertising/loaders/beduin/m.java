package com.avito.android.advertising.loaders.beduin;

import com.avito.android.advertising.loaders.beduin.C28357k;
import com.avito.beduin.v2.engine.C36272i;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CommercialBDUIBannerObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/m;", "Lcom/avito/beduin/v2/interaction/repository/flow/n;", "Lcom/avito/android/advertising/loaders/beduin/k;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m extends com.avito.beduin.v2.interaction.repository.flow.n<C28357k> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<H> f88159c;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@Y61.k Y41.a<? extends H> aVar) {
        super(C28357k.a.f88144b);
        this.f88159c = aVar;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.n
    public final InterfaceC43160i q(com.avito.beduin.v2.interaction.repository.flow.l lVar, C36272i c36272i) {
        return C43175k.d(new C28358l(this, (C28357k) lVar, c36272i, null));
    }
}

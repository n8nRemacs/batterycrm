package com.avito.android.bxcontent.beduin_v2.wrapper;

import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.E;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BxWrapperState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/m;", "Lcom/avito/beduin/v2/engine/component/j;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m extends AbstractC36250j {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Gson f109614c;

    @Inject
    public m(@o @Y61.k Gson gson) {
        super("BuyerContentNativeWrapper", false, 2, null);
        this.f109614c = gson;
    }

    @Override // com.avito.beduin.v2.engine.component.AbstractC36250j
    public final Object a(AbstractC36250j.b bVar, String str) {
        return (k) E.b(bVar, bVar.f336563b, new l(this));
    }
}

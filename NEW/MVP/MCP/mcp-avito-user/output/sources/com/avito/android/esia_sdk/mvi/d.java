package com.avito.android.esia_sdk.mvi;

import Lz.AbstractC14457a;
import Lz.AbstractC14458b;
import Lz.C14460d;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.x;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EsiaSdkActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/esia_sdk/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LLz/a;", "LLz/b;", "LLz/d;", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.arch.mvi.a<AbstractC14457a, AbstractC14458b, C14460d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f148143a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f148144b;

    @Inject
    public d(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k x xVar) {
        this.f148143a = aVar;
        this.f148144b = xVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AbstractC14458b> b(AbstractC14457a abstractC14457a, C14460d c14460d) {
        AbstractC14457a abstractC14457a2 = abstractC14457a;
        if (abstractC14457a2 instanceof AbstractC14457a.C0652a) {
            return C43175k.G(new a(this, abstractC14457a2, null));
        }
        if (abstractC14457a2 instanceof AbstractC14457a.b) {
            return C43175k.G(new b(abstractC14457a2, null));
        }
        if (abstractC14457a2 instanceof AbstractC14457a.c) {
            return C43175k.G(new c(abstractC14457a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}

package com.avito.beduin.v2.interaction.detached.flow;

import Y41.l;
import Y41.p;
import com.avito.beduin.v2.engine.core.C36258h;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ShowBottomSheetInteraction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006*\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/avito/beduin/v2/engine/core/z;", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "handleError", "Lcom/avito/beduin/v2/engine/core/K;", "invoke", "(Lcom/avito/beduin/v2/engine/core/z;LY41/l;)Lcom/avito/beduin/v2/engine/core/K;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements p<z, l<? super Exception, ? extends Object>, K<? extends Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.c f337316l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f337317m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.avito.beduin.v2.engine.field.entity.c cVar, m mVar) {
        super(2);
        this.f337316l = cVar;
        this.f337317m = mVar;
    }

    @Override // Y41.p
    public final K<? extends Object> invoke(z zVar, l<? super Exception, ? extends Object> lVar) {
        C36258h c36258h = new C36258h(zVar.getF336696a(), "bottomSheetContent");
        c36258h.o(this.f337316l, this.f337317m, lVar);
        return c36258h;
    }
}

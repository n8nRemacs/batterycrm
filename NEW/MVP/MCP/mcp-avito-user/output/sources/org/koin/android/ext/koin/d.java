package org.koin.android.ext.koin;

import Y41.l;
import android.content.Context;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import org.koin.core.definition.Kind;
import org.koin.core.instance.g;

/* compiled from: KoinExt.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt71/c;", "Lkotlin/G0;", "invoke", "(Lt71/c;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class d extends N implements l<t71.c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f421399l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(1);
        this.f421399l = context;
    }

    @Override // Y41.l
    public final G0 invoke(t71.c cVar) {
        t71.c cVar2 = cVar;
        c cVar3 = new c(this.f421399l);
        x71.f.f442253e.getClass();
        g<?> gVar = new g<>(new org.koin.core.definition.a(x71.f.f442254f, m0.f406844a.b(Context.class), null, cVar3, Kind.f421443b, C42784z0.f406748b));
        cVar2.a(gVar);
        if (cVar2.f439150a) {
            cVar2.b(gVar);
        }
        return G0.f406611a;
    }
}

package org.koin.android.ext.koin;

import Y41.l;
import android.app.Application;
import android.content.Context;
import kotlin.C50383a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import org.koin.core.definition.Kind;
import org.koin.core.instance.g;
import w71.C49464c;

/* compiled from: KoinExt.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt71/c;", "Lkotlin/G0;", "invoke", "(Lt71/c;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class b extends N implements l<t71.c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f421397l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(1);
        this.f421397l = context;
    }

    @Override // Y41.l
    public final G0 invoke(t71.c cVar) {
        t71.c cVar2 = cVar;
        a aVar = new a(this.f421397l);
        x71.f.f442253e.getClass();
        C49464c c49464c = x71.f.f442254f;
        Kind kind = Kind.f421443b;
        C42784z0 c42784z0 = C42784z0.f406748b;
        n0 n0Var = m0.f406844a;
        g<?> gVar = new g<>(new org.koin.core.definition.a(c49464c, n0Var.b(Application.class), null, aVar, kind, c42784z0));
        cVar2.a(gVar);
        if (cVar2.f439150a) {
            cVar2.b(gVar);
        }
        C50383a.b(new org.koin.core.definition.e(cVar2, gVar), new kotlin.reflect.d[]{n0Var.b(Context.class), n0Var.b(Application.class)});
        return G0.f406611a;
    }
}

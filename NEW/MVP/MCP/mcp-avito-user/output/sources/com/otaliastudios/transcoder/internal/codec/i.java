package com.otaliastudios.transcoder.internal.codec;

import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: Delegates.kt */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/properties/a", "Lkotlin/properties/e;", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes7.dex */
public final class i extends kotlin.properties.e<Integer> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f366083b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar) {
        super(0);
        this.f366083b = gVar;
    }

    @Override // kotlin.properties.e
    public final void afterChange(@Y61.k n<?> nVar, Integer num, Integer num2) {
        num2.intValue();
        num.intValue();
        n<Object>[] nVarArr = g.f366067m;
        g gVar = this.f366083b;
        gVar.h();
        gVar.i();
        gVar.f366072f.getClass();
    }
}

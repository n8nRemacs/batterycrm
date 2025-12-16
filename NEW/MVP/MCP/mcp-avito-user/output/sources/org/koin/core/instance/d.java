package org.koin.core.instance;

import Y61.k;
import Y61.l;
import kotlin.C49177a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import s71.AbstractC48011b;

/* compiled from: InstanceContext.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/koin/core/instance/d;", "", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AbstractC48011b f421457a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final org.koin.core.scope.a f421458b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C49177a f421459c;

    public d(@k AbstractC48011b abstractC48011b, @k org.koin.core.scope.a aVar, @l C49177a c49177a) {
        this.f421457a = abstractC48011b;
        this.f421458b = aVar;
        this.f421459c = c49177a;
    }

    public /* synthetic */ d(AbstractC48011b abstractC48011b, org.koin.core.scope.a aVar, C49177a c49177a, int i12, C42822w c42822w) {
        this(abstractC48011b, aVar, (i12 & 4) != 0 ? null : c49177a);
    }
}

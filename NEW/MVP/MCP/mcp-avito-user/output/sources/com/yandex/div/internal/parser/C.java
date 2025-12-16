package com.yandex.div.internal.parser;

import kotlin.Metadata;

/* compiled from: TypeHelpers.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/parser/C;", "Lcom/yandex/div/internal/parser/D;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class C implements D<Object> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f370126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f370127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Object, Boolean> f370128d;

    public C(Y41.l lVar, Object obj) {
        this.f370127c = obj;
        this.f370128d = lVar;
        this.f370126b = obj;
    }

    @Override // com.yandex.div.internal.parser.D
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final Object getF370126b() {
        return this.f370126b;
    }

    @Override // com.yandex.div.internal.parser.D
    public final boolean b(@Y61.k Object obj) {
        return this.f370128d.invoke(obj).booleanValue();
    }
}

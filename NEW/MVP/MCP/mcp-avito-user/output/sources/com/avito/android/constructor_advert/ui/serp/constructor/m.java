package com.avito.android.constructor_advert.ui.serp.constructor;

import com.avito.android.remote.model.SerpDisplayType;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConstructorAdvertItemSpanCountProviderImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/m;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/l;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    public final int f125824a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public UV0.c f125825b;

    public m(int i12) {
        this.f125824a = i12;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.l
    public final int a(@Y61.k SerpDisplayType serpDisplayType) {
        if (serpDisplayType.isSingleColumn()) {
            return this.f125824a;
        }
        return 1;
    }
}

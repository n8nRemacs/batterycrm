package com.yandex.div.core.timer;

import com.yandex.div.core.C37916k;
import com.yandex.div.core.dagger.z;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DivTimerEventDispatcherProvider.kt */
@z
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/timer/b;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C37916k f367706a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.errors.f f367707b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, a> f367708c = Collections.synchronizedMap(new LinkedHashMap());

    @Inject
    public b(@Y61.k C37916k c37916k, @Y61.k com.yandex.div.core.view2.errors.f fVar) {
        this.f367706a = c37916k;
        this.f367707b = fVar;
    }
}

package com.yandex.div.core.util;

import com.yandex.div.core.view2.C38029k;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Views.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/util/i;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public N f367796a;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@Y61.k C38029k c38029k, @Y61.l Y41.a aVar) {
        this.f367796a = (N) aVar;
        if (c38029k.isAttachedToWindow()) {
            a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    public final void a() {
        ?? r02 = this.f367796a;
        if (r02 != 0) {
            r02.invoke();
        }
        this.f367796a = null;
    }
}

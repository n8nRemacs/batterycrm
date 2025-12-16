package ru.rustore.sdk.core.tasks;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Task.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/core/tasks/a;", "", "sdk-public-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f436773a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Executor f436774b;

    public a(@Y61.k c cVar, @Y61.l Executor executor) {
        this.f436773a = cVar;
        this.f436774b = executor;
    }

    public /* synthetic */ a(c cVar, Executor executor, int i12, C42822w c42822w) {
        this(cVar, (i12 & 2) != 0 ? null : executor);
    }
}

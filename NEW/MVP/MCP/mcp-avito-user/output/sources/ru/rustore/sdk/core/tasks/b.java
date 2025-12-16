package ru.rustore.sdk.core.tasks;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Task.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/core/tasks/b;", "T", "", "sdk-public-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class b<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final e<T> f436775a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final d f436776b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Executor f436777c;

    public b() {
        this(null, null, null, 7, null);
    }

    public b(@Y61.l e<T> eVar, @Y61.l d dVar, @Y61.l Executor executor) {
        this.f436775a = eVar;
        this.f436776b = dVar;
        this.f436777c = executor;
    }

    public /* synthetic */ b(e eVar, d dVar, Executor executor, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : eVar, (i12 & 2) != 0 ? null : dVar, (i12 & 4) != 0 ? null : executor);
    }
}

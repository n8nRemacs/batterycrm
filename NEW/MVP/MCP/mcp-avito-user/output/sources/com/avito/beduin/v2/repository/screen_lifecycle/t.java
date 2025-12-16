package com.avito.beduin.v2.repository.screen_lifecycle;

import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import kotlin.Metadata;

/* compiled from: ScreenState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/screen_lifecycle/t;", "Lcom/avito/beduin/v2/repository/screen_lifecycle/p;", "<init>", "()V", "screen-lifecycle_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class t implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final t f338335a = new t();

    @Override // com.avito.beduin.v2.repository.screen_lifecycle.p
    @Y61.k
    public final A a(@Y61.k C36272i c36272i) {
        return q.a(c36272i, "terminated");
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof t);
    }

    public final int hashCode() {
        return 1292191;
    }

    @Y61.k
    public final String toString() {
        return "Terminated";
    }
}

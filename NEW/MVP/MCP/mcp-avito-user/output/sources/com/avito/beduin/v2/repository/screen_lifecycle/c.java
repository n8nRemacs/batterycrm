package com.avito.beduin.v2.repository.screen_lifecycle;

import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import kotlin.Metadata;

/* compiled from: ScreenState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/screen_lifecycle/c;", "Lcom/avito/beduin/v2/repository/screen_lifecycle/p;", "<init>", "()V", "screen-lifecycle_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f338301a = new c();

    @Override // com.avito.beduin.v2.repository.screen_lifecycle.p
    @Y61.k
    public final A a(@Y61.k C36272i c36272i) {
        return q.a(c36272i, HiddenParameter.TYPE);
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof c);
    }

    public final int hashCode() {
        return 963470630;
    }

    @Y61.k
    public final String toString() {
        return "Hidden";
    }
}

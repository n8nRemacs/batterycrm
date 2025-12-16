package com.avito.android.code_check_public;

import Y61.l;
import com.avito.android.code_check_public.CodeCheckLink;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Scenario.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check_public/e;", "", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public volatile CodeCheckLink.Flow f119286a;

    @Y61.k
    public abstract d a();

    @Y61.k
    public final CodeCheckLink.Flow b() {
        CodeCheckLink.Flow flow = this.f119286a;
        if (flow != null) {
            return flow;
        }
        throw new IllegalArgumentException("CodeCheck ScenarioBuilder flow is required but not specified!");
    }
}

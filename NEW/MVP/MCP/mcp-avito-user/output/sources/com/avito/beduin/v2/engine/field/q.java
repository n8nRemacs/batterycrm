package com.avito.beduin.v2.engine.field;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: Field.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/q;", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f336876a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f336877b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f336878c;

    public q(@Y61.k String str, @Y61.l String str2) {
        this(str2 != null ? H.i('@', str, str2) : str);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && L.f(this.f336876a, ((q) obj).f336876a);
    }

    public final int hashCode() {
        return this.f336876a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("RefArg(full="), this.f336876a, ')');
    }

    public q(@Y61.k String str) {
        this.f336876a = str;
        List listF0 = C43066x.f0(str, new String[]{"@"}, 0, 6);
        this.f336877b = (String) listF0.get(0);
        this.f336878c = (String) C42745f0.K(1, listF0);
    }
}

package com.avito.beduin.v2.engine.field;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ComponentParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/c;", "", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c {

    /* compiled from: ComponentParams.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/c$a;", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f336770a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f336771b = new LinkedHashMap();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f336772c = new LinkedHashMap();

        public a(boolean z12) {
            this.f336770a = z12;
        }

        public final void a(@Y61.k String str, @Y61.k f<?> fVar) {
            if (this.f336770a && (C43066x.h0(str, "layout_", false) || C43066x.h0(str, "_layout_", false))) {
                this.f336772c.put(str, fVar);
            } else {
                this.f336771b.put(str, fVar);
            }
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        ((c) obj).getClass();
        return L.f(null, null) && L.f(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    @Y61.k
    public final String toString() {
        return "ComponentParams(params=" + ((Object) null) + ", layoutParams=" + ((Object) null) + ')';
    }
}

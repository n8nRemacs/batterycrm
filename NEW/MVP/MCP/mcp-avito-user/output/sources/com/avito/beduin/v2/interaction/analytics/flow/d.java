package com.avito.beduin.v2.interaction.analytics.flow;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.beduin.v2.interaction.analytics.flow.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SendAnalyticsEventInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/analytics/flow/d;", "LdU0/b;", "a", "b", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f337260a;

    /* renamed from: b, reason: collision with root package name */
    public final int f337261b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e.a f337262c;

    /* compiled from: SendAnalyticsEventInteraction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/analytics/flow/d$a;", "", "", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends Map<String, Object>, Z41.a {

        /* compiled from: SendAnalyticsEventInteraction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.interaction.analytics.flow.d$a$a, reason: collision with other inner class name */
        public static final class C10452a {
        }
    }

    /* compiled from: SendAnalyticsEventInteraction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/interaction/analytics/flow/d$b;", "", "<init>", "()V", "", "UNDEFINED", "I", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    public d(int i12, int i13, @k e.a aVar) {
        this.f337260a = i12;
        this.f337261b = i13;
        this.f337262c = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f337260a == dVar.f337260a && this.f337261b == dVar.f337261b && this.f337262c.equals(dVar.f337262c);
    }

    public final int hashCode() {
        return this.f337262c.hashCode() + r.e(this.f337261b, Integer.hashCode(this.f337260a) * 31, 31);
    }

    @k
    public final String toString() {
        return "SendAnalyticsEventInteraction(eventId=" + this.f337260a + ", version=" + this.f337261b + ", params=" + this.f337262c + ')';
    }
}

package fW0;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Tabs.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LfW0/E;", "", "LfW0/D;", "basicIndicators", "dynamics", "spendings", "<init>", "(LfW0/D;LfW0/D;LfW0/D;)V", "LfW0/D;", "a", "()LfW0/D;", "b", "c", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class E {

    @com.google.gson.annotations.c("basicIndicators")
    @Y61.k
    private final D basicIndicators;

    @com.google.gson.annotations.c("dynamics")
    @Y61.k
    private final D dynamics;

    @com.google.gson.annotations.c("spendings")
    @Y61.k
    private final D spendings;

    public E(@Y61.k D d12, @Y61.k D d13, @Y61.k D d14) {
        this.basicIndicators = d12;
        this.dynamics = d13;
        this.spendings = d14;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final D getBasicIndicators() {
        return this.basicIndicators;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final D getDynamics() {
        return this.dynamics;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final D getSpendings() {
        return this.spendings;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e12 = (E) obj;
        return L.f(this.basicIndicators, e12.basicIndicators) && L.f(this.dynamics, e12.dynamics) && L.f(this.spendings, e12.spendings);
    }

    public final int hashCode() {
        return this.spendings.hashCode() + ((this.dynamics.hashCode() + (this.basicIndicators.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "Tabs(basicIndicators=" + this.basicIndicators + ", dynamics=" + this.dynamics + ", spendings=" + this.spendings + ')';
    }
}

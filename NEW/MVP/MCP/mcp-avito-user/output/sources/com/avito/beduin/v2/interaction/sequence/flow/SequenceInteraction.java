package com.avito.beduin.v2.interaction.sequence.flow;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import dU0.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SequenceInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/sequence/flow/SequenceInteraction;", "LdU0/b;", "a", "StateChangePolicy", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SequenceInteraction implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f337838a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final StateChangePolicy f337839b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SequenceInteraction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/sequence/flow/SequenceInteraction$StateChangePolicy;", "", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StateChangePolicy {

        /* renamed from: b, reason: collision with root package name */
        public static final StateChangePolicy f337840b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ StateChangePolicy[] f337841c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f337842d;

        static {
            StateChangePolicy stateChangePolicy = new StateChangePolicy("SEPARATELY", 0);
            f337840b = stateChangePolicy;
            StateChangePolicy[] stateChangePolicyArr = {stateChangePolicy, new StateChangePolicy("TRANSACTION", 1)};
            f337841c = stateChangePolicyArr;
            f337842d = kotlin.enums.c.a(stateChangePolicyArr);
        }

        public StateChangePolicy() {
            throw null;
        }

        public static StateChangePolicy valueOf(String str) {
            return (StateChangePolicy) Enum.valueOf(StateChangePolicy.class, str);
        }

        public static StateChangePolicy[] values() {
            return (StateChangePolicy[]) f337841c.clone();
        }
    }

    /* compiled from: SequenceInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/sequence/flow/SequenceInteraction$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f337843b = new a();

        public a() {
            super("Sequence");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
        @Override // dU0.c
        public final dU0.b b(z zVar, m mVar) throws BeduinPropertyException {
            ?? arrayList;
            List<com.avito.beduin.v2.engine.field.d> list;
            C36268a c36268aN = mVar.n(zVar, "items");
            StateChangePolicy stateChangePolicyValueOf = null;
            if (c36268aN == null || (list = c36268aN.f336782b) == null) {
                arrayList = C42784z0.f406748b;
            } else {
                List<com.avito.beduin.v2.engine.field.d> list2 = list;
                arrayList = new ArrayList(C42745f0.q(list2, 10));
                int i12 = 0;
                for (Object obj : list2) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) obj;
                    String strP = r.p("items[", i12, ']');
                    try {
                        arrayList.add(new b(zVar, dVar));
                        i12 = i13;
                    } catch (Exception e12) {
                        throw new BeduinPropertyException(strP, e12);
                    }
                }
            }
            try {
                com.avito.beduin.v2.engine.field.d dVarC = mVar.c("stateChangePolicy");
                if (dVarC != null) {
                    v vVarQ = dVarC.q(zVar);
                    String f336843b = vVarQ != null ? vVarQ.getF336843b() : null;
                    if (f336843b != null) {
                        stateChangePolicyValueOf = StateChangePolicy.valueOf(f336843b.toUpperCase(Locale.ROOT));
                    }
                }
                if (stateChangePolicyValueOf == null) {
                    stateChangePolicyValueOf = StateChangePolicy.f337840b;
                }
                return new SequenceInteraction(arrayList, stateChangePolicyValueOf);
            } catch (Exception e13) {
                throw new BeduinPropertyException("stateChangePolicy", e13);
            }
        }
    }

    public SequenceInteraction(@k List<? extends Y41.a<f>> list, @k StateChangePolicy stateChangePolicy) {
        this.f337838a = list;
        this.f337839b = stateChangePolicy;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SequenceInteraction)) {
            return false;
        }
        SequenceInteraction sequenceInteraction = (SequenceInteraction) obj;
        return L.f(this.f337838a, sequenceInteraction.f337838a) && this.f337839b == sequenceInteraction.f337839b;
    }

    public final int hashCode() {
        return this.f337839b.hashCode() + (this.f337838a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "SequenceInteraction(items=" + this.f337838a + ", stateChangePolicy=" + this.f337839b + ')';
    }
}

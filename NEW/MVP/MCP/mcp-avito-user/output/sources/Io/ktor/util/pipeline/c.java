package io.ktor.util.pipeline;

import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;

/* compiled from: PhaseContent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/util/pipeline/c;", "", "TSubject", "Call", "a", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c<TSubject, Call> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final ArrayList f400518e;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f400519a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f400520b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public List<Y41.q<e<TSubject, Call>, TSubject, Continuation<? super G0>, Object>> f400521c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f400522d;

    /* compiled from: PhaseContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/pipeline/c$a;", "", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f400518e = new ArrayList();
    }

    public c() {
        throw null;
    }

    public c(@Y61.k k kVar, @Y61.k l lVar) {
        ArrayList arrayList = f400518e;
        List<Y41.q<e<TSubject, Call>, TSubject, Continuation<? super G0>, Object>> listB = v0.b(arrayList);
        this.f400519a = kVar;
        this.f400520b = lVar;
        this.f400521c = listB;
        this.f400522d = true;
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }

    @Y61.k
    public final String toString() {
        return "Phase `" + this.f400519a.f400531a + "`, " + this.f400521c.size() + " handlers";
    }
}

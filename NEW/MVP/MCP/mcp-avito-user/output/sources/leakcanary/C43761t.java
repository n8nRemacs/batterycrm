package leakcanary;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.InterfaceC42819t;

/* compiled from: JobContext.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/t;", "", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
/* renamed from: leakcanary.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43761t {
    /* JADX WARN: Multi-variable type inference failed */
    public C43761t() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C43761t(int i12) {
        new ConcurrentHashMap();
    }

    public /* synthetic */ C43761t(Class cls, int i12, C42822w c42822w) {
        this(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C43761t(@Y61.k kotlin.reflect.d<?> dVar) {
        this(0);
        ((InterfaceC42819t) dVar).f();
    }
}

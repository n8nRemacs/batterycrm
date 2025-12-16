package io.ktor.client.engine;

import io.ktor.http.C41519f0;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "key", "", "values", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class B extends N implements Y41.p<String, List<? extends String>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f398852l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B(Y41.p<? super String, ? super String, G0> pVar) {
        super(2);
        this.f398852l = (N) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(String str, List<? extends String> list) {
        String str2 = str;
        List<? extends String> list2 = list;
        C41519f0.f400005a.getClass();
        if (!L.f(C41519f0.f400013i, str2) && !L.f(C41519f0.f400014j, str2)) {
            boolean zContains = C.f398853a.contains(str2);
            ?? r12 = this.f398852l;
            if (zContains) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    r12.invoke(str2, (String) it.next());
                }
            } else {
                r12.invoke(str2, C42745f0.O(list2, L.f(C41519f0.f400015k, str2) ? "; " : ",", null, null, null, 62));
            }
        }
        return G0.f406611a;
    }
}

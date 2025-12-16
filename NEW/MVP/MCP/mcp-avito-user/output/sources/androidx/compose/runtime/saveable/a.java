package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ListSaver.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Original", "Saveable", "Landroidx/compose/runtime/saveable/x;", "it", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class a extends N implements Y41.p<x, Object, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f38565l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Y41.p<? super x, Object, ? extends List<Object>> pVar) {
        super(2);
        this.f38565l = (N) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final Object invoke(x xVar, Object obj) {
        x xVar2 = xVar;
        List list = (List) this.f38565l.invoke(xVar2, obj);
        List list2 = list;
        int size = list2.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj2 = list.get(i12);
            if (obj2 != null && !xVar2.a(obj2)) {
                throw new IllegalArgumentException("item can't be saved");
            }
        }
        if (list2.isEmpty()) {
            return null;
        }
        return new ArrayList(list2);
    }
}

package androidx.compose.foundation.lazy.layout;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LazySaveableStateHolder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "", "restored", "Landroidx/compose/foundation/lazy/layout/s0;", "invoke", "(Ljava/util/Map;)Landroidx/compose/foundation/lazy/layout/s0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class u0 extends kotlin.jvm.internal.N implements Y41.l<Map<String, ? extends List<? extends Object>>, s0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.saveable.r f29544l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.saveable.l f29545m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(androidx.compose.runtime.saveable.r rVar, androidx.compose.runtime.saveable.l lVar) {
        super(1);
        this.f29544l = rVar;
        this.f29545m = lVar;
    }

    @Override // Y41.l
    public final s0 invoke(Map<String, ? extends List<? extends Object>> map) {
        return new s0(this.f29544l, map, this.f29545m);
    }
}

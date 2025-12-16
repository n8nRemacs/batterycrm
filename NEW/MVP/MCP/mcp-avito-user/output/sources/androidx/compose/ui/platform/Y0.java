package androidx.compose.ui.platform;

import androidx.compose.runtime.saveable.r;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/Y0;", "Landroidx/compose/runtime/saveable/r;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y0 implements androidx.compose.runtime.saveable.r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<kotlin.G0> f41334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.saveable.r f41335b;

    public Y0(@Y61.k androidx.compose.runtime.saveable.r rVar, @Y61.k Y41.a<kotlin.G0> aVar) {
        this.f41334a = aVar;
        this.f41335b = rVar;
    }

    @Override // androidx.compose.runtime.saveable.r
    public final boolean a(@Y61.k Object obj) {
        return this.f41335b.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.r
    @Y61.k
    public final Map<String, List<Object>> c() {
        return this.f41335b.c();
    }

    @Override // androidx.compose.runtime.saveable.r
    @Y61.k
    public final r.a d(@Y61.k String str, @Y61.k Y41.a<? extends Object> aVar) {
        return this.f41335b.d(str, aVar);
    }

    @Override // androidx.compose.runtime.saveable.r
    @Y61.l
    public final Object f(@Y61.k String str) {
        return this.f41335b.f(str);
    }
}

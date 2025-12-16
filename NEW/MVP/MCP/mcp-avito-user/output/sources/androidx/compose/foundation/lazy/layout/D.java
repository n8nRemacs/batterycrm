package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: LazyLayoutItemContentFactory.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class D extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f29260l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f29261m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29262n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f29263o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f29264p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(F f12, Object obj, int i12, Object obj2, int i13) {
        super(2);
        this.f29260l = f12;
        this.f29261m = obj;
        this.f29262n = i12;
        this.f29263o = obj2;
        this.f29264p = i13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f29264p | 1);
        int i12 = this.f29262n;
        Object obj = this.f29263o;
        E.a(this.f29260l, this.f29261m, i12, obj, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

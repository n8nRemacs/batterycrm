package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.storage.f;

/* compiled from: LockBasedStorageManager.java */
/* loaded from: classes8.dex */
class g extends f.i<Object> {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C42784z0 f409998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, Y41.a aVar, C42784z0 c42784z0) {
        super(fVar, aVar);
        this.f409998e = c42784z0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.f.g
    @Y61.k
    public final f.n<Object> d(boolean z12) {
        return new f.n<>(this.f409998e, false);
    }
}

package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.N;

/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes8.dex */
final class s extends N implements Y41.l<String, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t<Object, Object> f410339l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t<Object, Object> tVar) {
        super(1);
        this.f410339l = tVar;
    }

    @Override // Y41.l
    public final Integer invoke(String str) {
        return Integer.valueOf(this.f410339l.f410341b.getAndIncrement());
    }
}

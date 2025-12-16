package kotlin.reflect.jvm.internal;

import java.util.Comparator;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;

/* renamed from: kotlin.reflect.jvm.internal.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C43013w implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final Y41.p f410459b;

    public C43013w(Y41.p pVar) {
        this.f410459b = pVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        KDeclarationContainerImpl.a aVar = KDeclarationContainerImpl.f407017b;
        return ((Number) this.f410459b.invoke(obj, obj2)).intValue();
    }
}

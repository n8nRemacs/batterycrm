package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;

/* compiled from: Comparisons.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42935a<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t12, T t13) {
        return kotlin.comparisons.a.b(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.g((InterfaceC42851d) t12).b(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.g((InterfaceC42851d) t13).b());
    }
}

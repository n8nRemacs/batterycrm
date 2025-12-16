package Fc1;

import feedback.shared.sdk.api.network.entities.Campaign;
import java.util.Comparator;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13569b<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t12, T t13) {
        return kotlin.comparisons.a.b(Integer.valueOf(((Campaign) t12).getPriority()), Integer.valueOf(((Campaign) t13).getPriority()));
    }
}

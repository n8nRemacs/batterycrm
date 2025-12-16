package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

/* compiled from: _ArraysJvm.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/u;", "Lkotlin/collections/c;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42773u extends AbstractC42738c<Boolean> implements RandomAccess {
    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Boolean)) {
            return false;
        }
        ((Boolean) obj).booleanValue();
        throw null;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final Object get(int i12) {
        throw null;
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize */
    public final int getF406718e() {
        throw null;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        ((Boolean) obj).booleanValue();
        throw null;
    }

    @Override // kotlin.collections.AbstractC42734a, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        ((Boolean) obj).booleanValue();
        throw null;
    }
}

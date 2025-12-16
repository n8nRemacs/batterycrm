package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

/* compiled from: _ArraysJvm.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/v;", "Lkotlin/collections/c;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42775v extends AbstractC42738c<Character> implements RandomAccess {
    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Character)) {
            return false;
        }
        C42756l.J(null, ((Character) obj).charValue());
        throw null;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final Object get(int i12) {
        throw null;
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize */
    public final int getF38291e() {
        throw null;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Character)) {
            return -1;
        }
        C42756l.J(null, ((Character) obj).charValue());
        throw null;
    }

    @Override // kotlin.collections.AbstractC42734a, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Character)) {
            return -1;
        }
        ((Character) obj).charValue();
        throw null;
    }
}

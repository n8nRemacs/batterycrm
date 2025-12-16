package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.C0;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42756l;

/* compiled from: _UArraysJvm.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/unsigned/e;", "Lkotlin/collections/c;", "Lkotlin/C0;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e extends AbstractC42738c<C0> implements RandomAccess {
    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof C0)) {
            return false;
        }
        C42756l.L(null, ((C0) obj).f406603b);
        throw null;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final Object get(int i12) {
        throw null;
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize */
    public final int getF406660f() {
        throw null;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof C0)) {
            return -1;
        }
        C42756l.L(null, ((C0) obj).f406603b);
        throw null;
    }

    @Override // kotlin.collections.AbstractC42734a, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof C0)) {
            return -1;
        }
        short s5 = ((C0) obj).f406603b;
        throw null;
    }
}

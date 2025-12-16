package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

/* compiled from: _ArraysJvm.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/q;", "Lkotlin/collections/c;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42766q extends AbstractC42738c<Integer> implements RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int[] f406742c;

    public C42766q(int[] iArr) {
        this.f406742c = iArr;
    }

    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return C42756l.g(((Number) obj).intValue(), this.f406742c);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final Object get(int i12) {
        return Integer.valueOf(this.f406742c[i12]);
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize */
    public final int getF38291e() {
        return this.f406742c.length;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            return C42756l.G(((Number) obj).intValue(), this.f406742c);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC42734a, java.util.Collection
    public final boolean isEmpty() {
        return this.f406742c.length == 0;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f406742c;
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i12 = length - 1;
            if (iIntValue == iArr[length]) {
                return length;
            }
            if (i12 < 0) {
                return -1;
            }
            length = i12;
        }
    }
}

package kotlin.enums;

import Y61.k;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42756l;

/* compiled from: EnumEntries.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/enums/d;", "", "T", "Lkotlin/enums/a;", "Lkotlin/collections/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
final class d<T extends Enum<T>> extends AbstractC42738c<T> implements a<T>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final T[] f406753c;

    public d(@k T[] tArr) {
        this.f406753c = tArr;
    }

    private final Object writeReplace() {
        return new e(this.f406753c);
    }

    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        return ((Enum) C42756l.F(r42.ordinal(), this.f406753c)) == r42;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final Object get(int i12) {
        T[] tArr = this.f406753c;
        int length = tArr.length;
        AbstractC42738c.f406712b.getClass();
        AbstractC42738c.a.a(i12, length);
        return tArr[i12];
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize */
    public final int getF406718e() {
        return this.f406753c.length;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        if (((Enum) C42756l.F(iOrdinal, this.f406753c)) == r42) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }
}

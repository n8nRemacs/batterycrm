package kotlin;

import java.io.Serializable;

/* compiled from: Lazy.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/z;", "T", "Lkotlin/C;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43074z<T> implements InterfaceC42726C<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final T f410667b;

    public C43074z(T t12) {
        this.f410667b = t12;
    }

    @Override // kotlin.InterfaceC42726C
    public final T getValue() {
        return this.f410667b;
    }

    @Override // kotlin.InterfaceC42726C
    public final boolean isInitialized() {
        return true;
    }

    @Y61.k
    public final String toString() {
        return String.valueOf(this.f410667b);
    }
}

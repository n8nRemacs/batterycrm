package kotlin;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.jvm.internal.C42822w;

/* compiled from: UInt.kt */
@K0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/s0;", "", "a", "data", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
@X41.g
/* loaded from: classes8.dex */
public final class s0 implements Comparable<s0> {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f410475c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f410476b;

    /* compiled from: UInt.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lkotlin/s0$a;", "", "<init>", "()V", "Lkotlin/s0;", "MAX_VALUE", "I", "MIN_VALUE", "", "SIZE_BITS", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @X
    @kotlin.internal.g
    private /* synthetic */ s0(int i12) {
        this.f410476b = i12;
    }

    public static final /* synthetic */ s0 a(int i12) {
        return new s0(i12);
    }

    @Y61.k
    public static String b(int i12) {
        return String.valueOf(i12 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(s0 s0Var) {
        return kotlin.jvm.internal.L.g(this.f410476b ^ BeduinInputModel.MIN_TEXT_VERSION, s0Var.f410476b ^ BeduinInputModel.MIN_TEXT_VERSION);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s0) {
            return this.f410476b == ((s0) obj).f410476b;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f410476b);
    }

    @Y61.k
    public final String toString() {
        return b(this.f410476b);
    }
}

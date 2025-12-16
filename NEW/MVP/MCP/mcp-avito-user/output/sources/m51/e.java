package m51;

import Y61.k;
import java.util.Arrays;
import kotlin.jvm.internal.C42822w;

/* compiled from: JvmMetadataVersion.kt */
/* loaded from: classes8.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.a {

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @k
    public static final e f414319g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @k
    public static final e f414320h;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f414321f;

    /* compiled from: JvmMetadataVersion.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        e eVar = new e(new int[]{1, 9, 0}, false);
        f414319g = eVar;
        int i12 = eVar.f409093c;
        int i13 = eVar.f409092b;
        f414320h = (i13 == 1 && i12 == 9) ? new e(new int[]{2, 0, 0}, false) : new e(new int[]{i13, i12 + 1, 0}, false);
        new e(new int[0], false);
    }

    public e(@k int[] iArr, boolean z12) {
        super(Arrays.copyOf(iArr, iArr.length));
        this.f414321f = z12;
    }

    public final boolean b(@k e eVar) {
        e eVar2 = f414319g;
        int i12 = this.f409092b;
        int i13 = this.f409093c;
        if (i12 == 2 && i13 == 0 && eVar2.f409092b == 1 && eVar2.f409093c == 8) {
            return true;
        }
        eVar.getClass();
        if (!this.f414321f) {
            eVar2 = f414320h;
        }
        eVar2.getClass();
        int i14 = eVar.f409092b;
        int i15 = eVar2.f409092b;
        if (i15 > i14 || (i15 >= i14 && eVar2.f409093c > eVar.f409093c)) {
            eVar = eVar2;
        }
        boolean z12 = false;
        if ((i12 == 1 && i13 == 0) || i12 == 0) {
            return false;
        }
        int i16 = eVar.f409092b;
        if (i12 > i16 || (i12 >= i16 && i13 > eVar.f409093c)) {
            z12 = true;
        }
        return !z12;
    }
}

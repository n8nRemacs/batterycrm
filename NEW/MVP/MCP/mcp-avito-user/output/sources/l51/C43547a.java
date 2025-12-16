package l51;

import X41.f;
import Y61.k;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.l;

/* compiled from: BuiltInsBinaryVersion.kt */
/* renamed from: l51.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43547a extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C11773a f413510f = new C11773a(null);

    /* renamed from: g, reason: collision with root package name */
    @f
    @k
    public static final C43547a f413511g = new C43547a(1, 0, 7);

    /* compiled from: BuiltInsBinaryVersion.kt */
    @s0
    /* renamed from: l51.a$a, reason: collision with other inner class name */
    public static final class C11773a {
        public /* synthetic */ C11773a(C42822w c42822w) {
            this();
        }

        @k
        public static C43547a a(@k InputStream inputStream) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            l lVar = new l(1, dataInputStream.readInt(), 1);
            ArrayList arrayList = new ArrayList(C42745f0.q(lVar, 10));
            kotlin.ranges.k it = lVar.iterator();
            while (it.f406910d) {
                it.a();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrL0 = C42745f0.L0(arrayList);
            return new C43547a(Arrays.copyOf(iArrL0, iArrL0.length));
        }

        public C11773a() {
        }
    }

    static {
        new C43547a(new int[0]);
    }

    public C43547a(@k int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
    }
}

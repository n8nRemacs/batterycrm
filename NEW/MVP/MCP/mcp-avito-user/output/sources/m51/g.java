package m51;

import Y61.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.C42745f0;
import kotlin.collections.H0;
import kotlin.collections.I0;
import kotlin.collections.J0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* compiled from: JvmNameResolverBase.kt */
@s0
/* loaded from: classes8.dex */
public class g implements kotlin.reflect.jvm.internal.impl.metadata.deserialization.c {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final List<String> f414322d;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String[] f414323a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Set<Integer> f414324b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f414325c;

    /* compiled from: JvmNameResolverBase.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: JvmNameResolverBase.kt */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                JvmProtoBuf.StringTableTypes.Record.Operation operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                JvmProtoBuf.StringTableTypes.Record.Operation operation2 = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new a(null);
        String strO = C42745f0.O(C42745f0.U('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List<String> listU = C42745f0.U(strO.concat("/Any"), strO.concat("/Nothing"), strO.concat("/Unit"), strO.concat("/Throwable"), strO.concat("/Number"), strO.concat("/Byte"), strO.concat("/Double"), strO.concat("/Float"), strO.concat("/Int"), strO.concat("/Long"), strO.concat("/Short"), strO.concat("/Boolean"), strO.concat("/Char"), strO.concat("/CharSequence"), strO.concat("/String"), strO.concat("/Comparable"), strO.concat("/Enum"), strO.concat("/Array"), strO.concat("/ByteArray"), strO.concat("/DoubleArray"), strO.concat("/FloatArray"), strO.concat("/IntArray"), strO.concat("/LongArray"), strO.concat("/ShortArray"), strO.concat("/BooleanArray"), strO.concat("/CharArray"), strO.concat("/Cloneable"), strO.concat("/Annotation"), strO.concat("/collections/Iterable"), strO.concat("/collections/MutableIterable"), strO.concat("/collections/Collection"), strO.concat("/collections/MutableCollection"), strO.concat("/collections/List"), strO.concat("/collections/MutableList"), strO.concat("/collections/Set"), strO.concat("/collections/MutableSet"), strO.concat("/collections/Map"), strO.concat("/collections/MutableMap"), strO.concat("/collections/Map.Entry"), strO.concat("/collections/MutableMap.MutableEntry"), strO.concat("/collections/Iterator"), strO.concat("/collections/MutableIterator"), strO.concat("/collections/ListIterator"), strO.concat("/collections/MutableListIterator"));
        f414322d = listU;
        I0 i0S0 = C42745f0.S0(listU);
        int iF2 = P0.f(C42745f0.q(i0S0, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator it = i0S0.iterator();
        while (true) {
            J0 j02 = (J0) it;
            if (!j02.f406646b.hasNext()) {
                return;
            }
            H0 h02 = (H0) j02.next();
            linkedHashMap.put((String) h02.f406644b, Integer.valueOf(h02.f406643a));
        }
    }

    public g(@k String[] strArr, @k Set set, @k ArrayList arrayList) {
        this.f414323a = strArr;
        this.f414324b = set;
        this.f414325c = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @k
    public final String a(int i12) {
        return getString(i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    public final boolean b(int i12) {
        return this.f414324b.contains(Integer.valueOf(i12));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getString(int r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.f414325c
            java.lang.Object r0 = r0.get(r9)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r0
            int r1 = r0.f409170c
            r2 = r1 & 4
            r3 = 2
            r4 = 4
            if (r2 != r4) goto L29
            java.lang.Object r9 = r0.f409173f
            boolean r1 = r9 instanceof java.lang.String
            if (r1 == 0) goto L19
            java.lang.String r9 = (java.lang.String) r9
            goto L43
        L19:
            kotlin.reflect.jvm.internal.impl.protobuf.d r9 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r9
            java.lang.String r1 = r9.y()
            boolean r9 = r9.j()
            if (r9 == 0) goto L27
            r0.f409173f = r1
        L27:
            r9 = r1
            goto L43
        L29:
            r1 = r1 & r3
            if (r1 != r3) goto L3f
            java.util.List<java.lang.String> r1 = m51.g.f414322d
            int r2 = r1.size()
            int r4 = r0.f409172e
            if (r4 < 0) goto L3f
            if (r4 >= r2) goto L3f
            java.lang.Object r9 = r1.get(r4)
            java.lang.String r9 = (java.lang.String) r9
            goto L43
        L3f:
            java.lang.String[] r1 = r8.f414323a
            r9 = r1[r9]
        L43:
            java.util.List<java.lang.Integer> r1 = r0.f409175h
            int r1 = r1.size()
            r2 = 0
            r4 = 1
            if (r1 < r3) goto L81
            java.util.List<java.lang.Integer> r1 = r0.f409175h
            java.lang.Object r5 = r1.get(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r6 = r5.intValue()
            if (r6 < 0) goto L81
            int r6 = r5.intValue()
            int r7 = r1.intValue()
            if (r6 > r7) goto L81
            int r6 = r1.intValue()
            int r7 = r9.length()
            if (r6 > r7) goto L81
            int r5 = r5.intValue()
            int r1 = r1.intValue()
            java.lang.String r9 = r9.substring(r5, r1)
        L81:
            java.util.List<java.lang.Integer> r1 = r0.f409177j
            int r1 = r1.size()
            if (r1 < r3) goto La5
            java.util.List<java.lang.Integer> r1 = r0.f409177j
            java.lang.Object r2 = r1.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r2.intValue()
            char r2 = (char) r2
            int r1 = r1.intValue()
            char r1 = (char) r1
            java.lang.String r9 = r9.replace(r2, r1)
        La5:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation r0 = r0.f409174g
            if (r0 != 0) goto Lab
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation.NONE
        Lab:
            int r0 = r0.ordinal()
            r1 = 46
            r2 = 36
            if (r0 == r4) goto Lc7
            if (r0 == r3) goto Lb8
            goto Lcb
        Lb8:
            int r0 = r9.length()
            if (r0 < r3) goto Lc2
            java.lang.String r9 = androidx.compose.ui.graphics.colorspace.e.h(r4, r4, r9)
        Lc2:
            java.lang.String r9 = r9.replace(r2, r1)
            goto Lcb
        Lc7:
            java.lang.String r9 = r9.replace(r2, r1)
        Lcb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m51.g.getString(int):java.lang.String");
    }
}

package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import Y61.k;
import androidx.compose.foundation.H;
import java.util.LinkedList;
import java.util.List;
import kotlin.C42829l0;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: NameResolverImpl.kt */
/* loaded from: classes8.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ProtoBuf.i f409139a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ProtoBuf.QualifiedNameTable f409140b;

    /* compiled from: NameResolverImpl.kt */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind2 = ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(@k ProtoBuf.i iVar, @k ProtoBuf.QualifiedNameTable qualifiedNameTable) {
        this.f409139a = iVar;
        this.f409140b = qualifiedNameTable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @k
    public final String a(int i12) {
        C42829l0<List<String>, List<String>, Boolean> c42829l0C = c(i12);
        List<String> list = c42829l0C.f406871b;
        String strO = C42745f0.O(c42829l0C.f406872c, ".", null, null, null, 62);
        return list.isEmpty() ? strO : H.o(new StringBuilder(), C42745f0.O(list, "/", null, null, null, 62), '/', strO);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    public final boolean b(int i12) {
        return c(i12).f406873d.booleanValue();
    }

    public final C42829l0<List<String>, List<String>, Boolean> c(int i12) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z12 = false;
        while (i12 != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = this.f409140b.f408753c.get(i12);
            String str = this.f409139a.f409023c.get(qualifiedName.f408761e);
            int iOrdinal = qualifiedName.f408762f.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else if (iOrdinal == 2) {
                linkedList2.addFirst(str);
                z12 = true;
            }
            i12 = qualifiedName.f408760d;
        }
        return new C42829l0<>(linkedList, linkedList2, Boolean.valueOf(z12));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @k
    public final String getString(int i12) {
        return this.f409139a.f409023c.get(i12);
    }
}

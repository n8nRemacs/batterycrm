package kotlin.reflect.jvm.internal.impl.utils;

import Y41.l;
import Y61.k;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: DFS.java */
/* loaded from: classes8.dex */
public class b {

    /* JADX INFO: Add missing generic type declarations: [N] */
    /* compiled from: DFS.java */
    public static class a<N> extends AbstractC11701b<N, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f410349a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean[] f410350b;

        public a(l lVar, boolean[] zArr) {
            this.f410349a = lVar;
            this.f410350b = zArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public final Object a() {
            return Boolean.valueOf(this.f410350b[0]);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, java.lang.Object] */
        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC11701b, kotlin.reflect.jvm.internal.impl.utils.b.e
        public final boolean b(N n12) {
            boolean zBooleanValue = ((Boolean) this.f410349a.invoke(n12)).booleanValue();
            boolean[] zArr = this.f410350b;
            if (zBooleanValue) {
                zArr[0] = true;
            }
            return !zArr[0];
        }
    }

    /* compiled from: DFS.java */
    public static abstract class c<N, R, C extends Iterable<R>> extends AbstractC11701b<N, C> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LinkedList f410351a;

        public c(@k LinkedList linkedList) {
            this.f410351a = linkedList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        @k
        public final Object a() {
            LinkedList linkedList = this.f410351a;
            if (linkedList != null) {
                return linkedList;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler", "result"));
        }
    }

    /* compiled from: DFS.java */
    public interface d<N> {
        @k
        Iterable<? extends N> a(N n12);
    }

    /* compiled from: DFS.java */
    public interface e<N, R> {
        R a();

        boolean b(N n12);

        void c(N n12);
    }

    /* compiled from: DFS.java */
    public static abstract class f<N, R> extends c<N, R, LinkedList<R>> {
        public f() {
            super(new LinkedList());
        }
    }

    /* compiled from: DFS.java */
    public interface g<N> {
    }

    /* compiled from: DFS.java */
    public static class h<N> implements g<N> {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f410352a = new HashSet();
    }

    public static /* synthetic */ void a(int i12) {
        Object[] objArr = new Object[3];
        switch (i12) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i12) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Object b(@k Collection collection, @k d dVar, @k AbstractC11701b abstractC11701b) {
        if (collection == null) {
            a(4);
            throw null;
        }
        if (dVar == null) {
            a(5);
            throw null;
        }
        h hVar = new h();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c(it.next(), dVar, hVar, abstractC11701b);
        }
        return abstractC11701b.a();
    }

    public static void c(@k Object obj, @k d dVar, @k h hVar, @k AbstractC11701b abstractC11701b) {
        if (obj == null) {
            a(22);
            throw null;
        }
        if (dVar == null) {
            a(23);
            throw null;
        }
        if (hVar.f410352a.add(obj) && abstractC11701b.b(obj)) {
            Iterator it = dVar.a(obj).iterator();
            while (it.hasNext()) {
                c(it.next(), dVar, hVar, abstractC11701b);
            }
            abstractC11701b.c(obj);
        }
    }

    public static <N> Boolean d(@k Collection<N> collection, @k d<N> dVar, @k l<N, Boolean> lVar) {
        if (collection == null) {
            a(7);
            throw null;
        }
        if (dVar == null) {
            a(8);
            throw null;
        }
        if (lVar != null) {
            return (Boolean) b(collection, dVar, new a(lVar, new boolean[1]));
        }
        a(9);
        throw null;
    }

    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC11701b<N, R> implements e<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public boolean b(N n12) {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public void c(N n12) {
        }
    }
}

package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import androidx.datastore.preferences.protobuf.K1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema.java */
/* renamed from: androidx.datastore.preferences.protobuf.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC22929t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f45920a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f45921b;

    /* compiled from: ListFieldSchema.java */
    /* renamed from: androidx.datastore.preferences.protobuf.t0$b */
    public static final class b extends AbstractC22929t0 {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?> f45922c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <L> List<L> d(Object obj, long j12, int i12) {
            C22925r0 c22925r0;
            List<L> list = (List) K1.f45720d.m(obj, j12);
            if (list.isEmpty()) {
                List<L> c22925r02 = list instanceof InterfaceC22927s0 ? new C22925r0(i12) : ((list instanceof Y0) && (list instanceof C22914m0.k)) ? ((C22914m0.k) list).mutableCopyWithCapacity(i12) : new ArrayList<>(i12);
                K1.w(obj, j12, c22925r02);
                return c22925r02;
            }
            if (f45922c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i12);
                arrayList.addAll(list);
                K1.w(obj, j12, arrayList);
                c22925r0 = arrayList;
            } else {
                if (!(list instanceof J1)) {
                    if (!(list instanceof Y0) || !(list instanceof C22914m0.k)) {
                        return list;
                    }
                    C22914m0.k kVar = (C22914m0.k) list;
                    if (kVar.isModifiable()) {
                        return list;
                    }
                    C22914m0.k kVarMutableCopyWithCapacity = kVar.mutableCopyWithCapacity(list.size() + i12);
                    K1.w(obj, j12, kVarMutableCopyWithCapacity);
                    return kVarMutableCopyWithCapacity;
                }
                C22925r0 c22925r03 = new C22925r0(list.size() + i12);
                c22925r03.addAll((J1) list);
                K1.w(obj, j12, c22925r03);
                c22925r0 = c22925r03;
            }
            return c22925r0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22929t0
        public final void a(Object obj, long j12) {
            Object objUnmodifiableList;
            List list = (List) K1.f45720d.m(obj, j12);
            if (list instanceof InterfaceC22927s0) {
                objUnmodifiableList = ((InterfaceC22927s0) list).getUnmodifiableView();
            } else {
                if (f45922c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof Y0) && (list instanceof C22914m0.k)) {
                    C22914m0.k kVar = (C22914m0.k) list;
                    if (kVar.isModifiable()) {
                        kVar.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            K1.w(obj, j12, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22929t0
        public final void b(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, long j12) {
            List list = (List) K1.f45720d.m(generatedMessageLite2, j12);
            List listD = d(generatedMessageLite, j12, list.size());
            int size = listD.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listD.addAll(list);
            }
            if (size > 0) {
                list = listD;
            }
            K1.w(generatedMessageLite, j12, list);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22929t0
        public final <L> List<L> c(Object obj, long j12) {
            return d(obj, j12, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* renamed from: androidx.datastore.preferences.protobuf.t0$c */
    public static final class c extends AbstractC22929t0 {
        public c() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22929t0
        public final void a(Object obj, long j12) {
            ((C22914m0.k) K1.f45720d.m(obj, j12)).makeImmutable();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22929t0
        public final void b(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, long j12) {
            K1.e eVar = K1.f45720d;
            C22914m0.k kVarMutableCopyWithCapacity = (C22914m0.k) eVar.m(generatedMessageLite, j12);
            C22914m0.k kVar = (C22914m0.k) eVar.m(generatedMessageLite2, j12);
            int size = kVarMutableCopyWithCapacity.size();
            int size2 = kVar.size();
            if (size > 0 && size2 > 0) {
                if (!kVarMutableCopyWithCapacity.isModifiable()) {
                    kVarMutableCopyWithCapacity = kVarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
                }
                kVarMutableCopyWithCapacity.addAll(kVar);
            }
            if (size > 0) {
                kVar = kVarMutableCopyWithCapacity;
            }
            K1.w(generatedMessageLite, j12, kVar);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22929t0
        public final <L> List<L> c(Object obj, long j12) {
            C22914m0.k kVar = (C22914m0.k) K1.f45720d.m(obj, j12);
            if (kVar.isModifiable()) {
                return kVar;
            }
            int size = kVar.size();
            C22914m0.k kVarMutableCopyWithCapacity = kVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            K1.w(obj, j12, kVarMutableCopyWithCapacity);
            return kVarMutableCopyWithCapacity;
        }
    }

    static {
        f45920a = new b();
        f45921b = new c();
    }

    public abstract void a(Object obj, long j12);

    public abstract void b(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, long j12);

    public abstract <L> List<L> c(Object obj, long j12);

    public AbstractC22929t0() {
    }
}

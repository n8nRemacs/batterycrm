package com.google.protobuf;

import com.google.protobuf.C37670d0;
import com.google.protobuf.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema.java */
@InterfaceC37706w
/* renamed from: com.google.protobuf.l0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
abstract class AbstractC37686l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f362888a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f362889b;

    /* compiled from: ListFieldSchema.java */
    /* renamed from: com.google.protobuf.l0$b */
    public static final class b extends AbstractC37686l0 {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?> f362890c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <L> List<L> d(Object obj, long j12, int i12) {
            C37682j0 c37682j0;
            List<L> list = (List) r1.f362946c.m(obj, j12);
            if (list.isEmpty()) {
                List<L> c37682j02 = list instanceof InterfaceC37684k0 ? new C37682j0(i12) : ((list instanceof M0) && (list instanceof C37670d0.k)) ? ((C37670d0.k) list).mutableCopyWithCapacity2(i12) : new ArrayList<>(i12);
                r1.x(obj, j12, c37682j02);
                return c37682j02;
            }
            if (f362890c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i12);
                arrayList.addAll(list);
                r1.x(obj, j12, arrayList);
                c37682j0 = arrayList;
            } else {
                if (!(list instanceof p1)) {
                    if (!(list instanceof M0) || !(list instanceof C37670d0.k)) {
                        return list;
                    }
                    C37670d0.k kVar = (C37670d0.k) list;
                    if (kVar.isModifiable()) {
                        return list;
                    }
                    C37670d0.k kVarMutableCopyWithCapacity2 = kVar.mutableCopyWithCapacity2(list.size() + i12);
                    r1.x(obj, j12, kVarMutableCopyWithCapacity2);
                    return kVarMutableCopyWithCapacity2;
                }
                C37682j0 c37682j03 = new C37682j0(list.size() + i12);
                c37682j03.addAll((p1) list);
                r1.x(obj, j12, c37682j03);
                c37682j0 = c37682j03;
            }
            return c37682j0;
        }

        @Override // com.google.protobuf.AbstractC37686l0
        public final void a(Object obj, long j12) {
            Object objUnmodifiableList;
            List list = (List) r1.f362946c.m(obj, j12);
            if (list instanceof InterfaceC37684k0) {
                objUnmodifiableList = ((InterfaceC37684k0) list).getUnmodifiableView();
            } else {
                if (f362890c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof M0) && (list instanceof C37670d0.k)) {
                    C37670d0.k kVar = (C37670d0.k) list;
                    if (kVar.isModifiable()) {
                        kVar.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            r1.x(obj, j12, objUnmodifiableList);
        }

        @Override // com.google.protobuf.AbstractC37686l0
        public final <E> void b(Object obj, Object obj2, long j12) {
            List list = (List) r1.f362946c.m(obj2, j12);
            List listD = d(obj, j12, list.size());
            int size = listD.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listD.addAll(list);
            }
            if (size > 0) {
                list = listD;
            }
            r1.x(obj, j12, list);
        }

        @Override // com.google.protobuf.AbstractC37686l0
        public final <L> List<L> c(Object obj, long j12) {
            return d(obj, j12, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* renamed from: com.google.protobuf.l0$c */
    public static final class c extends AbstractC37686l0 {
        public c() {
            super();
        }

        @Override // com.google.protobuf.AbstractC37686l0
        public final void a(Object obj, long j12) {
            ((C37670d0.k) r1.f362946c.m(obj, j12)).makeImmutable();
        }

        @Override // com.google.protobuf.AbstractC37686l0
        public final <E> void b(Object obj, Object obj2, long j12) {
            r1.e eVar = r1.f362946c;
            C37670d0.k kVarMutableCopyWithCapacity2 = (C37670d0.k) eVar.m(obj, j12);
            C37670d0.k kVar = (C37670d0.k) eVar.m(obj2, j12);
            int size = kVarMutableCopyWithCapacity2.size();
            int size2 = kVar.size();
            if (size > 0 && size2 > 0) {
                if (!kVarMutableCopyWithCapacity2.isModifiable()) {
                    kVarMutableCopyWithCapacity2 = kVarMutableCopyWithCapacity2.mutableCopyWithCapacity2(size2 + size);
                }
                kVarMutableCopyWithCapacity2.addAll(kVar);
            }
            if (size > 0) {
                kVar = kVarMutableCopyWithCapacity2;
            }
            r1.x(obj, j12, kVar);
        }

        @Override // com.google.protobuf.AbstractC37686l0
        public final <L> List<L> c(Object obj, long j12) {
            C37670d0.k kVar = (C37670d0.k) r1.f362946c.m(obj, j12);
            if (kVar.isModifiable()) {
                return kVar;
            }
            int size = kVar.size();
            C37670d0.k kVarMutableCopyWithCapacity2 = kVar.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            r1.x(obj, j12, kVarMutableCopyWithCapacity2);
            return kVarMutableCopyWithCapacity2;
        }
    }

    static {
        f362888a = new b();
        f362889b = new c();
    }

    public abstract void a(Object obj, long j12);

    public abstract <L> void b(Object obj, Object obj2, long j12);

    public abstract <L> List<L> c(Object obj, long j12);

    public AbstractC37686l0() {
    }
}

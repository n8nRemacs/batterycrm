package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: ClassicBuiltinSpecialProperties.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42918k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C42918k f408069a = new C42918k();

    /* compiled from: ClassicBuiltinSpecialProperties.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.k$a */
    public static final class a extends N implements Y41.l<CallableMemberDescriptor, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f408070l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            C42918k.f408069a.getClass();
            return Boolean.valueOf(C42918k.b(callableMemberDescriptor));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Y61.l
    public static String a(@Y61.k CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.builtins.k.y(callableMemberDescriptor);
        CallableMemberDescriptor callableMemberDescriptorB = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.b(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(callableMemberDescriptor), a.f408070l);
        if (callableMemberDescriptorB == null) {
            return null;
        }
        C42916i.f408064a.getClass();
        kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) C42916i.f408065b.get(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.g(callableMemberDescriptorB));
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public static boolean b(@Y61.k CallableMemberDescriptor callableMemberDescriptor) {
        C42916i.f408064a.getClass();
        if (!C42916i.f408068e.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (!C42745f0.r(C42916i.f408067d, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.c(callableMemberDescriptor)) || !callableMemberDescriptor.g().isEmpty()) {
            if (!kotlin.reflect.jvm.internal.impl.builtins.k.y(callableMemberDescriptor)) {
                return false;
            }
            Collection<? extends CallableMemberDescriptor> collectionP = callableMemberDescriptor.p();
            if (collectionP.isEmpty()) {
                return false;
            }
            for (CallableMemberDescriptor callableMemberDescriptor2 : collectionP) {
                f408069a.getClass();
                if (b(callableMemberDescriptor2)) {
                }
            }
            return false;
        }
        return true;
    }
}

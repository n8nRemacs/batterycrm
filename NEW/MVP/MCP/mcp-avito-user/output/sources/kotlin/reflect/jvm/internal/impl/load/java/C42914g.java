package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;

/* compiled from: specialBuiltinMembers.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42914g extends SpecialGenericSignatures {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final C42914g f408061m = new C42914g();

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.g$a */
    public static final class a extends N implements Y41.l<CallableMemberDescriptor, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f408062l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            C42914g.f408061m.getClass();
            SpecialGenericSignatures.f407963a.getClass();
            return Boolean.valueOf(C42745f0.r(SpecialGenericSignatures.f407969g, kotlin.reflect.jvm.internal.impl.load.kotlin.E.b(callableMemberDescriptor)));
        }
    }

    @X41.n
    @Y61.l
    public static final InterfaceC42905x a(@Y61.k InterfaceC42905x interfaceC42905x) {
        kotlin.reflect.jvm.internal.impl.name.f name = interfaceC42905x.getName();
        f408061m.getClass();
        if (b(name)) {
            return (InterfaceC42905x) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.b(interfaceC42905x, a.f408062l);
        }
        return null;
    }

    public static boolean b(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        SpecialGenericSignatures.f407963a.getClass();
        return SpecialGenericSignatures.f407968f.contains(fVar);
    }
}

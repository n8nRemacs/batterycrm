package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.G0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.m;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.s;

/* compiled from: DescriptorResolverUtils.java */
/* loaded from: classes8.dex */
final class a extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f408004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f408005b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f408006c;

    /* compiled from: DescriptorResolverUtils.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a$a, reason: collision with other inner class name */
    public class C11658a implements Y41.l<CallableMemberDescriptor, G0> {
        public C11658a() {
        }

        @Override // Y41.l
        public final G0 invoke(@Y61.k CallableMemberDescriptor callableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
            if (callableMemberDescriptor2 == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
            }
            a.this.f408004a.b(callableMemberDescriptor2);
            return G0.f406611a;
        }
    }

    public a(s sVar, LinkedHashSet linkedHashSet, boolean z12) {
        this.f408004a = sVar;
        this.f408005b = linkedHashSet;
        this.f408006c = z12;
    }

    public static /* synthetic */ void d(int i12) {
        Object[] objArr = new Object[3];
        if (i12 == 1) {
            objArr[0] = "fromSuper";
        } else if (i12 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i12 == 3) {
            objArr[0] = "member";
        } else if (i12 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i12 == 1 || i12 == 2) {
            objArr[2] = "conflict";
        } else if (i12 == 3 || i12 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.n
    public final void a(@Y61.k CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            d(0);
            throw null;
        }
        OverridingUtil.r(callableMemberDescriptor, new C11658a());
        this.f408005b.add(callableMemberDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.n
    public final void b(@Y61.k CallableMemberDescriptor callableMemberDescriptor, @Y61.k Collection<? extends CallableMemberDescriptor> collection) {
        if (callableMemberDescriptor == null) {
            d(3);
            throw null;
        }
        if (!this.f408006c || callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.f407409c) {
            callableMemberDescriptor.l0(collection);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.m
    public final void c(@Y61.k CallableMemberDescriptor callableMemberDescriptor, @Y61.k CallableMemberDescriptor callableMemberDescriptor2) {
        if (callableMemberDescriptor == null) {
            d(1);
            throw null;
        }
        if (callableMemberDescriptor2 != null) {
            return;
        }
        d(2);
        throw null;
    }
}

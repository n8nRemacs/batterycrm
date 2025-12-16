package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* compiled from: EnumEntrySyntheticClassDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C42874s extends kotlin.reflect.jvm.internal.impl.resolve.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f407698a;

    public C42874s(LinkedHashSet linkedHashSet) {
        this.f407698a = linkedHashSet;
    }

    public static /* synthetic */ void d(int i12) {
        Object[] objArr = new Object[3];
        if (i12 == 1) {
            objArr[0] = "fromSuper";
        } else if (i12 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i12 == 1 || i12 == 2) {
            objArr[2] = "conflict";
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
        OverridingUtil.r(callableMemberDescriptor, null);
        this.f407698a.add(callableMemberDescriptor);
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

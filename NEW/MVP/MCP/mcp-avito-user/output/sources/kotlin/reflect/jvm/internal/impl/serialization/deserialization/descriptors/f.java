package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.C42901t;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* compiled from: DeserializedClassDescriptor.kt */
/* loaded from: classes8.dex */
public final class f extends kotlin.reflect.jvm.internal.impl.resolve.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f409844a;

    public f(ArrayList arrayList) {
        this.f409844a = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.n
    public final void a(@Y61.k CallableMemberDescriptor callableMemberDescriptor) {
        OverridingUtil.r(callableMemberDescriptor, null);
        this.f409844a.add(callableMemberDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.m
    public final void c(@Y61.k CallableMemberDescriptor callableMemberDescriptor, @Y61.k CallableMemberDescriptor callableMemberDescriptor2) {
        if (callableMemberDescriptor2 instanceof AbstractC42878w) {
            ((AbstractC42878w) callableMemberDescriptor2).K0(C42901t.f407878a, callableMemberDescriptor);
        }
    }
}

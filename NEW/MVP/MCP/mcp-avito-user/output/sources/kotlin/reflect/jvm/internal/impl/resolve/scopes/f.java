package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* compiled from: GivenFunctionsMemberScope.kt */
/* loaded from: classes8.dex */
public final class f extends kotlin.reflect.jvm.internal.impl.resolve.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList<InterfaceC42882k> f409675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f409676b;

    public f(ArrayList<InterfaceC42882k> arrayList, g gVar) {
        this.f409675a = arrayList;
        this.f409676b = gVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.n
    public final void a(@Y61.k CallableMemberDescriptor callableMemberDescriptor) {
        OverridingUtil.r(callableMemberDescriptor, null);
        this.f409675a.add(callableMemberDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.m
    public final void c(@Y61.k CallableMemberDescriptor callableMemberDescriptor, @Y61.k CallableMemberDescriptor callableMemberDescriptor2) {
        throw new IllegalStateException(("Conflict in scope of " + this.f409676b.f409678b + ": " + callableMemberDescriptor + " vs " + callableMemberDescriptor2).toString());
    }
}

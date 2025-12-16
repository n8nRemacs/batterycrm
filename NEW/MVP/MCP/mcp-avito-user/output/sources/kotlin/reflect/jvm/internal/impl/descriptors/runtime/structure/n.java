package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import kotlin.jvm.internal.m0;

/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes8.dex */
final /* synthetic */ class n extends kotlin.jvm.internal.G implements Y41.l<Member, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final n f407865b = new n();

    public n() {
        super(1);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
    @Y61.k
    /* renamed from: getName */
    public final String getF407039i() {
        return "isSynthetic";
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final kotlin.reflect.h getOwner() {
        return m0.f406844a.b(Member.class);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // Y41.l
    public final Boolean invoke(Member member) {
        return Boolean.valueOf(member.isSynthetic());
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: ScopesHolderForClass.kt */
/* loaded from: classes8.dex */
final class Z extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.j> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y<kotlin.reflect.jvm.internal.impl.resolve.scopes.j> f407454l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Y<kotlin.reflect.jvm.internal.impl.resolve.scopes.j> y12) {
        super(0);
        this.f407454l = y12;
    }

    @Override // Y41.a
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j invoke() {
        Y<kotlin.reflect.jvm.internal.impl.resolve.scopes.j> y12 = this.f407454l;
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.j) y12.f407451b.invoke(y12.f407452c);
    }
}

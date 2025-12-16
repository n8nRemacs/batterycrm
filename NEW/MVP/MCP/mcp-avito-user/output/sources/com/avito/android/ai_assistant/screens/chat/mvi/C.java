package com.avito.android.ai_assistant.screens.chat.mvi;

/* compiled from: AiAssistantChatFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final z f89192a;

    /* renamed from: b, reason: collision with root package name */
    public final u f89193b;

    /* renamed from: c, reason: collision with root package name */
    public final G f89194c;

    /* renamed from: d, reason: collision with root package name */
    public final J f89195d;

    /* renamed from: e, reason: collision with root package name */
    public final E f89196e;

    public C(z zVar, u uVar, G g12, J j12, E e12) {
        this.f89192a = zVar;
        this.f89193b = uVar;
        this.f89194c = g12;
        this.f89195d = j12;
        this.f89196e = e12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        y yVar = (y) this.f89192a.get();
        C28362a c28362a = (C28362a) this.f89193b.get();
        this.f89194c.getClass();
        F f12 = new F();
        return new B("AiAssistant", ((D) this.f89196e.get()).a(), new A(yVar, c28362a, (H) this.f89195d.get(), f12));
    }
}

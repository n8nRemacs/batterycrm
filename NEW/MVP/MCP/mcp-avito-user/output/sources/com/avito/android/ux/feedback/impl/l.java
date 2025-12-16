package com.avito.android.ux.feedback.impl;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoUxFeedbackRxDelegateImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ux/feedback/impl/l;", "Ldagger/internal/h;", "Lcom/avito/android/ux/feedback/impl/j;", "a", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f319160c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f319161a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f319162b;

    /* compiled from: AvitoUxFeedbackRxDelegateImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ux/feedback/impl/l$a;", "", "<init>", "()V", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f319161a = uVar;
        this.f319162b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        SK0.b bVar = (SK0.b) this.f319161a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f319162b.get();
        f319160c.getClass();
        return new j(bVar, interfaceC35745a5);
    }
}

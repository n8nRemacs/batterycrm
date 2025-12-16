package com.avito.android.ux.feedback.impl;

import com.avito.android.InterfaceC32900o;
import com.avito.android.account.G;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoUxFeedbackImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ux/feedback/impl/e;", "Ldagger/internal/h;", "Lcom/avito/android/ux/feedback/impl/d;", "a", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f319147e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<b> f319148a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<G> f319149b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final VK0.c f319150c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC32900o> f319151d;

    /* compiled from: AvitoUxFeedbackImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ux/feedback/impl/e$a;", "", "<init>", "()V", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k VK0.c cVar, @Y61.k Provider provider3) {
        this.f319148a = provider;
        this.f319149b = provider2;
        this.f319150c = cVar;
        this.f319151d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = this.f319148a.get();
        G g12 = this.f319149b.get();
        VK0.a aVar = (VK0.a) this.f319150c.get();
        InterfaceC32900o interfaceC32900o = this.f319151d.get();
        f319147e.getClass();
        return new d(bVar, g12, aVar, interfaceC32900o);
    }
}

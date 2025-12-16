package com.avito.android.deep_linking;

import Mu.InterfaceC14529b;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppLinkInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/j;", "Ldagger/internal/h;", "Lcom/avito/android/deep_linking/h;", "a", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deep_linking.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29672j implements dagger.internal.h<C29670h> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f132913c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC14529b> f132914a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f132915b;

    /* compiled from: AppLinkInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/j$a;", "", "<init>", "()V", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deep_linking.j$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C29672j(@Y61.k Provider<InterfaceC14529b> provider, @Y61.k Provider<InterfaceC35745a5> provider2) {
        this.f132914a = provider;
        this.f132915b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14529b interfaceC14529b = this.f132914a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f132915b.get();
        f132913c.getClass();
        return new C29670h(interfaceC14529b, interfaceC35745a5);
    }
}

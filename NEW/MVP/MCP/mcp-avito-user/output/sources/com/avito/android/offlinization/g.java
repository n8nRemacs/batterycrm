package com.avito.android.offlinization;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import t40.C48501d;
import t40.InterfaceC48498a;
import z40.InterfaceC50372a;

/* compiled from: OfflineInfoExtractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/g;", "Ldagger/internal/h;", "Lcom/avito/android/offlinization/f;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f208584c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C48501d f208585a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f208586b;

    /* compiled from: OfflineInfoExtractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/g$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k C48501d c48501d, @Y61.k dagger.internal.u uVar) {
        this.f208585a = c48501d;
        this.f208586b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48498a interfaceC48498a = (InterfaceC48498a) this.f208585a.get();
        InterfaceC50372a interfaceC50372a = (InterfaceC50372a) this.f208586b.get();
        f208584c.getClass();
        return new f(interfaceC48498a, interfaceC50372a);
    }
}

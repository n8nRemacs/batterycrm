package com.avito.android.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: InitializeOperator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/t2;", "", "T", "Lio/reactivex/rxjava3/core/D;", "a", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.t2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35946t2<T> implements io.reactivex.rxjava3.core.D<T, T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35881r2 f319054a;

    /* compiled from: InitializeOperator.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/t2$a;", "", "T", "Lio/reactivex/rxjava3/observers/e;", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.t2$a */
    public static final class a<T> extends io.reactivex.rxjava3.observers.e<T> {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final io.reactivex.rxjava3.core.G<T> f319055c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final InterfaceC35881r2 f319056d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public List<T> f319057e = Collections.synchronizedList(new ArrayList());

        public a(@Y61.k io.reactivex.rxjava3.core.G<T> g12, @Y61.k InterfaceC35881r2 interfaceC35881r2) {
            this.f319055c = g12;
            this.f319056d = interfaceC35881r2;
        }

        @Override // io.reactivex.rxjava3.observers.e
        public final void a() {
            this.f319055c.b(this);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f319055c.e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(@Y61.k Throwable th2) {
            this.f319055c.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(@Y61.k T t12) {
            if (this.f319056d.getF318637a()) {
                this.f319055c.onNext(t12);
                return;
            }
            List<T> list = this.f319057e;
            if (list != null) {
                list.add(t12);
            }
            InterfaceC35881r2 interfaceC35881r2 = this.f319056d;
            interfaceC35881r2.a();
            if (!interfaceC35881r2.getF318637a()) {
                onError(new IllegalStateException("Initializable is not initialized"));
                return;
            }
            List<T> list2 = this.f319057e;
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    onNext(it.next());
                }
            }
            this.f319057e = null;
        }
    }

    public C35946t2(@Y61.k InterfaceC35881r2 interfaceC35881r2) {
        this.f319054a = interfaceC35881r2;
    }

    @Y61.k
    public final io.reactivex.rxjava3.core.G<? super T> a(@Y61.k io.reactivex.rxjava3.core.G<? super T> g12) {
        return new a(g12, this.f319054a);
    }
}

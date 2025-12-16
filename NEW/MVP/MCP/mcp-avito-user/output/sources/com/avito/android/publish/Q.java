package com.avito.android.publish;

import com.avito.android.publish.analytics.InterfaceC33527m;
import com.avito.android.remote.model.Profile;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;

/* compiled from: ProfileSourceInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q;", "Lcom/avito/android/publish/P;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Q implements P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.X f232031a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33527m f232032b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f232033c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public volatile Profile f232034d;

    /* compiled from: ProfileSourceInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Profile;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/Profile;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Q.this.f232032b.b();
        }
    }

    /* compiled from: ProfileSourceInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Q.this.f232032b.a((Throwable) obj);
        }
    }

    /* compiled from: ProfileSourceInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Profile;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/Profile;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Q.this.f232034d = (Profile) obj;
        }
    }

    public Q(@Y61.k com.avito.android.remote.X x12, @Y61.k InterfaceC33527m interfaceC33527m, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f232031a = x12;
        this.f232032b = interfaceC33527m;
        this.f232033c = interfaceC35745a5;
    }

    @Override // com.avito.android.publish.P
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Profile> a() {
        this.f232032b.c();
        Profile profile = this.f232034d;
        return profile != null ? io.reactivex.rxjava3.core.I.q(profile) : this.f232031a.a().S().k(new a()).i(new b()).z(this.f232033c.a()).k(new c());
    }

    @Override // com.avito.android.publish.P
    public final void b(@Y61.k Profile profile) {
        this.f232034d = profile;
    }
}

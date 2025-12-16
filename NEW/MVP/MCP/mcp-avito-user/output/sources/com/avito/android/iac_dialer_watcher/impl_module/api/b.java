package com.avito.android.iac_dialer_watcher.impl_module.api;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.remote.model.TypedResult;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.MultipartBody;

/* compiled from: IacDialerWatcherApiImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/api/b;", "Lcom/avito/android/iac_dialer_watcher/impl_module/api/a;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.iac_dialer_watcher.impl_module.api.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<e> f167778a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.iac_api_utils.util_module.a f167779b;

    /* compiled from: IacDialerWatcherApiImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "m", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f167780l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacApiTracker", str, null);
            return G0.f406611a;
        }
    }

    /* compiled from: IacDialerWatcherApiImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "m", "", "e", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.iac_dialer_watcher.impl_module.api.b$b, reason: collision with other inner class name */
    public static final class C4967b extends N implements p<String, Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4967b f167781l = new C4967b();

        public C4967b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Throwable th2) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("IacApiTracker", str, th2);
            return G0.f406611a;
        }
    }

    /* compiled from: IacDialerWatcherApiImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<I<TypedResult<Object>>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MultipartBody.Part f167783m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ MultipartBody.Part f167784n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ MultipartBody.Part f167785o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MultipartBody.Part part, MultipartBody.Part part2, MultipartBody.Part part3) {
            super(0);
            this.f167783m = part;
            this.f167784n = part2;
            this.f167785o = part3;
        }

        @Override // Y41.a
        public final I<TypedResult<Object>> invoke() {
            return b.this.f167778a.get().a(this.f167783m, this.f167784n, this.f167785o);
        }
    }

    @Inject
    public b(@k h31.e<e> eVar, @k com.avito.android.iac_api_utils.util_module.a aVar) {
        this.f167778a = eVar;
        this.f167779b = aVar;
        aVar.b(a.f167780l, C4967b.f167781l);
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.api.a
    @k
    public final I<TypedResult<Object>> a(@k MultipartBody.Part part, @k MultipartBody.Part part2, @k MultipartBody.Part part3) {
        return this.f167779b.a("uploadLog", new String[]{"uploadId=" + part, "header=" + part3}, new c(part, part2, part3));
    }
}

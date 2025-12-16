package com.avito.android.app.task;

import android.annotation.SuppressLint;
import android.app.Application;
import com.avito.android.di.module.InterfaceC30072i6;
import com.avito.android.remote.model.ProfileInfo;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import java.util.Arrays;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* compiled from: SendRostelecomUserHashTask.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B)\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/avito/android/app/task/SendRostelecomUserHashTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lh31/e;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lcom/avito/android/account/G;", "accountStorageInteractor", "Lcom/avito/android/util/a5;", "schedulers", "<init>", "(Lh31/e;Lcom/avito/android/account/G;Lcom/avito/android/util/a5;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lh31/e;", "Lcom/avito/android/account/G;", "Lcom/avito/android/util/a5;", "Companion", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SendRostelecomUserHashTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final com.avito.android.account.G accountStorageInteractor;

    @Y61.k
    private final h31.e<OkHttpClient> okHttpClient;

    @Y61.k
    private final InterfaceC35745a5 schedulers;

    /* compiled from: SendRostelecomUserHashTask.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/ProfileInfo;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f91526b = new b<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            String userHashId = ((ProfileInfo) obj).getUserHashId();
            return !(userHashId == null || userHashId.length() == 0);
        }
    }

    /* compiled from: SendRostelecomUserHashTask.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lokhttp3/Request;", "it", "Lcom/avito/android/remote/model/ProfileInfo;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f91527b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            Request.Builder builder = new Request.Builder();
            kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            return builder.url(String.format("https://%s.rt.avito.ru", Arrays.copyOf(new Object[]{((ProfileInfo) obj).getUserHashId()}, 1))).build();
        }
    }

    /* compiled from: SendRostelecomUserHashTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lokhttp3/Call;", "request", "Lokhttp3/Request;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d<T, R> implements l41.o {
        public d() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((OkHttpClient) SendRostelecomUserHashTask.this.okHttpClient.get()).newBuilder().build().newCall((Request) obj);
        }
    }

    /* compiled from: SendRostelecomUserHashTask.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lokhttp3/Call;", "kotlin.jvm.PlatformType", "call", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lokhttp3/Call;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T, R> f91529b = new e<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Call) obj).execute().close();
            return C41823n.f402260b;
        }
    }

    /* compiled from: SendRostelecomUserHashTask.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends kotlin.jvm.internal.H implements Y41.l<Throwable, kotlin.G0> {
        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            ((V2) this.receiver).f(th2);
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public SendRostelecomUserHashTask(@Y61.k @InterfaceC30072i6 h31.e<OkHttpClient> eVar, @Y61.k com.avito.android.account.G g12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.okHttpClient = eVar;
        this.accountStorageInteractor = g12;
        this.schedulers = interfaceC35745a5;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    @SuppressLint({"CheckResult"})
    public void execute(@Y61.k Application application) {
        io.reactivex.rxjava3.internal.operators.maybe.c0 c0VarK = this.accountStorageInteractor.j().g(b.f91526b).j(c.f91527b).j(new d()).k(this.schedulers.a());
        l41.o oVar = e.f91529b;
        Objects.requireNonNull(oVar, "mapper is null");
        io.reactivex.rxjava3.kotlin.A1.f(new io.reactivex.rxjava3.internal.operators.maybe.D(c0VarK, oVar), new f(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), null, 2);
    }
}

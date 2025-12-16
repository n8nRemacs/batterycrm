package com.avito.android.version_conflict;

import Y41.p;
import Y41.q;
import aN0.C19794a;
import android.content.SharedPreferences;
import android.os.Build;
import com.avito.android.P;
import com.avito.android.app.task.ApplicationForegroundStartupTask;
import com.avito.android.remote.C34390u;
import com.avito.android.remote.config.AppConfig;
import com.avito.android.remote.model.Navigation;
import com.avito.android.util.C;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vz.InterfaceC49400a;
import vz.InterfaceC49401b;

/* compiled from: CheckConfigTask.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/avito/android/version_conflict/CheckConfigTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Lcom/avito/android/version_conflict/b;", "configStorage", "Lcom/avito/android/remote/u;", "configApiRepository", "Lcom/avito/android/util/C;", "buildInfo", "Lcom/avito/android/remote/config/b;", "appConfigVersionValidator", "LaN0/a;", "versionStatusRepository", "Lcom/avito/android/version_conflict/i;", "versionConflictScreenOpener", "Lvz/b;", "appEntrypointProvider", "Lcom/avito/android/P;", "coreFeatures", "Lcom/avito/android/util/R0;", "dispatchers", "<init>", "(Lcom/avito/android/version_conflict/b;Lcom/avito/android/remote/u;Lcom/avito/android/util/C;Lcom/avito/android/remote/config/b;LaN0/a;Lcom/avito/android/version_conflict/i;Lvz/b;Lcom/avito/android/P;Lcom/avito/android/util/R0;)V", "Lcom/avito/android/remote/config/AppConfig;", Navigation.CONFIG, "", "forceSkipProposal", "Lkotlin/G0;", "processConfig", "(Lcom/avito/android/remote/config/AppConfig;Z)V", "saveConfig", "(Lcom/avito/android/remote/config/AppConfig;)V", "getConfig", "()Lcom/avito/android/remote/config/AppConfig;", "shouldSkipProposalDialog", "()Z", "execute", "()V", "Lcom/avito/android/version_conflict/b;", "Lcom/avito/android/remote/u;", "Lcom/avito/android/util/C;", "Lcom/avito/android/remote/config/b;", "LaN0/a;", "Lcom/avito/android/version_conflict/i;", "Lvz/b;", "Lcom/avito/android/P;", "Lkotlinx/coroutines/T;", "scope", "Lkotlinx/coroutines/T;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckConfigTask implements ApplicationForegroundStartupTask {

    @Y61.k
    private final com.avito.android.remote.config.b appConfigVersionValidator;

    @Y61.k
    private final InterfaceC49401b appEntrypointProvider;

    @Y61.k
    private final C buildInfo;

    @Y61.k
    private final C34390u configApiRepository;

    @Y61.k
    private final com.avito.android.version_conflict.b configStorage;

    @Y61.k
    private final P coreFeatures;

    @Y61.k
    private final T scope;

    @Y61.k
    private final i versionConflictScreenOpener;

    @Y61.k
    private final C19794a versionStatusRepository;

    /* compiled from: CheckConfigTask.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/config/AppConfig;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.version_conflict.CheckConfigTask$execute$1", f = "CheckConfigTask.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements q<InterfaceC43172j<? super AppConfig>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f325849q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f325850r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f325851s;

        public a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AppConfig> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            a aVar = CheckConfigTask.this.new a(continuation);
            aVar.f325850r = interfaceC43172j;
            aVar.f325851s = th2;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f325849q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f325850r;
                V2.f318762a.f(this.f325851s);
                AppConfig config = CheckConfigTask.this.getConfig();
                this.f325850r = null;
                this.f325849q = 1;
                if (interfaceC43172j.emit(config, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CheckConfigTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/config/AppConfig;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/config/AppConfig;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.version_conflict.CheckConfigTask$execute$2", f = "CheckConfigTask.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<AppConfig, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f325853q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = CheckConfigTask.this.new b(continuation);
            bVar.f325853q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(AppConfig appConfig, Continuation<? super G0> continuation) {
            return ((b) create(appConfig, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            AppConfig appConfig = (AppConfig) this.f325853q;
            CheckConfigTask checkConfigTask = CheckConfigTask.this;
            checkConfigTask.processConfig(appConfig, checkConfigTask.shouldSkipProposalDialog());
            return G0.f406611a;
        }
    }

    @Inject
    public CheckConfigTask(@Y61.k com.avito.android.version_conflict.b bVar, @Y61.k C34390u c34390u, @Y61.k C c12, @Y61.k com.avito.android.remote.config.b bVar2, @Y61.k C19794a c19794a, @Y61.k i iVar, @Y61.k InterfaceC49401b interfaceC49401b, @Y61.k P p12, @Y61.k R0 r02) {
        this.configStorage = bVar;
        this.configApiRepository = c34390u;
        this.buildInfo = c12;
        this.appConfigVersionValidator = bVar2;
        this.versionStatusRepository = c19794a;
        this.versionConflictScreenOpener = iVar;
        this.appEntrypointProvider = interfaceC49401b;
        this.coreFeatures = p12;
        this.scope = U.a(r02.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConfig getConfig() {
        AppConfig appConfigA = this.configStorage.a();
        return appConfigA == null ? new AppConfig(0L, 0L, null, 0, com.avito.android.remote.config.a.f253352a, null, null, null, null, null, null) : appConfigA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processConfig(AppConfig config, boolean forceSkipProposal) {
        saveConfig(config);
        C19794a c19794a = this.versionStatusRepository;
        com.avito.android.remote.config.b bVar = this.appConfigVersionValidator;
        int f125492l = this.buildInfo.getF125492l();
        int i12 = Build.VERSION.SDK_INT;
        bVar.getClass();
        c19794a.f20892a.onNext(com.avito.android.remote.config.b.a(config, f125492l, i12, forceSkipProposal));
        this.versionConflictScreenOpener.a();
    }

    private final void saveConfig(AppConfig config) {
        com.avito.android.version_conflict.b bVar = this.configStorage;
        SharedPreferences.Editor editorPutLong = bVar.f325893a.getF316a().edit().putInt("config_platform_version", config.f253325d).putLong("config_version_min_long", config.f253322a).putLong("config_version_max_long", config.f253323b);
        Long l12 = config.f253324c;
        SharedPreferences.Editor editorPutString = (l12 != null ? editorPutLong.putLong("config_version_latest", l12.longValue()) : editorPutLong.remove("config_version_latest")).putString("config_update_source", config.f253326e.name()).putString("config_update_source_url", config.f253327f);
        AppConfig.UpdateSourceType updateSourceType = config.f253328g;
        SharedPreferences.Editor editorPutString2 = editorPutString.putString("config_update_source_type", updateSourceType != null ? updateSourceType.name() : null).putString("config_update_source_type_url", config.f253329h).putString("config_update_apk_source_link", config.f253330i);
        h31.e<Gson> eVar = bVar.f325894b;
        List<Long> list = config.f253332k;
        if (list != null) {
            editorPutString2.putString("config_included_hard_update_versions", eVar.get().l(list));
        } else {
            editorPutString2.remove("config_included_hard_update_versions");
        }
        List<Long> list2 = config.f253331j;
        (list2 != null ? editorPutString2.putString("config_excluded_force_update_versions", eVar.get().l(list2)) : editorPutString2.remove("config_excluded_force_update_versions")).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldSkipProposalDialog() {
        boolean z12 = this.appEntrypointProvider.a() instanceof InterfaceC49400a.d;
        boolean z13 = this.appEntrypointProvider.a() instanceof InterfaceC49400a.C12800a;
        P p12 = this.coreFeatures;
        p12.getClass();
        kotlin.reflect.n<Object> nVar = P.f67370w0[65];
        return ((Boolean) p12.f67395Y.a().invoke()).booleanValue() && (z12 || z13);
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    public void execute() {
        C43175k.K(new C43197r1(new b(null), new C43152f0(this.configApiRepository.b(), new a(null))), this.scope);
    }
}

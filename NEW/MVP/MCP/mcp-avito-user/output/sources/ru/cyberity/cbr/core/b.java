package ru.cyberity.cbr.core;

import Y01.e;
import android.content.Context;
import android.net.Uri;
import android.text.Spanned;
import com.squareup.picasso.A;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.v;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.C43059p;
import kotlin.text.RegexOption;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.t1;
import kotlinx.serialization.json.AbstractC43443a;
import okhttp3.Cache;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.z;
import ru.cyberity.cbr.core.b;
import ru.cyberity.cbr.core.common.CBRSession;
import ru.cyberity.cbr.core.common.g0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.common.v0;
import ru.cyberity.input.Fingerprinter;

/* compiled from: ServiceLocator.kt */
@Metadata(d1 = {"\u0000Õ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001c\u0018\u0000 R2\u00020\u0001:\u0001\fB\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u001c\u0010\"R\u001b\u0010(\u001a\u00020$8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b\u0012\u0010+R\u001b\u00100\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0017\u001a\u0004\b*\u0010/R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010:\u001a\u0002078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0017\u001a\u0004\b=\u0010>R\u0017\u0010D\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b8\u0010A\u001a\u0004\bB\u0010CR!\u0010I\u001a\u00020E8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0017\u0012\u0004\bH\u0010\u000b\u001a\u0004\bF\u0010GR!\u0010L\u001a\u00020E8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\bJ\u0010\u0017\u0012\u0004\bK\u0010\u000b\u001a\u0004\b.\u0010GR\u001b\u0010P\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u0017\u001a\u0004\bN\u0010OR\u001d\u0010T\u001a\u0004\u0018\u00010Q8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u0017\u001a\u0004\bR\u0010SR\u001b\u0010W\u001a\u00020U8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\bJ\u0010VR\u001b\u0010\\\u001a\u00020X8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bY\u0010\u0017\u001a\u0004\bZ\u0010[R\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020^0]8\u0006¢\u0006\f\n\u0004\bF\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0011\u0010h\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010gR\u0014\u0010k\u001a\u00020i8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010jR\u0014\u0010n\u001a\u00020l8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010mR\u0014\u0010q\u001a\u00020o8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010pR\u0014\u0010t\u001a\u00020r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010s¨\u0006u"}, d2 = {"Lru/cyberity/cbr/core/b;", "", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "context", "Lru/cyberity/cbr/core/common/CBRSession;", "session", "<init>", "(Ljava/lang/ref/WeakReference;Lru/cyberity/cbr/core/common/CBRSession;)V", "Lkotlin/G0;", "b", "()V", "a", "Ljava/lang/ref/WeakReference;", "Lru/cyberity/cbr/core/common/CBRSession;", "y", "()Lru/cyberity/cbr/core/common/CBRSession;", "Lkotlinx/coroutines/T;", "c", "Lkotlinx/coroutines/T;", "scope", "Lru/cyberity/cbr/core/data/source/settings/b;", "d", "Lkotlin/C;", "z", "()Lru/cyberity/cbr/core/data/source/settings/b;", "settingsRepository", "Lru/cyberity/cbr/core/data/source/common/a;", "e", "k", "()Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/applicant/b;", "f", "()Lru/cyberity/cbr/core/data/source/applicant/b;", "applicantRepository", "Lru/cyberity/cbr/core/data/source/log/a;", "g", "r", "()Lru/cyberity/cbr/core/data/source/log/a;", "logRepository", "Lru/cyberity/cbr/core/data/source/analythic/a;", "h", "()Lru/cyberity/cbr/core/data/source/analythic/a;", "analyticRepository", "Lru/cyberity/cbr/core/data/source/cache/a;", "i", "()Lru/cyberity/cbr/core/data/source/cache/a;", "cacheRepository", "Lru/cyberity/cbr/core/data/source/extensions/a;", "j", "Lru/cyberity/cbr/core/data/source/extensions/a;", "n", "()Lru/cyberity/cbr/core/data/source/extensions/a;", "extensionProvider", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "m", "()Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/fingerprint/Fingerprinter;", "l", "p", "()Lru/cyberity/fingerprint/Fingerprinter;", "fingerprinter", "Lkotlinx/serialization/json/a;", "Lkotlinx/serialization/json/a;", "q", "()Lkotlinx/serialization/json/a;", "json", "Lokhttp3/OkHttpClient;", "t", "()Lokhttp3/OkHttpClient;", "getOkHttpClient$annotations", "okHttpClient", "o", "getCachedDownloaderOkHttpClient$annotations", "cachedDownloaderOkHttpClient", "Lretrofit2/z;", "w", "()Lretrofit2/z;", "retrofit", "Lcom/squareup/picasso/Picasso;", "v", "()Lcom/squareup/picasso/Picasso;", "picasso", "Lru/cyberity/cbr/core/domain/a;", "()Lru/cyberity/cbr/core/domain/a;", "faceDetector", "Lru/cyberity/cbr/core/common/k;", "s", "x", "()Lru/cyberity/cbr/core/common/k;", "rotationDetector", "Lru/cyberity/cbr/core/c;", "", "Lru/cyberity/cbr/core/c;", "A", "()Lru/cyberity/cbr/core/c;", "tokenProvider", "ru/cyberity/cbr/core/b$r", "u", "Lru/cyberity/cbr/core/b$r;", "urlProvider", "()Landroid/content/Context;", "applicationContext", "Lru/cyberity/cbr/core/data/source/common/b;", "()Lru/cyberity/cbr/core/data/source/common/b;", "commonService", "Lru/cyberity/cbr/core/data/source/applicant/remote/d;", "()Lru/cyberity/cbr/core/data/source/applicant/remote/d;", "applicantService", "Lru/cyberity/cbr/core/data/source/log/b;", "()Lru/cyberity/cbr/core/data/source/log/b;", "logService", "Lru/cyberity/cbr/core/data/source/analythic/b;", "()Lru/cyberity/cbr/core/data/source/analythic/b;", "analyticService", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    private static b f432584w;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final WeakReference<Context> context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final CBRSession session;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final T scope = U.a(t1.b());

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C settingsRepository = C42727D.c(new p());

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C commonRepository = C42727D.c(new f());

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C applicantRepository = C42727D.c(new c());

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C logRepository = C42727D.c(new k());

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C analyticRepository = C42727D.c(new C12432b());

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C cacheRepository = C42727D.c(new d());

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.extensions.a extensionProvider = new h();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C dataRepository = C42727D.c(new g());

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C fingerprinter = C42727D.c(new j());

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final AbstractC43443a json = g0.a(false, 1, null);

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C okHttpClient = C42727D.c(new l());

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C cachedDownloaderOkHttpClient = C42727D.c(new e());

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C retrofit = C42727D.c(new n());

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C picasso = C42727D.c(new m());

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C faceDetector = C42727D.c(new i());

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C rotationDetector = C42727D.c(o.f432621a);

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.c<String> tokenProvider = new q();

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final r urlProvider = new r();

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/core/b$a;", "", "Landroid/content/Context;", "applicationContext", "Lru/cyberity/cbr/core/common/CBRSession;", "session", "Lru/cyberity/cbr/core/b;", "a", "INSTANCE", "Lru/cyberity/cbr/core/b;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final b a(@Y61.k Context applicationContext, @Y61.k CBRSession session) {
            if (applicationContext != applicationContext.getApplicationContext()) {
                throw new IllegalStateException("Check failed.");
            }
            b bVar = b.f432584w;
            if (bVar != null) {
                if (!L.f(bVar.getSession(), session)) {
                    bVar = null;
                }
                if (bVar != null) {
                    return bVar;
                }
            }
            b bVar2 = new b(new WeakReference(applicationContext), session);
            b.f432584w = bVar2;
            return bVar2;
        }

        private Companion() {
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/cbr/core/data/source/analythic/a;", "a", "()Lru/cyberity/cbr/core/data/source/analythic/a;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.b$b, reason: collision with other inner class name */
    public static final class C12432b extends N implements Y41.a<ru.cyberity.cbr.core.data.source.analythic.a> {

        /* compiled from: ServiceLocator.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/UUID;", "a", "()Ljava/util/UUID;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.b$b$a */
        public static final class a extends N implements Y41.a<UUID> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f432607a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(0);
                this.f432607a = bVar;
            }

            @Override // Y41.a
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UUID invoke() {
                return this.f432607a.z().f();
            }
        }

        public C12432b() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.cbr.core.data.source.analythic.a invoke() {
            ru.cyberity.log.cacher.e eVar = new ru.cyberity.log.cacher.e(new ru.cyberity.cbr.core.analytics.g(b.this.d(), new a(b.this)), b.this.g().getCacheDir());
            eVar.a("_AnalyticsRepository");
            ru.cyberity.log.cacher.d.f436072a.a(eVar);
            return new ru.cyberity.cbr.core.data.source.analythic.a(eVar);
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/c;", "a", "()Lru/cyberity/cbr/core/data/source/applicant/c;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<ru.cyberity.cbr.core.data.source.applicant.c> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.cbr.core.data.source.applicant.c invoke() {
            return new ru.cyberity.cbr.core.data.source.applicant.c(new ru.cyberity.cbr.core.data.source.applicant.remote.c(b.this.f(), b.this.t(), b.this.getSession().getUrl()));
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/cbr/core/data/source/cache/b;", "a", "()Lru/cyberity/cbr/core/data/source/cache/b;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<ru.cyberity.cbr.core.data.source.cache.b> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.cbr.core.data.source.cache.b invoke() {
            return new ru.cyberity.cbr.core.data.source.cache.b(b.this.g());
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lokhttp3/OkHttpClient;", "a", "()Lokhttp3/OkHttpClient;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends N implements Y41.a<OkHttpClient> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke() {
            return b.this.t().newBuilder().cache(new Cache(new File(b.this.g().getCacheDir(), "cyberity_cache"), 31457280L)).build();
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/cbr/core/data/source/common/c;", "a", "()Lru/cyberity/cbr/core/data/source/common/c;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends N implements Y41.a<ru.cyberity.cbr.core.data.source.common.c> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.cbr.core.data.source.common.c invoke() {
            return new ru.cyberity.cbr.core.data.source.common.c(b.this.l());
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/d;", "a", "()Lru/cyberity/cbr/core/data/source/dynamic/d;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends N implements Y41.a<ru.cyberity.cbr.core.data.source.dynamic.d> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.cbr.core.data.source.dynamic.d invoke() {
            return new ru.cyberity.cbr.core.data.source.dynamic.d(b.this.z(), new ru.cyberity.cbr.core.data.source.applicant.remote.c(b.this.f(), b.this.t(), b.this.getSession().getUrl()), b.this.l(), b.this.scope, null, b.this.A(), b.this.urlProvider, 16, null);
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"ru/cyberity/cbr/core/b$h", "Lru/cyberity/cbr/core/data/source/extensions/a;", "", "string", "Landroid/text/Spanned;", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class h implements ru.cyberity.cbr.core.data.source.extensions.a {
        public h() {
        }

        @Override // ru.cyberity.cbr.core.data.source.extensions.a
        @Y61.k
        public Spanned a(@Y61.k CharSequence string) {
            return s.a(string, b.this.g());
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/cbr/core/domain/a;", "a", "()Lru/cyberity/cbr/core/domain/a;"}, k = 3, mv = {1, 7, 1})
    public static final class i extends N implements Y41.a<ru.cyberity.cbr.core.domain.a> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.cbr.core.domain.a invoke() {
            return new ru.cyberity.cbr.core.domain.d().b((Context) b.this.context.get());
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/fingerprint/Fingerprinter;", "a", "()Lru/cyberity/fingerprint/Fingerprinter;"}, k = 3, mv = {1, 7, 1})
    public static final class j extends N implements Y41.a<Fingerprinter> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fingerprinter invoke() {
            return ru.cyberity.input.a.a(b.this.g());
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/cbr/core/data/source/log/c;", "a", "()Lru/cyberity/cbr/core/data/source/log/c;"}, k = 3, mv = {1, 7, 1})
    public static final class k extends N implements Y41.a<ru.cyberity.cbr.core.data.source.log.c> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.cbr.core.data.source.log.c invoke() {
            return new ru.cyberity.cbr.core.data.source.log.c(b.this.s());
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lokhttp3/OkHttpClient;", "a", "()Lokhttp3/OkHttpClient;"}, k = 3, mv = {1, 7, 1})
    public static final class l extends N implements Y41.a<OkHttpClient> {
        public l() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder builderAddInterceptor = builder.callTimeout(30L, timeUnit).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).pingInterval(20L, timeUnit).addInterceptor(new ru.cyberity.cbr.core.data.network.interceptor.a(b.this.z())).addInterceptor(new ru.cyberity.cbr.core.data.network.interceptor.c(b.this.A(), b.this.urlProvider));
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
            httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
            RegexOption regexOption = RegexOption.f410582c;
            return builderAddInterceptor.addInterceptor(new ru.cyberity.cbr.core.data.network.interceptor.b(httpLoggingInterceptor, C42745f0.U(new C43059p("resources/applicants/\\w+/info/idDoc", regexOption), new C43059p("resources/sdkIntegrations/msdkInit", regexOption), new C43059p("resources/msdk/i18n", regexOption), new C43059p("ources/applicants/-/levels", regexOption)))).build();
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/z;", "kotlin.jvm.PlatformType", "a", "()Lretrofit2/z;"}, k = 3, mv = {1, 7, 1})
    public static final class n extends N implements Y41.a<z> {

        /* compiled from: ServiceLocator.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ru/cyberity/cbr/core/b$n$a", "Lru/cyberity/cbr/core/common/v0;", "", "resourceKey", "", "a", "(Ljava/lang/String;)Ljava/lang/CharSequence;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        public static final class a implements v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f432620a;

            public a(b bVar) {
                this.f432620a = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
            @Override // ru.cyberity.cbr.core.common.v0
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.CharSequence a(@Y61.k java.lang.String r7) {
                /*
                    r6 = this;
                    ru.cyberity.cbr.core.b r0 = r6.f432620a
                    ru.cyberity.cbr.core.data.source.dynamic.c r0 = r0.m()
                    kotlinx.coroutines.flow.n2 r0 = r0.b()
                    java.lang.Object r0 = r0.getValue()
                    ru.cyberity.cbr.core.data.source.dynamic.c$a r0 = (ru.cyberity.cbr.core.data.source.dynamic.c.a) r0
                    r1 = 0
                    if (r0 == 0) goto Lcd
                    ru.cyberity.cbr.core.data.source.dynamic.a r0 = r0.i()
                    if (r0 == 0) goto Lcd
                    java.lang.Object r0 = r0.d()
                    ru.cyberity.cbr.core.data.model.e r0 = (ru.cyberity.cbr.core.data.model.e) r0
                    if (r0 == 0) goto Lcd
                    java.util.Map r0 = r0.C()
                    if (r0 == 0) goto L2e
                    java.lang.String r2 = "errorCodes"
                    java.lang.Object r0 = r0.get(r2)
                    goto L2f
                L2e:
                    r0 = r1
                L2f:
                    boolean r2 = r0 instanceof java.util.Map
                    if (r2 == 0) goto L36
                    java.util.Map r0 = (java.util.Map) r0
                    goto L37
                L36:
                    r0 = r1
                L37:
                    if (r0 == 0) goto L6e
                    java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                    r2.<init>()
                    java.util.Set r0 = r0.entrySet()
                    java.util.Iterator r0 = r0.iterator()
                L46:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L6f
                    java.lang.Object r3 = r0.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    boolean r4 = r4 instanceof java.lang.String
                    if (r4 == 0) goto L46
                    java.lang.Object r4 = r3.getValue()
                    boolean r4 = r4 instanceof java.lang.String
                    if (r4 == 0) goto L46
                    java.lang.Object r4 = r3.getKey()
                    java.lang.Object r3 = r3.getValue()
                    r2.put(r4, r3)
                    goto L46
                L6e:
                    r2 = r1
                L6f:
                    if (r2 == 0) goto L7a
                    boolean r0 = r2.isEmpty()
                    r3 = 1
                    r0 = r0 ^ r3
                    if (r0 != r3) goto L7a
                    goto L7b
                L7a:
                    r2 = r1
                L7b:
                    if (r2 == 0) goto Lc3
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.Set r2 = r2.entrySet()
                    java.util.Iterator r2 = r2.iterator()
                L8a:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto Lbe
                    java.lang.Object r3 = r2.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    boolean r5 = r4 instanceof java.lang.String
                    if (r5 != 0) goto L9f
                    r4 = r1
                L9f:
                    java.lang.String r4 = (java.lang.String) r4
                    if (r4 != 0) goto La4
                    goto Lb1
                La4:
                    java.lang.Object r3 = r3.getValue()
                    boolean r5 = r3 instanceof java.lang.String
                    if (r5 != 0) goto Lad
                    r3 = r1
                Lad:
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto Lb3
                Lb1:
                    r5 = r1
                    goto Lb8
                Lb3:
                    kotlin.Q r5 = new kotlin.Q
                    r5.<init>(r4, r3)
                Lb8:
                    if (r5 == 0) goto L8a
                    r0.add(r5)
                    goto L8a
                Lbe:
                    java.util.Map r0 = kotlin.collections.P0.p(r0)
                    goto Lc4
                Lc3:
                    r0 = r1
                Lc4:
                    if (r0 == 0) goto Lcd
                    java.lang.Object r7 = r0.get(r7)
                    r1 = r7
                    java.lang.String r1 = (java.lang.String) r1
                Lcd:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.b.n.a.a(java.lang.String):java.lang.CharSequence");
            }
        }

        public n() {
            super(0);
        }

        @Override // Y41.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z invoke() {
            z.b bVar = new z.b();
            bVar.c(b.this.getSession().getUrl());
            OkHttpClient okHttpClientT = b.this.t();
            Objects.requireNonNull(okHttpClientT, "client == null");
            bVar.f430133b = okHttpClientT;
            bVar.a(new ru.cyberity.cbr.core.data.adapter.network.b(new a(b.this)));
            bVar.b(new Y01.b(MediaType.INSTANCE.get("application/json"), new e.b(b.this.getJson())));
            return bVar.e();
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/cbr/core/common/k;", "a", "()Lru/cyberity/cbr/core/common/k;"}, k = 3, mv = {1, 7, 1})
    public static final class o extends N implements Y41.a<ru.cyberity.cbr.core.common.k> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f432621a = new o();

        public o() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.cbr.core.common.k invoke() {
            return new ru.cyberity.cbr.core.common.l().a();
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/cbr/core/data/source/settings/a;", "a", "()Lru/cyberity/cbr/core/data/source/settings/a;"}, k = 3, mv = {1, 7, 1})
    public static final class p extends N implements Y41.a<ru.cyberity.cbr.core.data.source.settings.a> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.cbr.core.data.source.settings.a invoke() {
            return new ru.cyberity.cbr.core.data.source.settings.a(b.this.g().getSharedPreferences("cyberity_mobile_sdk", 0));
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\b"}, d2 = {"ru/cyberity/cbr/core/b$q", "Lru/cyberity/cbr/core/c;", "", "a", "()Ljava/lang/String;", "newValue", "Lkotlin/G0;", "(Ljava/lang/String;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class q implements ru.cyberity.cbr.core.c<String> {
        public q() {
        }

        @Override // ru.cyberity.cbr.core.c
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            return b.this.getSession().getAccessToken();
        }

        @Override // ru.cyberity.cbr.core.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void put(@Y61.k String newValue) {
            b.this.getSession().setAccessToken(newValue);
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0003\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\b¨\u0006\n"}, d2 = {"ru/cyberity/cbr/core/b$r", "Lru/cyberity/cbr/core/c;", "", "a", "()Ljava/lang/String;", "newValue", "Lkotlin/G0;", "(Ljava/lang/String;)V", "Ljava/lang/String;", "overrideUrl", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class r implements ru.cyberity.cbr.core.c<String> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private String overrideUrl;

        @Override // ru.cyberity.cbr.core.c
        @Y61.l
        /* renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
        public String get() {
            return this.overrideUrl;
        }

        @Override // ru.cyberity.cbr.core.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void put(@Y61.l String newValue) {
            this.overrideUrl = newValue;
        }
    }

    public b(@Y61.k WeakReference<Context> weakReference, @Y61.k CBRSession cBRSession) {
        this.context = weakReference;
        this.session = cBRSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.cyberity.cbr.core.data.source.common.b l() {
        return (ru.cyberity.cbr.core.data.source.common.b) w().b(ru.cyberity.cbr.core.data.source.common.b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.cyberity.cbr.core.data.source.log.b s() {
        return (ru.cyberity.cbr.core.data.source.log.b) w().b(ru.cyberity.cbr.core.data.source.log.b.class);
    }

    private final z w() {
        return (z) this.retrofit.getValue();
    }

    @Y61.k
    public final ru.cyberity.cbr.core.c<String> A() {
        return this.tokenProvider;
    }

    @Y61.k
    public final OkHttpClient i() {
        return (OkHttpClient) this.cachedDownloaderOkHttpClient.getValue();
    }

    @Y61.k
    public final ru.cyberity.cbr.core.data.source.common.a k() {
        return (ru.cyberity.cbr.core.data.source.common.a) this.commonRepository.getValue();
    }

    @Y61.k
    public final ru.cyberity.cbr.core.data.source.dynamic.c m() {
        return (ru.cyberity.cbr.core.data.source.dynamic.c) this.dataRepository.getValue();
    }

    @Y61.k
    /* renamed from: n, reason: from getter */
    public final ru.cyberity.cbr.core.data.source.extensions.a getExtensionProvider() {
        return this.extensionProvider;
    }

    @Y61.k
    public final ru.cyberity.cbr.core.domain.a o() {
        return (ru.cyberity.cbr.core.domain.a) this.faceDetector.getValue();
    }

    @Y61.k
    public final Fingerprinter p() {
        return (Fingerprinter) this.fingerprinter.getValue();
    }

    @Y61.k
    /* renamed from: q, reason: from getter */
    public final AbstractC43443a getJson() {
        return this.json;
    }

    @Y61.k
    public final ru.cyberity.cbr.core.data.source.log.a r() {
        return (ru.cyberity.cbr.core.data.source.log.a) this.logRepository.getValue();
    }

    @Y61.k
    public final OkHttpClient t() {
        return (OkHttpClient) this.okHttpClient.getValue();
    }

    @Y61.l
    public final Picasso v() {
        return (Picasso) this.picasso.getValue();
    }

    @Y61.k
    public final ru.cyberity.cbr.core.common.k x() {
        return (ru.cyberity.cbr.core.common.k) this.rotationDetector.getValue();
    }

    @Y61.k
    /* renamed from: y, reason: from getter */
    public final CBRSession getSession() {
        return this.session;
    }

    @Y61.k
    public final ru.cyberity.cbr.core.data.source.settings.b z() {
        return (ru.cyberity.cbr.core.data.source.settings.b) this.settingsRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.cyberity.cbr.core.data.source.analythic.b d() {
        return (ru.cyberity.cbr.core.data.source.analythic.b) w().b(ru.cyberity.cbr.core.data.source.analythic.b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.cyberity.cbr.core.data.source.applicant.remote.d f() {
        return (ru.cyberity.cbr.core.data.source.applicant.remote.d) w().b(ru.cyberity.cbr.core.data.source.applicant.remote.d.class);
    }

    public final void b() {
        Q0.d(this.scope.getF115043e());
    }

    @Y61.k
    public final ru.cyberity.cbr.core.data.source.analythic.a c() {
        return (ru.cyberity.cbr.core.data.source.analythic.a) this.analyticRepository.getValue();
    }

    @Y61.k
    public final ru.cyberity.cbr.core.data.source.applicant.b e() {
        return (ru.cyberity.cbr.core.data.source.applicant.b) this.applicantRepository.getValue();
    }

    @Y61.k
    public final Context g() {
        return this.context.get().getApplicationContext();
    }

    @Y61.k
    public final ru.cyberity.cbr.core.data.source.cache.a h() {
        return (ru.cyberity.cbr.core.data.source.cache.a) this.cacheRepository.getValue();
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/squareup/picasso/Picasso;", "a", "()Lcom/squareup/picasso/Picasso;"}, k = 3, mv = {1, 7, 1})
    public static final class m extends N implements Y41.a<Picasso> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Picasso invoke() {
            Context context = (Context) b.this.context.get();
            if (context == null) {
                return null;
            }
            final b bVar = b.this;
            Picasso.b bVar2 = new Picasso.b(context);
            ru.cyberity.cbr.core.d dVar = new ru.cyberity.cbr.core.d();
            if (bVar2.f366387e != null) {
                throw new IllegalStateException("Listener already set.");
            }
            bVar2.f366387e = dVar;
            v vVar = new v(bVar.t());
            if (bVar2.f366384b != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            bVar2.f366384b = vVar;
            Picasso.e eVar = new Picasso.e() { // from class: ru.cyberity.cbr.core.e
                @Override // com.squareup.picasso.Picasso.e
                public final A a(A a12) {
                    return b.m.a(bVar, a12);
                }
            };
            if (bVar2.f366388f != null) {
                throw new IllegalStateException("Transformer already set.");
            }
            bVar2.f366388f = eVar;
            return bVar2.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Picasso picasso, Uri uri, Exception exc) {
            ru.cyberity.log.a.f436064a.e("Picasso", "Error", exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A a(b bVar, A a12) {
            Uri uri = Uri.parse(bVar.getSession().getUrl() + a12.f366289a);
            A.b bVar2 = new A.b();
            if (uri != null) {
                bVar2.f366306a = uri;
                bVar2.f366307b = 0;
                return bVar2.a();
            }
            throw new IllegalArgumentException("Image URI may not be null.");
        }
    }
}

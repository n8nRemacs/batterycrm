package ru.cyberity.cbr.core.data.source.dynamic;

import androidx.camera.camera2.internal.G;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.p2;
import ru.cyberity.cbr.core.data.model.CBRMessage;
import ru.cyberity.cbr.core.data.model.remote.response.d;
import ru.cyberity.cbr.core.data.source.dynamic.c;

/* compiled from: DataRepositoryImpl.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 _2\u00020\u0001:\u0001\u001eBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0018J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J)\u0010\u0013\u001a\u00060\u0017j\u0002`\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u001dJ/\u0010\u001e\u001a\f\u0012\b\u0012\u00060\u0017j\u0002`\u001c0\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ%\u0010\u001f\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\"J#\u0010 \u001a\u00020\u00122\u000e\u0010#\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u001cH\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010\"J!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020$0\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0018J\u001b\u0010\u001e\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0018J!\u0010 \u001a\b\u0012\u0004\u0012\u00020%0\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u0013\u0010\u001a\u001a\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0014J\u0019\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020&0\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014J\u0013\u0010 \u001a\u00020'H\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010\u0014J\u0019\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020'0\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0014JA\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010(2\b\u0010)\u001a\u0004\u0018\u00018\u00002\u001c\u0010-\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+\u0012\u0006\u0012\u0004\u0018\u00010,0*H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010.J\u000f\u0010/\u001a\u00020\u0012H\u0002¢\u0006\u0004\b/\u00100J\u001b\u0010 \u001a\u00020\u00122\u0006\u00101\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b \u00102J\u001b\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u00102J\u000f\u00103\u001a\u00020\u0012H\u0002¢\u0006\u0004\b3\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u00105\u001a\u0004\b\u001f\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00109R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010?R$\u0010D\u001a\u0012\u0012\b\u0012\u00060\u0017j\u0002`\u001c\u0012\u0004\u0012\u00020\r0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010CR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR \u0010H\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00120B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010CR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00150B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010CR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010CR&\u0010O\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00120B8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bM\u0010C\u0012\u0004\bN\u00100R&\u0010V\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bR\u0010S\u0012\u0004\bU\u00100\u001a\u0004\b<\u0010TR\u001c\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\"\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010Z\u001a\u0004\b\u001a\u0010]\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006`"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/d;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "Lru/cyberity/cbr/core/data/source/settings/b;", "settingsRepository", "Lru/cyberity/cbr/core/data/source/applicant/a;", "applicantDataSource", "Lru/cyberity/cbr/core/data/source/common/b;", "commonService", "Lkotlinx/coroutines/T;", "scope", "Lkotlinx/coroutines/M;", "dispatcher", "Lru/cyberity/cbr/core/c;", "", "tokenProvider", "urlProvider", "<init>", "(Lru/cyberity/cbr/core/data/source/settings/b;Lru/cyberity/cbr/core/data/source/applicant/a;Lru/cyberity/cbr/core/data/source/common/b;Lkotlinx/coroutines/T;Lkotlinx/coroutines/M;Lru/cyberity/cbr/core/c;Lru/cyberity/cbr/core/c;)V", "Lkotlin/G0;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "reload", "Lru/cyberity/cbr/core/data/model/g;", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/dynamic/a;", "e", "id", "Lru/cyberity/cbr/core/data/model/remote/response/ApplicantAction;", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "d", "b", "applicant", "(Lru/cyberity/cbr/core/data/model/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applicantAction", "Lru/cyberity/cbr/core/data/model/t;", "Lru/cyberity/cbr/core/data/model/e;", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "Lru/cyberity/cbr/core/data/source/dynamic/c$b;", "T", "prev", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "task", "(Ljava/lang/Object;LY41/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i", "()V", "coroutineScope", "(Lkotlinx/coroutines/T;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "Lru/cyberity/cbr/core/data/source/settings/b;", "Lru/cyberity/cbr/core/data/source/applicant/a;", "()Lru/cyberity/cbr/core/data/source/applicant/a;", "Lru/cyberity/cbr/core/data/source/common/b;", "Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/M;", "f", "Lru/cyberity/cbr/core/c;", "g", "Lkotlinx/coroutines/N0;", "h", "Lkotlinx/coroutines/N0;", "periodicalUpdateJob", "docsAndApplicantJob", "Lru/cyberity/cbr/core/data/source/dynamic/b;", "Lru/cyberity/cbr/core/data/source/dynamic/b;", "applicantActionKeeper", "k", "applicantKeeper", "l", "documentsKeeper", "m", "configKeeper", "n", "stringsKeeper", "o", "getFeatureFlagsKeeper$annotations", "featureFlagsKeeper", "Lkotlinx/coroutines/flow/d2;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "p", "Lkotlinx/coroutines/flow/d2;", "()Lkotlinx/coroutines/flow/d2;", "getSocketEventsFlow$annotations", "socketEventsFlow", "Lkotlinx/coroutines/flow/Z1;", "Lru/cyberity/cbr/core/data/source/dynamic/c$a;", "q", "Lkotlinx/coroutines/flow/Z1;", "_dataFlow", "r", "()Lkotlinx/coroutines/flow/Z1;", "dataFlow", "s", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class d implements ru.cyberity.cbr.core.data.source.dynamic.c {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    private static final List<String> f433679u = C42745f0.U("ARG", "BRA", "ARM", "ATA", "ATF", "ATG", "AUS", "AUT", "AZE", "BDI", "BEL", "BEN");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.settings.b settingsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.applicant.a applicantDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.common.b commonService;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final T scope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final M dispatcher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.c<String> tokenProvider;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.c<String> urlProvider;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private N0 periodicalUpdateJob;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private N0 docsAndApplicantJob;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.b<ru.cyberity.cbr.core.data.model.g, String> applicantActionKeeper;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.b<ru.cyberity.cbr.core.data.model.g, String> applicantKeeper;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.b<ru.cyberity.cbr.core.data.model.t, G0> documentsKeeper;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.b<ru.cyberity.cbr.core.data.model.e, Boolean> configKeeper;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.b<c.C12476c, G0> stringsKeeper;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.b<c.b, G0> featureFlagsKeeper;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final d2<CBRMessage.ServerMessage> socketEventsFlow;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Z1<c.a> _dataFlow;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Z1<c.a> dataFlow;

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/d$a;", "", "Lru/cyberity/cbr/core/data/source/common/b;", "commonService", "", "Lru/cyberity/cbr/core/data/model/d;", "a", "(Lru/cyberity/cbr/core/data/source/common/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "MANUAL_UPDATE_PERIOD", "J", "", "fakeCountries", "Ljava/util/List;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.source.dynamic.d$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: DataRepositoryImpl.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$Companion", f = "DataRepositoryImpl.kt", i = {}, l = {540}, m = "generateFakeAgreements", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.core.data.source.dynamic.d$a$a, reason: collision with other inner class name */
        public static final class C12477a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f433698a;

            /* renamed from: c, reason: collision with root package name */
            int f433700c;

            public C12477a(Continuation<? super C12477a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f433698a = obj;
                this.f433700c |= BeduinInputModel.MIN_TEXT_VERSION;
                return Companion.this.a(null, this);
            }
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(ru.cyberity.cbr.core.data.source.common.b r14, kotlin.coroutines.Continuation<? super java.util.List<ru.cyberity.cbr.core.data.model.d>> r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof ru.cyberity.cbr.core.data.source.dynamic.d.Companion.C12477a
                if (r0 == 0) goto L13
                r0 = r15
                ru.cyberity.cbr.core.data.source.dynamic.d$a$a r0 = (ru.cyberity.cbr.core.data.source.dynamic.d.Companion.C12477a) r0
                int r1 = r0.f433700c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f433700c = r1
                goto L18
            L13:
                ru.cyberity.cbr.core.data.source.dynamic.d$a$a r0 = new ru.cyberity.cbr.core.data.source.dynamic.d$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f433698a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f433700c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r15)
                goto L3d
            L29:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L31:
                kotlin.C42729a0.b(r15)
                r0.f433700c = r3
                java.lang.Object r15 = r14.d(r0)
                if (r15 != r1) goto L3d
                return r1
            L3d:
                java.util.List r15 = (java.util.List) r15
                ru.cyberity.ff.a r14 = ru.cyberity.ff.a.f435638a
                ru.cyberity.ff.core.a r14 = r14.a()
                java.lang.String r14 = r14.f()
                if (r14 == 0) goto L56
                java.lang.Integer r14 = kotlin.text.C43066x.y0(r14)
                if (r14 == 0) goto L56
                int r14 = r14.intValue()
                goto L5a
            L56:
                int r14 = r15.size()
            L5a:
                int r0 = r15.size()
                if (r14 >= r0) goto L65
                java.util.List r14 = kotlin.collections.C42745f0.E0(r15, r14)
                goto La6
            L65:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.addAll(r15)
                int r15 = r15.size()
                int r14 = r14 - r15
                r15 = 0
            L73:
                if (r15 >= r14) goto La5
                java.util.List r1 = ru.cyberity.cbr.core.data.source.dynamic.d.c()
                kotlin.random.f$a r2 = kotlin.random.f.f406882b
                java.lang.Object r1 = kotlin.collections.C42745f0.j0(r1, r2)
                r3 = r1
                java.lang.String r3 = (java.lang.String) r3
                ru.cyberity.cbr.core.data.model.d r1 = new ru.cyberity.cbr.core.data.model.d
                ru.cyberity.cbr.core.data.model.c r11 = new ru.cyberity.cbr.core.data.model.c
                r11.<init>(r3)
                ru.cyberity.cbr.core.data.model.b r12 = new ru.cyberity.cbr.core.data.model.b
                java.lang.String r2 = "countries."
                java.lang.String r8 = androidx.camera.camera2.internal.G.f(r2, r3)
                r6 = 0
                r7 = 0
                r4 = 0
                r5 = 0
                r9 = 30
                r10 = 0
                r2 = r12
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                r1.<init>(r11, r12)
                r0.add(r1)
                int r15 = r15 + 1
                goto L73
            La5:
                r14 = r0
            La6:
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.Companion.a(ru.cyberity.cbr.core.data.source.common.b, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", i = {}, l = {415}, m = "getStringsOrThrow", n = {}, s = {})
    public static final class a0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f433701a;

        /* renamed from: c, reason: collision with root package name */
        int f433703c;

        public a0(Continuation<? super a0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433701a = obj;
            this.f433703c |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.e(this);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H\u008a@"}, d2 = {"", "id", "Lru/cyberity/cbr/core/data/model/g;", "Lru/cyberity/cbr/core/data/model/remote/response/ApplicantAction;", "<anonymous parameter 1>", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$applicantActionKeeper$1", f = "DataRepositoryImpl.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<String, ru.cyberity.cbr.core.data.model.g, Continuation<? super ru.cyberity.cbr.core.data.model.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433704a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433705b;

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l String str, @Y61.l ru.cyberity.cbr.core.data.model.g gVar, @Y61.l Continuation<? super ru.cyberity.cbr.core.data.model.g> continuation) {
            b bVar = d.this.new b(continuation);
            bVar.f433705b = str;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433704a;
            if (i12 == 0) {
                C42729a0.b(obj);
                String strB = (String) this.f433705b;
                ru.cyberity.cbr.core.data.source.common.b bVar = d.this.commonService;
                if (strB == null) {
                    strB = d.this.settingsRepository.b();
                }
                this.f433704a = 1;
                obj = bVar.a(strB, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return ru.cyberity.cbr.core.data.model.remote.response.e.b((d.c.C12460d) obj);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$restartManualUpdate$1", f = "DataRepositoryImpl.kt", i = {0}, l = {445}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class b0 extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433707a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f433708b;

        /* compiled from: DataRepositoryImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$restartManualUpdate$1$1", f = "DataRepositoryImpl.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f433710a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f433711b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f433712c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f433712c = dVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f433712c, continuation);
                aVar.f433711b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f433710a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    T t12 = (T) this.f433711b;
                    d dVar = this.f433712c;
                    this.f433710a = 1;
                    if (dVar.a(t12, this) == coroutine_suspended) {
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

        public b0(Continuation<? super b0> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((b0) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b0 b0Var = d.this.new b0(continuation);
            b0Var.f433708b = obj;
            return b0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:14:0x0037). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f433707a
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r9.f433708b
                kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
                kotlin.C42729a0.b(r10)
                goto L37
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1b:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f433708b
                kotlinx.coroutines.T r10 = (kotlinx.coroutines.T) r10
                r1 = r10
            L23:
                boolean r10 = kotlinx.coroutines.U.e(r1)
                if (r10 == 0) goto L53
                r9.f433708b = r1
                r9.f433707a = r2
                r3 = 120000(0x1d4c0, double:5.9288E-319)
                java.lang.Object r10 = kotlinx.coroutines.C43131e0.b(r3, r9)
                if (r10 != r0) goto L37
                return r0
            L37:
                kotlinx.coroutines.U.d(r1)
                ru.cyberity.cbr.core.a r3 = ru.cyberity.cbr.core.a.f432517a
                java.lang.String r5 = "Manually updating data"
                r6 = 0
                java.lang.String r4 = "DataRepository"
                r7 = 4
                r8 = 0
                ru.cyberity.cbr.core.a.b(r3, r4, r5, r6, r7, r8)
                ru.cyberity.cbr.core.data.source.dynamic.d$b0$a r10 = new ru.cyberity.cbr.core.data.source.dynamic.d$b0$a
                ru.cyberity.cbr.core.data.source.dynamic.d r3 = ru.cyberity.cbr.core.data.source.dynamic.d.this
                r4 = 0
                r10.<init>(r3, r4)
                r3 = 3
                kotlinx.coroutines.C43259k.d(r1, r4, r4, r10, r3)
                goto L23
            L53:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.b0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"", "id", "Lru/cyberity/cbr/core/data/model/g;", "<anonymous parameter 1>", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$applicantKeeper$1", f = "DataRepositoryImpl.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<String, ru.cyberity.cbr.core.data.model.g, Continuation<? super ru.cyberity.cbr.core.data.model.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433713a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433714b;

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l String str, @Y61.l ru.cyberity.cbr.core.data.model.g gVar, @Y61.l Continuation<? super ru.cyberity.cbr.core.data.model.g> continuation) {
            c cVar = d.this.new c(continuation);
            cVar.f433714b = str;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433713a;
            if (i12 == 0) {
                C42729a0.b(obj);
                String strA = (String) this.f433714b;
                ru.cyberity.cbr.core.data.source.common.b bVar = d.this.commonService;
                if (strA == null) {
                    strA = d.this.settingsRepository.a();
                }
                this.f433713a = 1;
                obj = bVar.e(strA, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return ru.cyberity.cbr.core.data.model.remote.response.e.a((d.c.C12460d) obj);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "msg", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$socketEventsFlow$1", f = "DataRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c0 extends SuspendLambda implements Y41.p<CBRMessage.ServerMessage, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433716a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433717b;

        /* compiled from: DataRepositoryImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$socketEventsFlow$1$2", f = "DataRepositoryImpl.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f433719a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f433720b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f433721c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f433721c = dVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f433721c, continuation);
                aVar.f433720b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f433719a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    T t12 = (T) this.f433720b;
                    d dVar = this.f433721c;
                    this.f433719a = 1;
                    if (dVar.a(t12, this) == coroutine_suspended) {
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

        /* compiled from: DataRepositoryImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$socketEventsFlow$1$4", f = "DataRepositoryImpl.kt", i = {}, l = {268}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f433722a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f433723b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f433724c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f433724c = dVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                b bVar = new b(this.f433724c, continuation);
                bVar.f433723b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f433722a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    T t12 = (T) this.f433723b;
                    d dVar = this.f433724c;
                    this.f433722a = 1;
                    if (dVar.a(t12, this) == coroutine_suspended) {
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

        /* compiled from: DataRepositoryImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$socketEventsFlow$1$6", f = "DataRepositoryImpl.kt", i = {}, l = {276}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f433725a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f433726b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f433727c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d dVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f433727c = dVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                c cVar = new c(this.f433727c, continuation);
                cVar.f433726b = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f433725a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    T t12 = (T) this.f433726b;
                    d dVar = this.f433727c;
                    this.f433725a = 1;
                    if (dVar.b(t12, this) == coroutine_suspended) {
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

        public c0(Continuation<? super c0> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k CBRMessage.ServerMessage serverMessage, @Y61.l Continuation<? super G0> continuation) {
            return ((c0) create(serverMessage, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c0 c0Var = d.this.new c0(continuation);
            c0Var.f433717b = obj;
            return c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String newToken;
            String newToken2;
            String newToken3;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f433716a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            CBRMessage.ServerMessage serverMessage = (CBRMessage.ServerMessage) this.f433717b;
            ru.cyberity.cbr.core.a aVar = ru.cyberity.cbr.core.a.f432517a;
            ru.cyberity.cbr.core.a.b(aVar, "DataRepository", "Socket event " + serverMessage.getType() + ": " + serverMessage, null, 4, null);
            if (serverMessage instanceof CBRMessage.ServerMessage.e) {
                CBRMessage.ServerMessage.e.c payload = ((CBRMessage.ServerMessage.e) serverMessage).getPayload();
                if (payload != null && (newToken3 = payload.getNewToken()) != null) {
                    d.this.tokenProvider.put(newToken3);
                }
                C43259k.d(d.this.scope, d.this.dispatcher, null, new a(d.this, null), 2);
            } else if (serverMessage instanceof CBRMessage.ServerMessage.g) {
                CBRMessage.ServerMessage.g.c payload2 = ((CBRMessage.ServerMessage.g) serverMessage).getPayload();
                if (payload2 != null && (newToken2 = payload2.getNewToken()) != null) {
                    d.this.tokenProvider.put(newToken2);
                }
                C43259k.d(d.this.scope, d.this.dispatcher, null, new b(d.this, null), 2);
                d.this.i();
            } else if (serverMessage instanceof CBRMessage.ServerMessage.c) {
                CBRMessage.ServerMessage.c.C12443c payload3 = ((CBRMessage.ServerMessage.c) serverMessage).getPayload();
                if (payload3 != null && (newToken = payload3.getNewToken()) != null) {
                    d.this.tokenProvider.put(newToken);
                }
                C43259k.d(d.this.scope, d.this.dispatcher, null, new c(d.this, null), 2);
                d.this.i();
            } else if (serverMessage instanceof CBRMessage.ServerMessage.b) {
                d.this.i();
            } else if (!(serverMessage instanceof CBRMessage.ServerMessage.f)) {
                ru.cyberity.cbr.core.a.b(aVar, "DataRepository", "event dropped", null, 4, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"", "reinit", "Lru/cyberity/cbr/core/data/model/e;", "current", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$configKeeper$1", f = "DataRepositoryImpl.kt", i = {0}, l = {143, 167}, m = "invokeSuspend", n = {"current"}, s = {"L$0"})
    /* renamed from: ru.cyberity.cbr.core.data.source.dynamic.d$d, reason: collision with other inner class name */
    public static final class C12478d extends SuspendLambda implements Y41.q<Boolean, ru.cyberity.cbr.core.data.model.e, Continuation<? super ru.cyberity.cbr.core.data.model.e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433728a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433729b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f433730c;

        public C12478d(Continuation<? super C12478d> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l Boolean bool, @Y61.l ru.cyberity.cbr.core.data.model.e eVar, @Y61.l Continuation<? super ru.cyberity.cbr.core.data.model.e> continuation) {
            C12478d c12478d = d.this.new C12478d(continuation);
            c12478d.f433729b = bool;
            c12478d.f433730c = eVar;
            return c12478d.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0191 A[PHI: r4
  0x0191: PHI (r4v17 java.util.Map<java.lang.String, ru.cyberity.cbr.core.data.model.remote.c>) = 
  (r4v16 java.util.Map<java.lang.String, ru.cyberity.cbr.core.data.model.remote.c>)
  (r4v59 java.util.Map<java.lang.String, ru.cyberity.cbr.core.data.model.remote.c>)
 binds: [B:99:0x0189, B:101:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:106:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x01a0 A[PHI: r4
  0x01a0: PHI (r4v19 java.util.Map<java.lang.String, java.lang.String>) = (r4v18 java.util.Map<java.lang.String, java.lang.String>), (r4v58 java.util.Map<java.lang.String, java.lang.String>) binds: [B:105:0x0198, B:107:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x02b9  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:216:0x034f  */
        /* JADX WARN: Removed duplicated region for block: B:218:0x0355  */
        /* JADX WARN: Removed duplicated region for block: B:219:0x035a  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x0361  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x0367  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x0369  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x036e  */
        /* JADX WARN: Removed duplicated region for block: B:229:0x0375  */
        /* JADX WARN: Removed duplicated region for block: B:237:0x039d  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x046c  */
        /* JADX WARN: Removed duplicated region for block: B:324:0x0502  */
        /* JADX WARN: Removed duplicated region for block: B:326:0x0508  */
        /* JADX WARN: Removed duplicated region for block: B:327:0x050d  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:330:0x051a  */
        /* JADX WARN: Removed duplicated region for block: B:334:0x0524  */
        /* JADX WARN: Removed duplicated region for block: B:335:0x052b  */
        /* JADX WARN: Removed duplicated region for block: B:337:0x052f  */
        /* JADX WARN: Removed duplicated region for block: B:338:0x0536  */
        /* JADX WARN: Removed duplicated region for block: B:341:0x053e  */
        /* JADX WARN: Removed duplicated region for block: B:344:0x054a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[PHI: r4
  0x00b5: PHI (r4v9 java.lang.String) = (r4v8 java.lang.String), (r4v66 java.lang.String) binds: [B:31:0x00ad, B:33:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0173 A[PHI: r4
  0x0173: PHI (r4v13 java.util.Map<java.lang.String, java.lang.Object>) = (r4v12 java.util.Map<java.lang.String, java.lang.Object>), (r4v61 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:87:0x016b, B:89:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0182 A[PHI: r4
  0x0182: PHI (r4v15 java.util.Map<java.lang.String, java.lang.Object>) = (r4v14 java.util.Map<java.lang.String, java.lang.Object>), (r4v60 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:93:0x017a, B:95:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 1543
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.C12478d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$socketEventsFlow$2", f = "DataRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d0 extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CBRMessage.ServerMessage>, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433732a;

        public d0(Continuation<? super d0> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k InterfaceC43172j<? super CBRMessage.ServerMessage> interfaceC43172j, @Y61.l Continuation<? super G0> continuation) {
            return ((d0) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new d0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f433732a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            d.this.i();
            return G0.f406611a;
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "<anonymous parameter 0>", "Lru/cyberity/cbr/core/data/model/t;", "<anonymous parameter 1>", "<anonymous>", "(VLru/cyberity/cbr/core/data/model/t;)Lru/cyberity/cbr/core/data/model/t;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$documentsKeeper$1", f = "DataRepositoryImpl.kt", i = {}, l = {102, 105, 107}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.q<G0, ru.cyberity.cbr.core.data.model.t, Continuation<? super ru.cyberity.cbr.core.data.model.t>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433734a;

        public e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l G0 g02, @Y61.l ru.cyberity.cbr.core.data.model.t tVar, @Y61.l Continuation<? super ru.cyberity.cbr.core.data.model.t> continuation) {
            return d.this.new e(continuation).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00c3 A[LOOP:0: B:29:0x00bd->B:31:0x00c3, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$socketEventsFlow$3", f = "DataRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CBRMessage.ServerMessage>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433736a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433737b;

        public e0(Continuation<? super e0> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k InterfaceC43172j<? super CBRMessage.ServerMessage> interfaceC43172j, @Y61.k Throwable th2, @Y61.l Continuation<? super G0> continuation) {
            e0 e0Var = new e0(continuation);
            e0Var.f433737b = th2;
            return e0Var.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f433736a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            ru.cyberity.cbr.core.a.a(ru.cyberity.cbr.core.a.f432517a, "DataRepository", G.i((Throwable) this.f433737b, new StringBuilder("socket flow exception: ")), null, 4, null);
            return G0.f406611a;
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "<anonymous parameter 0>", "Lru/cyberity/cbr/core/data/source/dynamic/c$b;", "<anonymous parameter 1>", "<anonymous>", "(VLru/cyberity/cbr/core/data/source/dynamic/c$b;)Lru/cyberity/cbr/core/data/source/dynamic/c$b;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$featureFlagsKeeper$1", f = "DataRepositoryImpl.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.q<G0, c.b, Continuation<? super c.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433738a;

        public f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l G0 g02, @Y61.l c.b bVar, @Y61.l Continuation<? super c.b> continuation) {
            return d.this.new f(continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433738a;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ru.cyberity.cbr.core.data.source.common.b bVar = d.this.commonService;
                    ru.cyberity.ff.model.a aVarW = ru.cyberity.ff.a.f435638a.w();
                    this.f433738a = 1;
                    obj = bVar.a(aVarW, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
                ArrayList arrayList = new ArrayList(C42745f0.q(setEntrySet, 10));
                for (Map.Entry entry : setEntrySet) {
                    arrayList.add(new c.b.a((String) entry.getKey(), ((ru.cyberity.ff.model.b) entry.getValue()).getEnabled(), ((ru.cyberity.ff.model.b) entry.getValue()).getValue()));
                }
                c.b bVar2 = new c.b(arrayList);
                ru.cyberity.ff.a.f435638a.a(bVar2);
                return bVar2;
            } catch (Exception e12) {
                if (!(e12 instanceof CancellationException)) {
                    ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(d.this), "Failed to parse remote FFs", e12);
                }
                return new c.b(C42784z0.f406748b);
            }
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$socketEventsFlow$4", f = "DataRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CBRMessage.ServerMessage>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433740a;

        public f0(Continuation<? super f0> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k InterfaceC43172j<? super CBRMessage.ServerMessage> interfaceC43172j, @Y61.l Throwable th2, @Y61.l Continuation<? super G0> continuation) {
            return d.this.new f0(continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f433740a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            N0 n02 = d.this.periodicalUpdateJob;
            if (n02 != null) {
                n02.c(null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", i = {0, 1, 2}, l = {313, 315, 317}, m = "getAll", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433742a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433743b;

        /* renamed from: d, reason: collision with root package name */
        int f433745d;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433743b = obj;
            this.f433745d |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.c(this);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "<anonymous parameter 0>", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "<anonymous parameter 1>", "<anonymous>", "(VLru/cyberity/cbr/core/data/source/dynamic/c$c;)Lru/cyberity/cbr/core/data/source/dynamic/c$c;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$stringsKeeper$1", f = "DataRepositoryImpl.kt", i = {1, 2}, l = {204, JfifUtil.MARKER_RST0, 210}, m = "invokeSuspend", n = {"strings", "strings"}, s = {"L$0", "L$0"})
    public static final class g0 extends SuspendLambda implements Y41.q<G0, c.C12476c, Continuation<? super c.C12476c>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f433746a;

        /* renamed from: b, reason: collision with root package name */
        int f433747b;

        public g0(Continuation<? super g0> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l G0 g02, @Y61.l c.C12476c c12476c, @Y61.l Continuation<? super c.C12476c> continuation) {
            return d.this.new g0(continuation).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 303
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.g0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$getAll$2", f = "DataRepositoryImpl.kt", i = {}, l = {318}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433749a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433749a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.core.data.source.dynamic.b bVar = d.this.applicantKeeper;
                this.f433749a = 1;
                if (bVar.a((Continuation<? super G0>) this) == coroutine_suspended) {
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

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", i = {0}, l = {394}, m = "updateApplicant", n = {"this"}, s = {"L$0"})
    public static final class h0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433751a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433752b;

        /* renamed from: d, reason: collision with root package name */
        int f433754d;

        public h0(Continuation<? super h0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433752b = obj;
            this.f433754d |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.a((ru.cyberity.cbr.core.data.model.g) null, this);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$getAll$3", f = "DataRepositoryImpl.kt", i = {}, l = {319}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433755a;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433755a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.core.data.source.dynamic.b bVar = d.this.configKeeper;
                this.f433755a = 1;
                if (bVar.a((Continuation<? super G0>) this) == coroutine_suspended) {
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

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", i = {0}, l = {Constants.MINIMAL_ERROR_STATUS_CODE}, m = "updateApplicantAction", n = {"this"}, s = {"L$0"})
    public static final class i0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433757a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433758b;

        /* renamed from: d, reason: collision with root package name */
        int f433760d;

        public i0(Continuation<? super i0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433758b = obj;
            this.f433760d |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.b((ru.cyberity.cbr.core.data.model.g) null, this);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$getAll$4", f = "DataRepositoryImpl.kt", i = {}, l = {322}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433761a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433761a;
            if (i12 == 0) {
                C42729a0.b(obj);
                if (!C43066x.K(d.this.settingsRepository.b())) {
                    ru.cyberity.cbr.core.data.source.dynamic.b bVar = d.this.applicantActionKeeper;
                    this.f433761a = 1;
                    if (bVar.a((Continuation<? super G0>) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", i = {0, 0, 0, 1, 1}, l = {433, 434}, m = "updateDataPart", n = {"this", "prev", "task", "this", "prev"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class j0<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433763a;

        /* renamed from: b, reason: collision with root package name */
        Object f433764b;

        /* renamed from: c, reason: collision with root package name */
        Object f433765c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f433766d;

        /* renamed from: f, reason: collision with root package name */
        int f433768f;

        public j0(Continuation<? super j0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433766d = obj;
            this.f433768f |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.a((d) null, (Y41.l<? super Continuation<? super d>, ? extends Object>) null, this);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$getAll$5", f = "DataRepositoryImpl.kt", i = {}, l = {325}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433769a;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new k(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433769a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.core.data.source.dynamic.b bVar = d.this.stringsKeeper;
                this.f433769a = 1;
                if (bVar.a((Continuation<? super G0>) this) == coroutine_suspended) {
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

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", i = {0, 0}, l = {483}, m = "updateDocumentStatusAndApplicant", n = {"this", "coroutineScope"}, s = {"L$0", "L$1"})
    public static final class k0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433771a;

        /* renamed from: b, reason: collision with root package name */
        Object f433772b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f433773c;

        /* renamed from: e, reason: collision with root package name */
        int f433775e;

        public k0(Continuation<? super k0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433773c = obj;
            this.f433775e |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.a((T) null, this);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$getAll$6", f = "DataRepositoryImpl.kt", i = {}, l = {326}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433776a;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((l) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new l(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433776a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.core.data.source.dynamic.b bVar = d.this.documentsKeeper;
                this.f433776a = 1;
                if (bVar.a((Continuation<? super G0>) this) == coroutine_suspended) {
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

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$updateDocumentStatusAndApplicant$2", f = "DataRepositoryImpl.kt", i = {1, 2}, l = {486, 488, 492, 496}, m = "invokeSuspend", n = {"previousLeveName", "previousLeveName"}, s = {"L$0", "L$0"})
    public static final class l0 extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f433778a;

        /* renamed from: b, reason: collision with root package name */
        int f433779b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f433781d;

        /* compiled from: DataRepositoryImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$updateDocumentStatusAndApplicant$2$1", f = "DataRepositoryImpl.kt", i = {}, l = {489}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f433782a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f433783b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f433783b = dVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f433783b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f433782a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ru.cyberity.cbr.core.data.source.dynamic.b bVar = this.f433783b.applicantKeeper;
                    this.f433782a = 1;
                    if (ru.cyberity.cbr.core.data.source.dynamic.b.a(bVar, null, this, 1, null) == coroutine_suspended) {
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

        /* compiled from: DataRepositoryImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$updateDocumentStatusAndApplicant$2$2", f = "DataRepositoryImpl.kt", i = {}, l = {490}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f433784a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f433785b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f433785b = dVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f433785b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f433784a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ru.cyberity.cbr.core.data.source.dynamic.b bVar = this.f433785b.documentsKeeper;
                    this.f433784a = 1;
                    if (ru.cyberity.cbr.core.data.source.dynamic.b.a(bVar, null, this, 1, null) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(T t12, Continuation<? super l0> continuation) {
            super(2, continuation);
            this.f433781d = t12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((l0) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new l0(this.f433781d, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b2 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x00ee, B:15:0x002d, B:36:0x00aa, B:38:0x00b2, B:40:0x00b8, B:44:0x00c1, B:46:0x00d9, B:18:0x0039, B:33:0x0094, B:20:0x003e, B:26:0x005b, B:28:0x0063, B:30:0x0069, B:23:0x0047), top: B:54:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00be A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x00ee, B:15:0x002d, B:36:0x00aa, B:38:0x00b2, B:40:0x00b8, B:44:0x00c1, B:46:0x00d9, B:18:0x0039, B:33:0x0094, B:20:0x003e, B:26:0x005b, B:28:0x0063, B:30:0x0069, B:23:0x0047), top: B:54:0x000f }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r16) {
            /*
                Method dump skipped, instructions count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.l0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$getAll$7", f = "DataRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433786a;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new m(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f433786a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            d.this.j();
            return G0.f406611a;
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", i = {0, 0}, l = {457}, m = "updateDocumentStatusAndApplicantAction", n = {"this", "coroutineScope"}, s = {"L$0", "L$1"})
    public static final class m0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433788a;

        /* renamed from: b, reason: collision with root package name */
        Object f433789b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f433790c;

        /* renamed from: e, reason: collision with root package name */
        int f433792e;

        public m0(Continuation<? super m0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433790c = obj;
            this.f433792e |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.b((T) null, this);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/a;", "Lru/cyberity/cbr/core/data/model/g;", "Lru/cyberity/cbr/core/data/model/remote/response/ApplicantAction;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$getApplicantActionAsResult$2", f = "DataRepositoryImpl.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Y41.l<Continuation<? super a<ru.cyberity.cbr.core.data.model.g>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433793a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f433795c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f433796d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(boolean z12, String str, Continuation<? super n> continuation) {
            super(1, continuation);
            this.f433795c = z12;
            this.f433796d = str;
        }

        @Override // Y41.l
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l Continuation<? super a<ru.cyberity.cbr.core.data.model.g>> continuation) {
            return ((n) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return d.this.new n(this.f433795c, this.f433796d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433793a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.core.data.source.dynamic.b bVar = d.this.applicantActionKeeper;
                boolean z12 = this.f433795c;
                String str = this.f433796d;
                this.f433793a = 1;
                obj = bVar.b(z12, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$updateDocumentStatusAndApplicantAction$2", f = "DataRepositoryImpl.kt", i = {1, 2}, l = {460, 462, 466, 471}, m = "invokeSuspend", n = {"previousLeveName", "previousLeveName"}, s = {"L$0", "L$0"})
    public static final class n0 extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f433797a;

        /* renamed from: b, reason: collision with root package name */
        int f433798b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f433800d;

        /* compiled from: DataRepositoryImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$updateDocumentStatusAndApplicantAction$2$1", f = "DataRepositoryImpl.kt", i = {}, l = {463}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f433801a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f433802b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f433802b = dVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f433802b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f433801a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ru.cyberity.cbr.core.data.source.dynamic.b bVar = this.f433802b.applicantActionKeeper;
                    this.f433801a = 1;
                    if (ru.cyberity.cbr.core.data.source.dynamic.b.a(bVar, null, this, 1, null) == coroutine_suspended) {
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

        /* compiled from: DataRepositoryImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$updateDocumentStatusAndApplicantAction$2$2", f = "DataRepositoryImpl.kt", i = {}, l = {464}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f433803a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f433804b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f433804b = dVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f433804b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f433803a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ru.cyberity.cbr.core.data.source.dynamic.b bVar = this.f433804b.documentsKeeper;
                    this.f433803a = 1;
                    if (ru.cyberity.cbr.core.data.source.dynamic.b.a(bVar, null, this, 1, null) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(T t12, Continuation<? super n0> continuation) {
            super(2, continuation);
            this.f433800d = t12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((n0) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new n0(this.f433800d, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b2 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x00ee, B:15:0x002d, B:36:0x00aa, B:38:0x00b2, B:40:0x00b8, B:44:0x00c1, B:46:0x00d9, B:18:0x0039, B:33:0x0094, B:20:0x003e, B:26:0x005b, B:28:0x0063, B:30:0x0069, B:23:0x0047), top: B:54:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00be A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x00ee, B:15:0x002d, B:36:0x00aa, B:38:0x00b2, B:40:0x00b8, B:44:0x00c1, B:46:0x00d9, B:18:0x0039, B:33:0x0094, B:20:0x003e, B:26:0x005b, B:28:0x0063, B:30:0x0069, B:23:0x0047), top: B:54:0x000f }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r16) {
            /*
                Method dump skipped, instructions count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.n0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", i = {}, l = {358}, m = "getApplicantActionOrThrow", n = {}, s = {})
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f433805a;

        /* renamed from: c, reason: collision with root package name */
        int f433807c;

        public o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433805a = obj;
            this.f433807c |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.c(null, false, this);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/a;", "Lru/cyberity/cbr/core/data/model/g;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$getApplicantAsResult$2", f = "DataRepositoryImpl.kt", i = {}, l = {374}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Y41.l<Continuation<? super a<ru.cyberity.cbr.core.data.model.g>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433808a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f433810c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f433811d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(boolean z12, String str, Continuation<? super p> continuation) {
            super(1, continuation);
            this.f433810c = z12;
            this.f433811d = str;
        }

        @Override // Y41.l
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l Continuation<? super a<ru.cyberity.cbr.core.data.model.g>> continuation) {
            return ((p) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return d.this.new p(this.f433810c, this.f433811d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433808a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.core.data.source.dynamic.b bVar = d.this.applicantKeeper;
                boolean z12 = this.f433810c;
                String str = this.f433811d;
                this.f433808a = 1;
                obj = bVar.b(z12, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", i = {0, 0}, l = {345, 351, 354}, m = "getApplicantByFlowTypeAsResult", n = {"this", "reload"}, s = {"L$0", "Z$0"})
    public static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433812a;

        /* renamed from: b, reason: collision with root package name */
        boolean f433813b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f433814c;

        /* renamed from: e, reason: collision with root package name */
        int f433816e;

        public q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433814c = obj;
            this.f433816e |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.e(false, this);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", i = {0, 0}, l = {335, 337, 340}, m = "getApplicantByFlowTypeOrThrow", n = {"this", "reload"}, s = {"L$0", "Z$0"})
    public static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433817a;

        /* renamed from: b, reason: collision with root package name */
        boolean f433818b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f433819c;

        /* renamed from: e, reason: collision with root package name */
        int f433821e;

        public r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433819c = obj;
            this.f433821e |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.c(false, this);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", i = {}, l = {368}, m = "getApplicantOrThrow", n = {}, s = {})
    public static final class s extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f433822a;

        /* renamed from: c, reason: collision with root package name */
        int f433824c;

        public s(Continuation<? super s> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433822a = obj;
            this.f433824c |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.d(null, false, this);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", i = {0, 0}, l = {411, 412}, m = "getConfigAsResult", n = {"this", "reload"}, s = {"L$0", "Z$0"})
    public static final class t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433825a;

        /* renamed from: b, reason: collision with root package name */
        boolean f433826b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f433827c;

        /* renamed from: e, reason: collision with root package name */
        int f433829e;

        public t(Continuation<? super t> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433827c = obj;
            this.f433829e |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.b(false, (Continuation<? super a<ru.cyberity.cbr.core.data.model.e>>) this);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/a;", "Lru/cyberity/cbr/core/data/model/e;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$getConfigAsResult$2", f = "DataRepositoryImpl.kt", i = {}, l = {412}, m = "invokeSuspend", n = {}, s = {})
    public static final class u extends SuspendLambda implements Y41.l<Continuation<? super a<ru.cyberity.cbr.core.data.model.e>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433830a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f433832c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(boolean z12, Continuation<? super u> continuation) {
            super(1, continuation);
            this.f433832c = z12;
        }

        @Override // Y41.l
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l Continuation<? super a<ru.cyberity.cbr.core.data.model.e>> continuation) {
            return ((u) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return d.this.new u(this.f433832c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433830a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.core.data.source.dynamic.b bVar = d.this.configKeeper;
                boolean z12 = this.f433832c;
                this.f433830a = 1;
                obj = ru.cyberity.cbr.core.data.source.dynamic.b.b(bVar, z12, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", i = {}, l = {409}, m = "getConfigOrThrow", n = {}, s = {})
    public static final class v extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f433833a;

        /* renamed from: c, reason: collision with root package name */
        int f433835c;

        public v(Continuation<? super v> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433833a = obj;
            this.f433835c |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.a(false, (Continuation<? super ru.cyberity.cbr.core.data.model.e>) this);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/a;", "Lru/cyberity/cbr/core/data/source/dynamic/c$b;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$getFeatureFlagsAsResult$2", f = "DataRepositoryImpl.kt", i = {}, l = {426}, m = "invokeSuspend", n = {}, s = {})
    public static final class w extends SuspendLambda implements Y41.l<Continuation<? super a<c.b>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433836a;

        public w(Continuation<? super w> continuation) {
            super(1, continuation);
        }

        @Override // Y41.l
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l Continuation<? super a<c.b>> continuation) {
            return ((w) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return d.this.new w(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433836a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.core.data.source.dynamic.b bVar = d.this.featureFlagsKeeper;
                this.f433836a = 1;
                obj = ru.cyberity.cbr.core.data.source.dynamic.b.b(bVar, false, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", i = {}, l = {422}, m = "getFeatureFlagsOrThrow", n = {}, s = {})
    public static final class x extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f433838a;

        /* renamed from: c, reason: collision with root package name */
        int f433840c;

        public x(Continuation<? super x> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433838a = obj;
            this.f433840c |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.b(this);
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/a;", "Lru/cyberity/cbr/core/data/model/t;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$getRequiredIdDocStatus$2", f = "DataRepositoryImpl.kt", i = {}, l = {406}, m = "invokeSuspend", n = {}, s = {})
    public static final class y extends SuspendLambda implements Y41.l<Continuation<? super a<ru.cyberity.cbr.core.data.model.t>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433841a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f433843c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(boolean z12, Continuation<? super y> continuation) {
            super(1, continuation);
            this.f433843c = z12;
        }

        @Override // Y41.l
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l Continuation<? super a<ru.cyberity.cbr.core.data.model.t>> continuation) {
            return ((y) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return d.this.new y(this.f433843c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433841a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.core.data.source.dynamic.b bVar = d.this.documentsKeeper;
                boolean z12 = this.f433843c;
                this.f433841a = 1;
                obj = ru.cyberity.cbr.core.data.source.dynamic.b.b(bVar, z12, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: DataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/a;", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataRepositoryImpl$getStringsAsResult$2", f = "DataRepositoryImpl.kt", i = {}, l = {419}, m = "invokeSuspend", n = {}, s = {})
    public static final class z extends SuspendLambda implements Y41.l<Continuation<? super a<c.C12476c>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433844a;

        public z(Continuation<? super z> continuation) {
            super(1, continuation);
        }

        @Override // Y41.l
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l Continuation<? super a<c.C12476c>> continuation) {
            return ((z) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return d.this.new z(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433844a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.core.data.source.dynamic.b bVar = d.this.stringsKeeper;
                this.f433844a = 1;
                obj = ru.cyberity.cbr.core.data.source.dynamic.b.b(bVar, false, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    public d(@Y61.k ru.cyberity.cbr.core.data.source.settings.b bVar, @Y61.k ru.cyberity.cbr.core.data.source.applicant.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.common.b bVar2, @Y61.k T t12, @Y61.k M m12, @Y61.k ru.cyberity.cbr.core.c<String> cVar, @Y61.k ru.cyberity.cbr.core.c<String> cVar2) {
        this.settingsRepository = bVar;
        this.applicantDataSource = aVar;
        this.commonService = bVar2;
        this.scope = t12;
        this.dispatcher = m12;
        this.tokenProvider = cVar;
        this.urlProvider = cVar2;
        this.applicantActionKeeper = new ru.cyberity.cbr.core.data.source.dynamic.b<>(t12, m12, new b(null), ru.cyberity.log.c.a(this) + " Action");
        this.applicantKeeper = new ru.cyberity.cbr.core.data.source.dynamic.b<>(t12, m12, new c(null), ru.cyberity.log.c.a(this) + " Applicant");
        this.documentsKeeper = new ru.cyberity.cbr.core.data.source.dynamic.b<>(t12, m12, new e(null), ru.cyberity.log.c.a(this) + " Documents");
        this.configKeeper = new ru.cyberity.cbr.core.data.source.dynamic.b<>(t12, m12, new C12478d(null), ru.cyberity.log.c.a(this) + " Config");
        this.stringsKeeper = new ru.cyberity.cbr.core.data.source.dynamic.b<>(t12, m12, new g0(null), ru.cyberity.log.c.a(this) + " Strings");
        this.featureFlagsKeeper = new ru.cyberity.cbr.core.data.source.dynamic.b<>(t12, m12, new f(null), ru.cyberity.log.c.a(this) + " FeatureFlags");
        this.socketEventsFlow = C43175k.S(new X(new C43152f0(new C43137a0(new d0(null), new C43197r1(new c0(null), C43175k.c(aVar.a(cVar), -1, 2))), new e0(null)), new f0(null)), t12, i2.a.b(i2.f411430a, 5000L, 2), 0);
        Z1<c.a> z1A = p2.a(null);
        this._dataFlow = z1A;
        this.dataFlow = z1A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        N0 n02 = this.periodicalUpdateJob;
        if (n02 != null) {
            n02.c(null);
        }
        this.periodicalUpdateJob = C43259k.d(this.scope, this.dispatcher, null, new b0(null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        a aVar = (a) C42745f0.G(this.applicantActionKeeper.a().E3());
        a aVar2 = (a) C42745f0.G(this.applicantKeeper.a().E3());
        a aVar3 = (a) C42745f0.G(this.documentsKeeper.a().E3());
        a aVar4 = (a) C42745f0.G(this.configKeeper.a().E3());
        a aVar5 = (a) C42745f0.G(this.stringsKeeper.a().E3());
        a aVar6 = (a) C42745f0.G(this.featureFlagsKeeper.a().E3());
        if (aVar2 == null || aVar3 == null || aVar4 == null || aVar5 == null || aVar6 == null) {
            ru.cyberity.cbr.core.a.b(ru.cyberity.cbr.core.a.f432517a, "DataRepository", "updateDataFlow: skipping ...", null, 4, null);
        } else {
            b().setValue(new c.a(aVar2, aVar, aVar3, aVar4, aVar5, aVar6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.data.source.dynamic.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@Y61.l java.lang.String r5, boolean r6, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.model.g> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ru.cyberity.cbr.core.data.source.dynamic.d.s
            if (r0 == 0) goto L13
            r0 = r7
            ru.cyberity.cbr.core.data.source.dynamic.d$s r0 = (ru.cyberity.cbr.core.data.source.dynamic.d.s) r0
            int r1 = r0.f433824c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433824c = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.d$s r0 = new ru.cyberity.cbr.core.data.source.dynamic.d$s
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f433822a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433824c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            r0.f433824c = r3
            java.lang.Object r7 = r4.b(r5, r6, r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            ru.cyberity.cbr.core.data.source.dynamic.a r7 = (ru.cyberity.cbr.core.data.source.dynamic.a) r7
            java.lang.Object r5 = r7.e()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.d(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.data.source.dynamic.c
    @Y61.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Z1<c.a> b() {
        return this.dataFlow;
    }

    @Override // ru.cyberity.cbr.core.data.source.dynamic.c
    @Y61.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public d2<CBRMessage.ServerMessage> a() {
        return this.socketEventsFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // ru.cyberity.cbr.core.data.source.dynamic.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r14) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // ru.cyberity.cbr.core.data.source.dynamic.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(boolean r8, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.g>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ru.cyberity.cbr.core.data.source.dynamic.d.q
            if (r0 == 0) goto L14
            r0 = r9
            ru.cyberity.cbr.core.data.source.dynamic.d$q r0 = (ru.cyberity.cbr.core.data.source.dynamic.d.q) r0
            int r1 = r0.f433816e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f433816e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            ru.cyberity.cbr.core.data.source.dynamic.d$q r0 = new ru.cyberity.cbr.core.data.source.dynamic.d$q
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f433814c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f433816e
            r2 = 3
            r3 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L49
            if (r1 == r5) goto L3f
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            kotlin.C42729a0.b(r9)
            goto La1
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.C42729a0.b(r9)
            goto L91
        L3f:
            boolean r8 = r4.f433813b
            java.lang.Object r1 = r4.f433812a
            ru.cyberity.cbr.core.data.source.dynamic.d r1 = (ru.cyberity.cbr.core.data.source.dynamic.d) r1
            kotlin.C42729a0.b(r9)
            goto L5b
        L49:
            kotlin.C42729a0.b(r9)
            r4.f433812a = r7
            r4.f433813b = r8
            r4.f433816e = r5
            r9 = 0
            java.lang.Object r9 = ru.cyberity.cbr.core.data.source.dynamic.c.a(r7, r9, r4, r5, r6)
            if (r9 != r0) goto L5a
            return r0
        L5a:
            r1 = r7
        L5b:
            ru.cyberity.cbr.core.data.source.dynamic.a r9 = (ru.cyberity.cbr.core.data.source.dynamic.a) r9
            java.lang.Object r5 = r9.d()
            ru.cyberity.cbr.core.data.model.e r5 = (ru.cyberity.cbr.core.data.model.e) r5
            if (r5 != 0) goto L7a
            ru.cyberity.cbr.core.data.source.dynamic.a$a r8 = ru.cyberity.cbr.core.data.source.dynamic.a.INSTANCE
            java.lang.Throwable r9 = r9.a()
            if (r9 == 0) goto L72
            ru.cyberity.cbr.core.data.source.dynamic.a$c r8 = r8.a(r6, r9)
            return r8
        L72:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Config NOT loaded"
            r8.<init>(r9)
            throw r8
        L7a:
            ru.cyberity.cbr.core.data.model.FlowType r9 = r5.getFlowType()
            ru.cyberity.cbr.core.data.model.FlowType r5 = ru.cyberity.cbr.core.data.model.FlowType.Actions
            if (r9 != r5) goto L92
            r4.f433812a = r6
            r4.f433816e = r3
            r5 = 1
            r6 = 0
            r2 = 0
            r3 = r8
            java.lang.Object r9 = ru.cyberity.cbr.core.data.source.dynamic.c.d(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L91
            return r0
        L91:
            return r9
        L92:
            r4.f433812a = r6
            r4.f433816e = r2
            r5 = 1
            r6 = 0
            r2 = 0
            r3 = r8
            java.lang.Object r9 = ru.cyberity.cbr.core.data.source.dynamic.c.c(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto La1
            return r0
        La1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.e(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.data.source.dynamic.c
    @Y61.l
    public Object b(@Y61.l String str, boolean z12, @Y61.k Continuation<? super a<ru.cyberity.cbr.core.data.model.g>> continuation) {
        return a((d) C42745f0.G(this.applicantKeeper.a().E3()), (Y41.l<? super Continuation<? super d>, ? extends Object>) new p(z12, str, null), (Continuation<? super d>) continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.dynamic.c
    @Y61.l
    public Object a(@Y61.l String str, boolean z12, @Y61.k Continuation<? super a<ru.cyberity.cbr.core.data.model.g>> continuation) {
        return a((d) C42745f0.G(this.applicantActionKeeper.a().E3()), (Y41.l<? super Continuation<? super d>, ? extends Object>) new n(z12, str, null), (Continuation<? super d>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@Y61.l ru.cyberity.cbr.core.data.model.g r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru.cyberity.cbr.core.data.source.dynamic.d.i0
            if (r0 == 0) goto L13
            r0 = r6
            ru.cyberity.cbr.core.data.source.dynamic.d$i0 r0 = (ru.cyberity.cbr.core.data.source.dynamic.d.i0) r0
            int r1 = r0.f433760d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433760d = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.d$i0 r0 = new ru.cyberity.cbr.core.data.source.dynamic.d$i0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f433758b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433760d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f433757a
            ru.cyberity.cbr.core.data.source.dynamic.d r5 = (ru.cyberity.cbr.core.data.source.dynamic.d) r5
            kotlin.C42729a0.b(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            if (r5 == 0) goto L4b
            ru.cyberity.cbr.core.data.source.dynamic.b<ru.cyberity.cbr.core.data.model.g, java.lang.String> r6 = r4.applicantActionKeeper
            r0.f433757a = r4
            r0.f433760d = r3
            java.lang.Object r5 = r6.b(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r5 = r4
        L48:
            r5.j()
        L4b:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.b(ru.cyberity.cbr.core.data.model.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.data.source.dynamic.c
    @Y61.l
    public Object d(boolean z12, @Y61.k Continuation<? super a<ru.cyberity.cbr.core.data.model.t>> continuation) {
        return a((d) C42745f0.G(this.documentsKeeper.a().E3()), (Y41.l<? super Continuation<? super d>, ? extends Object>) new y(z12, null), (Continuation<? super d>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.data.source.dynamic.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.l ru.cyberity.cbr.core.data.model.g r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru.cyberity.cbr.core.data.source.dynamic.d.h0
            if (r0 == 0) goto L13
            r0 = r6
            ru.cyberity.cbr.core.data.source.dynamic.d$h0 r0 = (ru.cyberity.cbr.core.data.source.dynamic.d.h0) r0
            int r1 = r0.f433754d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433754d = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.d$h0 r0 = new ru.cyberity.cbr.core.data.source.dynamic.d$h0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f433752b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433754d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f433751a
            ru.cyberity.cbr.core.data.source.dynamic.d r5 = (ru.cyberity.cbr.core.data.source.dynamic.d) r5
            kotlin.C42729a0.b(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            if (r5 == 0) goto L4b
            ru.cyberity.cbr.core.data.source.dynamic.b<ru.cyberity.cbr.core.data.model.g, java.lang.String> r6 = r4.applicantKeeper
            r0.f433751a = r4
            r0.f433754d = r3
            java.lang.Object r5 = r6.b(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r5 = r4
        L48:
            r5.j()
        L4b:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.a(ru.cyberity.cbr.core.data.model.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Y61.l
    public Object d(@Y61.k Continuation<? super a<c.b>> continuation) {
        return a((d) C42745f0.G(this.featureFlagsKeeper.a().E3()), (Y41.l<? super Continuation<? super d>, ? extends Object>) new w(null), (Continuation<? super d>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.data.source.dynamic.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(boolean r7, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.e>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ru.cyberity.cbr.core.data.source.dynamic.d.t
            if (r0 == 0) goto L13
            r0 = r8
            ru.cyberity.cbr.core.data.source.dynamic.d$t r0 = (ru.cyberity.cbr.core.data.source.dynamic.d.t) r0
            int r1 = r0.f433829e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433829e = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.d$t r0 = new ru.cyberity.cbr.core.data.source.dynamic.d$t
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f433827c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433829e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r8)
            goto L70
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            boolean r7 = r0.f433826b
            java.lang.Object r2 = r0.f433825a
            ru.cyberity.cbr.core.data.source.dynamic.d r2 = (ru.cyberity.cbr.core.data.source.dynamic.d) r2
            kotlin.C42729a0.b(r8)
            goto L51
        L3e:
            kotlin.C42729a0.b(r8)
            ru.cyberity.cbr.core.data.source.dynamic.b<ru.cyberity.cbr.core.data.source.dynamic.c$b, kotlin.G0> r8 = r6.featureFlagsKeeper
            r0.f433825a = r6
            r0.f433826b = r7
            r0.f433829e = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r2 = r6
        L51:
            ru.cyberity.cbr.core.data.source.dynamic.b<ru.cyberity.cbr.core.data.model.e, java.lang.Boolean> r8 = r2.configKeeper
            kotlinx.coroutines.flow.d2 r8 = r8.a()
            java.util.List r8 = r8.E3()
            java.lang.Object r8 = kotlin.collections.C42745f0.G(r8)
            ru.cyberity.cbr.core.data.source.dynamic.d$u r4 = new ru.cyberity.cbr.core.data.source.dynamic.d$u
            r5 = 0
            r4.<init>(r7, r5)
            r0.f433825a = r5
            r0.f433829e = r3
            java.lang.Object r8 = r2.a(r8, r4, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.b(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.data.source.dynamic.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(boolean r5, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.model.e> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru.cyberity.cbr.core.data.source.dynamic.d.v
            if (r0 == 0) goto L13
            r0 = r6
            ru.cyberity.cbr.core.data.source.dynamic.d$v r0 = (ru.cyberity.cbr.core.data.source.dynamic.d.v) r0
            int r1 = r0.f433835c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433835c = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.d$v r0 = new ru.cyberity.cbr.core.data.source.dynamic.d$v
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f433833a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433835c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            r0.f433835c = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            ru.cyberity.cbr.core.data.source.dynamic.a r6 = (ru.cyberity.cbr.core.data.source.dynamic.a) r6
            java.lang.Object r5 = r6.e()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.a(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.data.source.dynamic.c
    @Y61.l
    public Object a(@Y61.k Continuation<? super a<c.C12476c>> continuation) {
        return a((d) C42745f0.G(this.stringsKeeper.a().E3()), (Y41.l<? super Continuation<? super d>, ? extends Object>) new z(null), (Continuation<? super d>) continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object a(T r6, Y41.l<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super T> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ru.cyberity.cbr.core.data.source.dynamic.d.j0
            if (r0 == 0) goto L13
            r0 = r8
            ru.cyberity.cbr.core.data.source.dynamic.d$j0 r0 = (ru.cyberity.cbr.core.data.source.dynamic.d.j0) r0
            int r1 = r0.f433768f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433768f = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.d$j0 r0 = new ru.cyberity.cbr.core.data.source.dynamic.d$j0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f433766d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433768f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f433764b
            java.lang.Object r7 = r0.f433763a
            ru.cyberity.cbr.core.data.source.dynamic.d r7 = (ru.cyberity.cbr.core.data.source.dynamic.d) r7
            kotlin.C42729a0.b(r8)
            goto L73
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.f433765c
            r7 = r6
            Y41.l r7 = (Y41.l) r7
            java.lang.Object r6 = r0.f433764b
            java.lang.Object r2 = r0.f433763a
            ru.cyberity.cbr.core.data.source.dynamic.d r2 = (ru.cyberity.cbr.core.data.source.dynamic.d) r2
            kotlin.C42729a0.b(r8)
            r8 = r7
            r7 = r2
            goto L63
        L4b:
            kotlin.C42729a0.b(r8)
            kotlinx.coroutines.N0 r8 = r5.docsAndApplicantJob
            if (r8 == 0) goto L61
            r0.f433763a = r5
            r0.f433764b = r6
            r0.f433765c = r7
            r0.f433768f = r4
            java.lang.Object r8 = r8.A(r0)
            if (r8 != r1) goto L61
            return r1
        L61:
            r8 = r7
            r7 = r5
        L63:
            r0.f433763a = r7
            r0.f433764b = r6
            r2 = 0
            r0.f433765c = r2
            r0.f433768f = r3
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L73
            return r1
        L73:
            boolean r6 = kotlin.jvm.internal.L.f(r6, r8)
            if (r6 != 0) goto L7c
            r7.j()
        L7c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.a(java.lang.Object, Y41.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.data.source.dynamic.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.source.dynamic.c.C12476c> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ru.cyberity.cbr.core.data.source.dynamic.d.a0
            if (r0 == 0) goto L13
            r0 = r5
            ru.cyberity.cbr.core.data.source.dynamic.d$a0 r0 = (ru.cyberity.cbr.core.data.source.dynamic.d.a0) r0
            int r1 = r0.f433703c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433703c = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.d$a0 r0 = new ru.cyberity.cbr.core.data.source.dynamic.d$a0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f433701a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433703c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            r0.f433703c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            ru.cyberity.cbr.core.data.source.dynamic.a r5 = (ru.cyberity.cbr.core.data.source.dynamic.a) r5
            java.lang.Object r5 = r5.e()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.source.dynamic.c.b> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ru.cyberity.cbr.core.data.source.dynamic.d.x
            if (r0 == 0) goto L13
            r0 = r5
            ru.cyberity.cbr.core.data.source.dynamic.d$x r0 = (ru.cyberity.cbr.core.data.source.dynamic.d.x) r0
            int r1 = r0.f433840c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433840c = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.d$x r0 = new ru.cyberity.cbr.core.data.source.dynamic.d$x
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f433838a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433840c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            r0.f433840c = r3
            java.lang.Object r5 = r4.d(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            ru.cyberity.cbr.core.data.source.dynamic.a r5 = (ru.cyberity.cbr.core.data.source.dynamic.a) r5
            java.lang.Object r5 = r5.e()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlinx.coroutines.T r5, kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru.cyberity.cbr.core.data.source.dynamic.d.m0
            if (r0 == 0) goto L13
            r0 = r6
            ru.cyberity.cbr.core.data.source.dynamic.d$m0 r0 = (ru.cyberity.cbr.core.data.source.dynamic.d.m0) r0
            int r1 = r0.f433792e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433792e = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.d$m0 r0 = new ru.cyberity.cbr.core.data.source.dynamic.d$m0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f433790c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433792e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f433789b
            kotlinx.coroutines.T r5 = (kotlinx.coroutines.T) r5
            java.lang.Object r0 = r0.f433788a
            ru.cyberity.cbr.core.data.source.dynamic.d r0 = (ru.cyberity.cbr.core.data.source.dynamic.d) r0
            kotlin.C42729a0.b(r6)
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.N0 r6 = r4.docsAndApplicantJob
            if (r6 == 0) goto L4d
            r0.f433788a = r4
            r0.f433789b = r5
            r0.f433792e = r3
            java.lang.Object r6 = r6.A(r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            kotlinx.coroutines.M r6 = r0.dispatcher
            ru.cyberity.cbr.core.data.source.dynamic.d$n0 r1 = new ru.cyberity.cbr.core.data.source.dynamic.d$n0
            r2 = 0
            r1.<init>(r5, r2)
            r3 = 2
            kotlinx.coroutines.N0 r5 = kotlinx.coroutines.C43259k.d(r5, r6, r2, r1, r3)
            r0.docsAndApplicantJob = r5
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.b(kotlinx.coroutines.T, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(boolean r8, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.model.g> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ru.cyberity.cbr.core.data.source.dynamic.d.r
            if (r0 == 0) goto L14
            r0 = r9
            ru.cyberity.cbr.core.data.source.dynamic.d$r r0 = (ru.cyberity.cbr.core.data.source.dynamic.d.r) r0
            int r1 = r0.f433821e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f433821e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            ru.cyberity.cbr.core.data.source.dynamic.d$r r0 = new ru.cyberity.cbr.core.data.source.dynamic.d$r
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f433819c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f433821e
            r2 = 3
            r3 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L48
            if (r1 == r6) goto L3e
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            kotlin.C42729a0.b(r9)
            goto L83
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.C42729a0.b(r9)
            goto L73
        L3e:
            boolean r8 = r4.f433818b
            java.lang.Object r1 = r4.f433817a
            ru.cyberity.cbr.core.data.source.dynamic.d r1 = (ru.cyberity.cbr.core.data.source.dynamic.d) r1
            kotlin.C42729a0.b(r9)
            goto L5a
        L48:
            kotlin.C42729a0.b(r9)
            r4.f433817a = r7
            r4.f433818b = r8
            r4.f433821e = r6
            r9 = 0
            java.lang.Object r9 = ru.cyberity.cbr.core.data.source.dynamic.c.c(r7, r9, r4, r6, r5)
            if (r9 != r0) goto L59
            return r0
        L59:
            r1 = r7
        L5a:
            ru.cyberity.cbr.core.data.model.e r9 = (ru.cyberity.cbr.core.data.model.e) r9
            ru.cyberity.cbr.core.data.model.FlowType r9 = r9.getFlowType()
            ru.cyberity.cbr.core.data.model.FlowType r6 = ru.cyberity.cbr.core.data.model.FlowType.Actions
            if (r9 != r6) goto L74
            r4.f433817a = r5
            r4.f433821e = r3
            r5 = 1
            r6 = 0
            r2 = 0
            r3 = r8
            java.lang.Object r9 = ru.cyberity.cbr.core.data.source.dynamic.c.a(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L73
            return r0
        L73:
            return r9
        L74:
            r4.f433817a = r5
            r4.f433821e = r2
            r5 = 1
            r6 = 0
            r2 = 0
            r3 = r8
            java.lang.Object r9 = ru.cyberity.cbr.core.data.source.dynamic.c.b(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L83
            return r0
        L83:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.c(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.T r5, kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru.cyberity.cbr.core.data.source.dynamic.d.k0
            if (r0 == 0) goto L13
            r0 = r6
            ru.cyberity.cbr.core.data.source.dynamic.d$k0 r0 = (ru.cyberity.cbr.core.data.source.dynamic.d.k0) r0
            int r1 = r0.f433775e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433775e = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.d$k0 r0 = new ru.cyberity.cbr.core.data.source.dynamic.d$k0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f433773c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433775e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f433772b
            kotlinx.coroutines.T r5 = (kotlinx.coroutines.T) r5
            java.lang.Object r0 = r0.f433771a
            ru.cyberity.cbr.core.data.source.dynamic.d r0 = (ru.cyberity.cbr.core.data.source.dynamic.d) r0
            kotlin.C42729a0.b(r6)
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.N0 r6 = r4.docsAndApplicantJob
            if (r6 == 0) goto L4d
            r0.f433771a = r4
            r0.f433772b = r5
            r0.f433775e = r3
            java.lang.Object r6 = r6.A(r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            kotlinx.coroutines.M r6 = r0.dispatcher
            ru.cyberity.cbr.core.data.source.dynamic.d$l0 r1 = new ru.cyberity.cbr.core.data.source.dynamic.d$l0
            r2 = 0
            r1.<init>(r5, r2)
            r3 = 2
            kotlinx.coroutines.N0 r5 = kotlinx.coroutines.C43259k.d(r5, r6, r2, r1, r3)
            r0.docsAndApplicantJob = r5
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.a(kotlinx.coroutines.T, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.data.source.dynamic.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@Y61.l java.lang.String r5, boolean r6, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.model.g> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ru.cyberity.cbr.core.data.source.dynamic.d.o
            if (r0 == 0) goto L13
            r0 = r7
            ru.cyberity.cbr.core.data.source.dynamic.d$o r0 = (ru.cyberity.cbr.core.data.source.dynamic.d.o) r0
            int r1 = r0.f433807c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433807c = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.d$o r0 = new ru.cyberity.cbr.core.data.source.dynamic.d$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f433805a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433807c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            r0.f433807c = r3
            java.lang.Object r7 = r4.a(r5, r6, r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            ru.cyberity.cbr.core.data.source.dynamic.a r7 = (ru.cyberity.cbr.core.data.source.dynamic.a) r7
            java.lang.Object r5 = r7.e()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.d.c(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public d(ru.cyberity.cbr.core.data.source.settings.b bVar, ru.cyberity.cbr.core.data.source.applicant.a aVar, ru.cyberity.cbr.core.data.source.common.b bVar2, T t12, M m12, ru.cyberity.cbr.core.c cVar, ru.cyberity.cbr.core.c cVar2, int i12, C42822w c42822w) {
        this(bVar, aVar, bVar2, t12, (i12 & 16) != 0 ? C43262l0.f411947c : m12, cVar, cVar2);
    }
}

package ru.cyberity.cbr.domain;

import android.content.Context;
import android.provider.Settings;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.analytics.SdkEvent;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.r0;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.FlowType;
import ru.cyberity.cbr.core.data.source.dynamic.c;

/* compiled from: PrepareSDKUseCase.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001c\u001eB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001c\u001a\u0012\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001e\u0010*R\u001b\u0010-\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b \u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lru/cyberity/cbr/domain/f;", "Lru/cyberity/cbr/core/domain/base/b;", "Lru/cyberity/cbr/domain/f$b;", "Lru/cyberity/cbr/domain/f$a;", "Landroid/content/Context;", "context", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/settings/b;", "settingsRepository", "Lru/cyberity/cbr/core/data/source/log/a;", "logRepository", "Lru/cyberity/cbr/core/data/source/analythic/a;", "analyticRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Landroid/content/Context;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/settings/b;Lru/cyberity/cbr/core/data/source/log/a;Lru/cyberity/cbr/core/data/source/analythic/a;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "Lru/cyberity/cbr/core/b;", "serviceLocator", "(Lru/cyberity/cbr/core/b;)V", "Lkotlin/G0;", "d", "()V", "params", "Lru/cyberity/cbr/core/domain/model/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "a", "(Lru/cyberity/cbr/domain/f$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Landroid/content/Context;", "c", "Lru/cyberity/cbr/core/data/source/settings/b;", "Lru/cyberity/cbr/core/data/source/log/a;", "e", "Lru/cyberity/cbr/core/data/source/analythic/a;", "f", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "", "g", "Lkotlin/C;", "()Z", "isRooted1", "h", "isRooted2", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class f extends ru.cyberity.cbr.core.domain.base.b<b, a> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.settings.b settingsRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.log.a logRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.analythic.a analyticRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C isRooted1;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C isRooted2;

    /* compiled from: PrepareSDKUseCase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/domain/f$a;", "", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
    }

    /* compiled from: PrepareSDKUseCase.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/cyberity/cbr/domain/f$b;", "", "Lru/cyberity/cbr/core/data/model/e;", Navigation.CONFIG, "Lru/cyberity/cbr/core/data/model/g;", "applicant", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "strings", "<init>", "(Lru/cyberity/cbr/core/data/model/e;Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/source/dynamic/c$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/data/model/e;", "e", "()Lru/cyberity/cbr/core/data/model/e;", "b", "Lru/cyberity/cbr/core/data/model/g;", "d", "()Lru/cyberity/cbr/core/data/model/g;", "c", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "f", "()Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final ru.cyberity.cbr.core.data.model.e config;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final ru.cyberity.cbr.core.data.model.g applicant;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final c.C12476c strings;

        public b(@Y61.k ru.cyberity.cbr.core.data.model.e eVar, @Y61.k ru.cyberity.cbr.core.data.model.g gVar, @Y61.k c.C12476c c12476c) {
            this.config = eVar;
            this.applicant = gVar;
            this.strings = c12476c;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final ru.cyberity.cbr.core.data.model.g getApplicant() {
            return this.applicant;
        }

        @Y61.k
        /* renamed from: e, reason: from getter */
        public final ru.cyberity.cbr.core.data.model.e getConfig() {
            return this.config;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return L.f(this.config, bVar.config) && L.f(this.applicant, bVar.applicant) && L.f(this.strings, bVar.strings);
        }

        public int hashCode() {
            return this.strings.hashCode() + ((this.applicant.hashCode() + (this.config.hashCode() * 31)) * 31);
        }

        @Y61.k
        public String toString() {
            return "Result(config=" + this.config + ", applicant=" + this.applicant + ", strings=" + this.strings + ')';
        }
    }

    /* compiled from: PrepareSDKUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f434303a;

        static {
            int[] iArr = new int[FlowType.values().length];
            iArr[FlowType.Standalone.ordinal()] = 1;
            iArr[FlowType.Module.ordinal()] = 2;
            iArr[FlowType.Actions.ordinal()] = 3;
            f434303a = iArr;
        }
    }

    /* compiled from: PrepareSDKUseCase.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(new r0(f.this.context).getIsRooted());
        }
    }

    /* compiled from: PrepareSDKUseCase.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends N implements Y41.a<Boolean> {
        public e() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke() {
            /*
                r3 = this;
                ru.cyberity.cbr.core.common.f r0 = new ru.cyberity.cbr.core.common.f
                r0.<init>()
                ru.cyberity.cbr.core.common.s0 r1 = new ru.cyberity.cbr.core.common.s0
                ru.cyberity.cbr.domain.f r2 = ru.cyberity.cbr.domain.f.this
                android.content.Context r2 = ru.cyberity.cbr.domain.f.a(r2)
                r1.<init>(r2, r0)
                boolean r1 = r1.f()
                if (r1 != 0) goto L25
                java.lang.Boolean r0 = r0.f()
                r1 = 0
                if (r0 == 0) goto L22
                boolean r0 = r0.booleanValue()
                goto L23
            L22:
                r0 = r1
            L23:
                if (r0 == 0) goto L26
            L25:
                r1 = 1
            L26:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.domain.f.e.invoke():java.lang.Boolean");
        }
    }

    /* compiled from: PrepareSDKUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.domain.PrepareSDKUseCase", f = "PrepareSDKUseCase.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5}, l = {75, 83, 107, 120, 127, 130, 162}, m = "run", n = {"this", "kibanaLogger", "this", "kibanaLogger", Navigation.CONFIG, "this", Navigation.CONFIG, "applicant", "this", Navigation.CONFIG, "applicant", "this", Navigation.CONFIG, "applicant", "this", Navigation.CONFIG, "applicant", "strings"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: ru.cyberity.cbr.domain.f$f, reason: collision with other inner class name */
    public static final class C12492f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434306a;

        /* renamed from: b, reason: collision with root package name */
        Object f434307b;

        /* renamed from: c, reason: collision with root package name */
        Object f434308c;

        /* renamed from: d, reason: collision with root package name */
        Object f434309d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f434310e;

        /* renamed from: g, reason: collision with root package name */
        int f434312g;

        public C12492f(Continuation<? super C12492f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434310e = obj;
            this.f434312g |= BeduinInputModel.MIN_TEXT_VERSION;
            return f.this.a((a) null, (Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, b>>) this);
        }
    }

    /* compiled from: PrepareSDKUseCase.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/DocumentType;", "it", "", "a", "(Lru/cyberity/cbr/core/data/model/DocumentType;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends N implements Y41.l<DocumentType, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f434313a = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@Y61.k DocumentType documentType) {
            return documentType.getValue();
        }
    }

    public f(@Y61.k Context context, @Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.settings.b bVar, @Y61.k ru.cyberity.cbr.core.data.source.log.a aVar2, @Y61.k ru.cyberity.cbr.core.data.source.analythic.a aVar3, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(aVar);
        this.context = context;
        this.settingsRepository = bVar;
        this.logRepository = aVar2;
        this.analyticRepository = aVar3;
        this.dataRepository = cVar;
        this.isRooted1 = C42727D.c(new d());
        this.isRooted2 = C42727D.c(new e());
    }

    private final boolean c() {
        return ((Boolean) this.isRooted2.getValue()).booleanValue();
    }

    private final void d() {
        ru.cyberity.cbr.core.analytics.l.a(ru.cyberity.cbr.core.analytics.f.a(0L, 1, null).a(SdkEvent.Init).a(P0.j(new Q("isDKAEnabled", Boolean.valueOf(Settings.System.getInt(this.context.getContentResolver(), "always_finish_activities", 0) == 1)), new Q("isRooted", Boolean.valueOf(b() || c())), new Q("isVideoIdentAvailable", Boolean.valueOf(n0.f432787a.isModuleAvailable("ru.cyberity.cbr.videoident.CBRVideoIdent"))))), false, 1, null);
    }

    @Override // ru.cyberity.cbr.core.domain.base.b
    public /* bridge */ /* synthetic */ Object b(a aVar, Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ? extends b>> continuation) {
        return a(aVar, (Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, b>>) continuation);
    }

    private final boolean b() {
        return ((Boolean) this.isRooted1.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0278 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0287 A[Catch: Exception -> 0x004f, CBRApplicantNotFoundException -> 0x0164, TryCatch #1 {Exception -> 0x004f, blocks: (B:14:0x004a, B:110:0x029d, B:112:0x02a1, B:113:0x02c2, B:115:0x02c6, B:117:0x02da, B:120:0x02e0, B:121:0x02ed, B:123:0x02f3, B:126:0x0302, B:136:0x0319, B:129:0x0307, B:134:0x0312, B:137:0x031d, B:138:0x0324, B:141:0x0335, B:143:0x033a, B:145:0x033e, B:148:0x0345, B:150:0x038d, B:151:0x0394, B:149:0x0368, B:105:0x027c, B:107:0x0287, B:101:0x0267, B:54:0x012e, B:58:0x0153, B:60:0x015d, B:66:0x0169, B:69:0x0179, B:70:0x018e, B:71:0x018f, B:73:0x0199, B:76:0x01a6, B:77:0x01ad, B:79:0x01b3, B:81:0x01b9, B:84:0x01c6, B:85:0x01cd, B:86:0x01de, B:88:0x01e4, B:93:0x01f8, B:94:0x01fc, B:96:0x020b, B:41:0x00b9, B:48:0x0104, B:50:0x0113, B:153:0x03d4, B:154:0x03da), top: B:170:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a1 A[Catch: Exception -> 0x004f, CBRApplicantNotFoundException -> 0x0164, TryCatch #1 {Exception -> 0x004f, blocks: (B:14:0x004a, B:110:0x029d, B:112:0x02a1, B:113:0x02c2, B:115:0x02c6, B:117:0x02da, B:120:0x02e0, B:121:0x02ed, B:123:0x02f3, B:126:0x0302, B:136:0x0319, B:129:0x0307, B:134:0x0312, B:137:0x031d, B:138:0x0324, B:141:0x0335, B:143:0x033a, B:145:0x033e, B:148:0x0345, B:150:0x038d, B:151:0x0394, B:149:0x0368, B:105:0x027c, B:107:0x0287, B:101:0x0267, B:54:0x012e, B:58:0x0153, B:60:0x015d, B:66:0x0169, B:69:0x0179, B:70:0x018e, B:71:0x018f, B:73:0x0199, B:76:0x01a6, B:77:0x01ad, B:79:0x01b3, B:81:0x01b9, B:84:0x01c6, B:85:0x01cd, B:86:0x01de, B:88:0x01e4, B:93:0x01f8, B:94:0x01fc, B:96:0x020b, B:41:0x00b9, B:48:0x0104, B:50:0x0113, B:153:0x03d4, B:154:0x03da), top: B:170:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x033e A[Catch: Exception -> 0x004f, CBRApplicantNotFoundException -> 0x0164, TryCatch #1 {Exception -> 0x004f, blocks: (B:14:0x004a, B:110:0x029d, B:112:0x02a1, B:113:0x02c2, B:115:0x02c6, B:117:0x02da, B:120:0x02e0, B:121:0x02ed, B:123:0x02f3, B:126:0x0302, B:136:0x0319, B:129:0x0307, B:134:0x0312, B:137:0x031d, B:138:0x0324, B:141:0x0335, B:143:0x033a, B:145:0x033e, B:148:0x0345, B:150:0x038d, B:151:0x0394, B:149:0x0368, B:105:0x027c, B:107:0x0287, B:101:0x0267, B:54:0x012e, B:58:0x0153, B:60:0x015d, B:66:0x0169, B:69:0x0179, B:70:0x018e, B:71:0x018f, B:73:0x0199, B:76:0x01a6, B:77:0x01ad, B:79:0x01b3, B:81:0x01b9, B:84:0x01c6, B:85:0x01cd, B:86:0x01de, B:88:0x01e4, B:93:0x01f8, B:94:0x01fc, B:96:0x020b, B:41:0x00b9, B:48:0x0104, B:50:0x0113, B:153:0x03d4, B:154:0x03da), top: B:170:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0368 A[Catch: Exception -> 0x004f, CBRApplicantNotFoundException -> 0x0164, TryCatch #1 {Exception -> 0x004f, blocks: (B:14:0x004a, B:110:0x029d, B:112:0x02a1, B:113:0x02c2, B:115:0x02c6, B:117:0x02da, B:120:0x02e0, B:121:0x02ed, B:123:0x02f3, B:126:0x0302, B:136:0x0319, B:129:0x0307, B:134:0x0312, B:137:0x031d, B:138:0x0324, B:141:0x0335, B:143:0x033a, B:145:0x033e, B:148:0x0345, B:150:0x038d, B:151:0x0394, B:149:0x0368, B:105:0x027c, B:107:0x0287, B:101:0x0267, B:54:0x012e, B:58:0x0153, B:60:0x015d, B:66:0x0169, B:69:0x0179, B:70:0x018e, B:71:0x018f, B:73:0x0199, B:76:0x01a6, B:77:0x01ad, B:79:0x01b3, B:81:0x01b9, B:84:0x01c6, B:85:0x01cd, B:86:0x01de, B:88:0x01e4, B:93:0x01f8, B:94:0x01fc, B:96:0x020b, B:41:0x00b9, B:48:0x0104, B:50:0x0113, B:153:0x03d4, B:154:0x03da), top: B:170:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d4 A[Catch: Exception -> 0x004f, CBRApplicantNotFoundException -> 0x0164, TryCatch #1 {Exception -> 0x004f, blocks: (B:14:0x004a, B:110:0x029d, B:112:0x02a1, B:113:0x02c2, B:115:0x02c6, B:117:0x02da, B:120:0x02e0, B:121:0x02ed, B:123:0x02f3, B:126:0x0302, B:136:0x0319, B:129:0x0307, B:134:0x0312, B:137:0x031d, B:138:0x0324, B:141:0x0335, B:143:0x033a, B:145:0x033e, B:148:0x0345, B:150:0x038d, B:151:0x0394, B:149:0x0368, B:105:0x027c, B:107:0x0287, B:101:0x0267, B:54:0x012e, B:58:0x0153, B:60:0x015d, B:66:0x0169, B:69:0x0179, B:70:0x018e, B:71:0x018f, B:73:0x0199, B:76:0x01a6, B:77:0x01ad, B:79:0x01b3, B:81:0x01b9, B:84:0x01c6, B:85:0x01cd, B:86:0x01de, B:88:0x01e4, B:93:0x01f8, B:94:0x01fc, B:96:0x020b, B:41:0x00b9, B:48:0x0104, B:50:0x0113, B:153:0x03d4, B:154:0x03da), top: B:170:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0416 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113 A[Catch: Exception -> 0x004f, CBRApplicantNotFoundException -> 0x0164, TryCatch #1 {Exception -> 0x004f, blocks: (B:14:0x004a, B:110:0x029d, B:112:0x02a1, B:113:0x02c2, B:115:0x02c6, B:117:0x02da, B:120:0x02e0, B:121:0x02ed, B:123:0x02f3, B:126:0x0302, B:136:0x0319, B:129:0x0307, B:134:0x0312, B:137:0x031d, B:138:0x0324, B:141:0x0335, B:143:0x033a, B:145:0x033e, B:148:0x0345, B:150:0x038d, B:151:0x0394, B:149:0x0368, B:105:0x027c, B:107:0x0287, B:101:0x0267, B:54:0x012e, B:58:0x0153, B:60:0x015d, B:66:0x0169, B:69:0x0179, B:70:0x018e, B:71:0x018f, B:73:0x0199, B:76:0x01a6, B:77:0x01ad, B:79:0x01b3, B:81:0x01b9, B:84:0x01c6, B:85:0x01cd, B:86:0x01de, B:88:0x01e4, B:93:0x01f8, B:94:0x01fc, B:96:0x020b, B:41:0x00b9, B:48:0x0104, B:50:0x0113, B:153:0x03d4, B:154:0x03da), top: B:170:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018f A[Catch: Exception -> 0x004f, CBRApplicantNotFoundException -> 0x0164, TryCatch #1 {Exception -> 0x004f, blocks: (B:14:0x004a, B:110:0x029d, B:112:0x02a1, B:113:0x02c2, B:115:0x02c6, B:117:0x02da, B:120:0x02e0, B:121:0x02ed, B:123:0x02f3, B:126:0x0302, B:136:0x0319, B:129:0x0307, B:134:0x0312, B:137:0x031d, B:138:0x0324, B:141:0x0335, B:143:0x033a, B:145:0x033e, B:148:0x0345, B:150:0x038d, B:151:0x0394, B:149:0x0368, B:105:0x027c, B:107:0x0287, B:101:0x0267, B:54:0x012e, B:58:0x0153, B:60:0x015d, B:66:0x0169, B:69:0x0179, B:70:0x018e, B:71:0x018f, B:73:0x0199, B:76:0x01a6, B:77:0x01ad, B:79:0x01b3, B:81:0x01b9, B:84:0x01c6, B:85:0x01cd, B:86:0x01de, B:88:0x01e4, B:93:0x01f8, B:94:0x01fc, B:96:0x020b, B:41:0x00b9, B:48:0x0104, B:50:0x0113, B:153:0x03d4, B:154:0x03da), top: B:170:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0199 A[Catch: Exception -> 0x004f, CBRApplicantNotFoundException -> 0x0164, TryCatch #1 {Exception -> 0x004f, blocks: (B:14:0x004a, B:110:0x029d, B:112:0x02a1, B:113:0x02c2, B:115:0x02c6, B:117:0x02da, B:120:0x02e0, B:121:0x02ed, B:123:0x02f3, B:126:0x0302, B:136:0x0319, B:129:0x0307, B:134:0x0312, B:137:0x031d, B:138:0x0324, B:141:0x0335, B:143:0x033a, B:145:0x033e, B:148:0x0345, B:150:0x038d, B:151:0x0394, B:149:0x0368, B:105:0x027c, B:107:0x0287, B:101:0x0267, B:54:0x012e, B:58:0x0153, B:60:0x015d, B:66:0x0169, B:69:0x0179, B:70:0x018e, B:71:0x018f, B:73:0x0199, B:76:0x01a6, B:77:0x01ad, B:79:0x01b3, B:81:0x01b9, B:84:0x01c6, B:85:0x01cd, B:86:0x01de, B:88:0x01e4, B:93:0x01f8, B:94:0x01fc, B:96:0x020b, B:41:0x00b9, B:48:0x0104, B:50:0x0113, B:153:0x03d4, B:154:0x03da), top: B:170:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6 A[Catch: Exception -> 0x004f, CBRApplicantNotFoundException -> 0x0164, TryCatch #1 {Exception -> 0x004f, blocks: (B:14:0x004a, B:110:0x029d, B:112:0x02a1, B:113:0x02c2, B:115:0x02c6, B:117:0x02da, B:120:0x02e0, B:121:0x02ed, B:123:0x02f3, B:126:0x0302, B:136:0x0319, B:129:0x0307, B:134:0x0312, B:137:0x031d, B:138:0x0324, B:141:0x0335, B:143:0x033a, B:145:0x033e, B:148:0x0345, B:150:0x038d, B:151:0x0394, B:149:0x0368, B:105:0x027c, B:107:0x0287, B:101:0x0267, B:54:0x012e, B:58:0x0153, B:60:0x015d, B:66:0x0169, B:69:0x0179, B:70:0x018e, B:71:0x018f, B:73:0x0199, B:76:0x01a6, B:77:0x01ad, B:79:0x01b3, B:81:0x01b9, B:84:0x01c6, B:85:0x01cd, B:86:0x01de, B:88:0x01e4, B:93:0x01f8, B:94:0x01fc, B:96:0x020b, B:41:0x00b9, B:48:0x0104, B:50:0x0113, B:153:0x03d4, B:154:0x03da), top: B:170:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c6 A[Catch: Exception -> 0x004f, CBRApplicantNotFoundException -> 0x0164, TryCatch #1 {Exception -> 0x004f, blocks: (B:14:0x004a, B:110:0x029d, B:112:0x02a1, B:113:0x02c2, B:115:0x02c6, B:117:0x02da, B:120:0x02e0, B:121:0x02ed, B:123:0x02f3, B:126:0x0302, B:136:0x0319, B:129:0x0307, B:134:0x0312, B:137:0x031d, B:138:0x0324, B:141:0x0335, B:143:0x033a, B:145:0x033e, B:148:0x0345, B:150:0x038d, B:151:0x0394, B:149:0x0368, B:105:0x027c, B:107:0x0287, B:101:0x0267, B:54:0x012e, B:58:0x0153, B:60:0x015d, B:66:0x0169, B:69:0x0179, B:70:0x018e, B:71:0x018f, B:73:0x0199, B:76:0x01a6, B:77:0x01ad, B:79:0x01b3, B:81:0x01b9, B:84:0x01c6, B:85:0x01cd, B:86:0x01de, B:88:0x01e4, B:93:0x01f8, B:94:0x01fc, B:96:0x020b, B:41:0x00b9, B:48:0x0104, B:50:0x0113, B:153:0x03d4, B:154:0x03da), top: B:170:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e4 A[Catch: Exception -> 0x004f, CBRApplicantNotFoundException -> 0x0164, TryCatch #1 {Exception -> 0x004f, blocks: (B:14:0x004a, B:110:0x029d, B:112:0x02a1, B:113:0x02c2, B:115:0x02c6, B:117:0x02da, B:120:0x02e0, B:121:0x02ed, B:123:0x02f3, B:126:0x0302, B:136:0x0319, B:129:0x0307, B:134:0x0312, B:137:0x031d, B:138:0x0324, B:141:0x0335, B:143:0x033a, B:145:0x033e, B:148:0x0345, B:150:0x038d, B:151:0x0394, B:149:0x0368, B:105:0x027c, B:107:0x0287, B:101:0x0267, B:54:0x012e, B:58:0x0153, B:60:0x015d, B:66:0x0169, B:69:0x0179, B:70:0x018e, B:71:0x018f, B:73:0x0199, B:76:0x01a6, B:77:0x01ad, B:79:0x01b3, B:81:0x01b9, B:84:0x01c6, B:85:0x01cd, B:86:0x01de, B:88:0x01e4, B:93:0x01f8, B:94:0x01fc, B:96:0x020b, B:41:0x00b9, B:48:0x0104, B:50:0x0113, B:153:0x03d4, B:154:0x03da), top: B:170:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020b A[Catch: Exception -> 0x004f, CBRApplicantNotFoundException -> 0x0164, TryCatch #1 {Exception -> 0x004f, blocks: (B:14:0x004a, B:110:0x029d, B:112:0x02a1, B:113:0x02c2, B:115:0x02c6, B:117:0x02da, B:120:0x02e0, B:121:0x02ed, B:123:0x02f3, B:126:0x0302, B:136:0x0319, B:129:0x0307, B:134:0x0312, B:137:0x031d, B:138:0x0324, B:141:0x0335, B:143:0x033a, B:145:0x033e, B:148:0x0345, B:150:0x038d, B:151:0x0394, B:149:0x0368, B:105:0x027c, B:107:0x0287, B:101:0x0267, B:54:0x012e, B:58:0x0153, B:60:0x015d, B:66:0x0169, B:69:0x0179, B:70:0x018e, B:71:0x018f, B:73:0x0199, B:76:0x01a6, B:77:0x01ad, B:79:0x01b3, B:81:0x01b9, B:84:0x01c6, B:85:0x01cd, B:86:0x01de, B:88:0x01e4, B:93:0x01f8, B:94:0x01fc, B:96:0x020b, B:41:0x00b9, B:48:0x0104, B:50:0x0113, B:153:0x03d4, B:154:0x03da), top: B:170:0x002a }] */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v34, types: [T, java.util.Map] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k ru.cyberity.cbr.domain.f.a r33, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends java.lang.Exception, ru.cyberity.cbr.domain.f.b>> r34) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.domain.f.a(ru.cyberity.cbr.domain.f$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public f(@Y61.k ru.cyberity.cbr.core.b bVar) {
        this(bVar.g(), bVar.k(), bVar.z(), bVar.r(), bVar.c(), bVar.m());
    }
}

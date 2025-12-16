package ru.cyberity.cbr.geo.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.publish.drafts.LocalPublishState;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SendAddressUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0086Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/geo/domain/c;", "", "Lru/cyberity/cbr/core/data/source/applicant/b;", "applicantRepository", "Lru/cyberity/cbr/core/data/source/settings/b;", "settingsRepository", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/b;Lru/cyberity/cbr/core/data/source/settings/b;Lru/cyberity/cbr/core/data/source/common/a;)V", "", "", LocalPublishState.FIELDS, "Lkotlin/Z;", "Lru/cyberity/cbr/core/data/model/g$a;", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/b;", "b", "Lru/cyberity/cbr/core/data/source/settings/b;", "c", "Lru/cyberity/cbr/core/data/source/common/a;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.applicant.b applicantRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.settings.b settingsRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    /* compiled from: SendAddressUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.geo.domain.SendAddressUseCase", f = "SendAddressUseCase.kt", i = {0, 0, 0, 1}, l = {21, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invoke-gIAlu-s", n = {"this", LocalPublishState.FIELDS, "applicantId", "this"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434422a;

        /* renamed from: b, reason: collision with root package name */
        Object f434423b;

        /* renamed from: c, reason: collision with root package name */
        Object f434424c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f434425d;

        /* renamed from: f, reason: collision with root package name */
        int f434427f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f434425d = obj;
            this.f434427f |= BeduinInputModel.MIN_TEXT_VERSION;
            Object objA = c.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
        }
    }

    public c(@k ru.cyberity.cbr.core.data.source.applicant.b bVar, @k ru.cyberity.cbr.core.data.source.settings.b bVar2, @k ru.cyberity.cbr.core.data.source.common.a aVar) {
        this.applicantRepository = bVar;
        this.settingsRepository = bVar2;
        this.commonRepository = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|2|(2:4|(1:6)(1:7))(0)|8|(5:(1:(1:(5:12|75|13|53|79)(2:17|18))(4:19|65|20|21))(4:24|69|25|(1:27)(1:28))|73|48|49|(1:51)(3:52|53|79))|67|29|(3:33|(2:36|34)|77)|39|(2:42|40)|78|43|(1:45)|71|46|47|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0103, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.util.Map<java.lang.String, ? extends java.lang.Object> r10, @Y61.k kotlin.coroutines.Continuation<? super kotlin.Z<ru.cyberity.cbr.core.data.model.g.a>> r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.domain.c.a(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

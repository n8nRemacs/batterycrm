package ru.cyberity.cbr.core.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.Navigation;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CountriesUseCase.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0086Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\f\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/domain/b;", "", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "", "filterCountriesByDocuments", "Lkotlin/Z;", "Lru/cyberity/cbr/core/domain/c;", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/common/a;", "()Lru/cyberity/cbr/core/data/source/common/a;", "b", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "()Lru/cyberity/cbr/core/data/source/dynamic/c;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* compiled from: CountriesUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.domain.CountriesUseCase", f = "CountriesUseCase.kt", i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, 32, 33, 44}, m = "invoke-gIAlu-s", n = {"this", "filterCountriesByDocuments", "this", Navigation.CONFIG, "countriesMap", "result", "filterCountriesByDocuments", "this", Navigation.CONFIG, "countriesMap", "result", "filterCountriesByDocuments", "currentCountryKey"}, s = {"L$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433882a;

        /* renamed from: b, reason: collision with root package name */
        Object f433883b;

        /* renamed from: c, reason: collision with root package name */
        Object f433884c;

        /* renamed from: d, reason: collision with root package name */
        Object f433885d;

        /* renamed from: e, reason: collision with root package name */
        Object f433886e;

        /* renamed from: f, reason: collision with root package name */
        Object f433887f;

        /* renamed from: g, reason: collision with root package name */
        boolean f433888g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f433889h;

        /* renamed from: j, reason: collision with root package name */
        int f433891j;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433889h = obj;
            this.f433891j |= BeduinInputModel.MIN_TEXT_VERSION;
            Object objA = b.this.a(false, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
        }
    }

    public b(@Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        this.commonRepository = aVar;
        this.dataRepository = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0218 A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:15:0x004c, B:119:0x023e, B:121:0x025d, B:22:0x006e, B:66:0x014e, B:68:0x0152, B:69:0x0173, B:71:0x0177, B:73:0x018b, B:76:0x0191, B:77:0x019e, B:79:0x01a4, B:82:0x01b3, B:92:0x01ca, B:85:0x01b8, B:90:0x01c3, B:94:0x01cf, B:95:0x01d7, B:98:0x01e8, B:101:0x01f0, B:105:0x01fc, B:110:0x0207, B:115:0x0218, B:25:0x0085, B:58:0x0129, B:60:0x0131, B:63:0x0139, B:28:0x0090, B:36:0x00b0, B:38:0x00bd, B:39:0x00ca, B:41:0x00d0, B:44:0x00da, B:47:0x00e1, B:51:0x00ee, B:54:0x00fe, B:32:0x009d), top: B:125:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131 A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:15:0x004c, B:119:0x023e, B:121:0x025d, B:22:0x006e, B:66:0x014e, B:68:0x0152, B:69:0x0173, B:71:0x0177, B:73:0x018b, B:76:0x0191, B:77:0x019e, B:79:0x01a4, B:82:0x01b3, B:92:0x01ca, B:85:0x01b8, B:90:0x01c3, B:94:0x01cf, B:95:0x01d7, B:98:0x01e8, B:101:0x01f0, B:105:0x01fc, B:110:0x0207, B:115:0x0218, B:25:0x0085, B:58:0x0129, B:60:0x0131, B:63:0x0139, B:28:0x0090, B:36:0x00b0, B:38:0x00bd, B:39:0x00ca, B:41:0x00d0, B:44:0x00da, B:47:0x00e1, B:51:0x00ee, B:54:0x00fe, B:32:0x009d), top: B:125:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0139 A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:15:0x004c, B:119:0x023e, B:121:0x025d, B:22:0x006e, B:66:0x014e, B:68:0x0152, B:69:0x0173, B:71:0x0177, B:73:0x018b, B:76:0x0191, B:77:0x019e, B:79:0x01a4, B:82:0x01b3, B:92:0x01ca, B:85:0x01b8, B:90:0x01c3, B:94:0x01cf, B:95:0x01d7, B:98:0x01e8, B:101:0x01f0, B:105:0x01fc, B:110:0x0207, B:115:0x0218, B:25:0x0085, B:58:0x0129, B:60:0x0131, B:63:0x0139, B:28:0x0090, B:36:0x00b0, B:38:0x00bd, B:39:0x00ca, B:41:0x00d0, B:44:0x00da, B:47:0x00e1, B:51:0x00ee, B:54:0x00fe, B:32:0x009d), top: B:125:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152 A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:15:0x004c, B:119:0x023e, B:121:0x025d, B:22:0x006e, B:66:0x014e, B:68:0x0152, B:69:0x0173, B:71:0x0177, B:73:0x018b, B:76:0x0191, B:77:0x019e, B:79:0x01a4, B:82:0x01b3, B:92:0x01ca, B:85:0x01b8, B:90:0x01c3, B:94:0x01cf, B:95:0x01d7, B:98:0x01e8, B:101:0x01f0, B:105:0x01fc, B:110:0x0207, B:115:0x0218, B:25:0x0085, B:58:0x0129, B:60:0x0131, B:63:0x0139, B:28:0x0090, B:36:0x00b0, B:38:0x00bd, B:39:0x00ca, B:41:0x00d0, B:44:0x00da, B:47:0x00e1, B:51:0x00ee, B:54:0x00fe, B:32:0x009d), top: B:125:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ca A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:15:0x004c, B:119:0x023e, B:121:0x025d, B:22:0x006e, B:66:0x014e, B:68:0x0152, B:69:0x0173, B:71:0x0177, B:73:0x018b, B:76:0x0191, B:77:0x019e, B:79:0x01a4, B:82:0x01b3, B:92:0x01ca, B:85:0x01b8, B:90:0x01c3, B:94:0x01cf, B:95:0x01d7, B:98:0x01e8, B:101:0x01f0, B:105:0x01fc, B:110:0x0207, B:115:0x0218, B:25:0x0085, B:58:0x0129, B:60:0x0131, B:63:0x0139, B:28:0x0090, B:36:0x00b0, B:38:0x00bd, B:39:0x00ca, B:41:0x00d0, B:44:0x00da, B:47:0x00e1, B:51:0x00ee, B:54:0x00fe, B:32:0x009d), top: B:125:0x002a }] */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, java.util.Map] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r24, @Y61.k kotlin.coroutines.Continuation<? super kotlin.Z<ru.cyberity.cbr.core.domain.c>> r25) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.domain.b.a(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

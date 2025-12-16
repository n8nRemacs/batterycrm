package ru.cyberity.cbr.presentation.screen.preview.photo.identity;

import Y41.p;
import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import androidx.compose.runtime.C22026a;
import androidx.media3.common.C23088b;
import androidx.view.C23060r0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import okhttp3.internal.ws.WebSocketProtocol;
import ru.cyberity.cbr.core.analytics.GlobalStatePayload;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.model.CBRDocumentDefinition;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.IdentitySide;
import ru.cyberity.cbr.core.data.model.o;
import ru.cyberity.cbr.core.data.model.p;
import ru.cyberity.cbr.core.data.model.r;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.domain.m;
import ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRPreviewIdentityDocumentViewModel.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001!B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001bH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ'\u0010!\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0094@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$J\u001b\u0010!\u001a\u00020\u00182\u0006\u0010&\u001a\u00020%H\u0094@ø\u0001\u0000¢\u0006\u0004\b!\u0010'J\u0017\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+J-\u0010!\u001a\u00020(2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0018\u00010,2\u0006\u0010.\u001a\u00020(H\u0014¢\u0006\u0004\b!\u0010/J\u001d\u0010!\u001a\u00020\u00182\u0006\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b!\u00101J\u0013\u00102\u001a\u00020\u0018H\u0094@ø\u0001\u0000¢\u0006\u0004\b2\u0010\u001aJ#\u0010!\u001a\u0002042\u0006\u00103\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001dH\u0094@ø\u0001\u0000¢\u0006\u0004\b!\u00105J\u0017\u00108\u001a\u00020\u00182\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0019\u0010!\u001a\u00020\u00182\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b!\u0010<J\r\u0010=\u001a\u00020\u0018¢\u0006\u0004\b=\u0010$J\r\u0010>\u001a\u00020%¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u0018¢\u0006\u0004\b@\u0010$J\r\u0010A\u001a\u00020\u0018¢\u0006\u0004\bA\u0010$J)\u0010!\u001a\u0004\u0018\u00010B2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020B0,H\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010DJ\u001b\u0010\u001c\u001a\u00020%2\u0006\u0010E\u001a\u00020%H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010'J\u0013\u0010F\u001a\u00020\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\bF\u0010\u001aJ\u0019\u0010H\u001a\u00020G2\b\b\u0002\u0010E\u001a\u00020%H\u0002¢\u0006\u0004\bH\u0010IJ'\u0010\u001c\u001a\u00020\u00182\u0006\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\b\u001c\u0010LJ\u000f\u0010M\u001a\u00020\u0018H\u0002¢\u0006\u0004\bM\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010NR+\u0010T\u001a\u00020%2\u0006\u0010O\u001a\u00020%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010?\"\u0004\b2\u0010SR\u0014\u0010V\u001a\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/identity/b;", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel;", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Landroidx/lifecycle/r0;", "savedStateHandle", "Lru/cyberity/cbr/domain/m;", "uploadDocumentImagesUseCase", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/cbr/core/data/source/extensions/a;", AttachMenuItem.File.EXTENSIONS, "Lru/cyberity/cbr/core/common/k;", "rotationDetector", "Lru/cyberity/ml/core/d;", "Landroid/graphics/Bitmap;", "Lru/cyberity/ml/badphotos/models/a;", "badPhotoDetector", "Lru/cyberity/cbr/core/domain/b;", "countriesUseCase", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;Landroidx/lifecycle/r0;Lru/cyberity/cbr/domain/m;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;Lru/cyberity/cbr/core/data/source/extensions/a;Lru/cyberity/cbr/core/common/k;Lru/cyberity/ml/core/d;Lru/cyberity/cbr/core/domain/b;)V", "Lkotlin/G0;", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "Lru/cyberity/cbr/core/data/model/e;", Navigation.CONFIG, "a", "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "()V", "", "isRetake", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "idDocType", "c", "(Ljava/lang/String;)V", "", "map", "sourceKey", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "countryKey", "(Ljava/lang/String;Ljava/lang/String;)V", "d", "retake", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$d;", "(ZLru/cyberity/cbr/core/data/model/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/p;", "error", "onHandleError", "(Lru/cyberity/cbr/core/data/model/p;)V", "Lru/cyberity/cbr/core/data/model/o;", "result", "(Lru/cyberity/cbr/core/data/model/o;)V", "F", "D", "()Z", "G", "E", "Lru/cyberity/cbr/core/data/model/CBRDocumentDefinition;", "definitions", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fromWarning", "f", "Lkotlinx/coroutines/N0;", "e", "(Z)Lkotlinx/coroutines/N0;", "Lru/cyberity/cbr/presentation/screen/preview/photo/identity/DocumentSideness;", "sideness", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/presentation/screen/preview/photo/identity/DocumentSideness;)V", "A", "Lru/cyberity/cbr/core/data/source/extensions/a;", "<set-?>", "H", "Lru/cyberity/cbr/core/presentation/screen/base/a;", "C", "(Z)V", "showSelectorOnStart", "B", "hasPreferredDefinitions", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends CBRPreviewPhotoDocumentViewModel {

    /* renamed from: I, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f435287I = {m0.f406844a.e(new Y(b.class, "showSelectorOnStart", "getShowSelectorOnStart()Z", 0))};

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.extensions.a extensions;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.presentation.screen.base.a showSelectorOnStart;

    /* compiled from: CBRPreviewIdentityDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/identity/b$a;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", "documentType", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class a implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final String documentType;

        public a(@k String str) {
            this.documentType = str;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getDocumentType() {
            return this.documentType;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && L.f(this.documentType, ((a) other).documentType);
        }

        public int hashCode() {
            return this.documentType.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("SelectorRequest(documentType="), this.documentType, ')');
        }
    }

    /* compiled from: CBRPreviewIdentityDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.identity.CBRPreviewIdentityDocumentViewModel", f = "CBRPreviewIdentityDocumentViewModel.kt", i = {0, 0}, l = {94}, m = "findPreferredDocumentInSelector", n = {"definition", "docType"}, s = {"L$0", "L$1"})
    /* renamed from: ru.cyberity.cbr.presentation.screen.preview.photo.identity.b$b, reason: collision with other inner class name */
    public static final class C12533b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435291a;

        /* renamed from: b, reason: collision with root package name */
        Object f435292b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f435293c;

        /* renamed from: e, reason: collision with root package name */
        int f435295e;

        public C12533b(Continuation<? super C12533b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f435293c = obj;
            this.f435295e |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.a((Map<String, CBRDocumentDefinition>) null, this);
        }
    }

    /* compiled from: CBRPreviewIdentityDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.identity.CBRPreviewIdentityDocumentViewModel$onDocumentAndCountrySelected$1", f = "CBRPreviewIdentityDocumentViewModel.kt", i = {}, l = {260, 261}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435296a;

        /* renamed from: b, reason: collision with root package name */
        Object f435297b;

        /* renamed from: c, reason: collision with root package name */
        Object f435298c;

        /* renamed from: d, reason: collision with root package name */
        int f435299d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f435301f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f435302g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f435301f = str;
            this.f435302g = str2;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new c(this.f435301f, this.f435302g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            b bVar;
            String str;
            String str2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f435299d;
            if (i12 == 0) {
                C42729a0.b(obj);
                bVar = b.this;
                String str3 = this.f435301f;
                str = this.f435302g;
                this.f435296a = bVar;
                this.f435297b = str3;
                this.f435298c = str;
                this.f435299d = 1;
                Object objA = bVar.a(str3, str, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str3;
                obj = objA;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                str = (String) this.f435298c;
                str2 = (String) this.f435297b;
                bVar = (b) this.f435296a;
                C42729a0.b(obj);
            }
            bVar.b(str2, str, (DocumentSideness) obj);
            b bVar2 = b.this;
            this.f435296a = null;
            this.f435297b = null;
            this.f435298c = null;
            this.f435299d = 2;
            if (bVar2.a(false, (Continuation<? super G0>) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPreviewIdentityDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.identity.CBRPreviewIdentityDocumentViewModel", f = "CBRPreviewIdentityDocumentViewModel.kt", i = {0}, l = {72}, m = "onPrepare", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435303a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435304b;

        /* renamed from: d, reason: collision with root package name */
        int f435306d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f435304b = obj;
            this.f435306d |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.onPrepare(this);
        }
    }

    /* compiled from: CBRPreviewIdentityDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.identity.CBRPreviewIdentityDocumentViewModel", f = "CBRPreviewIdentityDocumentViewModel.kt", i = {0, 0}, l = {223, 227}, m = "showCamera", n = {"this", "isRetake"}, s = {"L$0", "Z$0"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435307a;

        /* renamed from: b, reason: collision with root package name */
        boolean f435308b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f435309c;

        /* renamed from: e, reason: collision with root package name */
        int f435311e;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f435309c = obj;
            this.f435311e |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.a(false, (Continuation<? super G0>) this);
        }
    }

    /* compiled from: CBRPreviewIdentityDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.identity.CBRPreviewIdentityDocumentViewModel$showDocumentTypeSelector$1", f = "CBRPreviewIdentityDocumentViewModel.kt", i = {}, l = {203, 204, 207}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435312a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f435313b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f435314c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z12, b bVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f435313b = z12;
            this.f435314c = bVar;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new f(this.f435313b, this.f435314c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f435312a;
            if (i12 == 0) {
                C42729a0.b(obj);
                Logger.d$default(ru.cyberity.log.a.f436064a, "DocCapture", "showDocumentTypeSelector, fromWarning=" + this.f435313b, null, 4, null);
                ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "showDocumentTypeSelector, skipSelector=" + this.f435314c.p() + ", fromWarning=" + this.f435313b + ", documentIsSubmitted=" + this.f435314c.getDocument().isSubmitted(), null, 4, null);
                b bVar = this.f435314c;
                boolean z12 = this.f435313b;
                this.f435312a = 1;
                objB = bVar.b(z12, this);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                C42729a0.b(obj);
                objB = obj;
            }
            if (((Boolean) objB).booleanValue()) {
                b bVar2 = this.f435314c;
                this.f435312a = 2;
                if (bVar2.a(false, (Continuation<? super G0>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (this.f435314c.p()) {
                b bVar3 = this.f435314c;
                this.f435312a = 3;
                if (bVar3.a(false, (Continuation<? super G0>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "showDocumentTypeSelector, request selector", null, 4, null);
                b bVar4 = this.f435314c;
                bVar4.fireEvent(new a(bVar4.getDocument().getType().getValue()));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPreviewIdentityDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.identity.CBRPreviewIdentityDocumentViewModel", f = "CBRPreviewIdentityDocumentViewModel.kt", i = {0, 0, 0}, l = {123, WebSocketProtocol.PAYLOAD_SHORT}, m = "tryApplyPreferredDefinitions", n = {"this", "definition", "country"}, s = {"L$0", "L$1", "L$2"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435315a;

        /* renamed from: b, reason: collision with root package name */
        Object f435316b;

        /* renamed from: c, reason: collision with root package name */
        Object f435317c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f435318d;

        /* renamed from: f, reason: collision with root package name */
        int f435320f;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f435318d = obj;
            this.f435320f |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.b(false, (Continuation<? super Boolean>) this);
        }
    }

    /* compiled from: CBRPreviewIdentityDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.identity.CBRPreviewIdentityDocumentViewModel", f = "CBRPreviewIdentityDocumentViewModel.kt", i = {0, 0, 0, 0, 2, 2, 2, 3, 3, 3}, l = {156, 161, 167, 180}, m = "tryGuessCountryAndDocType", n = {"this", "sideness", "defaultCountry", "country", "this", "sideness", "defaultCountry", "this", "sideness", "country"}, s = {"L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435321a;

        /* renamed from: b, reason: collision with root package name */
        Object f435322b;

        /* renamed from: c, reason: collision with root package name */
        Object f435323c;

        /* renamed from: d, reason: collision with root package name */
        Object f435324d;

        /* renamed from: e, reason: collision with root package name */
        Object f435325e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f435326f;

        /* renamed from: h, reason: collision with root package name */
        int f435328h;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f435326f = obj;
            this.f435328h |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.f(this);
        }
    }

    public b(@k Document document, @k C23060r0 c23060r0, @k m mVar, @k ru.cyberity.cbr.core.data.source.common.a aVar, @k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @k ru.cyberity.cbr.core.data.source.extensions.a aVar2, @k ru.cyberity.cbr.core.common.k kVar, @k ru.cyberity.ml.core.d<Bitmap, ru.cyberity.ml.badphotos.models.a> dVar, @k ru.cyberity.cbr.core.domain.b bVar) {
        super(document, c23060r0, aVar, cVar, aVar2, mVar, kVar, dVar, bVar);
        this.extensions = aVar2;
        this.showSelectorOnStart = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "showSelectorOnStart", Boolean.TRUE);
    }

    private final void A() {
        ru.cyberity.cbr.core.analytics.b.f432519a.a(GlobalStatePayload.IdDocSubType, r().getValue());
    }

    private final boolean C() {
        return ((Boolean) this.showSelectorOnStart.a(this, f435287I[0])).booleanValue();
    }

    private final void d(boolean z12) {
        this.showSelectorOnStart.a(this, f435287I[0], Boolean.valueOf(z12));
    }

    private final N0 e(boolean fromWarning) {
        return C43259k.d(androidx.view.N0.a(this), null, null, new f(fromWarning, this, null), 3);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object f(kotlin.coroutines.Continuation<? super kotlin.G0> r22) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.identity.b.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean B() {
        return n0.f432787a.getPreferredDocumentsDefinitions() != null;
    }

    public final boolean D() {
        if (r() == IdentitySide.Front) {
            if (!o().isEmpty()) {
                return true;
            }
        } else if (o().size() > 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        if (D() || p() || B()) {
            CBRViewModel.finish$default(this, null, null, null, 7, null);
        } else {
            F();
        }
    }

    public final void F() {
        y();
        a((o) null);
    }

    public final void G() {
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "restartStep()", null, 4, null);
        if (r() == IdentitySide.Front) {
            a(this, false, 1, (Object) null);
        } else {
            a((List<o>) null);
        }
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel
    @l
    public Object b(@k Continuation<? super CharSequence> continuation) {
        return this.extensions.a(r.a(r.INSTANCE.a(g()), getStrings(), null, 2, null));
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel, ru.cyberity.cbr.core.presentation.base.CBRViewModel
    public void onHandleError(@k ru.cyberity.cbr.core.data.model.p error) {
        Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Preview photo error handling... " + error, null, 4, null);
        if (error instanceof p.b) {
            a(0);
        } else {
            super.onHandleError(error);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel, ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onPrepare(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ru.cyberity.cbr.presentation.screen.preview.photo.identity.b.d
            if (r0 == 0) goto L13
            r0 = r5
            ru.cyberity.cbr.presentation.screen.preview.photo.identity.b$d r0 = (ru.cyberity.cbr.presentation.screen.preview.photo.identity.b.d) r0
            int r1 = r0.f435306d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f435306d = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.preview.photo.identity.b$d r0 = new ru.cyberity.cbr.presentation.screen.preview.photo.identity.b$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f435304b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f435306d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f435303a
            ru.cyberity.cbr.presentation.screen.preview.photo.identity.b r0 = (ru.cyberity.cbr.presentation.screen.preview.photo.identity.b) r0
            kotlin.C42729a0.b(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C42729a0.b(r5)
            r0.f435303a = r4
            r0.f435306d = r3
            java.lang.Object r5 = super.onPrepare(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            r0.onLoad()
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.identity.b.onPrepare(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel
    public void u() {
        y();
        e(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r13, kotlin.coroutines.Continuation<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.identity.b.b(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel
    @l
    public Object d(@k Continuation<? super G0> continuation) {
        if (m() == DocumentSideness.UNKNOWN) {
            Object objE = e(continuation);
            return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : G0.f406611a;
        }
        b(m() == DocumentSideness.DOUBLE);
        return G0.f406611a;
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel, ru.cyberity.cbr.presentation.screen.preview.b
    @l
    public Object a(@l ru.cyberity.cbr.core.data.model.g gVar, @l ru.cyberity.cbr.core.data.model.e eVar, @k Continuation<? super G0> continuation) {
        if (C()) {
            d(false);
            a(this, false, 1, (Object) null);
        }
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map<java.lang.String, ru.cyberity.cbr.core.data.model.CBRDocumentDefinition> r6, kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.model.CBRDocumentDefinition> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ru.cyberity.cbr.presentation.screen.preview.photo.identity.b.C12533b
            if (r0 == 0) goto L13
            r0 = r7
            ru.cyberity.cbr.presentation.screen.preview.photo.identity.b$b r0 = (ru.cyberity.cbr.presentation.screen.preview.photo.identity.b.C12533b) r0
            int r1 = r0.f435295e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f435295e = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.preview.photo.identity.b$b r0 = new ru.cyberity.cbr.presentation.screen.preview.photo.identity.b$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f435293c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f435295e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f435292b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.f435291a
            ru.cyberity.cbr.core.data.model.CBRDocumentDefinition r0 = (ru.cyberity.cbr.core.data.model.CBRDocumentDefinition) r0
            kotlin.C42729a0.b(r7)
            goto L6f
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.C42729a0.b(r7)
            ru.cyberity.cbr.core.data.model.Document r7 = r5.getDocument()
            ru.cyberity.cbr.core.data.model.DocumentType r7 = r7.getType()
            java.lang.String r7 = r7.getValue()
            java.lang.Object r6 = r6.get(r7)
            ru.cyberity.cbr.core.data.model.CBRDocumentDefinition r6 = (ru.cyberity.cbr.core.data.model.CBRDocumentDefinition) r6
            if (r6 != 0) goto L52
            return r4
        L52:
            java.lang.String r7 = r6.getCountry()
            if (r7 != 0) goto L59
            return r4
        L59:
            java.lang.String r2 = r6.getIdDocType()
            if (r2 != 0) goto L60
            return r4
        L60:
            r0.f435291a = r6
            r0.f435292b = r2
            r0.f435295e = r3
            java.lang.Object r7 = r5.b(r7, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            r0 = r6
            r6 = r2
        L6f:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L75:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L89
            java.lang.Object r1 = r7.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = kotlin.jvm.internal.L.f(r2, r6)
            if (r2 == 0) goto L75
            goto L8a
        L89:
            r1 = r4
        L8a:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L8f
            r4 = r0
        L8f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.identity.b.a(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String countryKey, String idDocType, DocumentSideness sideness) {
        ru.cyberity.cbr.camera.photo.presentation.document.e eVar = ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a;
        StringBuilder sbB = C23088b.b("applyDocumentInfo: country=", countryKey, ", idDocType=", idDocType, ", sideness=");
        sbB.append(sideness);
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(eVar, "DocCapture", sbB.toString(), null, 4, null);
        a(countryKey);
        b(idDocType);
        a(sideness);
    }

    public static /* synthetic */ N0 a(b bVar, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = false;
        }
        return bVar.e(z12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(boolean r11, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ru.cyberity.cbr.presentation.screen.preview.photo.identity.b.e
            if (r0 == 0) goto L13
            r0 = r12
            ru.cyberity.cbr.presentation.screen.preview.photo.identity.b$e r0 = (ru.cyberity.cbr.presentation.screen.preview.photo.identity.b.e) r0
            int r1 = r0.f435311e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f435311e = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.preview.photo.identity.b$e r0 = new ru.cyberity.cbr.presentation.screen.preview.photo.identity.b$e
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f435309c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f435311e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.C42729a0.b(r12)
            goto La7
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            boolean r11 = r0.f435308b
            java.lang.Object r2 = r0.f435307a
            ru.cyberity.cbr.presentation.screen.preview.photo.identity.b r2 = (ru.cyberity.cbr.presentation.screen.preview.photo.identity.b) r2
            kotlin.C42729a0.b(r12)
            goto L73
        L3f:
            kotlin.C42729a0.b(r12)
            java.lang.String r12 = r10.d()
            if (r12 == 0) goto L65
            boolean r12 = kotlin.text.C43066x.K(r12)
            if (r12 == 0) goto L4f
            goto L65
        L4f:
            java.lang.String r12 = r10.g()
            boolean r12 = kotlin.text.C43066x.K(r12)
            if (r12 != 0) goto L65
            java.lang.String r12 = r10.g()
            java.lang.String r2 = "OTHER"
            boolean r12 = kotlin.jvm.internal.L.f(r12, r2)
            if (r12 == 0) goto L72
        L65:
            r0.f435307a = r10
            r0.f435308b = r11
            r0.f435311e = r4
            java.lang.Object r12 = r10.f(r0)
            if (r12 != r1) goto L72
            return r1
        L72:
            r2 = r10
        L73:
            ru.cyberity.cbr.camera.photo.presentation.document.e r4 = ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r5 = "showCamera, country="
            r12.<init>(r5)
            java.lang.String r5 = r2.d()
            r12.append(r5)
            java.lang.String r5 = ", idDocType="
            r12.append(r5)
            java.lang.String r5 = r2.g()
            r12.append(r5)
            java.lang.String r6 = r12.toString()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "DocCapture"
            r7 = 0
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(r4, r5, r6, r7, r8, r9)
            r12 = 0
            r0.f435307a = r12
            r0.f435311e = r3
            java.lang.Object r11 = super.a(r11, r0)
            if (r11 != r1) goto La7
            return r1
        La7:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.identity.b.a(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel
    @k
    public String a(@l Map<String, String> map, @k String sourceKey) {
        if (p()) {
            String strConcat = sourceKey.concat("_noSelector");
            if ((map != null ? map.get(strConcat) : null) != null) {
                return strConcat;
            }
            if ((map != null ? map.get(sourceKey) : null) != null) {
                return sourceKey;
            }
            return (map != null ? map.get("default_noSelector") : null) != null ? "default_noSelector" : "default";
        }
        return super.a(map, sourceKey);
    }

    public final void a(@k String countryKey, @k String idDocType) {
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), androidx.compose.ui.graphics.colorspace.e.n("onDocumentAndCountrySelected: c=", countryKey, ", t=", idDocType), null, 4, null);
        C43259k.d(androidx.view.N0.a(this), null, null, new c(countryKey, idDocType, null), 3);
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.b
    public void c(@k String idDocType) {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(boolean r10, @Y61.k ru.cyberity.cbr.core.data.model.g r11, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.d> r12) {
        /*
            r9 = this;
            ru.cyberity.cbr.core.data.model.Document r1 = r9.getDocument()
            java.util.List r2 = r9.w()
            ru.cyberity.cbr.core.data.model.e r11 = r9.getConfig()
            r12 = 0
            r0 = 1
            if (r11 == 0) goto L23
            ru.cyberity.cbr.core.data.model.Document r3 = r9.getDocument()
            ru.cyberity.cbr.core.data.model.DocumentType r3 = r3.getType()
            java.lang.String r3 = r3.getValue()
            boolean r11 = ru.cyberity.cbr.core.data.model.f.a(r11, r3)
            if (r11 != r0) goto L23
            goto L31
        L23:
            ru.cyberity.cbr.core.data.model.Document r11 = r9.getDocument()
            ru.cyberity.cbr.core.data.model.DocumentType r11 = r11.getType()
            boolean r11 = r11.h()
            if (r11 == 0) goto L33
        L31:
            r3 = r0
            goto L34
        L33:
            r3 = r12
        L34:
            boolean r11 = r9.p()
            r4 = 0
            if (r11 != 0) goto L40
            java.lang.String r11 = r9.g()
            goto L41
        L40:
            r11 = r4
        L41:
            ru.cyberity.cbr.camera.photo.presentation.document.DocCapture$PreferredMode r5 = ru.cyberity.cbr.camera.photo.presentation.document.DocCapture.PreferredMode.MANUAL
            ru.cyberity.cbr.core.data.model.IdentitySide r6 = r9.r()
            ru.cyberity.cbr.core.data.model.IdentitySide r7 = ru.cyberity.cbr.core.data.model.IdentitySide.Back
            if (r6 != r7) goto L7a
            java.util.List r6 = r9.o()
            java.lang.Object r6 = kotlin.collections.C42745f0.S(r6)
            ru.cyberity.cbr.core.data.model.o r6 = (ru.cyberity.cbr.core.data.model.o) r6
            if (r6 == 0) goto L76
            ru.cyberity.cbr.core.data.model.IdentitySide r7 = r6.getSide()
            ru.cyberity.cbr.core.data.model.IdentitySide r8 = ru.cyberity.cbr.core.data.model.IdentitySide.Front
            if (r7 != r8) goto L60
            goto L61
        L60:
            r6 = r4
        L61:
            if (r6 == 0) goto L76
            ru.cyberity.ml.badphotos.models.b r6 = r6.getPhotoQualityResult()
            if (r6 == 0) goto L76
            java.lang.Boolean r6 = r6.getIsAutocaptured()
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            boolean r6 = kotlin.jvm.internal.L.f(r6, r7)
            goto L77
        L76:
            r6 = r12
        L77:
            if (r6 != 0) goto L7a
            r12 = r0
        L7a:
            if (r12 == 0) goto L7e
            r6 = r5
            goto L7f
        L7e:
            r6 = r4
        L7f:
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$d r12 = new ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$d
            r0 = r12
            r4 = r11
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.identity.b.a(boolean, ru.cyberity.cbr.core.data.model.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel
    public void a(@l o result) {
        if (result == null && !p()) {
            ArrayList arrayList = new ArrayList(o());
            arrayList.clear();
            b(arrayList);
            a(IdentitySide.Front);
            A();
            if (!B()) {
                a(this, false, 1, (Object) null);
                return;
            } else {
                CBRViewModel.finish$default(this, null, null, null, 7, null);
                return;
            }
        }
        super.a(result);
    }
}

package ru.cyberity.cbr.camera;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.Uri;
import androidx.appcompat.app.r;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.io.File;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43135f1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import ru.cyberity.cbr.camera.d;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.o;
import ru.cyberity.cbr.core.data.model.p;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.log.LoggerType;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRCameraPhotoViewModel.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001\u0011B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00042\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010\u0011\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0011\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020!0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lru/cyberity/cbr/camera/c;", "Lru/cyberity/cbr/camera/d;", "Lru/cyberity/cbr/core/data/model/DocumentType;", "type", "", "identityType", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Lru/cyberity/cbr/core/data/model/DocumentType;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Lkotlin/G0;", "a", "(Ljava/lang/String;Ljava/lang/Exception;)V", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "file", "(Ljava/io/File;)V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlinx/coroutines/N0;", "(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)Lkotlinx/coroutines/N0;", "k", "()V", "Lkotlinx/coroutines/flow/Z1;", "Lru/cyberity/cbr/camera/c$a;", "g", "Lkotlinx/coroutines/flow/Z1;", "_state", "Lkotlinx/coroutines/flow/n2;", "h", "Lkotlinx/coroutines/flow/n2;", "j", "()Lkotlinx/coroutines/flow/n2;", VoiceInfo.STATE, "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class c extends ru.cyberity.cbr.camera.d {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final Z1<a> _state;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    private final n2<a> state;

    /* compiled from: CBRCameraPhotoViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/camera/c$a;", "", "", "permissionsTitle", "permissionsPositive", "permissionNegative", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "a", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lru/cyberity/cbr/camera/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "f", "()Ljava/lang/CharSequence;", "b", "e", "c", "d", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final CharSequence permissionsTitle;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final CharSequence permissionsPositive;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final CharSequence permissionNegative;

        public a() {
            this(null, null, null, 7, null);
        }

        @k
        public final a a(@l CharSequence permissionsTitle, @l CharSequence permissionsPositive, @l CharSequence permissionNegative) {
            return new a(permissionsTitle, permissionsPositive, permissionNegative);
        }

        @l
        /* renamed from: d, reason: from getter */
        public final CharSequence getPermissionNegative() {
            return this.permissionNegative;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final CharSequence getPermissionsPositive() {
            return this.permissionsPositive;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return L.f(this.permissionsTitle, aVar.permissionsTitle) && L.f(this.permissionsPositive, aVar.permissionsPositive) && L.f(this.permissionNegative, aVar.permissionNegative);
        }

        @l
        /* renamed from: f, reason: from getter */
        public final CharSequence getPermissionsTitle() {
            return this.permissionsTitle;
        }

        public int hashCode() {
            CharSequence charSequence = this.permissionsTitle;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.permissionsPositive;
            int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.permissionNegative;
            return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(permissionsTitle=");
            sb2.append((Object) this.permissionsTitle);
            sb2.append(", permissionsPositive=");
            sb2.append((Object) this.permissionsPositive);
            sb2.append(", permissionNegative=");
            return AK.c.r(sb2, this.permissionNegative, ')');
        }

        public a(@l CharSequence charSequence, @l CharSequence charSequence2, @l CharSequence charSequence3) {
            this.permissionsTitle = charSequence;
            this.permissionsPositive = charSequence2;
            this.permissionNegative = charSequence3;
        }

        public /* synthetic */ a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : charSequence, (i12 & 2) != 0 ? null : charSequence2, (i12 & 4) != 0 ? null : charSequence3);
        }
    }

    /* compiled from: CBRCameraPhotoViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraPhotoViewModel$onGalleryImagePicked$1", f = "CBRCameraPhotoViewModel.kt", i = {0}, l = {62}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432007a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f432008b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f432009c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f432010d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Uri f432011e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f432012f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, Uri uri, c cVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f432009c = context;
            this.f432010d = str;
            this.f432011e = uri;
            this.f432012f = cVar;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(this.f432009c, this.f432010d, this.f432011e, this.f432012f, continuation);
            bVar.f432008b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            T t12;
            Object objA;
            String scheme;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432007a;
            if (i12 == 0) {
                C42729a0.b(obj);
                t12 = (T) this.f432008b;
                Context context = this.f432009c;
                String str = this.f432010d;
                Uri uri = this.f432011e;
                this.f432008b = t12;
                this.f432007a = 1;
                objA = s.a(context, str, uri, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                T t13 = (T) this.f432008b;
                C42729a0.b(obj);
                objA = obj;
                t12 = t13;
            }
            Uri uri2 = (Uri) objA;
            Logger.e$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(t12), r.n(uri2, "onGalleryImagePicked: temp file uri - "), null, 4, null);
            if (uri2 == null) {
                return G0.f406611a;
            }
            String path = uri2.getPath();
            if (path == null || path.length() == 0 || (scheme = uri2.getScheme()) == null || !C43066x.h0(scheme, "file", false)) {
                return G0.f406611a;
            }
            try {
                File file = new File(C43066x.a0(uri2.toString(), "file://", "", false));
                CBRViewModel.finish$default(this.f432012f, null, new o(file, file, null, null, this.f432012f.getCurrentSide(), false, null, 44, null), null, 5, null);
            } catch (Exception e12) {
                ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
                String strA = ru.cyberity.log.c.a(t12);
                String message = e12.getMessage();
                aVar.e(strA, message != null ? message : "", e12);
                this.f432012f.a("Can't copy gallery file", e12);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRCameraPhotoViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/d$b;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraPhotoViewModel$onPictureTaken$1", f = "CBRCameraPhotoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.camera.c$c, reason: collision with other inner class name */
    public static final class C12416c extends SuspendLambda implements p<d.b, Continuation<? super d.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432013a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432014b;

        public C12416c(Continuation<? super C12416c> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k d.b bVar, @l Continuation<? super d.b> continuation) {
            return ((C12416c) create(bVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C12416c c12416c = new C12416c(continuation);
            c12416c.f432014b = obj;
            return c12416c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432013a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return d.b.a((d.b) this.f432014b, false, false, false, false, null, 29, null);
        }
    }

    /* compiled from: CBRCameraPhotoViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraPhotoViewModel", f = "CBRCameraPhotoViewModel.kt", i = {0}, l = {39}, m = "onPrepare$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432015a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432016b;

        /* renamed from: d, reason: collision with root package name */
        int f432018d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f432016b = obj;
            this.f432018d |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.a(c.this, (Continuation) this);
        }
    }

    /* compiled from: CBRCameraPhotoViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/c$a;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraPhotoViewModel$onPrepare$2", f = "CBRCameraPhotoViewModel.kt", i = {}, l = {42, 43, 44}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<a, Continuation<? super a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f432019a;

        /* renamed from: b, reason: collision with root package name */
        Object f432020b;

        /* renamed from: c, reason: collision with root package name */
        int f432021c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f432022d;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k a aVar, @l Continuation<? super a> continuation) {
            return ((e) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            e eVar = c.this.new e(continuation);
            eVar.f432022d = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f432021c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3d
                if (r1 == r4) goto L35
                if (r1 == r3) goto L29
                if (r1 != r2) goto L21
                java.lang.Object r0 = r6.f432020b
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.Object r1 = r6.f432019a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r2 = r6.f432022d
                ru.cyberity.cbr.camera.c$a r2 = (ru.cyberity.cbr.camera.c.a) r2
                kotlin.C42729a0.b(r7)
                goto L83
            L21:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L29:
                java.lang.Object r1 = r6.f432019a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r3 = r6.f432022d
                ru.cyberity.cbr.camera.c$a r3 = (ru.cyberity.cbr.camera.c.a) r3
                kotlin.C42729a0.b(r7)
                goto L6b
            L35:
                java.lang.Object r1 = r6.f432022d
                ru.cyberity.cbr.camera.c$a r1 = (ru.cyberity.cbr.camera.c.a) r1
                kotlin.C42729a0.b(r7)
                goto L54
            L3d:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f432022d
                r1 = r7
                ru.cyberity.cbr.camera.c$a r1 = (ru.cyberity.cbr.camera.c.a) r1
                ru.cyberity.cbr.camera.c r7 = ru.cyberity.cbr.camera.c.this
                r6.f432022d = r1
                r6.f432021c = r4
                java.lang.String r4 = "sns_alert_lackOfPhotoLibraryPermissions"
                java.lang.Object r7 = ru.cyberity.cbr.camera.c.a(r7, r4, r6)
                if (r7 != r0) goto L54
                return r0
            L54:
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                ru.cyberity.cbr.camera.c r4 = ru.cyberity.cbr.camera.c.this
                r6.f432022d = r1
                r6.f432019a = r7
                r6.f432021c = r3
                java.lang.String r3 = "sns_alert_action_ok"
                java.lang.Object r3 = ru.cyberity.cbr.camera.c.a(r4, r3, r6)
                if (r3 != r0) goto L67
                return r0
            L67:
                r5 = r1
                r1 = r7
                r7 = r3
                r3 = r5
            L6b:
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                ru.cyberity.cbr.camera.c r4 = ru.cyberity.cbr.camera.c.this
                r6.f432022d = r3
                r6.f432019a = r1
                r6.f432020b = r7
                r6.f432021c = r2
                java.lang.String r2 = "sns_alert_action_settings"
                java.lang.Object r2 = ru.cyberity.cbr.camera.c.a(r4, r2, r6)
                if (r2 != r0) goto L80
                return r0
            L80:
                r0 = r7
                r7 = r2
                r2 = r3
            L83:
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                ru.cyberity.cbr.camera.c$a r7 = r2.a(r1, r0, r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRCameraPhotoViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraPhotoViewModel$sendLog$1", f = "CBRCameraPhotoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432024a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f432025b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f432026c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Exception f432027d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Exception exc, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f432026c = str;
            this.f432027d = exc;
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
            f fVar = new f(this.f432026c, this.f432027d, continuation);
            fVar.f432025b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432024a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            ru.cyberity.log.a.f436064a.a(LoggerType.KIBANA).e(ru.cyberity.log.c.a((T) this.f432025b), this.f432026c, this.f432027d);
            return G0.f406611a;
        }
    }

    public /* synthetic */ c(DocumentType documentType, String str, ru.cyberity.cbr.core.data.source.common.a aVar, ru.cyberity.cbr.core.data.source.dynamic.c cVar, int i12, C42822w c42822w) {
        this(documentType, (i12 & 2) != 0 ? null : str, aVar, cVar);
    }

    @k
    public final n2<a> j() {
        return this.state;
    }

    public final void k() {
        if (n0.f432787a.isDebug()) {
            throwError(new p.a(new Exception("Picker NOT found!!!"), null, 2, null), getDocumentType());
        }
    }

    @Override // ru.cyberity.cbr.camera.d, ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @l
    public Object onPrepare(@k Continuation<? super G0> continuation) {
        return a(this, (Continuation) continuation);
    }

    public c(@k DocumentType documentType, @l String str, @k ru.cyberity.cbr.core.data.source.common.a aVar, @k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(documentType, str, aVar, cVar);
        Z1<a> z1A = p2.a(new a(null, null, null, 7, null));
        this._state = z1A;
        this.state = C43175k.b(z1A);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(ru.cyberity.cbr.camera.c r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof ru.cyberity.cbr.camera.c.d
            if (r0 == 0) goto L13
            r0 = r5
            ru.cyberity.cbr.camera.c$d r0 = (ru.cyberity.cbr.camera.c.d) r0
            int r1 = r0.f432018d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432018d = r1
            goto L18
        L13:
            ru.cyberity.cbr.camera.c$d r0 = new ru.cyberity.cbr.camera.c$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f432016b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f432018d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f432015a
            ru.cyberity.cbr.camera.c r4 = (ru.cyberity.cbr.camera.c) r4
            kotlin.C42729a0.b(r5)
            goto L43
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r5)
            r0.f432015a = r4
            r0.f432018d = r3
            java.lang.Object r5 = super.onPrepare(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlinx.coroutines.flow.Z1<ru.cyberity.cbr.camera.c$a> r5 = r4._state
            A1.a r0 = androidx.view.N0.a(r4)
            ru.cyberity.cbr.camera.c$e r1 = new ru.cyberity.cbr.camera.c$e
            r2 = 0
            r1.<init>(r2)
            ru.cyberity.cbr.core.common.j0.a(r5, r0, r1)
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.c.a(ru.cyberity.cbr.camera.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.camera.d
    public void a(@l File file) {
        Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Picture is taken", null, 4, null);
        showProgress(true);
        CBRViewModel.updateState$default(this, false, new C12416c(null), 1, null);
        CBRViewModel.finish$default(this, null, new o(file, file, null, null, getCurrentSide(), false, null, 44, null), null, 5, null);
    }

    @k
    public final N0 a(@k Context context, @l String type, @k Uri uri) {
        return C43259k.d(androidx.view.N0.a(this), null, null, new b(context, type, uri, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String message, Exception e12) {
        C43259k.d(androidx.view.N0.a(this), C43135f1.f411090b, null, new f(message, e12, null), 2);
    }
}

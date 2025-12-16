package com.avito.android.travel_file_download_deeplink.mvi;

import android.net.Uri;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.travel_file_download_deeplink.FileDownloadOpenParams;
import com.avito.android.travel_file_download_deeplink.mvi.entity.FileDownloadInternalAction;
import com.facebook.imageutils.JfifUtil;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FileDownloadBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements com.avito.android.arch.mvi.b<FileDownloadInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FileDownloadOpenParams f301776a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f301777b;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<FileDownloadInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f301778b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.travel_file_download_deeplink.mvi.e$a$a, reason: collision with other inner class name */
        public static final class C9241a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f301779b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.travel_file_download_deeplink.mvi.FileDownloadBootstrap$produce$$inlined$mapNotNull$1$2", f = "FileDownloadBootstrap.kt", i = {}, l = {JfifUtil.MARKER_APP1}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.travel_file_download_deeplink.mvi.e$a$a$a, reason: collision with other inner class name */
            public static final class C9242a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f301780q;

                /* renamed from: r, reason: collision with root package name */
                public int f301781r;

                public C9242a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f301780q = obj;
                    this.f301781r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9241a.this.emit(null, this);
                }
            }

            public C9241a(InterfaceC43172j interfaceC43172j) {
                this.f301779b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.avito.android.travel_file_download_deeplink.mvi.e.a.C9241a.C9242a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.avito.android.travel_file_download_deeplink.mvi.e$a$a$a r0 = (com.avito.android.travel_file_download_deeplink.mvi.e.a.C9241a.C9242a) r0
                    int r1 = r0.f301781r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f301781r = r1
                    goto L18
                L13:
                    com.avito.android.travel_file_download_deeplink.mvi.e$a$a$a r0 = new com.avito.android.travel_file_download_deeplink.mvi.e$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f301780q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f301781r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r8)
                    goto L6b
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    kotlin.C42729a0.b(r8)
                    com.avito.android.travel_file_download_deeplink.a r7 = (com.avito.android.travel_file_download_deeplink.a) r7
                    boolean r8 = r7 instanceof com.avito.android.travel_file_download_deeplink.a.C9230a
                    if (r8 == 0) goto L44
                    com.avito.android.travel_file_download_deeplink.mvi.entity.FileDownloadInternalAction$LoadingStarted r8 = new com.avito.android.travel_file_download_deeplink.mvi.entity.FileDownloadInternalAction$LoadingStarted
                    com.avito.android.travel_file_download_deeplink.a$a r7 = (com.avito.android.travel_file_download_deeplink.a.C9230a) r7
                    long r4 = r7.f301684a
                    r8.<init>(r4)
                    goto L5e
                L44:
                    boolean r8 = r7 instanceof com.avito.android.travel_file_download_deeplink.a.b
                    if (r8 == 0) goto L4b
                    com.avito.android.travel_file_download_deeplink.mvi.entity.FileDownloadInternalAction$LoadingFailed r8 = com.avito.android.travel_file_download_deeplink.mvi.entity.FileDownloadInternalAction.LoadingFailed.f301784b
                    goto L5e
                L4b:
                    boolean r8 = r7 instanceof com.avito.android.travel_file_download_deeplink.a.d
                    if (r8 == 0) goto L59
                    com.avito.android.travel_file_download_deeplink.mvi.entity.FileDownloadInternalAction$LoadingSuccess r8 = new com.avito.android.travel_file_download_deeplink.mvi.entity.FileDownloadInternalAction$LoadingSuccess
                    com.avito.android.travel_file_download_deeplink.a$d r7 = (com.avito.android.travel_file_download_deeplink.a.d) r7
                    android.net.Uri r7 = r7.f301687a
                    r8.<init>(r7)
                    goto L5e
                L59:
                    boolean r7 = r7 instanceof com.avito.android.travel_file_download_deeplink.a.c
                    if (r7 == 0) goto L6e
                    r8 = 0
                L5e:
                    if (r8 == 0) goto L6b
                    r0.f301781r = r3
                    kotlinx.coroutines.flow.j r7 = r6.f301779b
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L6b
                    return r1
                L6b:
                    kotlin.G0 r7 = kotlin.G0.f406611a
                    return r7
                L6e:
                    kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                    r7.<init>()
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_file_download_deeplink.mvi.e.a.C9241a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f301778b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super FileDownloadInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f301778b.collect(new C9241a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public e(@Y61.k FileDownloadOpenParams fileDownloadOpenParams, @Y61.k p pVar) {
        this.f301776a = fileDownloadOpenParams;
        this.f301777b = pVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<FileDownloadInternalAction> a() {
        FileDownloadOpenParams fileDownloadOpenParams = this.f301776a;
        Uri uri = fileDownloadOpenParams.f301666b;
        p pVar = this.f301777b;
        pVar.getClass();
        return new a(C43175k.G(new n(pVar, uri, fileDownloadOpenParams.f301667c, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

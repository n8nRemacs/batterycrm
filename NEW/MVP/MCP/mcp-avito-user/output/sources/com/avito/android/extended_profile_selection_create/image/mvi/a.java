package com.avito.android.extended_profile_selection_create.image.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements InterfaceC43160i<ExtendedProfileSetSelectionImageInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f151753b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_selection_create.image.mvi.a$a, reason: collision with other inner class name */
    public static final class C4438a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f151754b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.image.mvi.ExtendedProfileSetSelectionImageActor$process$$inlined$map$1$2", f = "ExtendedProfileSetSelectionImageActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.extended_profile_selection_create.image.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C4439a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f151755q;

            /* renamed from: r, reason: collision with root package name */
            public int f151756r;

            public C4439a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f151755q = obj;
                this.f151756r |= BeduinInputModel.MIN_TEXT_VERSION;
                return C4438a.this.emit(null, this);
            }
        }

        public C4438a(InterfaceC43172j interfaceC43172j) {
            this.f151754b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x00a2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.extended_profile_selection_create.image.mvi.a.C4438a.C4439a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.extended_profile_selection_create.image.mvi.a$a$a r0 = (com.avito.android.extended_profile_selection_create.image.mvi.a.C4438a.C4439a) r0
                int r1 = r0.f151756r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f151756r = r1
                goto L18
            L13:
                com.avito.android.extended_profile_selection_create.image.mvi.a$a$a r0 = new com.avito.android.extended_profile_selection_create.image.mvi.a$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f151755q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f151756r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r6)
                goto La3
            L2a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L32:
                kotlin.C42729a0.b(r6)
                com.avito.android.profile_management_core.images.a$d r5 = (com.avito.android.profile_management_core.images.a.d) r5
                boolean r6 = r5 instanceof com.avito.android.profile_management_core.images.a.d.b
                if (r6 == 0) goto L89
                com.avito.android.profile_management_core.images.a$d$b r5 = (com.avito.android.profile_management_core.images.a.d.b) r5
                com.avito.android.profile_management_core.images.entity.UploadImage$ImageFromPhotoPicker r5 = r5.f226628a
                com.avito.android.profile_management_core.images.entity.UploadImageState r6 = r5.f226686g
                boolean r2 = r6 instanceof com.avito.android.profile_management_core.images.entity.UploadImageState.Set
                if (r2 == 0) goto L47
                r2 = r3
                goto L49
            L47:
                boolean r2 = r6 instanceof com.avito.android.profile_management_core.images.entity.UploadImageState.ModerationFailed
            L49:
                if (r2 == 0) goto L4d
                r2 = r3
                goto L4f
            L4d:
                boolean r2 = r6 instanceof com.avito.android.profile_management_core.images.entity.UploadImageState.ModerationPassed
            L4f:
                if (r2 == 0) goto L53
                r2 = r3
                goto L55
            L53:
                boolean r2 = r6 instanceof com.avito.android.profile_management_core.images.entity.UploadImageState.ModerationPending
            L55:
                if (r2 == 0) goto L5a
                com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction$CloseScreen r5 = com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction.CloseScreen.f151769b
                goto L98
            L5a:
                boolean r2 = r6 instanceof com.avito.android.profile_management_core.images.entity.UploadImageState.Selected
                if (r2 == 0) goto L60
                r2 = r3
                goto L62
            L60:
                boolean r2 = r6 instanceof com.avito.android.profile_management_core.images.entity.UploadImageState.Setting
            L62:
                if (r2 == 0) goto L66
                r2 = r3
                goto L68
            L66:
                boolean r2 = r6 instanceof com.avito.android.profile_management_core.images.entity.UploadImageState.Uploaded
            L68:
                if (r2 == 0) goto L6c
                r2 = r3
                goto L6e
            L6c:
                boolean r2 = r6 instanceof com.avito.android.profile_management_core.images.entity.UploadImageState.Uploading
            L6e:
                if (r2 == 0) goto L72
                r2 = r3
                goto L74
            L72:
                boolean r2 = r6 instanceof com.avito.android.profile_management_core.images.entity.UploadImageState.UploadingError
            L74:
                if (r2 == 0) goto L78
                r6 = r3
                goto L7a
            L78:
                boolean r6 = r6 instanceof com.avito.android.profile_management_core.images.entity.UploadImageState.SettingError
            L7a:
                if (r6 == 0) goto L83
                com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction$ImageUpdate r6 = new com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction$ImageUpdate
                r6.<init>(r5)
            L81:
                r5 = r6
                goto L98
            L83:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            L89:
                boolean r6 = r5 instanceof com.avito.android.profile_management_core.images.a.d.C6880a
                if (r6 == 0) goto La6
                com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction$SetSelectionImageError r6 = new com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction$SetSelectionImageError
                com.avito.android.profile_management_core.images.a$d$a r5 = (com.avito.android.profile_management_core.images.a.d.C6880a) r5
                java.lang.Throwable r5 = r5.f226627a
                r2 = 0
                r6.<init>(r5, r2)
                goto L81
            L98:
                r0.f151756r = r3
                kotlinx.coroutines.flow.j r6 = r4.f151754b
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto La3
                return r1
            La3:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            La6:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_selection_create.image.mvi.a.C4438a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public a(InterfaceC43160i interfaceC43160i) {
        this.f151753b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super ExtendedProfileSetSelectionImageInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f151753b.collect(new C4438a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

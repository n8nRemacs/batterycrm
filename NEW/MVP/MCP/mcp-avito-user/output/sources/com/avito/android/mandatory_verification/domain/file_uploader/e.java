package com.avito.android.mandatory_verification.domain.file_uploader;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
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
/* loaded from: classes14.dex */
public final class e implements InterfaceC43160i<l> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f184523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f184524c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f184525b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f184526c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.mandatory_verification.domain.file_uploader.FileUploaderInteractor$deleteFile$$inlined$map$2$2", f = "FileUploaderInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.mandatory_verification.domain.file_uploader.e$a$a, reason: collision with other inner class name */
        public static final class C5416a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f184527q;

            /* renamed from: r, reason: collision with root package name */
            public int f184528r;

            public C5416a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f184527q = obj;
                this.f184528r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, String str) {
            this.f184525b = interfaceC43172j;
            this.f184526c = str;
        }

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
                boolean r0 = r6 instanceof com.avito.android.mandatory_verification.domain.file_uploader.e.a.C5416a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.mandatory_verification.domain.file_uploader.e$a$a r0 = (com.avito.android.mandatory_verification.domain.file_uploader.e.a.C5416a) r0
                int r1 = r0.f184528r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f184528r = r1
                goto L18
            L13:
                com.avito.android.mandatory_verification.domain.file_uploader.e$a$a r0 = new com.avito.android.mandatory_verification.domain.file_uploader.e$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f184527q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f184528r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L6d
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                com.avito.android.remote.model.file_uploader.FileDeleteResult r5 = (com.avito.android.remote.model.file_uploader.FileDeleteResult) r5
                boolean r6 = r5 instanceof com.avito.android.remote.model.file_uploader.FileDeleteResult.Error
                if (r6 == 0) goto L57
                com.avito.android.remote.model.file_uploader.FileDeleteResult$Error r5 = (com.avito.android.remote.model.file_uploader.FileDeleteResult.Error) r5
                java.lang.String r5 = r5.getMessage()
                if (r5 == 0) goto L47
                com.avito.android.printable_text.PrintableText r5 = com.avito.android.printable_text.b.f(r5)
                goto L51
            L47:
                r5 = 0
                java.io.Serializable[] r5 = new java.io.Serializable[r5]
                r6 = 2131953922(0x7f130902, float:1.9544329E38)
                com.avito.android.printable_text.PrintableText r5 = com.avito.android.printable_text.b.c(r6, r5)
            L51:
                com.avito.android.mandatory_verification.domain.file_uploader.l$c r6 = new com.avito.android.mandatory_verification.domain.file_uploader.l$c
                r6.<init>(r5)
                goto L62
            L57:
                boolean r5 = r5 instanceof com.avito.android.remote.model.file_uploader.FileDeleteResult.Success
                if (r5 == 0) goto L70
                com.avito.android.mandatory_verification.domain.file_uploader.l$a r6 = new com.avito.android.mandatory_verification.domain.file_uploader.l$a
                java.lang.String r5 = r4.f184526c
                r6.<init>(r5)
            L62:
                r0.f184528r = r3
                kotlinx.coroutines.flow.j r5 = r4.f184525b
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L6d
                return r1
            L6d:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            L70:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mandatory_verification.domain.file_uploader.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public e(d dVar, String str) {
        this.f184523b = dVar;
        this.f184524c = str;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super l> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f184523b.collect(new a(interfaceC43172j, this.f184524c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

package com.avito.android.download_deeplink.link;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.download_deeplink.link.d;
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
public final class f implements InterfaceC43160i<d.b> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f144927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f144928c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f144929d;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f144930b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f144931c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f144932d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.download_deeplink.link.DownloadFileLinkInteractor$download$$inlined$map$1$2", f = "DownloadFileLinkInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.download_deeplink.link.f$a$a, reason: collision with other inner class name */
        public static final class C4219a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f144933q;

            /* renamed from: r, reason: collision with root package name */
            public int f144934r;

            public C4219a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f144933q = obj;
                this.f144934r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, d dVar, long j12) {
            this.f144930b = interfaceC43172j;
            this.f144931c = dVar;
            this.f144932d = j12;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, @Y61.k kotlin.coroutines.Continuation r9) {
            /*
                r7 = this;
                r0 = 1
                boolean r1 = r9 instanceof com.avito.android.download_deeplink.link.f.a.C4219a
                if (r1 == 0) goto L14
                r1 = r9
                com.avito.android.download_deeplink.link.f$a$a r1 = (com.avito.android.download_deeplink.link.f.a.C4219a) r1
                int r2 = r1.f144934r
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L14
                int r2 = r2 - r3
                r1.f144934r = r2
                goto L19
            L14:
                com.avito.android.download_deeplink.link.f$a$a r1 = new com.avito.android.download_deeplink.link.f$a$a
                r1.<init>(r9)
            L19:
                java.lang.Object r9 = r1.f144933q
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r1.f144934r
                if (r3 == 0) goto L31
                if (r3 != r0) goto L29
                kotlin.C42729a0.b(r9)
                goto L88
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                kotlin.C42729a0.b(r9)
                kotlin.G0 r8 = (kotlin.G0) r8
                int r8 = com.avito.android.download_deeplink.link.d.f144920c
                com.avito.android.download_deeplink.link.d r8 = r7.f144931c
                r8.getClass()
                android.app.DownloadManager$Query r9 = new android.app.DownloadManager$Query
                r9.<init>()
                long r3 = r7.f144932d
                long[] r5 = new long[r0]
                r6 = 0
                r5[r6] = r3
                r9.setFilterById(r5)
                android.app.DownloadManager r8 = r8.f144921a
                android.database.Cursor r8 = r8.query(r9)
                r8.moveToFirst()
                java.lang.String r9 = "status"
                int r9 = r8.getColumnIndex(r9)
                int r9 = r8.getInt(r9)
                r3 = 8
                if (r9 == r3) goto L7b
                r3 = 16
                if (r9 == r3) goto L6a
                com.avito.android.download_deeplink.link.d$b$b r8 = com.avito.android.download_deeplink.link.d.b.C4218b.f144924a
                goto L7d
            L6a:
                java.lang.String r9 = "reason"
                int r9 = r8.getColumnIndex(r9)
                com.avito.android.download_deeplink.link.d$b$a r3 = new com.avito.android.download_deeplink.link.d$b$a
                int r8 = r8.getInt(r9)
                r3.<init>(r8)
                r8 = r3
                goto L7d
            L7b:
                com.avito.android.download_deeplink.link.d$b$c r8 = com.avito.android.download_deeplink.link.d.b.c.f144925a
            L7d:
                r1.f144934r = r0
                kotlinx.coroutines.flow.j r9 = r7.f144930b
                java.lang.Object r8 = r9.emit(r8, r1)
                if (r8 != r2) goto L88
                return r2
            L88:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.download_deeplink.link.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public f(InterfaceC43160i interfaceC43160i, d dVar, long j12) {
        this.f144927b = interfaceC43160i;
        this.f144928c = dVar;
        this.f144929d = j12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super d.b> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = this.f144927b.collect(new a(interfaceC43172j, this.f144928c, this.f144929d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

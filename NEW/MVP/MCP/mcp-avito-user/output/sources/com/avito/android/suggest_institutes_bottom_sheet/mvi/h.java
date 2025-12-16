package com.avito.android.suggest_institutes_bottom_sheet.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.suggest_institutes_bottom_sheet.mvi.m;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SuggestInstitutesBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/m;", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements com.avito.android.arch.mvi.b<m> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.suggest_institutes_bottom_sheet.domain.a f292056a;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<m.b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43210w f292057b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.suggest_institutes_bottom_sheet.mvi.h$a$a, reason: collision with other inner class name */
        public static final class C8856a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f292058b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.suggest_institutes_bottom_sheet.mvi.SuggestInstitutesBootstrap$produce$$inlined$map$1$2", f = "SuggestInstitutesBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.suggest_institutes_bottom_sheet.mvi.h$a$a$a, reason: collision with other inner class name */
            public static final class C8857a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f292059q;

                /* renamed from: r, reason: collision with root package name */
                public int f292060r;

                public C8857a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f292059q = obj;
                    this.f292060r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8856a.this.emit(null, this);
                }
            }

            public C8856a(InterfaceC43172j interfaceC43172j) {
                this.f292058b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.suggest_institutes_bottom_sheet.mvi.h.a.C8856a.C8857a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.suggest_institutes_bottom_sheet.mvi.h$a$a$a r0 = (com.avito.android.suggest_institutes_bottom_sheet.mvi.h.a.C8856a.C8857a) r0
                    int r1 = r0.f292060r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f292060r = r1
                    goto L18
                L13:
                    com.avito.android.suggest_institutes_bottom_sheet.mvi.h$a$a$a r0 = new com.avito.android.suggest_institutes_bottom_sheet.mvi.h$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f292059q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f292060r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    java.util.List r5 = (java.util.List) r5
                    com.avito.android.suggest_institutes_bottom_sheet.mvi.m$b r6 = new com.avito.android.suggest_institutes_bottom_sheet.mvi.m$b
                    r6.<init>(r5)
                    r0.f292060r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f292058b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.suggest_institutes_bottom_sheet.mvi.h.a.C8856a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(C43210w c43210w) {
            this.f292057b = c43210w;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super m.b> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f292057b.collect(new C8856a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.suggest_institutes_bottom_sheet.domain.a aVar) {
        this.f292056a = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<m> a() {
        return new a(this.f292056a.a());
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

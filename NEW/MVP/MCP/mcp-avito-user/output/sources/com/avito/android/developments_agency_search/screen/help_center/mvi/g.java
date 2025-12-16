package com.avito.android.developments_agency_search.screen.help_center.mvi;

import Ew.InterfaceC13538c;
import Qw.InterfaceC14939a;
import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.screen.help_center.model.HelpCenterArguments;
import com.avito.android.remote.model.SearchParamsConverterKt;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: HelpCenterBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/help_center/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "LGw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements com.avito.android.arch.mvi.b<Gw.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14939a f138015a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.features.a f138016b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final HelpCenterArguments f138017c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13538c f138018d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f138019e;

    /* compiled from: HelpCenterBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LGw/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.help_center.mvi.HelpCenterBootstrap$produce$1", f = "HelpCenterBootstrap.kt", i = {1, 1, 2}, l = {31, 35, 37, 41, 43, 47}, m = "invokeSuspend", n = {"$this$flow", SearchParamsConverterKt.LOCATION_ID, "$this$flow"}, s = {"L$0", "L$1", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super Gw.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Long f138020q;

        /* renamed from: r, reason: collision with root package name */
        public int f138021r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f138022s;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f138022s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Gw.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.help_center.mvi.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public g(@Y61.k InterfaceC14939a interfaceC14939a, @Y61.k com.avito.android.developments_agency_search.features.a aVar, @Y61.k HelpCenterArguments helpCenterArguments, @Y61.k InterfaceC13538c interfaceC13538c) {
        this.f138015a = interfaceC14939a;
        this.f138016b = aVar;
        this.f138017c = helpCenterArguments;
        this.f138018d = interfaceC13538c;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<Gw.b> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

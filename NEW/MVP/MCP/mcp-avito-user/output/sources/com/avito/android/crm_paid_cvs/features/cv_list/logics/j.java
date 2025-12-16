package com.avito.android.crm_paid_cvs.features.cv_list.logics;

import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import dt.InterfaceC39801a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CvListLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.crm_paid_cvs.features.cv_list.logics.CvListLoader$loadList$2", f = "CvListLoader.kt", i = {1, 2, 2, 3, 3}, l = {AvailableCode.ERROR_NO_ACTIVITY, 30, 40, 48, 49, 51}, m = "invokeSuspend", n = {"remoteFilters", "remoteFilters", "remoteSearches", "remoteFilters", "remoteSearches"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes12.dex */
final class j extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public List f130583q;

    /* renamed from: r, reason: collision with root package name */
    public List f130584r;

    /* renamed from: s, reason: collision with root package name */
    public int f130585s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<CvListInternalAction> f130586t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CvListInternalAction.LoadType f130587u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List<FilterItem> f130588v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC39801a f130589w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Long f130590x;

    /* compiled from: CvListLoader.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f130591l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Network error when performing getFiltersList request.";
        }
    }

    /* compiled from: CvListLoader.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f130592l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Network error when performing getSearchesList request.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(InterfaceC43172j<? super CvListInternalAction> interfaceC43172j, CvListInternalAction.LoadType loadType, List<FilterItem> list, InterfaceC39801a interfaceC39801a, Long l12, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f130586t = interfaceC43172j;
        this.f130587u = loadType;
        this.f130588v = list;
        this.f130589w = interfaceC39801a;
        this.f130590x = l12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new j(this.f130586t, this.f130587u, this.f130588v, this.f130589w, this.f130590x, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.features.cv_list.logics.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

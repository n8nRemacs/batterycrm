package com.avito.android.crm_paid_cvs.features.cv_list.logics;

import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListInternalAction;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CvListActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.crm_paid_cvs.features.cv_list.logics.CvListActor$process$1", f = "CvListActor.kt", i = {4, 8, 15, 17, 17}, l = {79, 80, 81, 95, 112, 113, 129, 124, 139, 140, 154, 178, 195, 203, 209, 226, 227, 247, 248}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "item"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CvListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f130534q;

    /* renamed from: r, reason: collision with root package name */
    public CvItem f130535r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43172j f130536s;

    /* renamed from: t, reason: collision with root package name */
    public int f130537t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f130538u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ CvListState f130539v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f130540w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.crm_paid_cvs.features.cv_list.entity.a f130541x;

    /* compiled from: CvListActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.crm_paid_cvs.features.cv_list.logics.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3879a {
        static {
            int[] iArr = new int[CvListState.Tab.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CvListState.Tab tab = CvListState.Tab.f130509c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CvListState.Tab tab2 = CvListState.Tab.f130509c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CvListState cvListState, b bVar, com.avito.android.crm_paid_cvs.features.cv_list.entity.a aVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f130539v = cvListState;
        this.f130540w = bVar;
        this.f130541x = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f130539v, this.f130540w, this.f130541x, continuation);
        aVar.f130538u = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CvListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0382 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x042c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0222 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.features.cv_list.logics.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

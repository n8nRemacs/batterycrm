package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.profile_phones.phones_list.SectionForOpen;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhonesListMviBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_phones.phones_list.mvi.PhonesListMviBootstrap$loadPhonesAndIac$1", f = "PhonesListMviBootstrap.kt", i = {0, 1, 2, 2, 3, 3}, l = {34, 35, 39, 41, 43, 60}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "iacData", "$this$flow", "iacData"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class x extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PhonesListMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C33432d f228103q;

    /* renamed from: r, reason: collision with root package name */
    public B f228104r;

    /* renamed from: s, reason: collision with root package name */
    public int f228105s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f228106t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B f228107u;

    /* compiled from: PhonesListMviBootstrap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f228108a;

        static {
            int[] iArr = new int[SectionForOpen.values().length];
            try {
                SectionForOpen.a aVar = SectionForOpen.f227421b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f228108a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(B b12, Continuation<? super x> continuation) {
        super(2, continuation);
        this.f228107u = b12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        x xVar = new x(this.f228107u, continuation);
        xVar.f228106t = obj;
        return xVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PhonesListMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((x) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.avito.android.profile_phones.phones_list.mvi.d] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.avito.android.profile_phones.phones_list.mvi.d] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.avito.android.profile_phones.phones_list.mvi.d] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.mvi.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

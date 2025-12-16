package com.avito.android.extended_profile.mvi;

import com.avito.android.advertising.CommercialLoadingItem;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.my.tracker.ads.AdFormat;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileActor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$loadCommercialBanner$1", f = "ExtendedProfileActor.kt", i = {0, 0, 0, 0, 1, 1}, l = {818, 825, 831, 833}, m = "invokeSuspend", n = {"$this$flow", AdFormat.BANNER, "pageCdtm", "bannerIndex", "$this$flow", AdFormat.BANNER}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1"})
/* renamed from: com.avito.android.extended_profile.mvi.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30462l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public CommercialLoadingItem f150328q;

    /* renamed from: r, reason: collision with root package name */
    public long f150329r;

    /* renamed from: s, reason: collision with root package name */
    public int f150330s;

    /* renamed from: t, reason: collision with root package name */
    public int f150331t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f150332u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C30451a f150333v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.extended_profile.data.b f150334w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30462l(C30451a c30451a, com.avito.android.extended_profile.data.b bVar, Continuation<? super C30462l> continuation) {
        super(2, continuation);
        this.f150333v = c30451a;
        this.f150334w = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30462l c30462l = new C30462l(this.f150333v, this.f150334w, continuation);
        c30462l.f150332u = obj;
        return c30462l;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30462l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.mvi.C30462l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

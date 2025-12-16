package com.avito.android.cpx_promo.impl.mvi;

import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState;
import com.avito.android.cpx_promo.priceinput.CpxPromoInputSource;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: CpxPromoActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo.impl.mvi.CpxPromoActor$observeDeeplinkResult$1", f = "CpxPromoActor.kt", i = {1, 2}, l = {103, 118, 124}, m = "invokeSuspend", n = {VoiceInfo.STATE, VoiceInfo.STATE}, s = {"L$0", "L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC43160i<? extends CpxPromoInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f127057q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f127058r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f127059s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<CpxPromoState> f127060t;

    /* compiled from: CpxPromoActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cpx_promo.impl.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3784a {
        static {
            int[] iArr = new int[CpxPromoInputSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CpxPromoInputSource cpxPromoInputSource = CpxPromoInputSource.f127248b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k kVar, Y41.a<CpxPromoState> aVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f127059s = kVar;
        this.f127060t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f127059s, this.f127060t, continuation);
        aVar.f127058r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends CpxPromoInternalAction>> continuation) {
        return ((a) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.impl.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

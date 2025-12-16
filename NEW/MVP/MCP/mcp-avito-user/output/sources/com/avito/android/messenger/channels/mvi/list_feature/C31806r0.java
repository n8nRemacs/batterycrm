package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.avito.android.util.X2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ChannelsListActorSubscriptions.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u00002\u001a\u0010\u0007\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0005H\u008a@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "", "LHY/b;", "Lkotlin/Q;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$subscribeToChannelTags$7", f = "ChannelsListActorSubscriptions.kt", i = {0}, l = {207, 210}, m = "invokeSuspend", n = {"$this$transformLatest"}, s = {"L$0"})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.r0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31806r0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Map<String, ? extends List<? extends HY.b>>>, kotlin.Q<? extends Long, ? extends List<? extends String>>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f188186q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f188187r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ kotlin.Q f188188s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f188189t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31806r0(W w12, Continuation<? super C31806r0> continuation) {
        super(3, continuation);
        this.f188189t = w12;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super Map<String, ? extends List<? extends HY.b>>> interfaceC43172j, kotlin.Q<? extends Long, ? extends List<? extends String>> q12, Continuation<? super kotlin.G0> continuation) {
        C31806r0 c31806r0 = new C31806r0(this.f188189t, continuation);
        c31806r0.f188187r = interfaceC43172j;
        c31806r0.f188188s = q12;
        return c31806r0.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object objB;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f188186q;
        W w12 = this.f188189t;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = this.f188187r;
            List list = (List) this.f188188s.f406620c;
            WY.a aVar = w12.f187876m.get();
            YY.e eVar = new YY.e(list);
            this.f188187r = interfaceC43172j;
            this.f188186q = 1;
            objB = aVar.b(eVar, this);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            interfaceC43172j = this.f188187r;
            C42729a0.b(obj);
            objB = obj;
        }
        TypedResult typedResult = (TypedResult) objB;
        if (typedResult instanceof TypedResult.Success) {
            YY.d dVar = (YY.d) ((TypedResult.Success) typedResult).getResult();
            w12.getClass();
            List<YY.c> listB = dVar.b();
            List<YY.b> listA = dVar.a();
            List<YY.c> list2 = listB;
            int iF2 = kotlin.collections.P0.f(C42745f0.q(list2, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (Object obj2 : list2) {
                linkedHashMap.put(Long.valueOf(((YY.c) obj2).getId()), obj2);
            }
            List<YY.b> list3 = listA;
            int iF3 = kotlin.collections.P0.f(C42745f0.q(list3, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF3 >= 16 ? iF3 : 16);
            for (YY.b bVar : list3) {
                List<YY.a> listB2 = bVar.b();
                ArrayList arrayList = new ArrayList();
                for (YY.a aVar2 : listB2) {
                    YY.c cVar = (YY.c) linkedHashMap.get(Long.valueOf(aVar2.getTagId()));
                    HY.b bVar2 = cVar == null ? null : new HY.b(aVar2.getSourceMessageId(), cVar.getTitle(), aVar2.getTagId(), cVar.getTextColor(), cVar.getBackgroundColor());
                    if (bVar2 != null) {
                        arrayList.add(bVar2);
                    }
                }
                linkedHashMap2.put(bVar.getChannelId(), arrayList);
            }
            this.f188187r = null;
            this.f188186q = 2;
            if (interfaceC43172j.emit(linkedHashMap2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            X2.f318778a.j("Mvi-ChannelsList", "getBadgeTags", C35936s.a(error.getError(), error.getCause()));
        }
        return kotlin.G0.f406611a;
    }
}

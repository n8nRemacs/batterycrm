package com.avito.android.profile_settings_basic.mvi;

import Qb0.InterfaceC14879b;
import android.os.Parcelable;
import com.avito.android.profile_settings_basic.adapter.BasicSettingsListItem;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BasicProfileSettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LQb0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_basic.mvi.BasicProfileSettingsActor$process$8", f = "BasicProfileSettingsActor.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14879b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228882q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f228883r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Qb0.d f228884s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Qb0.d dVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f228884s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f228884s, continuation);
        hVar.f228883r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14879b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Parcelable parcelable;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f228882q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f228883r;
            List<BasicSettingsListItem> list = this.f228884s.f13907a;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((BasicSettingsListItem) next) instanceof BasicInfoItem) {
                        break;
                    }
                }
                parcelable = (BasicSettingsListItem) next;
            } else {
                parcelable = null;
            }
            BasicInfoItem basicInfoItem = parcelable instanceof BasicInfoItem ? (BasicInfoItem) parcelable : null;
            if (basicInfoItem != null) {
                InterfaceC14879b.l lVar = new InterfaceC14879b.l(basicInfoItem.f228586f);
                this.f228882q = 1;
                if (interfaceC43172j.emit(lVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}

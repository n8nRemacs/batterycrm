package com.avito.android.profile_settings_basic.mvi;

import Nb0.C14557a;
import Qb0.InterfaceC14878a;
import Qb0.InterfaceC14879b;
import Qb0.e;
import com.avito.android.profile_settings_basic.adapter.BasicSettingsListItem;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import com.avito.android.profile_settings_basic.mvi.entity.BasicInfoAvatarAction;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BasicProfileSettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LQb0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_basic.mvi.BasicProfileSettingsActor$process$4", f = "BasicProfileSettingsActor.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM, 103}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14879b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228869q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f228870r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14878a f228871s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Qb0.d f228872t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f228873u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC14878a interfaceC14878a, Qb0.d dVar, j jVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f228871s = interfaceC14878a;
        this.f228872t = dVar;
        this.f228873u = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f228871s, this.f228872t, this.f228873u, continuation);
        dVar.f228870r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14879b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        BasicSettingsListItem basicSettingsListItem;
        List<BasicInfoItem.AvatarAction> list;
        BasicInfoItem.AvatarAction avatarAction;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f228869q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f228870r;
            if (!((e.b) this.f228871s).f13917b) {
                List<BasicSettingsListItem> list2 = this.f228872t.f13907a;
                BasicInfoAvatarAction basicInfoAvatarAction = null;
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
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
                    basicSettingsListItem = (BasicSettingsListItem) next;
                } else {
                    basicSettingsListItem = null;
                }
                BasicInfoItem basicInfoItem = basicSettingsListItem instanceof BasicInfoItem ? (BasicInfoItem) basicSettingsListItem : null;
                if (basicInfoItem != null && (list = basicInfoItem.f228593m) != null && (avatarAction = (BasicInfoItem.AvatarAction) C42745f0.w0(list)) != null) {
                    basicInfoAvatarAction = avatarAction.f228595c;
                }
                if (basicInfoAvatarAction instanceof BasicInfoAvatarAction.OpenAvatarPicker) {
                    this.f228873u.f228891c.c(new C14557a());
                    InterfaceC14879b.l lVar = new InterfaceC14879b.l(basicInfoItem.f228586f);
                    this.f228869q = 1;
                    if (interfaceC43172j.emit(lVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    InterfaceC14879b.o oVar = InterfaceC14879b.o.f13889a;
                    this.f228869q = 2;
                    if (interfaceC43172j.emit(oVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}

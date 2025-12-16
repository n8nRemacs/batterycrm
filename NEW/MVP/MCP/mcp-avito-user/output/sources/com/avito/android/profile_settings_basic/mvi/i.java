package com.avito.android.profile_settings_basic.mvi;

import Qb0.InterfaceC14878a;
import Qb0.InterfaceC14879b;
import Qb0.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DetailsSheetButton;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.deep_linking.links.Theme;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vy.C49395b;

/* compiled from: BasicProfileSettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LQb0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_basic.mvi.BasicProfileSettingsActor$process$9", f = "BasicProfileSettingsActor.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14879b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228885q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f228886r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14878a f228887s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f228888t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC14878a interfaceC14878a, j jVar, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f228887s = interfaceC14878a;
        this.f228888t = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f228887s, this.f228888t, continuation);
        iVar.f228886r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14879b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f228885q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f228886r;
            BasicInfoItem.TextField textField = ((e.d) this.f228887s).f13919b;
            DeepLink deepLink = textField.f228609i;
            ParametrizedEvent parametrizedEvent = null;
            Object[] objArr = 0;
            j jVar = this.f228888t;
            if (deepLink != null) {
                b.a.a(jVar.f228892d, deepLink, null, null, 6);
            } else {
                if (!L.f(textField.f228605e, Boxing.boxBoolean(true))) {
                    BasicInfoItem.Info info = textField.f228607g;
                    if (info != null) {
                        jVar.getClass();
                        String str = info.f228600c;
                        AttributedText attributedText = str != null ? new AttributedText(str, C42784z0.f406748b, 0, 4, null) : null;
                        Theme theme = Theme.AVITO_RE_23;
                        String str2 = info.f228601d;
                        b.a.a(jVar.f228892d, new DetailsSheetLink(new DetailsSheetLinkBody(info.f228599b, null, null, null, attributedText, null, str2 != null ? new DetailsSheetButton(str2, "primaryLarge", null, null, null, null, 60, null) : null, null, null, null, null, null, null, null, theme, null, null, false, null, 507822, null), parametrizedEvent, 2, objArr == true ? 1 : 0), null, null, 6);
                    }
                } else if (L.f(textField.f228602b, "services_profile_type")) {
                    jVar.f228891c.c(new C49395b(textField.f228603c));
                    InterfaceC14879b.m mVar = InterfaceC14879b.m.f13884a;
                    this.f228885q = 1;
                    if (interfaceC43172j.emit(mVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

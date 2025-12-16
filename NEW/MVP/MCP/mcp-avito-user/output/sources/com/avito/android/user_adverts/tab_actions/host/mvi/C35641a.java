package com.avito.android.user_adverts.tab_actions.host.mvi;

import Ju.InterfaceC14249c;
import YI0.a;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts.model.UserAdvertActionAttentionInfo;
import com.avito.android.user_adverts.model.UserAdvertActionType;
import com.avito.android.user_adverts.tab_actions.host.items.UserAdvertSingleActionItem;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserAdvertsActionsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LYI0/a;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.tab_actions.host.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35641a implements com.avito.android.arch.mvi.a<YI0.a, UserAdvertsActionsInternalAction, UserAdvertsActionsState> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f314396d = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f314397a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.tab_actions.host.domain.a f314398b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f314399c;

    /* compiled from: UserAdvertsActionsActor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/a$a;", "", "<init>", "()V", "", "CLICK_DEBOUNCE_MS", "J", "", "CPT_MASS_ACTIVATION_REQUEST_KEY", "Ljava/lang/String;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_actions.host.mvi.a$a, reason: collision with other inner class name */
    public static final class C9705a {
        public /* synthetic */ C9705a(C42822w c42822w) {
            this();
        }

        public C9705a() {
        }
    }

    /* compiled from: UserAdvertsActionsActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_actions.host.mvi.a$b */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[UserAdvertActionType.Multiple.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<UserAdvertActionType.Multiple> creator = UserAdvertActionType.Multiple.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<UserAdvertActionType.Multiple> creator2 = UserAdvertActionType.Multiple.CREATOR;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Parcelable.Creator<UserAdvertActionType.Multiple> creator3 = UserAdvertActionType.Multiple.CREATOR;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Parcelable.Creator<UserAdvertActionType.Multiple> creator4 = UserAdvertActionType.Multiple.CREATOR;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new C9705a(null);
    }

    @Inject
    public C35641a(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.user_adverts.tab_actions.host.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f314397a = interfaceC28373a;
        this.f314398b = aVar;
        this.f314399c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(new C35645e(c43197r1), new C35646f(c43197r1), new C35647g(c43197r1), new C35648h(c43197r1));
        e.a aVar2 = kotlin.time.e.f410651c;
        DurationUnit durationUnit = DurationUnit.f410633e;
        return C43175k.N(C43175k.Y(C43175k.p(mVarN, kotlin.time.g.h(300L, durationUnit)), new i(null, this, aVar)), C43175k.Y(C43175k.N(new j(aVar, C43175k.p(new m(c43197r1), kotlin.time.g.h(300L, durationUnit))), new k(new n(c43197r1), aVar), new l(new o(c43197r1), aVar), new p(c43197r1), new q(c43197r1)), new r(null, this, aVar)));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<UserAdvertsActionsInternalAction> b(@Y61.k YI0.a aVar, @Y61.k UserAdvertsActionsState userAdvertsActionsState) {
        InterfaceC43160i<UserAdvertsActionsInternalAction> c43210w;
        Object cancelled;
        if (aVar instanceof a.e) {
            a.e eVar = (a.e) aVar;
            return new C43210w(new UserAdvertsActionsInternalAction.ShowMultipleActions(eVar.f19422a, eVar.f19423b, eVar.f19424c));
        }
        if (aVar instanceof a.i) {
            return new C43210w(new UserAdvertsActionsInternalAction.HideActions(((a.i) aVar).f19432a));
        }
        boolean z12 = aVar instanceof a.b;
        UserAdvertsActionsState.a aVar2 = userAdvertsActionsState.f314465d;
        if (z12) {
            c43210w = aVar2 == null ? new C43210w(UserAdvertsActionsInternalAction.NoChange.f314436b) : new C43210w(new UserAdvertsActionsInternalAction.HideActionsEvent(userAdvertsActionsState.f314463b, aVar2));
        } else {
            if (aVar instanceof a.c) {
                com.avito.android.user_adverts.tab_actions.host.items.a aVar3 = ((a.c) aVar).f19417a;
                UserAdvertActionAttentionInfo userAdvertActionAttentionInfo = aVar3.f314316d;
                if (userAdvertActionAttentionInfo != null) {
                    return new C43210w(new UserAdvertsActionsInternalAction.NeedConfirmation(aVar3.f314322j, userAdvertActionAttentionInfo, aVar3.f314318f, aVar3.f314317e, aVar3.f314315c));
                }
                return d(new a.d(aVar3.f314315c, aVar3.f314317e, aVar3.f314318f, aVar3.f314320h));
            }
            if (aVar instanceof a.d) {
                return d((a.d) aVar);
            }
            if (aVar instanceof a.h) {
                a.h hVar = (a.h) aVar;
                return new C43210w(new UserAdvertsActionsInternalAction.ShowSingleActions(hVar.f19428a, hVar.f19429b, hVar.f19430c, hVar.f19431d));
            }
            if (aVar instanceof a.f) {
                UserAdvertSingleActionItem userAdvertSingleActionItem = ((a.f) aVar).f19425a;
                c43210w = new C43207v(new UserAdvertsActionsInternalAction[]{new UserAdvertsActionsInternalAction.StartActionHandling(userAdvertSingleActionItem.f314308i), new UserAdvertsActionsInternalAction.HandleSingleAction(userAdvertSingleActionItem.f314307h, userAdvertSingleActionItem.f314302c)});
            } else {
                if (!(aVar instanceof a.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.g gVar = (a.g) aVar;
                if ((aVar2 instanceof UserAdvertsActionsState.a.b) && L.f(((UserAdvertsActionsState.a.b) aVar2).f314472a, gVar.f19426a)) {
                    InterfaceC14249c interfaceC14249c = gVar.f19427b;
                    boolean z13 = interfaceC14249c instanceof AdvertPublicationLink.a.b;
                    String str = gVar.f19426a;
                    if (z13) {
                        cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Success(str, userAdvertsActionsState.f314463b, null, 4, null);
                    } else if (interfaceC14249c instanceof AdvertPublicationLink.a.C3985a) {
                        cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Cancelled(str);
                    } else {
                        boolean z14 = interfaceC14249c instanceof MyAdvertLink.Edit.Result.Success;
                        String str2 = userAdvertsActionsState.f314463b;
                        if (z14) {
                            cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Success(str, str2, ((MyAdvertLink.Edit.Result.Success) interfaceC14249c).f133497d);
                        } else if (interfaceC14249c instanceof MyAdvertLink.Edit.Result.a) {
                            cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Cancelled(str);
                        } else if (interfaceC14249c instanceof MyAdvertLink.Delete.b.C4008b) {
                            cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Success(str, str2, ((MyAdvertLink.Delete.b.C4008b) interfaceC14249c).f133488b.getMessage());
                        } else if (interfaceC14249c instanceof MyAdvertLink.Delete.b.a) {
                            cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Error(((MyAdvertLink.Delete.b.a) interfaceC14249c).f133487b, str);
                        } else if (interfaceC14249c instanceof MyAdvertLink.RestoreV2.b.c) {
                            cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Success(str, ((MyAdvertLink.RestoreV2.b.c) interfaceC14249c).f133510b, null, 4, null);
                        } else if (interfaceC14249c instanceof MyAdvertLink.RestoreV2.b.a) {
                            cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Error(((MyAdvertLink.RestoreV2.b.a) interfaceC14249c).f133508c, str);
                        } else if (interfaceC14249c instanceof MyAdvertLink.RestoreV2.b.C4009b) {
                            cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Error(new ApiError.Forbidden(((MyAdvertLink.RestoreV2.b.C4009b) interfaceC14249c).f133509b, null, 2, null), str);
                        } else if (interfaceC14249c instanceof MyAdvertLink.ActivateV2.b.c) {
                            cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Success(str, str2, ((MyAdvertLink.ActivateV2.b.c) interfaceC14249c).f133472b);
                        } else if (interfaceC14249c instanceof MyAdvertLink.ActivateV2.b.C4005b) {
                            cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Redirect(str, str2, null, 4, null);
                        } else if (interfaceC14249c instanceof MyAdvertLink.ActivateV2.b.a) {
                            cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Error(((MyAdvertLink.ActivateV2.b.a) interfaceC14249c).f133470c, str);
                        } else if (interfaceC14249c instanceof MyAdvertLink.DeactivateV2.b.c) {
                            cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Success(str, str2, ((MyAdvertLink.DeactivateV2.b.c) interfaceC14249c).f133485c);
                        } else if (interfaceC14249c instanceof MyAdvertLink.DeactivateV2.b.C4007b) {
                            cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Error(((MyAdvertLink.DeactivateV2.b.C4007b) interfaceC14249c).f133483b, str);
                        } else {
                            if (!(interfaceC14249c instanceof InterfaceC14249c.a ? true : interfaceC14249c instanceof InterfaceC14249c.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cancelled = new UserAdvertsActionsInternalAction.ResultActionHandling.Single.Cancelled(str);
                        }
                    }
                    c43210w = new C43210w(cancelled);
                } else {
                    c43210w = new C43210w(UserAdvertsActionsInternalAction.NoChange.f314436b);
                }
            }
        }
        return c43210w;
    }

    public final C43197r1 d(a.d dVar) {
        C43137a0 c43137a0;
        Set<String> setB = dVar.b();
        int size = setB.size();
        UserAdvertActionType.Multiple multiple = dVar.f19420c;
        this.f314397a.c(new pI0.d(size, multiple.f312180b, dVar.f19419b, setB));
        if (multiple == UserAdvertActionType.Multiple.f312173c) {
            c43137a0 = new C43137a0(new y(dVar, null), C43175k.Y(new w(C43175k.G(new x(dVar, this, null))), new v(dVar, this, null)));
        } else {
            c43137a0 = new C43137a0(new u(dVar, null), new s(C43175k.G(new t(dVar, this, null)), dVar));
        }
        return new C43197r1(new z(this, null), c43137a0);
    }
}

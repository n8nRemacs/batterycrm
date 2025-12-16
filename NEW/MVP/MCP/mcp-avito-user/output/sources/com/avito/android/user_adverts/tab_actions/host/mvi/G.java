package com.avito.android.user_adverts.tab_actions.host.mvi;

import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.user_adverts.model.UserAdvertActionType;
import com.avito.android.user_adverts.model.UserAdvertsGroupData;
import com.avito.android.user_adverts.tab_actions.host.domain.model.AvailableActionsDomain;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsActionsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/G;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class G implements com.avito.android.arch.mvi.u<UserAdvertsActionsInternalAction, UserAdvertsActionsState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.tab_actions.host.converter.d f314392b;

    /* compiled from: UserAdvertsActionsReducer.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/G$a;", "", "a", "b", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/G$a$a;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/G$a$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: UserAdvertsActionsReducer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/G$a$a;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/G$a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.tab_actions.host.mvi.G$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9704a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C9704a f314393a = new C9704a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C9704a);
            }

            public final int hashCode() {
                return -1943625545;
            }

            @Y61.k
            public final String toString() {
                return "End";
            }
        }

        /* compiled from: UserAdvertsActionsReducer.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/G$a$b;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/G$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final UserAdvertActionType f314394a;

            public b(@Y61.k UserAdvertActionType userAdvertActionType) {
                this.f314394a = userAdvertActionType;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f314394a, ((b) obj).f314394a);
            }

            public final int hashCode() {
                return this.f314394a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Start(actionType=" + this.f314394a + ')';
            }
        }
    }

    @Inject
    public G(@Y61.k com.avito.android.user_adverts.tab_actions.host.converter.d dVar) {
        this.f314392b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState.c b(com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState.c r17, com.avito.android.user_adverts.tab_actions.host.mvi.G.a r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r0 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState.c.C9710c
            r3 = 10
            r4 = 0
            if (r2 == 0) goto L67
            boolean r2 = r1 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.G.a.b
            com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$c$c r0 = (com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState.c.C9710c) r0
            java.util.List<com.avito.android.user_adverts.tab_actions.host.items.a> r5 = r0.f314479b
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            int r3 = kotlin.collections.C42745f0.q(r5, r3)
            r6.<init>(r3)
            java.util.Iterator r3 = r5.iterator()
        L20:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L5f
            java.lang.Object r5 = r3.next()
            com.avito.android.user_adverts.tab_actions.host.items.a r5 = (com.avito.android.user_adverts.tab_actions.host.items.a) r5
            boolean r7 = r1 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.G.a.C9704a
            if (r7 == 0) goto L32
        L30:
            r14 = r4
            goto L3f
        L32:
            if (r2 == 0) goto L59
            com.avito.android.user_adverts.model.UserAdvertActionType$Multiple r7 = r5.f314318f
            r8 = r1
            com.avito.android.user_adverts.tab_actions.host.mvi.G$a$b r8 = (com.avito.android.user_adverts.tab_actions.host.mvi.G.a.b) r8
            com.avito.android.user_adverts.model.UserAdvertActionType r8 = r8.f314394a
            if (r7 != r8) goto L30
            r7 = 1
            r14 = r7
        L3f:
            java.lang.String r9 = r5.f314314b
            com.avito.android.user_adverts.tab_actions.host.items.a r7 = new com.avito.android.user_adverts.tab_actions.host.items.a
            java.util.Map<com.avito.android.user_adverts.model.UserAdvertsShortcutGroup, com.avito.android.user_adverts.model.UserAdvertsGroupInfo> r10 = r5.f314315c
            com.avito.android.user_adverts.model.UserAdvertActionAttentionInfo r11 = r5.f314316d
            java.lang.String r12 = r5.f314317e
            com.avito.android.user_adverts.model.UserAdvertActionType$Multiple r13 = r5.f314318f
            com.avito.android.deep_linking.links.DeepLink r15 = r5.f314320h
            com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain$BadgeInfo r5 = r5.f314321i
            r8 = r7
            r16 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r6.add(r7)
            goto L20
        L59:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L5f:
            com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$c$c r1 = new com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$c$c
            com.avito.android.printable_text.PrintableText r0 = r0.f314478a
            r1.<init>(r0, r6, r2)
            goto Lcd
        L67:
            boolean r2 = r0 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState.c.d
            if (r2 == 0) goto Lcc
            com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$c$d r0 = (com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState.c.d) r0
            java.util.List<com.avito.android.user_adverts.tab_actions.host.items.UserAdvertSingleActionItem> r2 = r0.f314483c
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            int r3 = kotlin.collections.C42745f0.q(r2, r3)
            r5.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L7e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc2
            java.lang.Object r3 = r2.next()
            com.avito.android.user_adverts.tab_actions.host.items.UserAdvertSingleActionItem r3 = (com.avito.android.user_adverts.tab_actions.host.items.UserAdvertSingleActionItem) r3
            boolean r6 = r1 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.G.a.C9704a
            if (r6 == 0) goto L91
            r16 = r4
            goto La2
        L91:
            boolean r6 = r1 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.G.a.b
            if (r6 == 0) goto Lbc
            com.avito.android.user_adverts.model.UserAdvertActionType$Single r6 = r3.f314308i
            r7 = r1
            com.avito.android.user_adverts.tab_actions.host.mvi.G$a$b r7 = (com.avito.android.user_adverts.tab_actions.host.mvi.G.a.b) r7
            com.avito.android.user_adverts.model.UserAdvertActionType r7 = r7.f314394a
            boolean r6 = kotlin.jvm.internal.L.f(r6, r7)
            r16 = r6
        La2:
            java.lang.String r8 = r3.f314301b
            com.avito.android.user_adverts.tab_actions.host.items.UserAdvertSingleActionItem r6 = new com.avito.android.user_adverts.tab_actions.host.items.UserAdvertSingleActionItem
            java.lang.String r9 = r3.f314302c
            java.lang.String r10 = r3.f314303d
            java.lang.String r11 = r3.f314304e
            java.lang.String r12 = r3.f314305f
            com.avito.android.user_adverts.tab_actions.host.items.UserAdvertSingleActionItem$Type r13 = r3.f314306g
            com.avito.android.deep_linking.links.DeepLink r14 = r3.f314307h
            com.avito.android.user_adverts.model.UserAdvertActionType$Single r15 = r3.f314308i
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5.add(r6)
            goto L7e
        Lbc:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        Lc2:
            com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$c$d r1 = new com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$c$d
            java.lang.String r2 = r0.f314481a
            com.avito.android.printable_text.PrintableText r0 = r0.f314482b
            r1.<init>(r0, r2, r5)
            goto Lcd
        Lcc:
            r1 = r0
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_actions.host.mvi.G.b(com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$c, com.avito.android.user_adverts.tab_actions.host.mvi.G$a):com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$c");
    }

    public static UserAdvertsActionsState c(UserAdvertsActionsInternalAction.HideActions hideActions) {
        return new UserAdvertsActionsState(hideActions.f314426b, UserAdvertsActionsState.ActionState.None.f314469b, null, UserAdvertsActionsState.c.a.f314475a);
    }

    @Override // com.avito.android.arch.mvi.u
    public final UserAdvertsActionsState a(UserAdvertsActionsInternalAction userAdvertsActionsInternalAction, UserAdvertsActionsState userAdvertsActionsState) {
        UserAdvertsActionsState userAdvertsActionsStateC;
        UserAdvertsActionsState.c bVar;
        UserAdvertsActionsInternalAction userAdvertsActionsInternalAction2 = userAdvertsActionsInternalAction;
        UserAdvertsActionsState userAdvertsActionsState2 = userAdvertsActionsState;
        if (userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.HideActionsEvent) {
            return c(new UserAdvertsActionsInternalAction.HideActions(((UserAdvertsActionsInternalAction.HideActionsEvent) userAdvertsActionsInternalAction2).f314428b));
        }
        if (userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.HideActions) {
            return c((UserAdvertsActionsInternalAction.HideActions) userAdvertsActionsInternalAction2);
        }
        boolean z12 = userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.ShowMultipleActions;
        com.avito.android.user_adverts.tab_actions.host.converter.d dVar = this.f314392b;
        if (z12) {
            UserAdvertsActionsInternalAction.ShowMultipleActions showMultipleActions = (UserAdvertsActionsInternalAction.ShowMultipleActions) userAdvertsActionsInternalAction2;
            UserAdvertsGroupData userAdvertsGroupData = showMultipleActions.f314453c;
            int i12 = userAdvertsGroupData.f312183c;
            UserAdvertActionsInfoDomain userAdvertActionsInfoDomain = showMultipleActions.f314454d;
            if (i12 <= userAdvertActionsInfoDomain.f314984b.f315005c) {
                bVar = new UserAdvertsActionsState.c.C9710c(com.avito.android.printable_text.b.b(R.plurals.user_adverts_quantity_ad, i12, Integer.valueOf(i12)), dVar.a(userAdvertsGroupData, showMultipleActions.f314452b, userAdvertActionsInfoDomain, userAdvertsActionsState2.c()), userAdvertsActionsState2.c() != null);
            } else {
                bVar = new UserAdvertsActionsState.c.b(com.avito.android.printable_text.b.b(R.plurals.user_adverts_quantity_ad, i12, Integer.valueOf(i12)), com.avito.android.printable_text.b.f(userAdvertActionsInfoDomain.f314984b.f315004b));
            }
            return UserAdvertsActionsState.a(userAdvertsActionsState2, showMultipleActions.f314452b, null, new UserAdvertsActionsState.a.C9709a(userAdvertsGroupData, userAdvertActionsInfoDomain), bVar, 2);
        }
        boolean z13 = userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.ErrorActionHandling;
        UserAdvertsActionsState.c cVar = userAdvertsActionsState2.f314466e;
        if (z13) {
            return UserAdvertsActionsState.a(userAdvertsActionsState2, null, UserAdvertsActionsState.ActionState.None.f314469b, null, b(cVar, a.C9704a.f314393a), 5);
        }
        boolean z14 = userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Multiple;
        String str = userAdvertsActionsState2.f314463b;
        if (z14) {
            UserAdvertsActionsInternalAction.ResultActionHandling.Multiple multiple = (UserAdvertsActionsInternalAction.ResultActionHandling.Multiple) userAdvertsActionsInternalAction2;
            if (!(multiple instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Multiple.Cancelled)) {
                if (multiple instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Multiple.Success) {
                    return c(new UserAdvertsActionsInternalAction.HideActions(str));
                }
                if (multiple instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Multiple.Redirect) {
                    return userAdvertsActionsState2;
                }
                throw new NoWhenBranchMatchedException();
            }
            userAdvertsActionsStateC = UserAdvertsActionsState.a(userAdvertsActionsState2, null, UserAdvertsActionsState.ActionState.None.f314469b, null, b(cVar, a.C9704a.f314393a), 5);
        } else {
            if (!(userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Single)) {
                if (userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.StartActionHandling) {
                    UserAdvertActionType userAdvertActionType = ((UserAdvertsActionsInternalAction.StartActionHandling) userAdvertsActionsInternalAction2).f314461d;
                    return UserAdvertsActionsState.a(userAdvertsActionsState2, null, new UserAdvertsActionsState.ActionState.AwaitResult(userAdvertActionType), null, b(cVar, new a.b(userAdvertActionType)), 5);
                }
                if (userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.NeedConfirmation) {
                    return UserAdvertsActionsState.a(userAdvertsActionsState2, null, new UserAdvertsActionsState.ActionState.AwaitConfirmation(((UserAdvertsActionsInternalAction.NeedConfirmation) userAdvertsActionsInternalAction2).f314435f), null, null, 13);
                }
                if (!(userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.ShowSingleActions)) {
                    if (userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.HandleSingleAction ? true : userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.NoChange) {
                        return userAdvertsActionsState2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                UserAdvertsActionsInternalAction.ShowSingleActions showSingleActions = (UserAdvertsActionsInternalAction.ShowSingleActions) userAdvertsActionsInternalAction2;
                String str2 = showSingleActions.f314458d;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(str2);
                UserAdvertActionType userAdvertActionTypeC = userAdvertsActionsState2.c();
                AvailableActionsDomain availableActionsDomain = showSingleActions.f314459e;
                String str3 = showSingleActions.f314457c;
                return UserAdvertsActionsState.a(userAdvertsActionsState2, showSingleActions.f314456b, null, new UserAdvertsActionsState.a.b(str3, str2, availableActionsDomain), new UserAdvertsActionsState.c.d(printableTextF, str3, dVar.b(userAdvertActionTypeC, availableActionsDomain, str3)), 2);
            }
            UserAdvertsActionsInternalAction.ResultActionHandling.Single single = (UserAdvertsActionsInternalAction.ResultActionHandling.Single) userAdvertsActionsInternalAction2;
            UserAdvertsActionsState.a aVar = userAdvertsActionsState2.f314465d;
            if (!(aVar instanceof UserAdvertsActionsState.a.b) || !L.f(((UserAdvertsActionsState.a.b) aVar).f314472a, single.getF314449b())) {
                return userAdvertsActionsState2;
            }
            if (single instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Single.Cancelled) {
                userAdvertsActionsStateC = UserAdvertsActionsState.a(userAdvertsActionsState2, null, UserAdvertsActionsState.ActionState.None.f314469b, null, b(cVar, a.C9704a.f314393a), 5);
            } else {
                if (!(single instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Single.Error ? true : single instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Single.Redirect ? true : single instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Single.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                userAdvertsActionsStateC = c(new UserAdvertsActionsInternalAction.HideActions(str));
            }
        }
        return userAdvertsActionsStateC;
    }
}

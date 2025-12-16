package com.avito.android.profile.remove.mvi;

import K90.a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.RemovalOnboardingBottomSheetData;
import com.avito.android.deep_linking.RemoveActionDeeplink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.profile.remove.confirm.ProfileRemoveConfirmDialogParams;
import com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction;
import com.avito.android.profile.user_profile.analytics.UserProfileRemoveWalletBalanceLoadEvent;
import com.avito.android.remote.model.profile_removal.ProfileRemovalScreen;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ProfileRemoveActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/remove/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LK90/a;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction;", "LK90/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<K90.a, ProfileRemoveInternalAction, K90.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.remove.e f223940a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f223941b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f223942c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f223943d;

    @Inject
    public a(@Y61.k com.avito.android.profile.remove.e eVar, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f223940a = eVar;
        this.f223941b = interfaceC35863o4;
        this.f223942c = aVar;
        this.f223943d = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ProfileRemoveInternalAction> b(K90.a aVar, K90.c cVar) {
        C43210w c43210w;
        Double newWalletBalance;
        K90.a aVar2 = aVar;
        boolean z12 = aVar2 instanceof a.d;
        com.avito.android.profile.remove.e eVar = this.f223940a;
        if (z12) {
            return eVar.S1();
        }
        if (aVar2 instanceof a.c) {
            ProfileRemovalScreen profileRemovalScreen = ((a.c) aVar2).f9284a;
            if (profileRemovalScreen.getNewWalletBalance() != null && ((newWalletBalance = profileRemovalScreen.getNewWalletBalance()) == null || newWalletBalance.doubleValue() != 0.0d)) {
                Double oldWalletBalance = profileRemovalScreen.getOldWalletBalance();
                UserProfileRemoveWalletBalanceLoadEvent.FlowType flowType = (oldWalletBalance != null ? oldWalletBalance.doubleValue() : 0.0d) > 0.0d ? UserProfileRemoveWalletBalanceLoadEvent.FlowType.f224286d : UserProfileRemoveWalletBalanceLoadEvent.FlowType.f224285c;
                Double newWalletBalance2 = profileRemovalScreen.getNewWalletBalance();
                this.f223943d.c(new UserProfileRemoveWalletBalanceLoadEvent(flowType, newWalletBalance2 != null ? Integer.valueOf((int) newWalletBalance2.doubleValue()) : null));
            }
            return new C43210w(new ProfileRemoveInternalAction.OpenItemsScreen(this.f223941b.a(), profileRemovalScreen));
        }
        if (aVar2 instanceof a.b) {
            return eVar.R1();
        }
        if (!(aVar2 instanceof a.C0556a)) {
            throw new NoWhenBranchMatchedException();
        }
        DeepLink deepLink = ((a.C0556a) aVar2).f9282a;
        if (!(deepLink instanceof RemoveActionDeeplink)) {
            b.a.a(this.f223942c, deepLink, null, null, 6);
            return C43175k.w();
        }
        RemoveActionDeeplink removeActionDeeplink = (RemoveActionDeeplink) deepLink;
        RemovalOnboardingBottomSheetData removalOnboardingBottomSheetData = removeActionDeeplink.f132867d;
        if (removalOnboardingBottomSheetData != null) {
            c43210w = new C43210w(new ProfileRemoveInternalAction.ShowConfirmDialog(new ProfileRemoveConfirmDialogParams(removeActionDeeplink.f132866c, removalOnboardingBottomSheetData.f132862b, removalOnboardingBottomSheetData.f132863c, removalOnboardingBottomSheetData.f132864d, removeActionDeeplink.f132865b)));
        } else {
            if (removeActionDeeplink.f132865b) {
                return new C43210w(new ProfileRemoveInternalAction.ShowConfirmScreen(removeActionDeeplink));
            }
            c43210w = new C43210w(new ProfileRemoveInternalAction.ShowConfirmDialog(null));
        }
        return c43210w;
    }
}

package com.avito.android.profile.user_profile.mvi;

import Ua0.InterfaceC15504b;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UserProfileOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/h0;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "LUa0/b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h0 implements com.avito.android.arch.mvi.t<UserProfileInternalAction, InterfaceC15504b> {
    @Inject
    public h0() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15504b b(UserProfileInternalAction userProfileInternalAction) {
        InterfaceC15504b mVar;
        UserProfileInternalAction userProfileInternalAction2 = userProfileInternalAction;
        if (userProfileInternalAction2 instanceof UserProfileInternalAction.OpenLoginScreen) {
            return InterfaceC15504b.l.f16485a;
        }
        if (userProfileInternalAction2 instanceof UserProfileInternalAction.OpenShareDialog) {
            UserProfileInternalAction.OpenShareDialog openShareDialog = (UserProfileInternalAction.OpenShareDialog) userProfileInternalAction2;
            mVar = new InterfaceC15504b.j(openShareDialog.f226437b, openShareDialog.f226438c);
        } else {
            if (userProfileInternalAction2 instanceof UserProfileInternalAction.OpenSettings) {
                return InterfaceC15504b.i.f16481a;
            }
            if (userProfileInternalAction2 instanceof UserProfileInternalAction.OpenNotificationCenter) {
                return InterfaceC15504b.f.f16479a;
            }
            if (userProfileInternalAction2 instanceof UserProfileInternalAction.OpenEditProfileScreen) {
                return new InterfaceC15504b.c();
            }
            if (userProfileInternalAction2 instanceof UserProfileInternalAction.OpenProfileSettingsScreen) {
                ((UserProfileInternalAction.OpenProfileSettingsScreen) userProfileInternalAction2).getClass();
                mVar = new InterfaceC15504b.h();
            } else {
                if (userProfileInternalAction2 instanceof UserProfileInternalAction.OpenUserAdvertsScreen) {
                    return InterfaceC15504b.k.f16484a;
                }
                if (userProfileInternalAction2 instanceof UserProfileInternalAction.OpenHelpCenter) {
                    mVar = new InterfaceC15504b.d(((UserProfileInternalAction.OpenHelpCenter) userProfileInternalAction2).f226432b);
                } else {
                    if (userProfileInternalAction2 instanceof UserProfileInternalAction.OpenAvatarActionDialog) {
                        return InterfaceC15504b.C1131b.f16476a;
                    }
                    if (userProfileInternalAction2 instanceof UserProfileInternalAction.OpenPhotoPicker) {
                        mVar = new InterfaceC15504b.g(((UserProfileInternalAction.OpenPhotoPicker) userProfileInternalAction2).f226435b);
                    } else if (userProfileInternalAction2 instanceof UserProfileInternalAction.ShowToastBar) {
                        mVar = new InterfaceC15504b.o(((UserProfileInternalAction.ShowToastBar) userProfileInternalAction2).f226443b);
                    } else {
                        if (!(userProfileInternalAction2 instanceof UserProfileInternalAction.ShowSnackBar)) {
                            if (userProfileInternalAction2 instanceof UserProfileInternalAction.ShowSuccessActionToast) {
                                throw null;
                            }
                            if (userProfileInternalAction2 instanceof UserProfileInternalAction.CloseScreen) {
                                return InterfaceC15504b.a.f16475a;
                            }
                            if (userProfileInternalAction2 instanceof UserProfileInternalAction.OpenMainScreen) {
                                return InterfaceC15504b.e.f16478a;
                            }
                            if (userProfileInternalAction2 instanceof UserProfileInternalAction.HideSilentUpdateBanner ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.ActiveOrdersUpdate ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.AuthorizationError ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.DataLoaded ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.DataLoadingInProgress ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.DataError ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.HideSuggestedAddress ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.LogoutError ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.NotificationCenterCounterUpdate ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.OnActiveServiceBookingsLoaded ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.OnActiveServiceBookingsLoadingFailure ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.RemovePromoBlock ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.ShowLogoutProgress ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.UpdatePhones ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.UpdateWallet ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.UpdateAvitoFinance ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.UpdateAvitoFinanceDynamic ? true : userProfileInternalAction2 instanceof UserProfileInternalAction.UpdateVisibleItems) {
                                return null;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        mVar = new InterfaceC15504b.m(((UserProfileInternalAction.ShowSnackBar) userProfileInternalAction2).f226442b);
                    }
                }
            }
        }
        return mVar;
    }
}

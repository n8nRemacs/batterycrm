package com.avito.android.passport.profile_add.create_flow;

import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29684j;
import com.avito.android.deep_linking.links.ProfileCreateExtendedLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import com.avito.android.passport.profile_add.create_flow.ExtendedProfileCreationResult;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.select_vertical.SelectVerticalArguments;
import ev.AbstractC40161a;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.r;
import rv.C47918a;
import sv.C48421d;
import vM0.InterfaceC49236c;

/* compiled from: ProfileCreateExtendedAsyncLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/b;", "Lev/a;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends AbstractC40161a<ProfileCreateExtendedLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.passport.profile_add.b f211341f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC49236c f211342g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f211343h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25719a f211344i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.b f211345j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final r60.d f211346k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f211347l = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ProfileCreateExtendedAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    /* compiled from: ProfileCreateExtendedAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.passport.profile_add.create_flow.b$b, reason: collision with other inner class name */
    public static final class C6315b<T> implements l41.g {
        public C6315b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c.b bVar;
            ExtendedProfileCreationResult extendedProfileCreationResult;
            C47918a c47918a = (C47918a) obj;
            if (c47918a.f437156b == -1) {
                Intent intent = c47918a.f437157c;
                if (intent != null) {
                    extendedProfileCreationResult = (ExtendedProfileCreationResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("PassportAddProfileActivity_result", ExtendedProfileCreationResult.class) : intent.getParcelableExtra("PassportAddProfileActivity_result"));
                } else {
                    extendedProfileCreationResult = null;
                }
                if (extendedProfileCreationResult instanceof ExtendedProfileCreationResult.OnlySelectVerticalAndSpecific) {
                    ExtendedProfileCreationResult.OnlySelectVerticalAndSpecific onlySelectVerticalAndSpecific = (ExtendedProfileCreationResult.OnlySelectVerticalAndSpecific) extendedProfileCreationResult;
                    bVar = new InterfaceC29684j.c(onlySelectVerticalAndSpecific.f211330b, onlySelectVerticalAndSpecific.f211332d, onlySelectVerticalAndSpecific.f211331c, onlySelectVerticalAndSpecific.f211333e, onlySelectVerticalAndSpecific.f211334f);
                } else if (extendedProfileCreationResult instanceof ExtendedProfileCreationResult.Success) {
                    ExtendedProfileCreationResult.Success success = (ExtendedProfileCreationResult.Success) extendedProfileCreationResult;
                    bVar = new InterfaceC29684j.b(success.f211336c, success.f211335b);
                } else {
                    if (extendedProfileCreationResult != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new InterfaceC29684j.b(null, false);
                }
            } else {
                bVar = InterfaceC29684j.a.f134005b;
            }
            b.this.j(bVar);
        }
    }

    @Inject
    public b(@k com.avito.android.passport.profile_add.b bVar, @k InterfaceC49236c interfaceC49236c, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a, @k a.b bVar2, @k r60.d dVar) {
        this.f211341f = bVar;
        this.f211342g = interfaceC49236c;
        this.f211343h = interfaceC4053a;
        this.f211344i = c25719a;
        this.f211345j = bVar2;
        this.f211346k = dVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ProfileCreateExtendedLink profileCreateExtendedLink = (ProfileCreateExtendedLink) deepLink;
        ProfileCreateExtendedLink.Flow flow = profileCreateExtendedLink.f133594b;
        boolean z12 = flow instanceof ProfileCreateExtendedLink.Flow.PassportMerge ? true : flow instanceof ProfileCreateExtendedLink.Flow.BusinessVrf;
        C25719a c25719a = this.f211344i;
        if (!z12) {
            if (flow instanceof ProfileCreateExtendedLink.Flow.PassportCreate ? true : flow instanceof ProfileCreateExtendedLink.Flow.ProfileUpgrade ? true : L.f(flow, ProfileCreateExtendedLink.Flow.BusinessRegistrationProfileUpgrade.f133597b)) {
                c25719a.a(profileCreateExtendedLink, this, AuthSource.f92686U, new com.avito.android.passport.profile_add.create_flow.a(this, profileCreateExtendedLink, bundle));
                return;
            }
            if (flow instanceof ProfileCreateExtendedLink.Flow.VerificationINN ? true : flow instanceof ProfileCreateExtendedLink.Flow.VerificationSberID ? true : flow instanceof ProfileCreateExtendedLink.Flow.VerificationTinkoffID ? true : flow instanceof ProfileCreateExtendedLink.Flow.VerificationAlfaID ? true : flow instanceof ProfileCreateExtendedLink.Flow.VerificationTochkaID) {
                this.f211343h.J(this.f211342g.b(profileCreateExtendedLink), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
                return;
            }
            return;
        }
        String str2 = this.f211346k.get();
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            c25719a.a(profileCreateExtendedLink, this, AuthSource.f92686U, new com.avito.android.passport.profile_add.create_flow.a(this, profileCreateExtendedLink, bundle));
        } else {
            k(profileCreateExtendedLink, bundle);
        }
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f211347l.b(this.f211345j.Q().N(new a()).t0(new C6315b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f211347l.e();
    }

    public final void k(ProfileCreateExtendedLink profileCreateExtendedLink, Bundle bundle) {
        Navigation navigation2;
        ProfileCreateExtendedFlow.f211169c.getClass();
        ProfileCreateExtendedFlow profileCreateExtendedFlowA = ProfileCreateExtendedFlow.a.a(profileCreateExtendedLink);
        if (bundle != null) {
            navigation2 = (Navigation.VerificationPopup) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("ReAgentShortFlowCreationArgsTag", Navigation.VerificationPopup.class) : bundle.getParcelable("ReAgentShortFlowCreationArgsTag"));
        } else {
            navigation2 = null;
        }
        Navigation selectVertical = new Navigation.SelectVertical(new SelectVerticalArguments(UUID.randomUUID().toString(), profileCreateExtendedFlowA, profileCreateExtendedLink.f133595c, profileCreateExtendedLink.f133596d, bundle != null ? Integer.valueOf(bundle.getInt("SelectedVerticalArgTag")) : null, bundle != null ? Integer.valueOf(bundle.getInt("SelectedSpecificArgTag")) : null));
        if (navigation2 != null) {
            selectVertical = navigation2;
        }
        this.f211343h.J(this.f211341f.a(selectVertical, navigation2 != null ? AnalyticScreen.f211210c : null), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }
}

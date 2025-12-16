package com.avito.android.wallet.page.mvi.component;

import PO0.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35787f0;
import com.avito.android.wallet.page.generated.api.get_wallet_service_info.ServiceInfoButton;
import com.avito.android.wallet.page.mvi.entity.WalletInfoUnavailableButtonAction;
import com.avito.android.wallet.page.mvi.entity.WalletPageState;
import com.avito.android.wallet.page.mvi.entity.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: WalletPageViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/mvi/component/q;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f328170a;

    /* compiled from: WalletPageViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f328171a;

        static {
            int[] iArr = new int[WalletPageState.ContentState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WalletPageState.ContentState contentState = WalletPageState.ContentState.f328193b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WalletPageState.ContentState contentState2 = WalletPageState.ContentState.f328193b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ServiceInfoButton.Action.values().length];
            try {
                iArr2[ServiceInfoButton.Action.Close.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ServiceInfoButton.Action.Refresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f328171a = iArr2;
        }
    }

    @Inject
    public q(@Y61.k x xVar) {
        this.f328170a = xVar;
    }

    public static ZO0.h a(PO0.e eVar) {
        if (eVar == null) {
            return null;
        }
        PO0.f localImage = eVar.getLocalImage();
        ZO0.j jVar = localImage != null ? new ZO0.j(localImage.getColor(), localImage.getName()) : null;
        ZO0.i iVar = new ZO0.i((int) eVar.getSize().getHeight(), (int) eVar.getSize().getWidth());
        PO0.h universalImage = eVar.getUniversalImage();
        return new ZO0.h(jVar, iVar, universalImage != null ? new ZO0.k(universalImage.getValue(), universalImage.getValueDark()) : null);
    }

    public static ZO0.a b(ServiceInfoButton serviceInfoButton) {
        WalletInfoUnavailableButtonAction walletInfoUnavailableButtonAction;
        if (serviceInfoButton == null) {
            return null;
        }
        String text = serviceInfoButton.getText();
        int i12 = a.f328171a[serviceInfoButton.getAction().ordinal()];
        if (i12 == 1) {
            walletInfoUnavailableButtonAction = WalletInfoUnavailableButtonAction.f328176b;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            walletInfoUnavailableButtonAction = WalletInfoUnavailableButtonAction.f328177c;
        }
        return new ZO0.a(text, walletInfoUnavailableButtonAction, serviceInfoButton.getStyle());
    }

    public static Color d(String str) {
        if (str == null) {
            return null;
        }
        if (C43066x.h0(str, "0x", false)) {
            str = C43066x.a0(str, "0x", "#", false);
        }
        Integer numA = C35787f0.a(str);
        if (numA != null) {
            return new Color(numA.intValue());
        }
        return null;
    }

    public final DeepLink c(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        DeepLink deepLinkB = this.f328170a.b(str);
        if (deepLinkB instanceof NoMatchLink) {
            return null;
        }
        return deepLinkB;
    }

    @Y61.k
    public final WalletPageState e(@Y61.k WalletPageState walletPageState) {
        com.avito.android.wallet.page.mvi.entity.a cVar;
        DeepLink deepLinkC;
        ZO0.f fVar;
        int iOrdinal = walletPageState.f328189b.ordinal();
        boolean z12 = walletPageState.f328190c;
        if (iOrdinal == 0) {
            cVar = new a.c(z12);
        } else if (iOrdinal == 1) {
            cVar = new a.b(z12);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            PO0.b bVar = walletPageState.f328192e;
            if (bVar instanceof b.a) {
                b.a aVar = (b.a) bVar;
                String title = aVar.getTitle();
                ZO0.d dVar = new ZO0.d(aVar.getBalance().getMoney(), aVar.getBalance().getMoneyTitle(), aVar.getBalance().getMoneyTextStyle());
                String bonuses = aVar.getBalance().getBonuses();
                ZO0.c cVar2 = bonuses != null ? new ZO0.c(bonuses, aVar.getBalance().getBonusesTitle(), aVar.getBalance().getBonusesTextStyle(), c(aVar.getBalance().getBonusesInfoLink())) : null;
                PO0.c primaryAction = aVar.getPrimaryAction();
                ZO0.l lVar = (primaryAction == null || (deepLinkC = c(primaryAction.getUri())) == null) ? null : new ZO0.l(primaryAction.getTitle(), deepLinkC);
                PO0.i promoBanner = aVar.getPromoBanner();
                if (promoBanner == null) {
                    fVar = null;
                } else {
                    AttributedText title2 = promoBanner.getTitle();
                    AttributedText subtitle = promoBanner.getSubtitle();
                    PO0.j action = promoBanner.getAction();
                    DeepLink deepLinkC2 = c(action != null ? action.getUri() : null);
                    ZO0.h hVarA = a(promoBanner.getLeftIcon());
                    ZO0.h hVarA2 = a(promoBanner.getRightIcon());
                    PO0.k backgroundColor = promoBanner.getBackgroundColor();
                    fVar = new ZO0.f(title2, subtitle, backgroundColor != null ? new ZO0.g(d(backgroundColor.getValue()), d(backgroundColor.getValueDark()), backgroundColor.getValueName()) : null, hVarA, hVarA2, deepLinkC2);
                }
                cVar = new a.C10178a(title, dVar, cVar2, lVar, fVar, walletPageState.f328190c);
            } else if (bVar instanceof b.C0846b) {
                b.C0846b c0846b = (b.C0846b) bVar;
                cVar = new a.d(c0846b.getTitle(), c0846b.getMessage(), b(c0846b.getFirstButton()), b(c0846b.getSecondButton()), walletPageState.f328190c);
            } else {
                if (bVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = new a.b(z12);
            }
        }
        return WalletPageState.a(walletPageState, null, false, cVar, null, 11);
    }
}

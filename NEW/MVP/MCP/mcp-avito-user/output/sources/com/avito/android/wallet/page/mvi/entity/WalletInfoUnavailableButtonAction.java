package com.avito.android.wallet.page.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WalletPageViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/WalletInfoUnavailableButtonAction;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletInfoUnavailableButtonAction {

    /* renamed from: b, reason: collision with root package name */
    public static final WalletInfoUnavailableButtonAction f328176b;

    /* renamed from: c, reason: collision with root package name */
    public static final WalletInfoUnavailableButtonAction f328177c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ WalletInfoUnavailableButtonAction[] f328178d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f328179e;

    static {
        WalletInfoUnavailableButtonAction walletInfoUnavailableButtonAction = new WalletInfoUnavailableButtonAction("CLOSE", 0);
        f328176b = walletInfoUnavailableButtonAction;
        WalletInfoUnavailableButtonAction walletInfoUnavailableButtonAction2 = new WalletInfoUnavailableButtonAction("REFRESH", 1);
        f328177c = walletInfoUnavailableButtonAction2;
        WalletInfoUnavailableButtonAction[] walletInfoUnavailableButtonActionArr = {walletInfoUnavailableButtonAction, walletInfoUnavailableButtonAction2};
        f328178d = walletInfoUnavailableButtonActionArr;
        f328179e = c.a(walletInfoUnavailableButtonActionArr);
    }

    public WalletInfoUnavailableButtonAction() {
        throw null;
    }

    public static WalletInfoUnavailableButtonAction valueOf(String str) {
        return (WalletInfoUnavailableButtonAction) Enum.valueOf(WalletInfoUnavailableButtonAction.class, str);
    }

    public static WalletInfoUnavailableButtonAction[] values() {
        return (WalletInfoUnavailableButtonAction[]) f328178d.clone();
    }
}

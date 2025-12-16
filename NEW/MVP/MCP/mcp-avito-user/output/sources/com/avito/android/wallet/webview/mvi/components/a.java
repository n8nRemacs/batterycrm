package com.avito.android.wallet.webview.mvi.components;

import com.avito.android.arch.mvi.a;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.wallet.webview.mvi.entity.WalletWebViewInternalAction;
import com.avito.android.wallet.webview.mvi.entity.WalletWebViewState;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import xP0.InterfaceC49873a;

/* compiled from: WalletWebViewActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/webview/mvi/components/a;", "Lcom/avito/android/arch/mvi/a;", "LxP0/a;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewState;", "a", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC49873a, WalletWebViewInternalAction, WalletWebViewState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f329413a;

    /* compiled from: WalletWebViewActor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0081T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/wallet/webview/mvi/components/a$a;", "", "<init>", "()V", "", "ACTUAL_LOADING_PROGRESS_RATIO", "D", "", "ENOUGH_LOADING_PROGRESS_PERCENTAGE", "I", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.webview.mvi.components.a$a, reason: collision with other inner class name */
    public static final class C10232a {
        public /* synthetic */ C10232a(C42822w c42822w) {
            this();
        }

        public C10232a() {
        }
    }

    /* compiled from: WalletWebViewActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PowerWebViewStateChangeEvent.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PowerWebViewStateChangeEvent.State state = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PowerWebViewStateChangeEvent.State state2 = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PowerWebViewStateChangeEvent.State state3 = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        new C10232a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f329413a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<WalletWebViewInternalAction> b(InterfaceC49873a interfaceC49873a, WalletWebViewState walletWebViewState) {
        Object updateLoadingProgress;
        InterfaceC49873a interfaceC49873a2 = interfaceC49873a;
        if (interfaceC49873a2 instanceof InterfaceC49873a.C12869a) {
            return new C43210w(WalletWebViewInternalAction.ShowCancellationDialog.f329429b);
        }
        if (interfaceC49873a2 instanceof InterfaceC49873a.c) {
            return new C43210w(new WalletWebViewInternalAction.ShowError(0));
        }
        if (interfaceC49873a2 instanceof InterfaceC49873a.d) {
            b.a.a(this.f329413a, ((InterfaceC49873a.d) interfaceC49873a2).f442462a, null, null, 6);
            return C43175k.w();
        }
        if (interfaceC49873a2 instanceof InterfaceC49873a.e) {
            return new C43210w(WalletWebViewInternalAction.Retry.f329428b);
        }
        if (!(interfaceC49873a2 instanceof InterfaceC49873a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        PowerWebViewStateChangeEvent powerWebViewStateChangeEvent = ((InterfaceC49873a.b) interfaceC49873a2).f442460a;
        int iOrdinal = powerWebViewStateChangeEvent.f392937a.ordinal();
        if (iOrdinal == 0) {
            updateLoadingProgress = new WalletWebViewInternalAction.UpdateLoadingProgress(0);
        } else if (iOrdinal != 1) {
            int i12 = powerWebViewStateChangeEvent.f392938b;
            if (iOrdinal == 2) {
                updateLoadingProgress = i12 < 80 ? new WalletWebViewInternalAction.UpdateLoadingProgress((int) (i12 * 1.25d)) : WalletWebViewInternalAction.ShowContent.f329430b;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                updateLoadingProgress = new WalletWebViewInternalAction.ShowError(i12);
            }
        } else {
            updateLoadingProgress = WalletWebViewInternalAction.ShowContent.f329430b;
        }
        return new C43210w(updateLoadingProgress);
    }
}

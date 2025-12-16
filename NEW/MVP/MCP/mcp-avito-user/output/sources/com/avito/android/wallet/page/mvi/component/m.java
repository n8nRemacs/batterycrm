package com.avito.android.wallet.page.mvi.component;

import com.avito.android.arch.mvi.t;
import com.avito.android.wallet.page.generated.api.get_wallet_service_info.ServiceInfoToastData;
import com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WalletPageOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/page/mvi/component/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "LZO0/e;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements t<WalletPageInternalAction, ZO0.e> {

    /* compiled from: WalletPageOneTimeEventProducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f328166a;

        static {
            int[] iArr = new int[ServiceInfoToastData.ToastType.values().length];
            try {
                iArr[ServiceInfoToastData.ToastType.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServiceInfoToastData.ToastType.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f328166a = iArr;
        }
    }

    @Inject
    public m() {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    @Override // com.avito.android.arch.mvi.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ZO0.e b(com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction r4) {
        /*
            r3 = this;
            com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction r4 = (com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction) r4
            boolean r0 = r4 instanceof com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction.Close
            if (r0 == 0) goto L9
            ZO0.e$a r4 = ZO0.e.a.f20133a
            goto L68
        L9:
            boolean r0 = r4 instanceof com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction.StartActivity
            if (r0 == 0) goto L18
            ZO0.e$c r0 = new ZO0.e$c
            com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction$StartActivity r4 = (com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction.StartActivity) r4
            android.content.Intent r4 = r4.f328185b
            r0.<init>(r4)
        L16:
            r4 = r0
            goto L68
        L18:
            boolean r0 = r4 instanceof com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction.StartActivityForResult
            if (r0 == 0) goto L26
            ZO0.e$d r0 = new ZO0.e$d
            com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction$StartActivityForResult r4 = (com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction.StartActivityForResult) r4
            android.content.Intent r4 = r4.f328186b
            r0.<init>(r4)
            goto L16
        L26:
            boolean r0 = r4 instanceof com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction.ShowToast
            r1 = 0
            if (r0 == 0) goto L67
            ZO0.e$b r0 = new ZO0.e$b
            com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction$ShowToast r4 = (com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction.ShowToast) r4
            com.avito.android.wallet.page.generated.api.get_wallet_service_info.ServiceInfoToastData r4 = r4.f328184b
            if (r4 == 0) goto L37
            com.avito.android.remote.model.text.AttributedText r1 = r4.getToastText()
        L37:
            if (r4 == 0) goto L61
            com.avito.android.wallet.page.generated.api.get_wallet_service_info.ServiceInfoToastData$ToastType r4 = r4.getToastType()
            if (r4 == 0) goto L61
            int[] r2 = com.avito.android.wallet.page.mvi.component.m.a.f328166a
            int r4 = r4.ordinal()
            r4 = r2[r4]
            r2 = 1
            if (r4 == r2) goto L5d
            r2 = 2
            if (r4 != r2) goto L57
            com.avito.android.component.toast.f$c$a r4 = com.avito.android.component.toast.f.c.f125255c
            r4.getClass()
            com.avito.android.component.toast.f$c r4 = com.avito.android.component.toast.f.c.a.b()
            goto L5f
        L57:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L5d:
            com.avito.android.component.toast.f$a r4 = com.avito.android.component.toast.f.a.f125253a
        L5f:
            if (r4 != 0) goto L63
        L61:
            com.avito.android.component.toast.f$a r4 = com.avito.android.component.toast.f.a.f125253a
        L63:
            r0.<init>(r1, r4)
            goto L16
        L67:
            r4 = r1
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.page.mvi.component.m.b(java.lang.Object):java.lang.Object");
    }
}

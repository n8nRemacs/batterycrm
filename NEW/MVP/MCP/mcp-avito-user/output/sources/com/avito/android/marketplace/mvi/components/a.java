package com.avito.android.marketplace.mvi.components;

import com.avito.android.arch.mvi.a;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.marketplace.mvi.entity.FinanceMarketplaceInternalAction;
import com.avito.android.marketplace.mvi.entity.FinanceMarketplaceState;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mY.InterfaceC44028a;

/* compiled from: FinanceMarketplaceActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/marketplace/mvi/components/a;", "Lcom/avito/android/arch/mvi/a;", "LmY/a;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceState;", "a", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC44028a, FinanceMarketplaceInternalAction, FinanceMarketplaceState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f185928a;

    /* compiled from: FinanceMarketplaceActor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0081T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/marketplace/mvi/components/a$a;", "", "<init>", "()V", "", "ACTUAL_LOADING_PROGRESS_RATIO", "D", "", "ENOUGH_LOADING_PROGRESS_PERCENTAGE", "I", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.marketplace.mvi.components.a$a, reason: collision with other inner class name */
    public static final class C5454a {
        public /* synthetic */ C5454a(C42822w c42822w) {
            this();
        }

        public C5454a() {
        }
    }

    /* compiled from: FinanceMarketplaceActor.kt */
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
        new C5454a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f185928a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<FinanceMarketplaceInternalAction> b(InterfaceC44028a interfaceC44028a, FinanceMarketplaceState financeMarketplaceState) {
        C43210w c43210w;
        Object updateLoadingProgress;
        InterfaceC44028a interfaceC44028a2 = interfaceC44028a;
        if (interfaceC44028a2 instanceof InterfaceC44028a.C11831a) {
            return new C43210w(FinanceMarketplaceInternalAction.ShowCancellationDialog.f185942b);
        }
        if (interfaceC44028a2 instanceof InterfaceC44028a.e) {
            return new C43210w(new FinanceMarketplaceInternalAction.ShowError(0));
        }
        if (interfaceC44028a2 instanceof InterfaceC44028a.g) {
            b.a.a(this.f185928a, ((InterfaceC44028a.g) interfaceC44028a2).f414565a, null, null, 6);
            return C43175k.w();
        }
        if (interfaceC44028a2 instanceof InterfaceC44028a.h) {
            return new C43210w(FinanceMarketplaceInternalAction.LoadUrl.f185941b);
        }
        if (interfaceC44028a2 instanceof InterfaceC44028a.b) {
            PowerWebViewStateChangeEvent powerWebViewStateChangeEvent = ((InterfaceC44028a.b) interfaceC44028a2).f414560a;
            int iOrdinal = powerWebViewStateChangeEvent.f392937a.ordinal();
            if (iOrdinal == 0) {
                updateLoadingProgress = new FinanceMarketplaceInternalAction.UpdateLoadingProgress(0);
            } else if (iOrdinal != 1) {
                int i12 = powerWebViewStateChangeEvent.f392938b;
                if (iOrdinal == 2) {
                    updateLoadingProgress = i12 < 80 ? new FinanceMarketplaceInternalAction.UpdateLoadingProgress((int) (i12 * 1.25d)) : FinanceMarketplaceInternalAction.ShowContent.f185943b;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    updateLoadingProgress = new FinanceMarketplaceInternalAction.ShowError(i12);
                }
            } else {
                updateLoadingProgress = FinanceMarketplaceInternalAction.ShowContent.f185943b;
            }
            c43210w = new C43210w(updateLoadingProgress);
        } else if (interfaceC44028a2 instanceof InterfaceC44028a.f) {
            c43210w = new C43210w(new FinanceMarketplaceInternalAction.TryToOpenCamera(((InterfaceC44028a.f) interfaceC44028a2).f414564a));
        } else {
            if (!(interfaceC44028a2 instanceof InterfaceC44028a.c)) {
                if (interfaceC44028a2 instanceof InterfaceC44028a.d) {
                    return new C43210w(FinanceMarketplaceInternalAction.ShowPermissionToast.f185945b);
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new FinanceMarketplaceInternalAction.TryToOpenCamera(((InterfaceC44028a.c) interfaceC44028a2).f414561a));
        }
        return c43210w;
    }
}

package com.avito.android.auto_contacts.presentation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import ze.InterfaceC50552b;

/* compiled from: AutoContactsPackagesOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction;", "Lze/b;", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements t<AutoContactsPackagesInternalAction, InterfaceC50552b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC50552b b(AutoContactsPackagesInternalAction autoContactsPackagesInternalAction) {
        AutoContactsPackagesInternalAction autoContactsPackagesInternalAction2 = autoContactsPackagesInternalAction;
        if (autoContactsPackagesInternalAction2 instanceof AutoContactsPackagesInternalAction.BuyMoreButtonClicked) {
            return new InterfaceC50552b.a(((AutoContactsPackagesInternalAction.BuyMoreButtonClicked) autoContactsPackagesInternalAction2).f94950b);
        }
        if (autoContactsPackagesInternalAction2 instanceof AutoContactsPackagesInternalAction.BackArrowClicked) {
            return InterfaceC50552b.C12960b.f444108a;
        }
        return null;
    }
}

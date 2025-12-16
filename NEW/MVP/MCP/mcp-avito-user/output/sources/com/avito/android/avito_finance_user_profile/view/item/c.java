package com.avito.android.avito_finance_user_profile.view.item;

import com.avito.android.avito_finance_user_profile.view.item.g;
import com.avito.android.avito_finance_user_profile.view.model.AvitoFinanceAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoFinanceBlockItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/item/c;", "Lcom/avito/android/avito_finance_user_profile/view/item/b;", "<init>", "()V", "a", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements b {

    /* compiled from: AvitoFinanceBlockItemConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/item/c$a;", "", "<init>", "()V", "", "AVITO_FINANCE_DEFAULT_BLOCK_ID", "Ljava/lang/String;", "AVITO_FINANCE_DEFAULT_BLOCK_TITLE", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c() {
    }

    public static g a(AvitoFinanceAction avitoFinanceAction) {
        if (avitoFinanceAction instanceof AvitoFinanceAction.OpenDeeplink) {
            return new g.a(((AvitoFinanceAction.OpenDeeplink) avitoFinanceAction).f98014b);
        }
        if (!(avitoFinanceAction instanceof AvitoFinanceAction.SendEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        AvitoFinanceAction.SendEvent sendEvent = (AvitoFinanceAction.SendEvent) avitoFinanceAction;
        return new g.b(sendEvent.f98015b, sendEvent.f98016c, sendEvent.f98017d, sendEvent.f98018e);
    }
}

package com.avito.android.authorization.confirm_3fa.mvi;

import com.avito.android.authorization.confirm_3fa.mvi.entity.ConfirmEmailListInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConfirmEmailListInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "message", "", "invoke", "(Ljava/lang/String;)Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class m extends N implements Y41.l<String, ConfirmEmailListInternalAction> {

    /* renamed from: l, reason: collision with root package name */
    public static final m f93622l = new m();

    public m() {
        super(1);
    }

    @Override // Y41.l
    public final ConfirmEmailListInternalAction invoke(String str) {
        return new ConfirmEmailListInternalAction.ShowErrorToast(com.avito.android.printable_text.b.f(str));
    }
}

package com.avito.android.deal_confirmation;

import com.avito.android.remote.model.DealConfirmationSheet;
import com.avito.android.remote.model.DealConfirmationSheetInfoResult;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.M;
import kotlin.Metadata;
import l41.o;

/* compiled from: DealConfirmationPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/DealConfirmationSheetInfoResult;", "result", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Lcom/avito/android/remote/model/DealConfirmationSheetInfoResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f132757b;

    public e(h hVar) {
        this.f132757b = hVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        M mQ2;
        DealConfirmationSheet bottomSheet = ((DealConfirmationSheetInfoResult) obj).getBottomSheet();
        if (bottomSheet != null) {
            k kVar = this.f132757b.f132766e;
            if (kVar != null) {
                kVar.l(bottomSheet);
            }
            mQ2 = I.q(Boolean.TRUE);
        } else {
            mQ2 = null;
        }
        return mQ2 == null ? I.q(Boolean.FALSE) : mQ2;
    }
}

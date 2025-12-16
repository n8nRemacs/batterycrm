package com.avito.android.select.new_districts.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictInternalAction;
import eq0.InterfaceC40147b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FilterSelectDistrictOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction;", "Leq0/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements t<SelectDistrictInternalAction, InterfaceC40147b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40147b b(SelectDistrictInternalAction selectDistrictInternalAction) {
        SelectDistrictInternalAction selectDistrictInternalAction2 = selectDistrictInternalAction;
        if (selectDistrictInternalAction2 instanceof SelectDistrictInternalAction.Confirm) {
            return new InterfaceC40147b.a(((SelectDistrictInternalAction.Confirm) selectDistrictInternalAction2).f265806b);
        }
        if (selectDistrictInternalAction2.equals(SelectDistrictInternalAction.GoBack.f265810b)) {
            return InterfaceC40147b.C11106b.f395394a;
        }
        return null;
    }
}

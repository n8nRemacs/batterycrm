package com.avito.android.select.new_districts.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.select.new_districts.SelectDistrictParams;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FilterSelectDistrictBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.arch.mvi.b<SelectDistrictInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SelectDistrictParams f265798a;

    @Inject
    public c(@Y61.k SelectDistrictParams selectDistrictParams) {
        this.f265798a = selectDistrictParams;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SelectDistrictInternalAction> a() {
        return new C43210w(new SelectDistrictInternalAction.InitScreen(this.f265798a));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

package com.avito.android.mortgage_category.factory;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.mortgage_category.MortgageCategoryFragment;
import com.avito.android.mortgage_category.model.MortgageCategoryArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import zN0.InterfaceC50490a;

/* compiled from: MortgageCategoryFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_category/factory/a;", "LzN0/b;", "<init>", "()V", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC50490a
@C11.a
/* loaded from: classes15.dex */
public final class a implements zN0.b {
    @Inject
    public a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zN0.b
    @k
    public final Fragment a(@k String str) {
        MortgageCategoryFragment.a aVar = MortgageCategoryFragment.f204856s0;
        MortgageCategoryArguments mortgageCategoryArguments = new MortgageCategoryArguments(str, null, 2, 0 == true ? 1 : 0);
        aVar.getClass();
        return MortgageCategoryFragment.a.a(mortgageCategoryArguments);
    }
}

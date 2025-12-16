package com.avito.android.iac_problems.impl_module.problems_bottom_sheet;

import android.app.Activity;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35845m2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IacProblemRouter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/f;", "Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/e;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f168895a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Activity f168896b;

    @Inject
    public f(@Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k Activity activity) {
        this.f168895a = interfaceC35845m2;
        this.f168896b = activity;
    }

    @Override // com.avito.android.iac_problems.impl_module.problems_bottom_sheet.e
    public final void a() {
        this.f168896b.startActivity(this.f168895a.h());
    }

    @Override // com.avito.android.iac_problems.impl_module.problems_bottom_sheet.e
    public final void b() {
        this.f168896b.startActivity(this.f168895a.h());
    }

    @Override // com.avito.android.iac_problems.impl_module.problems_bottom_sheet.e
    public final void c() {
        this.f168896b.startActivity(this.f168895a.a().addFlags(268435456));
    }
}

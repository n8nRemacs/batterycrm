package com.avito.android.categories_global.mvi;

import Kn.C14332b;
import Kn.InterfaceC14331a;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.categories_global.mvi.entity.CategoriesInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CategoriesBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/categories_global/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.arch.mvi.b<CategoriesInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f116407a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C14332b f116408b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14331a f116409c;

    @Inject
    public c(boolean z12, @Y61.k C14332b c14332b, @Y61.k InterfaceC14331a interfaceC14331a) {
        this.f116407a = z12;
        this.f116408b = c14332b;
        this.f116409c = interfaceC14331a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CategoriesInternalAction> a() {
        if (this.f116407a) {
            return C43175k.w();
        }
        C14332b c14332b = this.f116408b;
        return this.f116409c.a(c14332b.f9652b, c14332b.f9651a);
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

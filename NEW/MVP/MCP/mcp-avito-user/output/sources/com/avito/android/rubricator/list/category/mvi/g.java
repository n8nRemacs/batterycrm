package com.avito.android.rubricator.list.category.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import vn0.InterfaceC49357b;
import vn0.InterfaceC49358c;

/* compiled from: CategoryListOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rubricator/list/category/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lvn0/b;", "Lvn0/c;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements t<InterfaceC49357b, InterfaceC49358c> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49358c b(InterfaceC49357b interfaceC49357b) {
        InterfaceC49357b interfaceC49357b2 = interfaceC49357b;
        if (interfaceC49357b2 instanceof InterfaceC49357b.d) {
            return InterfaceC49358c.C12790c.f440959a;
        }
        if (interfaceC49357b2 instanceof InterfaceC49357b.a) {
            return InterfaceC49358c.a.f440957a;
        }
        if (interfaceC49357b2 instanceof InterfaceC49357b.c) {
            return new InterfaceC49358c.b(((InterfaceC49357b.c) interfaceC49357b2).f440953a);
        }
        return null;
    }
}

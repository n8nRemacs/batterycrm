package com.avito.android.publish.screen.wrongcategory.mvi;

import Qe0.InterfaceC14888b;
import Qe0.InterfaceC14889c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WrongCategoryOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/wrongcategory/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "LQe0/b;", "LQe0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements t<InterfaceC14888b, InterfaceC14889c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14889c b(InterfaceC14888b interfaceC14888b) {
        InterfaceC14888b interfaceC14888b2 = interfaceC14888b;
        if (interfaceC14888b2 instanceof InterfaceC14888b.a) {
            return new InterfaceC14889c.a(((InterfaceC14888b.a) interfaceC14888b2).f13952a);
        }
        if (interfaceC14888b2.equals(InterfaceC14888b.c.f13954a)) {
            return InterfaceC14889c.b.f13961a;
        }
        if (interfaceC14888b2.equals(InterfaceC14888b.e.f13959a)) {
            return InterfaceC14889c.C0922c.f13962a;
        }
        if (interfaceC14888b2 instanceof InterfaceC14888b.d ? true : interfaceC14888b2 instanceof InterfaceC14888b.C0921b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}

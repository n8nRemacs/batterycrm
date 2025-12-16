package com.avito.android.extended_profile_universal_widget_edit.edit_block.mvi;

import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kB.InterfaceC42562b;
import kB.InterfaceC42563c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UniversalWidgetEditBlockOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "LkB/b;", "LkB/c;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements t<InterfaceC42562b, InterfaceC42563c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42563c b(InterfaceC42562b interfaceC42562b) {
        InterfaceC42562b interfaceC42562b2 = interfaceC42562b;
        if (interfaceC42562b2 instanceof InterfaceC42562b.a) {
            return new InterfaceC42563c.a(((InterfaceC42562b.a) interfaceC42562b2).f406161a);
        }
        if (interfaceC42562b2 instanceof InterfaceC42562b.f) {
            return new InterfaceC42563c.C11609c(((InterfaceC42562b.f) interfaceC42562b2).f406168a);
        }
        if (interfaceC42562b2 instanceof InterfaceC42562b.e) {
            return new InterfaceC42563c.b(((InterfaceC42562b.e) interfaceC42562b2).f406167a);
        }
        if (interfaceC42562b2 instanceof InterfaceC42562b.d ? true : interfaceC42562b2 instanceof InterfaceC42562b.C11608b ? true : interfaceC42562b2 instanceof InterfaceC42562b.i ? true : interfaceC42562b2 instanceof InterfaceC42562b.g ? true : interfaceC42562b2 instanceof InterfaceC42562b.h ? true : interfaceC42562b2 instanceof InterfaceC42562b.c) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}

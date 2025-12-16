package com.avito.android.extended_profile_universal_widget_edit.edit.mvi;

import com.avito.android.arch.mvi.t;
import jB.InterfaceC42228b;
import jB.InterfaceC42229c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UniversalWidgetEditOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "LjB/b;", "LjB/c;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements t<InterfaceC42228b, InterfaceC42229c> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42229c b(InterfaceC42228b interfaceC42228b) {
        InterfaceC42228b interfaceC42228b2 = interfaceC42228b;
        if (interfaceC42228b2 instanceof InterfaceC42228b.n) {
            InterfaceC42228b.n nVar = (InterfaceC42228b.n) interfaceC42228b2;
            return new InterfaceC42229c.e(nVar.f405485a, nVar.f405486b);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.l) {
            InterfaceC42228b.l lVar = (InterfaceC42228b.l) interfaceC42228b2;
            return new InterfaceC42229c.e(lVar.f405482a, lVar.f405483b);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.C11551b) {
            InterfaceC42228b.C11551b c11551b = (InterfaceC42228b.C11551b) interfaceC42228b2;
            return new InterfaceC42229c.e(c11551b.f405472a, c11551b.f405473b);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.m ? true : interfaceC42228b2 instanceof InterfaceC42228b.o) {
            return new InterfaceC42229c.b(true);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.j) {
            return new InterfaceC42229c.C11552c(((InterfaceC42228b.j) interfaceC42228b2).f405480a);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.d) {
            return new InterfaceC42229c.b(false);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.f) {
            return new InterfaceC42229c.f();
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.a) {
            return new InterfaceC42229c.a(((InterfaceC42228b.a) interfaceC42228b2).f405471a);
        }
        if (!(interfaceC42228b2 instanceof InterfaceC42228b.e)) {
            if (!(interfaceC42228b2 instanceof InterfaceC42228b.s ? true : interfaceC42228b2 instanceof InterfaceC42228b.t ? true : interfaceC42228b2 instanceof InterfaceC42228b.r ? true : interfaceC42228b2 instanceof InterfaceC42228b.c ? true : interfaceC42228b2 instanceof InterfaceC42228b.g ? true : interfaceC42228b2 instanceof InterfaceC42228b.i ? true : interfaceC42228b2 instanceof InterfaceC42228b.q ? true : interfaceC42228b2 instanceof InterfaceC42228b.k ? true : interfaceC42228b2 instanceof InterfaceC42228b.u ? true : interfaceC42228b2 instanceof InterfaceC42228b.p ? true : interfaceC42228b2 instanceof InterfaceC42228b.h)) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (((InterfaceC42228b.e) interfaceC42228b2).f405476a) {
            return InterfaceC42229c.d.f405498a;
        }
        return null;
    }
}

package com.avito.android.virtual_deal_room_reference_category.client_add.mvi;

import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import rO0.InterfaceC47578b;
import rO0.InterfaceC47579c;

/* compiled from: ClientAddOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/client_add/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "LrO0/b;", "LrO0/c;", "<init>", "()V", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements t<InterfaceC47578b, InterfaceC47579c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47579c b(InterfaceC47578b interfaceC47578b) {
        InterfaceC47579c dVar;
        InterfaceC47578b interfaceC47578b2 = interfaceC47578b;
        if (interfaceC47578b2 instanceof InterfaceC47578b.a) {
            return InterfaceC47579c.b.f429795a;
        }
        if (interfaceC47578b2 instanceof InterfaceC47578b.i) {
            dVar = new InterfaceC47579c.a(((InterfaceC47578b.i) interfaceC47578b2).f429790a);
        } else {
            if (interfaceC47578b2 instanceof InterfaceC47578b.e) {
                return new InterfaceC47579c.e(null);
            }
            if (interfaceC47578b2 instanceof InterfaceC47578b.l) {
                return new InterfaceC47579c.g(null);
            }
            if (interfaceC47578b2 instanceof InterfaceC47578b.c) {
                return new InterfaceC47579c.C12374c(null);
            }
            if (interfaceC47578b2 instanceof InterfaceC47578b.g) {
                return new InterfaceC47579c.f(null);
            }
            if (interfaceC47578b2 instanceof InterfaceC47578b.d) {
                dVar = new InterfaceC47579c.e(((InterfaceC47578b.d) interfaceC47578b2).f429785a);
            } else if (interfaceC47578b2 instanceof InterfaceC47578b.k) {
                dVar = new InterfaceC47579c.g(((InterfaceC47578b.k) interfaceC47578b2).f429792a);
            } else if (interfaceC47578b2 instanceof InterfaceC47578b.f) {
                dVar = new InterfaceC47579c.f(((InterfaceC47578b.f) interfaceC47578b2).f429787a);
            } else if (interfaceC47578b2 instanceof InterfaceC47578b.C12373b) {
                dVar = new InterfaceC47579c.C12374c(((InterfaceC47578b.C12373b) interfaceC47578b2).f429783a);
            } else {
                if (!(interfaceC47578b2 instanceof InterfaceC47578b.h)) {
                    return null;
                }
                dVar = new InterfaceC47579c.d(com.avito.android.printable_text.b.c(R.string.virtual_deal_room_reference_category_unknown_error, new Serializable[0]));
            }
        }
        return dVar;
    }
}

package com.avito.android.sbc.autodispatches.mvi;

import Po0.InterfaceC14818b;
import Po0.InterfaceC14819c;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.sbc.autodispatches.SbcDispatchEditResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SbcAutoDispatchOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/autodispatches/mvi/a;", "Lcom/avito/android/arch/mvi/t;", "LPo0/c;", "LPo0/b;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements t<InterfaceC14819c, InterfaceC14818b> {

    /* compiled from: SbcAutoDispatchOneTimeEventProducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sbc.autodispatches.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C7778a {
        static {
            int[] iArr = new int[SbcDispatchEditResult.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SbcDispatchEditResult sbcDispatchEditResult = SbcDispatchEditResult.f258839b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SbcDispatchEditResult sbcDispatchEditResult2 = SbcDispatchEditResult.f258839b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14818b b(InterfaceC14819c interfaceC14819c) {
        int i12;
        InterfaceC14819c interfaceC14819c2 = interfaceC14819c;
        if (interfaceC14819c2 instanceof InterfaceC14819c.f) {
            return new InterfaceC14818b.a(((InterfaceC14819c.f) interfaceC14819c2).f13293a);
        }
        if (!(interfaceC14819c2 instanceof InterfaceC14819c.g)) {
            return null;
        }
        int iOrdinal = ((InterfaceC14819c.g) interfaceC14819c2).f13294a.ordinal();
        if (iOrdinal == 0) {
            i12 = R.string.sbc_dispatch_edit_result_single_item_removed_from_dispatch;
        } else if (iOrdinal == 1) {
            i12 = R.string.sbc_dispatch_edit_result_several_items_removed_from_dispatch;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.string.sbc_dispatch_edit_result_dispatch_finished;
        }
        return new InterfaceC14818b.C0865b(i12);
    }
}

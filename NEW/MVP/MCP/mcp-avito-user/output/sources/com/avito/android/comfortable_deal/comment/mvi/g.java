package com.avito.android.comfortable_deal.comment.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import mp.InterfaceC44114b;
import mp.InterfaceC44115c;

/* compiled from: CommentOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/comment/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lmp/b;", "Lmp/c;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements t<InterfaceC44114b, InterfaceC44115c> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC44115c b(InterfaceC44114b interfaceC44114b) {
        InterfaceC44114b interfaceC44114b2 = interfaceC44114b;
        if (interfaceC44114b2 instanceof InterfaceC44114b.a) {
            return new InterfaceC44115c.a(((InterfaceC44114b.a) interfaceC44114b2).f414751a);
        }
        if (interfaceC44114b2 instanceof InterfaceC44114b.d) {
            return new InterfaceC44115c.a(((InterfaceC44114b.d) interfaceC44114b2).f414754a);
        }
        if (!(interfaceC44114b2 instanceof InterfaceC44114b.C11843b)) {
            return null;
        }
        String message = ((InterfaceC44114b.C11843b) interfaceC44114b2).f414752a.getMessage();
        String str = message.length() > 0 ? message : null;
        return new InterfaceC44115c.b(str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.printable_text.b.c(R.string.comfortable_deal_common_error, new Serializable[0]));
    }
}

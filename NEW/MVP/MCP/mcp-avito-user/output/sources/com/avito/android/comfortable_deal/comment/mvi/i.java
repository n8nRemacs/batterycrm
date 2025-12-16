package com.avito.android.comfortable_deal.comment.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import mp.C44116d;
import mp.InterfaceC44114b;

/* compiled from: CommentReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/comment/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "Lmp/b;", "Lmp/d;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements u<InterfaceC44114b, C44116d> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C44116d a(InterfaceC44114b interfaceC44114b, C44116d c44116d) {
        InterfaceC44114b interfaceC44114b2 = interfaceC44114b;
        C44116d c44116d2 = c44116d;
        return interfaceC44114b2 instanceof InterfaceC44114b.e ? C44116d.a(c44116d2, false, ((InterfaceC44114b.e) interfaceC44114b2).f414755a, 3) : interfaceC44114b2 instanceof InterfaceC44114b.c ? C44116d.a(c44116d2, true, null, 6) : interfaceC44114b2 instanceof InterfaceC44114b.d ? C44116d.a(c44116d2, false, null, 6) : interfaceC44114b2 instanceof InterfaceC44114b.C11843b ? C44116d.a(c44116d2, false, null, 6) : c44116d2;
    }
}

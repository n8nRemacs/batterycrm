package com.avito.android.messenger.conversation.mvi.messages;

import androidx.compose.runtime.J3;
import androidx.compose.runtime.Y1;
import androidx.compose.ui.platform.ComposeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MessageListView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class o0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q0 f193046l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ComposeView f193047m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ComposeView composeView, q0 q0Var) {
        super(2);
        this.f193046l = q0Var;
        this.f193047m = composeView;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            J3 j32 = com.avito.android.messenger.conversation.mvi.messages.utils.u.f193642a;
            q0 q0Var = this.f193046l;
            androidx.compose.runtime.S.b(new Y1[]{j32.b(q0Var.f193107e), com.avito.android.messenger.conversation.mvi.messages.utils.g.f193584a.b(q0Var.f193108f)}, androidx.compose.runtime.internal.r.c(191841126, new n0(this.f193047m, q0Var), a13), a13, 56);
        }
        return G0.f406611a;
    }
}

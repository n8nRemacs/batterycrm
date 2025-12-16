package com.avito.android.messenger.conversation.mvi.messages;

import androidx.compose.ui.platform.ComposeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MessageListView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class p0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q0 f193051l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ComposeView f193052m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ComposeView composeView, q0 q0Var) {
        super(2);
        this.f193051l = q0Var;
        this.f193052m = composeView;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-964247898, new o0(this.f193052m, this.f193051l), a13), a13, 48, 1);
        }
        return G0.f406611a;
    }
}

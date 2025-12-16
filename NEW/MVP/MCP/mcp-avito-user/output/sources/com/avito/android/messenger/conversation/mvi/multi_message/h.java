package com.avito.android.messenger.conversation.mvi.multi_message;

import androidx.compose.runtime.A;
import com.avito.android.messenger.conversation.mvi.multi_message.m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiMessageBannerView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m.b f193698l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f193699m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m.b bVar, i iVar) {
        super(2);
        this.f193698l = bVar;
        this.f193699m = iVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-736057418, new g(this.f193698l, this.f193699m), a13), a13, 48, 1);
        }
        return G0.f406611a;
    }
}

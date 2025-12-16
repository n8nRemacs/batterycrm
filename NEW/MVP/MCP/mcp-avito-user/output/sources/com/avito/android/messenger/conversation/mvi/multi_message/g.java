package com.avito.android.messenger.conversation.mvi.multi_message;

import androidx.compose.runtime.A;
import com.avito.android.messenger.conversation.mvi.multi_message.m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiMessageBannerView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m.b f193696l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f193697m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m.b bVar, i iVar) {
        super(2);
        this.f193696l = bVar;
        this.f193697m = iVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            m.b.C5728b c5728b = (m.b.C5728b) this.f193696l;
            i iVar = this.f193697m;
            com.avito.android.messenger.conversation.mvi.multi_message.composable.d.d(c5728b.f193717a, new e(iVar), new f(iVar), null, a13, 8, 8);
        }
        return G0.f406611a;
    }
}

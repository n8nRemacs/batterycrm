package com.avito.android.messenger.conversation.mvi.messages.composables;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.MessageListScrollEvent;
import com.avito.android.messenger.conversation.mvi.messages.f0;
import com.avito.android.messenger.conversation.mvi.messages.g0;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MessageList.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<T1> f192206l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<h0, G0> f192207m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<f0, G0> f192208n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<MessageListScrollEvent> f192209o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f192210p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g0.b f192211q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f192212r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list, Y41.l lVar, Y41.l lVar2, InterfaceC43160i interfaceC43160i, androidx.compose.ui.v vVar, g0.b bVar, int i12) {
        super(2);
        this.f192206l = list;
        this.f192207m = lVar;
        this.f192208n = lVar2;
        this.f192209o = interfaceC43160i;
        this.f192210p = vVar;
        this.f192211q = bVar;
        this.f192212r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192212r | 1);
        g0.b bVar = this.f192211q;
        Y41.l<f0, G0> lVar = this.f192208n;
        InterfaceC43160i<MessageListScrollEvent> interfaceC43160i = this.f192209o;
        n.a(this.f192206l, this.f192207m, lVar, interfaceC43160i, this.f192210p, bVar, a12, iA2);
        return G0.f406611a;
    }
}

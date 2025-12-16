package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TextMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f192606l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f192607m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f192608n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f192609o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C22602e c22602e, v.a aVar, Y41.a aVar2, int i12) {
        super(2);
        this.f192606l = c22602e;
        this.f192607m = aVar;
        this.f192608n = aVar2;
        this.f192609o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192609o | 1);
        Y41.a<G0> aVar = this.f192608n;
        p.b(this.f192606l, this.f192607m, aVar, a12, iA2);
        return G0.f406611a;
    }
}

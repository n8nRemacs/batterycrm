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
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f192598l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f192599m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f192600n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f192601o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f192602p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C22602e c22602e, Y41.l lVar, Y41.l lVar2, v.a aVar, int i12) {
        super(2);
        this.f192598l = c22602e;
        this.f192599m = lVar;
        this.f192600n = lVar2;
        this.f192601o = aVar;
        this.f192602p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192602p | 1);
        Y41.l<String, G0> lVar = this.f192599m;
        Y41.l<String, G0> lVar2 = this.f192600n;
        p.a(this.f192598l, lVar, lVar2, this.f192601o, a12, iA2);
        return G0.f406611a;
    }
}

package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: QuoteContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class U extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X f193285l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193286m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193287n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193288o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193289p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(X x12, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193285l = x12;
        this.f193286m = dVar;
        this.f193287n = lVar;
        this.f193288o = aVar;
        this.f193289p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193285l.a(this.f193286m, this.f193287n, this.f193288o, a12, C22066f2.a(this.f193289p | 1));
        return G0.f406611a;
    }
}

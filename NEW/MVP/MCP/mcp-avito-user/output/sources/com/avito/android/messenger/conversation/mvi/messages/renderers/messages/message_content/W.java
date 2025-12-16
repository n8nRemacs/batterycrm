package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: QuoteContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class W extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X f193292l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193293m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193294n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193295o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193296p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x12, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193292l = x12;
        this.f193293m = dVar;
        this.f193294n = lVar;
        this.f193295o = aVar;
        this.f193296p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193292l.a(this.f193293m, this.f193294n, this.f193295o, a12, C22066f2.a(this.f193296p | 1));
        return G0.f406611a;
    }
}

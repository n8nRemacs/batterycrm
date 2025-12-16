package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VideoMessageFromUserContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class t0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u0 f193436l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193437m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193438n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193439o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193440p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193436l = u0Var;
        this.f193437m = dVar;
        this.f193438n = lVar;
        this.f193439o = aVar;
        this.f193440p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193436l.a(this.f193437m, this.f193438n, this.f193439o, a12, C22066f2.a(this.f193440p | 1));
        return G0.f406611a;
    }
}

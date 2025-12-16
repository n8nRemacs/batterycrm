package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ImageMessageFromUserContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class r extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C32171s f193419l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193420m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193421n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193422o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193423p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C32171s c32171s, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193419l = c32171s;
        this.f193420m = dVar;
        this.f193421n = lVar;
        this.f193422o = aVar;
        this.f193423p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193419l.a(this.f193420m, this.f193421n, this.f193422o, a12, C22066f2.a(this.f193423p | 1));
        return G0.f406611a;
    }
}

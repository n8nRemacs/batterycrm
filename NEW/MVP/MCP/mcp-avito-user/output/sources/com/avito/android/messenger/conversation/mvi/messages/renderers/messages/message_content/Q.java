package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PlatformTextMessageFromUserContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class Q extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f193272l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193273m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193274n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193275o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193276p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(T t12, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193272l = t12;
        this.f193273m = dVar;
        this.f193274n = lVar;
        this.f193275o = aVar;
        this.f193276p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193272l.a(this.f193273m, this.f193274n, this.f193275o, a12, C22066f2.a(this.f193276p | 1));
        return G0.f406611a;
    }
}

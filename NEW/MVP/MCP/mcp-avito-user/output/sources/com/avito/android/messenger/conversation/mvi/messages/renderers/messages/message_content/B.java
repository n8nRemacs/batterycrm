package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LocationMessageFromUserContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class B extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f193221l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193222m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193223n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193224o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193225p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(E e12, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193221l = e12;
        this.f193222m = dVar;
        this.f193223n = lVar;
        this.f193224o = aVar;
        this.f193225p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193221l.a(this.f193222m, this.f193223n, this.f193224o, a12, C22066f2.a(this.f193225p | 1));
        return G0.f406611a;
    }
}

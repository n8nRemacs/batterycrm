package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FileMessageFromAvitoContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32167n extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C32168o f193390l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193391m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193392n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193393o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193394p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32167n(C32168o c32168o, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193390l = c32168o;
        this.f193391m = dVar;
        this.f193392n = lVar;
        this.f193393o = aVar;
        this.f193394p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193390l.a(this.f193391m, this.f193392n, this.f193393o, a12, C22066f2.a(this.f193394p | 1));
        return G0.f406611a;
    }
}

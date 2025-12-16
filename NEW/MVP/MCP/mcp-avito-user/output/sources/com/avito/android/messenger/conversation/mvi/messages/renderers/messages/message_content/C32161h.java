package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DeletedMessageFromUserContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32161h extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C32162i f193345l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193346m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193347n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193348o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193349p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32161h(C32162i c32162i, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193345l = c32162i;
        this.f193346m = dVar;
        this.f193347n = lVar;
        this.f193348o = aVar;
        this.f193349p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193345l.a(this.f193346m, this.f193347n, this.f193348o, a12, C22066f2.a(this.f193349p | 1));
        return G0.f406611a;
    }
}

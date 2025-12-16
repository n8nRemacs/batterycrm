package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CallMessageContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32158e extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C32159f f193324l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193325m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193326n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193327o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193328p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32158e(C32159f c32159f, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193324l = c32159f;
        this.f193325m = dVar;
        this.f193326n = lVar;
        this.f193327o = aVar;
        this.f193328p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193324l.a(this.f193325m, this.f193326n, this.f193327o, a12, C22066f2.a(this.f193328p | 1));
        return G0.f406611a;
    }
}

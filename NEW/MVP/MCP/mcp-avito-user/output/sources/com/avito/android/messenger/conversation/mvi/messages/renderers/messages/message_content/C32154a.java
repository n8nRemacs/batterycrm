package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AbstractMessageFromAvitoContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32154a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC32155b f193298l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193299m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193300n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193301o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193302p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32154a(AbstractC32155b abstractC32155b, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193298l = abstractC32155b;
        this.f193299m = dVar;
        this.f193300n = lVar;
        this.f193301o = aVar;
        this.f193302p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193298l.a(this.f193299m, this.f193300n, this.f193301o, a12, C22066f2.a(this.f193302p | 1));
        return G0.f406611a;
    }
}

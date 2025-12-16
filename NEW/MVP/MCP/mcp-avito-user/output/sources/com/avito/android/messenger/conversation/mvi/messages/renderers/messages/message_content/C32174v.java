package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LinkSnippetMessageContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32174v extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C32175w f193445l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193446m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193447n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193448o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193449p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32174v(C32175w c32175w, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193445l = c32175w;
        this.f193446m = dVar;
        this.f193447n = lVar;
        this.f193448o = aVar;
        this.f193449p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193445l.a(this.f193446m, this.f193447n, this.f193448o, a12, C22066f2.a(this.f193449p | 1));
        return G0.f406611a;
    }
}

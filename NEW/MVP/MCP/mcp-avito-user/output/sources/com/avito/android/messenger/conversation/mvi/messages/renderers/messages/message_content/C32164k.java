package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FileMessageContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32164k extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C32165l f193374l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193375m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193376n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193377o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193378p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32164k(C32165l c32165l, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193374l = c32165l;
        this.f193375m = dVar;
        this.f193376n = lVar;
        this.f193377o = aVar;
        this.f193378p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193374l.a(this.f193375m, this.f193376n, this.f193377o, a12, C22066f2.a(this.f193378p | 1));
        return G0.f406611a;
    }
}

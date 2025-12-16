package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ItemMessageFromUserContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32172t extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C32173u f193431l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193432m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193433n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193434o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193435p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32172t(C32173u c32173u, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193431l = c32173u;
        this.f193432m = dVar;
        this.f193433n = lVar;
        this.f193434o = aVar;
        this.f193435p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193431l.a(this.f193432m, this.f193433n, this.f193434o, a12, C22066f2.a(this.f193435p | 1));
        return G0.f406611a;
    }
}

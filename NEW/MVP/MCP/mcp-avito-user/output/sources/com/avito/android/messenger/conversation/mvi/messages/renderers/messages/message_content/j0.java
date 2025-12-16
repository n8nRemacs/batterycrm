package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VideoMessageFromAvitoContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class j0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o0 f193369l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193370m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193371n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193372o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193373p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(o0 o0Var, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193369l = o0Var;
        this.f193370m = dVar;
        this.f193371n = lVar;
        this.f193372o = aVar;
        this.f193373p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193369l.a(this.f193370m, this.f193371n, this.f193372o, a12, C22066f2.a(this.f193373p | 1));
        return G0.f406611a;
    }
}

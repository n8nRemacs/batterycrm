package com.avito.android.multi_message_send.composable;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MultiMessageSendInput.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.multi_message_send.composable.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32865l extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G20.a f206530l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<G20.b, G0> f206531m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f206532n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f206533o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32865l(G20.a aVar, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f206530l = aVar;
        this.f206531m = lVar;
        this.f206532n = vVar;
        this.f206533o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f206533o | 1);
        androidx.compose.ui.v vVar = this.f206532n;
        C32867n.a(this.f206530l, this.f206531m, vVar, a12, iA2);
        return G0.f406611a;
    }
}

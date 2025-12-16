package com.avito.android.multi_message_send.composable;

import F20.e;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MultiSendListItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class Q extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e.a f206493l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<G20.b, G0> f206494m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f206495n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f206496o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f206497p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(e.a aVar, Y41.l lVar, boolean z12, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f206493l = aVar;
        this.f206494m = lVar;
        this.f206495n = z12;
        this.f206496o = vVar;
        this.f206497p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f206497p | 1);
        V.b(this.f206493l, this.f206494m, this.f206495n, a12, iA2);
        return G0.f406611a;
    }
}

package com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f192225l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f192226m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f192227n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, v vVar, boolean z12, int i12) {
        super(2);
        this.f192225l = dVar;
        this.f192226m = vVar;
        this.f192227n = z12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        boolean z12 = this.f192227n;
        c.a(this.f192225l, this.f192226m, z12, a12, iA2);
        return G0.f406611a;
    }
}

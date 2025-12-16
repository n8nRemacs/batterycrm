package com.avito.android.messenger.conversation.mvi.messages.composables.other;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NonMessageStub.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f192775l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f192776m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f192777n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i12, androidx.compose.ui.v vVar, String str) {
        super(2);
        this.f192775l = str;
        this.f192776m = vVar;
        this.f192777n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192777n | 1);
        j.a(this.f192775l, this.f192776m, a12, iA2);
        return G0.f406611a;
    }
}

package com.avito.android.messenger.conversation.mvi.messages.composables.messages;

import Y41.p;
import androidx.compose.foundation.layout.V1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessageStub.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f192249l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f192250m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V1 f192251n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f192252o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, v vVar, V1 v12, int i12) {
        super(2);
        this.f192249l = str;
        this.f192250m = vVar;
        this.f192251n = v12;
        this.f192252o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192252o | 1);
        V1 v12 = this.f192251n;
        f.a(this.f192249l, this.f192250m, v12, a12, iA2);
        return G0.f406611a;
    }
}

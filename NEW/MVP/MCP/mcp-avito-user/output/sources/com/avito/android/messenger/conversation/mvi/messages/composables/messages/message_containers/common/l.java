package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NonOutgoingMessage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class l extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f192376l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f192377m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f192378n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i12, v vVar, String str) {
        super(2);
        this.f192376l = str;
        this.f192377m = vVar;
        this.f192378n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192378n | 1);
        m.b(this.f192376l, this.f192377m, a12, iA2);
        return G0.f406611a;
    }
}

package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.video_message;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VideoMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f192634l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f192635m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f192636n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, v vVar, int i12) {
        super(2);
        this.f192634l = nVar;
        this.f192635m = vVar;
        this.f192636n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192636n | 1);
        v vVar = this.f192635m;
        m.b(this.f192634l, vVar, a12, iA2);
        return G0.f406611a;
    }
}

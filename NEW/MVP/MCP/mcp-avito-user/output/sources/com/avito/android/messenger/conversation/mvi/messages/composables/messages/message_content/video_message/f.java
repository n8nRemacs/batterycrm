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
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f192630l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f192631m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f192632n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f192633o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n nVar, Y41.a aVar, v vVar, int i12) {
        super(2);
        this.f192630l = nVar;
        this.f192631m = aVar;
        this.f192632n = vVar;
        this.f192633o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192633o | 1);
        m.a(this.f192630l, this.f192631m, this.f192632n, a12, iA2);
        return G0.f406611a;
    }
}

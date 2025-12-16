package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VoiceMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class j extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f192684l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f192685m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f192686n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f192687o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f192688p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f192689q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, long j12, Y41.a aVar, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f192684l = mVar;
        this.f192685m = j12;
        this.f192686n = aVar;
        this.f192687o = lVar;
        this.f192688p = vVar;
        this.f192689q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192689q | 1);
        long j12 = this.f192685m;
        Y41.a<G0> aVar = this.f192686n;
        l.d(this.f192684l, j12, aVar, this.f192687o, this.f192688p, a12, iA2);
        return G0.f406611a;
    }
}

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
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f192673l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f192674m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f192675n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f192676o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f192677p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, long j12, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f192673l = mVar;
        this.f192674m = j12;
        this.f192675n = lVar;
        this.f192676o = vVar;
        this.f192677p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192677p | 1);
        long j12 = this.f192674m;
        Y41.l<Integer, G0> lVar = this.f192675n;
        l.b(this.f192673l, j12, lVar, this.f192676o, a12, iA2);
        return G0.f406611a;
    }
}

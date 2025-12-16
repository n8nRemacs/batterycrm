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
final class i extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f192681l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f192682m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f192683n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, v vVar, int i12) {
        super(2);
        this.f192681l = mVar;
        this.f192682m = vVar;
        this.f192683n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192683n | 1);
        v vVar = this.f192682m;
        l.c(this.f192681l, vVar, a12, iA2);
        return G0.f406611a;
    }
}

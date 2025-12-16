package com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OldCallMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f192237l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f192238m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f192239n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, v vVar, boolean z12, int i12) {
        super(2);
        this.f192237l = hVar;
        this.f192238m = vVar;
        this.f192239n = z12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        boolean z12 = this.f192239n;
        g.a(this.f192237l, this.f192238m, z12, a12, iA2);
        return G0.f406611a;
    }
}

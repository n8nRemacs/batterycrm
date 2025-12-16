package com.avito.android.messenger.conversation.mvi.messages.preview.preview_wrappers;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IncomingMessagePreviewWrapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f193077l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f193078m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f193079n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f193080o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193081p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f193082q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v vVar, boolean z12, boolean z13, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f193077l = vVar;
        this.f193078m = z12;
        this.f193079n = z13;
        this.f193080o = c22096n;
        this.f193081p = i12;
        this.f193082q = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f193081p | 1);
        boolean z12 = this.f193079n;
        d.a(this.f193077l, this.f193078m, z12, this.f193080o, a12, iA2, this.f193082q);
        return G0.f406611a;
    }
}

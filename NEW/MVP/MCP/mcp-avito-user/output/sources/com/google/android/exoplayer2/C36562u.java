package com.google.android.exoplayer2;

import com.google.android.exoplayer2.G;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.C36599o;
import com.google.android.exoplayer2.util.C36604u;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C36562u implements C36604u.b, G.e, C36604u.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f347341b;

    public /* synthetic */ C36562u(C c12) {
        this.f347341b = c12;
    }

    public void a(G.d dVar) {
        int i12 = C.f343308n0;
        C c12 = this.f347341b;
        c12.getClass();
        c12.f343350i.d(new RunnableC36610y(0, c12, dVar));
    }

    @Override // com.google.android.exoplayer2.util.C36604u.b
    public void e(Object obj, C36599o c36599o) {
        int i12 = C.f343308n0;
        C c12 = this.f347341b;
        c12.getClass();
        ((d0.g) obj).onEvents(c12.f343344f, new d0.f(c36599o));
    }

    @Override // com.google.android.exoplayer2.util.C36604u.a
    public void invoke(Object obj) {
        ((d0.g) obj).onAvailableCommandsChanged(this.f347341b.f343323O);
    }
}

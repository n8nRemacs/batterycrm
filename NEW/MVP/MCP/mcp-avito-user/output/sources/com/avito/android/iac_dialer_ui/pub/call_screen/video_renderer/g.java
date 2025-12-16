package com.avito.android.iac_dialer_ui.pub.call_screen.video_renderer;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIVideoRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacUIVideoRendererState f167386l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f167387m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f167388n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f167389o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f167390p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f167391q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(IacUIVideoRendererState iacUIVideoRendererState, l lVar, p pVar, l lVar2, v vVar, int i12) {
        super(2);
        this.f167386l = iacUIVideoRendererState;
        this.f167387m = (N) lVar;
        this.f167388n = (N) pVar;
        this.f167389o = (N) lVar2;
        this.f167390p = vVar;
        this.f167391q = i12;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167391q | 1);
        ?? r32 = this.f167389o;
        ?? r12 = this.f167387m;
        ?? r22 = this.f167388n;
        i.a(this.f167386l, r12, r22, r32, this.f167390p, a12, iA2);
        return G0.f406611a;
    }
}

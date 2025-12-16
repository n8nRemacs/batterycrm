package com.avito.android.replace_main.toggle;

import androidx.compose.runtime.C22066f2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.replace_main.toggle.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.n2;

/* compiled from: ReplaceMainToggleContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class i extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28373a f254639l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n2<d> f254640m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a.C7618a f254641n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f254642o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f254643p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f254644q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(InterfaceC28373a interfaceC28373a, n2 n2Var, v.a.C7618a c7618a, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f254639l = interfaceC28373a;
        this.f254640m = n2Var;
        this.f254641n = c7618a;
        this.f254642o = (N) lVar;
        this.f254643p = vVar;
        this.f254644q = i12;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f254644q | 1);
        ?? r32 = this.f254642o;
        n2<d> n2Var = this.f254640m;
        v.a.C7618a c7618a = this.f254641n;
        j.a(this.f254639l, n2Var, c7618a, r32, a12, iA2);
        return G0.f406611a;
    }
}

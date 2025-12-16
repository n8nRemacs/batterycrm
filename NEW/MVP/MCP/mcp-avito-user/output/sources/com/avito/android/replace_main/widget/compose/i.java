package com.avito.android.replace_main.widget.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.replace_main.onboarding.widget.ReplaceMainItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReplaceMainPageWidgetUI.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class i extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ReplaceMainItem.ShowAvito f254681l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f254682m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f254683n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f254684o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(ReplaceMainItem.ShowAvito showAvito, Y41.a aVar, v vVar, int i12) {
        super(2);
        this.f254681l = showAvito;
        this.f254682m = (N) aVar;
        this.f254683n = vVar;
        this.f254684o = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f254684o | 1);
        ?? r02 = this.f254682m;
        j.b(this.f254681l, r02, a12, iA2);
        return G0.f406611a;
    }
}

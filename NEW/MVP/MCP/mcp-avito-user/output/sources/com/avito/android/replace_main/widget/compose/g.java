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
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ReplaceMainItem.ReplaceMain f254676l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f254677m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f254678n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f254679o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(ReplaceMainItem.ReplaceMain replaceMain, Y41.a aVar, v vVar, int i12) {
        super(2);
        this.f254676l = replaceMain;
        this.f254677m = (N) aVar;
        this.f254678n = vVar;
        this.f254679o = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f254679o | 1);
        ?? r02 = this.f254677m;
        j.a(this.f254676l, r02, a12, iA2);
        return G0.f406611a;
    }
}

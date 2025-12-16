package com.avito.android.cart_sheet_after_adding.ui.components;

import androidx.compose.runtime.C22066f2;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CartSheetAfterAddingMainSnippet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class h extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Stepper f115533l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f115534m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f115535n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f115536o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f115537p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(Stepper stepper, String str, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f115533l = stepper;
        this.f115534m = str;
        this.f115535n = (N) lVar;
        this.f115536o = vVar;
        this.f115537p = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f115537p | 1);
        ?? r02 = this.f115535n;
        p.b(this.f115533l, this.f115534m, r02, a12, iA2);
        return G0.f406611a;
    }
}

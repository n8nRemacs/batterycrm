package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.runtime.C22066f2;
import c90.InterfaceC26960a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PositionInSearchDataHeader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class r extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f221717l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f221718m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC26960a, G0> f221719n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f221720o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f221721p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i12, Y41.l lVar, androidx.compose.ui.v vVar, AttributedText attributedText, String str) {
        super(2);
        this.f221717l = str;
        this.f221718m = attributedText;
        this.f221719n = lVar;
        this.f221720o = vVar;
        this.f221721p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f221721p | 1);
        C33294s.a(this.f221717l, this.f221718m, this.f221719n, a12, iA2);
        return G0.f406611a;
    }
}

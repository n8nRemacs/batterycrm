package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PositionInSearchCurrentPosition.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.ui.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33291o extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f221707l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f221708m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f221709n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f221710o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f221711p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33291o(AttributedText attributedText, AttributedText attributedText2, String str, boolean z12, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f221707l = attributedText;
        this.f221708m = attributedText2;
        this.f221709n = str;
        this.f221710o = z12;
        this.f221711p = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(73);
        AttributedText attributedText = this.f221708m;
        String str = this.f221709n;
        C33292p.a(this.f221707l, attributedText, str, this.f221710o, a12, iA2);
        return G0.f406611a;
    }
}

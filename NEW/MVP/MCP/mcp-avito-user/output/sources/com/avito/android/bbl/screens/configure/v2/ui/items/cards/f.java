package com.avito.android.bbl.screens.configure.v2.ui.items.cards;

import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BblSelectorCardGrid.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class f extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f99421l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f99422m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C28729a, G0> f99423n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List<C28729a> f99424o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AttributedText attributedText, int i12, Y41.l lVar, List list, int i13) {
        super(2);
        this.f99421l = attributedText;
        this.f99422m = i12;
        this.f99423n = lVar;
        this.f99424o = list;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(4105);
        Y41.l<C28729a, G0> lVar = this.f99423n;
        List<C28729a> list = this.f99424o;
        g.a(this.f99421l, this.f99422m, lVar, list, a12, iA2);
        return G0.f406611a;
    }
}

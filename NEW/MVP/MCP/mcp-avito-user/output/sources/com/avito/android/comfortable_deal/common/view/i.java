package com.avito.android.comfortable_deal.common.view;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExpandableText.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class i extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f120734l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f120735m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f120736n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f120737o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i12, int i13, androidx.compose.ui.v vVar, String str) {
        super(2);
        this.f120734l = str;
        this.f120735m = vVar;
        this.f120736n = i12;
        this.f120737o = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f120737o | 1);
        String str = this.f120734l;
        androidx.compose.ui.v vVar = this.f120735m;
        j.a(this.f120736n, iA2, a12, vVar, str);
        return G0.f406611a;
    }
}

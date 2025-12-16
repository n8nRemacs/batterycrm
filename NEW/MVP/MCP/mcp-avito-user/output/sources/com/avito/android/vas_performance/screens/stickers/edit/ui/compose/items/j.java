package com.avito.android.vas_performance.screens.stickers.edit.ui.compose.items;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StickersEditDescription.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class j extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f320894l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f320895m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f320896n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f320897o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AttributedText attributedText, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f320894l = attributedText;
        this.f320895m = lVar;
        this.f320896n = vVar;
        this.f320897o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f320897o | 1);
        v vVar = this.f320896n;
        k.a(this.f320894l, this.f320895m, vVar, a12, iA2);
        return G0.f406611a;
    }
}

package com.avito.android.interior_photos_block.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InteriorPhotos.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class i extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f173034l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f173035m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AttributedText attributedText, v vVar, int i12) {
        super(2);
        this.f173034l = attributedText;
        this.f173035m = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        e.f(this.f173034l, a12, iA2);
        return G0.f406611a;
    }
}

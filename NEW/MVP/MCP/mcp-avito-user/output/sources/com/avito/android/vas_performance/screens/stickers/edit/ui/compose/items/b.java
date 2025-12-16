package com.avito.android.vas_performance.screens.stickers.edit.ui.compose.items;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StickersEditChangesBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f320876l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f320877m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Image f320878n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f320879o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, AttributedText attributedText, Image image, v vVar, int i12) {
        super(2);
        this.f320876l = str;
        this.f320877m = attributedText;
        this.f320878n = image;
        this.f320879o = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(3649);
        v vVar = this.f320879o;
        c.a(this.f320876l, this.f320877m, this.f320878n, vVar, a12, iA2);
        return G0.f406611a;
    }
}

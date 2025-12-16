package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PositionInSearchFooter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.ui.x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33299x extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Image f221740l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f221741m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33299x(int i12, Image image) {
        super(2);
        this.f221740l = image;
        this.f221741m = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f221741m | 1);
        B.b(this.f221740l, a12, iA2);
        return G0.f406611a;
    }
}

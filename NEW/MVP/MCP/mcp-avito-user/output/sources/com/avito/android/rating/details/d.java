package com.avito.android.rating.details;

import android.content.DialogInterface;
import com.avito.android.rating.details.RatingDetailsFragment;
import com.avito.android.rating.details.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingDetailsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RatingDetailsFragment f246949l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f246950m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f246951n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RatingDetailsFragment ratingDetailsFragment, long j12, DialogInterface dialogInterface) {
        super(0);
        this.f246949l = ratingDetailsFragment;
        this.f246950m = j12;
        this.f246951n = dialogInterface;
    }

    @Override // Y41.a
    public final G0 invoke() {
        RatingDetailsFragment.C34165a c34165a = RatingDetailsFragment.f246422S0;
        this.f246949l.E5().accept(new a.f(this.f246950m));
        this.f246951n.dismiss();
        return G0.f406611a;
    }
}

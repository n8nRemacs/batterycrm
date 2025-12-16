package com.avito.android.checkable_image;

import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.C27291k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: CheckableImageWithAnimation.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<View, ViewGroup> f118089l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f118090m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.h<C27291k> f118091n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f118092o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Y41.l lVar, View view, l0.h hVar, int i12) {
        super(0);
        this.f118089l = lVar;
        this.f118090m = view;
        this.f118091n = hVar;
        this.f118092o = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Y41.l<View, ViewGroup> lVar = this.f118089l;
        View view = this.f118090m;
        q.c(view, lVar.invoke(view), this.f118091n.f406842b, this.f118092o);
        return G0.f406611a;
    }
}

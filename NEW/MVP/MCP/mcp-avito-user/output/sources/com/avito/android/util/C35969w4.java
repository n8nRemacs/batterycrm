package com.avito.android.util;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: RecyclerViews.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/w4;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.w4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35969w4 extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public boolean f319117b;

    /* renamed from: c, reason: collision with root package name */
    public int f319118c;

    /* renamed from: d, reason: collision with root package name */
    public int f319119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f319120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.B<C35784e5> f319121f;

    public C35969w4(int i12, io.reactivex.rxjava3.core.B<C35784e5> b12) {
        this.f319120e = i12;
        this.f319121f = b12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        if (i12 == 0) {
            this.f319118c = 0;
            this.f319119d = 0;
            this.f319117b = false;
        } else {
            if (i12 != 1) {
                return;
            }
            this.f319118c = 0;
            this.f319119d = 0;
            this.f319117b = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        if (this.f319117b) {
            if (Integer.signum(this.f319118c) * Integer.signum(i12) < 0) {
                this.f319118c = i12;
            } else {
                this.f319118c += i12;
            }
            if (Integer.signum(this.f319119d) * Integer.signum(i13) < 0) {
                this.f319119d = i13;
            } else {
                this.f319119d += i13;
            }
            int iAbs = Math.abs(this.f319118c);
            int i14 = this.f319120e;
            boolean z12 = iAbs >= i14;
            boolean z13 = Math.abs(this.f319119d) >= i14;
            if (z12 || z13) {
                this.f319121f.onNext(new C35784e5(this.f319118c, this.f319119d));
                if (z12) {
                    this.f319118c = 0;
                } else {
                    this.f319119d = 0;
                }
            }
        }
    }
}

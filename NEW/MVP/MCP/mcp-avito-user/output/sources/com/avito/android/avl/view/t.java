package com.avito.android.avl.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvlPlayerVideosAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/view/View;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class t extends N implements Y41.l<Integer, View> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f98415l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f98416m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q qVar, ViewGroup viewGroup) {
        super(1);
        this.f98415l = qVar;
        this.f98416m = viewGroup;
    }

    @Override // Y41.l
    public final View invoke(Integer num) {
        int iIntValue = num.intValue();
        q qVar = this.f98415l;
        LayoutInflater layoutInflater = qVar.f98408m;
        ViewGroup viewGroup = this.f98416m;
        if (layoutInflater == null) {
            qVar.f98408m = LayoutInflater.from(viewGroup.getContext());
        }
        LayoutInflater layoutInflater2 = qVar.f98408m;
        View viewInflate = layoutInflater2 != null ? layoutInflater2.inflate(iIntValue, viewGroup, false) : null;
        if (viewInflate != null) {
            return viewInflate;
        }
        throw new IllegalStateException();
    }
}

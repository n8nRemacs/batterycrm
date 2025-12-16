package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfileLazyColumnAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/view/View;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class e extends N implements Y41.l<Integer, View> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f151371l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f151372m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, ViewGroup viewGroup) {
        super(1);
        this.f151371l = dVar;
        this.f151372m = viewGroup;
    }

    @Override // Y41.l
    public final View invoke(Integer num) {
        int iIntValue = num.intValue();
        d dVar = this.f151371l;
        LayoutInflater layoutInflater = dVar.f151365m;
        ViewGroup viewGroup = this.f151372m;
        if (layoutInflater == null) {
            dVar.f151365m = LayoutInflater.from(viewGroup.getContext());
        }
        LayoutInflater layoutInflater2 = dVar.f151365m;
        View viewInflate = layoutInflater2 != null ? layoutInflater2.inflate(iIntValue, viewGroup, false) : null;
        if (viewInflate != null) {
            return viewInflate;
        }
        throw new IllegalStateException();
    }
}

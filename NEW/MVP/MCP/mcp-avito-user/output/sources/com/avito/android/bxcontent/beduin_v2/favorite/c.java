package com.avito.android.bxcontent.beduin_v2.favorite;

import Ca1.ViewOnClickListenerC13236c;
import Y41.l;
import Y41.p;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.serp.adapter.S;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.google.android.material.internal.CheckableImageButton;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import io.reactivex.rxjava3.kotlin.A1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BxFavoriteButtonComponent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/favorite/c;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/bxcontent/beduin_v2/favorite/g;", "Lcom/google/android/material/internal/CheckableImageButton;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"RestrictedApi"})
/* loaded from: classes12.dex */
public final class c extends AbstractC36333c<g, CheckableImageButton> {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final l<S, G0> f109525m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final p<String, Boolean, I<Boolean>> f109526n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f109527o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public m f109528p;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@Y61.k l<? super S, G0> lVar, @Y61.k p<? super String, ? super Boolean, ? extends I<Boolean>> pVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super(null, 1, null);
        this.f109525m = lVar;
        this.f109526n = pVar;
        this.f109527o = interfaceC35745a5;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, g gVar) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) view;
        g gVar2 = gVar;
        m mVar = this.f109528p;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        Boolean boolValueOf = Boolean.valueOf(gVar2.f109537b);
        this.f109528p = A1.g(this.f109526n.invoke(gVar2.f109536a, boolValueOf).s(this.f109527o.e()), null, new a(checkableImageButton), 1);
        checkableImageButton.setOnClickListener(new ViewOnClickListenerC13236c(checkableImageButton, this, gVar2, 22));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        CheckableImageButton checkableImageButton = new CheckableImageButton(viewGroup.getContext(), null);
        checkableImageButton.setBackgroundResource(R.drawable.bg_btn_circle_warmgray);
        checkableImageButton.setImageResource(R.drawable.advert_constructor_favorite_red_redesign);
        return checkableImageButton;
    }
}

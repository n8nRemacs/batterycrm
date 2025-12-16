package com.avito.android.beduin.common.component.favorite_button;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.B2;
import com.avito.android.R;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.favorite_button.BeduinFavoriteButtonChange;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.checkable_image.q;
import com.avito.android.util.D6;
import com.google.android.material.internal.CheckableImageButton;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: BeduinFavoriteButtonComponent.kt */
@hw.g
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/favorite_button/b;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/favorite_button/BeduinFavoriteButtonModel;", "Lcom/google/android/material/internal/CheckableImageButton;", "a", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends com.avito.android.beduin.common.component.h<BeduinFavoriteButtonModel, CheckableImageButton> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final BeduinFavoriteButtonModel f101183e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final B2 f101184f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final j f101185g;

    /* compiled from: BeduinFavoriteButtonComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/favorite_button/b$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<String> f101186a = Collections.singletonList("favoriteButton");

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Class<? extends BeduinModel> f101187b = BeduinFavoriteButtonModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<? extends BeduinModel> S() {
            return this.f101187b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return this.f101186a;
        }
    }

    /* compiled from: BeduinFavoriteButtonComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/favorite_button/b$b;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.favorite_button.b$b, reason: collision with other inner class name */
    public static final class C3034b {

        /* renamed from: a, reason: collision with root package name */
        public final int f101188a;

        /* renamed from: b, reason: collision with root package name */
        public final int f101189b;

        public C3034b(@InterfaceC42165v int i12, @InterfaceC42165v int i13) {
            this.f101188a = i12;
            this.f101189b = i13;
        }
    }

    public b(@Y61.k BeduinFavoriteButtonModel beduinFavoriteButtonModel, @Y61.k B2 b22, @Y61.k j jVar) {
        this.f101183e = beduinFavoriteButtonModel;
        this.f101184f = b22;
        this.f101185g = jVar;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101183e;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinFavoriteButtonModel beduinFavoriteButtonModel = (BeduinFavoriteButtonModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        BeduinFavoriteButtonChange[] beduinFavoriteButtonChangeArrValues = BeduinFavoriteButtonChange.values();
        if (beduinFavoriteButtonChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, BeduinFavoriteButtonChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(beduinFavoriteButtonChangeArrValues));
        BeduinFavoriteButtonModel beduinFavoriteButtonModel2 = this.f101183e;
        if (!L.f(fVar.invoke(beduinFavoriteButtonModel2), fVar.invoke(beduinFavoriteButtonModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BeduinFavoriteButtonChange beduinFavoriteButtonChange : beduinFavoriteButtonChangeArrValues) {
            if (!L.f(((BeduinFavoriteButtonChange.a) beduinFavoriteButtonChange.f101173b).invoke(beduinFavoriteButtonModel2), ((BeduinFavoriteButtonChange.a) beduinFavoriteButtonChange.f101173b).invoke(beduinFavoriteButtonModel))) {
                arrayList.add(beduinFavoriteButtonChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        CheckableImageButton checkableImageButton = new CheckableImageButton(viewGroup.getContext(), null);
        checkableImageButton.setId(R.id.beduin_favourite_button);
        checkableImageButton.setLayoutParams(layoutParams);
        B2 b22 = this.f101184f;
        b22.getClass();
        n<Object> nVar = B2.f67184X[46];
        if (((Boolean) b22.f67203S.a().invoke()).booleanValue()) {
            q.e(checkableImageButton);
        }
        return checkableImageButton;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        Integer numC;
        Integer numD;
        CheckableImageButton checkableImageButton = (CheckableImageButton) view;
        BeduinFavoriteButtonModel beduinFavoriteButtonModel = this.f101183e;
        checkableImageButton.setTag(beduinFavoriteButtonModel.getF102944b());
        C3034b c3034b = beduinFavoriteButtonModel.f101175b ? new C3034b(R.drawable.bg_btn_circle_warmgray, R.drawable.advert_constructor_favorite_red_redesign) : beduinFavoriteButtonModel.getTheme() == BeduinComponentTheme.AVITO_RE_23 ? new C3034b(R.drawable.bg_btn_circle_warmgray, R.drawable.advert_constructor_favorite_red) : beduinFavoriteButtonModel.getStyle() == Style.LARGE ? new C3034b(R.drawable.bg_btn_circle_gray_rich, R.drawable.advert_item_rich_favorite_red) : beduinFavoriteButtonModel.getStyle() == Style.BOLD_LARGE ? new C3034b(R.drawable.bg_btn_circle_warmgray, R.drawable.advert_item_rich_favorite_str_redesign) : new C3034b(R.drawable.bg_btn_circle_warmgray, R.drawable.advert_item_list_favorite_red);
        checkableImageButton.setBackgroundResource(c3034b.f101188a);
        checkableImageButton.setImageResource(c3034b.f101189b);
        ViewGroup.LayoutParams layoutParams = checkableImageButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Context context = checkableImageButton.getContext();
        Size size = beduinFavoriteButtonModel.getSize();
        int iIntValue = 0;
        layoutParams.width = D6.i((size == null || (numD = size.getWidth()) == null) ? 0 : numD.intValue(), context);
        Context context2 = checkableImageButton.getContext();
        Size size2 = beduinFavoriteButtonModel.getSize();
        if (size2 != null && (numC = size2.getHeight()) != null) {
            iIntValue = numC.intValue();
        }
        layoutParams.height = D6.i(iIntValue, context2);
        checkableImageButton.setLayoutParams(layoutParams);
        boolean isFavorite = beduinFavoriteButtonModel.getIsFavorite();
        checkableImageButton.setChecked(isFavorite);
        checkableImageButton.setOnClickListener(new com.avito.android.beduin.common.component.favorite_button.a(this, isFavorite, checkableImageButton));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        c cVar = new c(this, (CheckableImageButton) view);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(cVar, list);
    }
}

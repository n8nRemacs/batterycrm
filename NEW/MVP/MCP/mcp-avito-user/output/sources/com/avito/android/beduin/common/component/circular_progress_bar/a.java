package com.avito.android.beduin.common.component.circular_progress_bar;

import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.circular_counter.CircularCounter;
import com.avito.android.lib.design.circular_counter.a;
import com.avito.android.lib.design.circular_counter.b;
import com.avito.android.lib.design.d;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCircularProgressBarComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/circular_progress_bar/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/circular_progress_bar/BeduinCircularProgressBarModel;", "Lcom/avito/android/lib/design/circular_counter/CircularCounter;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinCircularProgressBarModel, CircularCounter> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101043e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinCircularProgressBarModel f101044f;

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinCircularProgressBarModel beduinCircularProgressBarModel) {
        this.f101043e = interfaceC15523b;
        this.f101044f = beduinCircularProgressBarModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101044f;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        CircularCounter circularCounter = new CircularCounter(new ContextThemeWrapper(viewGroup.getContext(), BeduinComponentTheme.AVITO_RE_23.f100608b), null, 0, 0, 12, null);
        circularCounter.setId(R.id.beduin_circular_progress_bar);
        circularCounter.setLayoutParams(layoutParams);
        return circularCounter;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) throws Resources.NotFoundException {
        CircularCounter circularCounter = (CircularCounter) view;
        BeduinCircularProgressBarModel beduinCircularProgressBarModel = this.f101044f;
        String text = beduinCircularProgressBarModel.getText();
        if (text == null) {
            text = "";
        }
        a.AbstractC5261a.b bVar = new a.AbstractC5261a.b(text);
        Float progress = beduinCircularProgressBarModel.getProgress();
        circularCounter.setState(new com.avito.android.lib.design.circular_counter.a(bVar, progress != null ? (int) (progress.floatValue() * 100.0f) : 0, 0, 4, null));
        b.a aVar = com.avito.android.lib.design.circular_counter.b.f178833g;
        Context context = circularCounter.getContext();
        int iJ2 = C35835l0.j(beduinCircularProgressBarModel.getStyle().f101042b, circularCounter.getContext());
        aVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iJ2, d.n.f178978l);
        com.avito.android.lib.design.circular_counter.b bVarB = b.a.b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        circularCounter.setStyle(bVarB);
    }
}

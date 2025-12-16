package com.avito.android.map_core.view.find_me;

import LV.b;
import X41.j;
import Y41.a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.lib.util.c;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import hY.C40893a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: FindMeButton.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/map_core/view/find_me/FindMeButton;", "Landroidx/cardview/widget/CardView;", "LLV/b;", "LhY/a;", "newState", "Lkotlin/G0;", "setState", "(LhY/a;)V", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FindMeButton extends CardView implements b<C40893a> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f185724b = 0;

    @j
    public FindMeButton(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // LV.b
    public void setState(@k C40893a newState) {
        if (new c(newState, null).f181333c) {
            return;
        }
        a<G0> aVar = newState.f397219a;
        if (new c(aVar, null).f181333c || aVar == null) {
            return;
        }
        setOnClickListener(new i(23, aVar));
    }

    public FindMeButton(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        View.inflate(context, R.layout.search_map_find_me_button, this);
    }
}

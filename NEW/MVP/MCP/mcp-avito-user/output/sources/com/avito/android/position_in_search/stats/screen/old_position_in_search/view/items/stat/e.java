package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.stat;

import Y61.k;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StatDescriptionItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/stat/e;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    public final Context f221194b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DescriptionParameterItem f221195c;

    /* compiled from: StatDescriptionItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/stat/e$a;", "", "<init>", "()V", "", "LEFT_WEIGHT", "F", "RIGHT_WEIGHT", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public e(@k View view) {
        super(view);
        this.f221194b = view.getContext();
        DescriptionParameterItem descriptionParameterItem = (DescriptionParameterItem) view;
        this.f221195c = descriptionParameterItem;
        descriptionParameterItem.setWeightSum(1.0f);
        com.avito.android.lib.design.text_view.a rightTextView = descriptionParameterItem.getRightTextView();
        ViewGroup.LayoutParams layoutParams = rightTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = 0;
        rightTextView.setLayoutParams(layoutParams);
        descriptionParameterItem.getRightTextView().setMaxLines(1);
        descriptionParameterItem.getRightTextView().setEllipsize(TextUtils.TruncateAt.END);
    }
}

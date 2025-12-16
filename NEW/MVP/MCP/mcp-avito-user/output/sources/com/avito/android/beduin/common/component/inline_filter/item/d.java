package com.avito.android.beduin.common.component.inline_filter.item;

import android.view.View;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFilterChipsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/inline_filter/item/d;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f101510f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f101511b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final BeduinComponentTheme f101512c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f101513d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f101514e;

    public d(@Y61.k View view, @Y61.l BeduinComponentTheme beduinComponentTheme, @Y61.l Integer num) {
        super(view);
        this.f101511b = view;
        this.f101512c = beduinComponentTheme;
        this.f101513d = num;
        this.f101514e = (LinearLayout) view.findViewById(R.id.filter_chips);
    }
}

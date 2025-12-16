package com.avito.android.beduin.common.form.screen_parameters;

import Y61.k;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.util.y6;
import j.r;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import mj.InterfaceC44087a;

/* compiled from: BeduinScreenParametersImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/form/screen_parameters/a;", "Lmj/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC44087a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f103371a;

    /* renamed from: b, reason: collision with root package name */
    @r
    public int f103372b = -1;

    /* renamed from: c, reason: collision with root package name */
    @r
    public int f103373c = -1;

    @Inject
    public a() {
    }

    @Override // mj.InterfaceC44087a
    public final void a(@k Context context) {
        this.f103371a = context.getResources().getBoolean(R.bool.is_tablet);
        this.f103372b = context.getResources().getDisplayMetrics().widthPixels;
        this.f103373c = y6.e(context.getResources().getDisplayMetrics().widthPixels);
    }

    @Override // mj.InterfaceC44087a
    @k
    public final Map<String, Object> b() {
        return P0.g(new Q("BEDUIN_SCREEN_PARAMETERS_IS_TABLET", Boolean.valueOf(this.f103371a)), new Q("BEDUIN_SCREEN_PARAMETERS_WIDTH_PX", Integer.valueOf(this.f103372b)), new Q("BEDUIN_SCREEN_PARAMETERS_WIDTH_DP", Integer.valueOf(this.f103373c)));
    }
}

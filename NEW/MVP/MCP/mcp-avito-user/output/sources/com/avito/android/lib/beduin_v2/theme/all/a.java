package com.avito.android.lib.beduin_v2.theme.all;

import HQ0.e;
import Y61.k;
import android.content.Context;
import androidx.appcompat.view.d;
import cU.F;
import com.avito.android.R;
import com.avito.android.lib.beduin_v2.theme.re23.C31183a;
import com.avito.android.lib.beduin_v2.theme.re23.C31195c;
import com.avito.android.lib.beduin_v2.theme.re23.C31351d;
import com.avito.android.lib.beduin_v2.theme.re23.a5;
import com.avito.android.lib.beduin_v2.theme.re23.b5;
import com.avito.android.lib.beduin_v2.theme.re23.c5;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoThemes.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/theme/all/a;", "LGQ0/a;", "_design-modules_beduin-v2_renderer_theme_all"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends GQ0.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f176613a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f176614b = C42727D.c(new C5234a());

    /* compiled from: AvitoThemes.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LHQ0/e;", "invoke", "()LHQ0/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.lib.beduin_v2.theme.all.a$a, reason: collision with other inner class name */
    public static final class C5234a extends N implements Y41.a<e> {
        public C5234a() {
            super(0);
        }

        @Override // Y41.a
        public final e invoke() {
            c5 c5Var = c5.f177104a;
            Context context = a.this.f176613a;
            c5Var.getClass();
            d dVar = new d(context, R.style.Theme_DesignSystem_Re23);
            a5 a5Var = new a5(dVar);
            return new e(new C31195c(dVar), new b5(dVar), a5Var, new C31183a(dVar), new C31351d(dVar));
        }
    }

    @Inject
    public a(@F @k Context context) {
        this.f176613a = context;
    }

    @Override // GQ0.a
    @k
    public final e a() {
        return (e) this.f176614b.getValue();
    }
}

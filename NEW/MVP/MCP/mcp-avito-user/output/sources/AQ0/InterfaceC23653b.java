package aq0;

import Y61.k;
import android.app.Application;
import android.content.Context;
import cE.C27025b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.features.auto.ab_tests.configs.AutoGlowFiltersTestGroup;
import com.avito.android.select.C34611b;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import kotlin.Metadata;
import oD.i;
import u3.g;
import ur.C49102c;

/* compiled from: SelectDialogDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Laq0/b;", "Lcom/avito/android/di/h;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: aq0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC23653b extends InterfaceC29971h {
    @k
    C49102c G();

    @k
    C34611b Pe();

    @i
    @k
    g<AutoGlowFiltersTestGroup> Q5();

    @k
    InterfaceC28373a a();

    @k
    InterfaceC28481c b();

    @k
    R0 c();

    @k
    InterfaceC35745a5 d();

    @k
    Context g();

    @k
    Application k();

    @k
    com.avito.android.remote.error.f o();

    @k
    Gson s();

    @k
    com.avito.android.analytics.provider.a v();

    @k
    C27025b v0();
}

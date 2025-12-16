package com.avito.android.beduin.context;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.SearchParams;
import gj.C40692c;
import java.util.Set;
import javax.inject.Inject;
import kj.C42699b;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import pj.InterfaceC47100c;

/* compiled from: BeduinContextFactoryImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/context/a;", "Lgj/d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements gj.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f103553a;

    @Inject
    public a(@k Context context) {
        this.f103553a = context;
    }

    @Override // gj.d
    @k
    public final c a(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.b bVar, @k InterfaceC47100c interfaceC47100c, @k Set set, @k C40692c c40692c, @l SearchParams searchParams, @k C42699b c42699b) {
        return new c(interfaceC47100c, (com.avito.android.beduin.context.di.b) C29972i.a(C29972i.b(this.f103553a), com.avito.android.beduin.context.di.b.class), set, aVar, bVar, c40692c, searchParams, c42699b);
    }
}

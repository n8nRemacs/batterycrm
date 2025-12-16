package com.yandex.div.core.dagger;

import android.renderscript.RenderScript;
import android.view.ContextThemeWrapper;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.yandex.div.core.C37918m;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.Q;
import com.yandex.div.core.S;
import com.yandex.div.core.X;
import com.yandex.div.core.dagger.j;
import com.yandex.div.core.h0;
import com.yandex.div.core.view2.C38026h;
import com.yandex.div.core.view2.C38040w;
import com.yandex.div.core.view2.divs.C37955g;
import h31.k;
import j.N;
import j.f0;
import javax.inject.Named;

/* compiled from: Div2Component.java */
@z
@h31.k
/* renamed from: com.yandex.div.core.dagger.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC37908b {

    /* compiled from: Div2Component.java */
    @k.a
    /* renamed from: com.yandex.div.core.dagger.b$a */
    public interface a {
        @h31.b
        @N
        a a(@N Q q12);

        @h31.b
        @N
        a b(@f0 @Named(BeduinPromoBlockModel.SERIALIZED_NAME_THEME) int i12);

        @N
        InterfaceC37908b build();

        @h31.b
        @N
        a c(@N ContextThemeWrapper contextThemeWrapper);

        @h31.b
        @N
        a d(@N com.yandex.div.core.expression.variables.e eVar);

        @N
        a e(@N C37918m c37918m);
    }

    @N
    com.yandex.div.core.player.f a();

    @N
    InterfaceC37915j b();

    @N
    com.yandex.div.core.downloader.i c();

    @N
    RenderScript d();

    @N
    com.yandex.div.core.expression.g e();

    @N
    com.yandex.div.core.tooltip.g f();

    @N
    X g();

    @N
    com.yandex.div.core.player.c h();

    @N
    Q i();

    @N
    S j();

    @N
    h0 k();

    @N
    com.yandex.div.histogram.reporter.a l();

    @N
    C37955g m();

    @N
    j.a n();

    @B
    @N
    boolean o();

    @N
    C38026h p();

    @N
    com.yandex.div.core.timer.b q();

    @N
    com.yandex.div.core.state.d r();

    @N
    C38040w s();

    @N
    com.yandex.div.core.view2.X t();
}

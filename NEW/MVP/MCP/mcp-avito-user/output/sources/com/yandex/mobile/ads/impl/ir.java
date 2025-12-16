package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;

/* loaded from: classes8.dex */
public final class ir implements com.yandex.div.core.font.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f386669a;

    public ir(@Y61.k Context context) {
        this.f386669a = context;
    }

    @Override // com.yandex.div.core.font.a
    @Y61.l
    public final Typeface getBold() throws Resources.NotFoundException {
        qw qwVarA = rw.a(this.f386669a);
        if (qwVarA != null) {
            return qwVarA.a();
        }
        return null;
    }

    @Override // com.yandex.div.core.font.a
    @Y61.l
    public final Typeface getLight() throws Resources.NotFoundException {
        qw qwVarA = rw.a(this.f386669a);
        if (qwVarA != null) {
            return qwVarA.b();
        }
        return null;
    }

    @Override // com.yandex.div.core.font.a
    @Y61.l
    public final Typeface getMedium() throws Resources.NotFoundException {
        qw qwVarA = rw.a(this.f386669a);
        if (qwVarA != null) {
            return qwVarA.c();
        }
        return null;
    }

    @Override // com.yandex.div.core.font.a
    @Y61.l
    public final Typeface getRegular() throws Resources.NotFoundException {
        qw qwVarA = rw.a(this.f386669a);
        if (qwVarA != null) {
            return qwVarA.d();
        }
        return null;
    }

    @j.P
    @Deprecated
    public Typeface getRegularLegacy() {
        return getRegular();
    }
}

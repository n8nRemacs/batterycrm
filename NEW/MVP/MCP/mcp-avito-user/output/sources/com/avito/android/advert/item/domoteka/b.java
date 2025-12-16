package com.avito.android.advert.item.domoteka;

import l41.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class b implements s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f75234c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f75235d;

    public /* synthetic */ b(c cVar, String str, int i12) {
        this.f75233b = i12;
        this.f75234c = cVar;
        this.f75235d = str;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f75233b) {
            case 0:
                return this.f75234c.f75236a.get().b(this.f75235d);
            default:
                return this.f75234c.f75236a.get().a(this.f75235d);
        }
    }
}

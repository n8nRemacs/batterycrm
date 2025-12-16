package com.avito.android.advert_core.messenger;

import l41.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class c implements s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83782b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f83783c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f83784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f83785e;

    public /* synthetic */ c(f fVar, String str, String str2, int i12) {
        this.f83782b = i12;
        this.f83783c = fVar;
        this.f83784d = str;
        this.f83785e = str2;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f83782b) {
            case 0:
                return this.f83783c.f83788a.get().sendCallMessage(this.f83784d, this.f83785e).r(d.f83786b);
            default:
                f fVar = this.f83783c;
                return fVar.f83788a.get().createChat(this.f83784d, this.f83785e, null, null).z(fVar.f83790c.a());
        }
    }
}

package com.avito.android.messenger;

import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C32523g implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f196357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32525i f196358c;

    public /* synthetic */ C32523g(C32525i c32525i, int i12) {
        this.f196357b = i12;
        this.f196358c = c32525i;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f196357b) {
            case 0:
                this.f196358c.f196373a.e().edit().putBoolean("dbPurgeIsNeeded", false).commit();
                break;
            default:
                this.f196358c.f196373a.e().edit().putBoolean("dbPurgeIsNeeded", true).commit();
                break;
        }
    }
}

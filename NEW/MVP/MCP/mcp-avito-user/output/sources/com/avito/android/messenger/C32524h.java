package com.avito.android.messenger;

import kotlin.collections.b1;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C32524h implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f196369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32525i f196370c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f196371d;

    public /* synthetic */ C32524h(C32525i c32525i, String str, int i12) {
        this.f196369b = i12;
        this.f196370c = c32525i;
        this.f196371d = str;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f196369b) {
            case 0:
                C32525i c32525i = this.f196370c;
                c32525i.f196373a.getF316a().edit().putStringSet("idsToPurge", b1.i(c32525i.a(), this.f196371d)).commit();
                break;
            default:
                C32525i c32525i2 = this.f196370c;
                c32525i2.f196373a.getF316a().edit().putStringSet("idsToPurge", b1.e(c32525i2.a(), this.f196371d)).commit();
                break;
        }
    }
}

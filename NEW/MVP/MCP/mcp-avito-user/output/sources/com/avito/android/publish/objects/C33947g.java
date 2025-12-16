package com.avito.android.publish.objects;

import Oi0.C14700d;
import android.view.ViewGroup;
import com.avito.android.publish.details.C33781q;
import javax.inject.Provider;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.publish.objects.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C33947g implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f238042b;

    public /* synthetic */ C33947g(Object obj, int i12) {
        this.f238041a = i12;
        this.f238042b = obj;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f238041a) {
            case 0:
                C33781q c33781q = ((ObjectFillFormFragment) this.f238042b).f237544P0;
                if (c33781q == null) {
                    return null;
                }
                return c33781q;
            case 1:
                com.avito.android.serp.adapter.mini_menu.b bVar = (com.avito.android.serp.adapter.mini_menu.b) this.f238042b;
                return new C14700d(bVar.f270319b, bVar.f270320c, bVar.f270322e);
            case 2:
                return (ViewGroup) this.f238042b;
            default:
                com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f238042b;
                return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
        }
    }
}

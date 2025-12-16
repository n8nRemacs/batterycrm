package com.avito.android.messenger.channels.mvi.view;

import android.view.MenuItem;
import cZ.AbstractC27130a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deeplink_handler.handler.b;
import java.util.List;
import pi.e;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.channels.mvi.view.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class MenuItemOnMenuItemClickListenerC31882k implements MenuItem.OnMenuItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f188765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f188766c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f188767d;

    public /* synthetic */ MenuItemOnMenuItemClickListenerC31882k(C31886o c31886o, AbstractC27130a abstractC27130a, int i12) {
        this.f188765b = i12;
        this.f188766c = c31886o;
        this.f188767d = abstractC27130a;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f188765b) {
            case 0:
                b.a.a(((C31886o) this.f188766c).f188778c, ((AbstractC27130a.C2047a) ((AbstractC27130a) this.f188767d)).f57930b, null, null, 6);
                break;
            case 1:
                b.a.a(((C31886o) this.f188766c).f188778c, ((AbstractC27130a.C2047a) ((AbstractC27130a) this.f188767d)).f57930b, null, null, 6);
                break;
            default:
                List<BeduinAction> listA = ((e.a) this.f188766c).a();
                if (listA != null) {
                    ((kotlin.jvm.internal.N) this.f188767d).invoke(listA);
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ MenuItemOnMenuItemClickListenerC31882k(e.a aVar, Y41.l lVar) {
        this.f188765b = 2;
        this.f188766c = aVar;
        this.f188767d = (kotlin.jvm.internal.N) lVar;
    }
}

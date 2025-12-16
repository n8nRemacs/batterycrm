package com.avito.android.serp.adapter.mini_menu.item;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.mini_menu.item.Badge;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import js0.InterfaceC42421a;
import kotlin.Metadata;

/* compiled from: MiniMenuElementPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/item/j;", "Lcom/avito/android/serp/adapter/mini_menu/item/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42421a f270367b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.android.serp.adapter.mini_menu.i f270368c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f270369d = new LinkedHashSet();

    @Inject
    public j(@Y61.k InterfaceC42421a interfaceC42421a) {
        this.f270367b = interfaceC42421a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        MiniMenuItem miniMenuItem = (MiniMenuItem) aVar;
        if (miniMenuItem.f270351g) {
            fVar.s3();
            return;
        }
        fVar.s3();
        String str = miniMenuItem.f270347c;
        fVar.setTitle(str);
        Badge badge = miniMenuItem.f270349e;
        if (badge instanceof Badge.ImageBadge) {
            fVar.R5(((Badge.ImageBadge) badge).f270342b);
        } else if (badge instanceof Badge.TextBadge) {
            Badge.TextBadge textBadge = (Badge.TextBadge) badge;
            fVar.bs(textBadge.f270343b, textBadge.f270344c, textBadge.f270345d);
        }
        fVar.a(new i(this, miniMenuItem, i12));
        fVar.tc();
        LinkedHashSet linkedHashSet = this.f270369d;
        if (linkedHashSet.contains(Integer.valueOf(i12))) {
            return;
        }
        linkedHashSet.add(Integer.valueOf(i12));
        this.f270367b.i(i12 + 1, str);
    }

    @Override // com.avito.android.serp.adapter.mini_menu.item.h
    public final void Z5(@Y61.k com.avito.android.serp.adapter.mini_menu.i iVar) {
        this.f270368c = iVar;
    }
}

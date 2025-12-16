package com.avito.android.constructor_advert.ui.serp.constructor.blueprint;

import Cr.InterfaceC13346a;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItemViewImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: HouseCardConstructorAdvertBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItemViewImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class c extends N implements p<ViewGroup, View, ConstructorAdvertItemViewImpl> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13346a f125806l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C36135w2 f125807m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25659b f125808n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.constructor_advert.ui.serp.constructor.b f125809o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC13346a interfaceC13346a, C36135w2 c36135w2, InterfaceC25659b interfaceC25659b, com.avito.android.constructor_advert.ui.serp.constructor.b bVar) {
        super(2);
        this.f125806l = interfaceC13346a;
        this.f125807m = c36135w2;
        this.f125808n = interfaceC25659b;
        this.f125809o = bVar;
    }

    @Override // Y41.p
    public final ConstructorAdvertItemViewImpl invoke(ViewGroup viewGroup, View view) {
        View view2 = view;
        C36135w2 c36135w2 = this.f125807m;
        boolean zBooleanValue = c36135w2.x().invoke().booleanValue();
        InterfaceC25659b interfaceC25659b = this.f125808n;
        com.avito.android.beduin_shared.common.component.adapter.b bVarC = zBooleanValue ? interfaceC25659b.c() : interfaceC25659b.a(0);
        AsyncViewportTracker.ViewContext viewContext = AsyncViewportTracker.ViewContext.f430413c;
        Integer numValueOf = Integer.valueOf(R.dimen.constructor_advert_image_corner_radius);
        c36135w2.x().invoke().booleanValue();
        return new ConstructorAdvertItemViewImpl(view2, this.f125806l, bVarC, this.f125809o, null, viewContext, null, numValueOf, null, false, 64, null);
    }
}

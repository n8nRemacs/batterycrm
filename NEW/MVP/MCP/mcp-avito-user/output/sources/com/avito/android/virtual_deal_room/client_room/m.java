package com.avito.android.virtual_deal_room.client_room;

import android.view.View;
import com.avito.android.virtual_deal_room.client_room.view.CategoryBottomSheetBehavior;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import zN0.c;

/* compiled from: ClientRoomView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class m extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f326335l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f326336m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zN0.c f326337n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j jVar, boolean z12, zN0.c cVar) {
        super(0);
        this.f326335l = jVar;
        this.f326336m = z12;
        this.f326337n = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        View view;
        j jVar = this.f326335l;
        boolean z12 = false;
        jVar.f326326k.setIgnoreInterceptTouchEvents(false);
        CategoryBottomSheetBehavior<View> categoryBottomSheetBehaviorB = jVar.b();
        boolean z13 = this.f326336m;
        categoryBottomSheetBehaviorB.N(j.a(jVar, z13), false);
        zN0.c cVar = this.f326337n;
        if (cVar instanceof c.b) {
            jVar.b().f356006l = j.a(jVar, z13);
        } else if (cVar instanceof c.InterfaceC12952c) {
            WeakReference<View> weakReference = jVar.b().f326418g0;
            if (weakReference != null && (view = weakReference.get()) != null && view.canScrollVertically(-1)) {
                z12 = true;
            }
            jVar.f326326k.setIgnoreNestedScrollDetection(!z12);
            jVar.b().f356006l = ((Number) jVar.f326328m.getValue()).intValue();
        }
        jVar.b().b(4);
        jVar.f326327l.requestLayout();
        return G0.f406611a;
    }
}

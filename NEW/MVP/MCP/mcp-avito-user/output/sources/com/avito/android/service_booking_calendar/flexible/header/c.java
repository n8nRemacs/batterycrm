package com.avito.android.service_booking_calendar.flexible.header;

import Y41.l;
import android.view.View;
import com.avito.android.lib.design.tooltip.k;
import it0.InterfaceC42106a;
import jt0.InterfaceC42425a;
import kotlin.jvm.internal.l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f275890b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f275891c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f275892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.a f275893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f275894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42106a f275895g;

    public /* synthetic */ c(k kVar, a aVar, l0.a aVar2, l lVar, InterfaceC42106a interfaceC42106a) {
        this.f275891c = kVar;
        this.f275892d = aVar;
        this.f275893e = aVar2;
        this.f275894f = lVar;
        this.f275895g = interfaceC42106a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f275890b) {
            case 0:
                this.f275893e.f406838b = true;
                this.f275891c.dismiss();
                a aVar = this.f275892d;
                aVar.f275868j = null;
                aVar.f275869k = null;
                this.f275894f.invoke(new InterfaceC42425a.h(this.f275895g));
                break;
            default:
                this.f275891c.dismiss();
                a aVar2 = this.f275892d;
                aVar2.f275868j = null;
                aVar2.f275869k = null;
                if (!this.f275893e.f406838b) {
                    this.f275894f.invoke(new InterfaceC42425a.d(this.f275895g));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c(l0.a aVar, k kVar, a aVar2, l lVar, InterfaceC42106a interfaceC42106a) {
        this.f275893e = aVar;
        this.f275891c = kVar;
        this.f275892d = aVar2;
        this.f275894f = lVar;
        this.f275895g = interfaceC42106a;
    }
}

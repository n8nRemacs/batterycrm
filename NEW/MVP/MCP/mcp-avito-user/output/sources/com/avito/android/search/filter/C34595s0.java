package com.avito.android.search.filter;

import EN.b;
import Ju.InterfaceC14249c;
import com.avito.android.inline_filters.calendar.deeplink.FiltersCalendarPickerDeepLink;
import java.util.Date;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: FiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "deepLinkResultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.search.filter.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34595s0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f263799b;

    public C34595s0(C34574h0 c34574h0) {
        this.f263799b = c34574h0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        if (interfaceC14249c instanceof FiltersCalendarPickerDeepLink.b) {
            C34574h0 c34574h0 = this.f263799b;
            c34574h0.getClass();
            T t12 = ((FiltersCalendarPickerDeepLink.b) interfaceC14249c).f171067b;
            if (t12 instanceof b.d) {
                b.d dVar = (b.d) t12;
                c34574h0.h(dVar.f3942a, dVar.f3943b);
            } else if (t12 instanceof b.a) {
                Date date = ((b.a) t12).f3938a;
                c34574h0.h(date, date);
            } else if (kotlin.jvm.internal.L.f(t12, b.C0228b.f3940a)) {
                c34574h0.h(null, null);
            } else {
                kotlin.jvm.internal.L.f(t12, b.c.f3941a);
            }
        }
    }
}

package com.avito.android.sx_address.new_address.view;

import com.avito.android.lib.design.chips.Chips;
import com.avito.android.sx_address.new_address.analytics.FormInputFieldName;
import com.avito.android.sx_address.new_address.domain.DetailItem;
import com.avito.android.sx_address.new_address.view.C35199f;
import com.avito.android.sx_address.new_address.view.r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DetailsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/h;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DetailItem f293896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35199f f293897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<FormInputFieldName, G0> f293898c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Chips f293899d;

    /* JADX WARN: Multi-variable type inference failed */
    public h(DetailItem detailItem, C35199f c35199f, Y41.l<? super FormInputFieldName, G0> lVar, Chips chips) {
        this.f293896a = detailItem;
        this.f293897b = c35199f;
        this.f293898c = lVar;
        this.f293899d = chips;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        if ((hVar instanceof C35199f.a ? (C35199f.a) hVar : null) != null) {
            DetailItem detailItem = this.f293896a;
            this.f293897b.f293889b.K5(DetailItem.a(detailItem, null));
            ((r.k) this.f293898c).invoke(FormInputFieldName.valueOf(detailItem.f293606b.toUpperCase(Locale.ROOT)));
        }
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        Object next;
        if ((hVar instanceof C35199f.a ? (C35199f.a) hVar : null) != null) {
            this.f293899d.setError(null);
            DetailItem detailItem = this.f293896a;
            Iterator it = detailItem.f293609e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (L.f(((DetailItem.Option) next).f293613c, ((C35199f.a) hVar).f293892b)) {
                        break;
                    }
                }
            }
            DetailItem.Option option = (DetailItem.Option) next;
            DetailItem detailItemA = DetailItem.a(detailItem, option != null ? option.f293612b : null);
            C35199f c35199f = this.f293897b;
            LinkedHashMap linkedHashMap = c35199f.f293891d;
            String str = detailItem.f293606b;
            Y41.a aVar = (Y41.a) linkedHashMap.get(str);
            if (aVar != null) {
            }
            c35199f.f293889b.K5(detailItemA);
            ((r.k) this.f293898c).invoke(FormInputFieldName.valueOf(str.toUpperCase(Locale.ROOT)));
        }
    }
}

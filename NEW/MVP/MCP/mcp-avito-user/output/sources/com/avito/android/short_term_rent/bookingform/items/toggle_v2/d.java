package com.avito.android.short_term_rent.bookingform.items.toggle_v2;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.short_term_rent.view.components.toggle_v2.ToggleV2;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import tw0.InterfaceC48733a;

/* compiled from: ToggleV2ItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/toggle_v2/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/short_term_rent/bookingform/items/toggle_v2/c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ToggleV2 f281734b;

    /* compiled from: ToggleV2ItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/short_term_rent/bookingform/items/toggle_v2/d$a", "Lcom/avito/android/short_term_rent/view/components/toggle_v2/ToggleV2$a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ToggleV2.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<ToggleV2Options, G0> f281735a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super ToggleV2Options, G0> lVar) {
            this.f281735a = lVar;
        }

        @Override // com.avito.android.short_term_rent.view.components.toggle_v2.ToggleV2.a
        public final void a(@k InterfaceC48733a interfaceC48733a) {
            if (interfaceC48733a instanceof ToggleV2Options) {
                this.f281735a.invoke(interfaceC48733a);
            }
        }
    }

    public d(@k View view) {
        super(view);
        this.f281734b = (ToggleV2) view;
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.toggle_v2.c
    public final void i5(@k l<? super ToggleV2Options, G0> lVar) {
        this.f281734b.setSelectedListener(new a(lVar));
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.toggle_v2.c
    public final void k7(@k List<ToggleV2Options> list) {
        Object next;
        ToggleV2 toggleV2 = this.f281734b;
        toggleV2.setData(list);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ToggleV2Options) next).f281729f) {
                    break;
                }
            }
        }
        ToggleV2Options toggleV2Options = (ToggleV2Options) next;
        if (toggleV2Options != null) {
            toggleV2.b(toggleV2Options);
        }
    }
}

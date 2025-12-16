package com.avito.android.publish.items.int_range;

import androidx.compose.runtime.internal.P;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.search.Theme;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: IntRangeItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/int_range/i;", "Lcom/avito/android/publish/items/int_range/f;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<b> f236980b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f236981c;

    @Inject
    public i() {
        com.jakewharton.rxrelay3.c<b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f236980b = cVar;
        this.f236981c = cVar;
    }

    public static final Long k(i iVar, String str) {
        iVar.getClass();
        String string = C43066x.A0(str).toString();
        if (string.length() <= 0) {
            string = null;
            break;
        }
        for (int i12 = 0; i12 < string.length(); i12++) {
            if (!Character.isDigit(string.charAt(i12))) {
                string = null;
                break;
            }
        }
        if (string != null) {
            return Long.valueOf(Long.parseLong(string));
        }
        return null;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        b bVar = (b) aVar;
        Theme theme = bVar.f236968f;
        if (theme != null) {
            kVar.aS(theme);
        }
        kVar.mg(bVar.f236965c, new g(bVar, this));
        kVar.YW(bVar.f236966d, new h(bVar, this));
        kVar.JA(bVar.f236967e);
    }

    @Override // com.avito.android.publish.items.int_range.f
    @Y61.k
    public final z<b> b() {
        return this.f236981c;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        k kVar = (k) eVar;
        b bVar = (b) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof e) {
                obj = obj2;
            }
        }
        e eVar2 = (e) (obj instanceof e ? obj : null);
        if (eVar2 == null) {
            Theme theme = bVar.f236968f;
            if (theme != null) {
                kVar.aS(theme);
            }
            kVar.mg(bVar.f236965c, new g(bVar, this));
            kVar.YW(bVar.f236966d, new h(bVar, this));
            kVar.JA(bVar.f236967e);
            return;
        }
        Theme theme2 = eVar2.f236975d;
        if (theme2 != null) {
            kVar.aS(theme2);
        }
        if (eVar2.f236972a != null) {
            kVar.mg(bVar.f236965c, new g(bVar, this));
        }
        if (eVar2.f236973b != null) {
            kVar.YW(bVar.f236966d, new h(bVar, this));
        }
        ItemWithState.State state = eVar2.f236974c;
        if (state != null) {
            kVar.JA(state);
        }
    }
}

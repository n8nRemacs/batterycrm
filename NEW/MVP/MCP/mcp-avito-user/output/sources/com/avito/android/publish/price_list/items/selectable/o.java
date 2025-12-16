package com.avito.android.publish.price_list.items.selectable;

import androidx.compose.runtime.internal.P;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SelectablePriceListItemRe23Presenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/items/selectable/o;", "Lcom/avito/android/publish/price_list/items/selectable/l;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f238694b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f238695c;

    @Inject
    public o() {
        e2 e2VarB = f2.b(0, 1, BufferOverflow.f410778c, 1);
        this.f238694b = e2VarB;
        this.f238695c = e2VarB;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((q) eVar, (d) aVar);
    }

    @Override // com.avito.android.publish.price_list.items.selectable.l
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final e2 getF238695c() {
        return this.f238695c;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        q qVar = (q) eVar;
        d dVar = (d) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.publish.price_list.items.diff.f) {
                obj = obj2;
            }
        }
        if (!(obj instanceof com.avito.android.publish.price_list.items.diff.f)) {
            obj = null;
        }
        com.avito.android.publish.price_list.items.diff.f fVar = (com.avito.android.publish.price_list.items.diff.f) obj;
        if (fVar == null) {
            k(qVar, dVar);
            return;
        }
        if (dVar.f238672c != null) {
            qVar.f(null);
            String str = dVar.f238672c;
            if (str == null) {
                str = "";
            }
            qVar.setError(str);
        } else {
            qVar.f(dVar.f238675f);
            qVar.setError(null);
        }
        qVar.Zd(fVar.f238626a);
        qVar.a(new m(this, dVar));
    }

    public final void k(@Y61.k q qVar, @Y61.k d dVar) {
        String str = dVar.f238674e;
        if (str == null) {
            str = "";
        }
        qVar.setTitle(str);
        if (dVar.f238672c != null) {
            qVar.f(null);
            String str2 = dVar.f238672c;
            qVar.setError(str2 != null ? str2 : "");
        } else {
            qVar.f(dVar.f238675f);
            qVar.setError(null);
        }
        qVar.Zd(dVar.f238676g);
        qVar.a(new n(this, dVar));
    }
}

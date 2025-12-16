package com.avito.android.publish.price_list.domain;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.i2;

/* compiled from: SelectPriceListSearchInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/domain/m;", "Lcom/avito/android/publish/price_list/domain/j;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f238575a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f238576b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f238577c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f238578d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f238579e;

    @Inject
    public m(@Y61.l String str, @Y61.k R0 r02) {
        this.f238575a = str;
        this.f238576b = r02;
        this.f238577c = f2.b(0, 1, BufferOverflow.f410778c, 1);
        this.f238578d = new ArrayList();
        this.f238579e = new ArrayList();
    }

    @Override // com.avito.android.publish.price_list.domain.j
    public final void B(@Y61.k List<? extends com.avito.conveyor_item.a> list) {
        ArrayList arrayList = this.f238578d;
        arrayList.clear();
        ArrayList arrayList2 = this.f238579e;
        arrayList2.clear();
        arrayList.addAll(list);
        List<? extends com.avito.conveyor_item.a> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((com.avito.conveyor_item.a) it.next()) instanceof com.avito.android.publish.price_list.items.group.a) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list2) {
                        if (obj instanceof com.avito.android.publish.price_list.items.group.a) {
                            arrayList3.add(obj);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        C42745f0.h(((com.avito.android.publish.price_list.items.group.a) it2.next()).f238632e, arrayList4);
                    }
                    arrayList2.addAll(arrayList4);
                    return;
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof com.avito.android.publish.price_list.items.selectable.d) {
                arrayList5.add(obj2);
            }
        }
        arrayList2.addAll(arrayList5);
    }

    @Override // com.avito.android.publish.price_list.domain.j
    public final void a(@Y61.k String str) {
        this.f238577c.K5(str);
    }

    @Override // com.avito.android.publish.price_list.domain.j
    @Y61.k
    @C0
    public final InterfaceC43160i b(@Y61.k A1.a aVar) {
        return C43175k.S(C43175k.I(this.f238576b.c(), new C43152f0(C43175k.r(new k(C43175k.n(this.f238577c, 400L), this)), new l(3, null))), aVar, i2.a.b(i2.f411430a, 0L, 3), 0);
    }

    public /* synthetic */ m(String str, R0 r02, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, r02);
    }
}

package com.avito.android.publish.slots.address_from_profile.publish_item;

import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.text.C43059p;
import kotlin.text.RegexOption;

/* compiled from: FilterController.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/publish_item/o;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public List<k> f242936a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public List<k> f242937b = this.f242936a;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public String f242938c = "";

    /* renamed from: d, reason: collision with root package name */
    public int f242939d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f242940e = -1;

    public static Q a(int i12, k kVar, List list) {
        ArrayList arrayList = new ArrayList(list);
        int i13 = -1;
        if (i12 != -1) {
        }
        Iterator it = arrayList.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (L.f(((k) it.next()).f242922b, kVar.f242922b)) {
                i13 = i14;
                break;
            }
            i14++;
        }
        arrayList.set(i13, k.a(kVar, false, true, 63));
        return new Q(Integer.valueOf(i13), arrayList);
    }

    @Y61.l
    public final List<k> b() {
        List<k> list = this.f242936a;
        if (list == null) {
            return null;
        }
        List arrayList = C42784z0.f406748b;
        for (Object obj : list) {
            k kVar = (k) obj;
            C43059p c43059p = new C43059p(this.f242938c, RegexOption.f410582c);
            if (!c43059p.a(kVar.f242925e)) {
                if (c43059p.a(kVar.f242924d + ", " + kVar.f242923c)) {
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = new ArrayList();
            }
            v0.b(arrayList).add(obj);
        }
        return arrayList;
    }

    public final void c(@Y61.k List<k> list) {
        this.f242936a = list;
        this.f242937b = list;
        Iterator<k> it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (it.next().f242928h) {
                break;
            } else {
                i12++;
            }
        }
        this.f242939d = i12;
        this.f242940e = i12;
    }
}

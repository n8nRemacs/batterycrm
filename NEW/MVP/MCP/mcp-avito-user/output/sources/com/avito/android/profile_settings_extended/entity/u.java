package com.avito.android.profile_settings_extended.entity;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.DeeplinkAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SettingsData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/u;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final DeeplinkAction f230356a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<v> f230357b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f230358c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f230359d;

    /* compiled from: SettingsData.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "LQH/a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<List<? extends QH.a>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends QH.a> invoke() {
            List<v> list = u.this.f230357b;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C42745f0.h(((v) it.next()).getItems(), arrayList);
            }
            return arrayList;
        }
    }

    public u(@Y61.l DeeplinkAction deeplinkAction, @Y61.l String str, @Y61.k List list) {
        this.f230356a = deeplinkAction;
        this.f230357b = list;
        this.f230358c = str;
        this.f230359d = C42727D.c(new a());
    }

    public static u a(u uVar, ArrayList arrayList) {
        DeeplinkAction deeplinkAction = uVar.f230356a;
        String str = uVar.f230358c;
        uVar.getClass();
        return new u(deeplinkAction, str, arrayList);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return L.f(this.f230356a, uVar.f230356a) && L.f(this.f230357b, uVar.f230357b) && L.f(this.f230358c, uVar.f230358c);
    }

    public final int hashCode() {
        DeeplinkAction deeplinkAction = this.f230356a;
        int iE2 = H.e((deeplinkAction == null ? 0 : deeplinkAction.hashCode()) * 31, 31, this.f230357b);
        String str = this.f230358c;
        return iE2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SettingsData(action=");
        sb2.append(this.f230356a);
        sb2.append(", itemsGroups=");
        sb2.append(this.f230357b);
        sb2.append(", beduinJson=");
        return C22026a.c(sb2, this.f230358c, ')');
    }

    public /* synthetic */ u(DeeplinkAction deeplinkAction, List list, String str, int i12, C42822w c42822w) {
        this(deeplinkAction, (i12 & 4) != 0 ? null : str, list);
    }
}

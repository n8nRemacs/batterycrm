package com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title;

import androidx.compose.foundation.H;
import com.avito.android.user_adverts.model.UserAdvertsGroupSelectedState;
import com.avito.android.user_adverts.model.UserAdvertsShortcutGroup;
import com.avito.conveyor_item.a;
import j.e0;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import wJ0.g;

/* compiled from: ShortcutTitleItem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/shortcut_title/d;", "Lcom/avito/android/conveyor_shared_item/single_text/a;", "LwJ0/f;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d implements com.avito.android.conveyor_shared_item.single_text.a, wJ0.f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f314768b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UserAdvertsShortcutGroup f314769c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final UserAdvertsGroupSelectedState f314770d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f314771e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f314772f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<wJ0.g<?>> f314773g;

    /* compiled from: ShortcutTitleItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/shortcut_title/d$a;", "LwJ0/g$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements g.c {

        /* renamed from: a, reason: collision with root package name */
        public final int f314774a;

        /* renamed from: b, reason: collision with root package name */
        public final int f314775b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final g.a<Integer> f314776c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f314777d;

        public a() {
            throw null;
        }

        public a(int i12, int i13, g.a aVar, boolean z12, int i14, C42822w c42822w) {
            z12 = (i14 & 8) != 0 ? false : z12;
            this.f314774a = i12;
            this.f314775b = i13;
            this.f314776c = aVar;
            this.f314777d = z12;
        }

        @Override // wJ0.g
        /* renamed from: a, reason: from getter */
        public final boolean getF314777d() {
            return this.f314777d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f314774a == aVar.f314774a && this.f314775b == aVar.f314775b && L.f(this.f314776c, aVar.f314776c) && this.f314777d == aVar.f314777d;
        }

        public final int hashCode() {
            int iE2 = androidx.appcompat.app.r.e(this.f314775b, Integer.hashCode(this.f314774a) * 31, 31);
            g.a<Integer> aVar = this.f314776c;
            return Boolean.hashCode(this.f314777d) + ((iE2 + (aVar == null ? 0 : aVar.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MultiActionTooltip(title=");
            sb2.append(this.f314774a);
            sb2.append(", text=");
            sb2.append(this.f314775b);
            sb2.append(", button=");
            sb2.append(this.f314776c);
            sb2.append(", showTooltip=");
            return androidx.appcompat.app.r.x(sb2, this.f314777d, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.l String str, @Y61.k UserAdvertsShortcutGroup userAdvertsShortcutGroup, @Y61.l UserAdvertsGroupSelectedState userAdvertsGroupSelectedState, @Y61.l @e0 Integer num, @Y61.k String str2, @Y61.k List<? extends wJ0.g<?>> list) {
        this.f314768b = str;
        this.f314769c = userAdvertsShortcutGroup;
        this.f314770d = userAdvertsGroupSelectedState;
        this.f314771e = num;
        this.f314772f = str2;
        this.f314773g = list;
    }

    public static d a(d dVar) {
        return new d(dVar.f314768b, dVar.f314769c, null, dVar.f314771e, dVar.f314772f, dVar.f314773g);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f314768b, dVar.f314768b) && L.f(this.f314769c, dVar.f314769c) && this.f314770d == dVar.f314770d && L.f(this.f314771e, dVar.f314771e) && L.f(this.f314772f, dVar.f314772f) && L.f(this.f314773g, dVar.f314773g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF299922b() {
        return this.f314772f;
    }

    @Override // com.avito.android.conveyor_shared_item.single_text.a
    @Y61.k
    /* renamed from: getTitle */
    public final String getF314726b() {
        String str = this.f314768b;
        return str == null ? "" : str;
    }

    public final int hashCode() {
        String str = this.f314768b;
        int iHashCode = (this.f314769c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        UserAdvertsGroupSelectedState userAdvertsGroupSelectedState = this.f314770d;
        int iHashCode2 = (iHashCode + (userAdvertsGroupSelectedState == null ? 0 : userAdvertsGroupSelectedState.hashCode())) * 31;
        Integer num = this.f314771e;
        return this.f314773g.hashCode() + H.d((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f314772f);
    }

    @Override // wJ0.f
    @Y61.k
    public final List<wJ0.g<?>> i() {
        return this.f314773g;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShortcutTitleItem(shortcutTitle=");
        sb2.append(this.f314768b);
        sb2.append(", shortcutGroup=");
        sb2.append(this.f314769c);
        sb2.append(", selectedState=");
        sb2.append(this.f314770d);
        sb2.append(", fallbackTitleRes=");
        sb2.append(this.f314771e);
        sb2.append(", stringId=");
        sb2.append(this.f314772f);
        sb2.append(", tooltips=");
        return H.p(sb2, this.f314773g, ')');
    }

    public d(String str, UserAdvertsShortcutGroup userAdvertsShortcutGroup, UserAdvertsGroupSelectedState userAdvertsGroupSelectedState, Integer num, String str2, List list, int i12, C42822w c42822w) {
        this(str, userAdvertsShortcutGroup, (i12 & 4) != 0 ? null : userAdvertsGroupSelectedState, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? UUID.randomUUID().toString() : str2, (i12 & 32) != 0 ? C42784z0.f406748b : list);
    }
}

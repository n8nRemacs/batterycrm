package com.avito.android.user_advert.advert.items.bbl_contact_history;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BblContactHistoryItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/bbl_contact_history/a;", "Lcom/avito/conveyor_item/a;", "a", "b", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309273b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f309274c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final b f309275d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C9483a f309276e;

    /* renamed from: f, reason: collision with root package name */
    public final int f309277f;

    /* compiled from: BblContactHistoryItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/bbl_contact_history/a$a;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_advert.advert.items.bbl_contact_history.a$a, reason: collision with other inner class name */
    public static final /* data */ class C9483a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f309278a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f309279b;

        public C9483a(@k String str, @k DeepLink deepLink) {
            this.f309278a = str;
            this.f309279b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9483a)) {
                return false;
            }
            C9483a c9483a = (C9483a) obj;
            return L.f(this.f309278a, c9483a.f309278a) && L.f(this.f309279b, c9483a.f309279b);
        }

        public final int hashCode() {
            return this.f309279b.hashCode() + (this.f309278a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContactsButton(title=");
            sb2.append(this.f309278a);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f309279b, ')');
        }
    }

    /* compiled from: BblContactHistoryItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/bbl_contact_history/a$b;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f309280a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f309281b;

        public b(@k String str, @k DeepLink deepLink) {
            this.f309280a = str;
            this.f309281b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f309280a, bVar.f309280a) && L.f(this.f309281b, bVar.f309281b);
        }

        public final int hashCode() {
            return this.f309281b.hashCode() + (this.f309280a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HistoryItem(title=");
            sb2.append(this.f309280a);
            sb2.append(", action=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f309281b, ')');
        }
    }

    public a(@k String str, @k b bVar, @l b bVar2, @l C9483a c9483a, @InterfaceC42150f int i12) {
        this.f309273b = str;
        this.f309274c = bVar;
        this.f309275d = bVar2;
        this.f309276e = c9483a;
        this.f309277f = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309273b, aVar.f309273b) && L.f(this.f309274c, aVar.f309274c) && L.f(this.f309275d, aVar.f309275d) && L.f(this.f309276e, aVar.f309276e) && this.f309277f == aVar.f309277f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272437b() {
        return getF310021b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF310326b() {
        return this.f309273b;
    }

    public final int hashCode() {
        int iHashCode = (this.f309274c.hashCode() + (this.f309273b.hashCode() * 31)) * 31;
        b bVar = this.f309275d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C9483a c9483a = this.f309276e;
        return Integer.hashCode(this.f309277f) + ((iHashCode2 + (c9483a != null ? c9483a.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BblContactHistoryItem(stringId=");
        sb2.append(this.f309273b);
        sb2.append(", contactsInfo=");
        sb2.append(this.f309274c);
        sb2.append(", history=");
        sb2.append(this.f309275d);
        sb2.append(", contactsButton=");
        sb2.append(this.f309276e);
        sb2.append(", backgroundColor=");
        return r.t(sb2, this.f309277f, ')');
    }
}

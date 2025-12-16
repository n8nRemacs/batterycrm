package com.avito.android.user_advert.advert.items.contacts_bbl;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactsBblItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/contacts_bbl/a;", "Lcom/avito/conveyor_item/a;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309317b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C9484a f309318c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f309319d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f309320e;

    /* compiled from: ContactsBblItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/contacts_bbl/a$a;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_advert.advert.items.contacts_bbl.a$a, reason: collision with other inner class name */
    public static final /* data */ class C9484a {

        /* renamed from: a, reason: collision with root package name */
        public final int f309321a;

        /* renamed from: b, reason: collision with root package name */
        public final float f309322b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f309323c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final UniversalColor f309324d;

        public C9484a(int i12, float f12, @l String str, @l UniversalColor universalColor) {
            this.f309321a = i12;
            this.f309322b = f12;
            this.f309323c = str;
            this.f309324d = universalColor;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9484a)) {
                return false;
            }
            C9484a c9484a = (C9484a) obj;
            return this.f309321a == c9484a.f309321a && Float.compare(this.f309322b, c9484a.f309322b) == 0 && L.f(this.f309323c, c9484a.f309323c) && L.f(this.f309324d, c9484a.f309324d);
        }

        public final int hashCode() {
            int iD2 = r.d(this.f309322b, Integer.hashCode(this.f309321a) * 31, 31);
            String str = this.f309323c;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            UniversalColor universalColor = this.f309324d;
            return iHashCode + (universalColor != null ? universalColor.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BblContact(count=");
            sb2.append(this.f309321a);
            sb2.append(", progress=");
            sb2.append(this.f309322b);
            sb2.append(", icon=");
            sb2.append(this.f309323c);
            sb2.append(", progressColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f309324d, ')');
        }
    }

    public a(@k String str, @k C9484a c9484a, @k AttributedText attributedText, @k DeepLink deepLink) {
        this.f309317b = str;
        this.f309318c = c9484a;
        this.f309319d = attributedText;
        this.f309320e = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309317b, aVar.f309317b) && L.f(this.f309318c, aVar.f309318c) && L.f(this.f309319d, aVar.f309319d) && L.f(this.f309320e, aVar.f309320e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272342b() {
        return getF290919b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF290919b() {
        return this.f309317b;
    }

    public final int hashCode() {
        return this.f309320e.hashCode() + com.avito.android.actions_sheet.a.b((this.f309318c.hashCode() + (this.f309317b.hashCode() * 31)) * 31, 31, this.f309319d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactsBblItem(stringId=");
        sb2.append(this.f309317b);
        sb2.append(", bblContact=");
        sb2.append(this.f309318c);
        sb2.append(", text=");
        sb2.append(this.f309319d);
        sb2.append(", action=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f309320e, ')');
    }
}

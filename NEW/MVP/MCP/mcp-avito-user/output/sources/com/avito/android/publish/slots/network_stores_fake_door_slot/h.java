package com.avito.android.publish.slots.network_stores_fake_door_slot;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NetworkStoresFakeDoorSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/network_stores_fake_door_slot/h;", "Lcom/avito/conveyor_item/a;", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class h implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f244620b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f244621c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<a> f244622d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<b> f244623e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f244624f;

    /* compiled from: NetworkStoresFakeDoorSlotItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/network_stores_fake_door_slot/h$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f244625a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f244626b;

        public a(@Y61.l String str, @Y61.l String str2) {
            this.f244625a = str;
            this.f244626b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f244625a, aVar.f244625a) && L.f(this.f244626b, aVar.f244626b);
        }

        public final int hashCode() {
            String str = this.f244625a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f244626b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ConditionItem(title=");
            sb2.append(this.f244625a);
            sb2.append(", icon=");
            return C22026a.c(sb2, this.f244626b, ')');
        }
    }

    /* compiled from: NetworkStoresFakeDoorSlotItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/network_stores_fake_door_slot/h$b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f244627a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Boolean f244628b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final UniversalImage f244629c;

        public b(@Y61.l String str, @Y61.l Boolean bool, @Y61.l UniversalImage universalImage) {
            this.f244627a = str;
            this.f244628b = bool;
            this.f244629c = universalImage;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f244627a, bVar.f244627a) && L.f(this.f244628b, bVar.f244628b) && L.f(this.f244629c, bVar.f244629c);
        }

        public final int hashCode() {
            String str = this.f244627a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f244628b;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            UniversalImage universalImage = this.f244629c;
            return iHashCode2 + (universalImage != null ? universalImage.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InformationCardItem(text=");
            sb2.append(this.f244627a);
            sb2.append(", imageGravityToRight=");
            sb2.append(this.f244628b);
            sb2.append(", universalImage=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f244629c, ')');
        }
    }

    public h(@Y61.k String str, @Y61.l String str2, @Y61.l List<a> list, @Y61.l List<b> list2, @Y61.l String str3) {
        this.f244620b = str;
        this.f244621c = str2;
        this.f244622d = list;
        this.f244623e = list2;
        this.f244624f = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f244620b, hVar.f244620b) && L.f(this.f244621c, hVar.f244621c) && L.f(this.f244622d, hVar.f244622d) && L.f(this.f244623e, hVar.f244623e) && L.f(this.f244624f, hVar.f244624f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222258b() {
        return getF8946b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF8946b() {
        return this.f244620b;
    }

    public final int hashCode() {
        int iHashCode = this.f244620b.hashCode() * 31;
        String str = this.f244621c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<a> list = this.f244622d;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<b> list2 = this.f244623e;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.f244624f;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkStoresFakeDoorSlotItem(stringId=");
        sb2.append(this.f244620b);
        sb2.append(", title=");
        sb2.append(this.f244621c);
        sb2.append(", conditionsList=");
        sb2.append(this.f244622d);
        sb2.append(", informationCards=");
        sb2.append(this.f244623e);
        sb2.append(", price=");
        return C22026a.c(sb2, this.f244624f, ')');
    }
}

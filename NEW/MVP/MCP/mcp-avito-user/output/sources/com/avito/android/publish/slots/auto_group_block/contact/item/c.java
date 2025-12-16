package com.avito.android.publish.slots.auto_group_block.contact.item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import j.InterfaceC42150f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GroupContactItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/auto_group_block/contact/item/c;", "Lcom/avito/conveyor_item/a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f243076b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f243077c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f243078d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f243079e;

    public c(@k String str, @k String str2, @l String str3, @k ArrayList arrayList) {
        this.f243076b = str;
        this.f243077c = str2;
        this.f243078d = str3;
        this.f243079e = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f243076b, cVar.f243076b) && L.f(this.f243077c, cVar.f243077c) && L.f(this.f243078d, cVar.f243078d) && this.f243079e.equals(cVar.f243079e);
    }

    @Override // TV0.a
    public final long getId() {
        return getF270696b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270696b() {
        return this.f243076b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f243076b.hashCode() * 31, 31, this.f243077c);
        String str = this.f243078d;
        return this.f243079e.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupContactItem(stringId=");
        sb2.append(this.f243076b);
        sb2.append(", slotId=");
        sb2.append(this.f243077c);
        sb2.append(", buttonText=");
        sb2.append(this.f243078d);
        sb2.append(", contactDetailsBlocks=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f243079e, ')');
    }

    /* compiled from: GroupContactItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/auto_group_block/contact/item/c$a;", "", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final b f243080a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C7287a f243081b;

        /* compiled from: GroupContactItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/auto_group_block/contact/item/c$a$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.slots.auto_group_block.contact.item.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7287a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f243082a;

            /* renamed from: b, reason: collision with root package name */
            public final int f243083b;

            public C7287a(String str, int i12, int i13, C42822w c42822w) {
                i12 = (i13 & 2) != 0 ? R.attr.textM20 : i12;
                this.f243082a = str;
                this.f243083b = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7287a)) {
                    return false;
                }
                C7287a c7287a = (C7287a) obj;
                return L.f(this.f243082a, c7287a.f243082a) && this.f243083b == c7287a.f243083b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f243083b) + (this.f243082a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Subtitle(text=");
                sb2.append(this.f243082a);
                sb2.append(", textAppearance=");
                return r.t(sb2, this.f243083b, ')');
            }
        }

        public a(@k b bVar, @k C7287a c7287a) {
            this.f243080a = bVar;
            this.f243081b = c7287a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f243080a, aVar.f243080a) && L.f(this.f243081b, aVar.f243081b);
        }

        public final int hashCode() {
            return this.f243081b.hashCode() + (this.f243080a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ContactDetailsBlock(title=" + this.f243080a + ", subtitle=" + this.f243081b + ')';
        }

        /* compiled from: GroupContactItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/auto_group_block/contact/item/c$a$b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f243084a;

            /* renamed from: b, reason: collision with root package name */
            public final int f243085b;

            public b(@k String str, @InterfaceC42150f int i12) {
                this.f243084a = str;
                this.f243085b = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f243084a, bVar.f243084a) && this.f243085b == bVar.f243085b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f243085b) + (this.f243084a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Title(text=");
                sb2.append(this.f243084a);
                sb2.append(", textAppearance=");
                return r.t(sb2, this.f243085b, ')');
            }

            public /* synthetic */ b(String str, int i12, int i13, C42822w c42822w) {
                this(str, (i13 & 2) != 0 ? R.attr.textH40 : i12);
            }
        }
    }
}

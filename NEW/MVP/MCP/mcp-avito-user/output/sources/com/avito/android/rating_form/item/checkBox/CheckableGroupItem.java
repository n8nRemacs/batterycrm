package com.avito.android.rating_form.item.checkBox;

import ah0.InterfaceC19890a;
import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.FieldIdentifier;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CheckableGroupItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/item/checkBox/CheckableGroupItem;", "Lcom/avito/conveyor_item/a;", "Lah0/a;", "a", "Type", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CheckableGroupItem implements com.avito.conveyor_item.a, InterfaceC19890a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f248282b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FieldIdentifier f248283c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f248284d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final PrintableText f248285e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f248286f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Type f248287g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckableGroupItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/checkBox/CheckableGroupItem$Type;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f248288b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f248289c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f248290d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f248291e;

        static {
            Type type = new Type("CHECKBOX", 0);
            f248288b = type;
            Type type2 = new Type("RADIO_BUTTON", 1);
            f248289c = type2;
            Type[] typeArr = {type, type2};
            f248290d = typeArr;
            f248291e = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f248290d.clone();
        }
    }

    public CheckableGroupItem(@Y61.k String str, @Y61.k FieldIdentifier fieldIdentifier, @Y61.l String str2, @Y61.l PrintableText printableText, @Y61.k List<a> list, @Y61.k Type type) {
        this.f248282b = str;
        this.f248283c = fieldIdentifier;
        this.f248284d = str2;
        this.f248285e = printableText;
        this.f248286f = list;
        this.f248287g = type;
    }

    @Override // ah0.InterfaceC19890a
    public final boolean b() {
        Iterable iterable = (Iterable) this.f248286f;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).f248295d) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckableGroupItem)) {
            return false;
        }
        CheckableGroupItem checkableGroupItem = (CheckableGroupItem) obj;
        return L.f(this.f248282b, checkableGroupItem.f248282b) && this.f248283c.equals(checkableGroupItem.f248283c) && L.f(this.f248284d, checkableGroupItem.f248284d) && L.f(this.f248285e, checkableGroupItem.f248285e) && L.f(this.f248286f, checkableGroupItem.f248286f) && this.f248287g == checkableGroupItem.f248287g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return getF245107b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF245107b() {
        return this.f248282b;
    }

    public final int hashCode() {
        int iHashCode = (this.f248283c.hashCode() + (this.f248282b.hashCode() * 31)) * 31;
        String str = this.f248284d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PrintableText printableText = this.f248285e;
        return this.f248287g.hashCode() + C23088b.a((iHashCode2 + (printableText != null ? printableText.hashCode() : 0)) * 31, 31, this.f248286f);
    }

    @Y61.k
    public final String toString() {
        return "CheckableGroupItem(stringId=" + this.f248282b + ", fieldIdentifier=" + this.f248283c + ", title=" + this.f248284d + ", errorText=" + this.f248285e + ", values=" + this.f248286f + ", type=" + this.f248287g + ')';
    }

    /* compiled from: CheckableGroupItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/checkBox/CheckableGroupItem$a;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f248292a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f248293b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f248294c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f248295d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f248296e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f248297f;

        public a(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, boolean z12, boolean z13, boolean z14) {
            this.f248292a = str;
            this.f248293b = str2;
            this.f248294c = str3;
            this.f248295d = z12;
            this.f248296e = z13;
            this.f248297f = z14;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getF248297f() {
            return this.f248297f;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f248292a, aVar.f248292a) && L.f(this.f248293b, aVar.f248293b) && L.f(this.f248294c, aVar.f248294c) && this.f248295d == aVar.f248295d && this.f248296e == aVar.f248296e && this.f248297f == aVar.f248297f;
        }

        public final int hashCode() {
            int iHashCode = this.f248292a.hashCode() * 31;
            String str = this.f248293b;
            return Boolean.hashCode(this.f248297f) + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f248294c), 31, this.f248295d), 31, this.f248296e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CheckableListValueItem(label=");
            sb2.append(this.f248292a);
            sb2.append(", description=");
            sb2.append(this.f248293b);
            sb2.append(", value=");
            sb2.append(this.f248294c);
            sb2.append(", isChecked=");
            sb2.append(this.f248295d);
            sb2.append(", isEnabled=");
            sb2.append(this.f248296e);
            sb2.append(", hasError=");
            return androidx.appcompat.app.r.x(sb2, this.f248297f, ')');
        }

        public /* synthetic */ a(String str, String str2, String str3, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, str3, (i12 & 8) != 0 ? false : z12, z13, z14);
        }
    }
}

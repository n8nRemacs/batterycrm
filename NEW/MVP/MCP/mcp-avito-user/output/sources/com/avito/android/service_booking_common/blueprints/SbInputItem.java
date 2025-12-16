package com.avito.android.service_booking_common.blueprints;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import qt0.InterfaceC47437a;

/* compiled from: SbInputItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/SbInputItem;", "Lcom/avito/conveyor_item/a;", "Lqt0/a;", "Format", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbInputItem implements a, InterfaceC47437a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f276227b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f276228c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f276229d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Format f276230e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public String f276231f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f276232g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SbInputItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/SbInputItem$Format;", "", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Format {

        /* renamed from: b, reason: collision with root package name */
        public static final Format f276233b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Format[] f276234c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f276235d;

        static {
            Format format = new Format("PHONE", 0);
            f276233b = format;
            Format[] formatArr = {format};
            f276234c = formatArr;
            f276235d = c.a(formatArr);
        }

        public Format() {
            throw null;
        }

        public static Format valueOf(String str) {
            return (Format) Enum.valueOf(Format.class, str);
        }

        public static Format[] values() {
            return (Format[]) f276234c.clone();
        }
    }

    public SbInputItem(@k String str, @l String str2, @l String str3, @l Format format, @l String str4, @l String str5) {
        this.f276227b = str;
        this.f276228c = str2;
        this.f276229d = str3;
        this.f276230e = format;
        this.f276231f = str4;
        this.f276232g = str5;
    }

    @Override // qt0.InterfaceC47437a
    public final <T extends InterfaceC47437a> boolean a(@l List<? extends T> list) {
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                InterfaceC47437a interfaceC47437a = (InterfaceC47437a) next;
                if ((interfaceC47437a instanceof SbInputItem) && L.f(((SbInputItem) interfaceC47437a).f276227b, this.f276227b)) {
                    obj = next;
                    break;
                }
            }
            obj = (InterfaceC47437a) obj;
        }
        return !((SbInputItem) obj).equals(this);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SbInputItem)) {
            return false;
        }
        SbInputItem sbInputItem = (SbInputItem) obj;
        return L.f(this.f276227b, sbInputItem.f276227b) && L.f(this.f276228c, sbInputItem.f276228c) && L.f(this.f276229d, sbInputItem.f276229d) && this.f276230e == sbInputItem.f276230e && L.f(this.f276231f, sbInputItem.f276231f) && L.f(this.f276232g, sbInputItem.f276232g);
    }

    @Override // TV0.a
    public final long getId() {
        return getF272549f().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272549f() {
        return this.f276227b;
    }

    public final int hashCode() {
        int iHashCode = this.f276227b.hashCode() * 31;
        String str = this.f276228c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f276229d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Format format = this.f276230e;
        int iHashCode4 = (iHashCode3 + (format == null ? 0 : format.hashCode())) * 31;
        String str3 = this.f276231f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f276232g;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbInputItem(stringId=");
        sb2.append(this.f276227b);
        sb2.append(", title=");
        sb2.append(this.f276228c);
        sb2.append(", placeholder=");
        sb2.append(this.f276229d);
        sb2.append(", format=");
        sb2.append(this.f276230e);
        sb2.append(", value=");
        sb2.append(this.f276231f);
        sb2.append(", paramId=");
        return C22026a.c(sb2, this.f276232g, ')');
    }
}

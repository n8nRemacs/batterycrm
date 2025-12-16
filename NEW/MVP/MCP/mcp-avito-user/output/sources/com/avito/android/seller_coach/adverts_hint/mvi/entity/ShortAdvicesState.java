package com.avito.android.seller_coach.adverts_hint.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Advices;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import uq0.C49099a;

/* compiled from: ShortAdvicesState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/mvi/entity/ShortAdvicesState;", "", "Type", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShortAdvicesState {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C49099a f267271a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Advices f267272b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UserAdvertsHintItem f267273c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<UserAdvertsHintItem> f267274d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f267275e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f267276f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Type f267277g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortAdvicesState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/mvi/entity/ShortAdvicesState$Type;", "", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f267278b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f267279c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f267280d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f267281e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Type[] f267282f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ a f267283g;

        static {
            Type type = new Type("NONE", 0);
            f267278b = type;
            Type type2 = new Type("LOADING", 1);
            f267279c = type2;
            Type type3 = new Type("ERROR", 2);
            f267280d = type3;
            Type type4 = new Type("CONTENT", 3);
            f267281e = type4;
            Type[] typeArr = {type, type2, type3, type4};
            f267282f = typeArr;
            f267283g = c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f267282f.clone();
        }
    }

    public ShortAdvicesState(@k C49099a c49099a, @l Advices advices, @l UserAdvertsHintItem userAdvertsHintItem, @k List<UserAdvertsHintItem> list, @l String str, @l String str2, @k Type type) {
        this.f267271a = c49099a;
        this.f267272b = advices;
        this.f267273c = userAdvertsHintItem;
        this.f267274d = list;
        this.f267275e = str;
        this.f267276f = str2;
        this.f267277g = type;
    }

    public static ShortAdvicesState a(ShortAdvicesState shortAdvicesState, Advices advices, UserAdvertsHintItem userAdvertsHintItem, List list, Type type, int i12) {
        C49099a c49099a = shortAdvicesState.f267271a;
        if ((i12 & 2) != 0) {
            advices = shortAdvicesState.f267272b;
        }
        Advices advices2 = advices;
        if ((i12 & 4) != 0) {
            userAdvertsHintItem = shortAdvicesState.f267273c;
        }
        UserAdvertsHintItem userAdvertsHintItem2 = userAdvertsHintItem;
        if ((i12 & 8) != 0) {
            list = shortAdvicesState.f267274d;
        }
        List list2 = list;
        String str = shortAdvicesState.f267275e;
        String str2 = shortAdvicesState.f267276f;
        if ((i12 & 64) != 0) {
            type = shortAdvicesState.f267277g;
        }
        shortAdvicesState.getClass();
        return new ShortAdvicesState(c49099a, advices2, userAdvertsHintItem2, list2, str, str2, type);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortAdvicesState)) {
            return false;
        }
        ShortAdvicesState shortAdvicesState = (ShortAdvicesState) obj;
        return L.f(this.f267271a, shortAdvicesState.f267271a) && L.f(this.f267272b, shortAdvicesState.f267272b) && L.f(this.f267273c, shortAdvicesState.f267273c) && L.f(this.f267274d, shortAdvicesState.f267274d) && L.f(this.f267275e, shortAdvicesState.f267275e) && L.f(this.f267276f, shortAdvicesState.f267276f) && this.f267277g == shortAdvicesState.f267277g;
    }

    public final int hashCode() {
        this.f267271a.getClass();
        Advices advices = this.f267272b;
        int iHashCode = ((-222702550) + (advices == null ? 0 : advices.hashCode())) * 31;
        UserAdvertsHintItem userAdvertsHintItem = this.f267273c;
        int iE2 = H.e((iHashCode + (userAdvertsHintItem == null ? 0 : userAdvertsHintItem.hashCode())) * 31, 31, this.f267274d);
        String str = this.f267275e;
        int iHashCode2 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f267276f;
        return this.f267277g.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "ShortAdvicesState(initialData=" + this.f267271a + ", advice=" + this.f267272b + ", headerItem=" + this.f267273c + ", items=" + this.f267274d + ", titleText=" + this.f267275e + ", countText=" + this.f267276f + ", type=" + this.f267277g + ')';
    }

    public ShortAdvicesState(C49099a c49099a, Advices advices, UserAdvertsHintItem userAdvertsHintItem, List list, String str, String str2, Type type, int i12, C42822w c42822w) {
        this(c49099a, (i12 & 2) != 0 ? null : advices, (i12 & 4) != 0 ? null : userAdvertsHintItem, (i12 & 8) != 0 ? C42784z0.f406748b : list, (i12 & 16) != 0 ? null : str, (i12 & 32) == 0 ? str2 : null, (i12 & 64) != 0 ? Type.f267278b : type);
    }
}

package com.avito.android.short_term_rent.bookingform.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormViewState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/FooterButtonItem;", "", "ActionType", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FooterButtonItem {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ActionType f281823a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f281824b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f281825c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Long f281826d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BookingFormViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/FooterButtonItem$ActionType;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        /* renamed from: b, reason: collision with root package name */
        public static final ActionType f281827b;

        /* renamed from: c, reason: collision with root package name */
        public static final ActionType f281828c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f281829d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f281830e;

        static {
            ActionType actionType = new ActionType("MOVE_TO_PAGE", 0);
            f281827b = actionType;
            ActionType actionType2 = new ActionType("SEND_FORM", 1);
            f281828c = actionType2;
            ActionType[] actionTypeArr = {actionType, actionType2};
            f281829d = actionTypeArr;
            f281830e = c.a(actionTypeArr);
        }

        public ActionType() {
            throw null;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f281829d.clone();
        }
    }

    public FooterButtonItem(@k ActionType actionType, @k String str, @k String str2, @l Long l12) {
        this.f281823a = actionType;
        this.f281824b = str;
        this.f281825c = str2;
        this.f281826d = l12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterButtonItem)) {
            return false;
        }
        FooterButtonItem footerButtonItem = (FooterButtonItem) obj;
        return this.f281823a == footerButtonItem.f281823a && L.f(this.f281824b, footerButtonItem.f281824b) && L.f(this.f281825c, footerButtonItem.f281825c) && L.f(this.f281826d, footerButtonItem.f281826d);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f281823a.hashCode() * 31, 31, this.f281824b), 31, this.f281825c);
        Long l12 = this.f281826d;
        return iD2 + (l12 == null ? 0 : l12.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FooterButtonItem(actionType=");
        sb2.append(this.f281823a);
        sb2.append(", title=");
        sb2.append(this.f281824b);
        sb2.append(", style=");
        sb2.append(this.f281825c);
        sb2.append(", toPageId=");
        return m.m(sb2, this.f281826d, ')');
    }
}

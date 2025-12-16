package com.avito.android.widget_filters.model;

import NP0.o;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.CaseText;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LocationParameter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/model/SuggestedLocation;", "LNP0/o;", "SuggestType", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SuggestedLocation implements o {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f329930a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CaseText f329931b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f329932c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f329933d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SuggestType f329934e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LocationParameter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/model/SuggestedLocation$SuggestType;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SuggestType {

        /* renamed from: c, reason: collision with root package name */
        public static final SuggestType f329935c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ SuggestType[] f329936d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f329937e;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f329938b;

        static {
            SuggestType suggestType = new SuggestType("HISTORICAL", 0, "history");
            SuggestType suggestType2 = new SuggestType("DEFAULT", 1, "default");
            f329935c = suggestType2;
            SuggestType[] suggestTypeArr = {suggestType, suggestType2};
            f329936d = suggestTypeArr;
            f329937e = c.a(suggestTypeArr);
        }

        public SuggestType(String str, int i12, String str2) {
            this.f329938b = str2;
        }

        public static SuggestType valueOf(String str) {
            return (SuggestType) Enum.valueOf(SuggestType.class, str);
        }

        public static SuggestType[] values() {
            return (SuggestType[]) f329936d.clone();
        }
    }

    public SuggestedLocation(@k String str, @k CaseText caseText, @k String str2, @k String str3, @k SuggestType suggestType) {
        this.f329930a = str;
        this.f329931b = caseText;
        this.f329932c = str2;
        this.f329933d = str3;
        this.f329934e = suggestType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedLocation)) {
            return false;
        }
        SuggestedLocation suggestedLocation = (SuggestedLocation) obj;
        return L.f(this.f329930a, suggestedLocation.f329930a) && L.f(this.f329931b, suggestedLocation.f329931b) && L.f(this.f329932c, suggestedLocation.f329932c) && L.f(this.f329933d, suggestedLocation.f329933d) && this.f329934e == suggestedLocation.f329934e;
    }

    public final int hashCode() {
        return this.f329934e.hashCode() + H.d(H.d((this.f329931b.hashCode() + (this.f329930a.hashCode() * 31)) * 31, 31, this.f329932c), 31, this.f329933d);
    }

    @k
    public final String toString() {
        return "SuggestedLocation(id=" + this.f329930a + ", names=" + this.f329931b + ", cityName=" + this.f329932c + ", regionName=" + this.f329933d + ", suggestType=" + this.f329934e + ')';
    }

    public /* synthetic */ SuggestedLocation(String str, CaseText caseText, String str2, String str3, SuggestType suggestType, int i12, C42822w c42822w) {
        this(str, caseText, str2, str3, (i12 & 16) != 0 ? SuggestType.f329935c : suggestType);
    }
}

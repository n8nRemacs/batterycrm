package com.avito.android.realty_agency.inline_filters_public.generated.api.api_1_nd_trx_suggest_location_post;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Api1NdTrxSuggestLocationPostRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters_public/generated/api/api_1_nd_trx_suggest_location_post/Mode;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lots", "Events", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Mode {

    @c("events")
    public static final Mode Events;

    @c("lots")
    public static final Mode Lots;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Mode[] f251743c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f251744d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f251745b;

    static {
        Mode mode = new Mode("Lots", 0, "lots");
        Lots = mode;
        Mode mode2 = new Mode("Events", 1, "events");
        Events = mode2;
        Mode[] modeArr = {mode, mode2};
        f251743c = modeArr;
        f251744d = kotlin.enums.c.a(modeArr);
    }

    private Mode(String str, int i12, String str2) {
        this.f251745b = str2;
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) f251743c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f251745b.toString();
    }
}

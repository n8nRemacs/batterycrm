package com.avito.android.code_confirmation.code_confirmation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RequestCodeV2Source.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/RequestCodeV2Source;", "", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RequestCodeV2Source {

    /* renamed from: c, reason: collision with root package name */
    public static final RequestCodeV2Source f119426c;

    /* renamed from: d, reason: collision with root package name */
    public static final RequestCodeV2Source f119427d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ RequestCodeV2Source[] f119428e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f119429f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f119430b;

    static {
        RequestCodeV2Source requestCodeV2Source = new RequestCodeV2Source("PHONE_ADD", 0, "profile:add");
        f119426c = requestCodeV2Source;
        RequestCodeV2Source requestCodeV2Source2 = new RequestCodeV2Source("VERIFICATION", 1, "profile:verification");
        RequestCodeV2Source requestCodeV2Source3 = new RequestCodeV2Source("TEMP_STAFFING_REGISTRATION", 2, "podrabotka_registration");
        f119427d = requestCodeV2Source3;
        RequestCodeV2Source[] requestCodeV2SourceArr = {requestCodeV2Source, requestCodeV2Source2, requestCodeV2Source3};
        f119428e = requestCodeV2SourceArr;
        f119429f = kotlin.enums.c.a(requestCodeV2SourceArr);
    }

    public RequestCodeV2Source(String str, int i12, String str2) {
        this.f119430b = str2;
    }

    public static RequestCodeV2Source valueOf(String str) {
        return (RequestCodeV2Source) Enum.valueOf(RequestCodeV2Source.class, str);
    }

    public static RequestCodeV2Source[] values() {
        return (RequestCodeV2Source[]) f119428e.clone();
    }
}

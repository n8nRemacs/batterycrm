package com.avito.android.remote.parse.adapter.stream_gson;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.error.Status;
import com.avito.android.remote.error.o;
import com.avito.android.remote.model.Error;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.util.InvalidSchemaException;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.c;
import java.io.IOException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlin.text.C43066x;

/* compiled from: ApiErrorTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/ApiErrorTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/error/ApiError;", "a", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ApiErrorTypeAdapter extends TypeAdapter<ApiError> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f254277a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Status f254278b;

    /* compiled from: ApiErrorTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/ApiErrorTypeAdapter$a;", "", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Status f254279a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public Integer f254280b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f254281c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final HashMap<String, String> f254282d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public DeepLink f254283e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public UserDialog f254284f;

        public a() {
            this(null, null, null, null, null, null, 63, null);
        }

        public a(Status status, Integer num, String str, HashMap map, DeepLink deepLink, UserDialog userDialog, int i12, C42822w c42822w) {
            status = (i12 & 1) != 0 ? null : status;
            num = (i12 & 2) != 0 ? null : num;
            str = (i12 & 4) != 0 ? null : str;
            map = (i12 & 8) != 0 ? new HashMap(0) : map;
            deepLink = (i12 & 16) != 0 ? null : deepLink;
            userDialog = (i12 & 32) != 0 ? null : userDialog;
            this.f254279a = status;
            this.f254280b = num;
            this.f254281c = str;
            this.f254282d = map;
            this.f254283e = deepLink;
            this.f254284f = userDialog;
        }
    }

    /* compiled from: ApiErrorTypeAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254285a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                Status.c cVar = Status.f253396c;
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Status.c cVar2 = Status.f253396c;
                iArr[7] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Status.c cVar3 = Status.f253396c;
                iArr[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Status.c cVar4 = Status.f253396c;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Status.c cVar5 = Status.f253396c;
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Status.c cVar6 = Status.f253396c;
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Status.c cVar7 = Status.f253396c;
                iArr[10] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Status.c cVar8 = Status.f253396c;
                iArr[4] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Status.c cVar9 = Status.f253396c;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Status.c cVar10 = Status.f253396c;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Status.c cVar11 = Status.f253396c;
                iArr[11] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f254285a = iArr;
        }
    }

    public ApiErrorTypeAdapter(@k Gson gson, @l Status status) {
        this.f254277a = gson;
        this.f254278b = status;
    }

    public static void b(ApiErrorTypeAdapter apiErrorTypeAdapter, String str, Status status) {
        if (str == null || C43066x.K(str)) {
            throw c(status, "message");
        }
    }

    public static InvalidSchemaException c(Status status, String str) {
        return new InvalidSchemaException(m0.f406844a.b(Status.class), str, str + " is null for status " + status);
    }

    public final void a(com.google.gson.stream.a aVar, a aVar2) throws IOException {
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362204j;
        if (jsonTokenF == jsonToken) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF2 = aVar.F();
        JsonToken jsonToken2 = JsonToken.f362198d;
        if (jsonTokenF2 != jsonToken2) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
        }
        aVar.b();
        while (aVar.k()) {
            String strX = aVar.x();
            if (L.f(strX, "status")) {
                Status.c cVar = Status.f253396c;
                String strB = aVar.B();
                cVar.getClass();
                aVar2.f254279a = Status.c.a(strB);
            } else if (L.f(strX, "code")) {
                aVar2.f254280b = Integer.valueOf(aVar.q());
            } else if (L.f(strX, "message")) {
                aVar2.f254281c = aVar.B();
            } else if (!L.f(strX, "messages")) {
                boolean zF2 = L.f(strX, "action") ? true : L.f(strX, "link");
                Gson gson = this.f254277a;
                if (zF2) {
                    aVar2.f254283e = (DeepLink) gson.g(DeepLink.class).read(aVar);
                } else if (L.f(strX, "userDialog")) {
                    aVar2.f254284f = (UserDialog) gson.g(UserDialog.class).read(aVar);
                } else if (L.f(strX, "error")) {
                    a(aVar, aVar2);
                } else if (L.f(strX, "result")) {
                    a(aVar, aVar2);
                } else {
                    Status.f253396c.getClass();
                    if (Status.f253397d.getValue().contains(strX)) {
                        aVar2.f254279a = Status.c.a(strX);
                        a(aVar, aVar2);
                    } else {
                        aVar.L();
                    }
                }
            } else {
                if (aVar.F() == jsonToken) {
                    throw new JsonParseException("");
                }
                if (aVar.F() != jsonToken2) {
                    throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
                }
                aVar.b();
                while (aVar.k()) {
                    aVar2.f254282d.put(aVar.x(), aVar.B());
                }
                aVar.g();
            }
        }
        aVar.g();
    }

    @Override // com.google.gson.TypeAdapter
    public final ApiError read(com.google.gson.stream.a aVar) throws IOException {
        String strB;
        a aVar2 = new a(null, null, null, null, null, null, 63, null);
        a(aVar, aVar2);
        Integer num = aVar2.f254280b;
        if (num != null) {
            int iIntValue = num.intValue();
            o.f253437a.getClass();
            strB = o.b(iIntValue);
        } else {
            strB = null;
        }
        Status.f253396c.getClass();
        Status statusA = Status.c.a(strB);
        Status status = aVar2.f254279a;
        if (status != null) {
            statusA = status;
        } else if (statusA == null) {
            statusA = this.f254278b;
        }
        int i12 = statusA == null ? -1 : b.f254285a[statusA.ordinal()];
        HashMap<String, String> map = aVar2.f254282d;
        switch (i12) {
            case -1:
                Integer num2 = aVar2.f254280b;
                if (num2 == null) {
                    String str = aVar2.f254281c;
                    b(this, str, Status.f253409p);
                    return new ApiError.UnknownError(str, "httpCode=null, status=null", null, 4, null);
                }
                if (s.r(100, 600).h(num2.intValue())) {
                    return new ApiError.HttpError(new Error(num2.intValue(), aVar2.f254281c, map));
                }
                String str2 = aVar2.f254281c;
                return new ApiError.UnknownError(str2 == null ? "" : str2, "httpCode=" + num2 + ", status=null", null, 4, null);
            case 0:
            default:
                return null;
            case 1:
                String str3 = aVar2.f254281c;
                b(this, str3, statusA);
                return new ApiError.InternalError(str3);
            case 2:
                String str4 = aVar2.f254281c;
                b(this, str4, statusA);
                return new ApiError.Failure(str4);
            case 3:
                String str5 = aVar2.f254281c;
                b(this, str5, statusA);
                return new ApiError.NotFound(str5);
            case 4:
                String str6 = aVar2.f254281c;
                b(this, str6, statusA);
                return new ApiError.Unauthorized(str6);
            case 5:
                String str7 = aVar2.f254281c;
                b(this, str7, statusA);
                return new ApiError.Unauthorized(str7);
            case 6:
                String str8 = aVar2.f254281c;
                b(this, str8, statusA);
                return new ApiError.Forbidden(str8, aVar2.f254283e);
            case 7:
                String str9 = aVar2.f254281c;
                b(this, str9, statusA);
                return new ApiError.TooManyRequests(str9, aVar2.f254283e);
            case 8:
                String str10 = aVar2.f254281c;
                if (str10 != null && !C43066x.K(str10)) {
                    map.put("message", str10);
                }
                if (map.isEmpty()) {
                    throw c(statusA, "messages");
                }
                return new ApiError.BadRequest(map);
            case 9:
                String str11 = aVar2.f254281c;
                if (str11 != null && !C43066x.K(str11)) {
                    map.put("message", str11);
                }
                if (map.isEmpty()) {
                    throw c(statusA, "messages");
                }
                return new ApiError.IncorrectData(map);
            case 10:
                UserDialog userDialog = aVar2.f254284f;
                if (userDialog != null) {
                    return new ApiError.ErrorDialog(userDialog);
                }
                throw c(statusA, "userDialog");
            case 11:
                DeepLink deepLink = aVar2.f254283e;
                if (deepLink == null) {
                    throw c(statusA, "action");
                }
                String str12 = aVar2.f254281c;
                return new ApiError.ErrorAction(deepLink, str12 != null ? str12 : "");
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, ApiError apiError) {
        throw new UnsupportedOperationException();
    }
}

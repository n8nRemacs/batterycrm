package com.avito.android.paid_services;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;

/* compiled from: PaidServicesResultRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/paid_services/PaidServicesResultRepository;", "", "Result", "_avito_paid-services_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PaidServicesResultRepository {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaidServicesResultRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/paid_services/PaidServicesResultRepository$Result;", "", "_avito_paid-services_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Result {

        /* renamed from: b, reason: collision with root package name */
        public static final Result f210608b;

        /* renamed from: c, reason: collision with root package name */
        public static final Result f210609c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Result[] f210610d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f210611e;

        static {
            Result result = new Result("SUCCESS", 0);
            f210608b = result;
            Result result2 = new Result("CANCELED", 1);
            f210609c = result2;
            Result[] resultArr = {result, result2};
            f210610d = resultArr;
            f210611e = c.a(resultArr);
        }

        public Result() {
            throw null;
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) f210610d.clone();
        }
    }

    @k
    /* renamed from: a */
    Result getF210652a();

    void b();
}

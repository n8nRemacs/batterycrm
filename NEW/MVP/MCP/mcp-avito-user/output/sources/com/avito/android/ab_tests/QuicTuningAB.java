package com.avito.android.ab_tests;

import java.util.List;
import kotlin.Metadata;

/* compiled from: QuicTuningAB.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/QuicTuningAB;", "", "ErrorType", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface QuicTuningAB {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QuicTuningAB.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/QuicTuningAB$ErrorType;", "", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ErrorType {

        /* renamed from: b, reason: collision with root package name */
        public static final ErrorType f67734b;

        /* renamed from: c, reason: collision with root package name */
        public static final ErrorType f67735c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ErrorType[] f67736d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f67737e;

        static {
            ErrorType errorType = new ErrorType("TCP_RST", 0);
            f67734b = errorType;
            ErrorType errorType2 = new ErrorType("QUIC_PROTOCOL", 1);
            f67735c = errorType2;
            ErrorType[] errorTypeArr = {errorType, errorType2};
            f67736d = errorTypeArr;
            f67737e = kotlin.enums.c.a(errorTypeArr);
        }

        public ErrorType() {
            throw null;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) f67736d.clone();
        }
    }

    boolean a();

    boolean b();

    boolean c();

    @Y61.k
    List<ErrorType> d();

    boolean e();

    boolean f();

    long h();
}

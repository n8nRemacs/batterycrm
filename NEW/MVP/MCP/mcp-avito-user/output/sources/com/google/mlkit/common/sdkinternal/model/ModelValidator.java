package com.google.mlkit.common.sdkinternal.model;

import j.N;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
/* loaded from: classes6.dex */
public interface ModelValidator {

    /* compiled from: com.google.mlkit:common@@18.10.0 */
    @RX0.a
    public static class ValidationResult {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: com.google.mlkit:common@@18.10.0 */
        @RX0.a
        public static final class ErrorCode {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ErrorCode[] f362345b = {new ErrorCode("OK", 0), new ErrorCode("TFLITE_VERSION_INCOMPATIBLE", 1), new ErrorCode("MODEL_FORMAT_INVALID", 2)};

            /* JADX INFO: Fake field, exist only in values array */
            ErrorCode EF5;

            @N
            public static ErrorCode[] values() {
                return (ErrorCode[]) f362345b.clone();
            }
        }
    }
}

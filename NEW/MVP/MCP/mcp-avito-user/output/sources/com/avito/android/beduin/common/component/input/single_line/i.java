package com.avito.android.beduin.common.component.input.single_line;

import kotlin.Metadata;

/* compiled from: SingleLineInputModel.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i {

    /* compiled from: SingleLineInputModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101594a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f101595b;

        static {
            int[] iArr = new int[KeyboardType.values().length];
            try {
                iArr[KeyboardType.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyboardType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KeyboardType.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101594a = iArr;
            int[] iArr2 = new int[BeduinFormatterType.values().length];
            try {
                iArr2[BeduinFormatterType.DECIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BeduinFormatterType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BeduinFormatterType.FLOATING.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BeduinFormatterType.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BeduinFormatterType.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BeduinFormatterType.ROUBLES.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BeduinFormatterType.NUMERIC.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BeduinFormatterType.PASSPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            f101595b = iArr2;
        }
    }
}

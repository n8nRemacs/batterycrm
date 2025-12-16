package Fc1;

import android.content.Context;
import feedback.shared.sdk.api.network.entities.FieldType;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f5772a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5773a;

        static {
            int[] iArr = new int[FieldType.values().length];
            try {
                iArr[FieldType.COMMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldType.RADIO_BUTTONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FieldType.SMILES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FieldType.STARS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FieldType.RATING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FieldType.NPS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FieldType.CHECK_BOXES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FieldType.SCREENSHOT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f5773a = iArr;
        }
    }

    @i31.c
    public r(@Y61.k Context context) {
        this.f5772a = context;
    }
}

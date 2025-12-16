package feedback.shared.sdk.api.network.entities;

import Y61.k;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import xyz.n.a.i4;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0080\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/FieldType;", "", "(Ljava/lang/String;I)V", "HEADER", "TEXT", "COMMENT", "SMILES", "EMAIL", "IMAGE", "RADIO_BUTTONS", "CHECK_BOXES", "NPS", "SCREENSHOT", "RATING", "STARS", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum FieldType {
    HEADER,
    TEXT,
    COMMENT,
    SMILES,
    EMAIL,
    IMAGE,
    RADIO_BUTTONS,
    CHECK_BOXES,
    NPS,
    SCREENSHOT,
    RATING,
    STARS;


    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/FieldType$Companion;", "", "Lxyz/n/a/i4;", "feedbackFieldType", "Lfeedback/shared/sdk/api/network/entities/FieldType;", "fromFeedbackFieldType", "", "value", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "()V", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[i4.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[5] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[6] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[7] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[8] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[9] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[10] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[11] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[12] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[13] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[FieldType.values().length];
                try {
                    iArr2[FieldType.HEADER.ordinal()] = 1;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr2[FieldType.TEXT.ordinal()] = 2;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr2[FieldType.COMMENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr2[FieldType.SMILES.ordinal()] = 4;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr2[FieldType.EMAIL.ordinal()] = 5;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr2[FieldType.IMAGE.ordinal()] = 6;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr2[FieldType.RADIO_BUTTONS.ordinal()] = 7;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr2[FieldType.CHECK_BOXES.ordinal()] = 8;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr2[FieldType.NPS.ordinal()] = 9;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr2[FieldType.SCREENSHOT.ordinal()] = 10;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr2[FieldType.RATING.ordinal()] = 11;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr2[FieldType.STARS.ordinal()] = 12;
                } catch (NoSuchFieldError unused26) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @k
        public final FieldType from(@k String value) {
            switch (value.hashCode()) {
                case -1221270899:
                    if (value.equals("header")) {
                        return FieldType.HEADER;
                    }
                    break;
                case -938102371:
                    if (value.equals("rating")) {
                        return FieldType.RATING;
                    }
                    break;
                case -898716053:
                    if (value.equals("smiles")) {
                        return FieldType.SMILES;
                    }
                    break;
                case -515685455:
                    if (value.equals("checkboxes")) {
                        return FieldType.CHECK_BOXES;
                    }
                    break;
                case -416447130:
                    if (value.equals("screenshot")) {
                        return FieldType.SCREENSHOT;
                    }
                    break;
                case 109297:
                    if (value.equals("nps")) {
                        return FieldType.NPS;
                    }
                    break;
                case 3556653:
                    if (value.equals("text")) {
                        return FieldType.TEXT;
                    }
                    break;
                case 96619420:
                    if (value.equals("email")) {
                        return FieldType.EMAIL;
                    }
                    break;
                case 100313435:
                    if (value.equals("image")) {
                        return FieldType.IMAGE;
                    }
                    break;
                case 109757537:
                    if (value.equals("stars")) {
                        return FieldType.STARS;
                    }
                    break;
                case 764037926:
                    if (value.equals("radiobuttons")) {
                        return FieldType.RADIO_BUTTONS;
                    }
                    break;
                case 950398559:
                    if (value.equals("comment")) {
                        return FieldType.COMMENT;
                    }
                    break;
            }
            throw null;
        }

        @k
        public final FieldType fromFeedbackFieldType(@k i4 feedbackFieldType) {
            switch (WhenMappings.$EnumSwitchMapping$0[feedbackFieldType.ordinal()]) {
                case 1:
                    return FieldType.HEADER;
                case 2:
                    return FieldType.TEXT;
                case 3:
                    return FieldType.COMMENT;
                case 4:
                    return FieldType.SMILES;
                case 5:
                    return FieldType.EMAIL;
                case 6:
                    return FieldType.IMAGE;
                case 7:
                    return FieldType.RADIO_BUTTONS;
                case 8:
                    return FieldType.CHECK_BOXES;
                case 9:
                    return FieldType.NPS;
                case 10:
                    return FieldType.SCREENSHOT;
                case 11:
                    return FieldType.RATING;
                case 12:
                    throw new G(null, 1, null);
                case 13:
                    throw new G(null, 1, null);
                case 14:
                    return FieldType.STARS;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        @k
        public final String to(@k FieldType value) {
            switch (WhenMappings.$EnumSwitchMapping$1[value.ordinal()]) {
                case 1:
                    return "header";
                case 2:
                    return "text";
                case 3:
                    return "comment";
                case 4:
                    return "smiles";
                case 5:
                    return "email";
                case 6:
                    return "image";
                case 7:
                    return "radiobuttons";
                case 8:
                    return "checkboxes";
                case 9:
                    return "nps";
                case 10:
                    return "screenshot";
                case 11:
                    return "rating";
                case 12:
                    return "stars";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }
}

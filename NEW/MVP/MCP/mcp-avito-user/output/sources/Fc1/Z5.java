package Fc1;

import feedback.shared.sdk.api.network.entities.Field;
import feedback.shared.sdk.api.network.entities.FieldType;
import feedback.shared.sdk.api.network.entities.Messages;
import feedback.shared.sdk.api.network.entities.ModeType;
import feedback.shared.sdk.api.network.entities.Option;
import feedback.shared.sdk.api.network.entities.ScreenshotButtons;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class Z5 implements I6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Field f5359a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5360a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5361b;

        static {
            int[] iArr = new int[FieldType.values().length];
            try {
                iArr[FieldType.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldType.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldType.COMMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FieldType.SMILES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FieldType.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FieldType.IMAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FieldType.RADIO_BUTTONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FieldType.CHECK_BOXES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FieldType.NPS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FieldType.SCREENSHOT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[FieldType.RATING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[FieldType.STARS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f5360a = iArr;
            int[] iArr2 = new int[ModeType.values().length];
            try {
                iArr2[ModeType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ModeType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            f5361b = iArr2;
        }
    }

    public Z5(Field field) {
        this.f5359a = field;
    }

    @Override // Fc1.I6
    @Y61.l
    public final C13614g a() {
        String imageUrl = this.f5359a.getImageUrl();
        if (imageUrl != null) {
            return new C13614g(imageUrl);
        }
        return null;
    }

    @Override // Fc1.I6
    @Y61.l
    public final Y0 b() {
        Field field = this.f5359a;
        Boolean required = field.getRequired();
        if (required == null) {
            return null;
        }
        boolean zBooleanValue = required.booleanValue();
        String warning = field.getWarning();
        if (warning == null) {
            kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            warning = "";
        }
        return new Y0(warning, zBooleanValue);
    }

    @Override // Fc1.I6
    @Y61.l
    public final C13696p0 c() {
        C13696p0 c13696p0;
        Field field = this.f5359a;
        if (field.getType() == FieldType.NPS) {
            Messages messages = field.getMessages();
            c13696p0 = new C13696p0(11, messages != null ? new K0(messages.getNegative(), messages.getPositive()) : null);
        } else {
            if (field.getRatingCount() == 0) {
                return null;
            }
            int ratingCount = field.getRatingCount();
            Messages messages2 = field.getMessages();
            c13696p0 = new C13696p0(ratingCount, messages2 != null ? new K0(messages2.getNegative(), messages2.getPositive()) : null);
        }
        return c13696p0;
    }

    @Override // Fc1.I6
    @Y61.k
    public final xyz.n.a.i4 d() {
        switch (a.f5360a[this.f5359a.getType().ordinal()]) {
            case 1:
                return xyz.n.a.i4.f442730b;
            case 2:
                return xyz.n.a.i4.f442731c;
            case 3:
                return xyz.n.a.i4.f442732d;
            case 4:
                return xyz.n.a.i4.f442733e;
            case 5:
                return xyz.n.a.i4.f442734f;
            case 6:
                return xyz.n.a.i4.f442735g;
            case 7:
                return xyz.n.a.i4.f442736h;
            case 8:
                return xyz.n.a.i4.f442737i;
            case 9:
                return xyz.n.a.i4.f442738j;
            case 10:
                return xyz.n.a.i4.f442739k;
            case 11:
                return xyz.n.a.i4.f442740l;
            case 12:
                return xyz.n.a.i4.f442743o;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // Fc1.I6
    @Y61.l
    public final C13765w7 e() {
        Field field = this.f5359a;
        ModeType mode = field.getMode();
        String str = "";
        xyz.n.a.z3 z3Var = xyz.n.a.z3.f442811b;
        if (mode == null) {
            if (field.getType() != FieldType.EMAIL) {
                return null;
            }
            String placeholder = field.getPlaceholder();
            if (placeholder == null) {
                kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            } else {
                str = placeholder;
            }
            return new C13765w7(z3Var, str);
        }
        int i12 = a.f5361b[mode.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z3Var = xyz.n.a.z3.f442812c;
        }
        String placeholder2 = field.getPlaceholder();
        if (placeholder2 == null) {
            kotlin.jvm.internal.u0 u0Var2 = kotlin.jvm.internal.u0.f406856a;
        } else {
            str = placeholder2;
        }
        return new C13765w7(z3Var, str);
    }

    @Override // Fc1.I6
    @Y61.l
    public final I1 f() {
        ScreenshotButtons buttons = this.f5359a.getButtons();
        if (buttons != null) {
            return new I1(buttons.getCreate(), buttons.getUpload());
        }
        return null;
    }

    @Override // Fc1.I6
    @Y61.k
    public final List<C13623h> g() {
        List<Option> options = this.f5359a.getOptions();
        if (options == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList(C42745f0.q(options, 10));
        int i12 = 0;
        for (Object obj : options) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Option option = (Option) obj;
            String id2 = option.getId();
            String value = option.getValue();
            Boolean exceptional = option.getExceptional();
            arrayList.add(new C13623h(i12, id2, value, exceptional != null ? exceptional.booleanValue() : false));
            i12 = i13;
        }
        return arrayList;
    }

    @Override // Fc1.I6
    @Y61.k
    public final String getId() {
        return this.f5359a.getId();
    }

    @Override // Fc1.I6
    @Y61.l
    public final String getValue() {
        return this.f5359a.getValue();
    }

    @Override // Fc1.I6
    @Y61.l
    public final B h() {
        return null;
    }
}

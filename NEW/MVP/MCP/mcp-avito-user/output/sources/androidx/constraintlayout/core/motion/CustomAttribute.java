package androidx.constraintlayout.core.motion;

/* loaded from: classes.dex */
public class CustomAttribute {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AttributeType {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AttributeType[] f43244b = {new AttributeType("INT_TYPE", 0), new AttributeType("FLOAT_TYPE", 1), new AttributeType("COLOR_TYPE", 2), new AttributeType("COLOR_DRAWABLE_TYPE", 3), new AttributeType("STRING_TYPE", 4), new AttributeType("BOOLEAN_TYPE", 5), new AttributeType("DIMENSION_TYPE", 6), new AttributeType("REFERENCE_TYPE", 7)};

        /* JADX INFO: Fake field, exist only in values array */
        AttributeType EF5;

        public AttributeType() {
            throw null;
        }

        public static AttributeType valueOf(String str) {
            return (AttributeType) Enum.valueOf(AttributeType.class, str);
        }

        public static AttributeType[] values() {
            return (AttributeType[]) f43244b.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43245a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f43245a = iArr;
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43245a[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43245a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43245a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43245a[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43245a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43245a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43245a[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }
}

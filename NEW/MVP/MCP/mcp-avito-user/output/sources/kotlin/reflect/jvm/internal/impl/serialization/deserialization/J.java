package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: ProtoEnumFlags.kt */
/* loaded from: classes8.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final J f409752a = new J();

    /* compiled from: ProtoEnumFlags.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f409753a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f409754b;

        static {
            int[] iArr = new int[ProtoBuf.Modality.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProtoBuf.Modality[] modalityArr = ProtoBuf.Modality.f408748c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProtoBuf.Modality[] modalityArr2 = ProtoBuf.Modality.f408748c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ProtoBuf.Modality[] modalityArr3 = ProtoBuf.Modality.f408748c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f409753a = iArr;
            int[] iArr2 = new int[Modality.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Modality.a aVar = Modality.f407438b;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Modality.a aVar2 = Modality.f407438b;
                iArr2[3] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Modality.a aVar3 = Modality.f407438b;
                iArr2[1] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[ProtoBuf.Visibility.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ProtoBuf.Visibility[] visibilityArr = ProtoBuf.Visibility.f408884c;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ProtoBuf.Visibility[] visibilityArr2 = ProtoBuf.Visibility.f408884c;
                iArr3[4] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                ProtoBuf.Visibility[] visibilityArr3 = ProtoBuf.Visibility.f408884c;
                iArr3[2] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                ProtoBuf.Visibility[] visibilityArr4 = ProtoBuf.Visibility.f408884c;
                iArr3[3] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                ProtoBuf.Visibility[] visibilityArr5 = ProtoBuf.Visibility.f408884c;
                iArr3[5] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[ProtoBuf.Class.Kind.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                ProtoBuf.Class.Kind kind = ProtoBuf.Class.Kind.CLASS;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                ProtoBuf.Class.Kind kind2 = ProtoBuf.Class.Kind.CLASS;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                ProtoBuf.Class.Kind kind3 = ProtoBuf.Class.Kind.CLASS;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                ProtoBuf.Class.Kind kind4 = ProtoBuf.Class.Kind.CLASS;
                iArr4[4] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                ProtoBuf.Class.Kind kind5 = ProtoBuf.Class.Kind.CLASS;
                iArr4[5] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                ProtoBuf.Class.Kind kind6 = ProtoBuf.Class.Kind.CLASS;
                iArr4[6] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f409754b = iArr4;
            int[] iArr5 = new int[ClassKind.values().length];
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                ClassKind classKind = ClassKind.f407413b;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                ClassKind classKind2 = ClassKind.f407413b;
                iArr5[2] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                ClassKind classKind3 = ClassKind.f407413b;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                ClassKind classKind4 = ClassKind.f407413b;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                ClassKind classKind5 = ClassKind.f407413b;
                iArr5[5] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr6 = new int[ProtoBuf.TypeParameter.Variance.values().length];
            try {
                iArr6[0] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                ProtoBuf.TypeParameter.Variance variance = ProtoBuf.TypeParameter.Variance.IN;
                iArr6[1] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                ProtoBuf.TypeParameter.Variance variance2 = ProtoBuf.TypeParameter.Variance.IN;
                iArr6[2] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            int[] iArr7 = new int[ProtoBuf.Type.Argument.Projection.values().length];
            try {
                iArr7[0] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                ProtoBuf.Type.Argument.Projection projection = ProtoBuf.Type.Argument.Projection.IN;
                iArr7[1] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                ProtoBuf.Type.Argument.Projection projection2 = ProtoBuf.Type.Argument.Projection.IN;
                iArr7[2] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                ProtoBuf.Type.Argument.Projection projection3 = ProtoBuf.Type.Argument.Projection.IN;
                iArr7[3] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr8 = new int[Variance.values().length];
            try {
                iArr8[1] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                Variance variance3 = Variance.f410069d;
                iArr8[2] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                Variance variance4 = Variance.f410069d;
                iArr8[0] = 3;
            } catch (NoSuchFieldError unused37) {
            }
        }
    }

    @Y61.k
    public static Modality a(@Y61.l ProtoBuf.Modality modality) {
        int i12 = modality == null ? -1 : a.f409753a[modality.ordinal()];
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? Modality.f407439c : Modality.f407440d : Modality.f407442f : Modality.f407441e : Modality.f407439c;
    }
}

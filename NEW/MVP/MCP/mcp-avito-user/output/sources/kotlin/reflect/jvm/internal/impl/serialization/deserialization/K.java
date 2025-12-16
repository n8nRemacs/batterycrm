package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: ProtoEnumFlagsUtils.kt */
/* loaded from: classes8.dex */
public final class K {

    /* compiled from: ProtoEnumFlagsUtils.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f409755a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f409756b;

        static {
            int[] iArr = new int[ProtoBuf.MemberKind.values().length];
            try {
                ProtoBuf.MemberKind[] memberKindArr = ProtoBuf.MemberKind.f408746c;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProtoBuf.MemberKind[] memberKindArr2 = ProtoBuf.MemberKind.f408746c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProtoBuf.MemberKind[] memberKindArr3 = ProtoBuf.MemberKind.f408746c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ProtoBuf.MemberKind[] memberKindArr4 = ProtoBuf.MemberKind.f408746c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f409755a = iArr;
            int[] iArr2 = new int[CallableMemberDescriptor.Kind.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[ProtoBuf.Visibility.values().length];
            try {
                ProtoBuf.Visibility[] visibilityArr = ProtoBuf.Visibility.f408884c;
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ProtoBuf.Visibility[] visibilityArr2 = ProtoBuf.Visibility.f408884c;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ProtoBuf.Visibility[] visibilityArr3 = ProtoBuf.Visibility.f408884c;
                iArr3[4] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                ProtoBuf.Visibility[] visibilityArr4 = ProtoBuf.Visibility.f408884c;
                iArr3[2] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                ProtoBuf.Visibility[] visibilityArr5 = ProtoBuf.Visibility.f408884c;
                iArr3[3] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                ProtoBuf.Visibility[] visibilityArr6 = ProtoBuf.Visibility.f408884c;
                iArr3[5] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f409756b = iArr3;
        }
    }

    @Y61.k
    public static final AbstractC42887p a(@Y61.l ProtoBuf.Visibility visibility) {
        AbstractC42900s abstractC42900s;
        switch (visibility == null ? -1 : a.f409756b[visibility.ordinal()]) {
            case 1:
                abstractC42900s = kotlin.reflect.jvm.internal.impl.descriptors.r.f407788d;
                break;
            case 2:
                abstractC42900s = kotlin.reflect.jvm.internal.impl.descriptors.r.f407785a;
                break;
            case 3:
                abstractC42900s = kotlin.reflect.jvm.internal.impl.descriptors.r.f407786b;
                break;
            case 4:
                abstractC42900s = kotlin.reflect.jvm.internal.impl.descriptors.r.f407787c;
                break;
            case 5:
                abstractC42900s = kotlin.reflect.jvm.internal.impl.descriptors.r.f407789e;
                break;
            case 6:
                abstractC42900s = kotlin.reflect.jvm.internal.impl.descriptors.r.f407790f;
                break;
            default:
                abstractC42900s = kotlin.reflect.jvm.internal.impl.descriptors.r.f407785a;
                break;
        }
        return (AbstractC42887p) abstractC42900s;
    }

    @Y61.k
    public static final CallableMemberDescriptor.Kind b(@Y61.l ProtoBuf.MemberKind memberKind) {
        int i12 = memberKind == null ? -1 : a.f409755a[memberKind.ordinal()];
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.f407408b;
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? kind : CallableMemberDescriptor.Kind.f407411e : CallableMemberDescriptor.Kind.f407410d : CallableMemberDescriptor.Kind.f407409c : kind;
    }
}

package kotlin.reflect.jvm.internal.impl.builtins;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import com.yandex.metrica.YandexMetricaDefaultValues;
import f51.InterfaceC40235a;
import f51.InterfaceC40236b;
import f51.c;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.collections.B0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.builtins.a;
import kotlin.reflect.jvm.internal.impl.builtins.functions.e;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.C42888q;
import kotlin.reflect.jvm.internal.impl.descriptors.C42904w;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.K;
import kotlin.reflect.jvm.internal.impl.descriptors.P;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.W;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.D;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.G;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.M;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.types.C42996v;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.z0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes8.dex */
public abstract class k {

    /* renamed from: f, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.name.f f407311f = kotlin.reflect.jvm.internal.impl.name.f.h("<built-ins module>");

    /* renamed from: a, reason: collision with root package name */
    public G f407312a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.storage.k<b> f407313b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.storage.k<Collection<P>> f407314c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.name.f, InterfaceC42851d> f407315d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.storage.f f407316e;

    /* compiled from: KotlinBuiltIns.java */
    public class a implements Y41.a<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ G f407317b;

        public a(G g12) {
            this.f407317b = g12;
        }

        @Override // Y41.a
        public final Void invoke() {
            k kVar = k.this;
            G g12 = kVar.f407312a;
            G g13 = this.f407317b;
            if (g12 == null) {
                kVar.f407312a = g13;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + kVar.f407312a + " (attempting to reset to " + g13 + ")");
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map<PrimitiveType, Y> f407319a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<O, Y> f407320b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<Y, Y> f407321c;

        public b() {
            throw null;
        }

        public b(Map map, Map map2, Map map3, h hVar) {
            if (map == null) {
                a(0);
                throw null;
            }
            if (map2 == null) {
                a(1);
                throw null;
            }
            if (map3 == null) {
                a(2);
                throw null;
            }
            this.f407319a = map;
            this.f407320b = map2;
            this.f407321c = map3;
        }

        public static /* synthetic */ void a(int i12) {
            Object[] objArr = new Object[3];
            if (i12 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i12 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public k(@Y61.k kotlin.reflect.jvm.internal.impl.storage.f fVar) {
        this.f407316e = fVar;
        this.f407314c = fVar.g(new h(this));
        this.f407313b = fVar.g(new i(this));
        this.f407315d = fVar.c(new j(this));
    }

    public static boolean A(@Y61.k O o12, @Y61.k kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (dVar != null) {
            return z(o12, dVar) && !o12.I0();
        }
        a(136);
        throw null;
    }

    public static boolean B(@Y61.k InterfaceC42905x interfaceC42905x) {
        if (interfaceC42905x.n0().getAnnotations().i3(n.a.f407388n)) {
            return true;
        }
        if (!(interfaceC42905x instanceof U)) {
            return false;
        }
        U u12 = (U) interfaceC42905x;
        boolean zC02 = u12.c0();
        M getter = u12.getGetter();
        W wC2 = u12.c();
        if (getter != null && B(getter)) {
            if (!zC02) {
                return true;
            }
            if (wC2 != null && B(wC2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean C(@Y61.k O o12, @Y61.k kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (o12 == null) {
            a(106);
            throw null;
        }
        if (dVar != null) {
            return !o12.I0() && z(o12, dVar);
        }
        a(107);
        throw null;
    }

    public static boolean D(@Y61.k O o12) {
        if (o12 == null) {
            a(137);
            throw null;
        }
        if (o12 != null) {
            return z(o12, n.a.f407375c) && !G0.f(o12);
        }
        a(139);
        throw null;
    }

    public static boolean E(@Y61.k O o12) {
        if (o12 != null) {
            InterfaceC42853f interfaceC42853fB = o12.H0().b();
            return (interfaceC42853fB == null || q(interfaceC42853fB) == null) ? false : true;
        }
        a(92);
        throw null;
    }

    public static boolean F(@Y61.k O o12) {
        if (o12 == null) {
            a(95);
            throw null;
        }
        if (!o12.I0()) {
            InterfaceC42853f interfaceC42853fB = o12.H0().b();
            if (interfaceC42853fB instanceof InterfaceC42851d) {
                InterfaceC42851d interfaceC42851d = (InterfaceC42851d) interfaceC42853fB;
                if (interfaceC42851d == null) {
                    a(97);
                    throw null;
                }
                if (s(interfaceC42851d) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean G(@Y61.k q0 q0Var, @Y61.k kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (q0Var == null) {
            a(102);
            throw null;
        }
        if (dVar != null) {
            InterfaceC42853f interfaceC42853fB = q0Var.b();
            return (interfaceC42853fB instanceof InterfaceC42851d) && b((InterfaceC42851d) interfaceC42853fB, dVar);
        }
        a(103);
        throw null;
    }

    public static boolean H(@Y61.k InterfaceC42853f interfaceC42853f) {
        if (interfaceC42853f == null) {
            a(10);
            throw null;
        }
        for (InterfaceC42853f interfaceC42853fF = interfaceC42853f; interfaceC42853fF != null; interfaceC42853fF = interfaceC42853fF.f()) {
            if (interfaceC42853fF instanceof K) {
                return ((K) interfaceC42853fF).d().h(n.f407338k);
            }
        }
        return false;
    }

    public static /* synthetic */ void a(int i12) {
        String str;
        int i13;
        switch (i12) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i12) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i13 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i13 = 3;
                break;
        }
        Object[] objArr = new Object[i13];
        switch (i12) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 99:
            case UpdateStatusCode.DialogButton.CONFIRM /* 101 */:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i12) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                objArr[1] = "getKProperty";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[1] = "getKProperty0";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[1] = "getKProperty1";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[1] = "getKProperty2";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[1] = "getKMutableProperty0";
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case 35:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case 64:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i12) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case UpdateStatusCode.DialogButton.CONFIRM /* 101 */:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case 128:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i12) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(@Y61.k InterfaceC42851d interfaceC42851d, @Y61.k kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (interfaceC42851d == null) {
            a(104);
            throw null;
        }
        if (dVar != null) {
            return interfaceC42851d.getName().equals(dVar.f()) && dVar.equals(kotlin.reflect.jvm.internal.impl.resolve.j.g(interfaceC42851d));
        }
        a(105);
        throw null;
    }

    @Y61.l
    public static PrimitiveType q(@Y61.k InterfaceC42853f interfaceC42853f) {
        if (interfaceC42853f == null) {
            a(78);
            throw null;
        }
        if (n.a.f407374b0.contains(interfaceC42853f.getName())) {
            return (PrimitiveType) n.a.f407378d0.get(kotlin.reflect.jvm.internal.impl.resolve.j.g(interfaceC42853f));
        }
        return null;
    }

    @Y61.l
    public static PrimitiveType s(@Y61.k InterfaceC42851d interfaceC42851d) {
        if (interfaceC42851d == null) {
            a(77);
            throw null;
        }
        if (n.a.f407372a0.contains(interfaceC42851d.getName())) {
            return (PrimitiveType) n.a.f407376c0.get(kotlin.reflect.jvm.internal.impl.resolve.j.g(interfaceC42851d));
        }
        return null;
    }

    public static boolean w(@Y61.k O o12) {
        if (o12 != null) {
            return z(o12, n.a.f407373b);
        }
        a(140);
        throw null;
    }

    public static boolean x(@Y61.k O o12) {
        if (o12 != null) {
            return z(o12, n.a.f407382h);
        }
        a(89);
        throw null;
    }

    public static boolean y(@Y61.k InterfaceC42882k interfaceC42882k) {
        if (interfaceC42882k != null) {
            return kotlin.reflect.jvm.internal.impl.resolve.j.i(interfaceC42882k, kotlin.reflect.jvm.internal.impl.builtins.b.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean z(@Y61.k O o12, @Y61.k kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (o12 == null) {
            a(98);
            throw null;
        }
        if (dVar != null) {
            return G(o12.H0(), dVar);
        }
        a(99);
        throw null;
    }

    public final void I(@Y61.k G g12) {
        a aVar = new a(g12);
        this.f407316e.f409977a.lock();
        try {
            aVar.invoke();
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.C] */
    public final void c(boolean z12) {
        kotlin.reflect.jvm.internal.impl.storage.f fVar = this.f407316e;
        G g12 = new G(f407311f, fVar, this, null, null, null, 48, null);
        this.f407312a = g12;
        kotlin.reflect.jvm.internal.impl.builtins.a.f407188a.getClass();
        g12.f407557i = ((kotlin.reflect.jvm.internal.impl.builtins.a) a.C11647a.f407190b.getValue()).a(fVar, this.f407312a, l(), o(), d(), z12);
        G g13 = this.f407312a;
        g13.getClass();
        List listG0 = C42756l.g0(new G[]{g13});
        B0 b02 = B0.f406639b;
        g13.f407556h = new D(listG0, b02, C42784z0.f406748b, b02);
    }

    @Y61.k
    public InterfaceC40235a d() {
        InterfaceC40235a.C11125a c11125a = InterfaceC40235a.C11125a.f395657a;
        if (c11125a != null) {
            return c11125a;
        }
        a(3);
        throw null;
    }

    @Y61.k
    public final Y e() {
        Y yQ2 = j("Any").q();
        if (yQ2 != null) {
            return yQ2;
        }
        a(51);
        throw null;
    }

    @Y61.k
    public final O f(@Y61.k O o12) {
        kotlin.reflect.jvm.internal.impl.name.b bVarF;
        kotlin.reflect.jvm.internal.impl.name.b bVar;
        InterfaceC42851d interfaceC42851dA;
        Y yQ2 = null;
        if (o12 == null) {
            a(68);
            throw null;
        }
        if (x(o12)) {
            if (o12.F0().size() != 1) {
                throw new IllegalStateException();
            }
            O type = o12.F0().get(0).getType();
            if (type != null) {
                return type;
            }
            a(69);
            throw null;
        }
        J0 j0H = G0.h(o12, false);
        Y y12 = this.f407313b.invoke().f407321c.get(j0H);
        if (y12 != null) {
            return y12;
        }
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.j.f409625a;
        InterfaceC42853f interfaceC42853fB = j0H.H0().b();
        E e12 = interfaceC42853fB == null ? null : kotlin.reflect.jvm.internal.impl.resolve.j.e(interfaceC42853fB);
        if (e12 != null) {
            InterfaceC42853f interfaceC42853fB2 = j0H.H0().b();
            if (interfaceC42853fB2 != null) {
                p pVar = p.f407402a;
                kotlin.reflect.jvm.internal.impl.name.f name = interfaceC42853fB2.getName();
                pVar.getClass();
                if (p.f407407f.contains(name) && (bVarF = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(interfaceC42853fB2)) != null && (bVar = p.f407405d.get(bVarF)) != null && (interfaceC42851dA = C42904w.a(e12, bVar)) != null) {
                    yQ2 = interfaceC42851dA.q();
                }
            }
            if (yQ2 != null) {
                return yQ2;
            }
        }
        throw new IllegalStateException("not array: " + o12);
    }

    @Y61.k
    public final Y g(@Y61.k J0 j02) {
        Variance variance = Variance.f410069d;
        if (j02 != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
            return h(variance, j02, g.a.f407524b);
        }
        a(84);
        throw null;
    }

    @Y61.k
    public final Y h(@Y61.k Variance variance, @Y61.k O o12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (o12 == null) {
            a(80);
            throw null;
        }
        if (gVar != null) {
            return kotlin.reflect.jvm.internal.impl.types.P.d(C42996v.f410262a.a(gVar), j("Array"), Collections.singletonList(new z0(o12, variance)));
        }
        a(81);
        throw null;
    }

    @Y61.k
    public final InterfaceC42851d i(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        G gK2 = k();
        NoLookupLocation noLookupLocation = NoLookupLocation.f407884b;
        InterfaceC42851d interfaceC42851dB = C42888q.b(gK2, cVar);
        if (interfaceC42851dB != null) {
            return interfaceC42851dB;
        }
        a(13);
        throw null;
    }

    @Y61.k
    public final InterfaceC42851d j(@Y61.k String str) {
        if (str == null) {
            a(14);
            throw null;
        }
        InterfaceC42851d interfaceC42851dInvoke = this.f407315d.invoke(kotlin.reflect.jvm.internal.impl.name.f.e(str));
        if (interfaceC42851dInvoke != null) {
            return interfaceC42851dInvoke;
        }
        a(15);
        throw null;
    }

    @Y61.k
    public final G k() {
        this.f407312a.getClass();
        G g12 = this.f407312a;
        if (g12 != null) {
            return g12;
        }
        a(7);
        throw null;
    }

    @Y61.k
    public Iterable<InterfaceC40236b> l() {
        List listSingletonList = Collections.singletonList(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(this.f407316e, k()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    @Y61.k
    public final Y m() {
        Y yQ2 = j("Nothing").q();
        if (yQ2 != null) {
            return yQ2;
        }
        a(49);
        throw null;
    }

    @Y61.k
    public final Y n() {
        Y yO02 = e().L0(true);
        if (yO02 != null) {
            return yO02;
        }
        a(52);
        throw null;
    }

    @Y61.k
    public f51.c o() {
        c.b bVar = c.b.f395659a;
        if (bVar != null) {
            return bVar;
        }
        a(4);
        throw null;
    }

    @Y61.k
    public final Y p(@Y61.k PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(74);
            throw null;
        }
        Y y12 = this.f407313b.invoke().f407319a.get(primitiveType);
        if (y12 != null) {
            return y12;
        }
        a(75);
        throw null;
    }

    @Y61.k
    public final Y r(@Y61.k PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(54);
            throw null;
        }
        if (primitiveType == null) {
            a(16);
            throw null;
        }
        Y yQ2 = j(primitiveType.f407170b.b()).q();
        if (yQ2 != null) {
            return yQ2;
        }
        a(55);
        throw null;
    }

    @Y61.k
    public final Y t() {
        Y yQ2 = j("String").q();
        if (yQ2 != null) {
            return yQ2;
        }
        a(66);
        throw null;
    }

    @Y61.k
    public final InterfaceC42851d u(int i12) {
        return i(n.f407333f.c(kotlin.reflect.jvm.internal.impl.name.f.e(e.d.f407218c.f407214b + i12)));
    }

    @Y61.k
    public final Y v() {
        Y yQ2 = j("Unit").q();
        if (yQ2 != null) {
            return yQ2;
        }
        a(65);
        throw null;
    }
}

package androidx.datastore.preferences.core;

import Y61.l;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.m;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.core.f;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: PreferencesSerializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/datastore/preferences/core/k;", "Landroidx/datastore/core/m;", "Landroidx/datastore/preferences/core/f;", "<init>", "()V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class k implements m<f> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final k f45569a = new k();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f45570b = "preferences_pb";

    /* compiled from: PreferencesSerializer.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45571a;

        static {
            int[] iArr = new int[PreferencesProto.Value.ValueCase.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[6] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
            iArr[4] = 6;
            iArr[5] = 7;
            iArr[7] = 8;
            f45571a = iArr;
        }
    }

    @Override // androidx.datastore.core.m
    public final G0 a(Object obj, OutputStream outputStream) {
        PreferencesProto.Value valueI;
        Map<f.a<?>, Object> mapA = ((f) obj).a();
        PreferencesProto.b.a aVarS = PreferencesProto.b.s();
        for (Map.Entry<f.a<?>, Object> entry : mapA.entrySet()) {
            f.a<?> key = entry.getKey();
            Object value = entry.getValue();
            String str = key.f45565a;
            if (value instanceof Boolean) {
                PreferencesProto.Value.a aVarG = PreferencesProto.Value.G();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                aVarG.k();
                PreferencesProto.Value.u((PreferencesProto.Value) aVarG.f45668c, zBooleanValue);
                valueI = aVarG.i();
            } else if (value instanceof Float) {
                PreferencesProto.Value.a aVarG2 = PreferencesProto.Value.G();
                float fFloatValue = ((Number) value).floatValue();
                aVarG2.k();
                PreferencesProto.Value.v((PreferencesProto.Value) aVarG2.f45668c, fFloatValue);
                valueI = aVarG2.i();
            } else if (value instanceof Double) {
                PreferencesProto.Value.a aVarG3 = PreferencesProto.Value.G();
                double dDoubleValue = ((Number) value).doubleValue();
                aVarG3.k();
                PreferencesProto.Value.s((PreferencesProto.Value) aVarG3.f45668c, dDoubleValue);
                valueI = aVarG3.i();
            } else if (value instanceof Integer) {
                PreferencesProto.Value.a aVarG4 = PreferencesProto.Value.G();
                int iIntValue = ((Number) value).intValue();
                aVarG4.k();
                PreferencesProto.Value.w((PreferencesProto.Value) aVarG4.f45668c, iIntValue);
                valueI = aVarG4.i();
            } else if (value instanceof Long) {
                PreferencesProto.Value.a aVarG5 = PreferencesProto.Value.G();
                long jLongValue = ((Number) value).longValue();
                aVarG5.k();
                PreferencesProto.Value.p((PreferencesProto.Value) aVarG5.f45668c, jLongValue);
                valueI = aVarG5.i();
            } else if (value instanceof String) {
                PreferencesProto.Value.a aVarG6 = PreferencesProto.Value.G();
                aVarG6.k();
                PreferencesProto.Value.q((PreferencesProto.Value) aVarG6.f45668c, (String) value);
                valueI = aVarG6.i();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(L.j(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                PreferencesProto.Value.a aVarG7 = PreferencesProto.Value.G();
                PreferencesProto.d.a aVarT = PreferencesProto.d.t();
                aVarT.k();
                PreferencesProto.d.q((PreferencesProto.d) aVarT.f45668c, (Set) value);
                aVarG7.k();
                PreferencesProto.Value.r((PreferencesProto.Value) aVarG7.f45668c, aVarT);
                valueI = aVarG7.i();
            }
            aVarS.getClass();
            str.getClass();
            aVarS.k();
            PreferencesProto.b.q((PreferencesProto.b) aVarS.f45668c).put(str, valueI);
        }
        aVarS.i().g(outputStream);
        return G0.f406611a;
    }

    @Override // androidx.datastore.core.m
    @l
    public final androidx.datastore.preferences.core.a b(@Y61.k FileInputStream fileInputStream) throws CorruptionException {
        androidx.datastore.preferences.f.f45580a.getClass();
        try {
            PreferencesProto.b bVarT = PreferencesProto.b.t(fileInputStream);
            androidx.datastore.preferences.core.a aVarA = g.a(new f.b[0]);
            for (Map.Entry<String, PreferencesProto.Value> entry : bVarT.r().entrySet()) {
                String key = entry.getKey();
                PreferencesProto.Value value = entry.getValue();
                f45569a.getClass();
                PreferencesProto.Value.ValueCase valueCaseF = value.F();
                switch (valueCaseF == null ? -1 : a.f45571a[valueCaseF.ordinal()]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null, 2, null);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        aVarA.d(new f.a<>(key), Boolean.valueOf(value.x()));
                        break;
                    case 2:
                        aVarA.d(new f.a<>(key), Float.valueOf(value.A()));
                        break;
                    case 3:
                        aVarA.d(new f.a<>(key), Double.valueOf(value.z()));
                        break;
                    case 4:
                        aVarA.d(new f.a<>(key), Integer.valueOf(value.B()));
                        break;
                    case 5:
                        aVarA.d(new f.a<>(key), Long.valueOf(value.C()));
                        break;
                    case 6:
                        aVarA.d(new f.a<>(key), value.D());
                        break;
                    case 7:
                        aVarA.d(new f.a<>(key), C42745f0.P0(value.E().s()));
                        break;
                    case 8:
                        throw new CorruptionException("Value not set.", null, 2, null);
                }
            }
            return new androidx.datastore.preferences.core.a(new LinkedHashMap(Collections.unmodifiableMap(aVarA.f45556a)), true);
        } catch (InvalidProtocolBufferException e12) {
            throw new CorruptionException("Unable to parse preferences proto.", e12);
        }
    }

    @Override // androidx.datastore.core.m
    public final androidx.datastore.preferences.core.a getDefaultValue() {
        return new androidx.datastore.preferences.core.a(null, true, 1, null);
    }
}

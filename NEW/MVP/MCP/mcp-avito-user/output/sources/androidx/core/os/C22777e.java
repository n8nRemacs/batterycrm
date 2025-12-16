package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: Bundle.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.core.os.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22777e {
    @Y61.k
    public static final Bundle a() {
        return new Bundle(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final Bundle b(@Y61.k Q<String, ? extends Object>... qArr) {
        Bundle bundle = new Bundle(qArr.length);
        for (Q<String, ? extends Object> q12 : qArr) {
            String str = q12.f406619b;
            B b12 = q12.f406620c;
            if (b12 == 0) {
                bundle.putString(str, null);
            } else if (b12 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b12).booleanValue());
            } else if (b12 instanceof Byte) {
                bundle.putByte(str, ((Number) b12).byteValue());
            } else if (b12 instanceof Character) {
                bundle.putChar(str, ((Character) b12).charValue());
            } else if (b12 instanceof Double) {
                bundle.putDouble(str, ((Number) b12).doubleValue());
            } else if (b12 instanceof Float) {
                bundle.putFloat(str, ((Number) b12).floatValue());
            } else if (b12 instanceof Integer) {
                bundle.putInt(str, ((Number) b12).intValue());
            } else if (b12 instanceof Long) {
                bundle.putLong(str, ((Number) b12).longValue());
            } else if (b12 instanceof Short) {
                bundle.putShort(str, ((Number) b12).shortValue());
            } else if (b12 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b12);
            } else if (b12 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b12);
            } else if (b12 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b12);
            } else if (b12 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b12);
            } else if (b12 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b12);
            } else if (b12 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b12);
            } else if (b12 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b12);
            } else if (b12 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b12);
            } else if (b12 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b12);
            } else if (b12 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b12);
            } else if (b12 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b12);
            } else if (b12 instanceof Object[]) {
                Class<?> componentType = b12.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b12);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b12);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b12);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) b12);
                }
            } else if (b12 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b12);
            } else if (b12 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) b12);
            } else if (b12 instanceof Size) {
                int i12 = C22775c.f44797a;
                bundle.putSize(str, (Size) b12);
            } else {
                if (!(b12 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + b12.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                int i13 = C22775c.f44797a;
                bundle.putSizeF(str, (SizeF) b12);
            }
        }
        return bundle;
    }
}

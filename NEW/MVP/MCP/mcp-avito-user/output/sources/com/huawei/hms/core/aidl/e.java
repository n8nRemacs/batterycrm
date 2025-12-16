package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MessageCodec.java */
/* loaded from: classes7.dex */
public class e {
    private void b(IMessageEntity iMessageEntity, Field field, Bundle bundle) throws SecurityException {
        boolean zIsAccessible = field.isAccessible();
        field.setAccessible(true);
        a(field.getName(), field.get(iMessageEntity), bundle);
        field.setAccessible(zIsAccessible);
    }

    public IMessageEntity a(Bundle bundle, IMessageEntity iMessageEntity) {
        if (bundle == null) {
            return iMessageEntity;
        }
        bundle.setClassLoader(getClass().getClassLoader());
        for (Class<?> superclass = iMessageEntity.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (field.isAnnotationPresent(Packed.class)) {
                    try {
                        a(iMessageEntity, field, bundle);
                    } catch (IllegalAccessException | IllegalArgumentException unused) {
                        field.getName();
                    }
                }
            }
        }
        return iMessageEntity;
    }

    private boolean b(String str, Object obj, Bundle bundle) {
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Short) {
            bundle.putShort(str, ((Short) obj).shortValue());
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        }
        if (!(obj instanceof Boolean)) {
            return false;
        }
        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        return true;
    }

    private void a(IMessageEntity iMessageEntity, Field field, Bundle bundle) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Object objA = a(field, bundle);
        if (objA != null) {
            boolean zIsAccessible = field.isAccessible();
            field.setAccessible(true);
            field.set(iMessageEntity, objA);
            field.setAccessible(zIsAccessible);
        }
    }

    private Object a(Field field, Bundle bundle) {
        Object obj = bundle.get(field.getName());
        if (obj instanceof Bundle) {
            try {
                Bundle bundle2 = (Bundle) obj;
                int i12 = bundle2.getInt("_val_type_", -1);
                if (i12 == 1) {
                    return a(field.getGenericType(), bundle2);
                }
                if (i12 == 0) {
                    return a((Bundle) obj, (IMessageEntity) field.getType().newInstance());
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return obj;
    }

    public List<Object> a(Type type, Bundle bundle) throws InstantiationException {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle2 = bundle.getBundle("_next_item_"); bundle2 != null; bundle2 = bundle2.getBundle("_next_item_")) {
            Object obj = bundle2.get("_value_");
            if (!obj.getClass().isPrimitive() && !(obj instanceof String) && !(obj instanceof Serializable)) {
                if (obj instanceof Bundle) {
                    Bundle bundle3 = (Bundle) obj;
                    int i12 = bundle3.getInt("_val_type_", -1);
                    if (i12 == 1) {
                        throw new InstantiationException("Nested List can not be supported");
                    }
                    if (i12 == 0) {
                        arrayList.add(a(bundle3, (IMessageEntity) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
                    } else {
                        throw new InstantiationException("Unknown type can not be supported");
                    }
                } else {
                    continue;
                }
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public Bundle a(IMessageEntity iMessageEntity, Bundle bundle) {
        for (Class<?> superclass = iMessageEntity.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (field.isAnnotationPresent(Packed.class)) {
                    try {
                        b(iMessageEntity, field, bundle);
                    } catch (IllegalAccessException | IllegalArgumentException unused) {
                        field.getName();
                    }
                }
            }
        }
        return bundle;
    }

    public void a(String str, Object obj, Bundle bundle) {
        if (obj == null || b(str, obj, bundle)) {
            return;
        }
        if (obj instanceof CharSequence) {
            bundle.putCharSequence(str, (CharSequence) obj);
            return;
        }
        if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
            return;
        }
        if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
            return;
        }
        if (obj instanceof List) {
            a(str, (List) obj, bundle);
            return;
        }
        if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        } else if (obj instanceof IMessageEntity) {
            Bundle bundleA = a((IMessageEntity) obj, new Bundle());
            bundleA.putInt("_val_type_", 0);
            bundle.putBundle(str, bundleA);
        }
    }

    public void a(String str, List list, Bundle bundle) {
        Bundle bundleA = null;
        for (Object obj : list) {
            if (bundleA == null) {
                bundleA = new Bundle();
                bundle.putBundle(str, bundleA);
                bundleA.putInt("_val_type_", 1);
            }
            bundleA = a("_value_", bundleA, obj);
        }
    }

    private Bundle a(String str, Bundle bundle, Object obj) {
        Bundle bundle2 = new Bundle();
        a(str, obj, bundle2);
        bundle.putBundle("_next_item_", bundle2);
        return bundle2;
    }
}

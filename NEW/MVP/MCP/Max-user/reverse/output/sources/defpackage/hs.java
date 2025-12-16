package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final class hs implements dbd {
    public static final Object d = new Object();
    public final String a;
    public final Class b;
    public final Object c;

    public hs(Class cls, Object obj, String str) {
        this.a = str;
        this.b = cls;
        this.c = obj;
    }

    @Override // defpackage.bbd
    public final /* bridge */ /* synthetic */ Object D(Object obj, yy7 yy7Var) {
        return a((Widget) obj);
    }

    @Override // defpackage.dbd
    public final /* bridge */ /* synthetic */ void O(Object obj, yy7 yy7Var, Object obj2) {
        b((Widget) obj, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d4 A[Catch: all -> 0x0223, TryCatch #0 {all -> 0x0223, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cb, B:57:0x00d1, B:59:0x00e5, B:60:0x00e9, B:61:0x00ef, B:63:0x00f7, B:65:0x00fd, B:66:0x010e, B:68:0x0114, B:70:0x0128, B:71:0x012c, B:72:0x0132, B:74:0x013a, B:76:0x0140, B:77:0x0157, B:79:0x015d, B:80:0x016f, B:82:0x017a, B:84:0x0182, B:86:0x0188, B:88:0x0192, B:89:0x01a2, B:90:0x01ab, B:92:0x01b3, B:94:0x01bd, B:96:0x01c1, B:98:0x01c5, B:103:0x01cf, B:104:0x01d4, B:106:0x01da, B:107:0x01e3, B:109:0x01e9, B:110:0x01f2, B:112:0x01f8, B:113:0x0201, B:115:0x0207, B:116:0x0210, B:117:0x0215, B:119:0x021b), top: B:125:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e3 A[Catch: all -> 0x0223, TryCatch #0 {all -> 0x0223, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cb, B:57:0x00d1, B:59:0x00e5, B:60:0x00e9, B:61:0x00ef, B:63:0x00f7, B:65:0x00fd, B:66:0x010e, B:68:0x0114, B:70:0x0128, B:71:0x012c, B:72:0x0132, B:74:0x013a, B:76:0x0140, B:77:0x0157, B:79:0x015d, B:80:0x016f, B:82:0x017a, B:84:0x0182, B:86:0x0188, B:88:0x0192, B:89:0x01a2, B:90:0x01ab, B:92:0x01b3, B:94:0x01bd, B:96:0x01c1, B:98:0x01c5, B:103:0x01cf, B:104:0x01d4, B:106:0x01da, B:107:0x01e3, B:109:0x01e9, B:110:0x01f2, B:112:0x01f8, B:113:0x0201, B:115:0x0207, B:116:0x0210, B:117:0x0215, B:119:0x021b), top: B:125:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f2 A[Catch: all -> 0x0223, TryCatch #0 {all -> 0x0223, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cb, B:57:0x00d1, B:59:0x00e5, B:60:0x00e9, B:61:0x00ef, B:63:0x00f7, B:65:0x00fd, B:66:0x010e, B:68:0x0114, B:70:0x0128, B:71:0x012c, B:72:0x0132, B:74:0x013a, B:76:0x0140, B:77:0x0157, B:79:0x015d, B:80:0x016f, B:82:0x017a, B:84:0x0182, B:86:0x0188, B:88:0x0192, B:89:0x01a2, B:90:0x01ab, B:92:0x01b3, B:94:0x01bd, B:96:0x01c1, B:98:0x01c5, B:103:0x01cf, B:104:0x01d4, B:106:0x01da, B:107:0x01e3, B:109:0x01e9, B:110:0x01f2, B:112:0x01f8, B:113:0x0201, B:115:0x0207, B:116:0x0210, B:117:0x0215, B:119:0x021b), top: B:125:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0201 A[Catch: all -> 0x0223, TryCatch #0 {all -> 0x0223, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cb, B:57:0x00d1, B:59:0x00e5, B:60:0x00e9, B:61:0x00ef, B:63:0x00f7, B:65:0x00fd, B:66:0x010e, B:68:0x0114, B:70:0x0128, B:71:0x012c, B:72:0x0132, B:74:0x013a, B:76:0x0140, B:77:0x0157, B:79:0x015d, B:80:0x016f, B:82:0x017a, B:84:0x0182, B:86:0x0188, B:88:0x0192, B:89:0x01a2, B:90:0x01ab, B:92:0x01b3, B:94:0x01bd, B:96:0x01c1, B:98:0x01c5, B:103:0x01cf, B:104:0x01d4, B:106:0x01da, B:107:0x01e3, B:109:0x01e9, B:110:0x01f2, B:112:0x01f8, B:113:0x0201, B:115:0x0207, B:116:0x0210, B:117:0x0215, B:119:0x021b), top: B:125:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0215 A[Catch: all -> 0x0223, TryCatch #0 {all -> 0x0223, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cb, B:57:0x00d1, B:59:0x00e5, B:60:0x00e9, B:61:0x00ef, B:63:0x00f7, B:65:0x00fd, B:66:0x010e, B:68:0x0114, B:70:0x0128, B:71:0x012c, B:72:0x0132, B:74:0x013a, B:76:0x0140, B:77:0x0157, B:79:0x015d, B:80:0x016f, B:82:0x017a, B:84:0x0182, B:86:0x0188, B:88:0x0192, B:89:0x01a2, B:90:0x01ab, B:92:0x01b3, B:94:0x01bd, B:96:0x01c1, B:98:0x01c5, B:103:0x01cf, B:104:0x01d4, B:106:0x01da, B:107:0x01e3, B:109:0x01e9, B:110:0x01f2, B:112:0x01f8, B:113:0x0201, B:115:0x0207, B:116:0x0210, B:117:0x0215, B:119:0x021b), top: B:125:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(one.me.sdk.arch.Widget r9) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs.a(one.me.sdk.arch.Widget):java.lang.Object");
    }

    public final void b(Widget widget, Object obj) {
        Bundle args = widget.getArgs();
        String str = this.a;
        if (obj == null) {
            args.remove(str);
            return;
        }
        Class cls = this.b;
        if (!fni.a(cls, Boolean.class)) {
            Class cls2 = Boolean.TYPE;
            if (!fni.a(cls, cls2) && !fni.a(cls, cls2)) {
                if (fni.a(cls, boolean[].class)) {
                    args.putBooleanArray(str, (boolean[]) obj);
                    return;
                }
                if (!fni.a(cls, Character.class)) {
                    Class cls3 = Character.TYPE;
                    if (!fni.a(cls, cls3) && !fni.a(cls, cls3)) {
                        if (fni.a(cls, char[].class)) {
                            args.putCharArray(str, (char[]) obj);
                            return;
                        }
                        if (fni.a(cls, CharSequence.class)) {
                            args.putCharSequence(str, (CharSequence) obj);
                            return;
                        }
                        if (fni.a(cls, CharSequence[].class)) {
                            args.putCharSequenceArray(str, (CharSequence[]) obj);
                            return;
                        }
                        if (fni.a(cls, String.class) || fni.a(cls, null) || fni.a(cls, String.class)) {
                            args.putString(str, (String) obj);
                            return;
                        }
                        if (fni.a(cls, String[].class)) {
                            args.putStringArray(str, (String[]) obj);
                            return;
                        }
                        if (!fni.a(cls, Integer.class)) {
                            Class cls4 = Integer.TYPE;
                            if (!fni.a(cls, cls4) && !fni.a(cls, cls4)) {
                                if (fni.a(cls, int[].class)) {
                                    args.putIntArray(str, (int[]) obj);
                                    return;
                                }
                                if (!fni.a(cls, Long.class)) {
                                    Class cls5 = Long.TYPE;
                                    if (!fni.a(cls, cls5) && !fni.a(cls, cls5)) {
                                        if (fni.a(cls, long[].class)) {
                                            args.putLongArray(str, (long[]) obj);
                                            return;
                                        }
                                        if (!fni.a(cls, Float.class)) {
                                            Class cls6 = Float.TYPE;
                                            if (!fni.a(cls, cls6) && !fni.a(cls, cls6)) {
                                                if (fni.a(cls, float[].class)) {
                                                    args.putFloatArray(str, (float[]) obj);
                                                    return;
                                                }
                                                if (!fni.a(cls, Double.class)) {
                                                    Class cls7 = Double.TYPE;
                                                    if (!fni.a(cls, cls7) && !fni.a(cls, cls7)) {
                                                        if (fni.a(cls, double[].class)) {
                                                            args.putDoubleArray(str, (double[]) obj);
                                                            return;
                                                        }
                                                        if (!fni.a(cls, Short.class)) {
                                                            Class cls8 = Short.TYPE;
                                                            if (!fni.a(cls, cls8) && !fni.a(cls, cls8)) {
                                                                if (fni.a(cls, short[].class)) {
                                                                    args.putShortArray(str, (short[]) obj);
                                                                    return;
                                                                }
                                                                if (!fni.a(cls, Byte.class)) {
                                                                    Class cls9 = Byte.TYPE;
                                                                    if (!fni.a(cls, cls9) && !fni.a(cls, cls9)) {
                                                                        if (fni.a(cls, byte[].class)) {
                                                                            args.putByteArray(str, (byte[]) obj);
                                                                            return;
                                                                        }
                                                                        if (fni.a(cls, Parcelable[].class)) {
                                                                            args.putParcelableArray(str, (Parcelable[]) obj);
                                                                            return;
                                                                        }
                                                                        if (fni.a(cls, Bundle.class)) {
                                                                            args.putBundle(str, (Bundle) obj);
                                                                            return;
                                                                        }
                                                                        if (fni.a(cls, Size.class)) {
                                                                            args.putSize(str, (Size) obj);
                                                                            return;
                                                                        }
                                                                        if (fni.a(cls, SizeF.class)) {
                                                                            args.putSizeF(str, (SizeF) obj);
                                                                            return;
                                                                        }
                                                                        if (fni.a(cls, ArrayList.class)) {
                                                                            ArrayList<Integer> arrayList = (ArrayList) obj;
                                                                            if (arrayList.isEmpty()) {
                                                                                return;
                                                                            }
                                                                            Object objG = ue3.G(arrayList);
                                                                            if (objG instanceof String) {
                                                                                args.putStringArrayList(str, arrayList);
                                                                                return;
                                                                            }
                                                                            if (objG instanceof Parcelable) {
                                                                                args.putParcelableArrayList(str, arrayList);
                                                                                return;
                                                                            } else if (objG instanceof CharSequence) {
                                                                                args.putCharSequenceArrayList(str, arrayList);
                                                                                return;
                                                                            } else {
                                                                                if (!(objG instanceof Integer)) {
                                                                                    throw new UnsupportedOperationException(String.format("ArrayList with type of `%s` is not supported!", Arrays.copyOf(new Object[]{ue3.G(arrayList).getClass()}, 1)));
                                                                                }
                                                                                args.putIntegerArrayList(str, arrayList);
                                                                                return;
                                                                            }
                                                                        }
                                                                        if (fni.a(cls, SparseArray.class)) {
                                                                            SparseArray<? extends Parcelable> sparseArray = (SparseArray) obj;
                                                                            if (sparseArray.size() != 0) {
                                                                                Parcelable parcelableValueAt = sparseArray.valueAt(0);
                                                                                if (!(parcelableValueAt instanceof Parcelable)) {
                                                                                    throw new UnsupportedOperationException(String.format("SparseArray with type of `%s` is not supported!", Arrays.copyOf(new Object[]{parcelableValueAt.getClass()}, 1)));
                                                                                }
                                                                                args.putSparseParcelableArray(str, sparseArray);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        if (IBinder.class.isAssignableFrom(cls)) {
                                                                            args.putBinder(str, (IBinder) obj);
                                                                            return;
                                                                        } else if (Parcelable.class.isAssignableFrom(cls)) {
                                                                            args.putParcelable(str, (Parcelable) obj);
                                                                            return;
                                                                        } else {
                                                                            if (!Serializable.class.isAssignableFrom(cls)) {
                                                                                throw new UnsupportedOperationException(String.format("Value of `%s` type is not supported", Arrays.copyOf(new Object[]{cls}, 1)));
                                                                            }
                                                                            args.putSerializable(str, (Serializable) obj);
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                                args.putByte(str, ((Byte) obj).byteValue());
                                                                return;
                                                            }
                                                        }
                                                        args.putShort(str, ((Short) obj).shortValue());
                                                        return;
                                                    }
                                                }
                                                args.putDouble(str, ((Double) obj).doubleValue());
                                                return;
                                            }
                                        }
                                        args.putFloat(str, ((Float) obj).floatValue());
                                        return;
                                    }
                                }
                                args.putLong(str, ((Long) obj).longValue());
                                return;
                            }
                        }
                        args.putInt(str, ((Integer) obj).intValue());
                        return;
                    }
                }
                args.putChar(str, ((Character) obj).charValue());
                return;
            }
        }
        args.putBoolean(str, ((Boolean) obj).booleanValue());
    }

    public /* synthetic */ hs(Class cls, String str) {
        this(cls, d, str);
    }
}

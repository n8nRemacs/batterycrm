package defpackage;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class ari {
    public static boolean a = true;
    public static Field b;
    public static boolean c;

    public static final String b(c54 c54Var) {
        return xc0.e(c54Var.hashCode(), c54Var.getClass().getName(), "@");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:52|23|65|24|(7:27|28|29|30|48|(0)|53)|46) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        r15 = r1;
        r1 = r12;
        r12 = r11;
        r11 = r14;
        r14 = r3;
        r3 = r15;
        r17 = r7;
        r7 = r9;
        r8 = r17;
        r17 = r13;
        r13 = r10;
        r10 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        if (defpackage.n8j.c(r0, r1) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0122, code lost:
    
        if (defpackage.s8j.d(r8, r1) == r2) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:34:0x00d1, B:41:0x0102], limit reached: 61 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r14v1, types: [n2] */
    /* JADX WARN: Type inference failed for: r14v10, types: [n2] */
    /* JADX WARN: Type inference failed for: r14v11, types: [n2] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ac -> B:30:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ff -> B:47:0x0125). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0122 -> B:47:0x0125). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.hwa r19, defpackage.fh2 r20, long r21, int r23, java.lang.String r24, defpackage.oje r25, defpackage.q44 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ari.c(hwa, fh2, long, int, java.lang.String, oje, q44):java.lang.Object");
    }

    public float a(View view) {
        if (a) {
            try {
                return xhh.a(view);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    public void d(View view, float f) {
        if (a) {
            try {
                xhh.b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f);
    }

    public void e(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}

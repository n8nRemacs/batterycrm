package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.o;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintAnchor {

    /* renamed from: b, reason: collision with root package name */
    public int f43385b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f43386c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintWidget f43387d;

    /* renamed from: e, reason: collision with root package name */
    public final Type f43388e;

    /* renamed from: f, reason: collision with root package name */
    public ConstraintAnchor f43389f;

    /* renamed from: i, reason: collision with root package name */
    public SolverVariable f43392i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet<ConstraintAnchor> f43384a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f43390g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f43391h = BeduinInputModel.MIN_TEXT_VERSION;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f43393b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f43394c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f43395d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f43396e;

        /* renamed from: f, reason: collision with root package name */
        public static final Type f43397f;

        /* renamed from: g, reason: collision with root package name */
        public static final Type f43398g;

        /* renamed from: h, reason: collision with root package name */
        public static final Type f43399h;

        /* renamed from: i, reason: collision with root package name */
        public static final Type f43400i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ Type[] f43401j;

        /* JADX INFO: Fake field, exist only in values array */
        Type EF0;

        static {
            Type type = new Type("NONE", 0);
            Type type2 = new Type("LEFT", 1);
            f43393b = type2;
            Type type3 = new Type("TOP", 2);
            f43394c = type3;
            Type type4 = new Type("RIGHT", 3);
            f43395d = type4;
            Type type5 = new Type("BOTTOM", 4);
            f43396e = type5;
            Type type6 = new Type("BASELINE", 5);
            f43397f = type6;
            Type type7 = new Type("CENTER", 6);
            f43398g = type7;
            Type type8 = new Type("CENTER_X", 7);
            f43399h = type8;
            Type type9 = new Type("CENTER_Y", 8);
            f43400i = type9;
            f43401j = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f43401j.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43402a;

        static {
            int[] iArr = new int[Type.values().length];
            f43402a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43402a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43402a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43402a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43402a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43402a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43402a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43402a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f43402a[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f43387d = constraintWidget;
        this.f43388e = type;
    }

    public final void a(ConstraintAnchor constraintAnchor, int i12) {
        b(constraintAnchor, i12, BeduinInputModel.MIN_TEXT_VERSION, false);
    }

    public final boolean b(ConstraintAnchor constraintAnchor, int i12, int i13, boolean z12) {
        if (constraintAnchor == null) {
            j();
            return true;
        }
        if (!z12 && !i(constraintAnchor)) {
            return false;
        }
        this.f43389f = constraintAnchor;
        if (constraintAnchor.f43384a == null) {
            constraintAnchor.f43384a = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.f43389f.f43384a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f43390g = i12;
        this.f43391h = i13;
        return true;
    }

    public final void c(int i12, o oVar, ArrayList arrayList) {
        HashSet<ConstraintAnchor> hashSet = this.f43384a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.analyzer.i.a(it.next().f43387d, i12, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (this.f43386c) {
            return this.f43385b;
        }
        return 0;
    }

    public final int e() {
        ConstraintAnchor constraintAnchor;
        if (this.f43387d.f43446i0 == 8) {
            return 0;
        }
        int i12 = this.f43391h;
        return (i12 == Integer.MIN_VALUE || (constraintAnchor = this.f43389f) == null || constraintAnchor.f43387d.f43446i0 != 8) ? this.f43390g : i12;
    }

    public final ConstraintAnchor f() {
        Type type = this.f43388e;
        int iOrdinal = type.ordinal();
        ConstraintWidget constraintWidget = this.f43387d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return constraintWidget.f43414L;
            case 2:
                return constraintWidget.f43415M;
            case 3:
                return constraintWidget.f43412J;
            case 4:
                return constraintWidget.f43413K;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final boolean g() {
        HashSet<ConstraintAnchor> hashSet = this.f43384a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f43389f != null;
    }

    public final boolean i(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type type = Type.f43397f;
        Type type2 = this.f43388e;
        ConstraintWidget constraintWidget = constraintAnchor.f43387d;
        Type type3 = constraintAnchor.f43388e;
        if (type3 == type2) {
            return type2 != type || (constraintWidget.f43407E && this.f43387d.f43407E);
        }
        int iOrdinal = type2.ordinal();
        Type type4 = Type.f43399h;
        Type type5 = Type.f43400i;
        Type type6 = Type.f43395d;
        Type type7 = Type.f43393b;
        switch (iOrdinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z12 = type3 == type7 || type3 == type6;
                if (constraintWidget instanceof f) {
                    return z12 || type3 == type4;
                }
                return z12;
            case 2:
            case 4:
                boolean z13 = type3 == Type.f43394c || type3 == Type.f43396e;
                if (constraintWidget instanceof f) {
                    return z13 || type3 == type5;
                }
                return z13;
            case 5:
                return (type3 == type7 || type3 == type6) ? false : true;
            case 6:
                return (type3 == type || type3 == type4 || type3 == type5) ? false : true;
            default:
                throw new AssertionError(type2.name());
        }
    }

    public final void j() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f43389f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f43384a) != null) {
            hashSet.remove(this);
            if (this.f43389f.f43384a.size() == 0) {
                this.f43389f.f43384a = null;
            }
        }
        this.f43384a = null;
        this.f43389f = null;
        this.f43390g = 0;
        this.f43391h = BeduinInputModel.MIN_TEXT_VERSION;
        this.f43386c = false;
        this.f43385b = 0;
    }

    public final void k() {
        SolverVariable solverVariable = this.f43392i;
        if (solverVariable == null) {
            this.f43392i = new SolverVariable(SolverVariable.Type.f43187b);
        } else {
            solverVariable.c();
        }
    }

    public final void l(int i12) {
        this.f43385b = i12;
        this.f43386c = true;
    }

    public final String toString() {
        return this.f43387d.f43450k0 + ":" + this.f43388e.toString();
    }
}

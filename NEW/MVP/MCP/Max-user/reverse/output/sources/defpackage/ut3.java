package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.EglBase;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class ut3 {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(h6d.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(h6d.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(h6d.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(h6d.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(h6d.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(h6d.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(h6d.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(h6d.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(h6d.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(h6d.Constraint_layout_constraintBaseline_toTopOf, 91);
        sparseIntArray.append(h6d.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sparseIntArray.append(h6d.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(h6d.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(h6d.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(h6d.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(h6d.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(h6d.Constraint_guidelineUseRtl, 99);
        sparseIntArray.append(h6d.Constraint_android_orientation, 27);
        sparseIntArray.append(h6d.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(h6d.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(h6d.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(h6d.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(h6d.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(h6d.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(h6d.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(h6d.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(h6d.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(h6d.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(h6d.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(h6d.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(h6d.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(h6d.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(h6d.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(h6d.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(h6d.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(h6d.Constraint_layout_constraintLeft_creator, 87);
        sparseIntArray.append(h6d.Constraint_layout_constraintTop_creator, 87);
        sparseIntArray.append(h6d.Constraint_layout_constraintRight_creator, 87);
        sparseIntArray.append(h6d.Constraint_layout_constraintBottom_creator, 87);
        sparseIntArray.append(h6d.Constraint_layout_constraintBaseline_creator, 87);
        sparseIntArray.append(h6d.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(h6d.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(h6d.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(h6d.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(h6d.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(h6d.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(h6d.Constraint_android_layout_width, 23);
        sparseIntArray.append(h6d.Constraint_android_layout_height, 21);
        sparseIntArray.append(h6d.Constraint_layout_constraintWidth, 95);
        sparseIntArray.append(h6d.Constraint_layout_constraintHeight, 96);
        sparseIntArray.append(h6d.Constraint_android_visibility, 22);
        sparseIntArray.append(h6d.Constraint_android_alpha, 43);
        sparseIntArray.append(h6d.Constraint_android_elevation, 44);
        sparseIntArray.append(h6d.Constraint_android_rotationX, 45);
        sparseIntArray.append(h6d.Constraint_android_rotationY, 46);
        sparseIntArray.append(h6d.Constraint_android_rotation, 60);
        sparseIntArray.append(h6d.Constraint_android_scaleX, 47);
        sparseIntArray.append(h6d.Constraint_android_scaleY, 48);
        sparseIntArray.append(h6d.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(h6d.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(h6d.Constraint_android_translationX, 51);
        sparseIntArray.append(h6d.Constraint_android_translationY, 52);
        sparseIntArray.append(h6d.Constraint_android_translationZ, 53);
        sparseIntArray.append(h6d.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(h6d.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(h6d.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(h6d.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(h6d.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(h6d.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(h6d.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(h6d.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(h6d.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(h6d.Constraint_animateRelativeTo, 64);
        sparseIntArray.append(h6d.Constraint_transitionEasing, 65);
        sparseIntArray.append(h6d.Constraint_drawPath, 66);
        sparseIntArray.append(h6d.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(h6d.Constraint_motionStagger, 79);
        sparseIntArray.append(h6d.Constraint_android_id, 38);
        sparseIntArray.append(h6d.Constraint_motionProgress, 68);
        sparseIntArray.append(h6d.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(h6d.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(h6d.Constraint_layout_wrapBehaviorInParent, 97);
        sparseIntArray.append(h6d.Constraint_chainUseRtl, 71);
        sparseIntArray.append(h6d.Constraint_barrierDirection, 72);
        sparseIntArray.append(h6d.Constraint_barrierMargin, 73);
        sparseIntArray.append(h6d.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(h6d.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(h6d.Constraint_pathMotionArc, 76);
        sparseIntArray.append(h6d.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(h6d.Constraint_visibilityMode, 78);
        sparseIntArray.append(h6d.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(h6d.Constraint_layout_constrainedHeight, 81);
        sparseIntArray.append(h6d.Constraint_polarRelativeTo, 82);
        sparseIntArray.append(h6d.Constraint_transformPivotTarget, 83);
        sparseIntArray.append(h6d.Constraint_quantizeMotionSteps, 84);
        sparseIntArray.append(h6d.Constraint_quantizeMotionPhase, 85);
        sparseIntArray.append(h6d.Constraint_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_editor_absoluteY, 6);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_editor_absoluteY, 7);
        sparseIntArray2.append(h6d.ConstraintOverride_android_orientation, 27);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_goneMarginLeft, 13);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_goneMarginTop, 16);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_goneMarginRight, 14);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_goneMarginBottom, 11);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_goneMarginStart, 15);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_goneMarginEnd, 12);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintVertical_weight, 40);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintVertical_bias, 37);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintLeft_creator, 87);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintTop_creator, 87);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintRight_creator, 87);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintBottom_creator, 87);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sparseIntArray2.append(h6d.ConstraintOverride_android_layout_marginLeft, 24);
        sparseIntArray2.append(h6d.ConstraintOverride_android_layout_marginRight, 28);
        sparseIntArray2.append(h6d.ConstraintOverride_android_layout_marginStart, 31);
        sparseIntArray2.append(h6d.ConstraintOverride_android_layout_marginEnd, 8);
        sparseIntArray2.append(h6d.ConstraintOverride_android_layout_marginTop, 34);
        sparseIntArray2.append(h6d.ConstraintOverride_android_layout_marginBottom, 2);
        sparseIntArray2.append(h6d.ConstraintOverride_android_layout_width, 23);
        sparseIntArray2.append(h6d.ConstraintOverride_android_layout_height, 21);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintWidth, 95);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintHeight, 96);
        sparseIntArray2.append(h6d.ConstraintOverride_android_visibility, 22);
        sparseIntArray2.append(h6d.ConstraintOverride_android_alpha, 43);
        sparseIntArray2.append(h6d.ConstraintOverride_android_elevation, 44);
        sparseIntArray2.append(h6d.ConstraintOverride_android_rotationX, 45);
        sparseIntArray2.append(h6d.ConstraintOverride_android_rotationY, 46);
        sparseIntArray2.append(h6d.ConstraintOverride_android_rotation, 60);
        sparseIntArray2.append(h6d.ConstraintOverride_android_scaleX, 47);
        sparseIntArray2.append(h6d.ConstraintOverride_android_scaleY, 48);
        sparseIntArray2.append(h6d.ConstraintOverride_android_transformPivotX, 49);
        sparseIntArray2.append(h6d.ConstraintOverride_android_transformPivotY, 50);
        sparseIntArray2.append(h6d.ConstraintOverride_android_translationX, 51);
        sparseIntArray2.append(h6d.ConstraintOverride_android_translationY, 52);
        sparseIntArray2.append(h6d.ConstraintOverride_android_translationZ, 53);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintWidth_default, 54);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintHeight_default, 55);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintWidth_max, 56);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintHeight_max, 57);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintWidth_min, 58);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintHeight_min, 59);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintCircleRadius, 62);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintCircleAngle, 63);
        sparseIntArray2.append(h6d.ConstraintOverride_animateRelativeTo, 64);
        sparseIntArray2.append(h6d.ConstraintOverride_transitionEasing, 65);
        sparseIntArray2.append(h6d.ConstraintOverride_drawPath, 66);
        sparseIntArray2.append(h6d.ConstraintOverride_transitionPathRotate, 67);
        sparseIntArray2.append(h6d.ConstraintOverride_motionStagger, 79);
        sparseIntArray2.append(h6d.ConstraintOverride_android_id, 38);
        sparseIntArray2.append(h6d.ConstraintOverride_motionTarget, 98);
        sparseIntArray2.append(h6d.ConstraintOverride_motionProgress, 68);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintWidth_percent, 69);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintHeight_percent, 70);
        sparseIntArray2.append(h6d.ConstraintOverride_chainUseRtl, 71);
        sparseIntArray2.append(h6d.ConstraintOverride_barrierDirection, 72);
        sparseIntArray2.append(h6d.ConstraintOverride_barrierMargin, 73);
        sparseIntArray2.append(h6d.ConstraintOverride_constraint_referenced_ids, 74);
        sparseIntArray2.append(h6d.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sparseIntArray2.append(h6d.ConstraintOverride_pathMotionArc, 76);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constraintTag, 77);
        sparseIntArray2.append(h6d.ConstraintOverride_visibilityMode, 78);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constrainedWidth, 80);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_constrainedHeight, 81);
        sparseIntArray2.append(h6d.ConstraintOverride_polarRelativeTo, 82);
        sparseIntArray2.append(h6d.ConstraintOverride_transformPivotTarget, 83);
        sparseIntArray2.append(h6d.ConstraintOverride_quantizeMotionSteps, 84);
        sparseIntArray2.append(h6d.ConstraintOverride_quantizeMotionPhase, 85);
        sparseIntArray2.append(h6d.ConstraintOverride_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(h6d.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static int[] e(Barrier barrier, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = vyc.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.z0;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.z0.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static pt3 f(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        pt3 pt3Var = new pt3();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? h6d.ConstraintOverride : h6d.Constraint);
        st3 st3Var = pt3Var.b;
        tt3 tt3Var = pt3Var.e;
        rt3 rt3Var = pt3Var.c;
        qt3 qt3Var = pt3Var.d;
        int[] iArr = d;
        String[] strArr = so8.c;
        SparseIntArray sparseIntArray = e;
        if (z) {
            ot3 ot3Var = new ot3();
            ot3Var.a = new int[10];
            ot3Var.b = new int[10];
            ot3Var.c = 0;
            ot3Var.d = new int[10];
            ot3Var.e = new float[10];
            ot3Var.f = 0;
            ot3Var.g = new int[5];
            ot3Var.h = new String[5];
            ot3Var.i = 0;
            ot3Var.j = new int[4];
            ot3Var.k = new boolean[4];
            ot3Var.l = 0;
            rt3Var.getClass();
            qt3Var.getClass();
            tt3Var.getClass();
            int i3 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f.get(index)) {
                    case 2:
                        i2 = indexCount;
                        ot3Var.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.I));
                        continue;
                        i3 = i4 + 1;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = indexCount;
                        ot3Var.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i4 + 1;
                    case 6:
                        i2 = indexCount;
                        ot3Var.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, qt3Var.C));
                        break;
                    case 7:
                        i2 = indexCount;
                        ot3Var.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, qt3Var.D));
                        break;
                    case 8:
                        i2 = indexCount;
                        ot3Var.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.J));
                        break;
                    case 11:
                        i2 = indexCount;
                        ot3Var.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.P));
                        break;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        i2 = indexCount;
                        ot3Var.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.Q));
                        break;
                    case 13:
                        i2 = indexCount;
                        ot3Var.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.M));
                        break;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        i2 = indexCount;
                        ot3Var.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.O));
                        break;
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        i2 = indexCount;
                        ot3Var.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.R));
                        break;
                    case 16:
                        i2 = indexCount;
                        ot3Var.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.N));
                        break;
                    case LangUtils.HASH_SEED /* 17 */:
                        i2 = indexCount;
                        ot3Var.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, qt3Var.d));
                        break;
                    case 18:
                        i2 = indexCount;
                        ot3Var.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, qt3Var.e));
                        break;
                    case 19:
                        i2 = indexCount;
                        ot3Var.a(19, typedArrayObtainStyledAttributes.getFloat(index, qt3Var.f));
                        break;
                    case 20:
                        i2 = indexCount;
                        ot3Var.a(20, typedArrayObtainStyledAttributes.getFloat(index, qt3Var.w));
                        break;
                    case 21:
                        i2 = indexCount;
                        ot3Var.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, qt3Var.c));
                        break;
                    case 22:
                        i2 = indexCount;
                        ot3Var.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, st3Var.a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        ot3Var.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, qt3Var.b));
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        i2 = indexCount;
                        ot3Var.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.F));
                        break;
                    case 27:
                        i2 = indexCount;
                        ot3Var.b(27, typedArrayObtainStyledAttributes.getInt(index, qt3Var.E));
                        break;
                    case 28:
                        i2 = indexCount;
                        ot3Var.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.G));
                        break;
                    case 31:
                        i2 = indexCount;
                        ot3Var.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.K));
                        break;
                    case 34:
                        i2 = indexCount;
                        ot3Var.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.H));
                        break;
                    case LangUtils.HASH_OFFSET /* 37 */:
                        i2 = indexCount;
                        ot3Var.a(37, typedArrayObtainStyledAttributes.getFloat(index, qt3Var.x));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, pt3Var.a);
                        pt3Var.a = resourceId;
                        ot3Var.b(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        ot3Var.a(39, typedArrayObtainStyledAttributes.getFloat(index, qt3Var.U));
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        i2 = indexCount;
                        ot3Var.a(40, typedArrayObtainStyledAttributes.getFloat(index, qt3Var.T));
                        break;
                    case 41:
                        i2 = indexCount;
                        ot3Var.b(41, typedArrayObtainStyledAttributes.getInt(index, qt3Var.V));
                        break;
                    case 42:
                        i2 = indexCount;
                        ot3Var.b(42, typedArrayObtainStyledAttributes.getInt(index, qt3Var.W));
                        break;
                    case 43:
                        i2 = indexCount;
                        ot3Var.a(43, typedArrayObtainStyledAttributes.getFloat(index, st3Var.c));
                        break;
                    case 44:
                        i2 = indexCount;
                        ot3Var.d(44, true);
                        ot3Var.a(44, typedArrayObtainStyledAttributes.getDimension(index, tt3Var.m));
                        break;
                    case 45:
                        i2 = indexCount;
                        ot3Var.a(45, typedArrayObtainStyledAttributes.getFloat(index, tt3Var.b));
                        break;
                    case 46:
                        i2 = indexCount;
                        ot3Var.a(46, typedArrayObtainStyledAttributes.getFloat(index, tt3Var.c));
                        break;
                    case 47:
                        i2 = indexCount;
                        ot3Var.a(47, typedArrayObtainStyledAttributes.getFloat(index, tt3Var.d));
                        break;
                    case 48:
                        i2 = indexCount;
                        ot3Var.a(48, typedArrayObtainStyledAttributes.getFloat(index, tt3Var.e));
                        break;
                    case 49:
                        i2 = indexCount;
                        ot3Var.a(49, typedArrayObtainStyledAttributes.getDimension(index, tt3Var.f));
                        break;
                    case 50:
                        i2 = indexCount;
                        ot3Var.a(50, typedArrayObtainStyledAttributes.getDimension(index, tt3Var.g));
                        break;
                    case 51:
                        i2 = indexCount;
                        ot3Var.a(51, typedArrayObtainStyledAttributes.getDimension(index, tt3Var.i));
                        break;
                    case 52:
                        i2 = indexCount;
                        ot3Var.a(52, typedArrayObtainStyledAttributes.getDimension(index, tt3Var.j));
                        break;
                    case 53:
                        i2 = indexCount;
                        ot3Var.a(53, typedArrayObtainStyledAttributes.getDimension(index, tt3Var.k));
                        break;
                    case 54:
                        i2 = indexCount;
                        ot3Var.b(54, typedArrayObtainStyledAttributes.getInt(index, qt3Var.X));
                        break;
                    case 55:
                        i2 = indexCount;
                        ot3Var.b(55, typedArrayObtainStyledAttributes.getInt(index, qt3Var.Y));
                        break;
                    case 56:
                        i2 = indexCount;
                        ot3Var.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.Z));
                        break;
                    case 57:
                        i2 = indexCount;
                        ot3Var.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.a0));
                        break;
                    case 58:
                        i2 = indexCount;
                        ot3Var.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.b0));
                        break;
                    case 59:
                        i2 = indexCount;
                        ot3Var.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.c0));
                        break;
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        i2 = indexCount;
                        ot3Var.a(60, typedArrayObtainStyledAttributes.getFloat(index, tt3Var.a));
                        break;
                    case 62:
                        i2 = indexCount;
                        ot3Var.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.A));
                        break;
                    case 63:
                        i2 = indexCount;
                        ot3Var.a(63, typedArrayObtainStyledAttributes.getFloat(index, qt3Var.B));
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        i2 = indexCount;
                        ot3Var.b(64, i(typedArrayObtainStyledAttributes, index, rt3Var.a));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            ot3Var.c(65, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        } else {
                            ot3Var.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        i2 = indexCount;
                        ot3Var.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        ot3Var.a(67, typedArrayObtainStyledAttributes.getFloat(index, rt3Var.e));
                        break;
                    case 68:
                        i2 = indexCount;
                        ot3Var.a(68, typedArrayObtainStyledAttributes.getFloat(index, st3Var.d));
                        break;
                    case 69:
                        i2 = indexCount;
                        ot3Var.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        ot3Var.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        ot3Var.b(72, typedArrayObtainStyledAttributes.getInt(index, qt3Var.f0));
                        break;
                    case 73:
                        i2 = indexCount;
                        ot3Var.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.g0));
                        break;
                    case 74:
                        i2 = indexCount;
                        ot3Var.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = indexCount;
                        ot3Var.d(75, typedArrayObtainStyledAttributes.getBoolean(index, qt3Var.n0));
                        break;
                    case 76:
                        i2 = indexCount;
                        ot3Var.b(76, typedArrayObtainStyledAttributes.getInt(index, rt3Var.c));
                        break;
                    case 77:
                        i2 = indexCount;
                        ot3Var.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = indexCount;
                        ot3Var.b(78, typedArrayObtainStyledAttributes.getInt(index, st3Var.b));
                        break;
                    case 79:
                        i2 = indexCount;
                        ot3Var.a(79, typedArrayObtainStyledAttributes.getFloat(index, rt3Var.d));
                        break;
                    case 80:
                        i2 = indexCount;
                        ot3Var.d(80, typedArrayObtainStyledAttributes.getBoolean(index, qt3Var.l0));
                        break;
                    case 81:
                        i2 = indexCount;
                        ot3Var.d(81, typedArrayObtainStyledAttributes.getBoolean(index, qt3Var.m0));
                        break;
                    case 82:
                        i2 = indexCount;
                        ot3Var.b(82, typedArrayObtainStyledAttributes.getInteger(index, rt3Var.b));
                        break;
                    case 83:
                        i2 = indexCount;
                        ot3Var.b(83, i(typedArrayObtainStyledAttributes, index, tt3Var.h));
                        break;
                    case 84:
                        i2 = indexCount;
                        ot3Var.b(84, typedArrayObtainStyledAttributes.getInteger(index, rt3Var.g));
                        break;
                    case 85:
                        i2 = indexCount;
                        ot3Var.a(85, typedArrayObtainStyledAttributes.getFloat(index, rt3Var.f));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            rt3Var.i = resourceId2;
                            ot3Var.b(89, resourceId2);
                            if (rt3Var.i != -1) {
                                ot3Var.b(88, -2);
                                break;
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            rt3Var.h = string;
                            ot3Var.c(90, string);
                            if (rt3Var.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                rt3Var.i = resourceId3;
                                ot3Var.b(89, resourceId3);
                                ot3Var.b(88, -2);
                                break;
                            } else {
                                ot3Var.b(88, -1);
                                break;
                            }
                        } else {
                            ot3Var.b(88, typedArrayObtainStyledAttributes.getInteger(index, rt3Var.i));
                            break;
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        ot3Var.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.L));
                        break;
                    case 94:
                        i2 = indexCount;
                        ot3Var.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qt3Var.S));
                        break;
                    case 95:
                        i2 = indexCount;
                        j(ot3Var, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        j(ot3Var, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        ot3Var.b(97, typedArrayObtainStyledAttributes.getInt(index, qt3Var.o0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = m2a.F0;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            pt3Var.a = typedArrayObtainStyledAttributes.getResourceId(index, pt3Var.a);
                            break;
                        }
                    case 99:
                        i2 = indexCount;
                        ot3Var.d(99, typedArrayObtainStyledAttributes.getBoolean(index, qt3Var.g));
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != h6d.Constraint_android_id && h6d.Constraint_android_layout_marginStart != index2 && h6d.Constraint_android_layout_marginEnd != index2) {
                    rt3Var.getClass();
                    qt3Var.getClass();
                    tt3Var.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        qt3Var.p = i(typedArrayObtainStyledAttributes, index2, qt3Var.p);
                        continue;
                        i7++;
                    case 2:
                        i = indexCount2;
                        qt3Var.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.I);
                        continue;
                        i7++;
                    case 3:
                        i = indexCount2;
                        qt3Var.o = i(typedArrayObtainStyledAttributes, index2, qt3Var.o);
                        continue;
                        i7++;
                    case 4:
                        i = indexCount2;
                        qt3Var.n = i(typedArrayObtainStyledAttributes, index2, qt3Var.n);
                        continue;
                        i7++;
                    case 5:
                        i = indexCount2;
                        qt3Var.y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                    case 6:
                        i = indexCount2;
                        qt3Var.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, qt3Var.C);
                        continue;
                        i7++;
                    case 7:
                        i = indexCount2;
                        qt3Var.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, qt3Var.D);
                        continue;
                        i7++;
                    case 8:
                        i = indexCount2;
                        qt3Var.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.J);
                        continue;
                        i7++;
                    case 9:
                        i = indexCount2;
                        qt3Var.v = i(typedArrayObtainStyledAttributes, index2, qt3Var.v);
                        continue;
                        i7++;
                    case 10:
                        i = indexCount2;
                        qt3Var.u = i(typedArrayObtainStyledAttributes, index2, qt3Var.u);
                        continue;
                        i7++;
                    case 11:
                        i = indexCount2;
                        qt3Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.P);
                        continue;
                        i7++;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        i = indexCount2;
                        qt3Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.Q);
                        continue;
                        i7++;
                    case 13:
                        i = indexCount2;
                        qt3Var.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.M);
                        continue;
                        i7++;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        i = indexCount2;
                        qt3Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.O);
                        continue;
                        i7++;
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        i = indexCount2;
                        qt3Var.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.R);
                        continue;
                        i7++;
                    case 16:
                        i = indexCount2;
                        qt3Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.N);
                        continue;
                        i7++;
                    case LangUtils.HASH_SEED /* 17 */:
                        i = indexCount2;
                        qt3Var.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, qt3Var.d);
                        continue;
                        i7++;
                    case 18:
                        i = indexCount2;
                        qt3Var.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, qt3Var.e);
                        continue;
                        i7++;
                    case 19:
                        i = indexCount2;
                        qt3Var.f = typedArrayObtainStyledAttributes.getFloat(index2, qt3Var.f);
                        continue;
                        i7++;
                    case 20:
                        i = indexCount2;
                        qt3Var.w = typedArrayObtainStyledAttributes.getFloat(index2, qt3Var.w);
                        continue;
                        i7++;
                    case 21:
                        i = indexCount2;
                        qt3Var.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, qt3Var.c);
                        continue;
                        i7++;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, st3Var.a);
                        st3Var.a = i8;
                        st3Var.a = iArr[i8];
                        continue;
                        i7++;
                    case 23:
                        i = indexCount2;
                        qt3Var.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, qt3Var.b);
                        continue;
                        i7++;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        i = indexCount2;
                        qt3Var.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.F);
                        continue;
                        i7++;
                    case 25:
                        i = indexCount2;
                        qt3Var.h = i(typedArrayObtainStyledAttributes, index2, qt3Var.h);
                        continue;
                        i7++;
                    case 26:
                        i = indexCount2;
                        qt3Var.i = i(typedArrayObtainStyledAttributes, index2, qt3Var.i);
                        continue;
                        i7++;
                    case 27:
                        i = indexCount2;
                        qt3Var.E = typedArrayObtainStyledAttributes.getInt(index2, qt3Var.E);
                        continue;
                        i7++;
                    case 28:
                        i = indexCount2;
                        qt3Var.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.G);
                        continue;
                        i7++;
                    case 29:
                        i = indexCount2;
                        qt3Var.j = i(typedArrayObtainStyledAttributes, index2, qt3Var.j);
                        continue;
                        i7++;
                    case 30:
                        i = indexCount2;
                        qt3Var.k = i(typedArrayObtainStyledAttributes, index2, qt3Var.k);
                        continue;
                        i7++;
                    case 31:
                        i = indexCount2;
                        qt3Var.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.K);
                        continue;
                        i7++;
                    case 32:
                        i = indexCount2;
                        qt3Var.s = i(typedArrayObtainStyledAttributes, index2, qt3Var.s);
                        continue;
                        i7++;
                    case 33:
                        i = indexCount2;
                        qt3Var.t = i(typedArrayObtainStyledAttributes, index2, qt3Var.t);
                        continue;
                        i7++;
                    case 34:
                        i = indexCount2;
                        qt3Var.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.H);
                        continue;
                        i7++;
                    case 35:
                        i = indexCount2;
                        qt3Var.m = i(typedArrayObtainStyledAttributes, index2, qt3Var.m);
                        continue;
                        i7++;
                    case 36:
                        i = indexCount2;
                        qt3Var.l = i(typedArrayObtainStyledAttributes, index2, qt3Var.l);
                        continue;
                        i7++;
                    case LangUtils.HASH_OFFSET /* 37 */:
                        i = indexCount2;
                        qt3Var.x = typedArrayObtainStyledAttributes.getFloat(index2, qt3Var.x);
                        continue;
                        i7++;
                    case 38:
                        i = indexCount2;
                        pt3Var.a = typedArrayObtainStyledAttributes.getResourceId(index2, pt3Var.a);
                        continue;
                        i7++;
                    case 39:
                        i = indexCount2;
                        qt3Var.U = typedArrayObtainStyledAttributes.getFloat(index2, qt3Var.U);
                        continue;
                        i7++;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        i = indexCount2;
                        qt3Var.T = typedArrayObtainStyledAttributes.getFloat(index2, qt3Var.T);
                        continue;
                        i7++;
                    case 41:
                        i = indexCount2;
                        qt3Var.V = typedArrayObtainStyledAttributes.getInt(index2, qt3Var.V);
                        continue;
                        i7++;
                    case 42:
                        i = indexCount2;
                        qt3Var.W = typedArrayObtainStyledAttributes.getInt(index2, qt3Var.W);
                        continue;
                        i7++;
                    case 43:
                        i = indexCount2;
                        st3Var.c = typedArrayObtainStyledAttributes.getFloat(index2, st3Var.c);
                        continue;
                        i7++;
                    case 44:
                        i = indexCount2;
                        tt3Var.l = true;
                        tt3Var.m = typedArrayObtainStyledAttributes.getDimension(index2, tt3Var.m);
                        continue;
                        i7++;
                    case 45:
                        i = indexCount2;
                        tt3Var.b = typedArrayObtainStyledAttributes.getFloat(index2, tt3Var.b);
                        continue;
                        i7++;
                    case 46:
                        i = indexCount2;
                        tt3Var.c = typedArrayObtainStyledAttributes.getFloat(index2, tt3Var.c);
                        continue;
                        i7++;
                    case 47:
                        i = indexCount2;
                        tt3Var.d = typedArrayObtainStyledAttributes.getFloat(index2, tt3Var.d);
                        continue;
                        i7++;
                    case 48:
                        i = indexCount2;
                        tt3Var.e = typedArrayObtainStyledAttributes.getFloat(index2, tt3Var.e);
                        continue;
                        i7++;
                    case 49:
                        i = indexCount2;
                        tt3Var.f = typedArrayObtainStyledAttributes.getDimension(index2, tt3Var.f);
                        continue;
                        i7++;
                    case 50:
                        i = indexCount2;
                        tt3Var.g = typedArrayObtainStyledAttributes.getDimension(index2, tt3Var.g);
                        continue;
                        i7++;
                    case 51:
                        i = indexCount2;
                        tt3Var.i = typedArrayObtainStyledAttributes.getDimension(index2, tt3Var.i);
                        continue;
                        i7++;
                    case 52:
                        i = indexCount2;
                        tt3Var.j = typedArrayObtainStyledAttributes.getDimension(index2, tt3Var.j);
                        continue;
                        i7++;
                    case 53:
                        i = indexCount2;
                        tt3Var.k = typedArrayObtainStyledAttributes.getDimension(index2, tt3Var.k);
                        continue;
                        i7++;
                    case 54:
                        i = indexCount2;
                        qt3Var.X = typedArrayObtainStyledAttributes.getInt(index2, qt3Var.X);
                        continue;
                        i7++;
                    case 55:
                        i = indexCount2;
                        qt3Var.Y = typedArrayObtainStyledAttributes.getInt(index2, qt3Var.Y);
                        continue;
                        i7++;
                    case 56:
                        i = indexCount2;
                        qt3Var.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.Z);
                        continue;
                        i7++;
                    case 57:
                        i = indexCount2;
                        qt3Var.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.a0);
                        continue;
                        i7++;
                    case 58:
                        i = indexCount2;
                        qt3Var.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.b0);
                        continue;
                        i7++;
                    case 59:
                        i = indexCount2;
                        qt3Var.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.c0);
                        continue;
                        i7++;
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        i = indexCount2;
                        tt3Var.a = typedArrayObtainStyledAttributes.getFloat(index2, tt3Var.a);
                        continue;
                        i7++;
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        i = indexCount2;
                        qt3Var.z = i(typedArrayObtainStyledAttributes, index2, qt3Var.z);
                        continue;
                        i7++;
                    case 62:
                        i = indexCount2;
                        qt3Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.A);
                        continue;
                        i7++;
                    case 63:
                        i = indexCount2;
                        qt3Var.B = typedArrayObtainStyledAttributes.getFloat(index2, qt3Var.B);
                        continue;
                        i7++;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        i = indexCount2;
                        rt3Var.a = i(typedArrayObtainStyledAttributes, index2, rt3Var.a);
                        continue;
                        i7++;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            rt3Var.getClass();
                            break;
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            rt3Var.getClass();
                            i7++;
                        }
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        rt3Var.getClass();
                        continue;
                        i7++;
                    case 67:
                        i = indexCount2;
                        rt3Var.e = typedArrayObtainStyledAttributes.getFloat(index2, rt3Var.e);
                        break;
                    case 68:
                        i = indexCount2;
                        st3Var.d = typedArrayObtainStyledAttributes.getFloat(index2, st3Var.d);
                        break;
                    case 69:
                        i = indexCount2;
                        qt3Var.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        qt3Var.e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        qt3Var.f0 = typedArrayObtainStyledAttributes.getInt(index2, qt3Var.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        qt3Var.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.g0);
                        break;
                    case 74:
                        i = indexCount2;
                        qt3Var.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        qt3Var.n0 = typedArrayObtainStyledAttributes.getBoolean(index2, qt3Var.n0);
                        break;
                    case 76:
                        i = indexCount2;
                        rt3Var.c = typedArrayObtainStyledAttributes.getInt(index2, rt3Var.c);
                        break;
                    case 77:
                        i = indexCount2;
                        qt3Var.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        st3Var.b = typedArrayObtainStyledAttributes.getInt(index2, st3Var.b);
                        break;
                    case 79:
                        i = indexCount2;
                        rt3Var.d = typedArrayObtainStyledAttributes.getFloat(index2, rt3Var.d);
                        break;
                    case 80:
                        i = indexCount2;
                        qt3Var.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, qt3Var.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        qt3Var.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, qt3Var.m0);
                        break;
                    case 82:
                        i = indexCount2;
                        rt3Var.b = typedArrayObtainStyledAttributes.getInteger(index2, rt3Var.b);
                        break;
                    case 83:
                        i = indexCount2;
                        tt3Var.h = i(typedArrayObtainStyledAttributes, index2, tt3Var.h);
                        break;
                    case 84:
                        i = indexCount2;
                        rt3Var.g = typedArrayObtainStyledAttributes.getInteger(index2, rt3Var.g);
                        break;
                    case 85:
                        i = indexCount2;
                        rt3Var.f = typedArrayObtainStyledAttributes.getFloat(index2, rt3Var.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            rt3Var.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            rt3Var.h = string2;
                            if (string2.indexOf("/") > 0) {
                                rt3Var.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, rt3Var.i);
                            break;
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        qt3Var.q = i(typedArrayObtainStyledAttributes, index2, qt3Var.q);
                        break;
                    case 92:
                        i = indexCount2;
                        qt3Var.r = i(typedArrayObtainStyledAttributes, index2, qt3Var.r);
                        break;
                    case 93:
                        i = indexCount2;
                        qt3Var.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.L);
                        break;
                    case 94:
                        i = indexCount2;
                        qt3Var.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, qt3Var.S);
                        break;
                    case 95:
                        i = indexCount2;
                        j(qt3Var, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                    case 96:
                        i = indexCount2;
                        j(qt3Var, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        qt3Var.o0 = typedArrayObtainStyledAttributes.getInt(index2, qt3Var.o0);
                        break;
                }
                i7++;
            }
            if (qt3Var.j0 != null) {
                qt3Var.i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return pt3Var;
    }

    public static int i(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut3.j(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void k(kt3 kt3Var, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        kt3Var.G = str;
    }

    public static String l(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void a(ConstraintLayout constraintLayout) {
        b(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        ut3 ut3Var = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = ut3Var.c;
        HashSet hashSet2 = new HashSet(map2.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (ut3Var.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        pt3 pt3Var = (pt3) map2.get(Integer.valueOf(id));
                        if (pt3Var != null) {
                            st3 st3Var = pt3Var.b;
                            qt3 qt3Var = pt3Var.d;
                            tt3 tt3Var = pt3Var.e;
                            if (childAt instanceof Barrier) {
                                qt3Var.h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(qt3Var.f0);
                                barrier.setMargin(qt3Var.g0);
                                barrier.setAllowsGoneWidget(qt3Var.n0);
                                int[] iArr = qt3Var.i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = qt3Var.j0;
                                    if (str != null) {
                                        int[] iArrE = e(barrier, str);
                                        qt3Var.i0 = iArrE;
                                        barrier.setReferencedIds(iArrE);
                                    }
                                }
                            }
                            kt3 kt3Var = (kt3) childAt.getLayoutParams();
                            kt3Var.a();
                            pt3Var.a(kt3Var);
                            HashMap map3 = pt3Var.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                gt3 gt3Var = (gt3) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strH = !gt3Var.a ? wy1.h("set", str2) : str2;
                                int i3 = i2;
                                try {
                                    int iV = az1.v(gt3Var.b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iV) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strH, cls3).invoke(childAt, Integer.valueOf(gt3Var.c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strH, cls2).invoke(childAt, Float.valueOf(gt3Var.d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strH, cls3).invoke(childAt, Integer.valueOf(gt3Var.g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strH, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(gt3Var.g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder sbN = az1.n(" Custom Attribute \"", str2, "\" not found on ");
                                                sbN.append(cls.getName());
                                                Log.e("TransitionLayout", sbN.toString());
                                                e.printStackTrace();
                                                hashSet2 = hashSet3;
                                                i2 = i3;
                                                map3 = map;
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strH);
                                                hashSet2 = hashSet3;
                                                i2 = i3;
                                                map3 = map;
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                StringBuilder sbN2 = az1.n(" Custom Attribute \"", str2, "\" not found on ");
                                                sbN2.append(cls.getName());
                                                Log.e("TransitionLayout", sbN2.toString());
                                                e.printStackTrace();
                                                hashSet2 = hashSet3;
                                                i2 = i3;
                                                map3 = map;
                                            }
                                        case 4:
                                            cls.getMethod(strH, CharSequence.class).invoke(childAt, gt3Var.e);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strH, Boolean.TYPE).invoke(childAt, Boolean.valueOf(gt3Var.f));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strH, cls2).invoke(childAt, Float.valueOf(gt3Var.d));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strH, cls3).invoke(childAt, Integer.valueOf(gt3Var.c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    map = map3;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    map = map3;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i2 = i3;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i2;
                            childAt.setLayoutParams(kt3Var);
                            if (st3Var.b == 0) {
                                childAt.setVisibility(st3Var.a);
                            }
                            childAt.setAlpha(st3Var.c);
                            childAt.setRotation(tt3Var.a);
                            childAt.setRotationX(tt3Var.b);
                            childAt.setRotationY(tt3Var.c);
                            childAt.setScaleX(tt3Var.d);
                            childAt.setScaleY(tt3Var.e);
                            if (tt3Var.h != -1) {
                                if (((View) childAt.getParent()).findViewById(tt3Var.h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(tt3Var.f)) {
                                    childAt.setPivotX(tt3Var.f);
                                }
                                if (!Float.isNaN(tt3Var.g)) {
                                    childAt.setPivotY(tt3Var.g);
                                }
                            }
                            childAt.setTranslationX(tt3Var.i);
                            childAt.setTranslationY(tt3Var.j);
                            childAt.setTranslationZ(tt3Var.k);
                            if (tt3Var.l) {
                                childAt.setElevation(tt3Var.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i2;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i2 = i + 1;
                ut3Var = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            ut3Var = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            pt3 pt3Var2 = (pt3) map2.get(num);
            if (pt3Var2 != null) {
                qt3 qt3Var2 = pt3Var2.d;
                if (qt3Var2.h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = qt3Var2.i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = qt3Var2.j0;
                        if (str3 != null) {
                            int[] iArrE2 = e(barrier2, str3);
                            qt3Var2.i0 = iArrE2;
                            barrier2.setReferencedIds(iArrE2);
                        }
                    }
                    barrier2.setType(qt3Var2.f0);
                    barrier2.setMargin(qt3Var2.g0);
                    wve wveVar = ConstraintLayout.E0;
                    kt3 kt3Var2 = new kt3(-2, -2);
                    barrier2.k();
                    pt3Var2.a(kt3Var2);
                    constraintLayout.addView(barrier2, kt3Var2);
                }
                if (qt3Var2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    wve wveVar2 = ConstraintLayout.E0;
                    kt3 kt3Var3 = new kt3(-2, -2);
                    pt3Var2.a(kt3Var3);
                    constraintLayout.addView(guideline, kt3Var3);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof it3) {
                ((it3) childAt2).f(constraintLayout);
            }
        }
    }

    public final void c(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        ut3 ut3Var = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = ut3Var.c;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            kt3 kt3Var = (kt3) childAt.getLayoutParams();
            int id = childAt.getId();
            if (ut3Var.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new pt3());
            }
            pt3 pt3Var = (pt3) map3.get(Integer.valueOf(id));
            if (pt3Var == null) {
                i = childCount;
                map = map3;
            } else {
                st3 st3Var = pt3Var.b;
                qt3 qt3Var = pt3Var.d;
                tt3 tt3Var = pt3Var.e;
                HashMap map4 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map5 = ut3Var.a;
                for (String str : map5.keySet()) {
                    gt3 gt3Var = (gt3) map5.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map4.put(str, new gt3(gt3Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                e.printStackTrace();
                                childCount = i3;
                                map3 = map2;
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                e.printStackTrace();
                                childCount = i3;
                                map3 = map2;
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                e.printStackTrace();
                                childCount = i3;
                                map3 = map2;
                            }
                        } else {
                            map2 = map3;
                            map4.put(str, new gt3(gt3Var, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        map2 = map3;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                pt3Var.f = map4;
                pt3Var.a = id;
                qt3Var.h = kt3Var.e;
                qt3Var.i = kt3Var.f;
                qt3Var.j = kt3Var.g;
                qt3Var.k = kt3Var.h;
                qt3Var.l = kt3Var.i;
                qt3Var.m = kt3Var.j;
                qt3Var.n = kt3Var.k;
                qt3Var.o = kt3Var.l;
                qt3Var.p = kt3Var.m;
                qt3Var.q = kt3Var.n;
                qt3Var.r = kt3Var.o;
                qt3Var.s = kt3Var.s;
                qt3Var.t = kt3Var.t;
                qt3Var.u = kt3Var.u;
                qt3Var.v = kt3Var.v;
                qt3Var.w = kt3Var.E;
                qt3Var.x = kt3Var.F;
                qt3Var.y = kt3Var.G;
                qt3Var.z = kt3Var.p;
                qt3Var.A = kt3Var.q;
                qt3Var.B = kt3Var.r;
                qt3Var.C = kt3Var.T;
                qt3Var.D = kt3Var.U;
                qt3Var.E = kt3Var.V;
                qt3Var.f = kt3Var.c;
                qt3Var.d = kt3Var.a;
                qt3Var.e = kt3Var.b;
                qt3Var.b = ((ViewGroup.MarginLayoutParams) kt3Var).width;
                qt3Var.c = ((ViewGroup.MarginLayoutParams) kt3Var).height;
                qt3Var.F = ((ViewGroup.MarginLayoutParams) kt3Var).leftMargin;
                qt3Var.G = ((ViewGroup.MarginLayoutParams) kt3Var).rightMargin;
                qt3Var.H = ((ViewGroup.MarginLayoutParams) kt3Var).topMargin;
                qt3Var.I = ((ViewGroup.MarginLayoutParams) kt3Var).bottomMargin;
                qt3Var.L = kt3Var.D;
                qt3Var.T = kt3Var.I;
                qt3Var.U = kt3Var.H;
                qt3Var.W = kt3Var.K;
                qt3Var.V = kt3Var.J;
                qt3Var.l0 = kt3Var.W;
                qt3Var.m0 = kt3Var.X;
                qt3Var.X = kt3Var.L;
                qt3Var.Y = kt3Var.M;
                qt3Var.Z = kt3Var.P;
                qt3Var.a0 = kt3Var.Q;
                qt3Var.b0 = kt3Var.N;
                qt3Var.c0 = kt3Var.O;
                qt3Var.d0 = kt3Var.R;
                qt3Var.e0 = kt3Var.S;
                qt3Var.k0 = kt3Var.Y;
                qt3Var.N = kt3Var.x;
                qt3Var.P = kt3Var.z;
                qt3Var.M = kt3Var.w;
                qt3Var.O = kt3Var.y;
                qt3Var.R = kt3Var.A;
                qt3Var.Q = kt3Var.B;
                qt3Var.S = kt3Var.C;
                qt3Var.o0 = kt3Var.Z;
                qt3Var.J = kt3Var.getMarginEnd();
                qt3Var.K = kt3Var.getMarginStart();
                st3Var.a = childAt.getVisibility();
                st3Var.c = childAt.getAlpha();
                tt3Var.a = childAt.getRotation();
                tt3Var.b = childAt.getRotationX();
                tt3Var.c = childAt.getRotationY();
                tt3Var.d = childAt.getScaleX();
                tt3Var.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    tt3Var.f = pivotX;
                    tt3Var.g = pivotY;
                }
                tt3Var.i = childAt.getTranslationX();
                tt3Var.j = childAt.getTranslationY();
                tt3Var.k = childAt.getTranslationZ();
                if (tt3Var.l) {
                    tt3Var.m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    qt3Var.n0 = barrier.getAllowsGoneWidget();
                    qt3Var.i0 = barrier.getReferencedIds();
                    qt3Var.f0 = barrier.getType();
                    qt3Var.g0 = barrier.getMargin();
                }
            }
            i2++;
            ut3Var = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void d(int i, int i2, int i3, int i4) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.c;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new pt3());
        }
        pt3 pt3Var = (pt3) map.get(Integer.valueOf(i));
        if (pt3Var == null) {
            return;
        }
        qt3 qt3Var = pt3Var.d;
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    qt3Var.h = i3;
                    qt3Var.i = -1;
                    return;
                } else if (i4 == 2) {
                    qt3Var.i = i3;
                    qt3Var.h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + l(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    qt3Var.j = i3;
                    qt3Var.k = -1;
                    return;
                } else if (i4 == 2) {
                    qt3Var.k = i3;
                    qt3Var.j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    qt3Var.l = i3;
                    qt3Var.m = -1;
                    qt3Var.p = -1;
                    qt3Var.q = -1;
                    qt3Var.r = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                }
                qt3Var.m = i3;
                qt3Var.l = -1;
                qt3Var.p = -1;
                qt3Var.q = -1;
                qt3Var.r = -1;
                return;
            case 4:
                if (i4 == 4) {
                    qt3Var.o = i3;
                    qt3Var.n = -1;
                    qt3Var.p = -1;
                    qt3Var.q = -1;
                    qt3Var.r = -1;
                    return;
                }
                if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                }
                qt3Var.n = i3;
                qt3Var.o = -1;
                qt3Var.p = -1;
                qt3Var.q = -1;
                qt3Var.r = -1;
                return;
            case 5:
                if (i4 == 5) {
                    qt3Var.p = i3;
                    qt3Var.o = -1;
                    qt3Var.n = -1;
                    qt3Var.l = -1;
                    qt3Var.m = -1;
                    return;
                }
                if (i4 == 3) {
                    qt3Var.q = i3;
                    qt3Var.o = -1;
                    qt3Var.n = -1;
                    qt3Var.l = -1;
                    qt3Var.m = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                }
                qt3Var.r = i3;
                qt3Var.o = -1;
                qt3Var.n = -1;
                qt3Var.l = -1;
                qt3Var.m = -1;
                return;
            case 6:
                if (i4 == 6) {
                    qt3Var.t = i3;
                    qt3Var.s = -1;
                    return;
                } else if (i4 == 7) {
                    qt3Var.s = i3;
                    qt3Var.t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    qt3Var.v = i3;
                    qt3Var.u = -1;
                    return;
                } else if (i4 == 6) {
                    qt3Var.u = i3;
                    qt3Var.v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(l(i2) + " to " + l(i4) + " unknown");
        }
    }

    public final pt3 g(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.c;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new pt3());
        }
        return (pt3) map.get(Integer.valueOf(i));
    }

    public final void h(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    pt3 pt3VarF = f(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        pt3VarF.d.a = true;
                    }
                    this.c.put(Integer.valueOf(pt3VarF.a), pt3VarF);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}

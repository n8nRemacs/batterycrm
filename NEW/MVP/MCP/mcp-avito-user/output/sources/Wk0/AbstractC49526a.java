package wK0;

import Y61.k;
import android.content.res.ColorStateList;
import android.graphics.drawable.StateListDrawable;
import com.avito.android.util.C35779e0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RoundStateDrawable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LwK0/a;", "Landroid/graphics/drawable/StateListDrawable;", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wK0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC49526a extends StateListDrawable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C12816a f441376b = new C12816a(null);

    /* compiled from: RoundStateDrawable.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwK0/a$a;", "", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wK0.a$a, reason: collision with other inner class name */
    public static final class C12816a {
        public /* synthetic */ C12816a(C42822w c42822w) {
            this();
        }

        public static C49527b a(C12816a c12816a, ColorStateList colorStateList, ColorStateList colorStateList2, int i12, ColorStateList colorStateList3, int i13, int i14) {
            ColorStateList colorStateListValueOf;
            Integer numA;
            ColorStateList colorStateList4 = (i14 & 1) != 0 ? null : colorStateList;
            if ((i14 & 2) != 0) {
                colorStateListValueOf = (colorStateList4 == null || (numA = C35779e0.a(colorStateList4)) == null) ? null : ColorStateList.valueOf(numA.intValue());
            } else {
                colorStateListValueOf = colorStateList2;
            }
            int i15 = (i14 & 4) != 0 ? 0 : i12;
            ColorStateList colorStateList5 = (i14 & 8) != 0 ? null : colorStateList3;
            int i16 = (i14 & 16) != 0 ? 0 : i13;
            c12816a.getClass();
            return new C49527b(colorStateList4, colorStateListValueOf, i15, colorStateList5, i16, -1, -1);
        }

        public C12816a() {
        }
    }
}

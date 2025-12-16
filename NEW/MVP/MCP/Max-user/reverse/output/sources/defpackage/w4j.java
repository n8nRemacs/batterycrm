package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class w4j {
    public static final int a(int i) {
        if (i == 0) {
            return 0;
        }
        return Color.parseColor(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1)));
    }
}

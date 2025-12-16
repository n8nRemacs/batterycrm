package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public abstract class s5g implements Parcelable {
    public static final jmf a = new jmf(1);
    public static final r5g b = new r5g("");

    public final CharSequence a(d2f d2fVar) {
        return c(d2fVar.a.getContext().getResources());
    }

    public final CharSequence b(Context context) {
        return c(context.getResources());
    }

    public final CharSequence c(Resources resources) {
        if (this instanceof n5g) {
            return resources.getText(((n5g) this).c);
        }
        if (this instanceof p5g) {
            p5g p5gVar = (p5g) this;
            Object[] array = p5gVar.d.toArray(new Object[0]);
            return resources.getString(p5gVar.c, Arrays.copyOf(array, array.length));
        }
        if (this instanceof j5g) {
            j5g j5gVar = (j5g) this;
            int i = j5gVar.d;
            return resources.getQuantityString(j5gVar.c, i, Integer.valueOf(i));
        }
        if (this instanceof r5g) {
            return ((r5g) this).c;
        }
        if (!(this instanceof l5g)) {
            throw new NoWhenBranchMatchedException();
        }
        l5g l5gVar = (l5g) this;
        Object[] array2 = l5gVar.o.toArray(new Object[0]);
        return resources.getQuantityString(l5gVar.c, l5gVar.d, Arrays.copyOf(array2, array2.length));
    }

    public final CharSequence d(View view) {
        return c(view.getContext().getResources());
    }
}

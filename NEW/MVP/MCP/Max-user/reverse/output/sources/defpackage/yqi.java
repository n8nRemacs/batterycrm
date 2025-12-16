package defpackage;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.io.OutputStream;
import java.util.WeakHashMap;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class yqi {
    public static final void a(OutputStream outputStream, String str) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            outputStream.write(str.charAt(i));
        }
    }

    public static float b(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static ApiException c(Status status) {
        return status.c != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    public static ViewGroup d(View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static boolean e(View view) {
        WeakHashMap weakHashMap = hfh.a;
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode f(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}

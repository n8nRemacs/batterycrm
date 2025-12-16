package e11;

import android.text.TextUtils;
import com.my.tracker.MyTracker;

/* loaded from: classes7.dex */
public final class E0 extends AbstractC39860d0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public static final String f394329a;

        static {
            String id2;
            try {
                id2 = MyTracker.getTrackerConfig().getId();
            } catch (Throwable th2) {
                th2.getMessage();
            }
            if (TextUtils.isEmpty(id2)) {
                id2 = null;
            }
            f394329a = id2;
        }
    }
}

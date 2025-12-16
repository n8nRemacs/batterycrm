package ET0;

import kotlin.Metadata;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"", "Size", "api_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {
    public static final int a(@Y61.k String str) {
        if (str.equals("fillMax")) {
            return -1;
        }
        if (str.equals("wrapContent")) {
            return -2;
        }
        return Integer.parseInt(str);
    }
}

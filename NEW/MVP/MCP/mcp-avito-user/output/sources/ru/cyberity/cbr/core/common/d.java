package ru.cyberity.cbr.core.common;

import java.util.Locale;
import kotlin.Metadata;

/* compiled from: Bitap.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¨\u0006\b"}, d2 = {"", "pattern", "", "ignoreCase", "Lru/cyberity/cbr/core/common/b;", "a", "", "bits", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class d {
    public static final int a(int i12, int i13) {
        return (i12 >> 1) | (1 << (i13 - 1));
    }

    public static /* synthetic */ C47846b a(String str, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z12 = true;
        }
        return a(str, z12);
    }

    @Y61.k
    public static final C47846b a(@Y61.k String str, boolean z12) {
        C47846b c47846b = new C47846b();
        if (z12) {
            str = str.toLowerCase(Locale.ROOT);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < str.length(); i13++) {
            c47846b.put(Character.valueOf(str.charAt(i13)), 0);
        }
        int i14 = 0;
        while (i12 < str.length()) {
            char cCharAt = str.charAt(i12);
            c47846b.put(Character.valueOf(cCharAt), Integer.valueOf((1 << ((str.length() - i14) - 1)) | ((Number) c47846b.get(Character.valueOf(cCharAt))).intValue()));
            i12++;
            i14++;
        }
        return c47846b;
    }
}

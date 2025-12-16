package ru.cyberity.input.fingerprintingsignals;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: FingerprintingSignals.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"", "b", "(Ljava/lang/String;)Ljava/lang/String;", "normalize", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class s {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) {
        return C43066x.a0(str, " ", "_", false).toLowerCase(Locale.ROOT);
    }
}

package po0;

import Y61.k;
import Y61.l;
import android.content.Intent;
import kotlin.Metadata;

/* compiled from: SafetySettingsIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpo0/a;", "", "_avito_safety_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: po0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC47119a {

    /* compiled from: SafetySettingsIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: po0.a$a, reason: collision with other inner class name */
    public static final class C12288a {
        public static /* synthetic */ Intent a(InterfaceC47119a interfaceC47119a, String str, int i12) {
            boolean z12 = (i12 & 1) == 0;
            if ((i12 & 2) != 0) {
                str = null;
            }
            return interfaceC47119a.a(str, z12);
        }
    }

    @k
    Intent a(@l String str, boolean z12);
}

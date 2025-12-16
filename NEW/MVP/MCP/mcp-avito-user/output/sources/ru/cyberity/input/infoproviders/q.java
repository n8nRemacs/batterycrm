package ru.cyberity.input.infoproviders;

import kotlin.Metadata;

/* compiled from: DeviceSecurityInfoProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "status", "", "b", "(I)Ljava/lang/String;", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(int i12) {
        return i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 5 ? "" : "active_per_user" : "active" : "activating" : "inactive" : "unsupported";
    }
}

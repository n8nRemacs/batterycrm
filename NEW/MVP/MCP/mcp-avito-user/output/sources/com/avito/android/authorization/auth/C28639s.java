package com.avito.android.authorization.auth;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AuthInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/account/Z;", "kotlin.jvm.PlatformType", "suggests", "", "apply", "(Ljava/util/List;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.authorization.auth.s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28639s<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C28639s<T, R> f93056b = new C28639s<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        String str;
        List<com.avito.android.account.Z> list = (List) obj;
        int i12 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (com.avito.android.account.Z z12 : list) {
                String str2 = z12.f68097b;
                if ((str2 != null && str2.length() != 0) || ((str = z12.f68098c) != null && str.length() != 0)) {
                    i12++;
                    if (i12 < 0) {
                        C42745f0.G0();
                        throw null;
                    }
                }
            }
        }
        return Integer.valueOf(i12);
    }
}

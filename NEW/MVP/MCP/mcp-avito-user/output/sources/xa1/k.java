package Xa1;

import android.content.ComponentName;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class k extends N implements Y41.l<String, ComponentName> {

    /* renamed from: l, reason: collision with root package name */
    public static final k f18946l = new k();

    public k() {
        super(1);
    }

    @Override // Y41.l
    public final ComponentName invoke(String str) {
        return new ComponentName(str, "com.vk.push.authsdk.ipc.AuthService");
    }
}

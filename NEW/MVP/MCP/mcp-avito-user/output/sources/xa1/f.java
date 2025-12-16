package Xa1;

import android.content.ComponentName;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class f extends N implements Y41.l<String, ComponentName> {

    /* renamed from: l, reason: collision with root package name */
    public static final f f18939l = new f();

    public f() {
        super(1);
    }

    @Override // Y41.l
    public final ComponentName invoke(String str) {
        return new ComponentName(str, "com.vk.push.authsdk.ipc.AuthService");
    }
}

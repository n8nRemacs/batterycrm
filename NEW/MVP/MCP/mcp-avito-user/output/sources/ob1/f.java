package ob1;

import Y41.l;
import android.content.ComponentName;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class f extends N implements l<String, ComponentName> {

    /* renamed from: l, reason: collision with root package name */
    public static final f f419959l = new f();

    public f() {
        super(1);
    }

    @Override // Y41.l
    public final ComponentName invoke(String str) {
        return new ComponentName(str, "com.vk.push.pushsdk.ipc.PushService");
    }
}

package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;
import one.me.callssdk.CallsSdkInitializer;

/* loaded from: classes2.dex */
public final class xo7 {
    public final Context a;
    public final lv4 b;

    public xo7(Context context, lv4 lv4Var) {
        this.a = context;
        this.b = lv4Var;
    }

    public final byte[] a(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(j);
        return CallsSdkInitializer.INSTANCE.initializeSessionSeed(this.a, byteBufferAllocate.array(), this.b.a().getBytes(lb2.a));
    }
}

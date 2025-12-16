package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xa5 implements sa5 {
    public final Context a;

    public xa5(Context context, x7b x7bVar) {
        this.a = context;
    }

    @Override // defpackage.sa5
    public void b(eaj eajVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new nn3(0, "EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new cj(this, eajVar, threadPoolExecutor, 29));
    }

    public xa5(Context context) {
        this.a = context.getApplicationContext();
    }
}

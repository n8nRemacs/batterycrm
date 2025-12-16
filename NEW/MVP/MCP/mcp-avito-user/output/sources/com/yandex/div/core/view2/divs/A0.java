package com.yandex.div.core.view2.divs;

import android.os.AsyncTask;
import android.os.Build;
import com.avito.android.R;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.divs.C38015x0;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import v21.C49153a;

/* compiled from: DivGifImageBinder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/A0;", "Lcom/yandex/div/core/Y;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class A0 extends com.yandex.div.core.Y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C38015x0 f368004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.g f368005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(C38029k c38029k, C38015x0 c38015x0, com.yandex.div.core.view2.divs.widgets.g gVar) {
        super(c38029k);
        this.f368004a = c38015x0;
        this.f368005b = gVar;
    }

    @Override // v21.b
    public final void a() {
        this.f368005b.setGifUrl$div_release(null);
    }

    @Override // v21.b
    public final void b(@Y61.k C49153a c49153a) {
        int i12 = Build.VERSION.SDK_INT;
        com.yandex.div.core.view2.divs.widgets.g gVar = this.f368005b;
        if (i12 < 28) {
            gVar.setImage(c49153a.f440420a);
            gVar.setTag(R.id.image_loaded_flag, Boolean.TRUE);
        } else {
            int i13 = C38015x0.f369024e;
            this.f368004a.getClass();
            new C38015x0.b(new WeakReference(gVar), c49153a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}

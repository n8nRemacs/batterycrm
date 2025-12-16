package com.avito.android.publish.view.result_handler;

import Y41.q;
import Y61.k;
import Y61.l;
import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.ui.fragments.BaseFragment;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishActivityResultHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/view/result_handler/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: PublishActivityResultHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.view.result_handler.a$a, reason: collision with other inner class name */
    public static final class C7362a {
    }

    void a(@l ActivityC22955m activityC22955m, @l BaseFragment baseFragment, @k Intent intent, int i12);

    void b(@l String str, @k q<? super Integer, ? super Integer, ? super Intent, G0> qVar);

    void c(@l ActivityC22955m activityC22955m, @l Fragment fragment, @k Intent intent, int i12, boolean z12);

    void d(@l String str, int i12, int i13, @l Intent intent, @k q<? super Integer, ? super Integer, ? super Intent, G0> qVar);
}

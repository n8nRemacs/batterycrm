package com.avito.android.publish.view.result_handler;

import Y41.q;
import Y61.k;
import Y61.l;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishResultMediator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/view/result_handler/d;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface d {

    /* compiled from: PublishResultMediator.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/view/result_handler/d$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f245678a;

        /* renamed from: b, reason: collision with root package name */
        public final int f245679b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Intent f245680c;

        public a(int i12, int i13, @l Intent intent) {
            this.f245678a = i12;
            this.f245679b = i13;
            this.f245680c = intent;
        }
    }

    void a(@l String str, @k q<? super Integer, ? super Integer, ? super Intent, G0> qVar);

    void b(@l String str, int i12, int i13, @l Intent intent);
}

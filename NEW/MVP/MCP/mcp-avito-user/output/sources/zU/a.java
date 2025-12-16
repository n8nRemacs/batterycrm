package Zu;

import C11.b;
import Y61.k;
import Y61.l;
import com.avito.android.CalledFrom;
import com.avito.android.deeplink_handler.app.screen.DeeplinkHandlerActivity;
import com.avito.android.di.InterfaceC29971h;
import cv.d;
import kotlin.Metadata;

/* compiled from: DeeplinkHandlerActivityComponent.kt */
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LZu/a;", "", "a", "b", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: DeeplinkHandlerActivityComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZu/a$a;", "", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zu.a$a, reason: collision with other inner class name */
    public interface InterfaceC1468a {
        @k
        a a(@k d dVar, @h31.b @k DeeplinkHandlerActivity deeplinkHandlerActivity, @h31.b @l CalledFrom calledFrom);
    }

    /* compiled from: DeeplinkHandlerActivityComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZu/a$b;", "Lcom/avito/android/di/h;", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    public interface b extends InterfaceC29971h {
        @k
        InterfaceC1468a Ia();
    }

    void a(@k DeeplinkHandlerActivity deeplinkHandlerActivity);
}

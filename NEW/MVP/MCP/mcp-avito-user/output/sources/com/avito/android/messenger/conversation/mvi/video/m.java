package com.avito.android.messenger.conversation.mvi.video;

import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VideoUploadAnalytics.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/m;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f195028a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f195029b;

    /* compiled from: VideoUploadAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/m$a;", "", "<init>", "()V", "", "COMPRESSION", "Ljava/lang/String;", "FAILED", "MESSENGER", "PREPARE", "UPLOAD", "VIDEO", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public m(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C30277e1 c30277e1) {
        this.f195028a = interfaceC28373a;
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[12];
        this.f195029b = ((Boolean) c30277e1.f145027n.a().invoke()).booleanValue();
    }

    public final void a(String str) {
        if (this.f195029b) {
            this.f195028a.c(new y.a(G.f("messenger.video.", str), 0L, 2, null));
        }
    }
}

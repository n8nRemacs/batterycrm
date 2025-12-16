package defpackage;

import android.content.UriMatcher;
import android.net.Uri;
import kotlin.coroutines.Continuation;
import one.me.android.notifications.NotificationsImagesProvider;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes.dex */
public final class boa extends dtf implements sm6 {
    public final /* synthetic */ NotificationsImagesProvider X;
    public final /* synthetic */ Uri Y;
    public final /* synthetic */ c1f Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boa(NotificationsImagesProvider notificationsImagesProvider, Uri uri, c1f c1fVar, Continuation continuation) {
        super(2, continuation);
        this.X = notificationsImagesProvider;
        this.Y = uri;
        this.Z = c1fVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((boa) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new boa(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        this.o = 1;
        UriMatcher uriMatcher = NotificationsImagesProvider.a;
        Object objG = yei.g(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, new yna(this.X, this.Y, this.Z, null), this);
        g84 g84Var = g84.a;
        return objG == g84Var ? g84Var : objG;
    }
}

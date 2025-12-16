package com.airbnb.lottie;

import android.graphics.Matrix;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.airbnb.lottie.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C27288h implements E {
    @Override // com.airbnb.lottie.E
    public final void onResult(Object obj) {
        Throwable th2 = (Throwable) obj;
        C27288h c27288h = LottieAnimationView.f59116o;
        Matrix matrix = com.airbnb.lottie.utils.k.f60123a;
        if (!(th2 instanceof SocketException) && !(th2 instanceof ClosedChannelException) && !(th2 instanceof InterruptedIOException) && !(th2 instanceof ProtocolException) && !(th2 instanceof SSLException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        com.airbnb.lottie.utils.e.c("Unable to load composition.", th2);
    }
}

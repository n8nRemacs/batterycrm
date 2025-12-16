package androidx.media3.datasource;

import android.util.Base64;
import com.google.common.base.e0;
import com.google.common.util.concurrent.H0;
import com.google.common.util.concurrent.Q0;
import java.util.concurrent.Executors;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48238b;

    public /* synthetic */ k(int i12) {
        this.f48238b = i12;
    }

    @Override // com.google.common.base.e0
    public final Object get() {
        switch (this.f48238b) {
            case 0:
                e0<H0> e0Var = l.f48239a;
                return Q0.b(Executors.newSingleThreadExecutor());
            case 1:
                byte[] bArr = new byte[12];
                androidx.media3.exoplayer.analytics.q.f48702j.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                byte[] bArr2 = new byte[12];
                com.google.android.exoplayer2.analytics.k.f343789i.nextBytes(bArr2);
                return Base64.encodeToString(bArr2, 10);
            default:
                throw new IllegalStateException();
        }
    }
}

package androidx.media3.datasource.okhttp;

import com.google.common.util.concurrent.e1;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* compiled from: OkHttpDataSource.java */
/* loaded from: classes.dex */
class b implements Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f48265b;

    public b(e1 e1Var) {
        this.f48265b = e1Var;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        this.f48265b.o(iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        this.f48265b.n(response);
    }
}

package com.huawei.secure.android.common.ssl;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes7.dex */
final class o implements Callback {
    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        int i12 = n.f363738b;
        iOException.getMessage();
        throw null;
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        int i12 = n.f363738b;
        throw null;
    }
}

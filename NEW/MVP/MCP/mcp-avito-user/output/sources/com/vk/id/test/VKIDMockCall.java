package com.vk.id.test;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.Z;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.i0;

/* compiled from: VKIDMockCall.kt */
@P
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006 "}, d2 = {"Lcom/vk/id/test/VKIDMockCall;", "T", "Lokhttp3/Call;", "Lkotlin/Z;", "result", "<init>", "(Ljava/lang/Object;)V", "Lkotlin/G0;", "cancel", "()V", "clone", "()Lokhttp3/Call;", "Lokhttp3/Callback;", "responseCallback", "enqueue", "(Lokhttp3/Callback;)V", "Lokhttp3/Response;", "execute", "()Lokhttp3/Response;", "", "isCanceled", "()Z", "isExecuted", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", "Lokio/i0;", "timeout", "()Lokio/i0;", "Ljava/lang/Object;", "Z", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDMockCall<T> implements Call {
    private boolean isExecuted;

    @k
    private final Object result;
    public static final int $stable = 8;

    @k
    private static final Gson gson = new Gson();

    public VKIDMockCall(@k Object obj) {
        this.result = obj;
    }

    @Override // okhttp3.Call
    public void enqueue(@k Callback responseCallback) {
        responseCallback.onResponse(this, execute());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Call
    @k
    public Response execute() {
        Q q12;
        this.isExecuted = true;
        Object obj = this.result;
        int i12 = Z.f406624c;
        if (obj instanceof Z.b) {
            obj = null;
        }
        if (obj != null) {
            q12 = new Q(ResponseBody.INSTANCE.create(gson.l(obj), MediaType.INSTANCE.get("application/json; charset=utf-8")), 200);
        } else {
            q12 = new Q(null, 500);
        }
        return new Response.Builder().body((ResponseBody) q12.f406619b).request(new Request.Builder().url("https://vk.ru").build()).protocol(Protocol.HTTP_2).message("").code(((Number) q12.f406620c).intValue()).build();
    }

    @Override // okhttp3.Call
    /* renamed from: isCanceled */
    public boolean getCanceled() {
        return false;
    }

    @Override // okhttp3.Call
    /* renamed from: isExecuted, reason: from getter */
    public boolean getIsExecuted() {
        return this.isExecuted;
    }

    @Override // okhttp3.Call
    @k
    public Request request() {
        return new Request.Builder().build();
    }

    @Override // okhttp3.Call
    @k
    public i0 timeout() {
        return i0.NONE;
    }

    @Override // okhttp3.Call
    @k
    public Call clone() {
        return new VKIDMockCall(this.result);
    }

    @Override // okhttp3.Call
    public void cancel() {
    }
}

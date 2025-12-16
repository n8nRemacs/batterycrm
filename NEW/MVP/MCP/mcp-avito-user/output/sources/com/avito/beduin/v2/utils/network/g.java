package com.avito.beduin.v2.utils.network;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.InterfaceC44804n;
import okio.Y;

/* compiled from: ProgressResponseBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/utils/network/g;", "Lokhttp3/ResponseBody;", "okhttp_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends ResponseBody {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ResponseBody f338474b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f338475c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public InterfaceC44804n f338476d;

    public g(@k ResponseBody responseBody, @k e eVar) {
        this.f338474b = responseBody;
        this.f338475c = eVar;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long getContentLength() {
        return this.f338474b.getContentLength();
    }

    @Override // okhttp3.ResponseBody
    @l
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return this.f338474b.get$contentType();
    }

    @Override // okhttp3.ResponseBody
    @k
    /* renamed from: source */
    public final InterfaceC44804n getSource() {
        InterfaceC44804n y12 = this.f338476d;
        if (y12 == null) {
            y12 = new Y(new f(this.f338474b.getSource(), this));
        }
        this.f338476d = y12;
        return y12;
    }
}

package com.avito.beduin.v2.utils.network;

import SU0.j;
import Y61.k;
import Y61.l;
import com.avito.beduin.v2.utils.io.FileReadException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.s0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.InterfaceC44803m;
import okio.M;
import okio.e0;

/* compiled from: OkHttpNetworkClient.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/utils/network/c;", "Lokhttp3/RequestBody;", "okhttp_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends RequestBody {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediaType f338465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f338466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j.c.b f338467e;

    public c(MediaType mediaType, b bVar, j.c.b bVar2) {
        this.f338465c = mediaType;
        this.f338466d = bVar;
        this.f338467e = bVar2;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        Object bVar;
        b bVar2 = this.f338466d;
        j.c.b bVar3 = this.f338467e;
        try {
            int i12 = Z.f406624c;
            InputStream inputStreamA = bVar2.f338457a.a(bVar3.f15022c);
            try {
                long jAvailable = inputStreamA.available();
                kotlin.io.c.a(inputStreamA, null);
                bVar = Long.valueOf(jAvailable);
            } finally {
            }
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = 0L;
        }
        return ((Number) bVar).longValue();
    }

    @Override // okhttp3.RequestBody
    @l
    /* renamed from: contentType, reason: from getter */
    public final MediaType getF338465c() {
        return this.f338465c;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(@k InterfaceC44803m interfaceC44803m) throws IOException {
        try {
            e0 e0VarG = M.g(this.f338466d.f338457a.a(this.f338467e.f15022c));
            try {
                interfaceC44803m.h2(e0VarG);
                kotlin.io.c.a(e0VarG, null);
            } finally {
            }
        } catch (FileReadException e12) {
            RU0.b.f14467a.e("OkHttp", "failed to read the file by uri", e12);
            throw new IOException();
        }
    }
}

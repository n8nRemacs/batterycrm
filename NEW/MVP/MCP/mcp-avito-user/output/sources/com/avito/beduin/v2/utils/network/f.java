package com.avito.beduin.v2.utils.network;

import Y41.l;
import Y61.k;
import com.avito.beduin.v2.utils.network.b;
import kotlin.G0;
import kotlin.Metadata;
import okio.AbstractC44815z;
import okio.C44802l;
import okio.InterfaceC44804n;

/* compiled from: ProgressResponseBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/utils/network/f;", "Lokio/z;", "okhttp_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends AbstractC44815z {

    /* renamed from: g, reason: collision with root package name */
    public long f338472g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f338473h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC44804n interfaceC44804n, g gVar) {
        super(interfaceC44804n);
        this.f338473h = gVar;
    }

    @Override // okio.AbstractC44815z, okio.e0
    public final long read(@k C44802l c44802l, long j12) {
        long j13 = super.read(c44802l, j12);
        long j14 = this.f338472g + (j13 != -1 ? j13 : 0L);
        this.f338472g = j14;
        g gVar = this.f338473h;
        long contentLength = gVar.f338474b.getContentLength();
        boolean z12 = j13 == -1;
        e eVar = gVar.f338475c;
        a aVar = eVar.f338469a;
        if (z12) {
            aVar.log("100% completed");
        } else {
            if (eVar.f338470b) {
                eVar.f338470b = false;
                if (contentLength == -1) {
                    aVar.log("content-length: unknown");
                } else {
                    aVar.log("content-length: " + contentLength + '\n');
                }
            }
            if (contentLength != -1) {
                long j15 = (100 * j14) / contentLength;
                l<? super Integer, G0> lVar = eVar.f338471c;
                if (lVar != null) {
                    ((b.c) lVar).invoke(Integer.valueOf((int) j15));
                }
            }
        }
        return j13;
    }
}

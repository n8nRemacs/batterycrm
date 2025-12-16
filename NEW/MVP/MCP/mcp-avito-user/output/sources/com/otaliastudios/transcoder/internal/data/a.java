package com.otaliastudios.transcoder.internal.data;

import Y61.k;
import android.media.MediaFormat;
import com.otaliastudios.transcoder.internal.pipeline.k;
import com.otaliastudios.transcoder.internal.pipeline.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import x11.d;

/* compiled from: Bridge.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003¨\u0006\u0006"}, d2 = {"Lcom/otaliastudios/transcoder/internal/data/a;", "Lcom/otaliastudios/transcoder/internal/pipeline/l;", "Lcom/otaliastudios/transcoder/internal/data/d;", "Lcom/otaliastudios/transcoder/internal/data/c;", "Lcom/otaliastudios/transcoder/internal/data/i;", "Lcom/otaliastudios/transcoder/internal/data/h;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a implements l<d, c, i, h>, c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MediaFormat f366096b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f366097c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f366098d = this;

    /* compiled from: Bridge.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.transcoder.internal.data.a$a, reason: collision with other inner class name */
    public static final class C10800a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C10800a f366099l = new C10800a();

        public C10800a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public a(@k MediaFormat mediaFormat) {
        this.f366096b = mediaFormat;
        this.f366097c = ByteBuffer.allocateDirect(mediaFormat.getInteger("max-input-size")).order(ByteOrder.nativeOrder());
    }

    @Override // com.otaliastudios.transcoder.internal.data.c
    @k
    public final Q<ByteBuffer, Integer> a() {
        ByteBuffer byteBuffer = this.f366097c;
        byteBuffer.clear();
        return new Q<>(byteBuffer, 0);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final com.otaliastudios.transcoder.internal.pipeline.b r() {
        return this.f366098d;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    @k
    public final com.otaliastudios.transcoder.internal.pipeline.k<i> s(@k k.b<d> bVar, boolean z12) {
        d.a aVar = bVar.f366179a.f366105a;
        i iVar = new i(aVar.f442094a, aVar.f442096c, aVar.f442095b ? 1 : 0, C10800a.f366099l);
        return bVar instanceof k.a ? new k.a(iVar) : new k.b(iVar);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final void t(com.otaliastudios.transcoder.internal.pipeline.b bVar) {
        MediaFormat mediaFormat = this.f366096b;
        L.j(mediaFormat, "initialize(): format=");
        ((h) bVar).d(mediaFormat);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final void release() {
    }
}

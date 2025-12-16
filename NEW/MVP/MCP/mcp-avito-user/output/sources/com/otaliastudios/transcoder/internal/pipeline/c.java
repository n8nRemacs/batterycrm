package com.otaliastudios.transcoder.internal.pipeline;

import com.otaliastudios.transcoder.internal.pipeline.b;
import kotlin.Metadata;

/* compiled from: steps.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/c;", "", "D", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "C", "Lcom/otaliastudios/transcoder/internal/pipeline/l;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class c<D, C extends b> implements l<D, C, D, C> {

    /* renamed from: b, reason: collision with root package name */
    public C f366155b;

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    @Y61.k
    public final C r() {
        C c12 = this.f366155b;
        if (c12 != null) {
            return c12;
        }
        return null;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final void t(@Y61.k C c12) {
        this.f366155b = c12;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final void release() {
    }
}

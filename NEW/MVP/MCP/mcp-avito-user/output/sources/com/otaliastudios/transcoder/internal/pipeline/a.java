package com.otaliastudios.transcoder.internal.pipeline;

import com.otaliastudios.transcoder.internal.pipeline.b;
import kotlin.Metadata;

/* compiled from: steps.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0005*\u00020\u0001*\b\b\u0003\u0010\u0006*\u00020\u00032\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/a;", "", "Input", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "InputChannel", "Output", "OutputChannel", "Lcom/otaliastudios/transcoder/internal/pipeline/l;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a<Input, InputChannel extends b, Output, OutputChannel extends b> implements l<Input, InputChannel, Output, OutputChannel> {

    /* renamed from: b, reason: collision with root package name */
    public OutputChannel f366152b;

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public void t(@Y61.k OutputChannel outputchannel) {
        this.f366152b = outputchannel;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public void release() {
    }
}

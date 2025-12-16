package com.otaliastudios.transcoder.internal.pipeline;

import com.otaliastudios.transcoder.internal.pipeline.b;
import com.otaliastudios.transcoder.internal.pipeline.k;
import kotlin.Metadata;

/* compiled from: Step.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0005*\u00020\u0001*\b\b\u0003\u0010\u0006*\u00020\u00032\u00020\u0001¨\u0006\u0007"}, d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/l;", "", "Input", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "InputChannel", "Output", "OutputChannel", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface l<Input, InputChannel extends b, Output, OutputChannel extends b> {

    /* compiled from: Step.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a {
    }

    @Y61.k
    InputChannel r();

    void release();

    @Y61.k
    k<Output> s(@Y61.k k.b<Input> bVar, boolean z12);

    void t(@Y61.k OutputChannel outputchannel);
}

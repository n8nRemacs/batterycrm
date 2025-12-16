package com.avito.android.remote.di;

import com.avito.android.remote.model.text.SpacerAttribute;
import com.avito.android.remote.model.validation.Block;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b1;

/* compiled from: EvidenceRequestJsonModule_ProvideAutoEvidenceRequestBlockTypeAdapterFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/di/g;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class g implements dagger.internal.h<Set<com.google.gson.r>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final g f253366a = new g();

    @Override // javax.inject.Provider
    public final Object get() {
        f.f253365a.getClass();
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(Block.class);
        runtimeTypeAdapterFactory.b(Block.FieldWrapper.class, "field", null);
        runtimeTypeAdapterFactory.b(Block.AttributedTextWrapper.class, "attributedText", null);
        runtimeTypeAdapterFactory.b(Block.SpacerWrapper.class, SpacerAttribute.ATTRIBUTE_TYPE, null);
        return b1.g(runtimeTypeAdapterFactory);
    }
}

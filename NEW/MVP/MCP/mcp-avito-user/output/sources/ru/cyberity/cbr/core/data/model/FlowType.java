package ru.cyberity.cbr.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.w;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: FlowType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/core/data/model/FlowType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Actions", "Standalone", "Module", "$serializer", "Companion", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@w
@PublicApi
/* loaded from: classes9.dex */
public enum FlowType {
    Actions("actions"),
    Standalone("standalone"),
    Module("module");


    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    private final String value;

    /* compiled from: FlowType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/core/data/model/FlowType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/FlowType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<FlowType> serializer() {
            return FlowType$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    FlowType(String str) {
        this.value = str;
    }

    @Y61.k
    public final String getValue() {
        return this.value;
    }
}

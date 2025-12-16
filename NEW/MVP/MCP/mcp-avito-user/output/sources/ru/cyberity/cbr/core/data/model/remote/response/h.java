package ru.cyberity.cbr.core.data.model.remote.response;

import X41.n;
import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

/* compiled from: WorkflowStatus.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002\u0015\u0018B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBK\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010+\u0012\u0004\b-\u0010&\u001a\u0004\b,\u0010\u001b¨\u0006/"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/h;", "", "", "workflowId", "runId", "runStatus", "", "levelChangePossible", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/response/h;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "c", "d", "()Ljava/lang/Boolean;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/cyberity/cbr/core/data/model/remote/response/h;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "k", "getWorkflowId$annotations", "()V", "g", "getRunId$annotations", "i", "getRunStatus$annotations", "Ljava/lang/Boolean;", "e", "getLevelChangePossible$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class h {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final String workflowId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final String runId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final String runStatus;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final Boolean levelChangePossible;

    /* compiled from: WorkflowStatus.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/response/WorkflowStatus.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/response/h;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/response/h;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/response/h;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<h> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f433404a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433405b;

        static {
            a aVar = new a();
            f433404a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.response.WorkflowStatus", aVar, 4);
            pluginGeneratedSerialDescriptor.j("workflowId", true);
            pluginGeneratedSerialDescriptor.j("runId", true);
            pluginGeneratedSerialDescriptor.j("runStatus", true);
            pluginGeneratedSerialDescriptor.j("levelChangePossible", true);
            f433405b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h deserialize(@k Decoder decoder) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
            Object objF = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF2 = null;
            Object objF3 = null;
            Object objF4 = null;
            while (z12) {
                int iJ2 = cVarC.j(f412706c);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    objF = cVarC.f(f412706c, 0, V0.f412822a, objF);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    objF2 = cVarC.f(f412706c, 1, V0.f412822a, objF2);
                    i12 |= 2;
                } else if (iJ2 == 2) {
                    objF3 = cVarC.f(f412706c, 2, V0.f412822a, objF3);
                    i12 |= 4;
                } else {
                    if (iJ2 != 3) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objF4 = cVarC.f(f412706c, 3, C43407i.f412866a, objF4);
                    i12 |= 8;
                }
            }
            cVarC.d(f412706c);
            return new h(i12, (String) objF, (String) objF2, (String) objF3, (Boolean) objF4, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(C43407i.f412866a)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF412706c() {
            return f433405b;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@k Encoder encoder, @k h value) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
            h.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    /* compiled from: WorkflowStatus.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/h$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/response/h;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.h$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<h> serializer() {
            return a.f433404a;
        }

        private Companion() {
        }
    }

    public h() {
        this((String) null, (String) null, (String) null, (Boolean) null, 15, (C42822w) null);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getWorkflowId() {
        return this.workflowId;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getRunId() {
        return this.runId;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getRunStatus() {
        return this.runStatus;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getLevelChangePossible() {
        return this.levelChangePossible;
    }

    @l
    public final Boolean e() {
        return this.levelChangePossible;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return L.f(this.workflowId, hVar.workflowId) && L.f(this.runId, hVar.runId) && L.f(this.runStatus, hVar.runStatus) && L.f(this.levelChangePossible, hVar.levelChangePossible);
    }

    @l
    public final String g() {
        return this.runId;
    }

    public int hashCode() {
        String str = this.workflowId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.runId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.runStatus;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.levelChangePossible;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @l
    public final String i() {
        return this.runStatus;
    }

    @l
    public final String k() {
        return this.workflowId;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WorkflowStatus(workflowId=");
        sb2.append(this.workflowId);
        sb2.append(", runId=");
        sb2.append(this.runId);
        sb2.append(", runStatus=");
        sb2.append(this.runStatus);
        sb2.append(", levelChangePossible=");
        return C0.g(sb2, this.levelChangePossible, ')');
    }

    @InterfaceC42830m
    public /* synthetic */ h(int i12, @v String str, @v String str2, @v String str3, @v Boolean bool, P0 p02) {
        if ((i12 & 1) == 0) {
            this.workflowId = null;
        } else {
            this.workflowId = str;
        }
        if ((i12 & 2) == 0) {
            this.runId = null;
        } else {
            this.runId = str2;
        }
        if ((i12 & 4) == 0) {
            this.runStatus = null;
        } else {
            this.runStatus = str3;
        }
        if ((i12 & 8) == 0) {
            this.levelChangePossible = null;
        } else {
            this.levelChangePossible = bool;
        }
    }

    @k
    public final h a(@l String workflowId, @l String runId, @l String runStatus, @l Boolean levelChangePossible) {
        return new h(workflowId, runId, runStatus, levelChangePossible);
    }

    public h(@l String str, @l String str2, @l String str3, @l Boolean bool) {
        this.workflowId = str;
        this.runId = str2;
        this.runStatus = str3;
        this.levelChangePossible = bool;
    }

    public static /* synthetic */ h a(h hVar, String str, String str2, String str3, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = hVar.workflowId;
        }
        if ((i12 & 2) != 0) {
            str2 = hVar.runId;
        }
        if ((i12 & 4) != 0) {
            str3 = hVar.runStatus;
        }
        if ((i12 & 8) != 0) {
            bool = hVar.levelChangePossible;
        }
        return hVar.a(str, str2, str3, bool);
    }

    @n
    public static final void a(@k h self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
        if (output.u() || self.workflowId != null) {
            output.p(serialDesc, 0, V0.f412822a, self.workflowId);
        }
        if (output.u() || self.runId != null) {
            output.p(serialDesc, 1, V0.f412822a, self.runId);
        }
        if (output.u() || self.runStatus != null) {
            output.p(serialDesc, 2, V0.f412822a, self.runStatus);
        }
        if (!output.u() && self.levelChangePossible == null) {
            return;
        }
        output.p(serialDesc, 3, C43407i.f412866a, self.levelChangePossible);
    }

    public /* synthetic */ h(String str, String str2, String str3, Boolean bool, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : bool);
    }

    @v
    public static /* synthetic */ void f() {
    }

    @v
    public static /* synthetic */ void h() {
    }

    @v
    public static /* synthetic */ void j() {
    }

    @v
    public static /* synthetic */ void l() {
    }
}

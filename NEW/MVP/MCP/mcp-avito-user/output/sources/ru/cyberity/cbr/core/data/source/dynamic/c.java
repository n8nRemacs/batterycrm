package ru.cyberity.cbr.core.data.source.dynamic;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.n2;
import ru.cyberity.cbr.core.data.model.CBRMessage;
import ru.cyberity.cbr.core.data.model.t;
import ru.cyberity.log.logger.Logger;

/* compiled from: DataRepository.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0003\r\u000f\u0003J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u0003\u001a\u00060\tj\u0002`\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u000bJ3\u0010\r\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ)\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000bJ/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\tH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0011J#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0013J\u001d\u0010\r\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0013J#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015H¦@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0004J\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00150\fH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u001dø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/c;", "", "Lkotlin/G0;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "", "reload", "Lru/cyberity/cbr/core/data/model/g;", "Lru/cyberity/cbr/core/data/model/remote/response/ApplicantAction;", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/dynamic/a;", "a", "d", "b", "applicant", "(Lru/cyberity/cbr/core/data/model/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/t;", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/e;", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "e", "Lkotlinx/coroutines/flow/n2;", "Lru/cyberity/cbr/core/data/source/dynamic/c$a;", "()Lkotlinx/coroutines/flow/n2;", "dataFlow", "Lkotlinx/coroutines/flow/i;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "()Lkotlinx/coroutines/flow/i;", "socketEventsFlow", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface c {

    /* compiled from: DataRepository.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001\u001eBa\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\b\u0012\u00060\u0003j\u0002`\u0005\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u0006\u001a\u000e\u0012\b\u0012\u00060\u0003j\u0002`\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!¨\u0006,"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/c$a;", "", "Lru/cyberity/cbr/core/data/source/dynamic/a;", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "Lru/cyberity/cbr/core/data/model/remote/response/ApplicantAction;", "applicantAction", "Lru/cyberity/cbr/core/data/model/t;", "documentStatus", "Lru/cyberity/cbr/core/data/model/e;", Navigation.CONFIG, "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "strings", "Lru/cyberity/cbr/core/data/source/dynamic/c$b;", "featureFlags", "<init>", "(Lru/cyberity/cbr/core/data/source/dynamic/a;Lru/cyberity/cbr/core/data/source/dynamic/a;Lru/cyberity/cbr/core/data/source/dynamic/a;Lru/cyberity/cbr/core/data/source/dynamic/a;Lru/cyberity/cbr/core/data/source/dynamic/a;Lru/cyberity/cbr/core/data/source/dynamic/a;)V", "", "k", "()Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/data/source/dynamic/a;", "g", "()Lru/cyberity/cbr/core/data/source/dynamic/a;", "b", "h", "c", "j", "d", "i", "e", "m", "f", "l", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.g> applicant;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.g> applicantAction;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @k
        private final ru.cyberity.cbr.core.data.source.dynamic.a<t> documentStatus;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @k
        private final ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.e> config;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @k
        private final ru.cyberity.cbr.core.data.source.dynamic.a<C12476c> strings;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @k
        private final ru.cyberity.cbr.core.data.source.dynamic.a<b> featureFlags;

        public a(@k ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.g> aVar, @l ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.g> aVar2, @k ru.cyberity.cbr.core.data.source.dynamic.a<t> aVar3, @k ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.e> aVar4, @k ru.cyberity.cbr.core.data.source.dynamic.a<C12476c> aVar5, @k ru.cyberity.cbr.core.data.source.dynamic.a<b> aVar6) {
            this.applicant = aVar;
            this.applicantAction = aVar2;
            this.documentStatus = aVar3;
            this.config = aVar4;
            this.strings = aVar5;
            this.featureFlags = aVar6;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return L.f(this.applicant, aVar.applicant) && L.f(this.applicantAction, aVar.applicantAction) && L.f(this.documentStatus, aVar.documentStatus) && L.f(this.config, aVar.config) && L.f(this.strings, aVar.strings) && L.f(this.featureFlags, aVar.featureFlags);
        }

        @k
        public final ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.g> g() {
            return this.applicant;
        }

        public int hashCode() {
            int iHashCode = this.applicant.hashCode() * 31;
            ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.g> aVar = this.applicantAction;
            return this.featureFlags.hashCode() + ((this.strings.hashCode() + ((this.config.hashCode() + ((this.documentStatus.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31)) * 31)) * 31);
        }

        @k
        public final ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.e> i() {
            return this.config;
        }

        @k
        public final ru.cyberity.cbr.core.data.source.dynamic.a<t> j() {
            return this.documentStatus;
        }

        @l
        public final Throwable k() {
            Throwable thA = this.applicant.a();
            if (thA != null) {
                return thA;
            }
            Throwable thA2 = this.documentStatus.a();
            return thA2 == null ? this.config.a() : thA2;
        }

        @k
        public String toString() {
            return "Data(applicant=" + this.applicant + ", applicantAction=" + this.applicantAction + ", documentStatus=" + this.documentStatus + ", config=" + this.config + ", strings=" + this.strings + ", featureFlags=" + this.featureFlags + ')';
        }
    }

    /* compiled from: DataRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/c$b;", "", "", "Lru/cyberity/cbr/core/data/source/dynamic/c$b$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "list", "<init>", "(Ljava/util/List;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final List<a> list;

        /* compiled from: DataRepository.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/c$b$a;", "", "", "name", "", "isEnabled", "value", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Z", "f", "()Z", "c", "e", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @k
            private final String name;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final boolean isEnabled;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @l
            private final String value;

            public a(@k String str, boolean z12, @l String str2) {
                this.name = str;
                this.isEnabled = z12;
                this.value = str2;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return L.f(this.name, aVar.name) && this.isEnabled == aVar.isEnabled && L.f(this.value, aVar.value);
            }

            /* renamed from: f, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int iHashCode = this.name.hashCode() * 31;
                boolean z12 = this.isEnabled;
                int i12 = z12;
                if (z12 != 0) {
                    i12 = 1;
                }
                int i13 = (iHashCode + i12) * 31;
                String str = this.value;
                return i13 + (str == null ? 0 : str.hashCode());
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("FeatureFlag(name=");
                sb2.append(this.name);
                sb2.append(", isEnabled=");
                sb2.append(this.isEnabled);
                sb2.append(", value=");
                return C22026a.c(sb2, this.value, ')');
            }
        }

        public b(@k List<a> list) {
            this.list = list;
        }

        @k
        public final List<a> a() {
            return this.list;
        }
    }

    /* compiled from: DataRepository.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00032\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\n\"\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "", "", "", "strings", "", "Lru/cyberity/cbr/core/data/model/d;", "agreements", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "", "keys", "a", "([Ljava/lang/String;)Ljava/lang/String;", "resourceKey", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.source.dynamic.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12476c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final Map<String, String> strings;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final List<ru.cyberity.cbr.core.data.model.d> agreements;

        /* JADX WARN: Multi-variable type inference failed */
        public C12476c() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @k
        public final String a(@k String... keys) {
            String strA;
            int length = keys.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    strA = a(keys[i12]);
                    if (strA != null) {
                        break;
                    }
                    i12++;
                } else {
                    strA = null;
                    break;
                }
            }
            return strA == null ? "" : strA;
        }

        @l
        public final List<ru.cyberity.cbr.core.data.model.d> c() {
            return this.agreements;
        }

        @k
        public final Map<String, String> d() {
            return this.strings;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C12476c)) {
                return false;
            }
            C12476c c12476c = (C12476c) other;
            return L.f(this.strings, c12476c.strings) && L.f(this.agreements, c12476c.agreements);
        }

        public int hashCode() {
            int iHashCode = this.strings.hashCode() * 31;
            List<ru.cyberity.cbr.core.data.model.d> list = this.agreements;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Strings(strings=");
            sb2.append(this.strings);
            sb2.append(", agreements=");
            return H.p(sb2, this.agreements, ')');
        }

        public C12476c(@k Map<String, String> map, @l List<ru.cyberity.cbr.core.data.model.d> list) {
            this.strings = map;
            this.agreements = list;
        }

        @l
        public final String a(@k String resourceKey) {
            ru.cyberity.ff.a aVar = ru.cyberity.ff.a.f435638a;
            if (aVar.t().g() && C43066x.u(aVar.t().f(), "keys")) {
                return resourceKey;
            }
            String str = this.strings.get(resourceKey);
            if (str != null) {
                return str;
            }
            Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), AK.c.k("DataRepository: ", resourceKey, " is not found"), null, 4, null);
            if (aVar.t().g()) {
                return resourceKey;
            }
            return null;
        }

        public /* synthetic */ C12476c(Map map, List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? P0.c() : map, (i12 & 2) != 0 ? null : list);
        }
    }

    static /* synthetic */ Object a(c cVar, String str, boolean z12, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApplicantActionOrThrow");
        }
        if ((i12 & 1) != 0) {
            str = null;
        }
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        return cVar.c(str, z12, continuation);
    }

    static /* synthetic */ Object b(c cVar, String str, boolean z12, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApplicantOrThrow");
        }
        if ((i12 & 1) != 0) {
            str = null;
        }
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        return cVar.d(str, z12, continuation);
    }

    static /* synthetic */ Object c(c cVar, String str, boolean z12, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApplicantAsResult");
        }
        if ((i12 & 1) != 0) {
            str = null;
        }
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        return cVar.b(str, z12, continuation);
    }

    static /* synthetic */ Object d(c cVar, String str, boolean z12, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApplicantActionAsResult");
        }
        if ((i12 & 1) != 0) {
            str = null;
        }
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        return cVar.a(str, z12, continuation);
    }

    static /* synthetic */ Object e(c cVar, boolean z12, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApplicantByFlowTypeAsResult");
        }
        if ((i12 & 1) != 0) {
            z12 = false;
        }
        return cVar.e(z12, continuation);
    }

    @l
    Object a(@l String str, boolean z12, @k Continuation<? super ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.g>> continuation);

    @l
    Object a(@k Continuation<? super ru.cyberity.cbr.core.data.source.dynamic.a<C12476c>> continuation);

    @l
    Object a(@l ru.cyberity.cbr.core.data.model.g gVar, @k Continuation<? super G0> continuation);

    @l
    Object a(boolean z12, @k Continuation<? super ru.cyberity.cbr.core.data.model.e> continuation);

    @k
    InterfaceC43160i<CBRMessage.ServerMessage> a();

    @l
    Object b(@l String str, boolean z12, @k Continuation<? super ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.g>> continuation);

    @l
    Object b(boolean z12, @k Continuation<? super ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.e>> continuation);

    @k
    n2<a> b();

    @l
    Object c(@l String str, boolean z12, @k Continuation<? super ru.cyberity.cbr.core.data.model.g> continuation);

    @l
    Object c(@k Continuation<? super G0> continuation);

    @l
    Object d(@l String str, boolean z12, @k Continuation<? super ru.cyberity.cbr.core.data.model.g> continuation);

    @l
    Object d(boolean z12, @k Continuation<? super ru.cyberity.cbr.core.data.source.dynamic.a<t>> continuation);

    @l
    Object e(@k Continuation<? super C12476c> continuation);

    @l
    Object e(boolean z12, @k Continuation<? super ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.g>> continuation);

    static /* synthetic */ Object a(c cVar, boolean z12, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConfigAsResult");
        }
        if ((i12 & 1) != 0) {
            z12 = false;
        }
        return cVar.b(z12, continuation);
    }

    static /* synthetic */ Object c(c cVar, boolean z12, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConfigOrThrow");
        }
        if ((i12 & 1) != 0) {
            z12 = false;
        }
        return cVar.a(z12, (Continuation<? super ru.cyberity.cbr.core.data.model.e>) continuation);
    }

    static /* synthetic */ Object d(c cVar, boolean z12, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequiredIdDocStatus");
        }
        if ((i12 & 1) != 0) {
            z12 = false;
        }
        return cVar.d(z12, continuation);
    }
}

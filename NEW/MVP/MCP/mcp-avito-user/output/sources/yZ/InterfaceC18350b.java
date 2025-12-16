package Yz;

import Y61.k;
import Y61.l;
import com.avito.android.evidence_request.mvi.domain.evidence_request.EvidenceContent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceRequestOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LYz/b;", "", "a", "LYz/b$a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC18350b {

    /* compiled from: EvidenceRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYz/b$a;", "LYz/b;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yz.b$a */
    public static final /* data */ class a implements InterfaceC18350b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final EvidenceContent f19753a;

        public a(@k EvidenceContent evidenceContent) {
            this.f19753a = evidenceContent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f19753a, ((a) obj).f19753a);
        }

        public final int hashCode() {
            return this.f19753a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenScreen(data=" + this.f19753a + ')';
        }
    }
}

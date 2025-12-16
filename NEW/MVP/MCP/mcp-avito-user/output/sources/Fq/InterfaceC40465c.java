package fq;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResult;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.threeten.bp.g;
import org.webrtc.h;

/* compiled from: StagesTransitionOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lfq/c;", "", "a", "b", "c", "d", "Lfq/c$a;", "Lfq/c$b;", "Lfq/c$c;", "Lfq/c$d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fq.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40465c {

    /* compiled from: StagesTransitionOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/c$a;", "Lfq/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.c$a */
    public static final /* data */ class a implements InterfaceC40465c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final StagesTransitionResult f396149a;

        public a(@k StagesTransitionResult stagesTransitionResult) {
            this.f396149a = stagesTransitionResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f396149a, ((a) obj).f396149a);
        }

        public final int hashCode() {
            return this.f396149a.hashCode();
        }

        @k
        public final String toString() {
            return "Close(result=" + this.f396149a + ')';
        }
    }

    /* compiled from: StagesTransitionOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/c$b;", "Lfq/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.c$b */
    public static final /* data */ class b implements InterfaceC40465c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final org.threeten.bp.e f396150a;

        public b(@l org.threeten.bp.e eVar) {
            this.f396150a = eVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f396150a, ((b) obj).f396150a);
        }

        public final int hashCode() {
            org.threeten.bp.e eVar = this.f396150a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        @k
        public final String toString() {
            return "ShowDatePicker(date=" + this.f396150a + ')';
        }
    }

    /* compiled from: StagesTransitionOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/c$c;", "Lfq/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11178c implements InterfaceC40465c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f396151a;

        public C11178c(@k PrintableText printableText) {
            this.f396151a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11178c) && L.f(this.f396151a, ((C11178c) obj).f396151a);
        }

        public final int hashCode() {
            return this.f396151a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowError(text="), this.f396151a, ')');
        }
    }

    /* compiled from: StagesTransitionOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/c$d;", "Lfq/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.c$d */
    public static final /* data */ class d implements InterfaceC40465c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final g f396152a;

        public d(@l g gVar) {
            this.f396152a = gVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f396152a, ((d) obj).f396152a);
        }

        public final int hashCode() {
            g gVar = this.f396152a;
            if (gVar == null) {
                return 0;
            }
            return gVar.hashCode();
        }

        @k
        public final String toString() {
            return h.f(new StringBuilder("ShowTimePicker(time="), this.f396152a, ')');
        }
    }
}

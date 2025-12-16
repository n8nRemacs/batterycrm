package shark;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: OnAnalysisProgressListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lshark/OnAnalysisProgressListener;", "", "a", "Step", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface OnAnalysisProgressListener {

    /* compiled from: OnAnalysisProgressListener.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lshark/OnAnalysisProgressListener$Step;", "", "shark"}, k = 1, mv = {1, 4, 1})
    public enum Step {
        /* JADX INFO: Fake field, exist only in values array */
        PARSING_HEAP_DUMP,
        EXTRACTING_METADATA,
        FINDING_RETAINED_OBJECTS,
        FINDING_PATHS_TO_RETAINED_OBJECTS,
        FINDING_DOMINATORS,
        INSPECTING_OBJECTS,
        COMPUTING_NATIVE_RETAINED_SIZE,
        COMPUTING_RETAINED_SIZE,
        BUILDING_LEAK_TRACES,
        /* JADX INFO: Fake field, exist only in values array */
        REPORTING_HEAP_ANALYSIS;

        Step() {
            String strA0 = C43066x.a0(name(), "_", " ", false);
            Locale locale = Locale.US;
            String lowerCase = strA0.toLowerCase(locale);
            lowerCase.substring(0, 1).toUpperCase(locale);
            lowerCase.substring(1);
        }
    }

    void a(@Y61.k Step step);

    /* compiled from: OnAnalysisProgressListener.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/OnAnalysisProgressListener$a;", "", "<init>", "()V", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        static {
            new a();
            int i12 = C12628a.f438189a;
        }

        /* compiled from: OnAnalysisProgressListener.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/OnAnalysisProgressListener$Step;", "it", "Lkotlin/G0;", "onAnalysisProgress", "(Lshark/OnAnalysisProgressListener$Step;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* renamed from: shark.OnAnalysisProgressListener$a$a, reason: collision with other inner class name */
        public static final class C12628a implements OnAnalysisProgressListener {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int f438189a = 0;

            static {
                new C12628a();
            }

            @Override // shark.OnAnalysisProgressListener
            public final void a(@Y61.k Step step) {
            }
        }
    }
}

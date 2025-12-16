package ru.cyberity.cbr.camera.video.presentation;

import Y41.p;
import android.os.CountDownTimer;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.io.File;
import java.util.UUID;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import ru.cyberity.cbr.core.domain.j;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRVideoSelfieViewModel.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0011\u0016\u0013*\u001e\u001dB;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0010H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0012J\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0014J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0014J\r\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$d;", "Lru/cyberity/cbr/core/domain/j;", "createNewFileUseCase", "Lru/cyberity/cbr/core/domain/m;", "getConfigUseCase", "", "idDocSetType", "type", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Lru/cyberity/cbr/core/domain/j;Lru/cyberity/cbr/core/domain/m;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "Lkotlin/G0;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "()V", "onCleared", "b", "()Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$d;", "onPrepare", "Lkotlinx/coroutines/N0;", "g", "()Lkotlinx/coroutines/N0;", "f", "e", "d", "Lru/cyberity/cbr/core/domain/j;", "Lru/cyberity/cbr/core/domain/m;", "Ljava/lang/String;", "Landroid/os/CountDownTimer;", "Landroid/os/CountDownTimer;", "timer", "phrase", "Ljava/io/File;", "Ljava/io/File;", "file", "h", "State", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRVideoSelfieViewModel extends CBRViewModel<d> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.domain.j createNewFileUseCase;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.domain.m getConfigUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String idDocSetType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String type;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private CountDownTimer timer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private String phrase;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private File file;

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;", "", "(Ljava/lang/String;I)V", "Countdown", "Recording", "Done", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum State {
        Countdown,
        Recording,
        Done
    }

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "<init>", "()V", "a", "b", "c", "d", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b$a;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b$b;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b$c;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b$d;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class b implements CBRViewModel.CBRViewModelEvent {

        /* compiled from: CBRVideoSelfieViewModel.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b$a;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$c;", "result", "<init>", "(Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$c;", "b", "()Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$c;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final c result;

            public a(@Y61.k c cVar) {
                super(null);
                this.result = cVar;
            }

            @Y61.k
            /* renamed from: b, reason: from getter */
            public final c getResult() {
                return this.result;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && L.f(this.result, ((a) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            @Y61.k
            public String toString() {
                return "ResultObtained(result=" + this.result + ')';
            }
        }

        /* compiled from: CBRVideoSelfieViewModel.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b$b;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "b", "()Ljava/io/File;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$b$b, reason: collision with other inner class name */
        public static final /* data */ class C12426b extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final File file;

            public C12426b(@Y61.k File file) {
                super(null);
                this.file = file;
            }

            @Y61.k
            /* renamed from: b, reason: from getter */
            public final File getFile() {
                return this.file;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C12426b) && L.f(this.file, ((C12426b) other).file);
            }

            public int hashCode() {
                return this.file.hashCode();
            }

            @Y61.k
            public String toString() {
                return "StartRecording(file=" + this.file + ')';
            }
        }

        /* compiled from: CBRVideoSelfieViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b$c;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f432443a = new c();

            private c() {
                super(null);
            }
        }

        /* compiled from: CBRVideoSelfieViewModel.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\tB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b$d;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;", "a", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;", "()Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;", VoiceInfo.STATE, "<init>", "(Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;)V", "b", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b$d$a;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b$d$b;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static abstract class d extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final State state;

            /* compiled from: CBRVideoSelfieViewModel.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b$d$a;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b$d;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;", VoiceInfo.STATE, "<init>", "(Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
            public static final class a extends d {
                public a(@Y61.k State state) {
                    super(state, null);
                }
            }

            /* compiled from: CBRVideoSelfieViewModel.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b$d$b;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$b$d;", "", "b", "J", "()J", "ms", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;", VoiceInfo.STATE, "<init>", "(Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;J)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$b$d$b, reason: collision with other inner class name */
            public static final class C12427b extends d {

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final long ms;

                public C12427b(@Y61.k State state, long j12) {
                    super(state, null);
                    this.ms = j12;
                }

                /* renamed from: b, reason: from getter */
                public final long getMs() {
                    return this.ms;
                }
            }

            public /* synthetic */ d(State state, C42822w c42822w) {
                this(state);
            }

            @Y61.k
            /* renamed from: a, reason: from getter */
            public final State getState() {
                return this.state;
            }

            private d(State state) {
                super(null);
                this.state = state;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$c;", "", "Ljava/io/File;", "file", "", "phrase", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "c", "()Ljava/io/File;", "b", "Ljava/lang/String;", "d", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final File file;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final String phrase;

        public c(@Y61.k File file, @Y61.k String str) {
            this.file = file;
            this.phrase = str;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getPhrase() {
            return this.phrase;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return L.f(this.file, cVar.file) && L.f(this.phrase, cVar.phrase);
        }

        public int hashCode() {
            return this.phrase.hashCode() + (this.file.hashCode() * 31);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Result(file=");
            sb2.append(this.file);
            sb2.append(", phrase=");
            return C22026a.c(sb2, this.phrase, ')');
        }
    }

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$d;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$e;", "viewText", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;", VoiceInfo.STATE, "<init>", "(Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$e;Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;)V", "a", "(Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$e;Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;)Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$e;", "d", "()Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$e;", "b", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;", "c", "()Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class d implements CBRViewModel.CBRViewModelState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final e viewText;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final State state;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ d a(d dVar, e eVar, State state, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                eVar = dVar.viewText;
            }
            if ((i12 & 2) != 0) {
                state = dVar.state;
            }
            return dVar.a(eVar, state);
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final State getState() {
            return this.state;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final e getViewText() {
            return this.viewText;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return L.f(this.viewText, dVar.viewText) && this.state == dVar.state;
        }

        public int hashCode() {
            int iHashCode = this.viewText.hashCode() * 31;
            State state = this.state;
            return iHashCode + (state == null ? 0 : state.hashCode());
        }

        @Y61.k
        public String toString() {
            return "ViewState(viewText=" + this.viewText + ", state=" + this.state + ')';
        }

        public d(@Y61.k e eVar, @Y61.l State state) {
            this.viewText = eVar;
            this.state = state;
        }

        @Y61.k
        public final d a(@Y61.k e viewText, @Y61.l State state) {
            return new d(viewText, state);
        }

        public /* synthetic */ d(e eVar, State state, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? new e(null, null, null, null, null, null, 63, null) : eVar, (i12 & 2) != 0 ? null : state);
        }
    }

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJX\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$e;", "", "", "message", "description1", "description2", "lackOfCameraMessage", "lackOfCameraPositive", "lackOfCameraNeutral", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "a", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "l", "()Ljava/lang/CharSequence;", "b", "g", "c", "h", "d", "i", "e", "k", "f", "j", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence message;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence description1;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence description2;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence lackOfCameraMessage;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence lackOfCameraPositive;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence lackOfCameraNeutral;

        public e() {
            this(null, null, null, null, null, null, 63, null);
        }

        @Y61.k
        public final e a(@Y61.l CharSequence message, @Y61.l CharSequence description1, @Y61.l CharSequence description2, @Y61.l CharSequence lackOfCameraMessage, @Y61.l CharSequence lackOfCameraPositive, @Y61.l CharSequence lackOfCameraNeutral) {
            return new e(message, description1, description2, lackOfCameraMessage, lackOfCameraPositive, lackOfCameraNeutral);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return L.f(this.message, eVar.message) && L.f(this.description1, eVar.description1) && L.f(this.description2, eVar.description2) && L.f(this.lackOfCameraMessage, eVar.lackOfCameraMessage) && L.f(this.lackOfCameraPositive, eVar.lackOfCameraPositive) && L.f(this.lackOfCameraNeutral, eVar.lackOfCameraNeutral);
        }

        @Y61.l
        /* renamed from: g, reason: from getter */
        public final CharSequence getDescription1() {
            return this.description1;
        }

        @Y61.l
        /* renamed from: h, reason: from getter */
        public final CharSequence getDescription2() {
            return this.description2;
        }

        public int hashCode() {
            CharSequence charSequence = this.message;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.description1;
            int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.description2;
            int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.lackOfCameraMessage;
            int iHashCode4 = (iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
            CharSequence charSequence5 = this.lackOfCameraPositive;
            int iHashCode5 = (iHashCode4 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
            CharSequence charSequence6 = this.lackOfCameraNeutral;
            return iHashCode5 + (charSequence6 != null ? charSequence6.hashCode() : 0);
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final CharSequence getLackOfCameraMessage() {
            return this.lackOfCameraMessage;
        }

        @Y61.l
        /* renamed from: j, reason: from getter */
        public final CharSequence getLackOfCameraNeutral() {
            return this.lackOfCameraNeutral;
        }

        @Y61.l
        /* renamed from: k, reason: from getter */
        public final CharSequence getLackOfCameraPositive() {
            return this.lackOfCameraPositive;
        }

        @Y61.l
        /* renamed from: l, reason: from getter */
        public final CharSequence getMessage() {
            return this.message;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewText(message=");
            sb2.append((Object) this.message);
            sb2.append(", description1=");
            sb2.append((Object) this.description1);
            sb2.append(", description2=");
            sb2.append((Object) this.description2);
            sb2.append(", lackOfCameraMessage=");
            sb2.append((Object) this.lackOfCameraMessage);
            sb2.append(", lackOfCameraPositive=");
            sb2.append((Object) this.lackOfCameraPositive);
            sb2.append(", lackOfCameraNeutral=");
            return AK.c.r(sb2, this.lackOfCameraNeutral, ')');
        }

        public e(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3, @Y61.l CharSequence charSequence4, @Y61.l CharSequence charSequence5, @Y61.l CharSequence charSequence6) {
            this.message = charSequence;
            this.description1 = charSequence2;
            this.description2 = charSequence3;
            this.lackOfCameraMessage = charSequence4;
            this.lackOfCameraPositive = charSequence5;
            this.lackOfCameraNeutral = charSequence6;
        }

        public static /* synthetic */ e a(e eVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                charSequence = eVar.message;
            }
            if ((i12 & 2) != 0) {
                charSequence2 = eVar.description1;
            }
            CharSequence charSequence7 = charSequence2;
            if ((i12 & 4) != 0) {
                charSequence3 = eVar.description2;
            }
            CharSequence charSequence8 = charSequence3;
            if ((i12 & 8) != 0) {
                charSequence4 = eVar.lackOfCameraMessage;
            }
            CharSequence charSequence9 = charSequence4;
            if ((i12 & 16) != 0) {
                charSequence5 = eVar.lackOfCameraPositive;
            }
            CharSequence charSequence10 = charSequence5;
            if ((i12 & 32) != 0) {
                charSequence6 = eVar.lackOfCameraNeutral;
            }
            return eVar.a(charSequence, charSequence7, charSequence8, charSequence9, charSequence10, charSequence6);
        }

        public /* synthetic */ e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : charSequence, (i12 & 2) != 0 ? null : charSequence2, (i12 & 4) != 0 ? null : charSequence3, (i12 & 8) != 0 ? null : charSequence4, (i12 & 16) != 0 ? null : charSequence5, (i12 & 32) != 0 ? null : charSequence6);
        }
    }

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel", f = "CBRVideoSelfieViewModel.kt", i = {0}, l = {67}, m = "initPhase", n = {"this"}, s = {"L$0"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432456a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432457b;

        /* renamed from: d, reason: collision with root package name */
        int f432459d;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432457b = obj;
            this.f432459d |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRVideoSelfieViewModel.this.a(this);
        }
    }

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$onCountdownFinished$1", f = "CBRVideoSelfieViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432460a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432461b;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super d> continuation) {
            return ((g) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(continuation);
            gVar.f432461b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432460a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return d.a((d) this.f432461b, null, State.Recording, 1, null);
        }
    }

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$onCountdownFinished$2", f = "CBRVideoSelfieViewModel.kt", i = {0}, l = {97}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class h extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f432462a;

        /* renamed from: b, reason: collision with root package name */
        int f432463b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f432464c;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = CBRVideoSelfieViewModel.this.new h(continuation);
            hVar.f432464c = obj;
            return hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            CBRVideoSelfieViewModel cBRVideoSelfieViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            Object obj2 = this.f432463b;
            try {
                if (obj2 == 0) {
                    C42729a0.b(obj);
                    T t12 = (T) this.f432464c;
                    String str = UUID.randomUUID().toString() + ".mp4";
                    Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(t12), G.f("File name is ", str), null, 4, null);
                    CBRVideoSelfieViewModel cBRVideoSelfieViewModel2 = CBRVideoSelfieViewModel.this;
                    ru.cyberity.cbr.core.domain.j jVar = cBRVideoSelfieViewModel2.createNewFileUseCase;
                    j.a aVar = new j.a(str);
                    this.f432464c = t12;
                    this.f432462a = cBRVideoSelfieViewModel2;
                    this.f432463b = 1;
                    obj = jVar.a(aVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cBRVideoSelfieViewModel = cBRVideoSelfieViewModel2;
                    obj2 = t12;
                } else {
                    if (obj2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cBRVideoSelfieViewModel = (CBRVideoSelfieViewModel) this.f432462a;
                    T t13 = (T) this.f432464c;
                    C42729a0.b(obj);
                    obj2 = t13;
                }
                cBRVideoSelfieViewModel.file = (File) obj;
                CBRVideoSelfieViewModel cBRVideoSelfieViewModel3 = CBRVideoSelfieViewModel.this;
                cBRVideoSelfieViewModel3.fireEvent(new b.C12426b(cBRVideoSelfieViewModel3.file));
            } catch (Exception e12) {
                ru.cyberity.log.a.f436064a.e(ru.cyberity.log.c.a(obj2), "An error while creating new video selfie file...", e12);
                CBRViewModel.finish$default(CBRVideoSelfieViewModel.this, null, null, null, 7, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$i", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "Lkotlin/G0;", "onTick", "(J)V", "onFinish", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class i extends CountDownTimer {
        public i() {
            super(7600L, 50L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CBRVideoSelfieViewModel.this.fireEvent(new b.d.a(State.Recording));
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            CBRVideoSelfieViewModel.this.fireEvent(new b.d.C12427b(State.Recording, millisUntilFinished));
        }
    }

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel", f = "CBRVideoSelfieViewModel.kt", i = {0}, l = {53}, m = "onPrepare", n = {"this"}, s = {"L$0"})
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432467a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432468b;

        /* renamed from: d, reason: collision with root package name */
        int f432470d;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432468b = obj;
            this.f432470d |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRVideoSelfieViewModel.this.onPrepare(this);
        }
    }

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$onPrepare$2", f = "CBRVideoSelfieViewModel.kt", i = {0, 1, 2, 3, 4}, l = {56, 57, 58, 59, 60}, m = "invokeSuspend", n = {"it", "it", "it", "it", "it"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class k extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f432471a;

        /* renamed from: b, reason: collision with root package name */
        Object f432472b;

        /* renamed from: c, reason: collision with root package name */
        Object f432473c;

        /* renamed from: d, reason: collision with root package name */
        Object f432474d;

        /* renamed from: e, reason: collision with root package name */
        Object f432475e;

        /* renamed from: f, reason: collision with root package name */
        int f432476f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f432477g;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super d> continuation) {
            return ((k) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            k kVar = CBRVideoSelfieViewModel.this.new k(continuation);
            kVar.f432477g = obj;
            return kVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00f0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0110 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0130 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0131  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$onRecordingFinished$1", f = "CBRVideoSelfieViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432479a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432480b;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super d> continuation) {
            return ((l) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            l lVar = new l(continuation);
            lVar.f432480b = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432479a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return d.a((d) this.f432480b, null, State.Done, 1, null);
        }
    }

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$onRecordingStarted$1", f = "CBRVideoSelfieViewModel.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432482a;

        /* compiled from: CBRVideoSelfieViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$onRecordingStarted$1$1$1", f = "CBRVideoSelfieViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f432484a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f432485b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f432486c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f432486c = str;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super d> continuation) {
                return ((a) create(dVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f432486c, continuation);
                aVar.f432485b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f432484a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                d dVar = (d) this.f432485b;
                return d.a(dVar, e.a(dVar.getViewText(), this.f432486c, null, null, null, null, null, 62, null), null, 2, null);
            }
        }

        public n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((n) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRVideoSelfieViewModel.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432482a;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f432482a = 1;
                if (C43131e0.b(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            String str = CBRVideoSelfieViewModel.this.phrase;
            if (str != null) {
                CBRViewModel.updateState$default(CBRVideoSelfieViewModel.this, false, new a(str, null), 1, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$startCountdown$1", f = "CBRVideoSelfieViewModel.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432487a;

        /* compiled from: CBRVideoSelfieViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$startCountdown$1$1", f = "CBRVideoSelfieViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f432489a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f432490b;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super d> continuation) {
                return ((a) create(dVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.f432490b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f432489a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return d.a((d) this.f432490b, null, State.Countdown, 1, null);
            }
        }

        /* compiled from: CBRVideoSelfieViewModel.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$o$b", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "Lkotlin/G0;", "onTick", "(J)V", "onFinish", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final class b extends CountDownTimer {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CBRVideoSelfieViewModel f432491a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CBRVideoSelfieViewModel cBRVideoSelfieViewModel) {
                super(3000L, 50L);
                this.f432491a = cBRVideoSelfieViewModel;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                this.f432491a.c();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                this.f432491a.fireEvent(new b.d.C12427b(State.Countdown, millisUntilFinished));
            }
        }

        public o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRVideoSelfieViewModel.this.new o(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432487a;
            if (i12 == 0) {
                C42729a0.b(obj);
                if (CBRVideoSelfieViewModel.this.phrase == null) {
                    CBRVideoSelfieViewModel cBRVideoSelfieViewModel = CBRVideoSelfieViewModel.this;
                    this.f432487a = 1;
                    if (cBRVideoSelfieViewModel.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            CBRViewModel.updateState$default(CBRVideoSelfieViewModel.this, false, new a(null), 1, null);
            CBRVideoSelfieViewModel.this.a();
            CBRVideoSelfieViewModel.this.timer = new b(CBRVideoSelfieViewModel.this).start();
            return G0.f406611a;
        }
    }

    public CBRVideoSelfieViewModel(@Y61.k ru.cyberity.cbr.core.domain.j jVar, @Y61.k ru.cyberity.cbr.core.domain.m mVar, @Y61.l String str, @Y61.l String str2, @Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(aVar, cVar);
        this.createNewFileUseCase = jVar;
        this.getConfigUseCase = mVar;
        this.idDocSetType = str;
        this.type = str2;
        Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Video Selfie is created", null, 4, null);
    }

    public final void e() {
        Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Recording is finished", null, 4, null);
        a();
        fireEvent(b.c.f432443a);
        CBRViewModel.updateState$default(this, false, new l(null), 1, null);
        this.timer = new m().start();
    }

    @Y61.k
    public final N0 f() {
        return C43259k.d(androidx.view.N0.a(this), null, null, new n(null), 3);
    }

    @Y61.k
    public final N0 g() {
        return C43259k.d(androidx.view.N0.a(this), null, null, new o(null), 3);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel, androidx.view.M0
    public void onCleared() {
        super.onCleared();
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onPrepare(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel.j
            if (r0 == 0) goto L13
            r0 = r5
            ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$j r0 = (ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel.j) r0
            int r1 = r0.f432470d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432470d = r1
            goto L18
        L13:
            ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$j r0 = new ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$j
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f432468b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f432470d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f432467a
            ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel r0 = (ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel) r0
            kotlin.C42729a0.b(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C42729a0.b(r5)
            r0.f432467a = r4
            r0.f432470d = r3
            java.lang.Object r5 = super.onPrepare(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$k r5 = new ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$k
            r1 = 0
            r5.<init>(r1)
            r2 = 0
            ru.cyberity.cbr.core.presentation.base.CBRViewModel.updateState$default(r0, r2, r5, r3, r1)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel.onPrepare(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Countdown is finished", null, 4, null);
        CBRViewModel.updateState$default(this, false, new g(null), 1, null);
        a();
        C43259k.d(androidx.view.N0.a(this), null, null, new h(null), 3);
        this.timer = new i().start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d getDefaultState() {
        return new d(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final void d() {
        ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
        String strA = ru.cyberity.log.c.a(this);
        StringBuilder sb2 = new StringBuilder("File is created. File - ");
        File file = this.file;
        sb2.append(file != null ? file.getAbsolutePath() : null);
        Logger.d$default(aVar, strA, sb2.toString(), null, 4, null);
        File file2 = this.file;
        if (file2 != null) {
            String str = this.phrase;
            if (str == null) {
                str = "";
            }
            fireEvent(new b.a(new c(file2, str)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel.f
            if (r0 == 0) goto L13
            r0 = r6
            ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$f r0 = (ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel.f) r0
            int r1 = r0.f432459d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432459d = r1
            goto L18
        L13:
            ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$f r0 = new ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f432457b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f432459d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f432456a
            ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel r0 = (ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel) r0
            kotlin.C42729a0.b(r6)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.C42729a0.b(r6)
            ru.cyberity.cbr.core.domain.m r6 = r5.getConfigUseCase
            ru.cyberity.cbr.core.domain.m$a r2 = new ru.cyberity.cbr.core.domain.m$a
            r2.<init>()
            r0.f432456a = r5
            r0.f432459d = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r0 = r5
        L4b:
            boolean r1 = r6 instanceof ru.cyberity.cbr.core.domain.model.a.b
            r2 = 0
            if (r1 == 0) goto L53
            ru.cyberity.cbr.core.domain.model.a$b r6 = (ru.cyberity.cbr.core.domain.model.a.b) r6
            goto L54
        L53:
            r6 = r2
        L54:
            if (r6 == 0) goto L5d
            java.lang.Object r6 = r6.d()
            ru.cyberity.cbr.core.data.model.e r6 = (ru.cyberity.cbr.core.data.model.e) r6
            goto L5e
        L5d:
            r6 = r2
        L5e:
            if (r6 == 0) goto L81
            kotlin.jvm.internal.u0 r1 = kotlin.jvm.internal.u0.f406856a
            java.lang.String r1 = r0.type
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r4 = "selfiePhrase_%s"
            java.lang.String r1 = java.lang.String.format(r4, r1)
            java.util.Map r6 = r6.A()
            if (r6 == 0) goto L7f
            java.lang.Object r6 = r6.get(r1)
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
        L7f:
            r0.phrase = r2
        L81:
            java.lang.String r6 = r0.phrase
            if (r6 == 0) goto L8b
            boolean r6 = kotlin.text.C43066x.K(r6)
            if (r6 == 0) goto Lcd
        L8b:
            kotlin.jvm.internal.u0 r6 = kotlin.jvm.internal.u0.f406856a
            java.lang.String r6 = r0.idDocSetType
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r3)
            java.lang.String r1 = "sns_step_%s_recording_readAloudText"
            java.lang.String r6 = java.lang.String.format(r1, r6)
            java.lang.String r2 = "defaults"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            ru.cyberity.cbr.core.data.source.dynamic.c$c r2 = r0.getStrings()
            java.lang.String[] r6 = new java.lang.String[]{r6, r1}
            java.lang.CharSequence r6 = ru.cyberity.cbr.core.common.ExtensionsKt.getByPriority(r2, r6)
            java.lang.String r1 = ";"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 6
            r3 = 0
            java.util.List r6 = kotlin.text.C43066x.f0(r6, r1, r3, r2)
            kotlin.random.f$a r1 = kotlin.random.f.f406882b
            java.lang.Object r6 = kotlin.collections.C42745f0.j0(r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            r0.phrase = r6
        Lcd:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    /* compiled from: CBRVideoSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$m", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "Lkotlin/G0;", "onTick", "(J)V", "onFinish", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class m extends CountDownTimer {
        public m() {
            super(1000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CBRVideoSelfieViewModel.this.d();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }
}

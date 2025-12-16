package ru.cyberity.cbr.camera;

import Y41.p;
import Y61.k;
import Y61.l;
import android.util.Size;
import androidx.compose.runtime.C22026a;
import androidx.view.N0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
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
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import ru.cyberity.cbr.core.analytics.GlobalStatePayload;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.IdentitySide;
import ru.cyberity.cbr.core.data.model.o;
import ru.cyberity.cbr.core.data.model.r;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.helper.camera.CBRCameraHelperStateFactory;
import ru.cyberity.cbr.core.presentation.helper.camera.CBRHelperViewState;
import ru.cyberity.cbr.core.presentation.intro.CBRInstructionResources;
import ru.cyberity.cbr.core.presentation.intro.CBRStepInfo;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRCameraViewModel.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e(B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000fJ)\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\r¢\u0006\u0004\b \u0010\u001fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\u000e\u0010#J\r\u0010$\u001a\u00020\r¢\u0006\u0004\b$\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b\u000e\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010.R\u001a\u00103\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R.\u00109\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\b&\u00106\u001a\u0004\b(\u00107\"\u0004\b\u000e\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lru/cyberity/cbr/camera/d;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/camera/d$b;", "Lru/cyberity/cbr/core/data/model/DocumentType;", "type", "", "identityType", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Lru/cyberity/cbr/core/data/model/DocumentType;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "Lkotlin/G0;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "stepInfo", "", "", "instructionsData", "countryCode", "Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;", "(Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;Ljava/util/Map;Ljava/lang/String;)Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;", "c", "()Lru/cyberity/cbr/camera/d$b;", "onPrepare", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;Ljava/lang/String;)Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;", "h", "()V", "i", "Ljava/io/File;", "file", "(Ljava/io/File;)V", "g", "Lru/cyberity/cbr/core/data/model/DocumentType;", "f", "()Lru/cyberity/cbr/core/data/model/DocumentType;", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lru/cyberity/cbr/core/data/source/common/a;", "()Lru/cyberity/cbr/core/data/source/common/a;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "Landroid/util/Size;", "e", "Landroid/util/Size;", "()Landroid/util/Size;", "imageAnalysisFrameSize", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "value", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "()Lru/cyberity/cbr/core/data/model/IdentitySide;", "(Lru/cyberity/cbr/core/data/model/IdentitySide;)V", "currentSide", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class d extends CBRViewModel<b> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final DocumentType type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final String identityType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final Size imageAnalysisFrameSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private IdentitySide currentSide;

    /* compiled from: CBRCameraViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/camera/d$a;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "<init>", "()V", "a", "Lru/cyberity/cbr/camera/d$a$a;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class a implements CBRViewModel.CBRViewModelEvent {

        /* compiled from: CBRCameraViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/camera/d$a$a;", "Lru/cyberity/cbr/camera/d$a;", "", "filePrefix", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.camera.d$a$a, reason: collision with other inner class name */
        public static final /* data */ class C12417a extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @k
            private final String filePrefix;

            public C12417a(@k String str) {
                super(null);
                this.filePrefix = str;
            }

            @k
            /* renamed from: b, reason: from getter */
            public final String getFilePrefix() {
                return this.filePrefix;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C12417a) && L.f(this.filePrefix, ((C12417a) other).filePrefix);
            }

            public int hashCode() {
                return this.filePrefix.hashCode();
            }

            @k
            public String toString() {
                return C22026a.c(new StringBuilder("TakePicture(filePrefix="), this.filePrefix, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: CBRCameraViewModel.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/cyberity/cbr/camera/d$b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "", "showCamera", "enableTakePicture", "showTakePicture", "flash", "Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;", "helperState", "<init>", "(ZZZZLru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;)V", "a", "(ZZZZLru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;)Lru/cyberity/cbr/camera/d$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "i", "()Z", "b", "f", "c", "j", "d", "g", "e", "Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;", "h", "()Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class b implements CBRViewModel.CBRViewModelState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean showCamera;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean enableTakePicture;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean showTakePicture;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean flash;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @l
        private final CBRHelperViewState helperState;

        public b() {
            this(false, false, false, false, null, 31, null);
        }

        public static /* synthetic */ b a(b bVar, boolean z12, boolean z13, boolean z14, boolean z15, CBRHelperViewState cBRHelperViewState, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = bVar.showCamera;
            }
            if ((i12 & 2) != 0) {
                z13 = bVar.enableTakePicture;
            }
            boolean z16 = z13;
            if ((i12 & 4) != 0) {
                z14 = bVar.showTakePicture;
            }
            boolean z17 = z14;
            if ((i12 & 8) != 0) {
                z15 = bVar.flash;
            }
            boolean z18 = z15;
            if ((i12 & 16) != 0) {
                cBRHelperViewState = bVar.helperState;
            }
            return bVar.a(z12, z16, z17, z18, cBRHelperViewState);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.showCamera == bVar.showCamera && this.enableTakePicture == bVar.enableTakePicture && this.showTakePicture == bVar.showTakePicture && this.flash == bVar.flash && L.f(this.helperState, bVar.helperState);
        }

        /* renamed from: f, reason: from getter */
        public final boolean getEnableTakePicture() {
            return this.enableTakePicture;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getFlash() {
            return this.flash;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final CBRHelperViewState getHelperState() {
            return this.helperState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
        public int hashCode() {
            boolean z12 = this.showCamera;
            ?? r02 = z12;
            if (z12) {
                r02 = 1;
            }
            int i12 = r02 * 31;
            ?? r22 = this.enableTakePicture;
            int i13 = r22;
            if (r22 != 0) {
                i13 = 1;
            }
            int i14 = (i12 + i13) * 31;
            ?? r23 = this.showTakePicture;
            int i15 = r23;
            if (r23 != 0) {
                i15 = 1;
            }
            int i16 = (i14 + i15) * 31;
            boolean z13 = this.flash;
            int i17 = (i16 + (z13 ? 1 : z13 ? 1 : 0)) * 31;
            CBRHelperViewState cBRHelperViewState = this.helperState;
            return i17 + (cBRHelperViewState == null ? 0 : cBRHelperViewState.hashCode());
        }

        /* renamed from: i, reason: from getter */
        public final boolean getShowCamera() {
            return this.showCamera;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getShowTakePicture() {
            return this.showTakePicture;
        }

        @k
        public String toString() {
            return "ViewState(showCamera=" + this.showCamera + ", enableTakePicture=" + this.enableTakePicture + ", showTakePicture=" + this.showTakePicture + ", flash=" + this.flash + ", helperState=" + this.helperState + ')';
        }

        public b(boolean z12, boolean z13, boolean z14, boolean z15, @l CBRHelperViewState cBRHelperViewState) {
            this.showCamera = z12;
            this.enableTakePicture = z13;
            this.showTakePicture = z14;
            this.flash = z15;
            this.helperState = cBRHelperViewState;
        }

        @k
        public final b a(boolean showCamera, boolean enableTakePicture, boolean showTakePicture, boolean flash, @l CBRHelperViewState helperState) {
            return new b(showCamera, enableTakePicture, showTakePicture, flash, helperState);
        }

        public /* synthetic */ b(boolean z12, boolean z13, boolean z14, boolean z15, CBRHelperViewState cBRHelperViewState, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? true : z13, (i12 & 4) == 0 ? z14 : true, (i12 & 8) != 0 ? false : z15, (i12 & 16) != 0 ? null : cBRHelperViewState);
        }
    }

    /* compiled from: CBRCameraViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraViewModel$currentSide$1", f = "CBRCameraViewModel.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432040a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return d.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432040a;
            if (i12 == 0) {
                C42729a0.b(obj);
                d dVar = d.this;
                this.f432040a = 1;
                if (dVar.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRCameraViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraViewModel$onCameraPermissionDenied$1", f = "CBRCameraViewModel.kt", i = {}, l = {153, 154, 155}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.camera.d$d, reason: collision with other inner class name */
    public static final class C12418d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f432042a;

        /* renamed from: b, reason: collision with root package name */
        Object f432043b;

        /* renamed from: c, reason: collision with root package name */
        Object f432044c;

        /* renamed from: d, reason: collision with root package name */
        int f432045d;

        /* renamed from: e, reason: collision with root package name */
        int f432046e;

        public C12418d(Continuation<? super C12418d> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((C12418d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return d.this.new C12418d(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f432046e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L47
                if (r1 == r4) goto L3d
                if (r1 == r3) goto L2f
                if (r1 != r2) goto L27
                int r0 = r9.f432045d
                java.lang.Object r1 = r9.f432044c
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r2 = r9.f432043b
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.Object r3 = r9.f432042a
                ru.cyberity.cbr.camera.d r3 = (ru.cyberity.cbr.camera.d) r3
                kotlin.C42729a0.b(r10)
                r7 = r3
                r3 = r1
                r1 = r0
                goto L93
            L27:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2f:
                int r1 = r9.f432045d
                java.lang.Object r3 = r9.f432043b
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.Object r4 = r9.f432042a
                ru.cyberity.cbr.camera.d r4 = (ru.cyberity.cbr.camera.d) r4
                kotlin.C42729a0.b(r10)
                goto L77
            L3d:
                int r1 = r9.f432045d
                java.lang.Object r4 = r9.f432042a
                ru.cyberity.cbr.camera.d r4 = (ru.cyberity.cbr.camera.d) r4
                kotlin.C42729a0.b(r10)
                goto L5f
            L47:
                kotlin.C42729a0.b(r10)
                ru.cyberity.cbr.camera.d r10 = ru.cyberity.cbr.camera.d.this
                r9.f432042a = r10
                r1 = 0
                r9.f432045d = r1
                r9.f432046e = r4
                java.lang.String r4 = "sns_alert_lackOfCameraPermissions"
                java.lang.Object r4 = ru.cyberity.cbr.camera.d.a(r10, r4, r9)
                if (r4 != r0) goto L5c
                return r0
            L5c:
                r8 = r4
                r4 = r10
                r10 = r8
            L5f:
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                ru.cyberity.cbr.camera.d r5 = ru.cyberity.cbr.camera.d.this
                r9.f432042a = r4
                r9.f432043b = r10
                r9.f432045d = r1
                r9.f432046e = r3
                java.lang.String r3 = "sns_alert_action_settings"
                java.lang.Object r3 = ru.cyberity.cbr.camera.d.a(r5, r3, r9)
                if (r3 != r0) goto L74
                return r0
            L74:
                r8 = r3
                r3 = r10
                r10 = r8
            L77:
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                ru.cyberity.cbr.camera.d r5 = ru.cyberity.cbr.camera.d.this
                r9.f432042a = r4
                r9.f432043b = r3
                r9.f432044c = r10
                r9.f432045d = r1
                r9.f432046e = r2
                java.lang.String r2 = "sns_alert_action_cancel"
                java.lang.Object r2 = ru.cyberity.cbr.camera.d.a(r5, r2, r9)
                if (r2 != r0) goto L8e
                return r0
            L8e:
                r7 = r4
                r8 = r3
                r3 = r10
                r10 = r2
                r2 = r8
            L93:
                r4 = r10
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                ru.cyberity.cbr.core.presentation.base.CBRViewModel$ShowPermissionDialog r10 = new ru.cyberity.cbr.core.presentation.base.CBRViewModel$ShowPermissionDialog
                r5 = 1
                r6 = 0
                r0 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                ru.cyberity.cbr.camera.d.a(r7, r10)
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.d.C12418d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRCameraViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/d$b;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraViewModel$onPictureTaken$1", f = "CBRCameraViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<b, Continuation<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432048a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432049b;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k b bVar, @l Continuation<? super b> continuation) {
            return ((e) create(bVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            e eVar = new e(continuation);
            eVar.f432049b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432048a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return b.a((b) this.f432049b, false, false, false, false, null, 29, null);
        }
    }

    /* compiled from: CBRCameraViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraViewModel", f = "CBRCameraViewModel.kt", i = {0}, l = {55, 59}, m = "onPrepare$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432050a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432051b;

        /* renamed from: d, reason: collision with root package name */
        int f432053d;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f432051b = obj;
            this.f432053d |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.b(d.this, this);
        }
    }

    /* compiled from: CBRCameraViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/d$b;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraViewModel$onTakePictureClicked$1", f = "CBRCameraViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<b, Continuation<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432054a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432055b;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k b bVar, @l Continuation<? super b> continuation) {
            return ((g) create(bVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            g gVar = new g(continuation);
            gVar.f432055b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432054a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return b.a((b) this.f432055b, false, false, false, false, null, 29, null);
        }
    }

    /* compiled from: CBRCameraViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/d$b;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraViewModel$onToggleFlashClicked$1", f = "CBRCameraViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements p<b, Continuation<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432056a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432057b;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k b bVar, @l Continuation<? super b> continuation) {
            return ((h) create(bVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            h hVar = new h(continuation);
            hVar.f432057b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432056a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return b.a((b) this.f432057b, false, false, false, !r0.getFlash(), null, 23, null);
        }
    }

    /* compiled from: CBRCameraViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraViewModel", f = "CBRCameraViewModel.kt", i = {0}, l = {64}, m = "updateInstructions", n = {"this"}, s = {"L$0"})
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432058a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432059b;

        /* renamed from: d, reason: collision with root package name */
        int f432061d;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f432059b = obj;
            this.f432061d |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.a(this);
        }
    }

    /* compiled from: CBRCameraViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/d$b;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraViewModel$updateInstructions$3", f = "CBRCameraViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements p<b, Continuation<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432062a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432063b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f432065d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f432066e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.core.data.model.g f432067f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, ru.cyberity.cbr.core.data.model.g gVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f432065d = str;
            this.f432066e = str2;
            this.f432067f = gVar;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k b bVar, @l Continuation<? super b> continuation) {
            return ((j) create(bVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            j jVar = d.this.new j(this.f432065d, this.f432066e, this.f432067f, continuation);
            jVar.f432063b = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432062a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            b bVar = (b) this.f432063b;
            ru.cyberity.cbr.core.data.model.e config = d.this.getConfig();
            if (config != null) {
                zA = ru.cyberity.cbr.core.data.model.f.a(config, this.f432065d, d.this.getCurrentSide() == IdentitySide.Back);
            }
            c.C12476c strings = d.this.getStrings();
            ru.cyberity.cbr.core.data.model.e config2 = d.this.getConfig();
            CBRInstructionResources cBRInstructionResources = new CBRInstructionResources(strings, config2 != null ? config2.C() : null, this.f432065d, d.this.getIdentityType(), this.f432066e, false, 32, null);
            CBRStepInfo cBRStepInfo = new CBRStepInfo(this.f432065d, this.f432066e, d.this.getIdentityType());
            String selectedCountry = d.this.getCommonRepository().getSelectedCountry();
            if (selectedCountry == null) {
                selectedCountry = this.f432067f.u();
            }
            return b.a(bVar, false, false, false, false, (zA && cBRInstructionResources.hasResources()) ? d.this.a(cBRStepInfo, (Map<String, ? extends Object>) cBRInstructionResources.getInstructions(), selectedCountry) : d.this.a(this.f432067f, cBRStepInfo, selectedCountry), 15, null);
        }
    }

    public d(@k DocumentType documentType, @l String str, @k ru.cyberity.cbr.core.data.source.common.a aVar, @k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(aVar, cVar);
        this.type = documentType;
        this.identityType = str;
        this.commonRepository = aVar;
        this.dataRepository = cVar;
        this.imageAnalysisFrameSize = new Size(1920, 1080);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b getDefaultState() {
        return new b(false, false, false, false, null, 31, null);
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getIdentityType() {
        return this.identityType;
    }

    @k
    /* renamed from: e, reason: from getter */
    public Size getImageAnalysisFrameSize() {
        return this.imageAnalysisFrameSize;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final DocumentType getType() {
        return this.type;
    }

    public final void g() {
        C43259k.d(N0.a(this), null, null, new C12418d(null), 3);
    }

    public void h() {
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "On take picture is clicked", null, 4, null);
        fireEvent(new a.C12417a("manual_"));
        CBRViewModel.updateState$default(this, false, new g(null), 1, null);
    }

    public final void i() {
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "On Toggle Flash is clicked", null, 4, null);
        CBRViewModel.updateState$default(this, false, new h(null), 1, null);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @l
    public Object onPrepare(@k Continuation<? super G0> continuation) {
        return b(this, continuation);
    }

    @l
    /* renamed from: b, reason: from getter */
    public final IdentitySide getCurrentSide() {
        return this.currentSide;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object b(ru.cyberity.cbr.camera.d r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof ru.cyberity.cbr.camera.d.f
            if (r0 == 0) goto L13
            r0 = r11
            ru.cyberity.cbr.camera.d$f r0 = (ru.cyberity.cbr.camera.d.f) r0
            int r1 = r0.f432053d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432053d = r1
            goto L18
        L13:
            ru.cyberity.cbr.camera.d$f r0 = new ru.cyberity.cbr.camera.d$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f432051b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f432053d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r11)
            goto L7f
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            java.lang.Object r10 = r0.f432050a
            ru.cyberity.cbr.camera.d r10 = (ru.cyberity.cbr.camera.d) r10
            kotlin.C42729a0.b(r11)
            goto L4a
        L3c:
            kotlin.C42729a0.b(r11)
            r0.f432050a = r10
            r0.f432053d = r4
            java.lang.Object r11 = super.onPrepare(r0)
            if (r11 != r1) goto L4a
            return r1
        L4a:
            ru.cyberity.log.a r4 = ru.cyberity.log.a.f436064a
            java.lang.String r5 = ru.cyberity.log.c.a(r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "Camera is started. Side - "
            r11.<init>(r2)
            ru.cyberity.cbr.core.data.model.IdentitySide r2 = r10.currentSide
            r11.append(r2)
            java.lang.String r6 = r11.toString()
            r8 = 4
            r9 = 0
            r7 = 0
            ru.cyberity.log.logger.Logger.i$default(r4, r5, r6, r7, r8, r9)
            ru.cyberity.cbr.core.analytics.b r11 = ru.cyberity.cbr.core.analytics.b.f432519a
            ru.cyberity.cbr.core.analytics.GlobalStatePayload r2 = ru.cyberity.cbr.core.analytics.GlobalStatePayload.IdDocType
            ru.cyberity.cbr.core.data.model.DocumentType r4 = r10.type
            java.lang.String r4 = r4.getValue()
            r11.a(r2, r4)
            r11 = 0
            r0.f432050a = r11
            r0.f432053d = r3
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L7f
            return r1
        L7f:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.d.b(ru.cyberity.cbr.camera.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @k
    /* renamed from: a, reason: from getter */
    public final ru.cyberity.cbr.core.data.source.common.a getCommonRepository() {
        return this.commonRepository;
    }

    public final void a(@l IdentitySide identitySide) {
        boolean z12 = this.currentSide != identitySide;
        this.currentSide = identitySide;
        if (z12) {
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "setting current side to " + identitySide, null, 4, null);
            C43259k.d(N0.a(this), null, null, new c(null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.G0> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof ru.cyberity.cbr.camera.d.i
            if (r0 == 0) goto L14
            r0 = r15
            ru.cyberity.cbr.camera.d$i r0 = (ru.cyberity.cbr.camera.d.i) r0
            int r1 = r0.f432061d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f432061d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            ru.cyberity.cbr.camera.d$i r0 = new ru.cyberity.cbr.camera.d$i
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r4.f432059b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f432061d
            r7 = 1
            if (r1 == 0) goto L38
            if (r1 != r7) goto L30
            java.lang.Object r0 = r4.f432058a
            ru.cyberity.cbr.camera.d r0 = (ru.cyberity.cbr.camera.d) r0
            kotlin.C42729a0.b(r15)
            r6 = r0
            goto L5e
        L30:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L38:
            kotlin.C42729a0.b(r15)
            ru.cyberity.cbr.core.data.model.IdentitySide r15 = r14.currentSide
            if (r15 == 0) goto L4c
            java.lang.String r15 = r15.getValue()
            if (r15 == 0) goto L4c
            ru.cyberity.cbr.core.analytics.b r1 = ru.cyberity.cbr.core.analytics.b.f432519a
            ru.cyberity.cbr.core.analytics.GlobalStatePayload r2 = ru.cyberity.cbr.core.analytics.GlobalStatePayload.IdDocSubType
            r1.a(r2, r15)
        L4c:
            ru.cyberity.cbr.core.data.source.dynamic.c r1 = r14.dataRepository
            r4.f432058a = r14
            r4.f432061d = r7
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            java.lang.Object r15 = ru.cyberity.cbr.core.data.source.dynamic.c.c(r1, r2, r3, r4, r5, r6)
            if (r15 != r0) goto L5d
            return r0
        L5d:
            r6 = r14
        L5e:
            ru.cyberity.cbr.core.data.source.dynamic.a r15 = (ru.cyberity.cbr.core.data.source.dynamic.a) r15
            java.lang.Object r15 = r15.d()
            r4 = r15
            ru.cyberity.cbr.core.data.model.g r4 = (ru.cyberity.cbr.core.data.model.g) r4
            if (r4 != 0) goto L7a
            ru.cyberity.cbr.camera.photo.presentation.document.e r8 = ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a
            java.lang.String r9 = ru.cyberity.log.c.a(r6)
            r12 = 4
            r13 = 0
            java.lang.String r10 = "updateInstructions: applicant null"
            r11 = 0
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(r8, r9, r10, r11, r12, r13)
            kotlin.G0 r15 = kotlin.G0.f406611a
            return r15
        L7a:
            ru.cyberity.cbr.core.data.model.DocumentType r15 = r6.type
            java.lang.String r2 = r15.getValue()
            ru.cyberity.cbr.core.data.model.DocumentType r15 = r6.type
            ru.cyberity.cbr.core.data.model.g$c$a r15 = r4.a(r15)
            if (r15 == 0) goto L96
            boolean r0 = r15.v()
            if (r0 != r7) goto L96
            ru.cyberity.cbr.core.presentation.intro.IntroScene r15 = ru.cyberity.cbr.core.presentation.intro.IntroScene.PHOTOSELFIE
            java.lang.String r15 = r15.getSceneName()
        L94:
            r3 = r15
            goto Lb9
        L96:
            if (r15 == 0) goto La5
            boolean r15 = r15.u()
            if (r15 != r7) goto La5
            ru.cyberity.cbr.core.presentation.intro.IntroScene r15 = ru.cyberity.cbr.core.presentation.intro.IntroScene.PORTRAIT_SELFIE
            java.lang.String r15 = r15.getSceneName()
            goto L94
        La5:
            ru.cyberity.cbr.core.data.model.IdentitySide r15 = r6.currentSide
            ru.cyberity.cbr.core.data.model.IdentitySide r0 = ru.cyberity.cbr.core.data.model.IdentitySide.Back
            if (r15 != r0) goto Lb2
            ru.cyberity.cbr.core.presentation.intro.IntroScene r15 = ru.cyberity.cbr.core.presentation.intro.IntroScene.SCAN_BACKSIDE
            java.lang.String r15 = r15.getSceneName()
            goto L94
        Lb2:
            ru.cyberity.cbr.core.presentation.intro.IntroScene r15 = ru.cyberity.cbr.core.presentation.intro.IntroScene.SCAN_FRONTSIDE
            java.lang.String r15 = r15.getSceneName()
            goto L94
        Lb9:
            ru.cyberity.cbr.camera.d$j r15 = new ru.cyberity.cbr.camera.d$j
            r5 = 0
            r0 = r15
            r1 = r6
            r0.<init>(r2, r3, r4, r5)
            r0 = 0
            r1 = 0
            ru.cyberity.cbr.core.presentation.base.CBRViewModel.updateState$default(r6, r0, r15, r7, r1)
            kotlin.G0 r15 = kotlin.G0.f406611a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.d.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CBRHelperViewState a(CBRStepInfo stepInfo, Map<String, ? extends Object> instructionsData, String countryCode) {
        return new CBRHelperViewState.Intro(stepInfo, instructionsData, countryCode);
    }

    @k
    public CBRHelperViewState a(@k ru.cyberity.cbr.core.data.model.g applicant, @k CBRStepInfo stepInfo, @l String countryCode) {
        List<r> listB;
        String value;
        String str = this.identityType;
        if (str != null) {
            listB = Collections.singletonList(r.INSTANCE.a(str));
        } else {
            listB = applicant.b(this.type);
        }
        List<r> list = listB;
        IdentitySide identitySide = this.currentSide;
        if (identitySide != null && (value = identitySide.getValue()) != null) {
            ru.cyberity.cbr.core.analytics.b.f432519a.a(GlobalStatePayload.IdDocSubType, value);
        }
        return CBRCameraHelperStateFactory.INSTANCE.prepareBriefDetails(getStrings(), this.type, applicant.a(this.type), stepInfo, countryCode, list, this.currentSide);
    }

    public void a(@l File file) {
        Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Picture is taken", null, 4, null);
        showProgress(true);
        CBRViewModel.updateState$default(this, false, new e(null), 1, null);
        CBRViewModel.finish$default(this, null, new o(file, file, null, null, this.currentSide, false, null, 108, null), null, 5, null);
    }
}

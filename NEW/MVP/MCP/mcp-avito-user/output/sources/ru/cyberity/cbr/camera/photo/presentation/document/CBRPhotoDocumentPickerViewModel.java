package ru.cyberity.cbr.camera.photo.presentation.document;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Size;
import androidx.compose.ui.platform.C22491k0;
import androidx.view.C23060r0;
import androidx.view.N0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import ru.cyberity.R;
import ru.cyberity.cbr.camera.d;
import ru.cyberity.cbr.camera.photo.presentation.document.CheckDetectionResult;
import ru.cyberity.cbr.camera.photo.presentation.document.DocCapture;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.IdentitySide;
import ru.cyberity.cbr.core.domain.camera.CameraX;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.ml.core.d;

/* compiled from: CBRPhotoDocumentPickerViewModel.kt */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u0096\u00012\u00020\u0001:\r\u0097\u0001,\u001e\u001cG\u0091\u0001\u0098\u0001\u0099\u0001$Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001e\u0010!J\u0013\u0010\"\u001a\u00020\u001bH\u0094@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010%J+\u0010\u001e\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010)J\u0015\u0010,\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001bH\u0014¢\u0006\u0004\b.\u0010%J\u0013\u0010\u001c\u001a\u00020/H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010#J3\u0010,\u001a\u00020\u001b2\b\u00101\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00104\u001a\u00020*2\u0006\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u00105J\u000f\u00107\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J1\u0010,\u001a\u0004\u0018\u0001062\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u0010&\u001a\u00020\u00102\u0006\u00104\u001a\u00020*H\u0002¢\u0006\u0004\b,\u00109J#\u0010,\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b,\u0010:J\u0017\u0010,\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b,\u0010!J/\u0010,\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010;\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b,\u0010<J'\u0010,\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010>J\u000f\u0010?\u001a\u00020\u001bH\u0002¢\u0006\u0004\b?\u0010%J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020*H\u0002¢\u0006\u0004\b\u001c\u0010-J\u0017\u0010,\u001a\u00020A2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b,\u0010BJ+\u0010,\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0082@ø\u0001\u0000¢\u0006\u0004\b,\u0010)J5\u0010,\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'2\b\u0010D\u001a\u0004\u0018\u00010CH\u0082@ø\u0001\u0000¢\u0006\u0004\b,\u0010EJ#\u0010,\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\b,\u0010FJ\u0013\u0010G\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\bG\u0010#J#\u0010,\u001a\u00020\u001b2\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010HH\u0082@ø\u0001\u0000¢\u0006\u0004\b,\u0010JJ\u000f\u0010K\u001a\u00020\u001bH\u0002¢\u0006\u0004\bK\u0010%J\u0013\u0010\u001e\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010#J\u001f\u0010,\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b,\u0010LJ\u001d\u0010,\u001a\u0004\u0018\u00010C2\u0006\u0010M\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b,\u0010NJ/\u0010,\u001a\u0002002\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020O2\u0006\u0010(\u001a\u00020'2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b,\u0010RR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R7\u0010f\u001a\b\u0012\u0004\u0012\u00020_0\u00062\f\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\b,\u0010eR\u0016\u0010i\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001b\u0010m\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010k\u001a\u0004\ba\u0010lR\u001b\u0010q\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010k\u001a\u0004\b]\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010u\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010hR\u0016\u0010v\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010hR\u0016\u0010w\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010hR\u0016\u0010y\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010hR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020/0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010{R\u0016\u0010~\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010hR$\u0010\u0081\u0001\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b\u007f\u0010h\u001a\u0005\br\u0010\u0080\u0001\"\u0004\b\u001e\u0010-R\u001a\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0087\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010hR\u0018\u0010\u0089\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010hR\u0014\u0010\u008c\u0001\u001a\u00030\u008a\u00018F¢\u0006\u0007\u001a\u0005\bg\u0010\u008b\u0001R\u001d\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020/0\u008d\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bo\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0094\u0001\u001a\u00020*8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b[\u0010\u0080\u0001R\u0016\u0010\u0095\u0001\u001a\u00020*8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bx\u0010\u0080\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u009a\u0001"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel;", "Lru/cyberity/cbr/camera/c;", "Lru/cyberity/cbr/core/data/model/DocumentType;", "type", "", "identityType", "", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "sides", "Lru/cyberity/cbr/camera/photo/presentation/document/DocCapture$PreferredMode;", "preferredMode", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/ml/core/d;", "Landroid/graphics/Bitmap;", "Lru/cyberity/ml/badphotos/models/a;", "badPhotoDetector", "Lru/cyberity/ml/docdetector/b;", "docDetector", "Landroidx/lifecycle/r0;", "savedStateHandle", "<init>", "(Lru/cyberity/cbr/core/data/model/DocumentType;Ljava/lang/String;Ljava/util/List;Lru/cyberity/cbr/camera/photo/presentation/document/DocCapture$PreferredMode;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;Lru/cyberity/ml/core/d;Lru/cyberity/ml/docdetector/b;Landroidx/lifecycle/r0;)V", "Ljava/io/File;", "file", "Lkotlin/G0;", "c", "(Ljava/io/File;)V", "b", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "()V", "frameBitmap", "Landroid/graphics/Rect;", "photoFrameRect", "(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "enabled", "a", "(Z)V", "onCleared", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b;", "Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult;", "checkResult", "Lru/cyberity/ml/docdetector/a;", "detectionResult", "saveFrame", "(Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult;Lru/cyberity/ml/docdetector/a;ZLandroid/graphics/Bitmap;)V", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "t", "()Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "(Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult;Lru/cyberity/ml/docdetector/a;Landroid/graphics/Bitmap;Z)Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "(Landroid/content/Context;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rect", "(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "nameSuffix", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "w", "showSwitch", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint;", "(Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult;)Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint;", "Lru/cyberity/ml/badphotos/models/b;", "photoQualityResult", "(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lru/cyberity/ml/badphotos/models/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/io/File;Lru/cyberity/ml/badphotos/models/b;)V", "d", "Lkotlin/Function0;", "callback", "(LY41/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)Landroid/graphics/Bitmap;", "bitmap", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "scaleX", "scaleY", "(FFLandroid/graphics/Rect;Lru/cyberity/ml/docdetector/a;)Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult;", "i", "Ljava/util/List;", "j", "Lru/cyberity/cbr/camera/photo/presentation/document/DocCapture$PreferredMode;", "s", "()Lru/cyberity/cbr/camera/photo/presentation/document/DocCapture$PreferredMode;", "k", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "l", "Lru/cyberity/ml/core/d;", "m", "Lru/cyberity/ml/docdetector/b;", "Lru/cyberity/cbr/core/data/model/o;", "<set-?>", "n", "Lru/cyberity/cbr/core/presentation/screen/base/a;", "p", "()Ljava/util/List;", "(Ljava/util/List;)V", "collectedResults", "o", "Z", "showDocFlipOnReady", "Lru/cyberity/cbr/camera/photo/presentation/document/a;", "Lkotlin/C;", "()Lru/cyberity/cbr/camera/photo/presentation/document/a;", "autoCaptureResultProcessor", "Lru/cyberity/ml/autocapture/a;", "q", "()Lru/cyberity/ml/autocapture/a;", "autoCaptureFeature", "r", "Ljava/io/File;", "videoCaptureFile", "isWaitingForVideo", "isCapturingVideo", "isAutoCapture", "v", "autoCaptureAllowed", "Lkotlinx/coroutines/flow/Z1;", "Lkotlinx/coroutines/flow/Z1;", "_documentCaptureState", "x", "isTakePictureRequested", "y", "()Z", "frameSaveRequested", "", "z", "J", "startedHoldingCameraAt", "A", "isDelayingSideCapture", "B", "capturingDocument", "Lru/cyberity/cbr/core/domain/camera/CameraX$Mode;", "()Lru/cyberity/cbr/core/domain/camera/CameraX$Mode;", "cameraMode", "Lkotlinx/coroutines/flow/n2;", "()Lkotlinx/coroutines/flow/n2;", "documentCaptureState", "Landroid/util/Size;", "e", "()Landroid/util/Size;", "imageAnalysisFrameSize", "autoCaptureEnabled", "isSeamlessDocaptureEnabled", "C", "AutoCaptureHint", "f", "g", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRPhotoDocumentPickerViewModel extends ru.cyberity.cbr.camera.c {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private boolean isDelayingSideCapture;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean capturingDocument;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final List<IdentitySide> sides;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final DocCapture.PreferredMode preferredMode;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.ml.core.d<Bitmap, ru.cyberity.ml.badphotos.models.a> badPhotoDetector;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.ml.docdetector.b docDetector;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a collectedResults;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean showDocFlipOnReady;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C autoCaptureResultProcessor;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C autoCaptureFeature;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private File videoCaptureFile;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isWaitingForVideo;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isCapturingVideo;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean isAutoCapture;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean autoCaptureAllowed;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Z1<b> _documentCaptureState;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean isTakePictureRequested;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean frameSaveRequested;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private long startedHoldingCameraAt;

    /* renamed from: D, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f432184D = {m0.f406844a.e(new Y(CBRPhotoDocumentPickerViewModel.class, "collectedResults", "getCollectedResults()Ljava/util/List;", 0))};

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint;", "", "", "hint", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State;", VoiceInfo.STATE, "<init>", "(Ljava/lang/String;Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State;", "d", "()Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State;", "State", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class AutoCaptureHint {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final String hint;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final State state;

        /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State;", "", "(Ljava/lang/String;I)V", "DEFAULT", "INVALID", "INTERMEDIATE", "OK", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum State {
            DEFAULT,
            INVALID,
            INTERMEDIATE,
            OK
        }

        public AutoCaptureHint(@Y61.k String str, @Y61.k State state) {
            this.hint = str;
            this.state = state;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoCaptureHint)) {
                return false;
            }
            AutoCaptureHint autoCaptureHint = (AutoCaptureHint) other;
            return L.f(this.hint, autoCaptureHint.hint) && this.state == autoCaptureHint.state;
        }

        public int hashCode() {
            return this.state.hashCode() + (this.hint.hashCode() * 31);
        }

        @Y61.k
        public String toString() {
            return "AutoCaptureHint(hint=" + this.hint + ", state=" + this.state + ')';
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/d$b;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$onTakePictureClicked$1", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a0 extends SuspendLambda implements Y41.p<d.b, Continuation<? super d.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432208a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432209b;

        public a0(Continuation<? super a0> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d.b bVar, @Y61.l Continuation<? super d.b> continuation) {
            return ((a0) create(bVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a0 a0Var = new a0(continuation);
            a0Var.f432209b = obj;
            return a0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432208a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return d.b.a((d.b) this.f432209b, false, false, false, false, null, 29, null);
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\fB/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$h;", "videoCapture", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b$a;", "switch", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint;", "autoCaptureHint", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$c;", "frameHint", "<init>", "(Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$h;Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b$a;Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint;Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$c;)V", "a", "(Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$h;Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b$a;Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint;Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$c;)Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$h;", "h", "()Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$h;", "b", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b$a;", "g", "()Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b$a;", "c", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint;", "e", "()Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint;", "d", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$c;", "f", "()Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$c;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class b implements CBRViewModel.CBRViewModelState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final h videoCapture;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final a switch;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final AutoCaptureHint autoCaptureHint;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final c frameHint;

        /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ@\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006 "}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b$a;", "", "", "auto", "", "autoText", "manualText", "visible", "<init>", "(Ljava/lang/Boolean;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Boolean;)V", "a", "(Ljava/lang/Boolean;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Boolean;)Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "b", "Ljava/lang/CharSequence;", "f", "()Ljava/lang/CharSequence;", "c", "g", "d", "h", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final Boolean auto;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence autoText;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence manualText;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final Boolean visible;

            public a(@Y61.l Boolean bool, @Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l Boolean bool2) {
                this.auto = bool;
                this.autoText = charSequence;
                this.manualText = charSequence2;
                this.visible = bool2;
            }

            @Y61.k
            public final a a(@Y61.l Boolean auto, @Y61.l CharSequence autoText, @Y61.l CharSequence manualText, @Y61.l Boolean visible) {
                return new a(auto, autoText, manualText, visible);
            }

            @Y61.l
            /* renamed from: e, reason: from getter */
            public final Boolean getAuto() {
                return this.auto;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return L.f(this.auto, aVar.auto) && L.f(this.autoText, aVar.autoText) && L.f(this.manualText, aVar.manualText) && L.f(this.visible, aVar.visible);
            }

            @Y61.l
            /* renamed from: f, reason: from getter */
            public final CharSequence getAutoText() {
                return this.autoText;
            }

            @Y61.l
            /* renamed from: g, reason: from getter */
            public final CharSequence getManualText() {
                return this.manualText;
            }

            @Y61.l
            /* renamed from: h, reason: from getter */
            public final Boolean getVisible() {
                return this.visible;
            }

            public int hashCode() {
                Boolean bool = this.auto;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                CharSequence charSequence = this.autoText;
                int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
                CharSequence charSequence2 = this.manualText;
                int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                Boolean bool2 = this.visible;
                return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("AutoManualSwitch(auto=");
                sb2.append(this.auto);
                sb2.append(", autoText=");
                sb2.append((Object) this.autoText);
                sb2.append(", manualText=");
                sb2.append((Object) this.manualText);
                sb2.append(", visible=");
                return C0.g(sb2, this.visible, ')');
            }

            public static /* synthetic */ a a(a aVar, Boolean bool, CharSequence charSequence, CharSequence charSequence2, Boolean bool2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    bool = aVar.auto;
                }
                if ((i12 & 2) != 0) {
                    charSequence = aVar.autoText;
                }
                if ((i12 & 4) != 0) {
                    charSequence2 = aVar.manualText;
                }
                if ((i12 & 8) != 0) {
                    bool2 = aVar.visible;
                }
                return aVar.a(bool, charSequence, charSequence2, bool2);
            }
        }

        public b(@Y61.l h hVar, @Y61.k a aVar, @Y61.l AutoCaptureHint autoCaptureHint, @Y61.l c cVar) {
            this.videoCapture = hVar;
            this.switch = aVar;
            this.autoCaptureHint = autoCaptureHint;
            this.frameHint = cVar;
        }

        public static /* synthetic */ b a(b bVar, h hVar, a aVar, AutoCaptureHint autoCaptureHint, c cVar, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                hVar = bVar.videoCapture;
            }
            if ((i12 & 2) != 0) {
                aVar = bVar.switch;
            }
            if ((i12 & 4) != 0) {
                autoCaptureHint = bVar.autoCaptureHint;
            }
            if ((i12 & 8) != 0) {
                cVar = bVar.frameHint;
            }
            return bVar.a(hVar, aVar, autoCaptureHint, cVar);
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final AutoCaptureHint getAutoCaptureHint() {
            return this.autoCaptureHint;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return L.f(this.videoCapture, bVar.videoCapture) && L.f(this.switch, bVar.switch) && L.f(this.autoCaptureHint, bVar.autoCaptureHint) && L.f(this.frameHint, bVar.frameHint);
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final c getFrameHint() {
            return this.frameHint;
        }

        @Y61.k
        /* renamed from: g, reason: from getter */
        public final a getSwitch() {
            return this.switch;
        }

        @Y61.l
        /* renamed from: h, reason: from getter */
        public final h getVideoCapture() {
            return this.videoCapture;
        }

        public int hashCode() {
            h hVar = this.videoCapture;
            int iHashCode = (this.switch.hashCode() + ((hVar == null ? 0 : hVar.hashCode()) * 31)) * 31;
            AutoCaptureHint autoCaptureHint = this.autoCaptureHint;
            int iHashCode2 = (iHashCode + (autoCaptureHint == null ? 0 : autoCaptureHint.hashCode())) * 31;
            c cVar = this.frameHint;
            return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            return "DocumentCaptureViewState(videoCapture=" + this.videoCapture + ", switch=" + this.switch + ", autoCaptureHint=" + this.autoCaptureHint + ", frameHint=" + this.frameHint + ')';
        }

        @Y61.k
        public final b a(@Y61.l h videoCapture, @Y61.k a aVar, @Y61.l AutoCaptureHint autoCaptureHint, @Y61.l c frameHint) {
            return new b(videoCapture, aVar, autoCaptureHint, frameHint);
        }

        public /* synthetic */ b(h hVar, a aVar, AutoCaptureHint autoCaptureHint, c cVar, int i12, C42822w c42822w) {
            this(hVar, aVar, autoCaptureHint, (i12 & 8) != 0 ? null : cVar);
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$onVideoRecorded$2", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
    public static final class b0 extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432218a;

        public b0(Continuation<? super b0> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((b0) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRPhotoDocumentPickerViewModel.this.new b0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432218a;
            if (i12 == 0) {
                C42729a0.b(obj);
                CBRPhotoDocumentPickerViewModel cBRPhotoDocumentPickerViewModel = CBRPhotoDocumentPickerViewModel.this;
                this.f432218a = 1;
                if (cBRPhotoDocumentPickerViewModel.b(this) == coroutine_suspended) {
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

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$c;", "", "", "icon", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/lang/CharSequence;", "d", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final String icon;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence text;

        public c(@Y61.k String str, @Y61.l CharSequence charSequence) {
            this.icon = str;
            this.text = charSequence;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final CharSequence getText() {
            return this.text;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return L.f(this.icon, cVar.icon) && L.f(this.text, cVar.text);
        }

        public int hashCode() {
            int iHashCode = this.icon.hashCode() * 31;
            CharSequence charSequence = this.text;
            return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FrameHint(icon=");
            sb2.append(this.icon);
            sb2.append(", text=");
            return AK.c.r(sb2, this.text, ')');
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 7, 1})
    public static final class c0 extends N implements Y41.a<G0> {

        /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/d$b;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$requestDocumentFlip$2$1", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<d.b, Continuation<? super d.b>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f432223a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f432224b;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k d.b bVar, @Y61.l Continuation<? super d.b> continuation) {
                return ((a) create(bVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.f432224b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f432223a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return d.b.a((d.b) this.f432224b, false, true, true, false, null, 25, null);
            }
        }

        public c0() {
            super(0);
        }

        public final void a() {
            CBRPhotoDocumentPickerViewModel.this.u();
            int size = CBRPhotoDocumentPickerViewModel.this.p().size();
            CBRPhotoDocumentPickerViewModel cBRPhotoDocumentPickerViewModel = CBRPhotoDocumentPickerViewModel.this;
            cBRPhotoDocumentPickerViewModel.a((IdentitySide) cBRPhotoDocumentPickerViewModel.sides.get(size));
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "requestDocumentNextSide: " + CBRPhotoDocumentPickerViewModel.this.getCurrentSide(), null, 4, null);
            if (CBRPhotoDocumentPickerViewModel.this.isAutoCapture) {
                return;
            }
            CBRViewModel.updateState$default(CBRPhotoDocumentPickerViewModel.this, false, new a(null), 1, null);
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$d;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class d implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f432225a = new d();

        private d() {
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel", f = "CBRPhotoDocumentPickerViewModel.kt", i = {0, 0}, l = {723}, m = "showDocumentFlipHint", n = {"this", "callback"}, s = {"L$0", "L$1"})
    public static final class d0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432226a;

        /* renamed from: b, reason: collision with root package name */
        Object f432227b;

        /* renamed from: c, reason: collision with root package name */
        Object f432228c;

        /* renamed from: d, reason: collision with root package name */
        Object f432229d;

        /* renamed from: e, reason: collision with root package name */
        Object f432230e;

        /* renamed from: f, reason: collision with root package name */
        Object f432231f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f432232g;

        /* renamed from: i, reason: collision with root package name */
        int f432234i;

        public d0(Continuation<? super d0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432232g = obj;
            this.f432234i |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPhotoDocumentPickerViewModel.this.a((Y41.a<G0>) null, this);
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$e;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class e implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f432235a = new e();

        private e() {
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$showDocumentFlipHint$3", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {739}, m = "invokeSuspend", n = {}, s = {})
    public static final class e0 extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432236a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y41.a<G0> f432237b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CBRPhotoDocumentPickerViewModel f432238c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(Y41.a<G0> aVar, CBRPhotoDocumentPickerViewModel cBRPhotoDocumentPickerViewModel, Continuation<? super e0> continuation) {
            super(2, continuation);
            this.f432237b = aVar;
            this.f432238c = cBRPhotoDocumentPickerViewModel;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((e0) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new e0(this.f432237b, this.f432238c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432236a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "waiting for doc flip ... ", null, 4, null);
                this.f432236a = 1;
                if (C43131e0.b(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            Y41.a<G0> aVar = this.f432237b;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f432238c.isDelayingSideCapture = false;
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$switchToAutoMode$1", f = "CBRPhotoDocumentPickerViewModel.kt", i = {0}, l = {528}, m = "invokeSuspend", n = {"it"}, s = {"L$1"})
    public static final class f0 extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f432245a;

        /* renamed from: b, reason: collision with root package name */
        Object f432246b;

        /* renamed from: c, reason: collision with root package name */
        Object f432247c;

        /* renamed from: d, reason: collision with root package name */
        int f432248d;

        /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/d$b;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$switchToAutoMode$1$1", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<d.b, Continuation<? super d.b>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f432250a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f432251b;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k d.b bVar, @Y61.l Continuation<? super d.b> continuation) {
                return ((a) create(bVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.f432251b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f432250a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return d.b.a((d.b) this.f432251b, false, false, false, false, null, 25, null);
            }
        }

        public f0(Continuation<? super f0> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((f0) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRPhotoDocumentPickerViewModel.this.new f0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            CBRPhotoDocumentPickerViewModel cBRPhotoDocumentPickerViewModel;
            b bVar;
            Z1 z12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432248d;
            if (i12 == 0) {
                C42729a0.b(obj);
                CBRPhotoDocumentPickerViewModel.this.isAutoCapture = true;
                CBRViewModel.updateState$default(CBRPhotoDocumentPickerViewModel.this, false, new a(null), 1, null);
                Z1 z13 = CBRPhotoDocumentPickerViewModel.this._documentCaptureState;
                Object value = CBRPhotoDocumentPickerViewModel.this._documentCaptureState.getValue();
                cBRPhotoDocumentPickerViewModel = CBRPhotoDocumentPickerViewModel.this;
                bVar = (b) value;
                this.f432245a = cBRPhotoDocumentPickerViewModel;
                this.f432246b = bVar;
                this.f432247c = z13;
                this.f432248d = 1;
                Object objC = cBRPhotoDocumentPickerViewModel.c(this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z12 = z13;
                obj = objC;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z12 = (Z1) this.f432247c;
                bVar = (b) this.f432246b;
                cBRPhotoDocumentPickerViewModel = (CBRPhotoDocumentPickerViewModel) this.f432245a;
                C42729a0.b(obj);
            }
            z12.setValue(b.a((b) obj, null, b.a.a(bVar.getSwitch(), Boxing.boxBoolean(true), null, null, Boxing.boxBoolean(true), 6, null), cBRPhotoDocumentPickerViewModel.a(CheckDetectionResult.INSTANCE.a()), null, 9, null));
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$g;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", "ok", "", "confidence", "", "timeMs", "<init>", "(ZFJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Z", "e", "()Z", "b", "F", "d", "()F", "c", "J", "f", "()J", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class g implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean ok;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float confidence;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long timeMs;

        public g(boolean z12, float f12, long j12) {
            this.ok = z12;
            this.confidence = f12;
            this.timeMs = j12;
        }

        /* renamed from: d, reason: from getter */
        public final float getConfidence() {
            return this.confidence;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return this.ok == gVar.ok && Float.valueOf(this.confidence).equals(Float.valueOf(gVar.confidence)) && this.timeMs == gVar.timeMs;
        }

        /* renamed from: f, reason: from getter */
        public final long getTimeMs() {
            return this.timeMs;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z12 = this.ok;
            ?? r02 = z12;
            if (z12) {
                r02 = 1;
            }
            return Long.hashCode(this.timeMs) + androidx.appcompat.app.r.d(this.confidence, r02 * 31, 31);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ShowQualityCheckResult(ok=");
            sb2.append(this.ok);
            sb2.append(", confidence=");
            sb2.append(this.confidence);
            sb2.append(", timeMs=");
            return androidx.appcompat.app.r.u(sb2, this.timeMs, ')');
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$switchToManualMode$1", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {550}, m = "invokeSuspend", n = {}, s = {})
    public static final class g0 extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f432255a;

        /* renamed from: b, reason: collision with root package name */
        int f432256b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f432258d;

        /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/d$b;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$switchToManualMode$1$1", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<d.b, Continuation<? super d.b>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f432259a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f432260b;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k d.b bVar, @Y61.l Continuation<? super d.b> continuation) {
                return ((a) create(bVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.f432260b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f432259a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return d.b.a((d.b) this.f432260b, false, true, true, false, null, 25, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(boolean z12, Continuation<? super g0> continuation) {
            super(2, continuation);
            this.f432258d = z12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((g0) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRPhotoDocumentPickerViewModel.this.new g0(this.f432258d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Z1 z12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432256b;
            if (i12 == 0) {
                C42729a0.b(obj);
                CBRPhotoDocumentPickerViewModel.this.isAutoCapture = false;
                CBRViewModel.updateState$default(CBRPhotoDocumentPickerViewModel.this, false, new a(null), 1, null);
                Z1 z13 = CBRPhotoDocumentPickerViewModel.this._documentCaptureState;
                CBRPhotoDocumentPickerViewModel cBRPhotoDocumentPickerViewModel = CBRPhotoDocumentPickerViewModel.this;
                this.f432255a = z13;
                this.f432256b = 1;
                Object objC = cBRPhotoDocumentPickerViewModel.c(this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z12 = z13;
                obj = objC;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z12 = (Z1) this.f432255a;
                C42729a0.b(obj);
            }
            b bVar = (b) obj;
            z12.setValue(b.a(bVar, null, b.a.a(bVar.getSwitch(), null, null, null, Boxing.boxBoolean(this.f432258d), 7, null), null, null, 13, null));
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$h;", "", "Ljava/io/File;", "file", "", "started", "<init>", "(Ljava/io/File;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "c", "()Ljava/io/File;", "b", "Z", "d", "()Z", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class h {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final File file;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean started;

        public h(@Y61.l File file, boolean z12) {
            this.file = file;
            this.started = z12;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getStarted() {
            return this.started;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return L.f(this.file, hVar.file) && this.started == hVar.started;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            File file = this.file;
            int iHashCode = (file == null ? 0 : file.hashCode()) * 31;
            boolean z12 = this.started;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            return iHashCode + i12;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("VideoCapture(file=");
            sb2.append(this.file);
            sb2.append(", started=");
            return androidx.appcompat.app.r.x(sb2, this.started, ')');
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel", f = "CBRPhotoDocumentPickerViewModel.kt", i = {0, 0, 0, 0, 0}, l = {659}, m = "takeFrameAsResult", n = {"this", "frameBitmap", "photoQualityResult", "resultFrame", "isAutocaptured"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
    public static final class h0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432263a;

        /* renamed from: b, reason: collision with root package name */
        Object f432264b;

        /* renamed from: c, reason: collision with root package name */
        Object f432265c;

        /* renamed from: d, reason: collision with root package name */
        Object f432266d;

        /* renamed from: e, reason: collision with root package name */
        int f432267e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f432268f;

        /* renamed from: h, reason: collision with root package name */
        int f432270h;

        public h0(Continuation<? super h0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432268f = obj;
            this.f432270h |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPhotoDocumentPickerViewModel.this.a((Context) null, (Bitmap) null, (Rect) null, (ru.cyberity.ml.badphotos.models.b) null, this);
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class i {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f432271a;

        static {
            int[] iArr = new int[CheckDetectionResult.SizeCheckResult.values().length];
            iArr[CheckDetectionResult.SizeCheckResult.OK.ordinal()] = 1;
            iArr[CheckDetectionResult.SizeCheckResult.SMALL.ordinal()] = 2;
            iArr[CheckDetectionResult.SizeCheckResult.BIG.ordinal()] = 3;
            f432271a = iArr;
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/ml/autocapture/a;", "a", "()Lru/cyberity/ml/autocapture/a;"}, k = 3, mv = {1, 7, 1})
    public static final class j extends N implements Y41.a<ru.cyberity.ml.autocapture.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f432272a = new j();

        public j() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.ml.autocapture.a invoke() {
            return ru.cyberity.ml.autocapture.a.INSTANCE.a();
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/a;", "a", "()Lru/cyberity/cbr/camera/photo/presentation/document/a;"}, k = 3, mv = {1, 7, 1})
    public static final class k extends N implements Y41.a<a> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a(CBRPhotoDocumentPickerViewModel.this.m());
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel", f = "CBRPhotoDocumentPickerViewModel.kt", i = {0, 0, 0, 0}, l = {598, 632}, m = "checkPhotoQuality", n = {"this", "context", "frameBitmap", "photoFrameRect"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432274a;

        /* renamed from: b, reason: collision with root package name */
        Object f432275b;

        /* renamed from: c, reason: collision with root package name */
        Object f432276c;

        /* renamed from: d, reason: collision with root package name */
        Object f432277d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f432278e;

        /* renamed from: g, reason: collision with root package name */
        int f432280g;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432278e = obj;
            this.f432280g |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPhotoDocumentPickerViewModel.this.a((Context) null, (Bitmap) null, (Rect) null, this);
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel", f = "CBRPhotoDocumentPickerViewModel.kt", i = {0, 0}, l = {812}, m = "checkPhotoQuality", n = {"this", "startMs"}, s = {"L$0", "J$0"})
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432281a;

        /* renamed from: b, reason: collision with root package name */
        long f432282b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f432283c;

        /* renamed from: e, reason: collision with root package name */
        int f432285e;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432283c = obj;
            this.f432285e |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPhotoDocumentPickerViewModel.this.a((Bitmap) null, this);
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lru/cyberity/ml/core/d$a;", "Lru/cyberity/ml/badphotos/models/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lru/cyberity/ml/core/d$a;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$checkPhotoQuality$badPhotosDetectorResult$1", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {813}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Y41.p<T, Continuation<? super d.a<ru.cyberity.ml.badphotos.models.a>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432286a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f432288c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Bitmap bitmap, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f432288c = bitmap;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super d.a<ru.cyberity.ml.badphotos.models.a>> continuation) {
            return ((n) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRPhotoDocumentPickerViewModel.this.new n(this.f432288c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432286a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.ml.core.d dVar = CBRPhotoDocumentPickerViewModel.this.badPhotoDetector;
                Bitmap bitmap = this.f432288c;
                this.f432286a = 1;
                obj = dVar.a(bitmap, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel", f = "CBRPhotoDocumentPickerViewModel.kt", i = {0}, l = {761}, m = "finishWithCurrentResults", n = {"this"}, s = {"L$0"})
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432289a;

        /* renamed from: b, reason: collision with root package name */
        Object f432290b;

        /* renamed from: c, reason: collision with root package name */
        Object f432291c;

        /* renamed from: d, reason: collision with root package name */
        Object f432292d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f432293e;

        /* renamed from: g, reason: collision with root package name */
        int f432295g;

        public o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432293e = obj;
            this.f432295g |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPhotoDocumentPickerViewModel.this.b(this);
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/d$b;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$finishWithCurrentResults$2", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Y41.p<d.b, Continuation<? super d.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432296a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432297b;

        public p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d.b bVar, @Y61.l Continuation<? super d.b> continuation) {
            return ((p) create(bVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            p pVar = new p(continuation);
            pVar.f432297b = obj;
            return pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432296a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return d.b.a((d.b) this.f432297b, false, false, false, false, null, 27, null);
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$finishWithCurrentResults$3", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {772}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432298a;

        public q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((q) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRPhotoDocumentPickerViewModel.this.new q(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432298a;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f432298a = 1;
                if (C43131e0.b(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            CBRPhotoDocumentPickerViewModel.this._documentCaptureState.setValue(b.a((b) CBRPhotoDocumentPickerViewModel.this._documentCaptureState.getValue(), new h(null, false), null, null, null, 6, null));
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel", f = "CBRPhotoDocumentPickerViewModel.kt", i = {0}, l = {416}, m = "handleTakePictureRequested", n = {"this"}, s = {"L$0"})
    public static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432300a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432301b;

        /* renamed from: d, reason: collision with root package name */
        int f432303d;

        public r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432301b = obj;
            this.f432303d |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPhotoDocumentPickerViewModel.this.a((Context) null, (Bitmap) null, this);
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel", f = "CBRPhotoDocumentPickerViewModel.kt", i = {0}, l = {132, 133}, m = "manualDocumentCaptureState", n = {"this"}, s = {"L$0"})
    public static final class s extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432304a;

        /* renamed from: b, reason: collision with root package name */
        Object f432305b;

        /* renamed from: c, reason: collision with root package name */
        Object f432306c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f432307d;

        /* renamed from: f, reason: collision with root package name */
        int f432309f;

        public s(Continuation<? super s> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432307d = obj;
            this.f432309f |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPhotoDocumentPickerViewModel.this.c(this);
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$onCleared$1", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {873}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432310a;

        public t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((t) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRPhotoDocumentPickerViewModel.this.new t(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432310a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.ml.docdetector.b bVar = CBRPhotoDocumentPickerViewModel.this.docDetector;
                this.f432310a = 1;
                if (bVar.a((Continuation<? super G0>) this) == coroutine_suspended) {
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

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel", f = "CBRPhotoDocumentPickerViewModel.kt", i = {1, 1, 1, 1, 1, 1}, l = {259, 283, 325}, m = "onFrameCaptured", n = {"this", "context", "frameBitmap", "photoFrameRect", "saveFrame", "startMs"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "J$0"})
    public static final class u extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432312a;

        /* renamed from: b, reason: collision with root package name */
        Object f432313b;

        /* renamed from: c, reason: collision with root package name */
        Object f432314c;

        /* renamed from: d, reason: collision with root package name */
        Object f432315d;

        /* renamed from: e, reason: collision with root package name */
        boolean f432316e;

        /* renamed from: f, reason: collision with root package name */
        long f432317f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f432318g;

        /* renamed from: i, reason: collision with root package name */
        int f432320i;

        public u(Continuation<? super u> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432318g = obj;
            this.f432320i |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPhotoDocumentPickerViewModel.this.b(null, null, null, this);
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$onFrameCaptured$2", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {250}, m = "invokeSuspend", n = {}, s = {})
    public static final class v extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432321a;

        public v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((v) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRPhotoDocumentPickerViewModel.this.new v(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432321a;
            if (i12 == 0) {
                C42729a0.b(obj);
                CBRPhotoDocumentPickerViewModel cBRPhotoDocumentPickerViewModel = CBRPhotoDocumentPickerViewModel.this;
                this.f432321a = 1;
                if (cBRPhotoDocumentPickerViewModel.d(this) == coroutine_suspended) {
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

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lru/cyberity/ml/docdetector/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lru/cyberity/ml/docdetector/a;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$onFrameCaptured$detectionResult$1", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {284}, m = "invokeSuspend", n = {}, s = {})
    public static final class w extends SuspendLambda implements Y41.p<T, Continuation<? super ru.cyberity.ml.docdetector.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432323a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f432325c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f432326d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Bitmap bitmap, boolean z12, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f432325c = bitmap;
            this.f432326d = z12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super ru.cyberity.ml.docdetector.a> continuation) {
            return ((w) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRPhotoDocumentPickerViewModel.this.new w(this.f432325c, this.f432326d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432323a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.ml.docdetector.b bVar = CBRPhotoDocumentPickerViewModel.this.docDetector;
                Bitmap bitmap = this.f432325c;
                boolean z12 = this.f432326d;
                this.f432323a = 1;
                obj = bVar.a(bitmap, z12, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/camera/d$b;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$onPictureTaken$1", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class x extends SuspendLambda implements Y41.p<d.b, Continuation<? super d.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432327a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432328b;

        public x(Continuation<? super x> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d.b bVar, @Y61.l Continuation<? super d.b> continuation) {
            return ((x) create(bVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            x xVar = new x(continuation);
            xVar.f432328b = obj;
            return xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432327a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return d.b.a((d.b) this.f432328b, false, false, false, false, null, 29, null);
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel", f = "CBRPhotoDocumentPickerViewModel.kt", i = {0, 1, 2}, l = {191, 194, 195}, m = "onPrepare", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    public static final class y extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432329a;

        /* renamed from: b, reason: collision with root package name */
        Object f432330b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f432331c;

        /* renamed from: e, reason: collision with root package name */
        int f432333e;

        public y(Continuation<? super y> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432331c = obj;
            this.f432333e |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPhotoDocumentPickerViewModel.this.onPrepare(this);
        }
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$onPrepare$2", f = "CBRPhotoDocumentPickerViewModel.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
    public static final class z extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432334a;

        public z(Continuation<? super z> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((z) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRPhotoDocumentPickerViewModel.this.new z(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432334a;
            if (i12 == 0) {
                C42729a0.b(obj);
                CBRPhotoDocumentPickerViewModel cBRPhotoDocumentPickerViewModel = CBRPhotoDocumentPickerViewModel.this;
                this.f432334a = 1;
                if (cBRPhotoDocumentPickerViewModel.d(this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public CBRPhotoDocumentPickerViewModel(@Y61.k DocumentType documentType, @Y61.l String str, @Y61.k List<? extends IdentitySide> list, @Y61.l DocCapture.PreferredMode preferredMode, @Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @Y61.k ru.cyberity.ml.core.d<Bitmap, ru.cyberity.ml.badphotos.models.a> dVar, @Y61.k ru.cyberity.ml.docdetector.b bVar, @Y61.k C23060r0 c23060r0) {
        super(documentType, str, aVar, cVar);
        this.sides = list;
        this.preferredMode = preferredMode;
        this.dataRepository = cVar;
        this.badPhotoDetector = dVar;
        this.docDetector = bVar;
        this.collectedResults = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "key_collected_results", C42784z0.f406748b);
        this.autoCaptureResultProcessor = C42727D.c(new k());
        this.autoCaptureFeature = C42727D.c(j.f432272a);
        this._documentCaptureState = p2.a(new b(null, new b.a(null, null, null, null), null, null, 8, null));
        this.startedHoldingCameraAt = Long.MIN_VALUE;
    }

    private final boolean l() {
        return m().getEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.cyberity.ml.autocapture.a m() {
        return (ru.cyberity.ml.autocapture.a) this.autoCaptureFeature.getValue();
    }

    private final a n() {
        return (a) this.autoCaptureResultProcessor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ru.cyberity.cbr.core.data.model.o> p() {
        return (List) this.collectedResults.a(this, f432184D[0]);
    }

    private final CBRViewModel.CBRViewModelEvent t() {
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "lost document bounds", null, 4, null);
        this.capturingDocument = false;
        n().a();
        this.startedHoldingCameraAt = Long.MIN_VALUE;
        return d.f432225a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        Z1<b> z12 = this._documentCaptureState;
        z12.setValue(b.a(z12.getValue(), null, null, null, null, 7, null));
    }

    private final boolean v() {
        return ru.cyberity.ff.a.f435638a.n().g();
    }

    private final void w() {
        C43259k.d(N0.a(this), null, null, new f0(null), 3);
    }

    @Y61.k
    public final CameraX.Mode o() {
        CameraX.Mode mode;
        if (this._documentCaptureState.getValue().getVideoCapture() != null) {
            return CameraX.Mode.SEAMLESS_DOC_CAPTURE;
        }
        if (L.f(this._documentCaptureState.getValue().getSwitch().getVisible(), Boolean.TRUE)) {
            mode = CameraX.Mode.PHOTO_AND_ANALYZER;
            if (!m().getImageCaptureUseCaseEnabled()) {
                mode = null;
            }
            if (mode == null) {
                mode = CameraX.Mode.ANALYZER;
            }
        } else {
            mode = CameraX.Mode.PHOTO;
        }
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "cameraMode: " + mode, null, 4, null);
        return mode;
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel, androidx.view.M0
    public void onCleared() {
        super.onCleared();
        C43259k.d(N0.a(this), null, null, new t(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // ru.cyberity.cbr.camera.c, ru.cyberity.cbr.camera.d, ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onPrepare(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r19) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.onPrepare(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Y61.k
    public final n2<b> q() {
        return this._documentCaptureState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(Continuation<? super G0> continuation) {
        Object objA = a(new c0(), continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }

    @Override // ru.cyberity.cbr.camera.d
    @Y61.k
    /* renamed from: e */
    public Size getImageAnalysisFrameSize() {
        Size frameSize = m().getFrameSize();
        if (frameSize != null) {
            if (!this.autoCaptureAllowed) {
                frameSize = null;
            }
            if (frameSize != null) {
                return frameSize;
            }
        }
        return super.getImageAnalysisFrameSize();
    }

    @Override // ru.cyberity.cbr.camera.d
    public void h() {
        if (o() == CameraX.Mode.PHOTO) {
            super.h();
            return;
        }
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "take picture requested", null, 4, null);
        this.isTakePictureRequested = true;
        CBRViewModel.updateState$default(this, false, new a0(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.b> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.s
            if (r0 == 0) goto L13
            r0 = r14
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$s r0 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.s) r0
            int r1 = r0.f432309f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432309f = r1
            goto L18
        L13:
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$s r0 = new ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$s
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f432307d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f432309f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r1 = r0.f432306c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Object r2 = r0.f432305b
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.lang.Object r0 = r0.f432304a
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$h r0 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.h) r0
            kotlin.C42729a0.b(r14)
            r6 = r0
            goto L99
        L39:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L41:
            java.lang.Object r2 = r0.f432306c
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.lang.Object r5 = r0.f432305b
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$h r5 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.h) r5
            java.lang.Object r6 = r0.f432304a
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel r6 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel) r6
            kotlin.C42729a0.b(r14)
            goto L7f
        L51:
            kotlin.C42729a0.b(r14)
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$h r14 = new ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$h
            java.io.File r2 = r13.videoCaptureFile
            boolean r5 = r13.isCapturingVideo
            r14.<init>(r2, r5)
            boolean r2 = r13.v()
            if (r2 == 0) goto L64
            goto L65
        L64:
            r14 = 0
        L65:
            r2 = 0
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            r0.f432304a = r13
            r0.f432305b = r14
            r0.f432306c = r2
            r0.f432309f = r4
            java.lang.String r5 = "sns_autocapture_action_auto"
            java.lang.Object r5 = r13.getString(r5, r0)
            if (r5 != r1) goto L7b
            return r1
        L7b:
            r6 = r13
            r12 = r5
            r5 = r14
            r14 = r12
        L7f:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L85
            java.lang.String r14 = "avto"
        L85:
            r0.f432304a = r5
            r0.f432305b = r2
            r0.f432306c = r14
            r0.f432309f = r3
            java.lang.String r3 = "sns_autocapture_action_manual"
            java.lang.Object r0 = r6.getString(r3, r0)
            if (r0 != r1) goto L96
            return r1
        L96:
            r1 = r14
            r14 = r0
            r6 = r5
        L99:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L9f
            java.lang.String r14 = "manul"
        L9f:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$b$a r7 = new ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$b$a
            r7.<init>(r2, r1, r14, r0)
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$b r14 = new ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$b
            r10 = 8
            r11 = 0
            r8 = 0
            r9 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(boolean z12) {
        this.frameSaveRequested = z12;
    }

    public final void b(@Y61.k File file) {
        ru.cyberity.cbr.camera.photo.presentation.document.e eVar = ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a;
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(eVar, "DocCapture", "onVideoRecorded: isWaitingForVideo=" + this.isWaitingForVideo + ", " + file, null, 4, null);
        this.isCapturingVideo = false;
        if (!this.isWaitingForVideo) {
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(eVar, "DocCapture", "onVideoRecorded: removing video file", null, 4, null);
            file.delete();
            return;
        }
        this.isWaitingForVideo = false;
        ArrayList arrayList = new ArrayList(p());
        arrayList.add(new ru.cyberity.cbr.core.data.model.o(file, file, null, "DEBUG", null, false, null, 100, null));
        a(arrayList);
        C43259k.d(N0.a(this), null, null, new b0(null), 3);
    }

    /* compiled from: CBRPhotoDocumentPickerViewModel.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$¨\u0006)"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$f;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "Landroid/util/Size;", "photoSize", "sampleSize", "Lru/cyberity/ml/docdetector/a;", "result", "", "frameHit", "drawDetectedFrame", "saveScreen", "<init>", "(Landroid/util/Size;Landroid/util/Size;Lru/cyberity/ml/docdetector/a;ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/util/Size;", "i", "()Landroid/util/Size;", "b", "k", "c", "Lru/cyberity/ml/docdetector/a;", "j", "()Lru/cyberity/ml/docdetector/a;", "d", "Z", "h", "()Z", "e", "g", "f", "l", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class f implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final Size photoSize;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final Size sampleSize;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final ru.cyberity.ml.docdetector.a result;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean frameHit;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean drawDetectedFrame;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean saveScreen;

        public f(@Y61.k Size size, @Y61.k Size size2, @Y61.k ru.cyberity.ml.docdetector.a aVar, boolean z12, boolean z13, boolean z14) {
            this.photoSize = size;
            this.sampleSize = size2;
            this.result = aVar;
            this.frameHit = z12;
            this.drawDetectedFrame = z13;
            this.saveScreen = z14;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return L.f(this.photoSize, fVar.photoSize) && L.f(this.sampleSize, fVar.sampleSize) && L.f(this.result, fVar.result) && this.frameHit == fVar.frameHit && this.drawDetectedFrame == fVar.drawDetectedFrame && this.saveScreen == fVar.saveScreen;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getDrawDetectedFrame() {
            return this.drawDetectedFrame;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = (this.result.hashCode() + ((this.sampleSize.hashCode() + (this.photoSize.hashCode() * 31)) * 31)) * 31;
            boolean z12 = this.frameHit;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            int i13 = (iHashCode + i12) * 31;
            boolean z13 = this.drawDetectedFrame;
            int i14 = z13;
            if (z13 != 0) {
                i14 = 1;
            }
            int i15 = (i13 + i14) * 31;
            boolean z14 = this.saveScreen;
            return i15 + (z14 ? 1 : z14 ? 1 : 0);
        }

        @Y61.k
        /* renamed from: i, reason: from getter */
        public final Size getPhotoSize() {
            return this.photoSize;
        }

        @Y61.k
        /* renamed from: j, reason: from getter */
        public final ru.cyberity.ml.docdetector.a getResult() {
            return this.result;
        }

        @Y61.k
        /* renamed from: k, reason: from getter */
        public final Size getSampleSize() {
            return this.sampleSize;
        }

        /* renamed from: l, reason: from getter */
        public final boolean getSaveScreen() {
            return this.saveScreen;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ShowDocDetectionResult(photoSize=");
            sb2.append(this.photoSize);
            sb2.append(", sampleSize=");
            sb2.append(this.sampleSize);
            sb2.append(", result=");
            sb2.append(this.result);
            sb2.append(", frameHit=");
            sb2.append(this.frameHit);
            sb2.append(", drawDetectedFrame=");
            sb2.append(this.drawDetectedFrame);
            sb2.append(", saveScreen=");
            return androidx.appcompat.app.r.x(sb2, this.saveScreen, ')');
        }

        public /* synthetic */ f(Size size, Size size2, ru.cyberity.ml.docdetector.a aVar, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
            this(size, size2, aVar, z12, z13, (i12 & 32) != 0 ? false : z14);
        }
    }

    private final void a(List<ru.cyberity.cbr.core.data.model.o> list) {
        this.collectedResults.a(this, f432184D[0], list);
    }

    private final void a(CheckDetectionResult checkResult, ru.cyberity.ml.docdetector.a detectionResult, boolean saveFrame, Bitmap frameBitmap) {
        CBRViewModel.CBRViewModelEvent cBRViewModelEventT;
        if (checkResult != null && detectionResult != null) {
            cBRViewModelEventT = a(checkResult, detectionResult, frameBitmap, saveFrame);
        } else {
            cBRViewModelEventT = this.capturingDocument ? t() : null;
        }
        if (!this.capturingDocument && L.f(this._documentCaptureState.getValue().getSwitch().getAuto(), Boolean.TRUE)) {
            Z1<b> z12 = this._documentCaptureState;
            z12.setValue(b.a(z12.getValue(), null, null, a(CheckDetectionResult.INSTANCE.a()), null, 11, null));
        }
        if (cBRViewModelEventT != null) {
            fireEvent(cBRViewModelEventT);
        }
    }

    public final void c(@Y61.k File file) {
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", androidx.compose.ui.graphics.colorspace.e.j(file, "onVideoRecordingStarted: "), null, 4, null);
        this.isCapturingVideo = true;
    }

    public final void b(@Y61.k Context context) {
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "onCameraPreviewReady", null, 4, null);
        if (v() && this.videoCaptureFile == null) {
            a(context);
        }
    }

    private final CBRViewModel.CBRViewModelEvent a(CheckDetectionResult checkResult, ru.cyberity.ml.docdetector.a detectionResult, Bitmap frameBitmap, boolean saveFrame) {
        if (this.capturingDocument) {
            Z1<b> z12 = this._documentCaptureState;
            z12.setValue(b.a(z12.getValue(), null, null, a(checkResult), null, 11, null));
        }
        if (!checkResult.getFrameHit()) {
            this.startedHoldingCameraAt = Long.MIN_VALUE;
        }
        if (!this.capturingDocument && n0.f432787a.isDebug()) {
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "started tracking document bounds: " + detectionResult, null, 4, null);
        }
        if (saveFrame) {
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "detected bounds " + detectionResult, null, 4, null);
        }
        this.capturingDocument = true;
        if (m().getShowBounds()) {
            return new f(new Size(frameBitmap.getWidth(), frameBitmap.getHeight()), new Size(this.docDetector.l().getWidth(), this.docDetector.l().getHeight()), detectionResult, checkResult.getFrameHit(), m().getShowBounds(), saveFrame);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k android.content.Context r26, @Y61.k android.graphics.Bitmap r27, @Y61.k android.graphics.Rect r28, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.b(android.content.Context, android.graphics.Bitmap, android.graphics.Rect, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void c(boolean showSwitch) {
        C43259k.d(N0.a(this), null, null, new g0(showSwitch, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r9, android.graphics.Bitmap r10, kotlin.coroutines.Continuation<? super kotlin.G0> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.r
            if (r0 == 0) goto L14
            r0 = r11
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$r r0 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.r) r0
            int r1 = r0.f432303d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f432303d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$r r0 = new ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$r
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f432301b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f432303d
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r9 = r6.f432300a
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel r9 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel) r9
            kotlin.C42729a0.b(r11)
            goto L50
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.C42729a0.b(r11)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r7, r7, r7, r7)
            r6.f432300a = r8
            r6.f432303d = r2
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L4f
            return r0
        L4f:
            r9 = r8
        L50:
            r9.isTakePictureRequested = r7
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.a(android.content.Context, android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void a(Context context) {
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "initiateVideoRecord", null, 4, null);
        File externalCacheDir = context.getExternalCacheDir();
        if (!n0.f432787a.isDebug()) {
            externalCacheDir = null;
        }
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        this.videoCaptureFile = new File(externalCacheDir, "docapture_" + UUID.randomUUID() + ".mp4");
        Z1<b> z12 = this._documentCaptureState;
        z12.setValue(b.a(z12.getValue(), new h(this.videoCaptureFile, true), null, null, null, 14, null));
    }

    private final void a(Context context, Bitmap frameBitmap, Rect rect, Rect photoFrameRect) throws IOException {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameBitmap.getWidth(), frameBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        bitmapCreateBitmap.eraseColor(0);
        canvas.drawBitmap(frameBitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setColor(-16711936);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.cbr_frame_stroke_width));
        canvas.drawRect(rect, paint);
        paint.setColor(-65536);
        canvas.drawRect(photoFrameRect, paint);
        a(context, bitmapCreateBitmap, "frame");
        bitmapCreateBitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation<? super kotlin.G0> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.o
            if (r0 == 0) goto L13
            r0 = r12
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$o r0 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.o) r0
            int r1 = r0.f432295g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432295g = r1
            goto L18
        L13:
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$o r0 = new ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$o
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f432293e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f432295g
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r1 = r0.f432292d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f432291c
            kotlinx.coroutines.flow.Z1 r2 = (kotlinx.coroutines.flow.Z1) r2
            java.lang.Object r4 = r0.f432290b
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$b r4 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.b) r4
            java.lang.Object r0 = r0.f432289a
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel r0 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel) r0
            kotlin.C42729a0.b(r12)
            goto L89
        L39:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L41:
            kotlin.C42729a0.b(r12)
            ru.cyberity.cbr.camera.photo.presentation.document.e r4 = ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r2 = "finishWithCurrentResults: isCapturingVideo="
            r12.<init>(r2)
            boolean r2 = r11.isCapturingVideo
            r12.append(r2)
            java.lang.String r6 = r12.toString()
            java.lang.String r5 = "DocCapture"
            r7 = 0
            r8 = 4
            r9 = 0
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(r4, r5, r6, r7, r8, r9)
            boolean r12 = r11.isCapturingVideo
            if (r12 == 0) goto Lba
            r11.isWaitingForVideo = r3
            kotlinx.coroutines.flow.Z1<ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$b> r2 = r11._documentCaptureState
            java.lang.Object r12 = r2.getValue()
            r4 = r12
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$b r4 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.b) r4
            ru.cyberity.cbr.core.data.listener.CBRIconHandler$CBRCommonIcons r12 = ru.cyberity.cbr.core.data.listener.CBRIconHandler.CBRCommonIcons.SUCCESS_CHECK
            java.lang.String r12 = r12.getImageName()
            r0.f432289a = r11
            r0.f432290b = r4
            r0.f432291c = r2
            r0.f432292d = r12
            r0.f432295g = r3
            java.lang.String r5 = "sns_instructions_hint_allSet"
            java.lang.Object r0 = r11.getString(r5, r0)
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r12
            r12 = r0
            r0 = r11
        L89:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L8f
            java.lang.String r12 = "All set!"
        L8f:
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$c r8 = new ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$c
            r8.<init>(r1, r12)
            r6 = 0
            r7 = 0
            r5 = 0
            r9 = 3
            r10 = 0
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$b r12 = ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.b.a(r4, r5, r6, r7, r8, r9, r10)
            r2.setValue(r12)
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$p r12 = new ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$p
            r1 = 0
            r12.<init>(r1)
            r2 = 0
            ru.cyberity.cbr.core.presentation.base.CBRViewModel.updateState$default(r0, r2, r12, r3, r1)
            A1.a r12 = androidx.view.N0.a(r0)
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$q r2 = new ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$q
            r2.<init>(r1)
            r0 = 3
            kotlinx.coroutines.C43259k.d(r12, r1, r1, r2, r0)
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        Lba:
            java.util.List r2 = r11.p()
            r1 = 0
            r3 = 0
            r4 = 5
            r5 = 0
            r0 = r11
            ru.cyberity.cbr.core.presentation.base.CBRViewModel.finish$default(r0, r1, r2, r3, r4, r5)
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void a(Context context, Bitmap frameBitmap, String nameSuffix) throws IOException {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return;
        }
        StringBuilder sbB = C22491k0.b(nameSuffix, '_');
        sbB.append(System.currentTimeMillis());
        sbB.append(".jpg");
        File file = new File(externalFilesDir, sbB.toString());
        ru.cyberity.cbr.camera.photo.presentation.document.e eVar = ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a;
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(eVar, "DocCapture", "saving to " + file.getAbsolutePath(), null, 4, null);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        boolean zCompress = frameBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        if (zCompress) {
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(eVar, "DocCapture", "saved!", null, 4, null);
        }
    }

    public final void a(boolean enabled) {
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", com.avito.android.bxcontent.mvi.entity.f.l("onAutoEnabled: ", enabled), null, 4, null);
        if (enabled) {
            w();
        } else {
            c(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[PHI: r0 r10
  0x002e: PHI (r0v4 ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State) = 
  (r0v1 ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State)
  (r0v11 ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State)
 binds: [B:25:0x006a, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]
  0x002e: PHI (r10v6 java.lang.String) = (r10v4 java.lang.String), (r10v14 java.lang.String) binds: [B:25:0x006a, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.AutoCaptureHint a(ru.cyberity.cbr.camera.photo.presentation.document.CheckDetectionResult r10) {
        /*
            r9 = this;
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State r0 = ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.AutoCaptureHint.State.INVALID
            boolean r1 = r10.getFrameHit()
            java.lang.String r2 = "Away a bit ..."
            java.lang.String r3 = "sns_autocapture_hint_moveOut"
            if (r1 == 0) goto L58
            ru.cyberity.cbr.camera.photo.presentation.document.CheckDetectionResult$SizeCheckResult r10 = r10.getSizeCheck()
            int[] r0 = ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.i.f432271a
            int r10 = r10.ordinal()
            r10 = r0[r10]
            r0 = 1
            if (r10 == r0) goto L47
            r0 = 2
            if (r10 == r0) goto L36
            r0 = 3
            if (r10 != r0) goto L30
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State r0 = ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.AutoCaptureHint.State.INTERMEDIATE
            ru.cyberity.cbr.core.data.source.dynamic.c$c r10 = r9.getStrings()
            java.lang.String r10 = r10.a(r3)
            if (r10 != 0) goto L2e
            goto L7b
        L2e:
            r2 = r10
            goto L7b
        L30:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L36:
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State r0 = ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.AutoCaptureHint.State.INTERMEDIATE
            ru.cyberity.cbr.core.data.source.dynamic.c$c r10 = r9.getStrings()
            java.lang.String r1 = "sns_autocapture_hint_moveIn"
            java.lang.String r2 = r10.a(r1)
            if (r2 != 0) goto L7b
            java.lang.String r2 = "Closer ..."
            goto L7b
        L47:
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State r0 = ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.AutoCaptureHint.State.OK
            ru.cyberity.cbr.core.data.source.dynamic.c$c r10 = r9.getStrings()
            java.lang.String r1 = "sns_autocapture_hint_holdLikeThis"
            java.lang.String r2 = r10.a(r1)
            if (r2 != 0) goto L7b
            java.lang.String r2 = "Hold ..."
            goto L7b
        L58:
            ru.cyberity.cbr.camera.photo.presentation.document.CheckDetectionResult$SizeCheckResult r10 = r10.getSizeCheck()
            ru.cyberity.cbr.camera.photo.presentation.document.CheckDetectionResult$SizeCheckResult r1 = ru.cyberity.cbr.camera.photo.presentation.document.CheckDetectionResult.SizeCheckResult.BIG
            if (r10 != r1) goto L6d
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State r0 = ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.AutoCaptureHint.State.INTERMEDIATE
            ru.cyberity.cbr.core.data.source.dynamic.c$c r10 = r9.getStrings()
            java.lang.String r10 = r10.a(r3)
            if (r10 != 0) goto L2e
            goto L7b
        L6d:
            ru.cyberity.cbr.core.data.source.dynamic.c$c r10 = r9.getStrings()
            java.lang.String r1 = "sns_autocapture_hint_targetAt"
            java.lang.String r2 = r10.a(r1)
            if (r2 != 0) goto L7b
            java.lang.String r2 = "Target ..."
        L7b:
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint r10 = new ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint
            r10.<init>(r2, r0)
            ru.cyberity.cbr.camera.photo.presentation.document.e r3 = ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buildAutoCaptureHint -> "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r5 = r0.toString()
            r7 = 4
            r8 = 0
            java.lang.String r4 = "DocCapture"
            r6 = 0
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.a(ru.cyberity.cbr.camera.photo.presentation.document.CheckDetectionResult):ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r23, android.graphics.Bitmap r24, android.graphics.Rect r25, kotlin.coroutines.Continuation<? super kotlin.G0> r26) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.a(android.content.Context, android.graphics.Bitmap, android.graphics.Rect, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r18, android.graphics.Bitmap r19, android.graphics.Rect r20, ru.cyberity.ml.badphotos.models.b r21, kotlin.coroutines.Continuation<? super kotlin.G0> r22) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.a(android.content.Context, android.graphics.Bitmap, android.graphics.Rect, ru.cyberity.ml.badphotos.models.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void a(File file, ru.cyberity.ml.badphotos.models.b photoQualityResult) {
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "Picture is taken", null, 4, null);
        showProgress(true);
        CBRViewModel.updateState$default(this, false, new x(null), 1, null);
        CBRViewModel.finish$default(this, null, new ru.cyberity.cbr.core.data.model.o(file, file, null, null, getCurrentSide(), false, photoQualityResult, 44, null), null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Y41.a<kotlin.G0> r14, kotlin.coroutines.Continuation<? super kotlin.G0> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.d0
            if (r0 == 0) goto L13
            r0 = r15
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$d0 r0 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.d0) r0
            int r1 = r0.f432234i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432234i = r1
            goto L18
        L13:
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$d0 r0 = new ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$d0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f432232g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f432234i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 != r4) goto L44
            java.lang.Object r14 = r0.f432231f
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r1 = r0.f432230e
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint r1 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.AutoCaptureHint) r1
            java.lang.Object r2 = r0.f432229d
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$b r2 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.b) r2
            java.lang.Object r4 = r0.f432228c
            kotlinx.coroutines.flow.Z1 r4 = (kotlinx.coroutines.flow.Z1) r4
            java.lang.Object r5 = r0.f432227b
            Y41.a r5 = (Y41.a) r5
            java.lang.Object r0 = r0.f432226a
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel r0 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel) r0
            kotlin.C42729a0.b(r15)
            r9 = r1
        L42:
            r6 = r2
            goto L98
        L44:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L4c:
            kotlin.C42729a0.b(r15)
            ru.cyberity.cbr.camera.photo.presentation.document.e r5 = ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a
            java.lang.String r7 = "showDocumentFlipHint"
            r8 = 0
            java.lang.String r6 = "DocCapture"
            r9 = 4
            r10 = 0
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(r5, r6, r7, r8, r9, r10)
            r13.isDelayingSideCapture = r4
            kotlinx.coroutines.flow.Z1<ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$b> r15 = r13._documentCaptureState
            java.lang.Object r2 = r15.getValue()
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$b r2 = (ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.b) r2
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint r5 = new ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State r6 = ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.AutoCaptureHint.State.DEFAULT
            java.lang.String r7 = ""
            r5.<init>(r7, r6)
            boolean r6 = r13.isAutoCapture
            if (r6 == 0) goto L73
            goto L74
        L73:
            r5 = r3
        L74:
            ru.cyberity.cbr.core.data.listener.CBRIconHandler$CBRCommonIcons r6 = ru.cyberity.cbr.core.data.listener.CBRIconHandler.CBRCommonIcons.FLIP
            java.lang.String r6 = r6.getImageName()
            r0.f432226a = r13
            r0.f432227b = r14
            r0.f432228c = r15
            r0.f432229d = r2
            r0.f432230e = r5
            r0.f432231f = r6
            r0.f432234i = r4
            java.lang.String r4 = "sns_instructions_hint_turnOver"
            java.lang.Object r0 = r13.getString(r4, r0)
            if (r0 != r1) goto L91
            return r1
        L91:
            r4 = r15
            r15 = r0
            r9 = r5
            r0 = r13
            r5 = r14
            r14 = r6
            goto L42
        L98:
            java.lang.String r15 = (java.lang.String) r15
            if (r15 != 0) goto L9e
            java.lang.String r15 = "Turn over"
        L9e:
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$c r10 = new ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$c
            r10.<init>(r14, r15)
            r7 = 0
            r8 = 0
            r11 = 3
            r12 = 0
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$b r14 = ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.b.a(r6, r7, r8, r9, r10, r11, r12)
            r4.setValue(r14)
            boolean r14 = r0.isAutoCapture
            A1.a r14 = androidx.view.N0.a(r0)
            ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$e0 r15 = new ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel$e0
            r15.<init>(r5, r0, r3)
            r0 = 3
            kotlinx.coroutines.C43259k.d(r14, r3, r3, r15, r0)
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.a(Y41.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Bitmap a(Bitmap frameBitmap, Rect photoFrameRect) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(photoFrameRect.width(), photoFrameRect.height(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(frameBitmap, photoFrameRect.left * (-1), photoFrameRect.top * (-1), (Paint) null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.graphics.Bitmap r23, kotlin.coroutines.Continuation<? super ru.cyberity.ml.badphotos.models.b> r24) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel.a(android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final CheckDetectionResult a(float scaleX, float scaleY, Rect photoFrameRect, ru.cyberity.ml.docdetector.a detectionResult) {
        return n().c(scaleX, scaleY, photoFrameRect, detectionResult);
    }
}

package ru.cyberity.cbr.presentation.screen.preview.photo;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import androidx.view.C23060r0;
import androidx.view.N0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.C43135f1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.D0;
import kotlinx.coroutines.T;
import ru.cyberity.cbr.camera.photo.presentation.document.DocCapture;
import ru.cyberity.cbr.core.analytics.GlobalStatePayload;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.listener.CBREvent;
import ru.cyberity.cbr.core.data.listener.CBREventHandler;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.IdentitySide;
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.cbr.core.data.model.p;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.domain.m;
import ru.cyberity.cbr.presentation.screen.preview.b;
import ru.cyberity.cbr.presentation.screen.preview.photo.identity.DocumentSideness;
import ru.cyberity.log.LoggerType;
import ru.cyberity.log.logger.Logger;
import ru.cyberity.ml.core.d;

/* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 Q2\b\u0012\u0004\u0012\u00020\u00020\u0001:\r$\u001c\u0090\u0001j+,\u0091\u0001\u0092\u0001\u0093\u0001B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u001eH\u0094@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001eH\u0016¢\u0006\u0004\b&\u0010 J\u0017\u0010\u001c\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b\u001c\u0010%J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b$\u0010*J\u0013\u0010+\u001a\u00020\u001eH\u0094@ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001dJ\u0013\u0010,\u001a\u00020\u001eH\u0084@ø\u0001\u0000¢\u0006\u0004\b,\u0010\u001dJ\u001d\u0010$\u001a\u00020\u001e2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-¢\u0006\u0004\b$\u00100J\u0019\u0010$\u001a\u00020\u001e2\b\u00101\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b$\u00102J\u0017\u00105\u001a\u00020\u001e2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J'\u0010$\u001a\u00020\u001e2\b\u00108\u001a\u0004\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u000109H\u0094@ø\u0001\u0000¢\u0006\u0004\b$\u0010;J\u0019\u0010?\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<¢\u0006\u0004\b?\u0010@J\u0017\u0010+\u001a\u00020=2\u0006\u0010A\u001a\u00020=H\u0014¢\u0006\u0004\b+\u0010BJ-\u0010$\u001a\u00020=2\u0014\u0010C\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=\u0018\u00010<2\u0006\u0010A\u001a\u00020=H\u0014¢\u0006\u0004\b$\u0010DJ\r\u0010E\u001a\u00020\u001e¢\u0006\u0004\bE\u0010 J\u000f\u0010F\u001a\u00020\u001eH\u0016¢\u0006\u0004\bF\u0010 J\u000f\u0010G\u001a\u00020\u001eH\u0004¢\u0006\u0004\bG\u0010 J\u0015\u0010+\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b+\u0010*J\u001d\u0010$\u001a\u00020\u001e2\b\b\u0002\u0010H\u001a\u00020\"H\u0094@ø\u0001\u0000¢\u0006\u0004\b$\u0010IJ\u0017\u0010$\u001a\u00020\u001e2\b\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\b$\u0010LJ#\u0010$\u001a\u00020N2\u0006\u0010M\u001a\u00020\"2\u0006\u00108\u001a\u000207H\u0094@ø\u0001\u0000¢\u0006\u0004\b$\u0010OJ\u0015\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0-H\u0004¢\u0006\u0004\bQ\u0010RJ)\u0010$\u001a\u00020U2\b\u0010S\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010=H\u0084@ø\u0001\u0000¢\u0006\u0004\b$\u0010VJ!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020=0-2\u0006\u0010W\u001a\u00020=H\u0084@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010XJ!\u0010$\u001a\b\u0012\u0004\u0012\u00020=0-2\u0006\u0010W\u001a\u00020=H\u0084@ø\u0001\u0000¢\u0006\u0004\b$\u0010XJ\r\u0010Y\u001a\u00020\u001e¢\u0006\u0004\bY\u0010 J\u000f\u0010$\u001a\u00020\u001eH\u0014¢\u0006\u0004\b$\u0010 J\u000f\u0010Z\u001a\u00020\u001eH\u0002¢\u0006\u0004\bZ\u0010 J\u0017\u0010\u001c\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b\u001c\u0010*J)\u0010$\u001a\u00020]2\u0006\u00101\u001a\u00020.2\u0010\b\u0002\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010[H\u0002¢\u0006\u0004\b$\u0010^J#\u0010$\u001a\u00020\u001e2\u0006\u0010_\u001a\u00020=2\n\u0010,\u001a\u00060`j\u0002`aH\u0002¢\u0006\u0004\b$\u0010bJ\u000f\u0010c\u001a\u00020\u001eH\u0002¢\u0006\u0004\bc\u0010 J\u000f\u0010d\u001a\u00020\u001eH\u0002¢\u0006\u0004\bd\u0010 J\u0017\u0010,\u001a\u00020=2\u0006\u0010A\u001a\u00020=H\u0002¢\u0006\u0004\b,\u0010BJ#\u0010$\u001a\u00020\u001e2\u000e\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010e0-H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010gJ+\u0010$\u001a\u00020\u001e2\b\u0010S\u001a\u0004\u0018\u00010=2\b\u0010T\u001a\u0004\u0018\u00010=2\u0006\u0010h\u001a\u00020UH\u0002¢\u0006\u0004\b$\u0010iJ\u0019\u0010j\u001a\b\u0012\u0004\u0012\u00020=0-H\u0082@ø\u0001\u0000¢\u0006\u0004\bj\u0010\u001dJ!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130l2\u0006\u0010k\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010mJ\u0013\u0010$\u001a\u00020nH\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u001dJ!\u0010$\u001a\u00020n2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00130lH\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010pJ\u001b\u0010$\u001a\u00020\u001e2\n\u0010q\u001a\u00060`j\u0002`aH\u0002¢\u0006\u0004\b$\u0010rJ\u000f\u0010s\u001a\u00020\u001eH\u0002¢\u0006\u0004\bs\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010vR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR,\u0010\u0080\u0001\u001a\u00020U2\u0006\u0010{\u001a\u00020U8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b|\u0010}\u001a\u0004\bt\u0010~\"\u0004\b$\u0010\u007fR.\u0010\u0083\u0001\u001a\u00020P2\u0006\u0010{\u001a\u00020P8D@DX\u0084\u008e\u0002¢\u0006\u0014\n\u0004\bo\u0010}\u001a\u0005\bo\u0010\u0081\u0001\"\u0005\b$\u0010\u0082\u0001R8\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020.0-2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020.0-8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010}\u001a\u0004\bw\u0010R\"\u0004\b\u001c\u00100R-\u0010\u0086\u0001\u001a\u00020\"2\u0006\u0010{\u001a\u00020\"8B@BX\u0082\u008e\u0002¢\u0006\u0013\n\u0004\bc\u0010}\u001a\u0005\b|\u0010\u0085\u0001\"\u0004\bj\u0010%R1\u0010\u008b\u0001\u001a\u00030\u0087\u00012\u0007\u0010{\u001a\u00030\u0087\u00018B@BX\u0082\u008e\u0002¢\u0006\u0015\n\u0004\bF\u0010}\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0005\b$\u0010\u008a\u0001R.\u0010\u008e\u0001\u001a\u00020(2\u0006\u0010{\u001a\u00020(8B@BX\u0082\u008e\u0002¢\u0006\u0014\n\u0004\bE\u0010}\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0004\bj\u0010*R\u0016\u0010\u008f\u0001\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\by\u0010\u0085\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0094\u0001"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel;", "Lru/cyberity/cbr/presentation/screen/preview/b;", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$a;", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Landroidx/lifecycle/r0;", "savedStateHandle", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/cbr/core/data/source/extensions/a;", AttachMenuItem.File.EXTENSIONS, "Lru/cyberity/cbr/domain/m;", "uploadDocumentImagesUseCase", "Lru/cyberity/cbr/core/common/k;", "rotationDetector", "Lru/cyberity/ml/core/d;", "Landroid/graphics/Bitmap;", "Lru/cyberity/ml/badphotos/models/a;", "badPhotoDetector", "Lru/cyberity/cbr/core/domain/b;", "countriesUseCase", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;Landroidx/lifecycle/r0;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;Lru/cyberity/cbr/core/data/source/extensions/a;Lru/cyberity/cbr/domain/m;Lru/cyberity/cbr/core/common/k;Lru/cyberity/ml/core/d;Lru/cyberity/cbr/core/domain/b;)V", "l", "()Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$a;", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/G0;", "onLoad", "()V", "onPrepare", "", "show", "a", "(Z)V", "i", "hasBack", "", "rotation", "(I)V", "d", "e", "", "Lru/cyberity/cbr/core/data/model/o;", "results", "(Ljava/util/List;)V", "result", "(Lru/cyberity/cbr/core/data/model/o;)V", "Lru/cyberity/cbr/core/data/model/p;", "error", "onHandleError", "(Lru/cyberity/cbr/core/data/model/p;)V", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "Lru/cyberity/cbr/core/data/model/e;", Navigation.CONFIG, "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "", "n", "()Ljava/util/Map;", "sourceKey", "(Ljava/lang/String;)Ljava/lang/String;", "map", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "v", "u", "y", "isRetake", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/Parcelable;", "payload", "(Landroid/os/Parcelable;)V", "retake", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$d;", "(ZLru/cyberity/cbr/core/data/model/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "w", "()Ljava/util/List;", "country", "idDocType", "Lru/cyberity/cbr/presentation/screen/preview/photo/identity/DocumentSideness;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countryKey", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "A", "Lkotlin/Function0;", "performRightAfterStateUpdate", "Lkotlinx/coroutines/N0;", "(Lru/cyberity/cbr/core/data/model/o;LY41/a;)Lkotlinx/coroutines/N0;", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;Ljava/lang/Exception;)V", "t", "z", "Lru/cyberity/cbr/core/data/model/remote/k;", "idDocs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sideness", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/presentation/screen/preview/photo/identity/DocumentSideness;)V", "c", "bitmap", "Lru/cyberity/ml/core/d$a;", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content;", "r", "(Lru/cyberity/ml/core/d$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exception", "(Ljava/lang/Exception;)V", "x", "m", "Lru/cyberity/cbr/core/data/source/extensions/a;", "Lru/cyberity/cbr/domain/m;", "o", "Lru/cyberity/cbr/core/common/k;", "p", "Lru/cyberity/ml/core/d;", "<set-?>", "q", "Lru/cyberity/cbr/core/presentation/screen/base/a;", "()Lru/cyberity/cbr/presentation/screen/preview/photo/identity/DocumentSideness;", "(Lru/cyberity/cbr/presentation/screen/preview/photo/identity/DocumentSideness;)V", "documentSideness", "()Lru/cyberity/cbr/core/data/model/IdentitySide;", "(Lru/cyberity/cbr/core/data/model/IdentitySide;)V", "side", "pickerResults", "()Z", "showPhotoPickerOnStart", "Lru/cyberity/ml/badphotos/models/b;", "j", "()Lru/cyberity/ml/badphotos/models/b;", "(Lru/cyberity/ml/badphotos/models/b;)V", "analyticsPayload", "k", "()I", "blockedAttemptCounter", "shouldSkipDocTypeSelector", "Content", "f", "g", "h", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class CBRPreviewPhotoDocumentViewModel extends ru.cyberity.cbr.presentation.screen.preview.b<a> {

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    private static final String[] f435041F;

    /* renamed from: x, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f435043x;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.extensions.a extensions;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.domain.m uploadDocumentImagesUseCase;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.common.k rotationDetector;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.ml.core.d<Bitmap, ru.cyberity.ml.badphotos.models.a> badPhotoDetector;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a documentSideness;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a side;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a pickerResults;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a showPhotoPickerOnStart;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a analyticsPayload;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a blockedAttemptCounter;

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001:\u0003'\f(BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJL\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content;", "", "", "title", "subtitle", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$a;", "buttonPositive", "buttonNegative", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$Icon;", "icon", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$a;Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$a;Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$Icon;)V", "a", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$a;Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$a;Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$Icon;)Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "j", "()Ljava/lang/CharSequence;", "b", "i", "c", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$a;", "g", "()Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$a;", "d", "f", "e", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$Icon;", "h", "()Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$Icon;", "ButtonAction", "Icon", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence subtitle;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final a buttonPositive;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final a buttonNegative;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Icon icon;

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$ButtonAction;", "", "(Ljava/lang/String;I)V", "CONTINUE", "TRY_AGAIN", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum ButtonAction {
            CONTINUE,
            TRY_AGAIN
        }

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$Icon;", "", "(Ljava/lang/String;I)V", "WARNING", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum Icon {
            WARNING
        }

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$a;", "", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$ButtonAction;", "action", "", "text", "<init>", "(Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$ButtonAction;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$ButtonAction;", "c", "()Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$ButtonAction;", "b", "Ljava/lang/CharSequence;", "d", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final ButtonAction action;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence text;

            public a(@Y61.k ButtonAction buttonAction, @Y61.l CharSequence charSequence) {
                this.action = buttonAction;
                this.text = charSequence;
            }

            @Y61.k
            /* renamed from: c, reason: from getter */
            public final ButtonAction getAction() {
                return this.action;
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
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return this.action == aVar.action && L.f(this.text, aVar.text);
            }

            public int hashCode() {
                int iHashCode = this.action.hashCode() * 31;
                CharSequence charSequence = this.text;
                return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ButtonDescription(action=");
                sb2.append(this.action);
                sb2.append(", text=");
                return AK.c.r(sb2, this.text, ')');
            }
        }

        public Content() {
            this(null, null, null, null, null, 31, null);
        }

        @Y61.k
        public final Content a(@Y61.l CharSequence title, @Y61.l CharSequence subtitle, @Y61.l a buttonPositive, @Y61.l a buttonNegative, @Y61.l Icon icon) {
            return new Content(title, subtitle, buttonPositive, buttonNegative, icon);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return L.f(this.title, content.title) && L.f(this.subtitle, content.subtitle) && L.f(this.buttonPositive, content.buttonPositive) && L.f(this.buttonNegative, content.buttonNegative) && this.icon == content.icon;
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final a getButtonNegative() {
            return this.buttonNegative;
        }

        @Y61.l
        /* renamed from: g, reason: from getter */
        public final a getButtonPositive() {
            return this.buttonPositive;
        }

        @Y61.l
        /* renamed from: h, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        public int hashCode() {
            CharSequence charSequence = this.title;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.subtitle;
            int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            a aVar = this.buttonPositive;
            int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            a aVar2 = this.buttonNegative;
            int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            Icon icon = this.icon;
            return iHashCode4 + (icon != null ? icon.hashCode() : 0);
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final CharSequence getSubtitle() {
            return this.subtitle;
        }

        @Y61.l
        /* renamed from: j, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        @Y61.k
        public String toString() {
            return "Content(title=" + ((Object) this.title) + ", subtitle=" + ((Object) this.subtitle) + ", buttonPositive=" + this.buttonPositive + ", buttonNegative=" + this.buttonNegative + ", icon=" + this.icon + ')';
        }

        public Content(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l a aVar, @Y61.l a aVar2, @Y61.l Icon icon) {
            this.title = charSequence;
            this.subtitle = charSequence2;
            this.buttonPositive = aVar;
            this.buttonNegative = aVar2;
            this.icon = icon;
        }

        public static /* synthetic */ Content a(Content content, CharSequence charSequence, CharSequence charSequence2, a aVar, a aVar2, Icon icon, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                charSequence = content.title;
            }
            if ((i12 & 2) != 0) {
                charSequence2 = content.subtitle;
            }
            CharSequence charSequence3 = charSequence2;
            if ((i12 & 4) != 0) {
                aVar = content.buttonPositive;
            }
            a aVar3 = aVar;
            if ((i12 & 8) != 0) {
                aVar2 = content.buttonNegative;
            }
            a aVar4 = aVar2;
            if ((i12 & 16) != 0) {
                icon = content.icon;
            }
            return content.a(charSequence, charSequence3, aVar3, aVar4, icon);
        }

        public /* synthetic */ Content(CharSequence charSequence, CharSequence charSequence2, a aVar, a aVar2, Icon icon, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : charSequence, (i12 & 2) != 0 ? null : charSequence2, (i12 & 4) != 0 ? null : aVar, (i12 & 8) != 0 ? null : aVar2, (i12 & 16) != 0 ? null : icon);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J^\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$a;", "Lru/cyberity/cbr/presentation/screen/preview/b$a;", "Landroid/graphics/Bitmap;", "bitmap", "Ljava/io/File;", "bitmapFile", "", "degree", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$h;", ConstraintKt.WARNING, "", "rotationAvailable", "showContent", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content;", "content", "<init>", "(Landroid/graphics/Bitmap;Ljava/io/File;ILru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$h;ZZLru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content;)V", "a", "(Landroid/graphics/Bitmap;Ljava/io/File;ILru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$h;ZZLru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content;)Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Bitmap;", "h", "()Landroid/graphics/Bitmap;", "b", "Ljava/io/File;", "i", "()Ljava/io/File;", "c", "I", "k", "d", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$h;", "n", "()Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$h;", "e", "Z", "l", "()Z", "f", "m", "g", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content;", "j", "()Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class a extends b.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Bitmap bitmap;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final File bitmapFile;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int degree;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final h warning;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean rotationAvailable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean showContent;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Content content;

        public a() {
            this(null, null, 0, null, false, false, null, 127, null);
        }

        @Y61.k
        public final a a(@Y61.l Bitmap bitmap, @Y61.l File bitmapFile, int degree, @Y61.l h warning, boolean rotationAvailable, boolean showContent, @Y61.l Content content) {
            return new a(bitmap, bitmapFile, degree, warning, rotationAvailable, showContent, content);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return L.f(this.bitmap, aVar.bitmap) && L.f(this.bitmapFile, aVar.bitmapFile) && this.degree == aVar.degree && L.f(this.warning, aVar.warning) && this.rotationAvailable == aVar.rotationAvailable && this.showContent == aVar.showContent && L.f(this.content, aVar.content);
        }

        @Y61.l
        /* renamed from: h, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            Bitmap bitmap = this.bitmap;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            File file = this.bitmapFile;
            int iE2 = androidx.appcompat.app.r.e(this.degree, (iHashCode + (file == null ? 0 : file.hashCode())) * 31, 31);
            h hVar = this.warning;
            int iHashCode2 = (iE2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            boolean z12 = this.rotationAvailable;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            int i13 = (iHashCode2 + i12) * 31;
            boolean z13 = this.showContent;
            int i14 = (i13 + (z13 ? 1 : z13 ? 1 : 0)) * 31;
            Content content = this.content;
            return i14 + (content != null ? content.hashCode() : 0);
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final File getBitmapFile() {
            return this.bitmapFile;
        }

        @Y61.l
        /* renamed from: j, reason: from getter */
        public final Content getContent() {
            return this.content;
        }

        /* renamed from: k, reason: from getter */
        public final int getDegree() {
            return this.degree;
        }

        /* renamed from: l, reason: from getter */
        public final boolean getRotationAvailable() {
            return this.rotationAvailable;
        }

        /* renamed from: m, reason: from getter */
        public final boolean getShowContent() {
            return this.showContent;
        }

        @Y61.l
        /* renamed from: n, reason: from getter */
        public final h getWarning() {
            return this.warning;
        }

        @Y61.k
        public String toString() {
            return "CBRPreviewPhotoDocumentViewState(bitmap=" + this.bitmap + ", bitmapFile=" + this.bitmapFile + ", degree=" + this.degree + ", warning=" + this.warning + ", rotationAvailable=" + this.rotationAvailable + ", showContent=" + this.showContent + ", content=" + this.content + ')';
        }

        public /* synthetic */ a(Bitmap bitmap, File file, int i12, h hVar, boolean z12, boolean z13, Content content, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? null : bitmap, (i13 & 2) != 0 ? null : file, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? null : hVar, (i13 & 16) != 0 ? false : z12, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? null : content);
        }

        public static /* synthetic */ a a(a aVar, Bitmap bitmap, File file, int i12, h hVar, boolean z12, boolean z13, Content content, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                bitmap = aVar.bitmap;
            }
            if ((i13 & 2) != 0) {
                file = aVar.bitmapFile;
            }
            File file2 = file;
            if ((i13 & 4) != 0) {
                i12 = aVar.degree;
            }
            int i14 = i12;
            if ((i13 & 8) != 0) {
                hVar = aVar.warning;
            }
            h hVar2 = hVar;
            if ((i13 & 16) != 0) {
                z12 = aVar.rotationAvailable;
            }
            boolean z14 = z12;
            if ((i13 & 32) != 0) {
                z13 = aVar.showContent;
            }
            boolean z15 = z13;
            if ((i13 & 64) != 0) {
                content = aVar.content;
            }
            return aVar.a(bitmap, file2, i14, hVar2, z14, z15, content);
        }

        public a(@Y61.l Bitmap bitmap, @Y61.l File file, int i12, @Y61.l h hVar, boolean z12, boolean z13, @Y61.l Content content) {
            this.bitmap = bitmap;
            this.bitmapFile = file;
            this.degree = i12;
            this.warning = hVar;
            this.rotationAvailable = z12;
            this.showContent = z13;
            this.content = content;
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$onWarningAccepted$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {697}, m = "invokeSuspend", n = {}, s = {})
    public static final class a0 extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435068a;

        public a0(Continuation<? super a0> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((a0) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRPreviewPhotoDocumentViewModel.this.new a0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f435068a;
            if (i12 == 0) {
                C42729a0.b(obj);
                CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel = CBRPreviewPhotoDocumentViewModel.this;
                this.f435068a = 1;
                if (cBRPreviewPhotoDocumentViewModel.a(true, (Continuation<? super G0>) this) == coroutine_suspended) {
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

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {0}, l = {602}, m = "prepareAvailableDocuments", n = {"this"}, s = {"L$0"})
    public static final class b0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435070a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435071b;

        /* renamed from: d, reason: collision with root package name */
        int f435073d;

        public b0(Continuation<? super b0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435071b = obj;
            this.f435073d |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPreviewPhotoDocumentViewModel.this.c(this);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$c;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$c$a;", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$c$b;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class c implements CBRViewModel.CBRViewModelEvent, Parcelable {

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @K51.d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$c$a;", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$c;", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$d;", "pickerRequest", "<init>", "(Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$d;", "b", "()Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$d;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class a extends c {

            @Y61.k
            public static final Parcelable.Creator<a> CREATOR = new C12528a();

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final d pickerRequest;

            /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            /* renamed from: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$c$a$a, reason: collision with other inner class name */
            public static final class C12528a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(@Y61.k Parcel parcel) {
                    return new a(d.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i12) {
                    return new a[i12];
                }
            }

            public a(@Y61.k d dVar) {
                super(null);
                this.pickerRequest = dVar;
            }

            @Y61.k
            /* renamed from: b, reason: from getter */
            public final d getPickerRequest() {
                return this.pickerRequest;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && L.f(this.pickerRequest, ((a) other).pickerRequest);
            }

            public int hashCode() {
                return this.pickerRequest.hashCode();
            }

            @Y61.k
            public String toString() {
                return "PhotoPickerRequestAction(pickerRequest=" + this.pickerRequest + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@Y61.k Parcel parcel, int flags) {
                this.pickerRequest.writeToParcel(parcel, flags);
            }
        }

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @K51.d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$c$b;", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$c;", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$d;", "pickerRequest", "<init>", "(Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$d;", "b", "()Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$d;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class b extends c {

            @Y61.k
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final d pickerRequest;

            /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            public static final class a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(@Y61.k Parcel parcel) {
                    return new b(d.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i12) {
                    return new b[i12];
                }
            }

            public b(@Y61.k d dVar) {
                super(null);
                this.pickerRequest = dVar;
            }

            @Y61.k
            /* renamed from: b, reason: from getter */
            public final d getPickerRequest() {
                return this.pickerRequest;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && L.f(this.pickerRequest, ((b) other).pickerRequest);
            }

            public int hashCode() {
                return this.pickerRequest.hashCode();
            }

            @Y61.k
            public String toString() {
                return "SelfieRequestAction(pickerRequest=" + this.pickerRequest + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@Y61.k Parcel parcel, int flags) {
                this.pickerRequest.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        private c() {
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$removePickedFiles$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c0 extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435076a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<File> f435077b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c0(List<? extends File> list, Continuation<? super c0> continuation) {
            super(2, continuation);
            this.f435077b = list;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((c0) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c0(this.f435077b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435076a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            for (File file : this.f435077b) {
                ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "deleting " + file.getAbsolutePath(), null, 4, null);
                file.delete();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$sendLog$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d0 extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435084a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f435085b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f435086c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Exception f435087d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(String str, Exception exc, Continuation<? super d0> continuation) {
            super(2, continuation);
            this.f435086c = str;
            this.f435087d = exc;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((d0) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d0 d0Var = new d0(this.f435086c, this.f435087d, continuation);
            d0Var.f435085b = obj;
            return d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435084a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            ru.cyberity.log.a.f436064a.a(LoggerType.KIBANA).e(ru.cyberity.log.c.a((T) this.f435085b), this.f435086c, this.f435087d);
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$e;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", "message", "buttonPositive", "buttonNegative", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/CharSequence;", "f", "()Ljava/lang/CharSequence;", "b", "e", "c", "d", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class e implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence message;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence buttonPositive;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence buttonNegative;

        public e(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3) {
            this.message = charSequence;
            this.buttonPositive = charSequence2;
            this.buttonNegative = charSequence3;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final CharSequence getButtonNegative() {
            return this.buttonNegative;
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final CharSequence getButtonPositive() {
            return this.buttonPositive;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return L.f(this.message, eVar.message) && L.f(this.buttonPositive, eVar.buttonPositive) && L.f(this.buttonNegative, eVar.buttonNegative);
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final CharSequence getMessage() {
            return this.message;
        }

        public int hashCode() {
            CharSequence charSequence = this.message;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.buttonPositive;
            int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.buttonNegative;
            return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ShowAnotherSideAction(message=");
            sb2.append((Object) this.message);
            sb2.append(", buttonPositive=");
            sb2.append((Object) this.buttonPositive);
            sb2.append(", buttonNegative=");
            return AK.c.r(sb2, this.buttonNegative, ')');
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$a;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$setImageRotation$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e0 extends SuspendLambda implements Y41.p<a, Continuation<? super a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435091a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435092b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f435093c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(int i12, Continuation<? super e0> continuation) {
            super(2, continuation);
            this.f435093c = i12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k a aVar, @Y61.l Continuation<? super a> continuation) {
            return ((e0) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e0 e0Var = new e0(this.f435093c, continuation);
            e0Var.f435092b = obj;
            return e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435091a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return a.a((a) this.f435092b, null, null, this.f435093c, null, false, false, null, 123, null);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$f;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "Lru/cyberity/cbr/core/domain/model/c;", "introParams", "Landroid/os/Parcelable;", "payload", "<init>", "(Lru/cyberity/cbr/core/domain/model/c;Landroid/os/Parcelable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/domain/model/c;", "c", "()Lru/cyberity/cbr/core/domain/model/c;", "b", "Landroid/os/Parcelable;", "d", "()Landroid/os/Parcelable;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class f implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final ru.cyberity.cbr.core.domain.model.c introParams;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Parcelable payload;

        public f(@Y61.k ru.cyberity.cbr.core.domain.model.c cVar, @Y61.l Parcelable parcelable) {
            this.introParams = cVar;
            this.payload = parcelable;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final ru.cyberity.cbr.core.domain.model.c getIntroParams() {
            return this.introParams;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Parcelable getPayload() {
            return this.payload;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return L.f(this.introParams, fVar.introParams) && L.f(this.payload, fVar.payload);
        }

        public int hashCode() {
            int iHashCode = this.introParams.hashCode() * 31;
            Parcelable parcelable = this.payload;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ShowInstructions(introParams=");
            sb2.append(this.introParams);
            sb2.append(", payload=");
            return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.payload, ')');
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {0, 0, 1, 1}, l = {718, 728}, m = "showCamera$suspendImpl", n = {"$this", "isRetake", "$this", "applicant"}, s = {"L$0", "Z$0", "L$0", "L$1"})
    public static final class f0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435096a;

        /* renamed from: b, reason: collision with root package name */
        Object f435097b;

        /* renamed from: c, reason: collision with root package name */
        boolean f435098c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f435099d;

        /* renamed from: f, reason: collision with root package name */
        int f435101f;

        public f0(Continuation<? super f0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435099d = obj;
            this.f435101f |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPreviewPhotoDocumentViewModel.a(CBRPreviewPhotoDocumentViewModel.this, false, (Continuation) this);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$g;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "Lru/cyberity/ml/core/d$a;", "Lru/cyberity/ml/badphotos/models/a;", "debugPhotoQualityResult", "<init>", "(Lru/cyberity/ml/core/d$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/ml/core/d$a;", "b", "()Lru/cyberity/ml/core/d$a;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class g implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final d.a<ru.cyberity.ml.badphotos.models.a> debugPhotoQualityResult;

        public g(@Y61.k d.a<ru.cyberity.ml.badphotos.models.a> aVar) {
            this.debugPhotoQualityResult = aVar;
        }

        @Y61.k
        public final d.a<ru.cyberity.ml.badphotos.models.a> b() {
            return this.debugPhotoQualityResult;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && L.f(this.debugPhotoQualityResult, ((g) other).debugPhotoQualityResult);
        }

        public int hashCode() {
            return this.debugPhotoQualityResult.hashCode();
        }

        @Y61.k
        public String toString() {
            return "ShowPhotoAnalyzeDebugInfoAction(debugPhotoQualityResult=" + this.debugPhotoQualityResult + ')';
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$a;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$showCamera$2", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g0 extends SuspendLambda implements Y41.p<a, Continuation<? super a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435103a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435104b;

        public g0(Continuation<? super g0> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k a aVar, @Y61.l Continuation<? super a> continuation) {
            return ((g0) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g0 g0Var = new g0(continuation);
            g0Var.f435104b = obj;
            return g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435103a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return a.a((a) this.f435104b, null, null, 0, null, false, false, null, 95, null);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$a;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$showContent$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h0 extends SuspendLambda implements Y41.p<a, Continuation<? super a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435112a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435113b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f435114c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(boolean z12, Continuation<? super h0> continuation) {
            super(2, continuation);
            this.f435114c = z12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k a aVar, @Y61.l Continuation<? super a> continuation) {
            return ((h0) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h0 h0Var = new h0(this.f435114c, continuation);
            h0Var.f435113b = obj;
            return h0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435112a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return a.a((a) this.f435113b, null, null, 0, null, false, this.f435114c, null, 95, null);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class i {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f435115a;

        static {
            int[] iArr = new int[DocumentSideness.values().length];
            iArr[DocumentSideness.DOUBLE.ordinal()] = 1;
            iArr[DocumentSideness.SINGLE.ordinal()] = 2;
            f435115a = iArr;
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$showPhoto$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {0, 2, 3, 3, 4, 4, 4}, l = {282, 295, 301, 310, 316, 326, 334}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch", "bm", "$this$launch", "bm", "photoQualityCheck"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class i0 extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435116a;

        /* renamed from: b, reason: collision with root package name */
        Object f435117b;

        /* renamed from: c, reason: collision with root package name */
        int f435118c;

        /* renamed from: d, reason: collision with root package name */
        int f435119d;

        /* renamed from: e, reason: collision with root package name */
        int f435120e;

        /* renamed from: f, reason: collision with root package name */
        int f435121f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f435122g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.core.data.model.o f435124i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Y41.a<G0> f435125j;

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$a;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$showPhoto$1$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<a, Continuation<? super a>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f435126a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f435127b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a aVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f435127b = aVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k a aVar, @Y61.l Continuation<? super a> continuation) {
                return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f435127b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f435126a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return a.a(this.f435127b, null, null, 0, null, false, true, null, 95, null);
            }
        }

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$showPhoto$1$state$bitmap$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f435128a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f435129b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f435130c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable th2, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f435130c = th2;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                b bVar = new b(this.f435130c, continuation);
                bVar.f435129b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f435128a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                ru.cyberity.log.a.f436064a.a(LoggerType.KIBANA).e(ru.cyberity.log.c.a((T) this.f435129b), "Can't decode PDF", this.f435130c);
                return G0.f406611a;
            }
        }

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lru/cyberity/ml/core/d$a;", "Lru/cyberity/ml/badphotos/models/a;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$showPhoto$1$state$photoQualityCheck$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {310}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.l<Continuation<? super d.a<ru.cyberity.ml.badphotos.models.a>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f435131a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CBRPreviewPhotoDocumentViewModel f435132b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bitmap f435133c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel, Bitmap bitmap, Continuation<? super c> continuation) {
                super(1, continuation);
                this.f435132b = cBRPreviewPhotoDocumentViewModel;
                this.f435133c = bitmap;
            }

            @Override // Y41.l
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.l Continuation<? super d.a<ru.cyberity.ml.badphotos.models.a>> continuation) {
                return ((c) create(continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
                return new c(this.f435132b, this.f435133c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f435131a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel = this.f435132b;
                    Bitmap bitmap = this.f435133c;
                    this.f435131a = 1;
                    obj = cBRPreviewPhotoDocumentViewModel.a(bitmap, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ru.cyberity.cbr.core.data.model.o oVar, Y41.a<G0> aVar, Continuation<? super i0> continuation) {
            super(2, continuation);
            this.f435124i = oVar;
            this.f435125j = aVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((i0) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            i0 i0Var = CBRPreviewPhotoDocumentViewModel.this.new i0(this.f435124i, this.f435125j, continuation);
            i0Var.f435122g = obj;
            return i0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x027e  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0282  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0285  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0292  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x02b9  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x02bc  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x02c0  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x02c3  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x02e3  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0161 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01bc  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0219 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x026c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x026d  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x027b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 766
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.i0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {0}, l = {617}, m = "analyzePhoto", n = {"this"}, s = {"L$0"})
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435134a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435135b;

        /* renamed from: d, reason: collision with root package name */
        int f435137d;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435135b = obj;
            this.f435137d |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPreviewPhotoDocumentViewModel.this.a((Bitmap) null, this);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {0, 1}, l = {190, 191, 192}, m = "showSecondSidePrompt", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class j0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435138a;

        /* renamed from: b, reason: collision with root package name */
        Object f435139b;

        /* renamed from: c, reason: collision with root package name */
        Object f435140c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f435141d;

        /* renamed from: f, reason: collision with root package name */
        int f435143f;

        public j0(Continuation<? super j0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435141d = obj;
            this.f435143f |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPreviewPhotoDocumentViewModel.this.e(this);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {0, 1, 2}, l = {637, 638, 641, 645}, m = "getContent", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435144a;

        /* renamed from: b, reason: collision with root package name */
        Object f435145b;

        /* renamed from: c, reason: collision with root package name */
        Object f435146c;

        /* renamed from: d, reason: collision with root package name */
        Object f435147d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f435148e;

        /* renamed from: g, reason: collision with root package name */
        int f435150g;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435148e = obj;
            this.f435150g |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPreviewPhotoDocumentViewModel.this.a(this);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$a;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$showUploadingState$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {0}, l = {447}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    public static final class k0 extends SuspendLambda implements Y41.p<a, Continuation<? super a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435151a;

        /* renamed from: b, reason: collision with root package name */
        int f435152b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f435153c;

        public k0(Continuation<? super k0> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k a aVar, @Y61.l Continuation<? super a> continuation) {
            return ((k0) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            k0 k0Var = CBRPreviewPhotoDocumentViewModel.this.new k0(continuation);
            k0Var.f435153c = obj;
            return k0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            a aVar;
            Object string;
            Content content;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f435152b;
            if (i12 == 0) {
                C42729a0.b(obj);
                aVar = (a) this.f435153c;
                Content content2 = ((a) CBRPreviewPhotoDocumentViewModel.this.currentState()).getContent();
                Content contentA = content2 != null ? content2.a(null, null, null, null, null) : null;
                CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel = CBRPreviewPhotoDocumentViewModel.this;
                this.f435153c = aVar;
                this.f435151a = contentA;
                this.f435152b = 1;
                string = cBRPreviewPhotoDocumentViewModel.getString("sns_preview_uploading_title", this);
                if (string == coroutine_suspended) {
                    return coroutine_suspended;
                }
                content = contentA;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Content content3 = (Content) this.f435151a;
                aVar = (a) this.f435153c;
                C42729a0.b(obj);
                string = obj;
                content = content3;
            }
            a aVar2 = aVar;
            String str = (String) string;
            if (str == null) {
                str = "Uploading";
            }
            return a.a(aVar2, null, null, 0, new h(str, null, null, null, false, false, true), false, true, content, 7, null);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {0, 0, 0, 1, 1, 1, 4}, l = {654, 655, 660, 667, 676, 680, 686}, m = "getContent", n = {"this", "ff", "score", "this", "ff", "score", "this"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0", "L$0"})
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435155a;

        /* renamed from: b, reason: collision with root package name */
        Object f435156b;

        /* renamed from: c, reason: collision with root package name */
        Object f435157c;

        /* renamed from: d, reason: collision with root package name */
        float f435158d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f435159e;

        /* renamed from: g, reason: collision with root package name */
        int f435161g;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435159e = obj;
            this.f435161g |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPreviewPhotoDocumentViewModel.this.a((d.a<ru.cyberity.ml.badphotos.models.a>) null, this);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {0}, l = {825}, m = "getDocumentSideness", n = {"documentsForCountry"}, s = {"L$0"})
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435162a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435163b;

        /* renamed from: d, reason: collision with root package name */
        int f435165d;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435163b = obj;
            this.f435165d |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPreviewPhotoDocumentViewModel.this.a((String) null, (String) null, this);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {0, 0}, l = {873}, m = "getIdDocTypesForCountry", n = {"this", "countryKey"}, s = {"L$0", "L$1"})
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435166a;

        /* renamed from: b, reason: collision with root package name */
        Object f435167b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f435168c;

        /* renamed from: e, reason: collision with root package name */
        int f435170e;

        public n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435168c = obj;
            this.f435170e |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPreviewPhotoDocumentViewModel.this.a((String) null, this);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {0, 0}, l = {851}, m = "idDocList", n = {"this", "countryKey"}, s = {"L$0", "L$1"})
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435171a;

        /* renamed from: b, reason: collision with root package name */
        Object f435172b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f435173c;

        /* renamed from: e, reason: collision with root package name */
        int f435175e;

        public o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435173c = obj;
            this.f435175e |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPreviewPhotoDocumentViewModel.this.b((String) null, this);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$onDataIsReadableClicked$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {171, 176}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435176a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f435178c;

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f435179a;

            static {
                int[] iArr = new int[IdentitySide.values().length];
                iArr[IdentitySide.Front.ordinal()] = 1;
                iArr[IdentitySide.Back.ordinal()] = 2;
                f435179a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(int i12, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f435178c = i12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((p) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRPreviewPhotoDocumentViewModel.this.new p(this.f435178c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f435176a;
            if (i12 == 0) {
                C42729a0.b(obj);
                CBREventHandler eventHandler = n0.f432787a.getEventHandler();
                if (eventHandler != null) {
                    eventHandler.onEvent(new CBREvent.PhotoAccepted(CBRPreviewPhotoDocumentViewModel.this.getDocument().getType().getValue()));
                }
                CBRPreviewPhotoDocumentViewModel.this.b(this.f435178c);
                ru.cyberity.cbr.core.data.source.dynamic.c dataRepository = CBRPreviewPhotoDocumentViewModel.this.getDataRepository();
                this.f435176a = 1;
                obj = ru.cyberity.cbr.core.data.source.dynamic.c.c(dataRepository, null, false, this, 3, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                C42729a0.b(obj);
            }
            ru.cyberity.cbr.core.data.model.g gVar = (ru.cyberity.cbr.core.data.model.g) ((ru.cyberity.cbr.core.data.source.dynamic.a) obj).d();
            g.c.a aVarA = gVar != null ? gVar.a(CBRPreviewPhotoDocumentViewModel.this.getDocument().getType()) : null;
            if ((aVarA == null || !aVarA.v()) && (aVarA == null || !aVarA.u())) {
                int i13 = a.f435179a[CBRPreviewPhotoDocumentViewModel.this.r().ordinal()];
                if (i13 == 1) {
                    CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel = CBRPreviewPhotoDocumentViewModel.this;
                    this.f435176a = 2;
                    if (cBRPreviewPhotoDocumentViewModel.d(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i13 == 2) {
                    CBRPreviewPhotoDocumentViewModel.this.t();
                }
            } else {
                CBRPreviewPhotoDocumentViewModel.this.t();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/o;", "it", "", "a", "(Lru/cyberity/cbr/core/data/model/o;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    public static final class q extends N implements Y41.l<ru.cyberity.cbr.core.data.model.o, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.core.data.model.o f435180a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ru.cyberity.cbr.core.data.model.o oVar) {
            super(1);
            this.f435180a = oVar;
        }

        @Override // Y41.l
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@Y61.k ru.cyberity.cbr.core.data.model.o oVar) {
            return Boolean.valueOf(oVar.getSide() == this.f435180a.getSide());
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$onDocumentSideAnswerClicked$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435181a;

        public r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((r) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRPreviewPhotoDocumentViewModel.this.new r(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f435181a;
            if (i12 == 0) {
                C42729a0.b(obj);
                CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel = CBRPreviewPhotoDocumentViewModel.this;
                this.f435181a = 1;
                if (cBRPreviewPhotoDocumentViewModel.a(false, (Continuation<? super G0>) this) == coroutine_suspended) {
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

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$onDocumentsPicked$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435183a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<ru.cyberity.cbr.core.data.model.o> f435184b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CBRPreviewPhotoDocumentViewModel f435185c;

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 7, 1})
        public static final class a extends N implements Y41.a<G0> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CBRPreviewPhotoDocumentViewModel f435186a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel) {
                super(0);
                this.f435186a = cBRPreviewPhotoDocumentViewModel;
            }

            public final void a() {
                this.f435186a.t();
            }

            @Override // Y41.a
            public /* bridge */ /* synthetic */ G0 invoke() {
                a();
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(List<ru.cyberity.cbr.core.data.model.o> list, CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f435184b = list;
            this.f435185c = cBRPreviewPhotoDocumentViewModel;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((s) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new s(this.f435184b, this.f435185c, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object objG;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435183a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            for (ru.cyberity.cbr.core.data.model.o oVar : this.f435184b) {
                ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "result: " + oVar, null, 4, null);
            }
            CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel = this.f435185c;
            List<ru.cyberity.cbr.core.data.model.o> list = this.f435184b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ru.cyberity.cbr.core.data.model.o oVar2 = (ru.cyberity.cbr.core.data.model.o) it.next();
                objG = L.f(oVar2.getType(), "DEBUG") ? null : cBRPreviewPhotoDocumentViewModel.g();
                arrayList.add(ru.cyberity.cbr.core.data.model.o.a(oVar2, null, null, null, objG == null ? "DEBUG" : objG, null, false, null, 119, null));
            }
            cBRPreviewPhotoDocumentViewModel.b(arrayList);
            Iterator<T> it2 = this.f435185c.o().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (!L.f(((ru.cyberity.cbr.core.data.model.o) next).getType(), "DEBUG")) {
                    objG = next;
                    break;
                }
            }
            ru.cyberity.cbr.core.data.model.o oVar3 = (ru.cyberity.cbr.core.data.model.o) objG;
            if (oVar3 != null) {
                CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel2 = this.f435185c;
                cBRPreviewPhotoDocumentViewModel2.a(oVar3, new a(cBRPreviewPhotoDocumentViewModel2));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {0, 0, 1, 2}, l = {476, 570, 572}, m = "onDocumentsUploadedSuccess", n = {"this", "idDocs", "this", "this"}, s = {"L$0", "L$1", "L$0", "L$0"})
    public static final class t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435187a;

        /* renamed from: b, reason: collision with root package name */
        Object f435188b;

        /* renamed from: c, reason: collision with root package name */
        Object f435189c;

        /* renamed from: d, reason: collision with root package name */
        Object f435190d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f435191e;

        /* renamed from: g, reason: collision with root package name */
        int f435193g;

        public t(Continuation<? super t> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435191e = obj;
            this.f435193g |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPreviewPhotoDocumentViewModel.this.a((List<ru.cyberity.cbr.core.data.model.remote.k>) null, this);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$onDocumentsUploadedSuccess$3", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class v extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435212a;

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$a;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$onDocumentsUploadedSuccess$3$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<a, Continuation<? super a>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f435214a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f435215b;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k a aVar, @Y61.l Continuation<? super a> continuation) {
                return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.f435215b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f435214a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return a.a((a) this.f435215b, null, null, 0, null, true, false, null, 103, null);
            }
        }

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
            return CBRPreviewPhotoDocumentViewModel.this.new v(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435212a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            CBRPreviewPhotoDocumentViewModel.this.a(false);
            CBRViewModel.updateState$default(CBRPreviewPhotoDocumentViewModel.this, false, new a(null), 1, null);
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {0}, l = {129}, m = "onPrepare$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class w extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435216a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435217b;

        /* renamed from: d, reason: collision with root package name */
        int f435219d;

        public w(Continuation<? super w> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435217b = obj;
            this.f435219d |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRPreviewPhotoDocumentViewModel.e(CBRPreviewPhotoDocumentViewModel.this, this);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$a;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$onPrepare$2", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class x extends SuspendLambda implements Y41.p<a, Continuation<? super a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435220a;

        /* renamed from: b, reason: collision with root package name */
        int f435221b;

        /* renamed from: c, reason: collision with root package name */
        int f435222c;

        /* renamed from: d, reason: collision with root package name */
        int f435223d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f435224e;

        public x(Continuation<? super x> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k a aVar, @Y61.l Continuation<? super a> continuation) {
            return ((x) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            x xVar = CBRPreviewPhotoDocumentViewModel.this.new x(continuation);
            xVar.f435224e = obj;
            return xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            a aVar;
            int i12;
            int i13;
            int i14;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i15 = this.f435223d;
            if (i15 == 0) {
                C42729a0.b(obj);
                aVar = (a) this.f435224e;
                CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel = CBRPreviewPhotoDocumentViewModel.this;
                this.f435224e = aVar;
                this.f435220a = 0;
                this.f435221b = 0;
                this.f435222c = 0;
                this.f435223d = 1;
                obj = cBRPreviewPhotoDocumentViewModel.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i12 = 0;
                i13 = 0;
                i14 = 0;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = this.f435222c;
                i13 = this.f435221b;
                int i16 = this.f435220a;
                aVar = (a) this.f435224e;
                C42729a0.b(obj);
                i14 = i16;
            }
            return a.a(aVar, null, null, i14, null, i13 != 0, i12 != 0, (Content) obj, 63, null);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$onTakeAnotherDataClicked$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class y extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435226a;

        public y(Continuation<? super y> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((y) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRPreviewPhotoDocumentViewModel.this.new y(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f435226a;
            if (i12 == 0) {
                C42729a0.b(obj);
                CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel = CBRPreviewPhotoDocumentViewModel.this;
                this.f435226a = 1;
                if (cBRPreviewPhotoDocumentViewModel.a(false, (Continuation<? super G0>) this) == coroutine_suspended) {
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

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$onUploadDocuments$3", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {420, 430}, m = "invokeSuspend", n = {}, s = {})
    public static final class z extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435228a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f435230c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f435231d;

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class a extends C42801a implements Y41.p<Exception, Continuation<? super G0>, Object>, SuspendFunction {
            public a(Object obj) {
                super(2, obj, CBRPreviewPhotoDocumentViewModel.class, "onDocumentsUploadedError", "onDocumentsUploadedError(Ljava/lang/Exception;)V", 4);
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k Exception exc, @Y61.k Continuation<? super G0> continuation) {
                return z.b((CBRPreviewPhotoDocumentViewModel) this.receiver, exc, continuation);
            }
        }

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class b extends H implements Y41.p<List<? extends ru.cyberity.cbr.core.data.model.remote.k>, Continuation<? super G0>, Object>, SuspendFunction {
            public b(Object obj) {
                super(2, obj, CBRPreviewPhotoDocumentViewModel.class, "onDocumentsUploadedSuccess", "onDocumentsUploadedSuccess(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k List<ru.cyberity.cbr.core.data.model.remote.k> list, @Y61.k Continuation<? super G0> continuation) {
                return ((CBRPreviewPhotoDocumentViewModel) this.receiver).a(list, continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(boolean z12, boolean z13, Continuation<? super z> continuation) {
            super(2, continuation);
            this.f435230c = z12;
            this.f435231d = z13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object b(CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel, Exception exc, Continuation continuation) {
            cBRPreviewPhotoDocumentViewModel.a(exc);
            return G0.f406611a;
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
            return CBRPreviewPhotoDocumentViewModel.this.new z(this.f435230c, this.f435231d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f435228a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.domain.m mVar = CBRPreviewPhotoDocumentViewModel.this.uploadDocumentImagesUseCase;
                m.a aVar = new m.a(CBRPreviewPhotoDocumentViewModel.this.getDocument(), CBRPreviewPhotoDocumentViewModel.this.d(), CBRPreviewPhotoDocumentViewModel.this.o(), this.f435230c, this.f435231d);
                this.f435228a = 1;
                obj = mVar.a((ru.cyberity.cbr.domain.m) aVar, (Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ? extends List<ru.cyberity.cbr.core.data.model.remote.k>>>) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                C42729a0.b(obj);
            }
            a aVar2 = new a(CBRPreviewPhotoDocumentViewModel.this);
            b bVar = new b(CBRPreviewPhotoDocumentViewModel.this);
            this.f435228a = 2;
            if (ru.cyberity.cbr.core.domain.base.c.a((ru.cyberity.cbr.core.domain.model.a) obj, aVar2, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    static {
        Y y12 = new Y(CBRPreviewPhotoDocumentViewModel.class, "documentSideness", "getDocumentSideness()Lru/cyberity/cbr/presentation/screen/preview/photo/identity/DocumentSideness;", 0);
        kotlin.jvm.internal.n0 n0Var = m0.f406844a;
        f435043x = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(CBRPreviewPhotoDocumentViewModel.class, "side", "getSide()Lru/cyberity/cbr/core/data/model/IdentitySide;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CBRPreviewPhotoDocumentViewModel.class, "pickerResults", "getPickerResults()Ljava/util/List;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CBRPreviewPhotoDocumentViewModel.class, "showPhotoPickerOnStart", "getShowPhotoPickerOnStart()Z", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CBRPreviewPhotoDocumentViewModel.class, "analyticsPayload", "getAnalyticsPayload()Lru/cyberity/ml/badphotos/models/CheckPhotoQualityResult;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CBRPreviewPhotoDocumentViewModel.class, "blockedAttemptCounter", "getBlockedAttemptCounter()I", 0, n0Var)};
        INSTANCE = new Companion(null);
        f435041F = new String[]{"shouldBeDoubleSided", "sameSides", "inconsistentDocument"};
    }

    public CBRPreviewPhotoDocumentViewModel(@Y61.k Document document, @Y61.k C23060r0 c23060r0, @Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @Y61.k ru.cyberity.cbr.core.data.source.extensions.a aVar2, @Y61.k ru.cyberity.cbr.domain.m mVar, @Y61.k ru.cyberity.cbr.core.common.k kVar, @Y61.k ru.cyberity.ml.core.d<Bitmap, ru.cyberity.ml.badphotos.models.a> dVar, @Y61.k ru.cyberity.cbr.core.domain.b bVar) {
        super(document, c23060r0, aVar, cVar, bVar);
        this.extensions = aVar2;
        this.uploadDocumentImagesUseCase = mVar;
        this.rotationDetector = kVar;
        this.badPhotoDetector = dVar;
        this.documentSideness = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_DOCUMENT_SIDENESS", DocumentSideness.UNKNOWN);
        this.side = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_IDENTITY_SIDE", IdentitySide.Front);
        this.pickerResults = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_RESULTS", C42784z0.f406748b);
        this.showPhotoPickerOnStart = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "showPhotoPickerOnStart", Boolean.TRUE);
        this.analyticsPayload = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "analyticsPayload", new ru.cyberity.ml.badphotos.models.b(null, null, null, null, null, null, null, null, null, 511, null));
        this.blockedAttemptCounter = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "blockedAttemptCounter", 0);
    }

    private final void A() {
        ru.cyberity.cbr.core.analytics.b.f432519a.a(GlobalStatePayload.IdDocSubType, r().getValue());
    }

    private final int k() {
        return ((Number) this.blockedAttemptCounter.a(this, f435043x[5])).intValue();
    }

    private final boolean q() {
        return ((Boolean) this.showPhotoPickerOnStart.a(this, f435043x[3])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.t():void");
    }

    private final void x() {
        List<ru.cyberity.cbr.core.data.model.o> listO = o();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listO.iterator();
        while (it.hasNext()) {
            File raw = ((ru.cyberity.cbr.core.data.model.o) it.next()).getRaw();
            if (raw != null) {
                arrayList.add(raw);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "deleting " + arrayList.size() + " files", null, 4, null);
        C43259k.d(D0.f410691b, C43262l0.f411947c, null, new c0(arrayList, null), 2);
    }

    private final void z() {
        CBRViewModel.updateState$default(this, false, new k0(null), 1, null);
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.b
    @Y61.l
    public Object a(@Y61.l ru.cyberity.cbr.core.data.model.g gVar, @Y61.l ru.cyberity.cbr.core.data.model.e eVar, @Y61.k Continuation<? super G0> continuation) {
        return a(this, gVar, eVar, (Continuation) continuation);
    }

    @Y61.l
    public Object b(@Y61.k Continuation<? super CharSequence> continuation) {
        return d(this, continuation);
    }

    @Y61.l
    public Object d(@Y61.k Continuation<? super G0> continuation) {
        return f(this, continuation);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public a getDefaultState() {
        return new a(null, null, 0, null, false, false, null, 127, null);
    }

    @Y61.k
    public final DocumentSideness m() {
        return (DocumentSideness) this.documentSideness.a(this, f435043x[0]);
    }

    @Y61.k
    public final Map<String, Object> n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String checkResult = j().getCheckResult();
        if (checkResult != null) {
            linkedHashMap.put("checkResult", checkResult);
        }
        String checkModel = j().getCheckModel();
        if (checkModel != null) {
            linkedHashMap.put("checkModel", checkModel);
        }
        Float checkScore = j().getCheckScore();
        if (checkScore != null) {
            linkedHashMap.put("checkScore", Float.valueOf(checkScore.floatValue()));
        }
        Long checkTime = j().getCheckTime();
        if (checkTime != null) {
            linkedHashMap.put("checkTime", Long.valueOf(checkTime.longValue()));
        }
        Float lowThreshold = j().getLowThreshold();
        if (lowThreshold != null) {
            linkedHashMap.put("checkLowThreshold", Float.valueOf(lowThreshold.floatValue()));
        }
        Integer checkBadAttempts = j().getCheckBadAttempts();
        if (checkBadAttempts != null) {
            org.webrtc.h.i(checkBadAttempts, "checkBadAttempts", linkedHashMap);
        }
        Integer checkMaxBlockedAttempts = j().getCheckMaxBlockedAttempts();
        if (checkMaxBlockedAttempts != null) {
            org.webrtc.h.i(checkMaxBlockedAttempts, "checkMaxBlockedAttempts", linkedHashMap);
        }
        Boolean isAutocaptured = j().getIsAutocaptured();
        if (isAutocaptured != null) {
            linkedHashMap.put("isAutocaptured", isAutocaptured);
        }
        return linkedHashMap;
    }

    @Y61.k
    public final List<ru.cyberity.cbr.core.data.model.o> o() {
        return (List) this.pickerResults.a(this, f435043x[2]);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    public void onHandleError(@Y61.k ru.cyberity.cbr.core.data.model.p error) {
        Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Preview photo error handling... " + error, null, 4, null);
        if (error instanceof p.b) {
            t();
        }
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.b, ru.cyberity.cbr.core.presentation.base.CBRViewModel
    public void onLoad() {
        if (o().isEmpty()) {
            super.onLoad();
        } else {
            a(this, (ru.cyberity.cbr.core.data.model.o) C42745f0.Q(o()), (Y41.a) null, 2, (Object) null);
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.l
    public Object onPrepare(@Y61.k Continuation<? super G0> continuation) {
        return e(this, continuation);
    }

    public final boolean p() {
        ru.cyberity.cbr.core.data.model.e config = getConfig();
        if (config != null) {
            return ru.cyberity.cbr.core.data.model.f.d(config, getDocument().getType().getValue());
        }
        return false;
    }

    @Y61.k
    public final IdentitySide r() {
        return (IdentitySide) this.side.a(this, f435043x[1]);
    }

    public final void s() {
        x();
    }

    public void u() {
        y();
        C43259k.d(N0.a(this), null, null, new a0(null), 3);
    }

    public final void v() {
        a(getDocument());
    }

    @Y61.k
    public final List<IdentitySide> w() {
        boolean zG2 = ru.cyberity.ff.a.f435638a.n().g();
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", com.avito.android.bxcontent.mvi.entity.f.l("seamlessDocaptureFeature=", zG2), null, 4, null);
        if (!zG2) {
            return Collections.singletonList(r());
        }
        int i12 = i.f435115a[m().ordinal()];
        if (i12 != 1) {
            return i12 != 2 ? Collections.singletonList(IdentitySide.Front) : Collections.singletonList(IdentitySide.Front);
        }
        List listU = C42745f0.U(IdentitySide.Front, IdentitySide.Back);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU) {
            IdentitySide identitySide = (IdentitySide) obj;
            List<ru.cyberity.cbr.core.data.model.o> listO = o();
            if (!(listO instanceof Collection) || !listO.isEmpty()) {
                Iterator<T> it = listO.iterator();
                while (it.hasNext()) {
                    if (((ru.cyberity.cbr.core.data.model.o) it.next()).getSide() == identitySide) {
                        break;
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void y() {
        a(IdentitySide.Front);
        ArrayList arrayList = new ArrayList(o());
        arrayList.clear();
        b(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object e(ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.w
            if (r0 == 0) goto L13
            r0 = r5
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$w r0 = (ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.w) r0
            int r1 = r0.f435219d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f435219d = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$w r0 = new ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$w
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f435217b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f435219d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f435216a
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel r4 = (ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel) r4
            kotlin.C42729a0.b(r5)
            goto L43
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r5)
            r0.f435216a = r4
            r0.f435219d = r3
            java.lang.Object r5 = super.onPrepare(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$x r5 = new ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$x
            r0 = 0
            r5.<init>(r0)
            r1 = 0
            ru.cyberity.cbr.core.presentation.base.CBRViewModel.updateState$default(r4, r1, r5, r3, r0)
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.e(ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object f(CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel, Continuation continuation) {
        Object objE = cBRPreviewPhotoDocumentViewModel.e((Continuation<? super G0>) continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.cyberity.ml.badphotos.models.b j() {
        return (ru.cyberity.ml.badphotos.models.b) this.analyticsPayload.a(this, f435043x[4]);
    }

    @Y61.l
    public Object a(boolean z12, @Y61.k Continuation<? super G0> continuation) {
        return a(this, z12, continuation);
    }

    public void i() {
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "onTakeAnotherDataClicked", null, 4, null);
        CBREventHandler eventHandler = n0.f432787a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(new CBREvent.PhotoDeclined(getDocument().getType().getValue()));
        }
        C43259k.d(N0.a(this), null, null, new y(null), 3);
    }

    private final void c(boolean z12) {
        this.showPhotoPickerOnStart.a(this, f435043x[3], Boolean.valueOf(z12));
    }

    public static /* synthetic */ Object d(CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel, Continuation continuation) {
        return cBRPreviewPhotoDocumentViewModel.getString("sns_preview_photo_title", continuation);
    }

    @Y61.l
    public Object a(boolean z12, @Y61.k ru.cyberity.cbr.core.data.model.g gVar, @Y61.k Continuation<? super d> continuation) {
        return a(this, z12, gVar, continuation);
    }

    private final void c(int i12) {
        this.blockedAttemptCounter.a(this, f435043x[5], Integer.valueOf(i12));
    }

    public final void b(@Y61.k List<ru.cyberity.cbr.core.data.model.o> list) {
        this.pickerResults.a(this, f435043x[2], list);
    }

    @Y61.k
    public String d(@Y61.k String sourceKey) {
        ru.cyberity.cbr.core.data.model.e config = getConfig();
        return a(config != null ? ru.cyberity.cbr.core.data.model.f.j(config) : null, sourceKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> r9) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void b(boolean hasBack) {
        if (hasBack) {
            if (r() == IdentitySide.Front) {
                c(0);
                a(IdentitySide.Back);
            }
            A();
            C43259k.d(N0.a(this), null, null, new r(null), 3);
            return;
        }
        if (!o().isEmpty()) {
            List<ru.cyberity.cbr.core.data.model.o> listO = o();
            if (!(listO instanceof Collection) || !listO.isEmpty()) {
                Iterator<T> it = listO.iterator();
                while (it.hasNext()) {
                    if (!((ru.cyberity.cbr.core.data.model.o) it.next()).getSent()) {
                    }
                }
            }
            a(getDocument());
            return;
        }
        t();
    }

    public final void d(int rotation) {
        CBRViewModel.updateState$default(this, false, new e0(rotation, null), 1, null);
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$d;", "Landroid/os/Parcelable;", "Lru/cyberity/cbr/core/data/model/Document;", "document", "", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "sides", "", AdvertDetailsBlockIdKt.GALLERY_BLOCK, "", "identityType", "retake", "Lru/cyberity/cbr/camera/photo/presentation/document/DocCapture$PreferredMode;", "preferredMode", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;Ljava/util/List;ZLjava/lang/String;ZLru/cyberity/cbr/camera/photo/presentation/document/DocCapture$PreferredMode;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lru/cyberity/cbr/core/data/model/Document;", "g", "()Lru/cyberity/cbr/core/data/model/Document;", "b", "Ljava/util/List;", "l", "()Ljava/util/List;", "c", "Z", "h", "()Z", "d", "Ljava/lang/String;", "i", "e", "k", "f", "Lru/cyberity/cbr/camera/photo/presentation/document/DocCapture$PreferredMode;", "j", "()Lru/cyberity/cbr/camera/photo/presentation/document/DocCapture$PreferredMode;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class d implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final Document document;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final List<IdentitySide> sides;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean gallery;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String identityType;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean retake;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final DocCapture.PreferredMode preferredMode;

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(@Y61.k Parcel parcel) {
                Document document = (Document) parcel.readParcelable(d.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(IdentitySide.valueOf(parcel.readString()));
                }
                return new d(document, arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : DocCapture.PreferredMode.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i12) {
                return new d[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Y61.k Document document, @Y61.k List<? extends IdentitySide> list, boolean z12, @Y61.l String str, boolean z13, @Y61.l DocCapture.PreferredMode preferredMode) {
            this.document = document;
            this.sides = list;
            this.gallery = z12;
            this.identityType = str;
            this.retake = z13;
            this.preferredMode = preferredMode;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return L.f(this.document, dVar.document) && L.f(this.sides, dVar.sides) && this.gallery == dVar.gallery && L.f(this.identityType, dVar.identityType) && this.retake == dVar.retake && this.preferredMode == dVar.preferredMode;
        }

        @Y61.k
        /* renamed from: g, reason: from getter */
        public final Document getDocument() {
            return this.document;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getGallery() {
            return this.gallery;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iE2 = androidx.compose.foundation.H.e(this.document.hashCode() * 31, 31, this.sides);
            boolean z12 = this.gallery;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            int i13 = (iE2 + i12) * 31;
            String str = this.identityType;
            int iHashCode = (i13 + (str == null ? 0 : str.hashCode())) * 31;
            boolean z13 = this.retake;
            int i14 = (iHashCode + (z13 ? 1 : z13 ? 1 : 0)) * 31;
            DocCapture.PreferredMode preferredMode = this.preferredMode;
            return i14 + (preferredMode != null ? preferredMode.hashCode() : 0);
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final String getIdentityType() {
            return this.identityType;
        }

        @Y61.l
        /* renamed from: j, reason: from getter */
        public final DocCapture.PreferredMode getPreferredMode() {
            return this.preferredMode;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getRetake() {
            return this.retake;
        }

        @Y61.k
        public final List<IdentitySide> l() {
            return this.sides;
        }

        @Y61.k
        public String toString() {
            return "PickerRequest(document=" + this.document + ", sides=" + this.sides + ", gallery=" + this.gallery + ", identityType=" + this.identityType + ", retake=" + this.retake + ", preferredMode=" + this.preferredMode + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeParcelable(this.document, flags);
            Iterator itJ = C0.j(this.sides, parcel);
            while (itJ.hasNext()) {
                parcel.writeString(((IdentitySide) itJ.next()).name());
            }
            parcel.writeInt(this.gallery ? 1 : 0);
            parcel.writeString(this.identityType);
            parcel.writeInt(this.retake ? 1 : 0);
            DocCapture.PreferredMode preferredMode = this.preferredMode;
            if (preferredMode == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(preferredMode.name());
            }
        }

        public /* synthetic */ d(Document document, List list, boolean z12, String str, boolean z13, DocCapture.PreferredMode preferredMode, int i12, C42822w c42822w) {
            this(document, list, z12, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? false : z13, preferredMode);
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#¨\u0006("}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$h;", "", "", "title", "message", "buttonPrimary", "buttonSecondary", "", "isFatal", "showIcon", "loading", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/CharSequence;", "m", "()Ljava/lang/CharSequence;", "b", "k", "c", "h", "d", "i", "e", "Z", "n", "()Z", "f", "l", "g", "j", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class h {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence message;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence buttonPrimary;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence buttonSecondary;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean isFatal;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean showIcon;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean loading;

        public h(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3, @Y61.l CharSequence charSequence4, boolean z12, boolean z13, boolean z14) {
            this.title = charSequence;
            this.message = charSequence2;
            this.buttonPrimary = charSequence3;
            this.buttonSecondary = charSequence4;
            this.isFatal = z12;
            this.showIcon = z13;
            this.loading = z14;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return L.f(this.title, hVar.title) && L.f(this.message, hVar.message) && L.f(this.buttonPrimary, hVar.buttonPrimary) && L.f(this.buttonSecondary, hVar.buttonSecondary) && this.isFatal == hVar.isFatal && this.showIcon == hVar.showIcon && this.loading == hVar.loading;
        }

        @Y61.l
        /* renamed from: h, reason: from getter */
        public final CharSequence getButtonPrimary() {
            return this.buttonPrimary;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            CharSequence charSequence = this.title;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.message;
            int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.buttonPrimary;
            int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.buttonSecondary;
            int iHashCode4 = (iHashCode3 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31;
            boolean z12 = this.isFatal;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            int i13 = (iHashCode4 + i12) * 31;
            boolean z13 = this.showIcon;
            int i14 = z13;
            if (z13 != 0) {
                i14 = 1;
            }
            int i15 = (i13 + i14) * 31;
            boolean z14 = this.loading;
            return i15 + (z14 ? 1 : z14 ? 1 : 0);
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final CharSequence getButtonSecondary() {
            return this.buttonSecondary;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getLoading() {
            return this.loading;
        }

        @Y61.l
        /* renamed from: k, reason: from getter */
        public final CharSequence getMessage() {
            return this.message;
        }

        /* renamed from: l, reason: from getter */
        public final boolean getShowIcon() {
            return this.showIcon;
        }

        @Y61.l
        /* renamed from: m, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        /* renamed from: n, reason: from getter */
        public final boolean getIsFatal() {
            return this.isFatal;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("WarningResult(title=");
            sb2.append((Object) this.title);
            sb2.append(", message=");
            sb2.append((Object) this.message);
            sb2.append(", buttonPrimary=");
            sb2.append((Object) this.buttonPrimary);
            sb2.append(", buttonSecondary=");
            sb2.append((Object) this.buttonSecondary);
            sb2.append(", isFatal=");
            sb2.append(this.isFatal);
            sb2.append(", showIcon=");
            sb2.append(this.showIcon);
            sb2.append(", loading=");
            return androidx.appcompat.app.r.x(sb2, this.loading, ')');
        }

        public /* synthetic */ h(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
            this(charSequence, charSequence2, charSequence3, charSequence4, z12, (i12 & 32) != 0 ? true : z13, (i12 & 64) != 0 ? false : z14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.j0
            if (r0 == 0) goto L13
            r0 = r8
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$j0 r0 = (ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.j0) r0
            int r1 = r0.f435143f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f435143f = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$j0 r0 = new ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$j0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f435141d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f435143f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L63
            if (r2 == r5) goto L57
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f435140c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Object r2 = r0.f435139b
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r0 = r0.f435138a
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel r0 = (ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel) r0
            kotlin.C42729a0.b(r8)
            goto La4
        L3c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L44:
            java.lang.Object r2 = r0.f435140c
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r4 = r0.f435139b
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel r4 = (ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel) r4
            java.lang.Object r5 = r0.f435138a
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel r5 = (ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel) r5
            kotlin.C42729a0.b(r8)
            r6 = r4
            r4 = r2
            r2 = r6
            goto L8d
        L57:
            java.lang.Object r2 = r0.f435139b
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel r2 = (ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel) r2
            java.lang.Object r5 = r0.f435138a
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel r5 = (ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel) r5
            kotlin.C42729a0.b(r8)
            goto L77
        L63:
            kotlin.C42729a0.b(r8)
            r0.f435138a = r7
            r0.f435139b = r7
            r0.f435143f = r5
            java.lang.String r8 = "sns_prompt_doubleSide_text"
            java.lang.Object r8 = r7.getString(r8, r0)
            if (r8 != r1) goto L75
            return r1
        L75:
            r2 = r7
            r5 = r2
        L77:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r0.f435138a = r5
            r0.f435139b = r2
            r0.f435140c = r8
            r0.f435143f = r4
            java.lang.String r4 = "sns_prompt_doubleSide_action_yes"
            java.lang.Object r4 = r5.getString(r4, r0)
            if (r4 != r1) goto L8a
            return r1
        L8a:
            r6 = r4
            r4 = r8
            r8 = r6
        L8d:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r0.f435138a = r2
            r0.f435139b = r4
            r0.f435140c = r8
            r0.f435143f = r3
            java.lang.String r3 = "sns_prompt_doubleSide_action_no"
            java.lang.Object r0 = r5.getString(r3, r0)
            if (r0 != r1) goto La0
            return r1
        La0:
            r1 = r8
            r8 = r0
            r0 = r2
            r2 = r4
        La4:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$e r3 = new ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$e
            r3.<init>(r2, r1, r8)
            r0.fireEvent(r3)
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int rotation) throws Throwable {
        Object next;
        int i12 = rotation % 360;
        if (i12 != 0) {
            try {
                Iterator<T> it = o().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((ru.cyberity.cbr.core.data.model.o) next).getSide() == r()) {
                            break;
                        }
                    }
                }
                ru.cyberity.cbr.core.data.model.o oVar = (ru.cyberity.cbr.core.data.model.o) next;
                if (oVar != null) {
                    if (i12 <= 0) {
                        i12 += 360;
                    }
                    androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(oVar.getRaw());
                    aVar.H("Orientation", String.valueOf(ru.cyberity.cbr.core.common.s.b(i12 + aVar.n())));
                    aVar.D();
                }
            } catch (Exception e12) {
                a("Can't apply rotation", e12);
            }
        }
    }

    public final void a(@Y61.k DocumentSideness documentSideness) {
        this.documentSideness.a(this, f435043x[0], documentSideness);
    }

    public final void a(@Y61.k IdentitySide identitySide) {
        this.side.a(this, f435043x[1], identitySide);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ru.cyberity.ml.badphotos.models.b bVar) {
        this.analyticsPayload.a(this, f435043x[4], bVar);
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.b
    public void a(boolean show) {
        CBRViewModel.updateState$default(this, false, new h0(show, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e(String sourceKey) {
        ru.cyberity.cbr.core.data.model.e config = getConfig();
        return a(config != null ? ru.cyberity.cbr.core.data.model.f.p(config) : null, sourceKey);
    }

    public void a(int rotation) {
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "onDataIsReadableClicked", null, 4, null);
        C43259k.d(N0.a(this), null, null, new p(rotation, null), 3);
    }

    public final void a(@Y61.l List<ru.cyberity.cbr.core.data.model.o> results) {
        ru.cyberity.cbr.camera.photo.presentation.document.e eVar = ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a;
        StringBuilder sb2 = new StringBuilder("on picker results: ");
        sb2.append(results != null ? Integer.valueOf(results.size()) : null);
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(eVar, "DocCapture", sb2.toString(), null, 4, null);
        if (results == null) {
            return;
        }
        C43259k.d(N0.a(this), null, null, new s(results, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r8, @Y61.k kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.o
            if (r0 == 0) goto L13
            r0 = r9
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$o r0 = (ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.o) r0
            int r1 = r0.f435175e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f435175e = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$o r0 = new ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$o
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f435173c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f435175e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.f435172b
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r0.f435171a
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel r0 = (ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel) r0
            kotlin.C42729a0.b(r9)
            goto L50
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.C42729a0.b(r9)
            ru.cyberity.cbr.core.data.source.dynamic.c r9 = r7.getDataRepository()
            r0.f435171a = r7
            r0.f435172b = r8
            r0.f435175e = r3
            r2 = 0
            java.lang.Object r9 = ru.cyberity.cbr.core.data.source.dynamic.c.e(r9, r2, r0, r3, r4)
            if (r9 != r1) goto L4f
            return r1
        L4f:
            r0 = r7
        L50:
            ru.cyberity.cbr.core.data.source.dynamic.a r9 = (ru.cyberity.cbr.core.data.source.dynamic.a) r9
            java.lang.Object r9 = r9.d()
            ru.cyberity.cbr.core.data.model.g r9 = (ru.cyberity.cbr.core.data.model.g) r9
            if (r9 != 0) goto L75
            ru.cyberity.log.a r8 = ru.cyberity.log.a.f436064a
            ru.cyberity.log.LoggerType r9 = ru.cyberity.log.LoggerType.KIBANA
            ru.cyberity.log.LoggerType[] r9 = new ru.cyberity.log.LoggerType[]{r9}
            ru.cyberity.log.logger.Logger r1 = r8.a(r9)
            java.lang.String r2 = ru.cyberity.log.c.a(r0)
            java.lang.String r3 = "applicant null!"
            r4 = 0
            r5 = 4
            r6 = 0
            ru.cyberity.log.logger.Logger.e$default(r1, r2, r3, r4, r5, r6)
            kotlin.collections.z0 r8 = kotlin.collections.C42784z0.f406748b
            return r8
        L75:
            ru.cyberity.cbr.core.data.model.DocumentType r1 = new ru.cyberity.cbr.core.data.model.DocumentType
            ru.cyberity.cbr.core.data.model.Document r2 = r0.getDocument()
            ru.cyberity.cbr.core.data.model.DocumentType r2 = r2.getType()
            java.lang.String r2 = r2.getValue()
            r1.<init>(r2)
            java.util.List r9 = r9.b(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C42745f0.q(r9, r2)
            r1.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L99:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r9.next()
            ru.cyberity.cbr.core.data.model.r r2 = (ru.cyberity.cbr.core.data.model.r) r2
            java.lang.String r2 = r2.getValue()
            r1.add(r2)
            goto L99
        Lad:
            java.util.List r9 = kotlin.collections.C42745f0.M0(r1)
            java.util.Set r1 = kotlin.collections.C42745f0.P0(r9)
            ru.cyberity.cbr.core.data.model.e r0 = r0.getConfig()
            if (r0 == 0) goto Lc6
            java.util.Map r0 = r0.v()
            if (r0 == 0) goto Lc6
            java.lang.Object r8 = r0.get(r8)
            goto Lc7
        Lc6:
            r8 = r4
        Lc7:
            boolean r0 = r8 instanceof java.util.Map
            if (r0 == 0) goto Lce
            java.util.Map r8 = (java.util.Map) r8
            goto Lcf
        Lce:
            r8 = r4
        Lcf:
            if (r8 == 0) goto Leb
            java.util.Set r8 = r8.keySet()
            if (r8 == 0) goto Leb
            java.util.LinkedHashSet r8 = kotlin.collections.C42745f0.M(r8, r1)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto Le2
            r4 = r8
        Le2:
            if (r4 == 0) goto Leb
            java.util.List r8 = kotlin.collections.C42745f0.M0(r4)
            if (r8 == 0) goto Leb
            r9 = r8
        Leb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void a(@Y61.l ru.cyberity.cbr.core.data.model.o result) {
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "preview doc result: " + result, null, 4, null);
        if (result == null) {
            if (o().isEmpty()) {
                CBRViewModel.finish$default(this, a0.a.f432636a, null, null, 6, null);
            } else {
                if (r() == IdentitySide.Back) {
                    a(IdentitySide.Front);
                }
                A();
            }
            a(true);
            showProgress(false);
            return;
        }
        ArrayList arrayList = new ArrayList(o());
        C42745f0.l0(new q(result), arrayList);
        if (result.getType() == null) {
            arrayList.add(ru.cyberity.cbr.core.data.model.o.a(result, null, null, null, g(), null, false, null, 119, null));
        } else {
            arrayList.add(result);
        }
        b(arrayList);
        a(this, result, (Y41.a) null, 2, (Object) null);
    }

    /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$onDocumentsUploadedSuccess$2", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6}, l = {503, 523, 528, 529, 538, 540, 545}, m = "invokeSuspend", n = {"$this$launch", "isFatal", "$this$launch", "destination$iv$iv", "isFatal", "$this$launch", "message", "isFatal", "$this$launch", "message", "isFatal", "$this$launch", "message", "title", "isFatal", "$this$launch", "message", "title", "isFatal", "$this$launch", "message", "title", "isFatal"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
    public static final class u extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435194a;

        /* renamed from: b, reason: collision with root package name */
        Object f435195b;

        /* renamed from: c, reason: collision with root package name */
        Object f435196c;

        /* renamed from: d, reason: collision with root package name */
        Object f435197d;

        /* renamed from: e, reason: collision with root package name */
        Object f435198e;

        /* renamed from: f, reason: collision with root package name */
        Object f435199f;

        /* renamed from: g, reason: collision with root package name */
        Object f435200g;

        /* renamed from: h, reason: collision with root package name */
        Object f435201h;

        /* renamed from: i, reason: collision with root package name */
        int f435202i;

        /* renamed from: j, reason: collision with root package name */
        int f435203j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f435204k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ List<ru.cyberity.cbr.core.data.model.remote.k> f435205l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ CBRPreviewPhotoDocumentViewModel f435206m;

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$a;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$onDocumentsUploadedSuccess$2$1", f = "CBRPreviewPhotoDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<a, Continuation<? super a>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f435207a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f435208b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Spanned f435209c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ h f435210d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Spanned spanned, h hVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f435209c = spanned;
                this.f435210d = hVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k a aVar, @Y61.l Continuation<? super a> continuation) {
                return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f435209c, this.f435210d, continuation);
                aVar.f435208b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f435207a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                a aVar = (a) this.f435208b;
                Content content = aVar.getContent();
                return a.a(aVar, null, null, 0, this.f435210d, false, false, content != null ? Content.a(content, this.f435209c, null, null, null, null, 30, null) : null, 39, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(List<ru.cyberity.cbr.core.data.model.remote.k> list, CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel, Continuation<? super u> continuation) {
            super(2, continuation);
            this.f435205l = list;
            this.f435206m = cBRPreviewPhotoDocumentViewModel;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((u) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            u uVar = new u(this.f435205l, this.f435206m, continuation);
            uVar.f435204k = obj;
            return uVar;
        }

        /* JADX WARN: Path cross not found for [B:18:0x00ec, B:27:0x0108], limit reached: 161 */
        /* JADX WARN: Removed duplicated region for block: B:101:0x02cd  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0335 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0336  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0347  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0365  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0384  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0388  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x03ae  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x03b0  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0117 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01be  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0286  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x02b3 -> B:100:0x02ba). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 1054
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* compiled from: CBRPreviewPhotoDocumentViewModel.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/text/Spanned;", "it", "", "a", "(Landroid/text/Spanned;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
        public static final class b extends N implements Y41.l<Spanned, CharSequence> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f435211a = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@Y61.k Spanned spanned) {
                return spanned;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlinx.coroutines.N0 a(CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel, ru.cyberity.cbr.core.data.model.o oVar, Y41.a aVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showPhoto");
        }
        if ((i12 & 2) != 0) {
            aVar = null;
        }
        return cBRPreviewPhotoDocumentViewModel.a(oVar, (Y41.a<G0>) aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.N0 a(ru.cyberity.cbr.core.data.model.o result, Y41.a<G0> performRightAfterStateUpdate) {
        return C43259k.d(N0.a(this), null, null, new i0(result, performRightAfterStateUpdate, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String message, Exception e12) {
        C43259k.d(N0.a(this), C43135f1.f411090b, null, new d0(message, e12, null), 2);
    }

    public static /* synthetic */ Object a(CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel, ru.cyberity.cbr.core.data.model.g gVar, ru.cyberity.cbr.core.data.model.e eVar, Continuation continuation) {
        if (cBRPreviewPhotoDocumentViewModel.q()) {
            cBRPreviewPhotoDocumentViewModel.c(false);
            Object objA = cBRPreviewPhotoDocumentViewModel.a(false, (Continuation<? super G0>) continuation);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
        }
        return G0.f406611a;
    }

    @Y61.k
    public String a(@Y61.l Map<String, String> map, @Y61.k String sourceKey) {
        return (map != null ? map.get(sourceKey) : null) != null ? sourceKey : "default";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:114:0x022a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List<ru.cyberity.cbr.core.data.model.remote.k> r24, kotlin.coroutines.Continuation<? super kotlin.G0> r25) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void a(String country, String idDocType, DocumentSideness sideness) {
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", androidx.compose.ui.graphics.colorspace.e.n("Try apply new country=", country, " and idDocType=", idDocType), null, 4, null);
        if (country != null) {
            a(country);
        }
        if (idDocType != null) {
            b(idDocType);
        }
        a(sideness);
        List<ru.cyberity.cbr.core.data.model.o> listO = o();
        ArrayList arrayList = new ArrayList(C42745f0.q(listO, 10));
        Iterator<T> it = listO.iterator();
        while (it.hasNext()) {
            arrayList.add(ru.cyberity.cbr.core.data.model.o.a((ru.cyberity.cbr.core.data.model.o) it.next(), null, null, d(), g(), null, false, null, 83, null));
        }
        b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.graphics.Bitmap r20, kotlin.coroutines.Continuation<? super ru.cyberity.ml.core.d.a<ru.cyberity.ml.badphotos.models.a>> r21) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.a(android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.Content> r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ru.cyberity.ml.core.d.a<ru.cyberity.ml.badphotos.models.a> r18, kotlin.coroutines.Continuation<? super ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.Content> r19) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.a(ru.cyberity.ml.core.d$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Exception exception) {
        ru.cyberity.log.a.f436064a.e(ru.cyberity.log.c.a(this), "Exception while uploading identity photos", exception);
        ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a.a("DocCapture", "Exception while uploading identity photos", exception);
        showProgress(false);
        CBRViewModel.throwError$default(this, exception, g(), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel r11, boolean r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.a(ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a(@Y61.l Parcelable payload) {
        if (payload instanceof CBRViewModel.CBRViewModelEvent) {
            fireEvent((CBRViewModel.CBRViewModelEvent) payload);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel r9, boolean r10, ru.cyberity.cbr.core.data.model.g r11, kotlin.coroutines.Continuation r12) {
        /*
            ru.cyberity.cbr.core.data.model.Document r1 = r9.getDocument()
            java.util.List r2 = r9.w()
            ru.cyberity.cbr.core.data.model.Document r12 = r9.getDocument()
            ru.cyberity.cbr.core.data.model.DocumentType r12 = r12.getType()
            ru.cyberity.cbr.core.data.model.e r9 = r9.getConfig()
            r0 = 1
            if (r9 == 0) goto L22
            java.lang.String r3 = r12.getValue()
            boolean r9 = ru.cyberity.cbr.core.data.model.f.a(r9, r3)
            if (r9 != r0) goto L22
            goto L4a
        L22:
            boolean r9 = r12.h()
            if (r9 != 0) goto L4a
            boolean r9 = r12.k()
            if (r9 == 0) goto L47
            ru.cyberity.cbr.core.data.model.g$c$a r9 = r11.a(r12)
            if (r9 == 0) goto L39
            java.lang.String r9 = r9.getVideoRequired()
            goto L3a
        L39:
            r9 = 0
        L3a:
            ru.cyberity.cbr.core.data.model.VideoRequiredType r11 = ru.cyberity.cbr.core.data.model.VideoRequiredType.Disabled
            java.lang.String r11 = r11.getValue()
            boolean r9 = kotlin.jvm.internal.L.f(r9, r11)
            if (r9 == 0) goto L47
            goto L4a
        L47:
            r9 = 0
            r3 = r9
            goto L4b
        L4a:
            r3 = r0
        L4b:
            ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$d r9 = new ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$d
            r7 = 8
            r8 = 0
            r4 = 0
            r6 = 0
            r0 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.a(ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel, boolean, ru.cyberity.cbr.core.data.model.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0193  */
    /* JADX WARN: Type inference failed for: r10v25, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v8, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, java.util.Map] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.l java.lang.String r19, @Y61.l java.lang.String r20, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.presentation.screen.preview.photo.identity.DocumentSideness> r21) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object a(CBRPreviewPhotoDocumentViewModel cBRPreviewPhotoDocumentViewModel, String str, String str2, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDocumentSideness");
        }
        if ((i12 & 2) != 0) {
            str2 = null;
        }
        return cBRPreviewPhotoDocumentViewModel.a(str, str2, (Continuation<? super DocumentSideness>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r8, @Y61.k kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> r9) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.b
    public void a() {
        x();
    }
}

package ru.cyberity.cbr.prooface.presentation;

import Y41.p;
import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Size;
import androidx.appcompat.app.r;
import androidx.camera.core.InterfaceC20120j0;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.facebook.imageutils.JfifUtil;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.C42829l0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;
import kotlinx.coroutines.AbstractC43313y0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.C43315z0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import kotlinx.serialization.json.AbstractC43443a;
import okhttp3.internal.http.StatusLine;
import org.json.JSONObject;
import ru.cyberity.cbr.core.CBRActionResult;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.e;
import ru.cyberity.cbr.core.common.f;
import ru.cyberity.cbr.core.common.f0;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.z;
import ru.cyberity.cbr.core.data.listener.CBRActionResultHandler;
import ru.cyberity.cbr.core.data.model.AnswerType;
import ru.cyberity.cbr.core.data.model.CBRException;
import ru.cyberity.cbr.core.data.model.CBRLivenessReason;
import ru.cyberity.cbr.core.data.model.CBRSDKState;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.FlowActionType;
import ru.cyberity.cbr.core.data.model.e;
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.cbr.core.data.model.l;
import ru.cyberity.cbr.core.data.model.n;
import ru.cyberity.cbr.core.data.model.t;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.domain.a;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.prooface.network.Liveness3dFaceRepository;
import ru.cyberity.cbr.prooface.network.W6LpgmOhfkE9MxK;
import ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe;
import ru.cyberity.input.Fingerprinter;
import ru.cyberity.log.LoggerType;
import ru.cyberity.log.logger.Logger;

@Metadata(d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0002\u009a\u0001\u0018\u0000 Ì\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000eÍ\u0001Î\u0001Ï\u0001Ð\u0001Ñ\u0001Ò\u0001Ó\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010'\u001a\u00020\u00192\n\u0010&\u001a\u00060$j\u0002`%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0019¢\u0006\u0004\b)\u0010\u001dJ\u001f\u0010'\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b'\u0010-J/\u0010'\u001a\u00020\u00192\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00100\u001a\u00020\u0005¢\u0006\u0004\b'\u00101J%\u0010'\u001a\u00020\u00192\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206¢\u0006\u0004\b'\u00108J%\u0010'\u001a\u00020\u00192\u0006\u00109\u001a\u0002062\u0006\u0010:\u001a\u0002062\u0006\u0010;\u001a\u000206¢\u0006\u0004\b'\u0010<J\r\u0010=\u001a\u00020\u0019¢\u0006\u0004\b=\u0010\u001dJ\u0019\u0010\u0017\u001a\u00020\u00192\n\u0010>\u001a\u00060$j\u0002`%¢\u0006\u0004\b\u0017\u0010(J\r\u0010?\u001a\u00020\u0019¢\u0006\u0004\b?\u0010\u001dJ\u0019\u0010'\u001a\u00020\u00052\b\u0010A\u001a\u0004\u0018\u00010@H\u0002¢\u0006\u0004\b'\u0010BJ#\u0010'\u001a\u00020\u00192\u0006\u0010D\u001a\u00020C2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b'\u0010EJ\u0017\u0010'\u001a\u00020\u00192\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\b'\u0010HJ+\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00190K2\u0006\u0010J\u001a\u00020I2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00190KH\u0002¢\u0006\u0004\b'\u0010MJ\u000f\u0010N\u001a\u00020IH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010'\u001a\u00020\u00192\u0006\u0010&\u001a\u00020PH\u0002¢\u0006\u0004\b'\u0010QJ\u0017\u0010'\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010SJ\u0017\u0010'\u001a\u00020\u00192\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\b'\u0010VJ'\u0010'\u001a\u00020\u00052\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020W2\u0006\u0010Z\u001a\u00020WH\u0002¢\u0006\u0004\b'\u0010[J\u000f\u0010\\\u001a\u00020WH\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020*2\u0006\u0010Y\u001a\u00020^H\u0002¢\u0006\u0004\b_\u0010`J'\u0010'\u001a\u00020\u00192\u0006\u0010a\u001a\u00020^2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010eJ+\u0010'\u001a\u00020f2\u0006\u0010a\u001a\u00020^2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010gJ\u0013\u0010'\u001a\u00020h*\u00020^H\u0002¢\u0006\u0004\b'\u0010iJ\u0017\u0010\u0017\u001a\u00020\u00192\u0006\u0010a\u001a\u00020^H\u0002¢\u0006\u0004\b\u0017\u0010jJ\u000f\u0010k\u001a\u00020\u0019H\u0002¢\u0006\u0004\bk\u0010\u001dJ\u000f\u0010l\u001a\u00020\u0019H\u0002¢\u0006\u0004\bl\u0010\u001dJ\u000f\u0010'\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010\u001dJ!\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010mH\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010nR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010oR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010pR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010qR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010tR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010yR\u0016\u0010{\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010zR\u0018\u0010~\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010}R\u0018\u0010\u007f\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010}R\u0018\u0010.\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010oR\u0018\u0010/\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010oR\u0015\u0010\u0080\u0001\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010oR\u0018\u0010\u0082\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010oR1\u0010\u0087\u0001\u001a\u001c\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u00050\u0084\u00010\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0091\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010zR\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010zR\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001a\u0010¡\u0001\u001a\u00030\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001a\u0010£\u0001\u001a\u00030\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010 \u0001R\u0019\u0010¦\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0019\u0010¨\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¥\u0001R\u0018\u0010ª\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b©\u0001\u0010oR\u001b\u0010\u00ad\u0001\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R'\u0010²\u0001\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b®\u0001\u0010z\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0005\b'\u0010±\u0001R!\u0010·\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010´\u00010³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R%\u0010¼\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010´\u00010¸\u00018\u0006¢\u0006\u000f\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0005\bu\u0010»\u0001R!\u0010¿\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010½\u00010³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¶\u0001R%\u0010Á\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010½\u00010¸\u00018\u0006¢\u0006\u000f\n\u0006\bÀ\u0001\u0010º\u0001\u001a\u0005\br\u0010»\u0001R\u001c\u0010Ã\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010\u0094\u0001R\u0018\u0010Ç\u0001\u001a\u00030Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u001f\u0010Ê\u0001\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0005\bw\u0010°\u0001R\u0013\u0010Ë\u0001\u001a\u00020*8F¢\u0006\u0007\u001a\u0005\b_\u0010°\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ô\u0001"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$Mvd4a63GEdh6H;", "Lru/cyberity/cbr/core/domain/a;", "faceDetector", "", "idDocSetType", "Lkotlinx/serialization/json/a;", "json", "Lru/cyberity/cbr/prooface/network/VEkdd97RzWe;", "crypto", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository;", "livenessRepository", "Lru/cyberity/cbr/core/data/source/settings/b;", "settingsRepository", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/fingerprint/Fingerprinter;", "fingerprinter", "<init>", "(Lru/cyberity/cbr/core/domain/a;Ljava/lang/String;Lkotlinx/serialization/json/a;Lru/cyberity/cbr/prooface/network/VEkdd97RzWe;Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository;Lru/cyberity/cbr/core/data/source/settings/b;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;Lru/cyberity/fingerprint/Fingerprinter;)V", "uz93gWN1OYgIQ", "()Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$Mvd4a63GEdh6H;", "Lkotlin/G0;", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ro5yTlDmHIztT", "()V", "onCleared", "qDU6tWL1eFyUpkx72FqDl7Rs8Zhj", "Lru/cyberity/cbr/core/data/model/p;", "error", "onHandleError", "(Lru/cyberity/cbr/core/data/model/p;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "AnZ4ntgRZiVOQFYAd", "(Ljava/lang/Exception;)V", "yaDeBzW8OgCgJUx", "", "allowContinue", "answer", "(ZLjava/lang/String;)V", "actionId", "actionType", "camera", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/camera/core/j0;", "imageProxy", "Landroid/graphics/RectF;", "capturingBox", "", "exposure", "(Landroidx/camera/core/j0;Landroid/graphics/RectF;F)V", "current", "min", "max", "(FFF)V", "SgUnet9ElyJIfH62oFZvAtwNx9", "exception", "wHwI6WiVaPW36cHlnYtNbdyeJ6", "Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "session", "(Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;)Ljava/lang/String;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "reason", "(Lru/cyberity/cbr/core/data/model/CBRLivenessReason;Ljava/lang/String;)V", "Lru/cyberity/cbr/core/domain/a$a;", "result", "(Lru/cyberity/cbr/core/domain/a$a;)V", "", "minTimeMs", "Lkotlin/Function0;", "onStopAction", "(JLY41/a;)LY41/a;", "MyHc7quGyJKbnAIkFgd", "()J", "", "(Ljava/lang/Throwable;)V", "message", "(Ljava/lang/String;)V", "Lru/cyberity/cbr/core/domain/a$a$b;", "segment", "(Lru/cyberity/cbr/core/domain/a$a$b;)V", "", Constants.REFERRER_API_META, "image", "salt", "([B[B[B)Ljava/lang/String;", "E9gFqwO2FE5yBJACCUilu8lqyiR", "()[B", "Landroid/graphics/Bitmap;", "peujtyiBSfZOKD0yphJi2", "(Landroid/graphics/Bitmap;)Z", "bitmap", "Landroid/util/Size;", "trackSize", "faceStatus", "(Landroid/graphics/Bitmap;Landroid/util/Size;Ljava/lang/String;)V", "Lru/cyberity/cbr/prooface/data/NriLyb2MNC2;", "(Landroid/graphics/Bitmap;Landroid/util/Size;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/domain/a$b;", "(Landroid/graphics/Bitmap;)Lru/cyberity/cbr/core/domain/a$b;", "(Landroid/graphics/Bitmap;)V", "ixRCtjLaoPvSdVLG7eWTMMZt4s", "lx7eKxkYx4Q7d70nzPK5p4g6", "", "Lru/cyberity/cbr/core/domain/a;", "Ljava/lang/String;", "Lkotlinx/serialization/json/a;", "Lru/cyberity/cbr/prooface/network/VEkdd97RzWe;", "U4mhkUewPl2fPUTo32", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository;", "Lru/cyberity/cbr/core/data/source/settings/b;", "Hxrfc64cpBNzdXtCQnYxNm1uSR", "Lru/cyberity/cbr/core/data/source/common/a;", "hKhP1IV1YI8WgJ4nSpWmOP", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "Lru/cyberity/fingerprint/Fingerprinter;", "Z", "isNeedToScaleFragment", "Ljava/util/Timer;", "Ljava/util/Timer;", "slowConnectionTimer", "showProcessingTimer", "userAgent", "PVF9TOlBIXvMIL", "cameraName", "Lkotlinx/coroutines/flow/Y1;", "Lkotlin/l0;", "dYlGuwNtW3Z1uTkys0m32tl0P", "Lkotlinx/coroutines/flow/Y1;", "encoderFlow", "Lkotlinx/coroutines/y0;", "Gn2neQw35zOxo2tMX", "Lkotlinx/coroutines/y0;", "encoderDispatcher", "Lru/cyberity/cbr/prooface/data/VEkdd97RzWe;", "stAj3XxWeahoQPVmlXh7CqSNWdN", "Lru/cyberity/cbr/prooface/data/VEkdd97RzWe;", "calibrationResult", "pgbixkNCJDL", "saveCalibrationValue", "Lkotlinx/coroutines/N0;", "OYwueUbBw1kS", "Lkotlinx/coroutines/N0;", "calibrationJob", "ullELxy1GMYHVmKjJfw7S", "Landroidx/camera/core/j0;", "kYOC3yMOMQtzjuoeUZM", "isCalibrationNeeded", "ru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$dJ7R3qMHOKRTCVz", "pqTM3bdO8XTXh7no", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$dJ7R3qMHOKRTCVz;", "livenessCallback", "", "YUZngThubTDILTkVu", "I", "requiredFragments", "MSDuTMzis5MPdCsZ4xOBNi7ZY1Y", "fragmentsSent", "yAJeqjaYzyGRxtxmjlufnFAA", "J", "lastFragmentSent", "bd5dDLnkiFt5KOGUv", "lastDebugFragmentSent", "jlOFRNGMO4FmL8D7h", "sessionKey", "TQ9bjtpRcmqadMoHMaK6KDpWQGo", "Landroid/graphics/Bitmap;", "lastImage", "v09yZZykJE1vmW9GGRy2hp75V", "getFaceRecognizedState", "()Z", "(Z)V", "faceRecognizedState", "Lkotlinx/coroutines/flow/Z1;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS;", "MWOcT31D8NstIrhb7FEhu", "Lkotlinx/coroutines/flow/Z1;", "_status", "Lkotlinx/coroutines/flow/n2;", "G7LF4sUkm9NGP3ZmCDy", "Lkotlinx/coroutines/flow/n2;", "()Lkotlinx/coroutines/flow/n2;", "status", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG;", "XFDZWee5zm", "_livenessResult", "ZQryQeysQ69sf", "livenessResultFlow", "Fal5wgnw9wvlv8r6T2J5iaiH", "duplicateLivenessJob", "Lru/cyberity/cbr/core/common/e;", "bCPHi9ICna", "Lru/cyberity/cbr/core/common/e;", "bufferBitmap", "czq6LTmH0JmHSnA1XEmZTo", "Lkotlin/C;", "isEmulator", "dontShowSettingsDialog", "WcuDryVEN9xqVZTRJLOq3", "W6LpgmOhfkE9MxK", "P5t5x18Nr9Zgcg9u0Pj", "b8k1CqqNgacAsHleVkUzBdlNS", "gCh8O9vEEXKO12FpnjmYuc29DG", "NriLyb2MNC2", "Mvd4a63GEdh6H", "Snkgl4azaPYl3o9T8p9tjFx", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class VEkdd97RzWe extends CBRViewModel<Mvd4a63GEdh6H> {

    /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.domain.a faceDetector;

    /* renamed from: E9gFqwO2FE5yBJACCUilu8lqyiR, reason: from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.settings.b settingsRepository;

    /* renamed from: Fal5wgnw9wvlv8r6T2J5iaiH, reason: from kotlin metadata */
    @l
    private N0 duplicateLivenessJob;

    /* renamed from: G7LF4sUkm9NGP3ZmCDy, reason: from kotlin metadata */
    @k
    private final n2<b8k1CqqNgacAsHleVkUzBdlNS> status;

    /* renamed from: Gn2neQw35zOxo2tMX, reason: from kotlin metadata */
    @k
    private final AbstractC43313y0 encoderDispatcher;

    /* renamed from: Hxrfc64cpBNzdXtCQnYxNm1uSR, reason: from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    /* renamed from: MSDuTMzis5MPdCsZ4xOBNi7ZY1Y, reason: from kotlin metadata */
    private int fragmentsSent;

    /* renamed from: MWOcT31D8NstIrhb7FEhu, reason: from kotlin metadata */
    @k
    private final Z1<b8k1CqqNgacAsHleVkUzBdlNS> _status;

    /* renamed from: MyHc7quGyJKbnAIkFgd, reason: from kotlin metadata */
    @k
    private final ru.cyberity.cbr.prooface.network.VEkdd97RzWe crypto;

    /* renamed from: OYwueUbBw1kS, reason: from kotlin metadata */
    @l
    private N0 calibrationJob;

    /* renamed from: PVF9TOlBIXvMIL, reason: from kotlin metadata */
    @k
    private String cameraName;

    /* renamed from: SgUnet9ElyJIfH62oFZvAtwNx9, reason: from kotlin metadata */
    @l
    private String actionType;

    /* renamed from: TQ9bjtpRcmqadMoHMaK6KDpWQGo, reason: from kotlin metadata */
    @l
    private Bitmap lastImage;

    /* renamed from: U4mhkUewPl2fPUTo32, reason: from kotlin metadata */
    @k
    private final Liveness3dFaceRepository livenessRepository;

    /* renamed from: XFDZWee5zm, reason: from kotlin metadata */
    @k
    private final Z1<gCh8O9vEEXKO12FpnjmYuc29DG> _livenessResult;

    /* renamed from: YUZngThubTDILTkVu, reason: from kotlin metadata */
    private int requiredFragments;

    /* renamed from: ZQryQeysQ69sf, reason: from kotlin metadata */
    @k
    private final n2<gCh8O9vEEXKO12FpnjmYuc29DG> livenessResultFlow;

    /* renamed from: bCPHi9ICna, reason: from kotlin metadata */
    @k
    private final e bufferBitmap;

    /* renamed from: bd5dDLnkiFt5KOGUv, reason: from kotlin metadata */
    private long lastDebugFragmentSent;

    /* renamed from: czq6LTmH0JmHSnA1XEmZTo, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C isEmulator;

    /* renamed from: dYlGuwNtW3Z1uTkys0m32tl0P, reason: from kotlin metadata */
    @k
    private final Y1<C42829l0<Bitmap, Size, String>> encoderFlow;

    /* renamed from: hKhP1IV1YI8WgJ4nSpWmOP, reason: from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* renamed from: ixRCtjLaoPvSdVLG7eWTMMZt4s, reason: from kotlin metadata */
    @l
    private Timer showProcessingTimer;

    /* renamed from: jlOFRNGMO4FmL8D7h, reason: from kotlin metadata */
    @k
    private String sessionKey;

    /* renamed from: kYOC3yMOMQtzjuoeUZM, reason: from kotlin metadata */
    private boolean isCalibrationNeeded;

    /* renamed from: lx7eKxkYx4Q7d70nzPK5p4g6, reason: from kotlin metadata */
    @l
    private String actionId;

    /* renamed from: peujtyiBSfZOKD0yphJi2, reason: from kotlin metadata */
    @k
    private final AbstractC43443a json;

    /* renamed from: pgbixkNCJDL, reason: from kotlin metadata */
    private boolean saveCalibrationValue;

    /* renamed from: pqTM3bdO8XTXh7no, reason: from kotlin metadata */
    @k
    private final dJ7R3qMHOKRTCVz livenessCallback;

    /* renamed from: qDU6tWL1eFyUpkx72FqDl7Rs8Zhj, reason: from kotlin metadata */
    @k
    private final Fingerprinter fingerprinter;

    /* renamed from: ro5yTlDmHIztT, reason: from kotlin metadata */
    @l
    private Timer slowConnectionTimer;

    /* renamed from: stAj3XxWeahoQPVmlXh7CqSNWdN, reason: from kotlin metadata */
    @l
    private ru.cyberity.cbr.prooface.data.VEkdd97RzWe calibrationResult;

    /* renamed from: ullELxy1GMYHVmKjJfw7S, reason: from kotlin metadata */
    @l
    private InterfaceC20120j0 imageProxy;

    /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
    @k
    private final String idDocSetType;

    /* renamed from: v09yZZykJE1vmW9GGRy2hp75V, reason: from kotlin metadata */
    private boolean faceRecognizedState;

    /* renamed from: wHwI6WiVaPW36cHlnYtNbdyeJ6, reason: from kotlin metadata */
    private boolean isNeedToScaleFragment;

    /* renamed from: yAJeqjaYzyGRxtxmjlufnFAA, reason: from kotlin metadata */
    private long lastFragmentSent;

    /* renamed from: yaDeBzW8OgCgJUx, reason: from kotlin metadata */
    @k
    private final String userAgent;

    @k
    private static final SimpleDateFormat FezIarYHxhmbsWhWFF7 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$finishWithReason$1", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class CKquZmGHwbQOkV5H9qw extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        int AnZ4ntgRZiVOQFYAd;
        final /* synthetic */ String MyHc7quGyJKbnAIkFgd;
        final /* synthetic */ CBRLivenessReason peujtyiBSfZOKD0yphJi2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CKquZmGHwbQOkV5H9qw(CBRLivenessReason cBRLivenessReason, String str, Continuation<? super CKquZmGHwbQOkV5H9qw> continuation) {
            super(2, continuation);
            this.peujtyiBSfZOKD0yphJi2 = cBRLivenessReason;
            this.MyHc7quGyJKbnAIkFgd = str;
        }

        @Override // Y41.p
        @l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((CKquZmGHwbQOkV5H9qw) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return VEkdd97RzWe.this.new CKquZmGHwbQOkV5H9qw(this.peujtyiBSfZOKD0yphJi2, this.MyHc7quGyJKbnAIkFgd, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object cVar;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.AnZ4ntgRZiVOQFYAd != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            String str = VEkdd97RzWe.this.actionId;
            if (str == null || str.length() == 0) {
                cVar = new l.c(this.peujtyiBSfZOKD0yphJi2);
            } else {
                String str2 = VEkdd97RzWe.this.actionId;
                ru.cyberity.cbr.core.data.source.common.a aVar = VEkdd97RzWe.this.commonRepository;
                FlowActionType flowActionType = FlowActionType.INSTANCE.get(VEkdd97RzWe.this.actionType);
                if (flowActionType == null) {
                    flowActionType = FlowActionType.FaceEnrollment.INSTANCE;
                }
                aVar.a(new CBRSDKState.ActionCompleted(str2, flowActionType, this.MyHc7quGyJKbnAIkFgd, Collections.singletonMap("reason", this.peujtyiBSfZOKD0yphJi2)));
                cVar = new l.b(str2, VEkdd97RzWe.this.actionType, this.peujtyiBSfZOKD0yphJi2, this.MyHc7quGyJKbnAIkFgd);
            }
            Object obj2 = cVar;
            ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "finish: " + obj2, null, 4, null);
            CBRViewModel.finish$default(VEkdd97RzWe.this, null, obj2, null, 5, null);
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$onCameraPermissionDenied$1", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {797, 798, 799}, m = "invokeSuspend", n = {}, s = {})
    public static final class D473JWsR39bUMY1x9AKHD extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        Object AnZ4ntgRZiVOQFYAd;
        int MyHc7quGyJKbnAIkFgd;
        int U4mhkUewPl2fPUTo32;
        Object peujtyiBSfZOKD0yphJi2;
        Object uz93gWN1OYgIQ;

        public D473JWsR39bUMY1x9AKHD(Continuation<? super D473JWsR39bUMY1x9AKHD> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((D473JWsR39bUMY1x9AKHD) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return VEkdd97RzWe.this.new D473JWsR39bUMY1x9AKHD(continuation);
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
                int r1 = r9.U4mhkUewPl2fPUTo32
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L47
                if (r1 == r4) goto L3d
                if (r1 == r3) goto L2f
                if (r1 != r2) goto L27
                int r0 = r9.MyHc7quGyJKbnAIkFgd
                java.lang.Object r1 = r9.peujtyiBSfZOKD0yphJi2
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r2 = r9.uz93gWN1OYgIQ
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.Object r3 = r9.AnZ4ntgRZiVOQFYAd
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r3 = (ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe) r3
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
                int r1 = r9.MyHc7quGyJKbnAIkFgd
                java.lang.Object r3 = r9.uz93gWN1OYgIQ
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.Object r4 = r9.AnZ4ntgRZiVOQFYAd
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r4 = (ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe) r4
                kotlin.C42729a0.b(r10)
                goto L77
            L3d:
                int r1 = r9.MyHc7quGyJKbnAIkFgd
                java.lang.Object r4 = r9.AnZ4ntgRZiVOQFYAd
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r4 = (ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe) r4
                kotlin.C42729a0.b(r10)
                goto L5f
            L47:
                kotlin.C42729a0.b(r10)
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r10 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.this
                r9.AnZ4ntgRZiVOQFYAd = r10
                r1 = 0
                r9.MyHc7quGyJKbnAIkFgd = r1
                r9.U4mhkUewPl2fPUTo32 = r4
                java.lang.String r4 = "sns_alert_lackOfCameraPermissions"
                java.lang.Object r4 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(r10, r4, r9)
                if (r4 != r0) goto L5c
                return r0
            L5c:
                r8 = r4
                r4 = r10
                r10 = r8
            L5f:
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r5 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.this
                r9.AnZ4ntgRZiVOQFYAd = r4
                r9.uz93gWN1OYgIQ = r10
                r9.MyHc7quGyJKbnAIkFgd = r1
                r9.U4mhkUewPl2fPUTo32 = r3
                java.lang.String r3 = "sns_alert_action_settings"
                java.lang.Object r3 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(r5, r3, r9)
                if (r3 != r0) goto L74
                return r0
            L74:
                r8 = r3
                r3 = r10
                r10 = r8
            L77:
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r5 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.this
                r9.AnZ4ntgRZiVOQFYAd = r4
                r9.uz93gWN1OYgIQ = r3
                r9.peujtyiBSfZOKD0yphJi2 = r10
                r9.MyHc7quGyJKbnAIkFgd = r1
                r9.U4mhkUewPl2fPUTo32 = r2
                java.lang.String r2 = "sns_alert_action_cancel"
                java.lang.Object r2 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(r5, r2, r9)
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
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(r7, r10)
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.D473JWsR39bUMY1x9AKHD.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AnZ4ntgRZiVOQFYAd", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    public static final class FC8zjBgAEj extends N implements Y41.a<Boolean> {
        public static final FC8zjBgAEj AnZ4ntgRZiVOQFYAd = new FC8zjBgAEj();

        public FC8zjBgAEj() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            Boolean boolF = new f().f();
            return Boolean.valueOf(boolF != null ? boolF.booleanValue() : false);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/domain/a$a;", "result", "Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "(Lru/cyberity/cbr/core/domain/a$a;)V"}, k = 3, mv = {1, 7, 1})
    public static final class IiPIDY1ns4brViAcOWQgjdW6G4 extends N implements Y41.l<a.AbstractC12480a, G0> {
        final /* synthetic */ Y41.a<G0> uz93gWN1OYgIQ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IiPIDY1ns4brViAcOWQgjdW6G4(Y41.a<G0> aVar) {
            super(1);
            this.uz93gWN1OYgIQ = aVar;
        }

        public final void AnZ4ntgRZiVOQFYAd(@k a.AbstractC12480a abstractC12480a) {
            if (!VEkdd97RzWe.this.peujtyiBSfZOKD0yphJi2(abstractC12480a.getImage())) {
                VEkdd97RzWe.this.AnZ4ntgRZiVOQFYAd(abstractC12480a);
            }
            this.uz93gWN1OYgIQ.invoke();
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(a.AbstractC12480a abstractC12480a) {
            AnZ4ntgRZiVOQFYAd(abstractC12480a);
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$Mvd4a63GEdh6H;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$onPrepare$2", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {334, 335, 336, 337}, m = "invokeSuspend", n = {}, s = {})
    public static final class KwzLepHQCk extends SuspendLambda implements p<Mvd4a63GEdh6H, Continuation<? super Mvd4a63GEdh6H>, Object> {
        Object AnZ4ntgRZiVOQFYAd;
        int MyHc7quGyJKbnAIkFgd;
        /* synthetic */ Object U4mhkUewPl2fPUTo32;
        Object peujtyiBSfZOKD0yphJi2;
        Object uz93gWN1OYgIQ;

        public KwzLepHQCk(Continuation<? super KwzLepHQCk> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k Mvd4a63GEdh6H mvd4a63GEdh6H, @Y61.l Continuation<? super Mvd4a63GEdh6H> continuation) {
            return ((KwzLepHQCk) create(mvd4a63GEdh6H, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            KwzLepHQCk kwzLepHQCk = VEkdd97RzWe.this.new KwzLepHQCk(continuation);
            kwzLepHQCk.U4mhkUewPl2fPUTo32 = obj;
            return kwzLepHQCk;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 197
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.KwzLepHQCk.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0004\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$Mvd4a63GEdh6H;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$Snkgl4azaPYl3o9T8p9tjFx;", "warningDialog", "AnZ4ntgRZiVOQFYAd", "", "toString", "", "hashCode", "", PluralsKeys.OTHER, "", "equals", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$Snkgl4azaPYl3o9T8p9tjFx;", "()Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$Snkgl4azaPYl3o9T8p9tjFx;", "<init>", "(Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$Snkgl4azaPYl3o9T8p9tjFx;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Mvd4a63GEdh6H implements CBRViewModel.CBRViewModelState {

        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
        @Y61.l
        private final Snkgl4azaPYl3o9T8p9tjFx warningDialog;

        /* JADX WARN: Multi-variable type inference failed */
        public Mvd4a63GEdh6H() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @k
        public final Mvd4a63GEdh6H AnZ4ntgRZiVOQFYAd(@Y61.l Snkgl4azaPYl3o9T8p9tjFx warningDialog) {
            return new Mvd4a63GEdh6H(warningDialog);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Mvd4a63GEdh6H) && L.f(this.warningDialog, ((Mvd4a63GEdh6H) other).warningDialog);
        }

        public int hashCode() {
            Snkgl4azaPYl3o9T8p9tjFx snkgl4azaPYl3o9T8p9tjFx = this.warningDialog;
            if (snkgl4azaPYl3o9T8p9tjFx == null) {
                return 0;
            }
            return snkgl4azaPYl3o9T8p9tjFx.hashCode();
        }

        @k
        public String toString() {
            return "ViewState(warningDialog=" + this.warningDialog + ')';
        }

        public Mvd4a63GEdh6H(@Y61.l Snkgl4azaPYl3o9T8p9tjFx snkgl4azaPYl3o9T8p9tjFx) {
            this.warningDialog = snkgl4azaPYl3o9T8p9tjFx;
        }

        @Y61.l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
        public final Snkgl4azaPYl3o9T8p9tjFx getWarningDialog() {
            return this.warningDialog;
        }

        public /* synthetic */ Mvd4a63GEdh6H(Snkgl4azaPYl3o9T8p9tjFx snkgl4azaPYl3o9T8p9tjFx, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : snkgl4azaPYl3o9T8p9tjFx);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$NriLyb2MNC2;", "", "", "AnZ4ntgRZiVOQFYAd", "()Ljava/lang/CharSequence;", "hint", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    public interface NriLyb2MNC2 {
        @Y61.l
        /* renamed from: AnZ4ntgRZiVOQFYAd */
        CharSequence getHint();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$P5t5x18Nr9Zgcg9u0Pj;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", "toString", "", "hashCode", "", PluralsKeys.OTHER, "", "equals", "Lru/cyberity/cbr/core/data/model/p;", "AnZ4ntgRZiVOQFYAd", "Lru/cyberity/cbr/core/data/model/p;", "()Lru/cyberity/cbr/core/data/model/p;", "error", "<init>", "(Lru/cyberity/cbr/core/data/model/p;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class P5t5x18Nr9Zgcg9u0Pj implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
        @k
        private final ru.cyberity.cbr.core.data.model.p error;

        public P5t5x18Nr9Zgcg9u0Pj(@k ru.cyberity.cbr.core.data.model.p pVar) {
            this.error = pVar;
        }

        @k
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
        public final ru.cyberity.cbr.core.data.model.p getError() {
            return this.error;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof P5t5x18Nr9Zgcg9u0Pj) && L.f(this.error, ((P5t5x18Nr9Zgcg9u0Pj) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @k
        public String toString() {
            return "HandleErrorEvent(error=" + this.error + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$refuseShowSettingsDialog$1", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Pe4ctusE5exdr80p8YYA extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        int AnZ4ntgRZiVOQFYAd;

        public Pe4ctusE5exdr80p8YYA(Continuation<? super Pe4ctusE5exdr80p8YYA> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((Pe4ctusE5exdr80p8YYA) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return VEkdd97RzWe.this.new Pe4ctusE5exdr80p8YYA(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.AnZ4ntgRZiVOQFYAd != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            VEkdd97RzWe.this.settingsRepository.d();
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "()V"}, k = 3, mv = {1, 7, 1})
    public static final class RKNtRGuvfwF75ZeTA extends N implements Y41.a<G0> {
        final /* synthetic */ InterfaceC20120j0 AnZ4ntgRZiVOQFYAd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RKNtRGuvfwF75ZeTA(InterfaceC20120j0 interfaceC20120j0) {
            super(0);
            this.AnZ4ntgRZiVOQFYAd = interfaceC20120j0;
        }

        public final void AnZ4ntgRZiVOQFYAd() throws Exception {
            this.AnZ4ntgRZiVOQFYAd.close();
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() throws Exception {
            AnZ4ntgRZiVOQFYAd();
            return G0.f406611a;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel", f = "CBRLiveness3DFaceViewModel.kt", i = {0}, l = {329}, m = "onPrepare", n = {"this"}, s = {"L$0"})
    public static final class RtfxqXvJ0EoRSsVboMmH extends ContinuationImpl {
        Object AnZ4ntgRZiVOQFYAd;
        int MyHc7quGyJKbnAIkFgd;
        /* synthetic */ Object uz93gWN1OYgIQ;

        public RtfxqXvJ0EoRSsVboMmH(Continuation<? super RtfxqXvJ0EoRSsVboMmH> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            this.uz93gWN1OYgIQ = obj;
            this.MyHc7quGyJKbnAIkFgd |= BeduinInputModel.MIN_TEXT_VERSION;
            return VEkdd97RzWe.this.onPrepare(this);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$Snkgl4azaPYl3o9T8p9tjFx;", "", "", "toString", "", "hashCode", PluralsKeys.OTHER, "", "equals", "", "AnZ4ntgRZiVOQFYAd", "Ljava/lang/CharSequence;", "MyHc7quGyJKbnAIkFgd", "()Ljava/lang/CharSequence;", "message", "uz93gWN1OYgIQ", "peujtyiBSfZOKD0yphJi2", "buttonPositive", "buttonNegative", "buttonNeutral", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Snkgl4azaPYl3o9T8p9tjFx {

        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
        @Y61.l
        private final CharSequence message;

        /* renamed from: MyHc7quGyJKbnAIkFgd, reason: from kotlin metadata */
        @Y61.l
        private final CharSequence buttonNeutral;

        /* renamed from: peujtyiBSfZOKD0yphJi2, reason: from kotlin metadata */
        @Y61.l
        private final CharSequence buttonNegative;

        /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
        @Y61.l
        private final CharSequence buttonPositive;

        public Snkgl4azaPYl3o9T8p9tjFx(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3, @Y61.l CharSequence charSequence4) {
            this.message = charSequence;
            this.buttonPositive = charSequence2;
            this.buttonNegative = charSequence3;
            this.buttonNeutral = charSequence4;
        }

        @Y61.l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
        public final CharSequence getButtonNegative() {
            return this.buttonNegative;
        }

        @Y61.l
        /* renamed from: MyHc7quGyJKbnAIkFgd, reason: from getter */
        public final CharSequence getMessage() {
            return this.message;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Snkgl4azaPYl3o9T8p9tjFx)) {
                return false;
            }
            Snkgl4azaPYl3o9T8p9tjFx snkgl4azaPYl3o9T8p9tjFx = (Snkgl4azaPYl3o9T8p9tjFx) other;
            return L.f(this.message, snkgl4azaPYl3o9T8p9tjFx.message) && L.f(this.buttonPositive, snkgl4azaPYl3o9T8p9tjFx.buttonPositive) && L.f(this.buttonNegative, snkgl4azaPYl3o9T8p9tjFx.buttonNegative) && L.f(this.buttonNeutral, snkgl4azaPYl3o9T8p9tjFx.buttonNeutral);
        }

        public int hashCode() {
            CharSequence charSequence = this.message;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.buttonPositive;
            int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.buttonNegative;
            int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.buttonNeutral;
            return iHashCode3 + (charSequence4 != null ? charSequence4.hashCode() : 0);
        }

        @Y61.l
        /* renamed from: peujtyiBSfZOKD0yphJi2, reason: from getter */
        public final CharSequence getButtonPositive() {
            return this.buttonPositive;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("WriteSettingsDialog(message=");
            sb2.append((Object) this.message);
            sb2.append(", buttonPositive=");
            sb2.append((Object) this.buttonPositive);
            sb2.append(", buttonNegative=");
            sb2.append((Object) this.buttonNegative);
            sb2.append(", buttonNeutral=");
            return AK.c.r(sb2, this.buttonNeutral, ')');
        }

        @Y61.l
        /* renamed from: uz93gWN1OYgIQ, reason: from getter */
        public final CharSequence getButtonNeutral() {
            return this.buttonNeutral;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$1", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$VEkdd97RzWe, reason: collision with other inner class name */
    public static final class C12544VEkdd97RzWe extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        int AnZ4ntgRZiVOQFYAd;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/prooface/data/NriLyb2MNC2;", "it", "Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "(Lru/cyberity/cbr/prooface/data/NriLyb2MNC2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$VEkdd97RzWe$VEkdd97RzWe, reason: collision with other inner class name */
        public static final class C12545VEkdd97RzWe<T> implements InterfaceC43172j {
            final /* synthetic */ VEkdd97RzWe AnZ4ntgRZiVOQFYAd;

            public C12545VEkdd97RzWe(VEkdd97RzWe vEkdd97RzWe) {
                this.AnZ4ntgRZiVOQFYAd = vEkdd97RzWe;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
            public final Object emit(@k ru.cyberity.cbr.prooface.data.NriLyb2MNC2 nriLyb2MNC2, @k Continuation<? super G0> continuation) {
                this.AnZ4ntgRZiVOQFYAd.livenessRepository.AnZ4ntgRZiVOQFYAd(nriLyb2MNC2);
                return G0.f406611a;
            }
        }

        @s0
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$1$invokeSuspend$$inlined$transform$1", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$VEkdd97RzWe$ar2zdFahlgqFwCDaNcK2mMj8NV2W */
        public static final class ar2zdFahlgqFwCDaNcK2mMj8NV2W extends SuspendLambda implements p<InterfaceC43172j<? super ru.cyberity.cbr.prooface.data.NriLyb2MNC2>, Continuation<? super G0>, Object> {
            int AnZ4ntgRZiVOQFYAd;
            final /* synthetic */ VEkdd97RzWe MyHc7quGyJKbnAIkFgd;
            final /* synthetic */ InterfaceC43160i peujtyiBSfZOKD0yphJi2;
            private /* synthetic */ Object uz93gWN1OYgIQ;

            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$VEkdd97RzWe$ar2zdFahlgqFwCDaNcK2mMj8NV2W$VEkdd97RzWe, reason: collision with other inner class name */
            public static final class C12546VEkdd97RzWe<T> implements InterfaceC43172j {
                final /* synthetic */ InterfaceC43172j<ru.cyberity.cbr.prooface.data.NriLyb2MNC2> AnZ4ntgRZiVOQFYAd;
                final /* synthetic */ VEkdd97RzWe uz93gWN1OYgIQ;

                @s0
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$1$invokeSuspend$$inlined$transform$1$1", f = "CBRLiveness3DFaceViewModel.kt", i = {0, 0}, l = {224, 228}, m = "emit", n = {"this", "$this$invokeSuspend_u24lambda_u2d0"}, s = {"L$0", "L$1"})
                /* renamed from: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$VEkdd97RzWe$ar2zdFahlgqFwCDaNcK2mMj8NV2W$VEkdd97RzWe$VEkdd97RzWe, reason: collision with other inner class name */
                public static final class C12547VEkdd97RzWe extends ContinuationImpl {
                    /* synthetic */ Object AnZ4ntgRZiVOQFYAd;
                    Object MyHc7quGyJKbnAIkFgd;
                    Object U4mhkUewPl2fPUTo32;
                    int uz93gWN1OYgIQ;

                    public C12547VEkdd97RzWe(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@k Object obj) {
                        this.AnZ4ntgRZiVOQFYAd = obj;
                        this.uz93gWN1OYgIQ |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C12546VEkdd97RzWe.this.emit(null, this);
                    }
                }

                public C12546VEkdd97RzWe(InterfaceC43172j interfaceC43172j, VEkdd97RzWe vEkdd97RzWe) {
                    this.uz93gWN1OYgIQ = vEkdd97RzWe;
                    this.AnZ4ntgRZiVOQFYAd = interfaceC43172j;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r9, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r10) throws java.lang.Throwable {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.C12544VEkdd97RzWe.ar2zdFahlgqFwCDaNcK2mMj8NV2W.C12546VEkdd97RzWe.C12547VEkdd97RzWe
                        if (r0 == 0) goto L13
                        r0 = r10
                        ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$VEkdd97RzWe$ar2zdFahlgqFwCDaNcK2mMj8NV2W$VEkdd97RzWe$VEkdd97RzWe r0 = (ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.C12544VEkdd97RzWe.ar2zdFahlgqFwCDaNcK2mMj8NV2W.C12546VEkdd97RzWe.C12547VEkdd97RzWe) r0
                        int r1 = r0.uz93gWN1OYgIQ
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.uz93gWN1OYgIQ = r1
                        goto L18
                    L13:
                        ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$VEkdd97RzWe$ar2zdFahlgqFwCDaNcK2mMj8NV2W$VEkdd97RzWe$VEkdd97RzWe r0 = new ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$VEkdd97RzWe$ar2zdFahlgqFwCDaNcK2mMj8NV2W$VEkdd97RzWe$VEkdd97RzWe
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.AnZ4ntgRZiVOQFYAd
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.uz93gWN1OYgIQ
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L40
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.C42729a0.b(r10)
                        goto L86
                    L2c:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L34:
                        java.lang.Object r9 = r0.U4mhkUewPl2fPUTo32
                        kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                        java.lang.Object r2 = r0.MyHc7quGyJKbnAIkFgd
                        ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$VEkdd97RzWe$ar2zdFahlgqFwCDaNcK2mMj8NV2W$VEkdd97RzWe r2 = (ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.C12544VEkdd97RzWe.ar2zdFahlgqFwCDaNcK2mMj8NV2W.C12546VEkdd97RzWe) r2
                        kotlin.C42729a0.b(r10)
                        goto L6e
                    L40:
                        kotlin.C42729a0.b(r10)
                        kotlinx.coroutines.flow.j<ru.cyberity.cbr.prooface.data.NriLyb2MNC2> r10 = r8.AnZ4ntgRZiVOQFYAd
                        kotlin.l0 r9 = (kotlin.C42829l0) r9
                        ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r2 = r8.uz93gWN1OYgIQ
                        int r2 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.ro5yTlDmHIztT(r2)
                        if (r2 == 0) goto L86
                        ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r2 = r8.uz93gWN1OYgIQ
                        A r5 = r9.f406871b
                        android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                        B r6 = r9.f406872c
                        android.util.Size r6 = (android.util.Size) r6
                        C r9 = r9.f406873d
                        java.lang.String r9 = (java.lang.String) r9
                        r0.MyHc7quGyJKbnAIkFgd = r8
                        r0.U4mhkUewPl2fPUTo32 = r10
                        r0.uz93gWN1OYgIQ = r4
                        java.lang.Object r9 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(r2, r5, r6, r9, r0)
                        if (r9 != r1) goto L6a
                        return r1
                    L6a:
                        r2 = r8
                        r7 = r10
                        r10 = r9
                        r9 = r7
                    L6e:
                        ru.cyberity.cbr.prooface.data.NriLyb2MNC2 r10 = (ru.cyberity.cbr.prooface.data.NriLyb2MNC2) r10
                        ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r2 = r2.uz93gWN1OYgIQ
                        int r2 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.ro5yTlDmHIztT(r2)
                        if (r2 == 0) goto L86
                        r2 = 0
                        r0.MyHc7quGyJKbnAIkFgd = r2
                        r0.U4mhkUewPl2fPUTo32 = r2
                        r0.uz93gWN1OYgIQ = r3
                        java.lang.Object r9 = r9.emit(r10, r0)
                        if (r9 != r1) goto L86
                        return r1
                    L86:
                        kotlin.G0 r9 = kotlin.G0.f406611a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.C12544VEkdd97RzWe.ar2zdFahlgqFwCDaNcK2mMj8NV2W.C12546VEkdd97RzWe.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ar2zdFahlgqFwCDaNcK2mMj8NV2W(InterfaceC43160i interfaceC43160i, Continuation continuation, VEkdd97RzWe vEkdd97RzWe) {
                super(2, continuation);
                this.peujtyiBSfZOKD0yphJi2 = interfaceC43160i;
                this.MyHc7quGyJKbnAIkFgd = vEkdd97RzWe;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@k InterfaceC43172j<? super ru.cyberity.cbr.prooface.data.NriLyb2MNC2> interfaceC43172j, @Y61.l Continuation<? super G0> continuation) {
                return ((ar2zdFahlgqFwCDaNcK2mMj8NV2W) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                ar2zdFahlgqFwCDaNcK2mMj8NV2W ar2zdfahlgqfwcdanck2mmj8nv2w = new ar2zdFahlgqFwCDaNcK2mMj8NV2W(this.peujtyiBSfZOKD0yphJi2, continuation, this.MyHc7quGyJKbnAIkFgd);
                ar2zdfahlgqfwcdanck2mmj8nv2w.uz93gWN1OYgIQ = obj;
                return ar2zdfahlgqfwcdanck2mmj8nv2w;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.AnZ4ntgRZiVOQFYAd;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.uz93gWN1OYgIQ;
                    InterfaceC43160i interfaceC43160i = this.peujtyiBSfZOKD0yphJi2;
                    C12546VEkdd97RzWe c12546VEkdd97RzWe = new C12546VEkdd97RzWe(interfaceC43172j, this.MyHc7quGyJKbnAIkFgd);
                    this.AnZ4ntgRZiVOQFYAd = 1;
                    if (interfaceC43160i.collect(c12546VEkdd97RzWe, this) == coroutine_suspended) {
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

        public C12544VEkdd97RzWe(Continuation<? super C12544VEkdd97RzWe> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((C12544VEkdd97RzWe) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return VEkdd97RzWe.this.new C12544VEkdd97RzWe(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.AnZ4ntgRZiVOQFYAd;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i interfaceC43160iG = C43175k.G(new ar2zdFahlgqFwCDaNcK2mMj8NV2W(VEkdd97RzWe.this.encoderFlow, null, VEkdd97RzWe.this));
                C12545VEkdd97RzWe c12545VEkdd97RzWe = new C12545VEkdd97RzWe(VEkdd97RzWe.this);
                this.AnZ4ntgRZiVOQFYAd = 1;
                if (interfaceC43160iG.collect(c12545VEkdd97RzWe, this) == coroutine_suspended) {
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "result", "Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "(Ljava/util/Map;)V"}, k = 3, mv = {1, 7, 1})
    public static final class YmUIMad2RGVcjAVbbZlkIKzM9b1Cy extends N implements Y41.l<Map<String, ? extends String>, G0> {
        final /* synthetic */ Continuation<Map<String, String>> AnZ4ntgRZiVOQFYAd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public YmUIMad2RGVcjAVbbZlkIKzM9b1Cy(Continuation<? super Map<String, String>> continuation) {
            super(1);
            this.AnZ4ntgRZiVOQFYAd = continuation;
        }

        public final void AnZ4ntgRZiVOQFYAd(@k Map<String, String> map) {
            Logger.d$default(ru.cyberity.log.a.f436064a, "Fingerprinter", "Fingerprint size: " + map.size(), null, 4, null);
            Continuation<Map<String, String>> continuation = this.AnZ4ntgRZiVOQFYAd;
            int i12 = Z.f406624c;
            continuation.resumeWith(map);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(Map<String, ? extends String> map) {
            AnZ4ntgRZiVOQFYAd(map);
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$2", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
    public static final class ar2zdFahlgqFwCDaNcK2mMj8NV2W extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        Object AnZ4ntgRZiVOQFYAd;
        int peujtyiBSfZOKD0yphJi2;
        Object uz93gWN1OYgIQ;

        public ar2zdFahlgqFwCDaNcK2mMj8NV2W(Continuation<? super ar2zdFahlgqFwCDaNcK2mMj8NV2W> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((ar2zdFahlgqFwCDaNcK2mMj8NV2W) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return VEkdd97RzWe.this.new ar2zdFahlgqFwCDaNcK2mMj8NV2W(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            VEkdd97RzWe vEkdd97RzWe;
            VEkdd97RzWe vEkdd97RzWe2;
            VEkdd97RzWe vEkdd97RzWe3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.peujtyiBSfZOKD0yphJi2;
            boolean zM2 = false;
            if (i12 == 0) {
                C42729a0.b(obj);
                vEkdd97RzWe = VEkdd97RzWe.this;
                try {
                    ru.cyberity.cbr.core.data.source.dynamic.c cVar = vEkdd97RzWe.dataRepository;
                    this.AnZ4ntgRZiVOQFYAd = vEkdd97RzWe;
                    this.uz93gWN1OYgIQ = vEkdd97RzWe;
                    this.peujtyiBSfZOKD0yphJi2 = 1;
                    Object objC = ru.cyberity.cbr.core.data.source.dynamic.c.c(cVar, false, this, 1, null);
                    if (objC == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    vEkdd97RzWe2 = vEkdd97RzWe;
                    obj = objC;
                    vEkdd97RzWe3 = vEkdd97RzWe2;
                } catch (Exception unused) {
                    vEkdd97RzWe2 = vEkdd97RzWe;
                    vEkdd97RzWe2.isNeedToScaleFragment = zM2;
                    return G0.f406611a;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vEkdd97RzWe2 = (VEkdd97RzWe) this.uz93gWN1OYgIQ;
                vEkdd97RzWe3 = (VEkdd97RzWe) this.AnZ4ntgRZiVOQFYAd;
                try {
                    C42729a0.b(obj);
                } catch (Exception unused2) {
                    vEkdd97RzWe = vEkdd97RzWe3;
                    vEkdd97RzWe2 = vEkdd97RzWe;
                    vEkdd97RzWe2.isNeedToScaleFragment = zM2;
                    return G0.f406611a;
                }
            }
            zM2 = ru.cyberity.cbr.core.data.model.f.m((ru.cyberity.cbr.core.data.model.e) obj);
            vEkdd97RzWe2.isNeedToScaleFragment = zM2;
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$NriLyb2MNC2;", "<init>", "()V", "VEkdd97RzWe", "ar2zdFahlgqFwCDaNcK2mMj8NV2W", "d8gDEgxuRMWxWXii0", "W6LpgmOhfkE9MxK", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS$VEkdd97RzWe;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS$ar2zdFahlgqFwCDaNcK2mMj8NV2W;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS$d8gDEgxuRMWxWXii0;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS$W6LpgmOhfkE9MxK;", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class b8k1CqqNgacAsHleVkUzBdlNS implements NriLyb2MNC2 {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS$VEkdd97RzWe;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS;", "", "toString", "", "hashCode", "", PluralsKeys.OTHER, "", "equals", "Landroid/graphics/RectF;", "AnZ4ntgRZiVOQFYAd", "Landroid/graphics/RectF;", "uz93gWN1OYgIQ", "()Landroid/graphics/RectF;", "faceRectangle", "", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "hint", "<init>", "(Landroid/graphics/RectF;Ljava/lang/CharSequence;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS$VEkdd97RzWe, reason: collision with other inner class name */
        public static final /* data */ class C12548VEkdd97RzWe extends b8k1CqqNgacAsHleVkUzBdlNS {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            @k
            private final RectF faceRectangle;

            /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
            @Y61.l
            private final CharSequence hint;

            public C12548VEkdd97RzWe(@k RectF rectF, @Y61.l CharSequence charSequence) {
                super(null);
                this.faceRectangle = rectF;
                this.hint = charSequence;
            }

            @Override // ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.NriLyb2MNC2
            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
            public CharSequence getHint() {
                return this.hint;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C12548VEkdd97RzWe)) {
                    return false;
                }
                C12548VEkdd97RzWe c12548VEkdd97RzWe = (C12548VEkdd97RzWe) other;
                return L.f(this.faceRectangle, c12548VEkdd97RzWe.faceRectangle) && L.f(getHint(), c12548VEkdd97RzWe.getHint());
            }

            public int hashCode() {
                return (this.faceRectangle.hashCode() * 31) + (getHint() == null ? 0 : getHint().hashCode());
            }

            @k
            public String toString() {
                return "FaceRecognized(faceRectangle=" + this.faceRectangle + ", hint=" + ((Object) getHint()) + ')';
            }

            @k
            /* renamed from: uz93gWN1OYgIQ, reason: from getter */
            public final RectF getFaceRectangle() {
                return this.faceRectangle;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS$W6LpgmOhfkE9MxK;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS;", "", "toString", "", "hashCode", "", PluralsKeys.OTHER, "", "equals", "", "AnZ4ntgRZiVOQFYAd", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "hint", "<init>", "(Ljava/lang/CharSequence;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class W6LpgmOhfkE9MxK extends b8k1CqqNgacAsHleVkUzBdlNS {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            @Y61.l
            private final CharSequence hint;

            public W6LpgmOhfkE9MxK(@Y61.l CharSequence charSequence) {
                super(null);
                this.hint = charSequence;
            }

            @Override // ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.NriLyb2MNC2
            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
            public CharSequence getHint() {
                return this.hint;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof W6LpgmOhfkE9MxK) && L.f(getHint(), ((W6LpgmOhfkE9MxK) other).getHint());
            }

            public int hashCode() {
                if (getHint() == null) {
                    return 0;
                }
                return getHint().hashCode();
            }

            @k
            public String toString() {
                return "TooManyFaces(hint=" + ((Object) getHint()) + ')';
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS$ar2zdFahlgqFwCDaNcK2mMj8NV2W;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS;", "", "toString", "", "hashCode", "", PluralsKeys.OTHER, "", "equals", "", "AnZ4ntgRZiVOQFYAd", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "hint", "<init>", "(Ljava/lang/CharSequence;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class ar2zdFahlgqFwCDaNcK2mMj8NV2W extends b8k1CqqNgacAsHleVkUzBdlNS {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            @Y61.l
            private final CharSequence hint;

            public ar2zdFahlgqFwCDaNcK2mMj8NV2W(@Y61.l CharSequence charSequence) {
                super(null);
                this.hint = charSequence;
            }

            @Override // ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.NriLyb2MNC2
            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
            public CharSequence getHint() {
                return this.hint;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ar2zdFahlgqFwCDaNcK2mMj8NV2W) && L.f(getHint(), ((ar2zdFahlgqFwCDaNcK2mMj8NV2W) other).getHint());
            }

            public int hashCode() {
                if (getHint() == null) {
                    return 0;
                }
                return getHint().hashCode();
            }

            @k
            public String toString() {
                return "NoFace(hint=" + ((Object) getHint()) + ')';
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS$d8gDEgxuRMWxWXii0;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS;", "", "toString", "", "hashCode", "", PluralsKeys.OTHER, "", "equals", "Landroid/graphics/RectF;", "AnZ4ntgRZiVOQFYAd", "Landroid/graphics/RectF;", "uz93gWN1OYgIQ", "()Landroid/graphics/RectF;", "faceRectangle", "", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "hint", "<init>", "(Landroid/graphics/RectF;Ljava/lang/CharSequence;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class d8gDEgxuRMWxWXii0 extends b8k1CqqNgacAsHleVkUzBdlNS {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            @k
            private final RectF faceRectangle;

            /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
            @Y61.l
            private final CharSequence hint;

            public d8gDEgxuRMWxWXii0(@k RectF rectF, @Y61.l CharSequence charSequence) {
                super(null);
                this.faceRectangle = rectF;
                this.hint = charSequence;
            }

            @Override // ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.NriLyb2MNC2
            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
            public CharSequence getHint() {
                return this.hint;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof d8gDEgxuRMWxWXii0)) {
                    return false;
                }
                d8gDEgxuRMWxWXii0 d8gdegxurmwxwxii0 = (d8gDEgxuRMWxWXii0) other;
                return L.f(this.faceRectangle, d8gdegxurmwxwxii0.faceRectangle) && L.f(getHint(), d8gdegxurmwxwxii0.getHint());
            }

            public int hashCode() {
                return (this.faceRectangle.hashCode() * 31) + (getHint() == null ? 0 : getHint().hashCode());
            }

            @k
            public String toString() {
                return "NotInCapturingBox(faceRectangle=" + this.faceRectangle + ", hint=" + ((Object) getHint()) + ')';
            }

            @k
            /* renamed from: uz93gWN1OYgIQ, reason: from getter */
            public final RectF getFaceRectangle() {
                return this.faceRectangle;
            }
        }

        public /* synthetic */ b8k1CqqNgacAsHleVkUzBdlNS(C42822w c42822w) {
            this();
        }

        private b8k1CqqNgacAsHleVkUzBdlNS() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$3", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", n = {}, s = {})
    public static final class d8gDEgxuRMWxWXii0 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        int AnZ4ntgRZiVOQFYAd;
        private /* synthetic */ Object uz93gWN1OYgIQ;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/c$a;", "data", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/core/data/source/dynamic/c$a;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$3$1", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$d8gDEgxuRMWxWXii0$VEkdd97RzWe, reason: collision with other inner class name */
        public static final class C12549VEkdd97RzWe extends SuspendLambda implements p<c.a, Continuation<? super G0>, Object> {
            int AnZ4ntgRZiVOQFYAd;
            final /* synthetic */ VEkdd97RzWe MyHc7quGyJKbnAIkFgd;
            final /* synthetic */ T peujtyiBSfZOKD0yphJi2;
            /* synthetic */ Object uz93gWN1OYgIQ;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12549VEkdd97RzWe(T t12, VEkdd97RzWe vEkdd97RzWe, Continuation<? super C12549VEkdd97RzWe> continuation) {
                super(2, continuation);
                this.peujtyiBSfZOKD0yphJi2 = t12;
                this.MyHc7quGyJKbnAIkFgd = vEkdd97RzWe;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.l c.a aVar, @Y61.l Continuation<? super G0> continuation) {
                return ((C12549VEkdd97RzWe) create(aVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                C12549VEkdd97RzWe c12549VEkdd97RzWe = new C12549VEkdd97RzWe(this.peujtyiBSfZOKD0yphJi2, this.MyHc7quGyJKbnAIkFgd, continuation);
                c12549VEkdd97RzWe.uz93gWN1OYgIQ = obj;
                return c12549VEkdd97RzWe;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                ru.cyberity.cbr.core.data.source.dynamic.a<t> aVarJ;
                t tVarD;
                List<Document> listD;
                int i12;
                int i13;
                ru.cyberity.cbr.core.data.source.dynamic.a<ru.cyberity.cbr.core.data.model.e> aVarI;
                ru.cyberity.cbr.core.data.model.e eVarD;
                e.a action;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.AnZ4ntgRZiVOQFYAd != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                c.a aVar = (c.a) this.uz93gWN1OYgIQ;
                if (((aVar == null || (aVarI = aVar.i()) == null || (eVarD = aVarI.d()) == null || (action = eVarD.getAction()) == null) ? null : action.getId()) != null) {
                    return G0.f406611a;
                }
                if (aVar == null || (aVarJ = aVar.j()) == null || (tVarD = aVarJ.d()) == null || (listD = tVarD.d()) == null) {
                    return G0.f406611a;
                }
                g gVarD = aVar.g().d();
                if (gVarD == null) {
                    return G0.f406611a;
                }
                if (listD.isEmpty()) {
                    i12 = 0;
                } else {
                    Iterator<T> it = listD.iterator();
                    i12 = 0;
                    while (it.hasNext()) {
                        if (C43066x.h0(((Document) it.next()).getType().getValue(), "SELFIE", false) && (i12 = i12 + 1) < 0) {
                            C42745f0.G0();
                            throw null;
                        }
                    }
                }
                List listB0 = C42745f0.B0(listD, new n(gVarD));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listB0) {
                    if (C43066x.h0(((Document) obj2).getType().getValue(), "SELFIE", false)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    i13 = 0;
                } else {
                    Iterator it2 = arrayList.iterator();
                    i13 = 0;
                    while (it2.hasNext()) {
                        Document document = (Document) it2.next();
                        if (document.isSubmitted() && (document.isApproved() || document.isReviewing())) {
                            i13++;
                            if (i13 < 0) {
                                C42745f0.G0();
                                throw null;
                            }
                        }
                    }
                }
                if (i13 == i12) {
                    ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(ru.cyberity.log.c.a(this.peujtyiBSfZOKD0yphJi2), "Selfie already submitted, aborting liveness check", null, 4, null);
                    CBRViewModel.finish$default(this.MyHc7quGyJKbnAIkFgd, new a0.b(false, 1, null), null, null, 6, null);
                }
                return G0.f406611a;
            }
        }

        public d8gDEgxuRMWxWXii0(Continuation<? super d8gDEgxuRMWxWXii0> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((d8gDEgxuRMWxWXii0) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            d8gDEgxuRMWxWXii0 d8gdegxurmwxwxii0 = VEkdd97RzWe.this.new d8gDEgxuRMWxWXii0(continuation);
            d8gdegxurmwxwxii0.uz93gWN1OYgIQ = obj;
            return d8gdegxurmwxwxii0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.AnZ4ntgRZiVOQFYAd;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.uz93gWN1OYgIQ;
                n2<c.a> n2VarB = VEkdd97RzWe.this.dataRepository.b();
                C12549VEkdd97RzWe c12549VEkdd97RzWe = new C12549VEkdd97RzWe(t12, VEkdd97RzWe.this, null);
                this.AnZ4ntgRZiVOQFYAd = 1;
                if (C43175k.j(n2VarB, c12549VEkdd97RzWe, this) == coroutine_suspended) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$dJ7R3qMHOKRTCVz", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$VEkdd97RzWe;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult;", "result", "Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "(Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    public static final class dJ7R3qMHOKRTCVz implements Liveness3dFaceRepository.VEkdd97RzWe {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$livenessCallback$1$onResult$2", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$dJ7R3qMHOKRTCVz$VEkdd97RzWe, reason: collision with other inner class name */
        public static final class C12550VEkdd97RzWe extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
            Object AnZ4ntgRZiVOQFYAd;
            final /* synthetic */ VEkdd97RzWe MyHc7quGyJKbnAIkFgd;
            final /* synthetic */ boolean U4mhkUewPl2fPUTo32;
            int peujtyiBSfZOKD0yphJi2;
            boolean uz93gWN1OYgIQ;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12550VEkdd97RzWe(VEkdd97RzWe vEkdd97RzWe, boolean z12, Continuation<? super C12550VEkdd97RzWe> continuation) {
                super(2, continuation);
                this.MyHc7quGyJKbnAIkFgd = vEkdd97RzWe;
                this.U4mhkUewPl2fPUTo32 = z12;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((C12550VEkdd97RzWe) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new C12550VEkdd97RzWe(this.MyHc7quGyJKbnAIkFgd, this.U4mhkUewPl2fPUTo32, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Z1 z12;
                boolean z13;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.peujtyiBSfZOKD0yphJi2;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    z12 = this.MyHc7quGyJKbnAIkFgd._livenessResult;
                    boolean z14 = this.U4mhkUewPl2fPUTo32;
                    VEkdd97RzWe vEkdd97RzWe = this.MyHc7quGyJKbnAIkFgd;
                    this.AnZ4ntgRZiVOQFYAd = z12;
                    this.uz93gWN1OYgIQ = z14;
                    this.peujtyiBSfZOKD0yphJi2 = 1;
                    Object string = vEkdd97RzWe.getString("sns_facescan_hint_facePosition", this);
                    if (string == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z13 = z14;
                    obj = string;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z13 = this.uz93gWN1OYgIQ;
                    z12 = (Z1) this.AnZ4ntgRZiVOQFYAd;
                    C42729a0.b(obj);
                }
                z12.setValue(new gCh8O9vEEXKO12FpnjmYuc29DG.C12552gCh8O9vEEXKO12FpnjmYuc29DG(z13, (CharSequence) obj));
                return G0.f406611a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$livenessCallback$1$onResult$6", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {JfifUtil.MARKER_EOI, JfifUtil.MARKER_SOS, 224}, m = "invokeSuspend", n = {}, s = {})
        public static final class W6LpgmOhfkE9MxK extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
            Object AnZ4ntgRZiVOQFYAd;
            final /* synthetic */ VEkdd97RzWe E9gFqwO2FE5yBJACCUilu8lqyiR;
            final /* synthetic */ Liveness3dFaceRepository.LivenessRepositoryResult Hxrfc64cpBNzdXtCQnYxNm1uSR;
            Object MyHc7quGyJKbnAIkFgd;
            int U4mhkUewPl2fPUTo32;
            Object peujtyiBSfZOKD0yphJi2;
            Object uz93gWN1OYgIQ;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public W6LpgmOhfkE9MxK(VEkdd97RzWe vEkdd97RzWe, Liveness3dFaceRepository.LivenessRepositoryResult livenessRepositoryResult, Continuation<? super W6LpgmOhfkE9MxK> continuation) {
                super(2, continuation);
                this.E9gFqwO2FE5yBJACCUilu8lqyiR = vEkdd97RzWe;
                this.Hxrfc64cpBNzdXtCQnYxNm1uSR = livenessRepositoryResult;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((W6LpgmOhfkE9MxK) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new W6LpgmOhfkE9MxK(this.E9gFqwO2FE5yBJACCUilu8lqyiR, this.Hxrfc64cpBNzdXtCQnYxNm1uSR, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00cf A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
                /*
                    Method dump skipped, instructions count: 225
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.dJ7R3qMHOKRTCVz.W6LpgmOhfkE9MxK.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$livenessCallback$1$onResult$3", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
        public static final class ar2zdFahlgqFwCDaNcK2mMj8NV2W extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
            Object AnZ4ntgRZiVOQFYAd;
            final /* synthetic */ VEkdd97RzWe MyHc7quGyJKbnAIkFgd;
            int peujtyiBSfZOKD0yphJi2;
            int uz93gWN1OYgIQ;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ar2zdFahlgqFwCDaNcK2mMj8NV2W(VEkdd97RzWe vEkdd97RzWe, Continuation<? super ar2zdFahlgqFwCDaNcK2mMj8NV2W> continuation) {
                super(2, continuation);
                this.MyHc7quGyJKbnAIkFgd = vEkdd97RzWe;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((ar2zdFahlgqFwCDaNcK2mMj8NV2W) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new ar2zdFahlgqFwCDaNcK2mMj8NV2W(this.MyHc7quGyJKbnAIkFgd, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Z1 z12;
                int i12;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i13 = this.peujtyiBSfZOKD0yphJi2;
                if (i13 == 0) {
                    C42729a0.b(obj);
                    z12 = this.MyHc7quGyJKbnAIkFgd._livenessResult;
                    VEkdd97RzWe vEkdd97RzWe = this.MyHc7quGyJKbnAIkFgd;
                    this.AnZ4ntgRZiVOQFYAd = z12;
                    this.uz93gWN1OYgIQ = 0;
                    this.peujtyiBSfZOKD0yphJi2 = 1;
                    obj = vEkdd97RzWe.getString("sns_facescan_hint_facePosition", this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i12 = 0;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = this.uz93gWN1OYgIQ;
                    z12 = (Z1) this.AnZ4ntgRZiVOQFYAd;
                    C42729a0.b(obj);
                }
                z12.setValue(new gCh8O9vEEXKO12FpnjmYuc29DG.C12552gCh8O9vEEXKO12FpnjmYuc29DG(i12 != 0, (CharSequence) obj));
                return G0.f406611a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$livenessCallback$1$onResult$4", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
        public static final class d8gDEgxuRMWxWXii0 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
            Object AnZ4ntgRZiVOQFYAd;
            final /* synthetic */ VEkdd97RzWe MyHc7quGyJKbnAIkFgd;
            int peujtyiBSfZOKD0yphJi2;
            Object uz93gWN1OYgIQ;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d8gDEgxuRMWxWXii0(VEkdd97RzWe vEkdd97RzWe, Continuation<? super d8gDEgxuRMWxWXii0> continuation) {
                super(2, continuation);
                this.MyHc7quGyJKbnAIkFgd = vEkdd97RzWe;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((d8gDEgxuRMWxWXii0) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new d8gDEgxuRMWxWXii0(this.MyHc7quGyJKbnAIkFgd, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Z1 z12;
                Bitmap bitmap;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.peujtyiBSfZOKD0yphJi2;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    z12 = this.MyHc7quGyJKbnAIkFgd._livenessResult;
                    Bitmap bitmap2 = this.MyHc7quGyJKbnAIkFgd.lastImage;
                    VEkdd97RzWe vEkdd97RzWe = this.MyHc7quGyJKbnAIkFgd;
                    this.AnZ4ntgRZiVOQFYAd = z12;
                    this.uz93gWN1OYgIQ = bitmap2;
                    this.peujtyiBSfZOKD0yphJi2 = 1;
                    Object string = vEkdd97RzWe.getString("sns_facescan_hint_processing", this);
                    if (string == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bitmap = bitmap2;
                    obj = string;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bitmap = (Bitmap) this.uz93gWN1OYgIQ;
                    z12 = (Z1) this.AnZ4ntgRZiVOQFYAd;
                    C42729a0.b(obj);
                }
                z12.setValue(new gCh8O9vEEXKO12FpnjmYuc29DG.ar2zdFahlgqFwCDaNcK2mMj8NV2W(bitmap, (CharSequence) obj));
                return G0.f406611a;
            }
        }

        public dJ7R3qMHOKRTCVz() {
        }

        @Override // ru.cyberity.cbr.prooface.network.Liveness3dFaceRepository.VEkdd97RzWe
        public void AnZ4ntgRZiVOQFYAd(@k Liveness3dFaceRepository.LivenessRepositoryResult result) {
            CBRActionResult cBRActionResultOnActionResult;
            ru.cyberity.cbr.prooface.data.VEkdd97RzWe vEkdd97RzWe;
            String sessionKey;
            Integer requiredFragments;
            ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "repository callback " + result, null, 4, null);
            VEkdd97RzWe.this.AnZ4ntgRZiVOQFYAd();
            if (result instanceof Liveness3dFaceRepository.LivenessRepositoryResult.b8k1CqqNgacAsHleVkUzBdlNS) {
                VEkdd97RzWe vEkdd97RzWe2 = VEkdd97RzWe.this;
                Liveness3dFaceRepository.LivenessRepositoryResult.b8k1CqqNgacAsHleVkUzBdlNS b8k1cqqngacashlevkuzbdlns = (Liveness3dFaceRepository.LivenessRepositoryResult.b8k1CqqNgacAsHleVkUzBdlNS) result;
                ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx session = b8k1cqqngacashlevkuzbdlns.getSession();
                vEkdd97RzWe2.requiredFragments = (session == null || (requiredFragments = session.getRequiredFragments()) == null) ? 0 : requiredFragments.intValue();
                VEkdd97RzWe.this.lastFragmentSent = 0L;
                ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx session2 = b8k1cqqngacashlevkuzbdlns.getSession();
                if (session2 != null && (sessionKey = session2.getSessionKey()) != null) {
                    VEkdd97RzWe vEkdd97RzWe3 = VEkdd97RzWe.this;
                    try {
                        vEkdd97RzWe3.crypto.AnZ4ntgRZiVOQFYAd(sessionKey);
                        vEkdd97RzWe3.sessionKey = sessionKey;
                    } catch (Exception e12) {
                        vEkdd97RzWe3.AnZ4ntgRZiVOQFYAd((Throwable) e12);
                    }
                }
                ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx session3 = b8k1cqqngacashlevkuzbdlns.getSession();
                boolean zF2 = session3 != null ? L.f(session3.getSkipCalibration(), Boolean.TRUE) : false;
                boolean z12 = !zF2;
                VEkdd97RzWe vEkdd97RzWe4 = VEkdd97RzWe.this;
                if (zF2) {
                    vEkdd97RzWe4.showProgress(false);
                    vEkdd97RzWe = ru.cyberity.cbr.prooface.data.VEkdd97RzWe.INSTANCE.AnZ4ntgRZiVOQFYAd();
                } else {
                    vEkdd97RzWe = new ru.cyberity.cbr.prooface.data.VEkdd97RzWe((String) null, new ArrayList(), (String) null, 4, (C42822w) null);
                }
                vEkdd97RzWe4.calibrationResult = vEkdd97RzWe;
                C43259k.d(androidx.view.N0.a(VEkdd97RzWe.this), null, null, new C12550VEkdd97RzWe(VEkdd97RzWe.this, z12, null), 3);
                return;
            }
            if (result instanceof Liveness3dFaceRepository.LivenessRepositoryResult.W6LpgmOhfkE9MxK) {
                ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx session4 = ((Liveness3dFaceRepository.LivenessRepositoryResult.W6LpgmOhfkE9MxK) result).getSession();
                if (L.f(session4 != null ? session4.getAnswer() : null, AnswerType.Yellow.getValue())) {
                    VEkdd97RzWe.this.fragmentsSent = 0;
                    C43259k.d(androidx.view.N0.a(VEkdd97RzWe.this), null, null, new ar2zdFahlgqFwCDaNcK2mMj8NV2W(VEkdd97RzWe.this, null), 3);
                    return;
                }
                return;
            }
            if (result instanceof Liveness3dFaceRepository.LivenessRepositoryResult.ar2zdFahlgqFwCDaNcK2mMj8NV2W) {
                VEkdd97RzWe.this.requiredFragments = 0;
                VEkdd97RzWe.this.showProgress(false);
                C43259k.d(androidx.view.N0.a(VEkdd97RzWe.this), null, null, new d8gDEgxuRMWxWXii0(VEkdd97RzWe.this, null), 3);
                return;
            }
            if (!(result instanceof Liveness3dFaceRepository.LivenessRepositoryResult.gCh8O9vEEXKO12FpnjmYuc29DG)) {
                if (result instanceof Liveness3dFaceRepository.LivenessRepositoryResult.NriLyb2MNC2) {
                    return;
                }
                if (result instanceof Liveness3dFaceRepository.LivenessRepositoryResult.d8gDEgxuRMWxWXii0) {
                    VEkdd97RzWe.this.requiredFragments = 0;
                    CBRException.Network network = new CBRException.Network((Exception) ((Liveness3dFaceRepository.LivenessRepositoryResult.d8gDEgxuRMWxWXii0) result).getE());
                    VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(VEkdd97RzWe.this, new CBRLivenessReason.NetworkError(network), (String) null, 2, (Object) null);
                    VEkdd97RzWe.this.AnZ4ntgRZiVOQFYAd((Throwable) network);
                    return;
                }
                if (L.f(result, Liveness3dFaceRepository.LivenessRepositoryResult.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd)) {
                    VEkdd97RzWe.this.requiredFragments = 0;
                    VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(VEkdd97RzWe.this, new CBRLivenessReason.NetworkError(new IOException()), (String) null, 2, (Object) null);
                    return;
                } else {
                    if (L.f(result, Liveness3dFaceRepository.LivenessRepositoryResult.P5t5x18Nr9Zgcg9u0Pj.AnZ4ntgRZiVOQFYAd)) {
                        VEkdd97RzWe.this.requiredFragments = 0;
                        return;
                    }
                    return;
                }
            }
            VEkdd97RzWe.this.requiredFragments = 0;
            VEkdd97RzWe.this.showProgress(false);
            String str = VEkdd97RzWe.this.actionId;
            if (str != null) {
                VEkdd97RzWe vEkdd97RzWe5 = VEkdd97RzWe.this;
                try {
                    CBRActionResultHandler actionResultHandler = n0.f432787a.getActionResultHandler();
                    if (actionResultHandler != null) {
                        String str2 = vEkdd97RzWe5.actionType;
                        if (str2 == null) {
                            str2 = "";
                        }
                        ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx session5 = ((Liveness3dFaceRepository.LivenessRepositoryResult.gCh8O9vEEXKO12FpnjmYuc29DG) result).getSession();
                        String answer = session5 != null ? session5.getAnswer() : null;
                        ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx session6 = ((Liveness3dFaceRepository.LivenessRepositoryResult.gCh8O9vEEXKO12FpnjmYuc29DG) result).getSession();
                        cBRActionResultOnActionResult = actionResultHandler.onActionResult(str, str2, answer, session6 != null ? L.f(session6.getAllowContinuing(), Boolean.TRUE) : false);
                    } else {
                        cBRActionResultOnActionResult = null;
                    }
                    if (cBRActionResultOnActionResult == CBRActionResult.Cancel) {
                        CBRLivenessReason.CancelledByHostApplication cancelledByHostApplication = CBRLivenessReason.CancelledByHostApplication.INSTANCE;
                        ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx session7 = ((Liveness3dFaceRepository.LivenessRepositoryResult.gCh8O9vEEXKO12FpnjmYuc29DG) result).getSession();
                        vEkdd97RzWe5.AnZ4ntgRZiVOQFYAd(cancelledByHostApplication, session7 != null ? session7.getAnswer() : null);
                        return;
                    }
                } catch (Exception e13) {
                    vEkdd97RzWe5.AnZ4ntgRZiVOQFYAd((Throwable) e13);
                }
            }
            C43259k.d(androidx.view.N0.a(VEkdd97RzWe.this), null, null, new W6LpgmOhfkE9MxK(VEkdd97RzWe.this, result, null), 3);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel", f = "CBRLiveness3DFaceViewModel.kt", i = {0, 0, 0, 0, 0}, l = {702}, m = "encodeSegment", n = {"this", "salt", "image", "xorKey", "shuffleKey"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0"})
    public static final class dLVfpVnxHIInWb9dcv8GMau extends ContinuationImpl {
        Object AnZ4ntgRZiVOQFYAd;
        Object E9gFqwO2FE5yBJACCUilu8lqyiR;
        /* synthetic */ Object Gn2neQw35zOxo2tMX;
        Object Hxrfc64cpBNzdXtCQnYxNm1uSR;
        Object MyHc7quGyJKbnAIkFgd;
        int PVF9TOlBIXvMIL;
        Object SgUnet9ElyJIfH62oFZvAtwNx9;
        Object U4mhkUewPl2fPUTo32;
        long dYlGuwNtW3Z1uTkys0m32tl0P;
        Object hKhP1IV1YI8WgJ4nSpWmOP;
        Object ixRCtjLaoPvSdVLG7eWTMMZt4s;
        Object lx7eKxkYx4Q7d70nzPK5p4g6;
        Object peujtyiBSfZOKD0yphJi2;
        int pgbixkNCJDL;
        Object qDU6tWL1eFyUpkx72FqDl7Rs8Zhj;
        Object ro5yTlDmHIztT;
        Object uz93gWN1OYgIQ;
        Object wHwI6WiVaPW36cHlnYtNbdyeJ6;
        Object yaDeBzW8OgCgJUx;

        public dLVfpVnxHIInWb9dcv8GMau(Continuation<? super dLVfpVnxHIInWb9dcv8GMau> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            this.Gn2neQw35zOxo2tMX = obj;
            this.pgbixkNCJDL |= BeduinInputModel.MIN_TEXT_VERSION;
            return VEkdd97RzWe.this.AnZ4ntgRZiVOQFYAd(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG;", "", "<init>", "()V", "VEkdd97RzWe", "ar2zdFahlgqFwCDaNcK2mMj8NV2W", "d8gDEgxuRMWxWXii0", "W6LpgmOhfkE9MxK", "P5t5x18Nr9Zgcg9u0Pj", "b8k1CqqNgacAsHleVkUzBdlNS", "gCh8O9vEEXKO12FpnjmYuc29DG", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$VEkdd97RzWe;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$ar2zdFahlgqFwCDaNcK2mMj8NV2W;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$d8gDEgxuRMWxWXii0;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$W6LpgmOhfkE9MxK;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$P5t5x18Nr9Zgcg9u0Pj;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$b8k1CqqNgacAsHleVkUzBdlNS;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$gCh8O9vEEXKO12FpnjmYuc29DG;", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class gCh8O9vEEXKO12FpnjmYuc29DG {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$P5t5x18Nr9Zgcg9u0Pj;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG;", "", "toString", "", "hashCode", "", PluralsKeys.OTHER, "", "equals", "", "AnZ4ntgRZiVOQFYAd", "F", "getProgress", "()F", "progress", "<init>", "(F)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class P5t5x18Nr9Zgcg9u0Pj extends gCh8O9vEEXKO12FpnjmYuc29DG {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            private final float progress;

            public P5t5x18Nr9Zgcg9u0Pj(float f12) {
                super(null);
                this.progress = f12;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof P5t5x18Nr9Zgcg9u0Pj) && Float.valueOf(this.progress).equals(Float.valueOf(((P5t5x18Nr9Zgcg9u0Pj) other).progress));
            }

            public int hashCode() {
                return Float.hashCode(this.progress);
            }

            @k
            public String toString() {
                return r.k(')', this.progress, new StringBuilder("Progress(progress="));
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$VEkdd97RzWe;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG;", "", "toString", "", "hashCode", "", PluralsKeys.OTHER, "", "equals", "", "AnZ4ntgRZiVOQFYAd", "F", "()F", "value", "<init>", "(F)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$VEkdd97RzWe, reason: collision with other inner class name */
        public static final /* data */ class C12551VEkdd97RzWe extends gCh8O9vEEXKO12FpnjmYuc29DG {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            private final float value;

            public C12551VEkdd97RzWe(float f12) {
                super(null);
                this.value = f12;
            }

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
            public final float getValue() {
                return this.value;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C12551VEkdd97RzWe) && Float.valueOf(this.value).equals(Float.valueOf(((C12551VEkdd97RzWe) other).value));
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            @k
            public String toString() {
                return r.k(')', this.value, new StringBuilder("Calibration(value="));
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$W6LpgmOhfkE9MxK;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG;", "", "toString", "", "hashCode", "", PluralsKeys.OTHER, "", "equals", "", "AnZ4ntgRZiVOQFYAd", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "hint", "<init>", "(Ljava/lang/CharSequence;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class W6LpgmOhfkE9MxK extends gCh8O9vEEXKO12FpnjmYuc29DG {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            @Y61.l
            private final CharSequence hint;

            public W6LpgmOhfkE9MxK(@Y61.l CharSequence charSequence) {
                super(null);
                this.hint = charSequence;
            }

            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
            public final CharSequence getHint() {
                return this.hint;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof W6LpgmOhfkE9MxK) && L.f(this.hint, ((W6LpgmOhfkE9MxK) other).hint);
            }

            public int hashCode() {
                CharSequence charSequence = this.hint;
                if (charSequence == null) {
                    return 0;
                }
                return charSequence.hashCode();
            }

            @k
            public String toString() {
                return AK.c.r(new StringBuilder("LowConnection(hint="), this.hint, ')');
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$ar2zdFahlgqFwCDaNcK2mMj8NV2W;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG;", "", "toString", "", "hashCode", "", PluralsKeys.OTHER, "", "equals", "Landroid/graphics/Bitmap;", "AnZ4ntgRZiVOQFYAd", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "blurredLastImage", "", "uz93gWN1OYgIQ", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "hint", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/CharSequence;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class ar2zdFahlgqFwCDaNcK2mMj8NV2W extends gCh8O9vEEXKO12FpnjmYuc29DG {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            @Y61.l
            private final Bitmap blurredLastImage;

            /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
            @Y61.l
            private final CharSequence hint;

            public ar2zdFahlgqFwCDaNcK2mMj8NV2W(@Y61.l Bitmap bitmap, @Y61.l CharSequence charSequence) {
                super(null);
                this.blurredLastImage = bitmap;
                this.hint = charSequence;
            }

            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
            public final Bitmap getBlurredLastImage() {
                return this.blurredLastImage;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ar2zdFahlgqFwCDaNcK2mMj8NV2W)) {
                    return false;
                }
                ar2zdFahlgqFwCDaNcK2mMj8NV2W ar2zdfahlgqfwcdanck2mmj8nv2w = (ar2zdFahlgqFwCDaNcK2mMj8NV2W) other;
                return L.f(this.blurredLastImage, ar2zdfahlgqfwcdanck2mmj8nv2w.blurredLastImage) && L.f(this.hint, ar2zdfahlgqfwcdanck2mmj8nv2w.hint);
            }

            public int hashCode() {
                Bitmap bitmap = this.blurredLastImage;
                int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
                CharSequence charSequence = this.hint;
                return iHashCode + (charSequence != null ? charSequence.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Completed(blurredLastImage=");
                sb2.append(this.blurredLastImage);
                sb2.append(", hint=");
                return AK.c.r(sb2, this.hint, ')');
            }

            @Y61.l
            /* renamed from: uz93gWN1OYgIQ, reason: from getter */
            public final CharSequence getHint() {
                return this.hint;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$b8k1CqqNgacAsHleVkUzBdlNS;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG;", "", "toString", "", "hashCode", "", PluralsKeys.OTHER, "", "equals", "Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "AnZ4ntgRZiVOQFYAd", "Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "uz93gWN1OYgIQ", "()Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "session", "", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "retryText", "peujtyiBSfZOKD0yphJi2", "MyHc7quGyJKbnAIkFgd", "title", "text", "<init>", "(Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class b8k1CqqNgacAsHleVkUzBdlNS extends gCh8O9vEEXKO12FpnjmYuc29DG {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            @Y61.l
            private final ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx session;

            /* renamed from: MyHc7quGyJKbnAIkFgd, reason: from kotlin metadata */
            @Y61.l
            private final CharSequence text;

            /* renamed from: peujtyiBSfZOKD0yphJi2, reason: from kotlin metadata */
            @Y61.l
            private final CharSequence title;

            /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
            @Y61.l
            private final CharSequence retryText;

            public b8k1CqqNgacAsHleVkUzBdlNS(@Y61.l ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx snkgl4azaPYl3o9T8p9tjFx, @Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3) {
                super(null);
                this.session = snkgl4azaPYl3o9T8p9tjFx;
                this.retryText = charSequence;
                this.title = charSequence2;
                this.text = charSequence3;
            }

            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
            public final CharSequence getRetryText() {
                return this.retryText;
            }

            @Y61.l
            /* renamed from: MyHc7quGyJKbnAIkFgd, reason: from getter */
            public final CharSequence getTitle() {
                return this.title;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b8k1CqqNgacAsHleVkUzBdlNS)) {
                    return false;
                }
                b8k1CqqNgacAsHleVkUzBdlNS b8k1cqqngacashlevkuzbdlns = (b8k1CqqNgacAsHleVkUzBdlNS) other;
                return L.f(this.session, b8k1cqqngacashlevkuzbdlns.session) && L.f(this.retryText, b8k1cqqngacashlevkuzbdlns.retryText) && L.f(this.title, b8k1cqqngacashlevkuzbdlns.title) && L.f(this.text, b8k1cqqngacashlevkuzbdlns.text);
            }

            public int hashCode() {
                ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx snkgl4azaPYl3o9T8p9tjFx = this.session;
                int iHashCode = (snkgl4azaPYl3o9T8p9tjFx == null ? 0 : snkgl4azaPYl3o9T8p9tjFx.hashCode()) * 31;
                CharSequence charSequence = this.retryText;
                int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
                CharSequence charSequence2 = this.title;
                int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                CharSequence charSequence3 = this.text;
                return iHashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0);
            }

            @Y61.l
            /* renamed from: peujtyiBSfZOKD0yphJi2, reason: from getter */
            public final CharSequence getText() {
                return this.text;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("SessionResult(session=");
                sb2.append(this.session);
                sb2.append(", retryText=");
                sb2.append((Object) this.retryText);
                sb2.append(", title=");
                sb2.append((Object) this.title);
                sb2.append(", text=");
                return AK.c.r(sb2, this.text, ')');
            }

            @Y61.l
            /* renamed from: uz93gWN1OYgIQ, reason: from getter */
            public final ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx getSession() {
                return this.session;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$d8gDEgxuRMWxWXii0;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG;", "", "toString", "", "hashCode", "", PluralsKeys.OTHER, "", "equals", "", "AnZ4ntgRZiVOQFYAd", "F", "()F", "value", "<init>", "(F)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class d8gDEgxuRMWxWXii0 extends gCh8O9vEEXKO12FpnjmYuc29DG {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            private final float value;

            public d8gDEgxuRMWxWXii0(float f12) {
                super(null);
                this.value = f12;
            }

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
            public final float getValue() {
                return this.value;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof d8gDEgxuRMWxWXii0) && Float.valueOf(this.value).equals(Float.valueOf(((d8gDEgxuRMWxWXii0) other).value));
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            @k
            public String toString() {
                return r.k(')', this.value, new StringBuilder("EndCalibration(value="));
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$gCh8O9vEEXKO12FpnjmYuc29DG;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG;", "", "toString", "", "hashCode", "", PluralsKeys.OTHER, "", "equals", "AnZ4ntgRZiVOQFYAd", "Z", "()Z", "calibrationEnabled", "", "uz93gWN1OYgIQ", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "hint", "<init>", "(ZLjava/lang/CharSequence;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$gCh8O9vEEXKO12FpnjmYuc29DG, reason: collision with other inner class name */
        public static final /* data */ class C12552gCh8O9vEEXKO12FpnjmYuc29DG extends gCh8O9vEEXKO12FpnjmYuc29DG {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            private final boolean calibrationEnabled;

            /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
            @Y61.l
            private final CharSequence hint;

            public C12552gCh8O9vEEXKO12FpnjmYuc29DG(boolean z12, @Y61.l CharSequence charSequence) {
                super(null);
                this.calibrationEnabled = z12;
                this.hint = charSequence;
            }

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
            public final boolean getCalibrationEnabled() {
                return this.calibrationEnabled;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C12552gCh8O9vEEXKO12FpnjmYuc29DG)) {
                    return false;
                }
                C12552gCh8O9vEEXKO12FpnjmYuc29DG c12552gCh8O9vEEXKO12FpnjmYuc29DG = (C12552gCh8O9vEEXKO12FpnjmYuc29DG) other;
                return this.calibrationEnabled == c12552gCh8O9vEEXKO12FpnjmYuc29DG.calibrationEnabled && L.f(this.hint, c12552gCh8O9vEEXKO12FpnjmYuc29DG.hint);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            public int hashCode() {
                boolean z12 = this.calibrationEnabled;
                ?? r02 = z12;
                if (z12) {
                    r02 = 1;
                }
                int i12 = r02 * 31;
                CharSequence charSequence = this.hint;
                return i12 + (charSequence == null ? 0 : charSequence.hashCode());
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Started(calibrationEnabled=");
                sb2.append(this.calibrationEnabled);
                sb2.append(", hint=");
                return AK.c.r(sb2, this.hint, ')');
            }

            @Y61.l
            /* renamed from: uz93gWN1OYgIQ, reason: from getter */
            public final CharSequence getHint() {
                return this.hint;
            }
        }

        public /* synthetic */ gCh8O9vEEXKO12FpnjmYuc29DG(C42822w c42822w) {
            this();
        }

        private gCh8O9vEEXKO12FpnjmYuc29DG() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "w", "h", "Landroid/graphics/Bitmap;", "AnZ4ntgRZiVOQFYAd", "(II)Landroid/graphics/Bitmap;"}, k = 3, mv = {1, 7, 1})
    public static final class jLLRYWE14LVa8BjuMSlFaohnlD5Y extends N implements p<Integer, Integer, Bitmap> {
        public jLLRYWE14LVa8BjuMSlFaohnlD5Y() {
            super(2);
        }

        @k
        public final Bitmap AnZ4ntgRZiVOQFYAd(int i12, int i13) {
            return VEkdd97RzWe.this.bufferBitmap.a(i12, i13);
        }

        @Override // Y41.p
        public /* bridge */ /* synthetic */ Bitmap invoke(Integer num, Integer num2) {
            return AnZ4ntgRZiVOQFYAd(num.intValue(), num2.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$lESe0M818JY17jafmiI", "Ljava/util/TimerTask;", "Lkotlin/G0;", "run", "()V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    public static final class lESe0M818JY17jafmiI extends TimerTask {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$scheduleSlowConnectionTimer$1$1$run$1", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {765, 763}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$lESe0M818JY17jafmiI$VEkdd97RzWe, reason: collision with other inner class name */
        public static final class C12553VEkdd97RzWe extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
            Object AnZ4ntgRZiVOQFYAd;
            final /* synthetic */ VEkdd97RzWe peujtyiBSfZOKD0yphJi2;
            int uz93gWN1OYgIQ;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12553VEkdd97RzWe(VEkdd97RzWe vEkdd97RzWe, Continuation<? super C12553VEkdd97RzWe> continuation) {
                super(2, continuation);
                this.peujtyiBSfZOKD0yphJi2 = vEkdd97RzWe;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((C12553VEkdd97RzWe) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new C12553VEkdd97RzWe(this.peujtyiBSfZOKD0yphJi2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Z1 z12;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.uz93gWN1OYgIQ;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    z12 = this.peujtyiBSfZOKD0yphJi2._livenessResult;
                    VEkdd97RzWe vEkdd97RzWe = this.peujtyiBSfZOKD0yphJi2;
                    this.AnZ4ntgRZiVOQFYAd = z12;
                    this.uz93gWN1OYgIQ = 1;
                    obj = vEkdd97RzWe.getString("sns_facescan_hint_processingTakesTooLong", this);
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
                    z12 = (Z1) this.AnZ4ntgRZiVOQFYAd;
                    C42729a0.b(obj);
                }
                gCh8O9vEEXKO12FpnjmYuc29DG.W6LpgmOhfkE9MxK w6LpgmOhfkE9MxK = new gCh8O9vEEXKO12FpnjmYuc29DG.W6LpgmOhfkE9MxK((CharSequence) obj);
                this.AnZ4ntgRZiVOQFYAd = null;
                this.uz93gWN1OYgIQ = 2;
                if (z12.emit(w6LpgmOhfkE9MxK, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
        }

        public lESe0M818JY17jafmiI() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C43259k.d(androidx.view.N0.a(VEkdd97RzWe.this), null, null, new C12553VEkdd97RzWe(VEkdd97RzWe.this, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$startCalibration$1", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {576, 578, 580, 582, 584}, m = "invokeSuspend", n = {}, s = {})
    public static final class lj6JoJrqgHd2LvZHrZoOsDOgMWu extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        int AnZ4ntgRZiVOQFYAd;
        final /* synthetic */ float MyHc7quGyJKbnAIkFgd;
        final /* synthetic */ float U4mhkUewPl2fPUTo32;
        final /* synthetic */ float peujtyiBSfZOKD0yphJi2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lj6JoJrqgHd2LvZHrZoOsDOgMWu(float f12, float f13, float f14, Continuation<? super lj6JoJrqgHd2LvZHrZoOsDOgMWu> continuation) {
            super(2, continuation);
            this.peujtyiBSfZOKD0yphJi2 = f12;
            this.MyHc7quGyJKbnAIkFgd = f13;
            this.U4mhkUewPl2fPUTo32 = f14;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((lj6JoJrqgHd2LvZHrZoOsDOgMWu) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return VEkdd97RzWe.this.new lj6JoJrqgHd2LvZHrZoOsDOgMWu(this.peujtyiBSfZOKD0yphJi2, this.MyHc7quGyJKbnAIkFgd, this.U4mhkUewPl2fPUTo32, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.AnZ4ntgRZiVOQFYAd
                r2 = 100
                r4 = 5
                r5 = 3
                r6 = 2
                r7 = 250(0xfa, double:1.235E-321)
                r9 = 0
                r10 = 4
                r11 = 1
                if (r1 == 0) goto L39
                if (r1 == r11) goto L35
                if (r1 == r6) goto L31
                if (r1 == r5) goto L2d
                if (r1 == r10) goto L29
                if (r1 != r4) goto L21
                kotlin.C42729a0.b(r14)
                goto Lbe
            L21:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L29:
                kotlin.C42729a0.b(r14)
                goto L94
            L2d:
                kotlin.C42729a0.b(r14)
                goto L8f
            L31:
                kotlin.C42729a0.b(r14)
                goto L65
            L35:
                kotlin.C42729a0.b(r14)
                goto L60
            L39:
                kotlin.C42729a0.b(r14)
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.this
                java.lang.String r14 = ru.cyberity.log.c.a(r14)
                java.lang.String r1 = "Calibration started"
                ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(r14, r1, r9, r10, r9)
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.this
                kotlinx.coroutines.flow.Z1 r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.SgUnet9ElyJIfH62oFZvAtwNx9(r14)
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$VEkdd97RzWe r1 = new ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$VEkdd97RzWe
                float r12 = r13.peujtyiBSfZOKD0yphJi2
                r1.<init>(r12)
                r14.setValue(r1)
                r13.AnZ4ntgRZiVOQFYAd = r11
                java.lang.Object r14 = kotlinx.coroutines.C43131e0.b(r7, r13)
                if (r14 != r0) goto L60
                return r0
            L60:
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.this
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.uz93gWN1OYgIQ(r14, r11)
            L65:
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.this
                boolean r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.ixRCtjLaoPvSdVLG7eWTMMZt4s(r14)
                if (r14 == 0) goto L76
                r13.AnZ4ntgRZiVOQFYAd = r6
                java.lang.Object r14 = kotlinx.coroutines.C43131e0.b(r2, r13)
                if (r14 != r0) goto L65
                return r0
            L76:
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.this
                kotlinx.coroutines.flow.Z1 r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.SgUnet9ElyJIfH62oFZvAtwNx9(r14)
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$VEkdd97RzWe r1 = new ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$VEkdd97RzWe
                float r6 = r13.MyHc7quGyJKbnAIkFgd
                r1.<init>(r6)
                r14.setValue(r1)
                r13.AnZ4ntgRZiVOQFYAd = r5
                java.lang.Object r14 = kotlinx.coroutines.C43131e0.b(r7, r13)
                if (r14 != r0) goto L8f
                return r0
            L8f:
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.this
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.uz93gWN1OYgIQ(r14, r11)
            L94:
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.this
                boolean r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.ixRCtjLaoPvSdVLG7eWTMMZt4s(r14)
                if (r14 == 0) goto La5
                r13.AnZ4ntgRZiVOQFYAd = r10
                java.lang.Object r14 = kotlinx.coroutines.C43131e0.b(r2, r13)
                if (r14 != r0) goto L94
                return r0
            La5:
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.this
                kotlinx.coroutines.flow.Z1 r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.SgUnet9ElyJIfH62oFZvAtwNx9(r14)
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$d8gDEgxuRMWxWXii0 r1 = new ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$d8gDEgxuRMWxWXii0
                float r2 = r13.U4mhkUewPl2fPUTo32
                r1.<init>(r2)
                r14.setValue(r1)
                r13.AnZ4ntgRZiVOQFYAd = r4
                java.lang.Object r14 = kotlinx.coroutines.C43131e0.b(r7, r13)
                if (r14 != r0) goto Lbe
                return r0
            Lbe:
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.this
                r0 = 0
                r14.showProgress(r0)
                ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r14 = ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.this
                java.lang.String r14 = ru.cyberity.log.c.a(r14)
                java.lang.String r0 = "Calibration finished"
                ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(r14, r0, r9, r10, r9)
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.lj6JoJrqgHd2LvZHrZoOsDOgMWu.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$mHpAqA5X2yTV8tAgi03zK", "Ljava/util/TimerTask;", "Lkotlin/G0;", "run", "()V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    public static final class mHpAqA5X2yTV8tAgi03zK extends TimerTask {
        public mHpAqA5X2yTV8tAgi03zK() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            VEkdd97RzWe.this.lx7eKxkYx4Q7d70nzPK5p4g6();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3DFaceViewModel$enqueueSegment$1", f = "CBRLiveness3DFaceViewModel.kt", i = {}, l = {669}, m = "invokeSuspend", n = {}, s = {})
    public static final class tAmFDluShEzZuB4vjsN extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        int AnZ4ntgRZiVOQFYAd;
        final /* synthetic */ Size MyHc7quGyJKbnAIkFgd;
        final /* synthetic */ String U4mhkUewPl2fPUTo32;
        final /* synthetic */ Bitmap peujtyiBSfZOKD0yphJi2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public tAmFDluShEzZuB4vjsN(Bitmap bitmap, Size size, String str, Continuation<? super tAmFDluShEzZuB4vjsN> continuation) {
            super(2, continuation);
            this.peujtyiBSfZOKD0yphJi2 = bitmap;
            this.MyHc7quGyJKbnAIkFgd = size;
            this.U4mhkUewPl2fPUTo32 = str;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((tAmFDluShEzZuB4vjsN) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return VEkdd97RzWe.this.new tAmFDluShEzZuB4vjsN(this.peujtyiBSfZOKD0yphJi2, this.MyHc7quGyJKbnAIkFgd, this.U4mhkUewPl2fPUTo32, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.AnZ4ntgRZiVOQFYAd;
            if (i12 == 0) {
                C42729a0.b(obj);
                Y1 y12 = VEkdd97RzWe.this.encoderFlow;
                C42829l0 c42829l0 = new C42829l0(this.peujtyiBSfZOKD0yphJi2, this.MyHc7quGyJKbnAIkFgd, this.U4mhkUewPl2fPUTo32);
                this.AnZ4ntgRZiVOQFYAd = 1;
                if (y12.emit(c42829l0, this) == coroutine_suspended) {
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

    public VEkdd97RzWe(@k ru.cyberity.cbr.core.domain.a aVar, @k String str, @k AbstractC43443a abstractC43443a, @k ru.cyberity.cbr.prooface.network.VEkdd97RzWe vEkdd97RzWe, @k Liveness3dFaceRepository liveness3dFaceRepository, @k ru.cyberity.cbr.core.data.source.settings.b bVar, @k ru.cyberity.cbr.core.data.source.common.a aVar2, @k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @k Fingerprinter fingerprinter) {
        super(aVar2, cVar);
        this.faceDetector = aVar;
        this.idDocSetType = str;
        this.json = abstractC43443a;
        this.crypto = vEkdd97RzWe;
        this.livenessRepository = liveness3dFaceRepository;
        this.settingsRepository = bVar;
        this.commonRepository = aVar2;
        this.dataRepository = cVar;
        this.fingerprinter = fingerprinter;
        StringBuilder sb2 = new StringBuilder("msdk2 / 1.30.4 (Android ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(") - App ");
        n0 n0Var = n0.f432787a;
        sb2.append(n0Var.getPackageName());
        sb2.append(' ');
        sb2.append(n0Var.getVersionName());
        sb2.append(" / ");
        sb2.append(n0Var.getVersionCode());
        this.userAgent = sb2.toString();
        this.cameraName = "";
        this.encoderFlow = f2.b(0, 0, null, 7);
        C43315z0 c43315z0 = new C43315z0(Executors.newSingleThreadExecutor());
        this.encoderDispatcher = c43315z0;
        this.livenessCallback = new dJ7R3qMHOKRTCVz();
        this.fragmentsSent = Integer.MAX_VALUE;
        this.sessionKey = "";
        Z1<b8k1CqqNgacAsHleVkUzBdlNS> z1A = p2.a(null);
        this._status = z1A;
        this.status = z1A;
        Z1<gCh8O9vEEXKO12FpnjmYuc29DG> z1A2 = p2.a(null);
        this._livenessResult = z1A2;
        this.livenessResultFlow = z1A2;
        this.bufferBitmap = new ru.cyberity.cbr.core.common.e(Bitmap.Config.ARGB_8888);
        C43259k.d(androidx.view.N0.a(this), c43315z0, null, new C12544VEkdd97RzWe(null), 2);
        C43259k.d(androidx.view.N0.a(this), null, null, new ar2zdFahlgqFwCDaNcK2mMj8NV2W(null), 3);
        this.duplicateLivenessJob = C43259k.d(androidx.view.N0.a(this), null, null, new d8gDEgxuRMWxWXii0(null), 3);
        this.isEmulator = C42727D.c(FC8zjBgAEj.AnZ4ntgRZiVOQFYAd);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel, androidx.view.M0
    public void onCleared() {
        super.onCleared();
        this.imageProxy = null;
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    public void onHandleError(@k ru.cyberity.cbr.core.data.model.p error) {
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "onHandleError " + error, null, 4, null);
        super.onHandleError(error);
        fireEvent(new P5t5x18Nr9Zgcg9u0Pj(error));
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
            boolean r0 = r5 instanceof ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.RtfxqXvJ0EoRSsVboMmH
            if (r0 == 0) goto L13
            r0 = r5
            ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$RtfxqXvJ0EoRSsVboMmH r0 = (ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.RtfxqXvJ0EoRSsVboMmH) r0
            int r1 = r0.MyHc7quGyJKbnAIkFgd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.MyHc7quGyJKbnAIkFgd = r1
            goto L18
        L13:
            ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$RtfxqXvJ0EoRSsVboMmH r0 = new ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$RtfxqXvJ0EoRSsVboMmH
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.uz93gWN1OYgIQ
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.MyHc7quGyJKbnAIkFgd
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.AnZ4ntgRZiVOQFYAd
            ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe r0 = (ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe) r0
            kotlin.C42729a0.b(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C42729a0.b(r5)
            r0.AnZ4ntgRZiVOQFYAd = r4
            r0.MyHc7quGyJKbnAIkFgd = r3
            java.lang.Object r5 = super.onPrepare(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            r0.showProgress(r3)
            ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$KwzLepHQCk r5 = new ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$KwzLepHQCk
            r1 = 0
            r5.<init>(r1)
            r2 = 0
            ru.cyberity.cbr.core.presentation.base.CBRViewModel.updateState$default(r0, r2, r5, r3, r1)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.onPrepare(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final byte[] E9gFqwO2FE5yBJACCUilu8lqyiR() {
        try {
            return W6LpgmOhfkE9MxK.AnZ4ntgRZiVOQFYAd.AnZ4ntgRZiVOQFYAd(ByteBuffer.wrap(Base64.decode(this.sessionKey, 2)).getLong(0));
        } catch (Exception e12) {
            String message = e12.getMessage();
            if (message == null) {
                message = "";
            }
            ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", message, e12);
            AnZ4ntgRZiVOQFYAd((Throwable) e12);
            return W6LpgmOhfkE9MxK.AnZ4ntgRZiVOQFYAd.AnZ4ntgRZiVOQFYAd(System.nanoTime());
        }
    }

    private final long MyHc7quGyJKbnAIkFgd() {
        try {
            return new JSONObject(ru.cyberity.ff.a.f435638a.h().f()).optLong("frameDelay", 500L);
        } catch (Exception e12) {
            ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Failed to parse config: " + ru.cyberity.ff.a.f435638a.h().f(), e12);
            return 500L;
        }
    }

    private final boolean hKhP1IV1YI8WgJ4nSpWmOP() {
        return ((Boolean) this.isEmulator.getValue()).booleanValue();
    }

    private final void ixRCtjLaoPvSdVLG7eWTMMZt4s() {
        if (this.showProcessingTimer == null) {
            Timer timer = new Timer();
            timer.schedule(new mHpAqA5X2yTV8tAgi03zK(), TimeUnit.SECONDS.toMillis(2L));
            this.showProcessingTimer = timer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lx7eKxkYx4Q7d70nzPK5p4g6() {
        if (this.slowConnectionTimer == null) {
            Timer timer = new Timer();
            timer.schedule(new lESe0M818JY17jafmiI(), TimeUnit.SECONDS.toMillis(2L));
            this.slowConnectionTimer = timer;
        }
    }

    @k
    public final n2<b8k1CqqNgacAsHleVkUzBdlNS> Hxrfc64cpBNzdXtCQnYxNm1uSR() {
        return this.status;
    }

    public final void SgUnet9ElyJIfH62oFZvAtwNx9() {
        float brightness;
        float brightness2;
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(ru.cyberity.log.c.a(this), "Stop calibration", null, 4, null);
        ru.cyberity.cbr.prooface.data.VEkdd97RzWe vEkdd97RzWe = this.calibrationResult;
        if (vEkdd97RzWe != null) {
            List<ru.cyberity.cbr.prooface.data.ar2zdFahlgqFwCDaNcK2mMj8NV2W> listPeujtyiBSfZOKD0yphJi2 = vEkdd97RzWe.peujtyiBSfZOKD0yphJi2();
            if (listPeujtyiBSfZOKD0yphJi2 != null) {
                Iterator<T> it = listPeujtyiBSfZOKD0yphJi2.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                brightness = ((ru.cyberity.cbr.prooface.data.ar2zdFahlgqFwCDaNcK2mMj8NV2W) it.next()).getBrightness();
                while (it.hasNext()) {
                    brightness = Math.max(brightness, ((ru.cyberity.cbr.prooface.data.ar2zdFahlgqFwCDaNcK2mMj8NV2W) it.next()).getBrightness());
                }
            } else {
                brightness = 0.0f;
            }
            List<ru.cyberity.cbr.prooface.data.ar2zdFahlgqFwCDaNcK2mMj8NV2W> listPeujtyiBSfZOKD0yphJi22 = vEkdd97RzWe.peujtyiBSfZOKD0yphJi2();
            if (listPeujtyiBSfZOKD0yphJi22 != null) {
                Iterator<T> it2 = listPeujtyiBSfZOKD0yphJi22.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                brightness2 = ((ru.cyberity.cbr.prooface.data.ar2zdFahlgqFwCDaNcK2mMj8NV2W) it2.next()).getBrightness();
                while (it2.hasNext()) {
                    brightness2 = Math.min(brightness2, ((ru.cyberity.cbr.prooface.data.ar2zdFahlgqFwCDaNcK2mMj8NV2W) it2.next()).getBrightness());
                }
            } else {
                brightness2 = 0.0f;
            }
            vEkdd97RzWe.AnZ4ntgRZiVOQFYAd((brightness <= 0.0f || (brightness - brightness2) / brightness <= 0.3f) ? "fail" : "ok");
        }
    }

    @k
    public final n2<gCh8O9vEEXKO12FpnjmYuc29DG> U4mhkUewPl2fPUTo32() {
        return this.livenessResultFlow;
    }

    public final boolean peujtyiBSfZOKD0yphJi2() {
        return this.settingsRepository.h();
    }

    public final void qDU6tWL1eFyUpkx72FqDl7Rs8Zhj() {
        AnZ4ntgRZiVOQFYAd(this, CBRLivenessReason.UserCancelled.INSTANCE, (String) null, 2, (Object) null);
    }

    public final void ro5yTlDmHIztT() {
        C43259k.d(androidx.view.N0.a(this), null, null, new Pe4ctusE5exdr80p8YYA(null), 3);
    }

    public final void wHwI6WiVaPW36cHlnYtNbdyeJ6() {
        C43259k.d(androidx.view.N0.a(this), null, null, new D473JWsR39bUMY1x9AKHD(null), 3);
    }

    public final void yaDeBzW8OgCgJUx() {
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "stopSession()", null, 4, null);
        N0 n02 = this.calibrationJob;
        if (n02 != null) {
            n02.c(null);
        }
        this.faceDetector.stop();
        this.livenessRepository.uz93gWN1OYgIQ();
        this.bufferBitmap.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean peujtyiBSfZOKD0yphJi2(Bitmap image) {
        if (this.fragmentsSent > 0 || this.requiredFragments == 0 || System.currentTimeMillis() - this.lastDebugFragmentSent < 0) {
            return false;
        }
        AnZ4ntgRZiVOQFYAd(image, new Size(image.getWidth(), image.getHeight()), "NOT_ALIGNED");
        this.lastDebugFragmentSent = System.currentTimeMillis() + JosStatusCodes.RTN_CODE_COMMON_ERROR;
        return true;
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "()V"}, k = 3, mv = {1, 7, 1})
    public static final class Vebb79iOB88guoCFXUxq extends N implements Y41.a<G0> {
        final /* synthetic */ long AnZ4ntgRZiVOQFYAd;
        final /* synthetic */ Handler MyHc7quGyJKbnAIkFgd;
        final /* synthetic */ Y41.a<G0> peujtyiBSfZOKD0yphJi2;
        final /* synthetic */ long uz93gWN1OYgIQ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Vebb79iOB88guoCFXUxq(long j12, long j13, Y41.a<G0> aVar, Handler handler) {
            super(0);
            this.AnZ4ntgRZiVOQFYAd = j12;
            this.uz93gWN1OYgIQ = j13;
            this.peujtyiBSfZOKD0yphJi2 = aVar;
            this.MyHc7quGyJKbnAIkFgd = handler;
        }

        public final void AnZ4ntgRZiVOQFYAd() {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.AnZ4ntgRZiVOQFYAd;
            long j12 = this.uz93gWN1OYgIQ;
            if (jElapsedRealtime >= j12) {
                this.peujtyiBSfZOKD0yphJi2.invoke();
                return;
            }
            Handler handler = this.MyHc7quGyJKbnAIkFgd;
            final Y41.a<G0> aVar = this.peujtyiBSfZOKD0yphJi2;
            handler.postDelayed(new Runnable() { // from class: ru.cyberity.cbr.prooface.presentation.d
                @Override // java.lang.Runnable
                public final void run() {
                    VEkdd97RzWe.Vebb79iOB88guoCFXUxq.AnZ4ntgRZiVOQFYAd(aVar);
                }
            }, j12 - jElapsedRealtime);
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            AnZ4ntgRZiVOQFYAd();
            return G0.f406611a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AnZ4ntgRZiVOQFYAd(Y41.a aVar) {
            aVar.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @k
    /* renamed from: uz93gWN1OYgIQ, reason: merged with bridge method [inline-methods] */
    public Mvd4a63GEdh6H getDefaultState() {
        return new Mvd4a63GEdh6H(null, 1, 0 == true ? 1 : 0);
    }

    private final void uz93gWN1OYgIQ(Bitmap bitmap) {
        try {
            Matrix matrix = new Matrix();
            matrix.setScale(0.2f, 0.2f);
            matrix.postScale(-1.0f, 1.0f);
            this.lastImage = z.f432843a.a(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true), 20, true);
        } catch (Throwable th2) {
            AnZ4ntgRZiVOQFYAd(th2);
        }
    }

    public final void uz93gWN1OYgIQ(@k Exception exception) {
        CBRViewModel.throwError$default(this, exception, this.idDocSetType, null, 4, null);
    }

    public final void AnZ4ntgRZiVOQFYAd(boolean z12) {
        this.faceRecognizedState = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String AnZ4ntgRZiVOQFYAd(ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx session) {
        String answer = session != null ? session.getAnswer() : null;
        AnswerType answerType = AnswerType.Green;
        if (L.f(answer, answerType.getValue())) {
            return answerType.getValue();
        }
        return (!(session != null ? L.f(session.getAllowContinuing(), Boolean.TRUE) : false) || L.f(session.getAnswer(), answerType.getValue())) ? AnswerType.Red.getValue() : AnswerType.Yellow.getValue();
    }

    public final void AnZ4ntgRZiVOQFYAd(@k Exception e12) {
        AnZ4ntgRZiVOQFYAd(this, new CBRLivenessReason.InitializationError(e12), (String) null, 2, (Object) null);
        AnZ4ntgRZiVOQFYAd((Throwable) e12);
    }

    public static /* synthetic */ void AnZ4ntgRZiVOQFYAd(VEkdd97RzWe vEkdd97RzWe, CBRLivenessReason cBRLivenessReason, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        vEkdd97RzWe.AnZ4ntgRZiVOQFYAd(cBRLivenessReason, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AnZ4ntgRZiVOQFYAd(CBRLivenessReason reason, String answer) {
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "finishWithReason: " + reason, null, 4, null);
        C43259k.d(androidx.view.N0.a(this), null, null, new CKquZmGHwbQOkV5H9qw(reason, answer, null), 3);
    }

    public final void AnZ4ntgRZiVOQFYAd(boolean allowContinue, @Y61.l String answer) {
        CBRLivenessReason cBRLivenessReason;
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "finishSession()", null, 4, null);
        if (L.f(answer, AnswerType.Green.getValue())) {
            cBRLivenessReason = CBRLivenessReason.VeritifcationSuccessfully.INSTANCE;
        } else {
            cBRLivenessReason = (L.f(answer, AnswerType.Red.getValue()) && allowContinue) ? CBRLivenessReason.CompletedUnsuccessfullyAllowContinue.INSTANCE : CBRLivenessReason.UnknownInternalError.INSTANCE;
        }
        AnZ4ntgRZiVOQFYAd(cBRLivenessReason, answer);
    }

    public final void AnZ4ntgRZiVOQFYAd(@Y61.l String actionId, @Y61.l String actionType, @k String camera) {
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "startSession()", null, 4, null);
        InterfaceC20120j0 interfaceC20120j0 = this.imageProxy;
        if (interfaceC20120j0 != null) {
            interfaceC20120j0.close();
        }
        if (hKhP1IV1YI8WgJ4nSpWmOP()) {
            AnZ4ntgRZiVOQFYAd(this, new CBRLivenessReason.InitializationError(new IllegalArgumentException("Can't run on emulator")), (String) null, 2, (Object) null);
            return;
        }
        showProgress(true);
        this.cameraName = camera;
        this.actionId = actionId;
        this.actionType = actionType;
        this.livenessRepository.AnZ4ntgRZiVOQFYAd(this.livenessCallback);
        this.faceDetector.start();
        AnZ4ntgRZiVOQFYAd("Face Detector used: " + this.faceDetector.getName());
        this.lastDebugFragmentSent = System.currentTimeMillis() + ((long) 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AnZ4ntgRZiVOQFYAd(a.AbstractC12480a result) {
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "onResult " + result, null, 4, null);
        if (result instanceof a.AbstractC12480a.c) {
            this._status.setValue(new b8k1CqqNgacAsHleVkUzBdlNS.ar2zdFahlgqFwCDaNcK2mMj8NV2W(getStrings().a("sns_facescan_hint_facePosition")));
            return;
        }
        if (result instanceof a.AbstractC12480a.e) {
            this._status.setValue(new b8k1CqqNgacAsHleVkUzBdlNS.W6LpgmOhfkE9MxK(getStrings().a("sns_facescan_hint_facePosition")));
            return;
        }
        if (result instanceof a.AbstractC12480a.d) {
            this._status.setValue(new b8k1CqqNgacAsHleVkUzBdlNS.d8gDEgxuRMWxWXii0(((a.AbstractC12480a.d) result).getFaceBox(), getStrings().a("sns_facescan_hint_facePosition")));
            return;
        }
        if (result instanceof a.AbstractC12480a.C12481a) {
            ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(ru.cyberity.log.c.a(this), "FaceDetectorResult: " + ((a.AbstractC12480a.C12481a) result).getE(), null, 4, null);
            return;
        }
        if (result instanceof a.AbstractC12480a.b) {
            a.AbstractC12480a.b bVar = (a.AbstractC12480a.b) result;
            this._status.setValue(new b8k1CqqNgacAsHleVkUzBdlNS.C12548VEkdd97RzWe(bVar.getFaceBox(), getStrings().a("sns_facescan_hint_lookStraight")));
            AnZ4ntgRZiVOQFYAd(bVar);
        }
    }

    private final Y41.a<G0> AnZ4ntgRZiVOQFYAd(long minTimeMs, Y41.a<G0> onStopAction) {
        return new Vebb79iOB88guoCFXUxq(SystemClock.elapsedRealtime(), minTimeMs, onStopAction, new Handler(Looper.getMainLooper()));
    }

    public final void AnZ4ntgRZiVOQFYAd(@k InterfaceC20120j0 imageProxy, @k RectF capturingBox, float exposure) {
        List<ru.cyberity.cbr.prooface.data.ar2zdFahlgqFwCDaNcK2mMj8NV2W> listPeujtyiBSfZOKD0yphJi2;
        try {
            ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "Process image", null, 4, null);
            Y41.a<G0> aVarAnZ4ntgRZiVOQFYAd = AnZ4ntgRZiVOQFYAd(MyHc7quGyJKbnAIkFgd(), new RKNtRGuvfwF75ZeTA(imageProxy));
            if (!this.livenessRepository.getIsConnected()) {
                ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "Liveness session is not yet connected, skipping frame analyzing", null, 4, null);
                aVarAnZ4ntgRZiVOQFYAd.invoke();
                return;
            }
            this.imageProxy = imageProxy;
            Bitmap bitmapA = f0.a(imageProxy, new jLLRYWE14LVa8BjuMSlFaohnlD5Y());
            ru.cyberity.cbr.prooface.data.VEkdd97RzWe vEkdd97RzWe = this.calibrationResult;
            if (vEkdd97RzWe != null && !vEkdd97RzWe.MyHc7quGyJKbnAIkFgd()) {
                if (!this.isCalibrationNeeded) {
                    ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "processImage(), Calibration is not completed", null, 4, null);
                }
                this.isCalibrationNeeded = true;
                if (this.saveCalibrationValue) {
                    this.saveCalibrationValue = false;
                    Q<Integer, Float> qAnZ4ntgRZiVOQFYAd = ru.cyberity.cbr.prooface.domain.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd.AnZ4ntgRZiVOQFYAd(bitmapA);
                    u0 u0Var = u0.f406856a;
                    String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(qAnZ4ntgRZiVOQFYAd.f406619b.intValue() & 16777215)}, 1));
                    ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "Calibrate, color=" + str + ", brightness=" + qAnZ4ntgRZiVOQFYAd + ", expositionBias=" + exposure, null, 4, null);
                    ru.cyberity.cbr.prooface.data.VEkdd97RzWe vEkdd97RzWe2 = this.calibrationResult;
                    if (vEkdd97RzWe2 != null && (listPeujtyiBSfZOKD0yphJi2 = vEkdd97RzWe2.peujtyiBSfZOKD0yphJi2()) != null) {
                        listPeujtyiBSfZOKD0yphJi2.add(new ru.cyberity.cbr.prooface.data.ar2zdFahlgqFwCDaNcK2mMj8NV2W(exposure, qAnZ4ntgRZiVOQFYAd.f406620c.floatValue(), str));
                    }
                }
                bitmapA.recycle();
                aVarAnZ4ntgRZiVOQFYAd.invoke();
                return;
            }
            this.isCalibrationNeeded = false;
            this.faceDetector.a(bitmapA, capturingBox, new IiPIDY1ns4brViAcOWQgjdW6G4(aVarAnZ4ntgRZiVOQFYAd));
        } catch (Throwable th2) {
            AnZ4ntgRZiVOQFYAd(th2);
            imageProxy.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AnZ4ntgRZiVOQFYAd(Throwable e12) {
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "error " + e12.getMessage(), e12);
        Logger loggerA = ru.cyberity.log.a.f436064a.a(LoggerType.KIBANA);
        String strA = ru.cyberity.log.c.a(this);
        String message = e12.getMessage();
        if (message == null) {
            message = "";
        }
        loggerA.e(strA, message, e12);
    }

    private final void AnZ4ntgRZiVOQFYAd(String message) {
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "message", null, 4, null);
        Logger.d$default(ru.cyberity.log.a.f436064a.a(LoggerType.KIBANA), ru.cyberity.log.c.a(this), message, null, 4, null);
    }

    public final void AnZ4ntgRZiVOQFYAd(float current, float min, float max) {
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(ru.cyberity.log.c.a(this), "Start calibration, min=" + min + ", max=" + max + ", current=" + current, null, 4, null);
        N0 n02 = this.calibrationJob;
        if (n02 != null) {
            n02.c(null);
        }
        if (min == max) {
            ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(ru.cyberity.log.c.a(this), "Calibration, exposure min=max", null, 4, null);
            this.calibrationResult = ru.cyberity.cbr.prooface.data.VEkdd97RzWe.INSTANCE.uz93gWN1OYgIQ();
        } else {
            this.calibrationJob = C43259k.d(androidx.view.N0.a(this), C43262l0.f411947c, null, new lj6JoJrqgHd2LvZHrZoOsDOgMWu(min, max, current, null), 2);
        }
    }

    private final void AnZ4ntgRZiVOQFYAd(a.AbstractC12480a.b segment) {
        if (!this.faceRecognizedState) {
            this.lastFragmentSent = System.currentTimeMillis() + 200;
            return;
        }
        int i12 = this.fragmentsSent;
        if (i12 == this.requiredFragments && i12 > 0) {
            ixRCtjLaoPvSdVLG7eWTMMZt4s();
        }
        if (this.fragmentsSent >= this.requiredFragments) {
            N0 n02 = this.duplicateLivenessJob;
            if (n02 != null) {
                n02.c(null);
                return;
            }
            return;
        }
        if (System.currentTimeMillis() - this.lastFragmentSent < 0) {
            return;
        }
        this.fragmentsSent++;
        AnZ4ntgRZiVOQFYAd(segment.getImage(), segment.getTrackSize(), "OK");
        this.lastFragmentSent = System.currentTimeMillis() + 200;
        this._livenessResult.setValue(new gCh8O9vEEXKO12FpnjmYuc29DG.P5t5x18Nr9Zgcg9u0Pj(this.fragmentsSent / this.requiredFragments));
    }

    private final String AnZ4ntgRZiVOQFYAd(byte[] meta, byte[] image, byte[] salt) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(meta.length + image.length + 8);
        byteBufferAllocate.putInt(meta.length);
        byteBufferAllocate.put(meta);
        byteBufferAllocate.putInt(image.length);
        byteBufferAllocate.put(image);
        return Base64.encodeToString(this.crypto.AnZ4ntgRZiVOQFYAd(byteBufferAllocate.array(), salt), 2);
    }

    private final void AnZ4ntgRZiVOQFYAd(Bitmap bitmap, Size trackSize, String faceStatus) {
        C43259k.d(androidx.view.N0.a(this), null, null, new tAmFDluShEzZuB4vjsN(bitmap, trackSize, faceStatus, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AnZ4ntgRZiVOQFYAd(android.graphics.Bitmap r33, android.util.Size r34, java.lang.String r35, kotlin.coroutines.Continuation<? super ru.cyberity.cbr.prooface.data.NriLyb2MNC2> r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(android.graphics.Bitmap, android.util.Size, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final a.b AnZ4ntgRZiVOQFYAd(Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 92, byteArrayOutputStream);
        a.b bVar = new a.b(bitmap.getWidth(), bitmap.getHeight(), byteArrayOutputStream.toByteArray());
        byteArrayOutputStream.close();
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AnZ4ntgRZiVOQFYAd() {
        Timer timer = this.showProcessingTimer;
        if (timer != null) {
            timer.cancel();
        }
        this.showProcessingTimer = null;
        Timer timer2 = this.slowConnectionTimer;
        if (timer2 != null) {
            timer2.cancel();
        }
        this.slowConnectionTimer = null;
    }

    private final Object AnZ4ntgRZiVOQFYAd(Continuation<? super Map<String, String>> continuation) throws Throwable {
        if (ru.cyberity.ff.a.f435638a.d().g()) {
            Logger.d$default(ru.cyberity.log.a.f436064a, "Fingerprinter", "Fingerprint is enabled, collecting...", null, 4, null);
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
            this.fingerprinter.b(new YmUIMad2RGVcjAVbbZlkIKzM9b1Cy(safeContinuation));
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return orThrow;
        }
        Logger.d$default(ru.cyberity.log.a.f436064a, "Fingerprinter", "Fingerprint is disabled", null, 4, null);
        return null;
    }
}

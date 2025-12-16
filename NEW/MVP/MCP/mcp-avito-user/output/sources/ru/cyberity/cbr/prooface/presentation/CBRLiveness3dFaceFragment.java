package ru.cyberity.cbr.prooface.presentation;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.camera.core.C20144v;
import androidx.camera.core.InterfaceC20120j0;
import androidx.camera.view.PreviewView;
import androidx.dynamicanimation.animation.i;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.transition.C23503n;
import androidx.transition.Q;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.result.h;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import i.b;
import j.X;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;
import pY0.C47034b;
import ru.cyberity.cbr.core.analytics.Control;
import ru.cyberity.cbr.core.analytics.PermissionPayload;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.g;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.common.t;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.model.AnswerType;
import ru.cyberity.cbr.core.data.model.CBRCompletionResult;
import ru.cyberity.cbr.core.data.model.CBRLivenessReason;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.l;
import ru.cyberity.cbr.core.domain.camera.CameraX;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.widget.CBRLivenessFaceView;
import ru.cyberity.cbr.core.widget.CBRStepState;
import ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx;
import ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe;
import ru.cyberity.cyberity_mobile_sdk_liveness_3dface.R;

@Metadata(d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 Å\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002Å\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010\u0006J\u0017\u0010,\u001a\u00020\u00102\u0006\u0010 \u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J!\u00101\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00100\u001a\u00020\u0007H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0010H\u0002¢\u0006\u0004\b3\u0010\u0006J#\u0010$\u001a\u00020\u00102\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u001404H\u0002¢\u0006\u0004\b$\u00107J\u0017\u0010$\u001a\u00020\u00102\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b$\u0010:J\u000f\u0010;\u001a\u00020\u0010H\u0002¢\u0006\u0004\b;\u0010\u0006J\u000f\u0010<\u001a\u00020\u0010H\u0002¢\u0006\u0004\b<\u0010\u0006J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b$\u0010?J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020@H\u0002¢\u0006\u0004\b$\u0010AJ\u0017\u0010$\u001a\u00020B2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\b$\u0010DJ\u0017\u0010$\u001a\u00020\u00102\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\b$\u0010GJ\u000f\u0010H\u001a\u00020\u0010H\u0002¢\u0006\u0004\bH\u0010\u0006J\u000f\u0010I\u001a\u00020\u0010H\u0002¢\u0006\u0004\bI\u0010\u0006J'\u0010$\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010M\u0012\u0004\u0012\u00020N0L2\b\u0010K\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\b$\u0010OJ\u000f\u0010P\u001a\u00020\u0010H\u0002¢\u0006\u0004\bP\u0010\u0006J\u000f\u0010Q\u001a\u00020\u0010H\u0002¢\u0006\u0004\bQ\u0010\u0006J\u000f\u0010$\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010\u0006J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020RH\u0002¢\u0006\u0004\b$\u0010SJ\u000f\u0010T\u001a\u00020\u0010H\u0002¢\u0006\u0004\bT\u0010\u0006J\u000f\u0010U\u001a\u00020\u0010H\u0002¢\u0006\u0004\bU\u0010\u0006J\u0019\u0010$\u001a\u00020\u00102\b\u0010W\u001a\u0004\u0018\u00010VH\u0003¢\u0006\u0004\b$\u0010XJ3\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070L2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010[\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010]J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020YH\u0003¢\u0006\u0004\b$\u0010^R\u001b\u0010b\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b$\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010g\u001a\u00020c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010d\u001a\u0004\be\u0010fR\u001d\u0010l\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001d\u0010q\u001a\u0004\u0018\u00010m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010i\u001a\u0004\bo\u0010pR\u001d\u0010v\u001a\u0004\u0018\u00010r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010i\u001a\u0004\bt\u0010uR\u001d\u0010z\u001a\u0004\u0018\u00010w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010i\u001a\u0004\bx\u0010yR\u001d\u0010}\u001a\u0004\u0018\u00010w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010i\u001a\u0004\b|\u0010yR\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u007f\u0010i\u001a\u0005\bh\u0010\u0080\u0001R!\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010i\u001a\u0005\b\u007f\u0010\u0084\u0001R\u001f\u0010\u0087\u0001\u001a\u0004\u0018\u00010w8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\bt\u0010i\u001a\u0005\b\u0086\u0001\u0010yR \u0010\u008a\u0001\u001a\u0004\u0018\u00010w8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010i\u001a\u0005\b\u0089\u0001\u0010yR \u0010\u008b\u0001\u001a\u0004\u0018\u00010r8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010i\u001a\u0005\b\u0083\u0001\u0010uR \u0010\u008d\u0001\u001a\u0004\u0018\u00010w8TX\u0094\u0084\u0002¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010i\u001a\u0005\b\u008c\u0001\u0010yR \u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008e\u00018BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b|\u0010i\u001a\u0005\bn\u0010\u008f\u0001R\u0017\u0010\u0093\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bx\u0010\u0092\u0001R\u0018\u0010\u0095\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bo\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b`\u0010\u0094\u0001R\u0018\u0010\u0098\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bP\u0010\u0097\u0001R\u0019\u0010\u009b\u0001\u001a\u00030\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b3\u0010\u009a\u0001R\u001b\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bT\u0010\u009d\u0001R\u001b\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bU\u0010\u009d\u0001R\u001b\u0010¢\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bQ\u0010¡\u0001R\u001a\u0010¤\u0001\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bH\u0010£\u0001R\u0018\u0010¥\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010\u0097\u0001R\u0018\u0010¦\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bI\u0010\u0097\u0001R\u0017\u0010¨\u0001\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010\u0097\u0001R\u0017\u0010ª\u0001\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010\u0097\u0001R)\u0010¯\u0001\u001a\u0012\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002050¬\u0001\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u001b\u0010²\u0001\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0017\u0010µ\u0001\u001a\u0002058TX\u0094\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R#\u0010¸\u0001\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\f048VX\u0096\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R#\u0010º\u0001\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\f048VX\u0096\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010·\u0001R#\u0010¼\u0001\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\f048VX\u0096\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010·\u0001R#\u0010¾\u0001\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\f048VX\u0096\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010·\u0001R\u0019\u0010Á\u0001\u001a\u0005\u0018\u00010¿\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b{\u0010À\u0001R\u0016\u0010Ã\u0001\u001a\u00020B8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bs\u0010Â\u0001R#\u0010Ä\u0001\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\f048BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010·\u0001¨\u0006Æ\u0001"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/CBRLiveness3dFaceFragment;", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$Mvd4a63GEdh6H;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe;", "Landroid/hardware/SensorEventListener;", "<init>", "()V", "", "getLayoutId", "()I", "Lru/cyberity/cbr/core/common/a0;", "reason", "", "payload", "", "delay", "Lkotlin/G0;", "finish", "(Lru/cyberity/cbr/core/common/a0;Ljava/lang/Object;Ljava/lang/Long;)V", "finishReason", "", "onFinishCalled", "(Lru/cyberity/cbr/core/common/a0;)Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onViewModelPrepared", "(Landroid/os/Bundle;)V", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", VoiceInfo.STATE, "AnZ4ntgRZiVOQFYAd", "(Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$Mvd4a63GEdh6H;Landroid/os/Bundle;)V", "onStart", "onDestroyView", "onStop", "onResume", "onPause", "Landroid/hardware/SensorEvent;", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "stAj3XxWeahoQPVmlXh7CqSNWdN", "", "", "grantResults", "(Ljava/util/Map;)V", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS;", "status", "(Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS;)V", "pqTM3bdO8XTXh7no", "uz93gWN1OYgIQ", "Lru/cyberity/cbr/core/data/model/l$b;", "finishEvent", "(Lru/cyberity/cbr/core/data/model/l$b;)V", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "(Lru/cyberity/cbr/core/data/model/CBRLivenessReason;)V", "Landroid/graphics/RectF;", "faceBox", "(Landroid/graphics/RectF;)Landroid/graphics/RectF;", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$b8k1CqqNgacAsHleVkUzBdlNS;", "result", "(Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$b8k1CqqNgacAsHleVkUzBdlNS;)V", "kYOC3yMOMQtzjuoeUZM", "YUZngThubTDILTkVu", "Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "session", "Lkotlin/Q;", "Landroid/graphics/drawable/Drawable;", "Lru/cyberity/cbr/core/widget/CBRStepState;", "(Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;)Lkotlin/Q;", "Gn2neQw35zOxo2tMX", "ullELxy1GMYHVmKjJfw7S", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$ShowPermissionDialog;", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$ShowPermissionDialog;)V", "pgbixkNCJDL", "OYwueUbBw1kS", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$Snkgl4azaPYl3o9T8p9tjFx;", "dialog", "(Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$Snkgl4azaPYl3o9T8p9tjFx;)V", "Landroid/content/Context;", "context", "screenBrightnessMode", "screenBrightnessValue", "(Landroid/content/Context;II)Lkotlin/Q;", "(Landroid/content/Context;)Z", "Lkotlin/C;", "dYlGuwNtW3Z1uTkys0m32tl0P", "()Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe;", "viewModel", "Lru/cyberity/cbr/core/analytics/Screen;", "Lru/cyberity/cbr/core/analytics/Screen;", "getScreen", "()Lru/cyberity/cbr/core/analytics/Screen;", "screen", "peujtyiBSfZOKD0yphJi2", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "E9gFqwO2FE5yBJACCUilu8lqyiR", "()Landroid/view/View;", "content", "Landroid/view/ViewGroup;", "MyHc7quGyJKbnAIkFgd", "PVF9TOlBIXvMIL", "()Landroid/view/ViewGroup;", "vgResult", "Landroid/widget/ImageView;", "U4mhkUewPl2fPUTo32", "wHwI6WiVaPW36cHlnYtNbdyeJ6", "()Landroid/widget/ImageView;", "ivIcon", "Landroid/widget/TextView;", "yaDeBzW8OgCgJUx", "()Landroid/widget/TextView;", "tvTitle", "Hxrfc64cpBNzdXtCQnYxNm1uSR", "SgUnet9ElyJIfH62oFZvAtwNx9", "tvSubTitle", "Landroid/widget/Button;", "hKhP1IV1YI8WgJ4nSpWmOP", "()Landroid/widget/Button;", "btnTryAgain", "Lru/cyberity/cbr/core/widget/CBRLivenessFaceView;", "qDU6tWL1eFyUpkx72FqDl7Rs8Zhj", "()Lru/cyberity/cbr/core/widget/CBRLivenessFaceView;", "faceView", "lx7eKxkYx4Q7d70nzPK5p4g6", "tvHint", "ro5yTlDmHIztT", "ixRCtjLaoPvSdVLG7eWTMMZt4s", "tvDebug", "ivCompleteImage", "getPoweredByText", "poweredByText", "Landroidx/camera/view/PreviewView;", "()Landroidx/camera/view/PreviewView;", "cameraView", "Lru/cyberity/cbr/core/domain/camera/CameraX;", "Lru/cyberity/cbr/core/domain/camera/CameraX;", "cameraX", "I", "brightnessMode", "brightnessValue", "Z", "needRestoreBrightness", "", "F", "illumination", "Landroidx/appcompat/app/l;", "Landroidx/appcompat/app/l;", "lackOfPermissionDialog", "writeSettingDialog", "Landroid/hardware/SensorManager;", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/Sensor;", "lightSensor", "isLivenessStarted", "writeSettingDialogShown", "MSDuTMzis5MPdCsZ4xOBNi7ZY1Y", "isDebug", "yAJeqjaYzyGRxtxmjlufnFAA", "allowSettingsDialog", "Landroidx/activity/result/h;", "", "bd5dDLnkiFt5KOGUv", "Landroidx/activity/result/h;", "permissionLauncher", "jlOFRNGMO4FmL8D7h", "Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS;", "previousFaceDetectorStatus", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "getOpenPayload", "()Ljava/util/Map;", "openPayload", "getCancelPayload", "cancelPayload", "getClosePayload", "closePayload", "getAppearPayload", "appearPayload", "Lru/cyberity/cbr/core/data/model/Document;", "()Lru/cyberity/cbr/core/data/model/Document;", "document", "()Landroid/graphics/RectF;", "capturingBox", "permissionsPayload", "Companion", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRLiveness3dFaceFragment extends BaseFragment<VEkdd97RzWe.Mvd4a63GEdh6H, ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe> implements SensorEventListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;
    static final /* synthetic */ n<Object>[] TQ9bjtpRcmqadMoHMaK6KDpWQGo;

    @k
    private static final String[] v09yZZykJE1vmW9GGRy2hp75V;

    /* renamed from: Gn2neQw35zOxo2tMX, reason: from kotlin metadata */
    private boolean needRestoreBrightness;

    /* renamed from: MSDuTMzis5MPdCsZ4xOBNi7ZY1Y, reason: from kotlin metadata */
    private final boolean isDebug;

    /* renamed from: OYwueUbBw1kS, reason: from kotlin metadata */
    @l
    private androidx.appcompat.app.l writeSettingDialog;

    /* renamed from: PVF9TOlBIXvMIL, reason: from kotlin metadata */
    private int brightnessMode;

    /* renamed from: YUZngThubTDILTkVu, reason: from kotlin metadata */
    private boolean writeSettingDialogShown;

    /* renamed from: bd5dDLnkiFt5KOGUv, reason: from kotlin metadata */
    @l
    private h<String[]> permissionLauncher;

    /* renamed from: jlOFRNGMO4FmL8D7h, reason: from kotlin metadata */
    @l
    private VEkdd97RzWe.b8k1CqqNgacAsHleVkUzBdlNS previousFaceDetectorStatus;

    /* renamed from: kYOC3yMOMQtzjuoeUZM, reason: from kotlin metadata */
    @l
    private Sensor lightSensor;

    /* renamed from: pgbixkNCJDL, reason: from kotlin metadata */
    @l
    private androidx.appcompat.app.l lackOfPermissionDialog;

    /* renamed from: pqTM3bdO8XTXh7no, reason: from kotlin metadata */
    private boolean isLivenessStarted;

    /* renamed from: ullELxy1GMYHVmKjJfw7S, reason: from kotlin metadata */
    @l
    private SensorManager sensorManager;

    /* renamed from: yAJeqjaYzyGRxtxmjlufnFAA, reason: from kotlin metadata */
    private final boolean allowSettingsDialog;

    /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.class), new NriLyb2MNC2(new gCh8O9vEEXKO12FpnjmYuc29DG(this)), new Mvd4a63GEdh6H());

    /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
    @k
    private final Screen screen = Screen.LivenessScreen;

    /* renamed from: peujtyiBSfZOKD0yphJi2, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView content = i0.a(this, R.id.cbr_content);

    /* renamed from: MyHc7quGyJKbnAIkFgd, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView vgResult = i0.a(this, R.id.cbr_container);

    /* renamed from: U4mhkUewPl2fPUTo32, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView ivIcon = i0.a(this, R.id.cbr_icon);

    /* renamed from: E9gFqwO2FE5yBJACCUilu8lqyiR, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvTitle = i0.a(this, R.id.cbr_title);

    /* renamed from: Hxrfc64cpBNzdXtCQnYxNm1uSR, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvSubTitle = i0.a(this, R.id.cbr_subtitle);

    /* renamed from: hKhP1IV1YI8WgJ4nSpWmOP, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView btnTryAgain = i0.a(this, R.id.cbr_primary_button);

    /* renamed from: qDU6tWL1eFyUpkx72FqDl7Rs8Zhj, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView faceView = i0.a(this, R.id.cbr_face_view);

    /* renamed from: wHwI6WiVaPW36cHlnYtNbdyeJ6, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvHint = i0.a(this, R.id.cbr_hint);

    /* renamed from: ro5yTlDmHIztT, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvDebug = i0.a(this, R.id.cbr_debug);

    /* renamed from: ixRCtjLaoPvSdVLG7eWTMMZt4s, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView ivCompleteImage = i0.a(this, R.id.cbr_complete_icon);

    /* renamed from: lx7eKxkYx4Q7d70nzPK5p4g6, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView poweredByText = i0.a(this, R.id.cbr_powered);

    /* renamed from: SgUnet9ElyJIfH62oFZvAtwNx9, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView cameraView = i0.a(this, R.id.cbr_camera_preview);

    /* renamed from: yaDeBzW8OgCgJUx, reason: from kotlin metadata */
    @k
    private final CameraX cameraX = new CameraX(CameraX.Mode.ANALYZER, new Size(1280, 720), C20144v.f24562b, new VEkdd97RzWe());

    /* renamed from: dYlGuwNtW3Z1uTkys0m32tl0P, reason: from kotlin metadata */
    private int brightnessValue = 255;

    /* renamed from: stAj3XxWeahoQPVmlXh7CqSNWdN, reason: from kotlin metadata */
    private float illumination = Float.MAX_VALUE;

    @Keep
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/CBRLiveness3dFaceFragment$Companion;", "", "()V", "EXTRA_ACTION_ID", "", "EXTRA_ACTION_TYPE", "EXTRA_DOCUMENT", "EXTRA_ID_DOC_SET_TYPE", "MINIMUM_LIGHT", "", "OPTIMAL_IMAGE_HEIGHT", "OPTIMAL_IMAGE_WIDTH", "REQUIRED_PERMISSIONS", "", "[Ljava/lang/String;", "RESULT_DELAY", "", "newInstance", "Landroidx/fragment/app/Fragment;", "idDocSetType", "document", "Lru/cyberity/cbr/core/data/model/Document;", "actionId", "actionType", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public static /* synthetic */ Fragment newInstance$default(Companion companion, String str, Document document, String str2, String str3, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                document = null;
            }
            if ((i12 & 4) != 0) {
                str2 = null;
            }
            if ((i12 & 8) != 0) {
                str3 = null;
            }
            return companion.newInstance(str, document, str2, str3);
        }

        @Keep
        @k
        public final Fragment newInstance(@k String idDocSetType, @l Document document, @l String actionId, @l String actionType) {
            CBRLiveness3dFaceFragment cBRLiveness3dFaceFragment = new CBRLiveness3dFaceFragment();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_ID_DOC_SET_TYPE", idDocSetType);
            bundle.putParcelable("EXTRA_DOCUMENT", document);
            bundle.putString("EXTRA_ACTION_ID", actionId);
            bundle.putString("EXTRA_ACTION_TYPE", actionType);
            cBRLiveness3dFaceFragment.setArguments(bundle);
            return cBRLiveness3dFaceFragment;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "AnZ4ntgRZiVOQFYAd", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class Mvd4a63GEdh6H extends N implements Y41.a<P0.c> {
        public Mvd4a63GEdh6H() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            CBRLiveness3dFaceFragment cBRLiveness3dFaceFragment = CBRLiveness3dFaceFragment.this;
            return new ru.cyberity.cbr.prooface.presentation.ar2zdFahlgqFwCDaNcK2mMj8NV2W(cBRLiveness3dFaceFragment, cBRLiveness3dFaceFragment.getServiceLocator(), CBRLiveness3dFaceFragment.this.getArguments());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "AnZ4ntgRZiVOQFYAd", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class NriLyb2MNC2 extends N implements Y41.a<S0> {
        final /* synthetic */ Y41.a AnZ4ntgRZiVOQFYAd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NriLyb2MNC2(Y41.a aVar) {
            super(0);
            this.AnZ4ntgRZiVOQFYAd = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.AnZ4ntgRZiVOQFYAd.invoke()).getF42820b();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "()V"}, k = 3, mv = {1, 7, 1})
    public static final class P5t5x18Nr9Zgcg9u0Pj extends N implements Y41.a<G0> {
        public P5t5x18Nr9Zgcg9u0Pj() {
            super(0);
        }

        public final void AnZ4ntgRZiVOQFYAd() {
            CBRLiveness3dFaceFragment.this.lackOfPermissionDialog = null;
            BaseFragment.finish$default(CBRLiveness3dFaceFragment.this, a0.a.f432636a, null, null, 6, null);
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            AnZ4ntgRZiVOQFYAd();
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ru/cyberity/cbr/prooface/presentation/CBRLiveness3dFaceFragment$W6LpgmOhfkE9MxK", "Lru/cyberity/cbr/core/widget/CBRLivenessFaceView$CBRFaceStateListener;", "Lru/cyberity/cbr/core/widget/CBRLivenessFaceView$CBRFaceViewState;", VoiceInfo.STATE, "Lkotlin/G0;", "onState", "(Lru/cyberity/cbr/core/widget/CBRLivenessFaceView$CBRFaceViewState;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    public static final class W6LpgmOhfkE9MxK implements CBRLivenessFaceView.CBRFaceStateListener {
        public W6LpgmOhfkE9MxK() {
        }

        @Override // ru.cyberity.cbr.core.widget.CBRLivenessFaceView.CBRFaceStateListener
        public void onState(@k CBRLivenessFaceView.CBRFaceViewState state) {
            CBRLiveness3dFaceFragment.this.getViewModel().AnZ4ntgRZiVOQFYAd(state == CBRLivenessFaceView.CBRFaceViewState.Recognized);
            if (state == CBRLivenessFaceView.CBRFaceViewState.Complete) {
                CBRLiveness3dFaceFragment.this.AnZ4ntgRZiVOQFYAd();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS;", "status", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$b8k1CqqNgacAsHleVkUzBdlNS;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3dFaceFragment$onViewModelPrepared$1", f = "CBRLiveness3dFaceFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class ar2zdFahlgqFwCDaNcK2mMj8NV2W extends SuspendLambda implements p<VEkdd97RzWe.b8k1CqqNgacAsHleVkUzBdlNS, Continuation<? super G0>, Object> {
        int AnZ4ntgRZiVOQFYAd;
        /* synthetic */ Object uz93gWN1OYgIQ;

        public ar2zdFahlgqFwCDaNcK2mMj8NV2W(Continuation<? super ar2zdFahlgqFwCDaNcK2mMj8NV2W> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l VEkdd97RzWe.b8k1CqqNgacAsHleVkUzBdlNS b8k1cqqngacashlevkuzbdlns, @l Continuation<? super G0> continuation) {
            return ((ar2zdFahlgqFwCDaNcK2mMj8NV2W) create(b8k1cqqngacashlevkuzbdlns, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            ar2zdFahlgqFwCDaNcK2mMj8NV2W ar2zdfahlgqfwcdanck2mmj8nv2w = CBRLiveness3dFaceFragment.this.new ar2zdFahlgqFwCDaNcK2mMj8NV2W(continuation);
            ar2zdfahlgqfwcdanck2mmj8nv2w.uz93gWN1OYgIQ = obj;
            return ar2zdfahlgqfwcdanck2mmj8nv2w;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.AnZ4ntgRZiVOQFYAd != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            VEkdd97RzWe.b8k1CqqNgacAsHleVkUzBdlNS b8k1cqqngacashlevkuzbdlns = (VEkdd97RzWe.b8k1CqqNgacAsHleVkUzBdlNS) this.uz93gWN1OYgIQ;
            if (b8k1cqqngacashlevkuzbdlns != null) {
                CBRLiveness3dFaceFragment.this.AnZ4ntgRZiVOQFYAd(b8k1cqqngacashlevkuzbdlns);
            }
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3dFaceFragment$showResult$1", f = "CBRLiveness3dFaceFragment.kt", i = {}, l = {490}, m = "invokeSuspend", n = {}, s = {})
    public static final class b8k1CqqNgacAsHleVkUzBdlNS extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        int AnZ4ntgRZiVOQFYAd;
        final /* synthetic */ Snkgl4azaPYl3o9T8p9tjFx peujtyiBSfZOKD0yphJi2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b8k1CqqNgacAsHleVkUzBdlNS(Snkgl4azaPYl3o9T8p9tjFx snkgl4azaPYl3o9T8p9tjFx, Continuation<? super b8k1CqqNgacAsHleVkUzBdlNS> continuation) {
            super(2, continuation);
            this.peujtyiBSfZOKD0yphJi2 = snkgl4azaPYl3o9T8p9tjFx;
        }

        @Override // Y41.p
        @l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((b8k1CqqNgacAsHleVkUzBdlNS) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return CBRLiveness3dFaceFragment.this.new b8k1CqqNgacAsHleVkUzBdlNS(this.peujtyiBSfZOKD0yphJi2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.AnZ4ntgRZiVOQFYAd;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.AnZ4ntgRZiVOQFYAd = 1;
                if (C43131e0.b(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            ViewGroup viewGroupPVF9TOlBIXvMIL = CBRLiveness3dFaceFragment.this.PVF9TOlBIXvMIL();
            if (viewGroupPVF9TOlBIXvMIL != null) {
                viewGroupPVF9TOlBIXvMIL.setVisibility(8);
            }
            ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe viewModel = CBRLiveness3dFaceFragment.this.getViewModel();
            Boolean allowContinuing = this.peujtyiBSfZOKD0yphJi2.getAllowContinuing();
            viewModel.AnZ4ntgRZiVOQFYAd(allowContinuing != null ? allowContinuing.booleanValue() : false, this.peujtyiBSfZOKD0yphJi2.getAnswer());
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG;", "result", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/prooface/presentation/VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.presentation.CBRLiveness3dFaceFragment$onViewModelPrepared$2", f = "CBRLiveness3dFaceFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d8gDEgxuRMWxWXii0 extends SuspendLambda implements p<VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG, Continuation<? super G0>, Object> {
        int AnZ4ntgRZiVOQFYAd;
        /* synthetic */ Object uz93gWN1OYgIQ;

        public d8gDEgxuRMWxWXii0(Continuation<? super d8gDEgxuRMWxWXii0> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG gch8o9veexko12fpnjmyuc29dg, @l Continuation<? super G0> continuation) {
            return ((d8gDEgxuRMWxWXii0) create(gch8o9veexko12fpnjmyuc29dg, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d8gDEgxuRMWxWXii0 d8gdegxurmwxwxii0 = CBRLiveness3dFaceFragment.this.new d8gDEgxuRMWxWXii0(continuation);
            d8gdegxurmwxwxii0.uz93gWN1OYgIQ = obj;
            return d8gdegxurmwxwxii0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            ImageView imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.AnZ4ntgRZiVOQFYAd != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG gch8o9veexko12fpnjmyuc29dg = (VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG) this.uz93gWN1OYgIQ;
            ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "livenessResult: " + gch8o9veexko12fpnjmyuc29dg, null, 4, null);
            if (!(gch8o9veexko12fpnjmyuc29dg instanceof VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.P5t5x18Nr9Zgcg9u0Pj)) {
                if (gch8o9veexko12fpnjmyuc29dg instanceof VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.b8k1CqqNgacAsHleVkUzBdlNS) {
                    CBRLiveness3dFaceFragment.this.AnZ4ntgRZiVOQFYAd((VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.b8k1CqqNgacAsHleVkUzBdlNS) gch8o9veexko12fpnjmyuc29dg);
                } else if (gch8o9veexko12fpnjmyuc29dg instanceof VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.C12552gCh8O9vEEXKO12FpnjmYuc29DG) {
                    View view = CBRLiveness3dFaceFragment.this.getView();
                    View viewFindViewById = view != null ? view.findViewById(R.id.cbr_camera) : null;
                    if (viewFindViewById != null) {
                        viewFindViewById.setVisibility(0);
                    }
                    TextView textViewLx7eKxkYx4Q7d70nzPK5p4g6 = CBRLiveness3dFaceFragment.this.lx7eKxkYx4Q7d70nzPK5p4g6();
                    if (textViewLx7eKxkYx4Q7d70nzPK5p4g6 != null) {
                        textViewLx7eKxkYx4Q7d70nzPK5p4g6.setText(((VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.C12552gCh8O9vEEXKO12FpnjmYuc29DG) gch8o9veexko12fpnjmyuc29dg).getHint());
                    }
                    CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP = CBRLiveness3dFaceFragment.this.hKhP1IV1YI8WgJ4nSpWmOP();
                    if (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP != null) {
                        cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP.setRecognizingState();
                    }
                    ImageView imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj2 = CBRLiveness3dFaceFragment.this.qDU6tWL1eFyUpkx72FqDl7Rs8Zhj();
                    if (imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj2 != null) {
                        imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj2.setVisibility(8);
                    }
                    if (((VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.C12552gCh8O9vEEXKO12FpnjmYuc29DG) gch8o9veexko12fpnjmyuc29dg).getCalibrationEnabled()) {
                        ru.cyberity.cbr.core.domain.camera.b bVarF = CBRLiveness3dFaceFragment.this.cameraX.f();
                        CBRLiveness3dFaceFragment.this.getViewModel().AnZ4ntgRZiVOQFYAd(bVarF.getCurrent(), bVarF.getMin(), bVarF.getMax());
                    }
                } else if (gch8o9veexko12fpnjmyuc29dg instanceof VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.W6LpgmOhfkE9MxK) {
                    TextView textViewLx7eKxkYx4Q7d70nzPK5p4g62 = CBRLiveness3dFaceFragment.this.lx7eKxkYx4Q7d70nzPK5p4g6();
                    if (textViewLx7eKxkYx4Q7d70nzPK5p4g62 != null) {
                        textViewLx7eKxkYx4Q7d70nzPK5p4g62.setText(((VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.W6LpgmOhfkE9MxK) gch8o9veexko12fpnjmyuc29dg).getHint());
                    }
                } else if (gch8o9veexko12fpnjmyuc29dg instanceof VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.ar2zdFahlgqFwCDaNcK2mMj8NV2W) {
                    androidx.transition.T t12 = new androidx.transition.T();
                    C23503n c23503n = new C23503n(1);
                    t12.N(c23503n);
                    C23503n c23503n2 = new C23503n(2);
                    c23503n2.f54666c = c23503n.f54667d;
                    t12.N(c23503n2);
                    Q.a((ViewGroup) CBRLiveness3dFaceFragment.this.requireView().findViewById(R.id.cbr_overlay), t12);
                    TextView textViewLx7eKxkYx4Q7d70nzPK5p4g63 = CBRLiveness3dFaceFragment.this.lx7eKxkYx4Q7d70nzPK5p4g6();
                    if (textViewLx7eKxkYx4Q7d70nzPK5p4g63 != null) {
                        textViewLx7eKxkYx4Q7d70nzPK5p4g63.setText(((VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.ar2zdFahlgqFwCDaNcK2mMj8NV2W) gch8o9veexko12fpnjmyuc29dg).getHint());
                    }
                    CBRLiveness3dFaceFragment.this.YUZngThubTDILTkVu();
                    CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP2 = CBRLiveness3dFaceFragment.this.hKhP1IV1YI8WgJ4nSpWmOP();
                    if (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP2 != null) {
                        cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP2.setFaceAnalyzingState();
                    }
                    ImageView imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj3 = CBRLiveness3dFaceFragment.this.qDU6tWL1eFyUpkx72FqDl7Rs8Zhj();
                    if ((imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj3 == null || imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj3.getVisibility() != 0) && (imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj = CBRLiveness3dFaceFragment.this.qDU6tWL1eFyUpkx72FqDl7Rs8Zhj()) != null) {
                        imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj.setImageBitmap(((VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.ar2zdFahlgqFwCDaNcK2mMj8NV2W) gch8o9veexko12fpnjmyuc29dg).getBlurredLastImage());
                        imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj.setVisibility(0);
                        imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj.setAlpha(0.0f);
                        imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj.animate().alpha(1.0f).setDuration(imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj.getResources().getInteger(android.R.integer.config_shortAnimTime)).start();
                    }
                } else if (gch8o9veexko12fpnjmyuc29dg instanceof VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.C12551VEkdd97RzWe) {
                    String strA = ru.cyberity.log.c.a(CBRLiveness3dFaceFragment.this);
                    StringBuilder sb2 = new StringBuilder("Calibrate, set exposure = ");
                    VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.C12551VEkdd97RzWe c12551VEkdd97RzWe = (VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.C12551VEkdd97RzWe) gch8o9veexko12fpnjmyuc29dg;
                    sb2.append(c12551VEkdd97RzWe.getValue());
                    ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(strA, sb2.toString(), null, 4, null);
                    CBRLiveness3dFaceFragment.this.cameraX.a(c12551VEkdd97RzWe.getValue());
                } else if (gch8o9veexko12fpnjmyuc29dg instanceof VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.d8gDEgxuRMWxWXii0) {
                    String strA2 = ru.cyberity.log.c.a(CBRLiveness3dFaceFragment.this);
                    StringBuilder sb3 = new StringBuilder("Calibrate, set exposure = ");
                    VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.d8gDEgxuRMWxWXii0 d8gdegxurmwxwxii0 = (VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.d8gDEgxuRMWxWXii0) gch8o9veexko12fpnjmyuc29dg;
                    sb3.append(d8gdegxurmwxwxii0.getValue());
                    ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd(strA2, sb3.toString(), null, 4, null);
                    CBRLiveness3dFaceFragment.this.cameraX.a(d8gdegxurmwxwxii0.getValue());
                    CBRLiveness3dFaceFragment.this.getViewModel().SgUnet9ElyJIfH62oFZvAtwNx9();
                }
            }
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "AnZ4ntgRZiVOQFYAd", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    public static final class gCh8O9vEEXKO12FpnjmYuc29DG extends N implements Y41.a<Fragment> {
        final /* synthetic */ Fragment AnZ4ntgRZiVOQFYAd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gCh8O9vEEXKO12FpnjmYuc29DG(Fragment fragment) {
            super(0);
            this.AnZ4ntgRZiVOQFYAd = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.AnZ4ntgRZiVOQFYAd;
        }
    }

    static {
        h0 h0Var = new h0(CBRLiveness3dFaceFragment.class, "content", "getContent()Landroid/view/View;", 0);
        n0 n0Var = m0.f406844a;
        TQ9bjtpRcmqadMoHMaK6KDpWQGo = new n[]{n0Var.i(h0Var), C0.k(CBRLiveness3dFaceFragment.class, "vgResult", "getVgResult()Landroid/view/ViewGroup;", 0, n0Var), C0.k(CBRLiveness3dFaceFragment.class, "ivIcon", "getIvIcon()Landroid/widget/ImageView;", 0, n0Var), C0.k(CBRLiveness3dFaceFragment.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0, n0Var), C0.k(CBRLiveness3dFaceFragment.class, "tvSubTitle", "getTvSubTitle()Landroid/widget/TextView;", 0, n0Var), C0.k(CBRLiveness3dFaceFragment.class, "btnTryAgain", "getBtnTryAgain()Landroid/widget/Button;", 0, n0Var), C0.k(CBRLiveness3dFaceFragment.class, "faceView", "getFaceView()Lru/cyberity/cbr/core/widget/CBRLivenessFaceView;", 0, n0Var), C0.k(CBRLiveness3dFaceFragment.class, "tvHint", "getTvHint()Landroid/widget/TextView;", 0, n0Var), C0.k(CBRLiveness3dFaceFragment.class, "tvDebug", "getTvDebug()Landroid/widget/TextView;", 0, n0Var), C0.k(CBRLiveness3dFaceFragment.class, "ivCompleteImage", "getIvCompleteImage()Landroid/widget/ImageView;", 0, n0Var), C0.k(CBRLiveness3dFaceFragment.class, "poweredByText", "getPoweredByText()Landroid/widget/TextView;", 0, n0Var), C0.k(CBRLiveness3dFaceFragment.class, "cameraView", "getCameraView()Landroidx/camera/view/PreviewView;", 0, n0Var)};
        INSTANCE = new Companion(null);
        v09yZZykJE1vmW9GGRy2hp75V = new String[]{"android.permission.CAMERA"};
    }

    public CBRLiveness3dFaceFragment() {
        ru.cyberity.ff.a aVar = ru.cyberity.ff.a.f435638a;
        this.isDebug = aVar.j().g();
        this.allowSettingsDialog = aVar.k().g();
    }

    private final void Gn2neQw35zOxo2tMX() {
        TextView textViewLx7eKxkYx4Q7d70nzPK5p4g6 = lx7eKxkYx4Q7d70nzPK5p4g6();
        if (textViewLx7eKxkYx4Q7d70nzPK5p4g6 != null) {
            textViewLx7eKxkYx4Q7d70nzPK5p4g6.setAlpha(0.0f);
            textViewLx7eKxkYx4Q7d70nzPK5p4g6.animate().alpha(1.0f).start();
        }
        CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP = hKhP1IV1YI8WgJ4nSpWmOP();
        if (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP != null) {
            cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP.setRecognizingState();
        }
        ViewGroup viewGroupPVF9TOlBIXvMIL = PVF9TOlBIXvMIL();
        if (viewGroupPVF9TOlBIXvMIL == null) {
            return;
        }
        viewGroupPVF9TOlBIXvMIL.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OYwueUbBw1kS() {
        if (this.illumination >= 10.0f || this.needRestoreBrightness || !AnZ4ntgRZiVOQFYAd(requireContext())) {
            return;
        }
        kotlin.Q<Integer, Integer> qAnZ4ntgRZiVOQFYAd = AnZ4ntgRZiVOQFYAd(requireContext(), 0, 255);
        this.brightnessMode = qAnZ4ntgRZiVOQFYAd.f406619b.intValue();
        this.brightnessValue = qAnZ4ntgRZiVOQFYAd.f406620c.intValue();
        this.needRestoreBrightness = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup PVF9TOlBIXvMIL() {
        return (ViewGroup) this.vgResult.a(this, TQ9bjtpRcmqadMoHMaK6KDpWQGo[1]);
    }

    private final TextView SgUnet9ElyJIfH62oFZvAtwNx9() {
        return (TextView) this.tvSubTitle.a(this, TQ9bjtpRcmqadMoHMaK6KDpWQGo[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void YUZngThubTDILTkVu() {
        this.isLivenessStarted = false;
    }

    private final TextView ixRCtjLaoPvSdVLG7eWTMMZt4s() {
        return (TextView) this.tvDebug.a(this, TQ9bjtpRcmqadMoHMaK6KDpWQGo[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void kYOC3yMOMQtzjuoeUZM() {
        ImageView imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj = qDU6tWL1eFyUpkx72FqDl7Rs8Zhj();
        if (imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj != null) {
            imageViewQDU6tWL1eFyUpkx72FqDl7Rs8Zhj.setVisibility(8);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            getViewModel().AnZ4ntgRZiVOQFYAd(arguments.getString("EXTRA_ACTION_ID"), arguments.getString("EXTRA_ACTION_TYPE"), "Built-in front camera");
        }
        this.isLivenessStarted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView lx7eKxkYx4Q7d70nzPK5p4g6() {
        return (TextView) this.tvHint.a(this, TQ9bjtpRcmqadMoHMaK6KDpWQGo[7]);
    }

    private final void pgbixkNCJDL() {
        if (this.needRestoreBrightness && AnZ4ntgRZiVOQFYAd(requireContext())) {
            AnZ4ntgRZiVOQFYAd(requireContext(), this.brightnessMode, this.brightnessValue);
            this.needRestoreBrightness = false;
        }
    }

    private final void pqTM3bdO8XTXh7no() {
        getViewModel().yaDeBzW8OgCgJUx();
        this.cameraX.g();
    }

    private final void stAj3XxWeahoQPVmlXh7CqSNWdN() {
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "Init camera", null, 4, null);
        this.cameraX.a(getViewLifecycleOwner(), MyHc7quGyJKbnAIkFgd());
    }

    private final void ullELxy1GMYHVmKjJfw7S() {
        CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP = hKhP1IV1YI8WgJ4nSpWmOP();
        if (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP != null) {
            cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP.setScanCompleteState();
        }
    }

    private final TextView yaDeBzW8OgCgJUx() {
        return (TextView) this.tvTitle.a(this, TQ9bjtpRcmqadMoHMaK6KDpWQGo[3]);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: dYlGuwNtW3Z1uTkys0m32tl0P, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe getViewModel() {
        return (ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void finish(@k a0 reason, @l Object payload, @l Long delay) {
        if (payload instanceof l.b) {
            AnZ4ntgRZiVOQFYAd((l.b) payload);
        } else if (payload instanceof l.c) {
            AnZ4ntgRZiVOQFYAd(((l.c) payload).getReason());
        } else {
            super.finish(reason, payload, delay);
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Map<String, Object> getAppearPayload() {
        return ro5yTlDmHIztT();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Map<String, Object> getCancelPayload() {
        return ro5yTlDmHIztT();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Map<String, Object> getClosePayload() {
        return ro5yTlDmHIztT();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        DocumentType type;
        String value;
        Document documentHxrfc64cpBNzdXtCQnYxNm1uSR = Hxrfc64cpBNzdXtCQnYxNm1uSR();
        return (documentHxrfc64cpBNzdXtCQnYxNm1uSR == null || (type = documentHxrfc64cpBNzdXtCQnYxNm1uSR.getType()) == null || (value = type.getValue()) == null) ? "TYPE_UNKNOWN" : value;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_liveness_3dface;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Map<String, Object> getOpenPayload() {
        return ro5yTlDmHIztT();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @Y61.l
    public TextView getPoweredByText() {
        return (TextView) this.poweredByText.a(this, TQ9bjtpRcmqadMoHMaK6KDpWQGo[10]);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Screen getScreen() {
        return this.screen;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "handleEvent: " + event, null, 4, null);
        if (event instanceof CBRViewModel.ShowPermissionDialog) {
            AnZ4ntgRZiVOQFYAd((CBRViewModel.ShowPermissionDialog) event);
            return;
        }
        if (event instanceof VEkdd97RzWe.P5t5x18Nr9Zgcg9u0Pj) {
            ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "HandleErrorEvent: " + ((VEkdd97RzWe.P5t5x18Nr9Zgcg9u0Pj) event).getError(), null, 4, null);
            updateShowProgress(true);
            stAj3XxWeahoQPVmlXh7CqSNWdN();
            return;
        }
        if (!(event instanceof CBRViewModel.ErrorEvent)) {
            super.handleEvent(event);
            return;
        }
        pqTM3bdO8XTXh7no();
        CBRViewModel.ErrorEvent errorEvent = (CBRViewModel.ErrorEvent) event;
        getBaseActivity().onError(errorEvent.getError(), errorEvent.getIdDocSetType(), errorEvent.getButtonText());
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.cameraX.g();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public boolean onFinishCalled(@k a0 finishReason) {
        if (!(finishReason instanceof a0.c)) {
            return super.onFinishCalled(finishReason);
        }
        View viewE9gFqwO2FE5yBJACCUilu8lqyiR = E9gFqwO2FE5yBJACCUilu8lqyiR();
        if (viewE9gFqwO2FE5yBJACCUilu8lqyiR != null) {
            viewE9gFqwO2FE5yBJACCUilu8lqyiR.setVisibility(4);
        }
        getViewModel().qDU6tWL1eFyUpkx72FqDl7Rs8Zhj();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        pgbixkNCJDL();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.registerListener(this, this.lightSensor, 3);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@k SensorEvent event) {
        this.illumination = event.values[0];
        OYwueUbBw1kS();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (getIsPrepared()) {
            uz93gWN1OYgIQ();
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        androidx.appcompat.app.l lVar = this.lackOfPermissionDialog;
        if (lVar != null) {
            lVar.dismiss();
        }
        this.lackOfPermissionDialog = null;
        androidx.appcompat.app.l lVar2 = this.writeSettingDialog;
        if (lVar2 != null) {
            lVar2.dismiss();
        }
        this.writeSettingDialog = null;
        getViewModel().yaDeBzW8OgCgJUx();
        super.onStop();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @Y61.l Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.permissionLauncher = registerForActivityResult(new b.k(), new androidx.view.result.a() { // from class: ru.cyberity.cbr.prooface.presentation.a
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                CBRLiveness3dFaceFragment.AnZ4ntgRZiVOQFYAd(this.f435633b, (Map) obj);
            }
        });
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void onViewModelPrepared(@Y61.l Bundle savedInstanceState) {
        super.onViewModelPrepared(savedInstanceState);
        CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP = hKhP1IV1YI8WgJ4nSpWmOP();
        if (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP != null) {
            cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP.setVisibility(4);
        }
        SensorManager sensorManager = (SensorManager) requireContext().getSystemService("sensor");
        this.sensorManager = sensorManager;
        this.lightSensor = sensorManager != null ? sensorManager.getDefaultSensor(5) : null;
        j0.b(getViewModel().Hxrfc64cpBNzdXtCQnYxNm1uSR(), this, new ar2zdFahlgqFwCDaNcK2mMj8NV2W(null));
        j0.b(getViewModel().U4mhkUewPl2fPUTo32(), this, new d8gDEgxuRMWxWXii0(null));
        CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP2 = hKhP1IV1YI8WgJ4nSpWmOP();
        if (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP2 != null) {
            cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP2.setStateListener(new W6LpgmOhfkE9MxK());
        }
        TextView textViewIxRCtjLaoPvSdVLG7eWTMMZt4s = ixRCtjLaoPvSdVLG7eWTMMZt4s();
        if (textViewIxRCtjLaoPvSdVLG7eWTMMZt4s != null) {
            textViewIxRCtjLaoPvSdVLG7eWTMMZt4s.setVisibility(this.isDebug ? 0 : 8);
        }
        uz93gWN1OYgIQ();
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\tJ\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u0007\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"ru/cyberity/cbr/prooface/presentation/CBRLiveness3dFaceFragment$VEkdd97RzWe", "Lru/cyberity/cbr/core/domain/camera/a;", "Landroidx/camera/core/j0;", "image", "Lru/cyberity/cbr/core/domain/camera/b;", "exposure", "Lkotlin/G0;", "a", "(Landroidx/camera/core/j0;Lru/cyberity/cbr/core/domain/camera/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "(Ljava/lang/Exception;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    public static final class VEkdd97RzWe implements ru.cyberity.cbr.core.domain.camera.a {
        public VEkdd97RzWe() {
        }

        @Override // ru.cyberity.cbr.core.domain.camera.a
        @Y61.l
        public Object a(@k InterfaceC20120j0 interfaceC20120j0, @k ru.cyberity.cbr.core.domain.camera.b bVar, @k Continuation<? super G0> continuation) {
            CBRLiveness3dFaceFragment.this.getViewModel().AnZ4ntgRZiVOQFYAd(interfaceC20120j0, CBRLiveness3dFaceFragment.this.U4mhkUewPl2fPUTo32(), bVar.getCurrent());
            return G0.f406611a;
        }

        @Override // ru.cyberity.cbr.core.domain.camera.a
        public void a() {
            ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "onPreviewReady()", null, 4, null);
            CBRLiveness3dFaceFragment.this.kYOC3yMOMQtzjuoeUZM();
            CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP = CBRLiveness3dFaceFragment.this.hKhP1IV1YI8WgJ4nSpWmOP();
            if (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP != null) {
                cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP.setVisibility(0);
            }
            CBRLiveness3dFaceFragment.this.OYwueUbBw1kS();
        }

        @Override // ru.cyberity.cbr.core.domain.camera.a
        public void a(@k Exception e12) {
            CBRLiveness3dFaceFragment.this.getViewModel().AnZ4ntgRZiVOQFYAd(e12);
        }
    }

    private final View E9gFqwO2FE5yBJACCUilu8lqyiR() {
        return this.content.a(this, TQ9bjtpRcmqadMoHMaK6KDpWQGo[0]);
    }

    private final Document Hxrfc64cpBNzdXtCQnYxNm1uSR() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (Document) arguments.getParcelable("EXTRA_DOCUMENT");
        }
        return null;
    }

    private final PreviewView MyHc7quGyJKbnAIkFgd() {
        return (PreviewView) this.cameraView.a(this, TQ9bjtpRcmqadMoHMaK6KDpWQGo[11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RectF U4mhkUewPl2fPUTo32() {
        Rect faceCapturingRect = hKhP1IV1YI8WgJ4nSpWmOP().getFaceCapturingRect();
        MyHc7quGyJKbnAIkFgd().getLocationInWindow(new int[2]);
        hKhP1IV1YI8WgJ4nSpWmOP().getLocationInWindow(new int[2]);
        return new RectF(((r1[0] - r2[0]) + faceCapturingRect.left) / MyHc7quGyJKbnAIkFgd().getWidth(), ((r1[1] - r2[1]) + faceCapturingRect.top) / MyHc7quGyJKbnAIkFgd().getHeight(), ((r1[0] - r2[0]) + faceCapturingRect.right) / MyHc7quGyJKbnAIkFgd().getWidth(), ((r1[1] - r2[1]) + faceCapturingRect.bottom) / MyHc7quGyJKbnAIkFgd().getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CBRLivenessFaceView hKhP1IV1YI8WgJ4nSpWmOP() {
        return (CBRLivenessFaceView) this.faceView.a(this, TQ9bjtpRcmqadMoHMaK6KDpWQGo[6]);
    }

    private final Button peujtyiBSfZOKD0yphJi2() {
        return (Button) this.btnTryAgain.a(this, TQ9bjtpRcmqadMoHMaK6KDpWQGo[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView qDU6tWL1eFyUpkx72FqDl7Rs8Zhj() {
        return (ImageView) this.ivCompleteImage.a(this, TQ9bjtpRcmqadMoHMaK6KDpWQGo[9]);
    }

    private final Map<String, Object> ro5yTlDmHIztT() {
        Context context = getContext();
        if (context == null) {
            return kotlin.collections.P0.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PermissionPayload.CAMERA_PERMISSION.toString(), Boolean.valueOf(t.a(context, "android.permission.CAMERA")));
        return linkedHashMap;
    }

    private final void uz93gWN1OYgIQ() {
        String[] strArr = v09yZZykJE1vmW9GGRy2hp75V;
        int length = strArr.length;
        boolean z12 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                z12 = true;
                break;
            }
            if (!t.a(requireContext(), strArr[i12])) {
                break;
            } else {
                i12++;
            }
        }
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", f.l("checkPermissions: granted=", z12), null, 4, null);
        if (z12) {
            stAj3XxWeahoQPVmlXh7CqSNWdN();
            return;
        }
        h<String[]> hVar = this.permissionLauncher;
        if (hVar != null) {
            hVar.b(v09yZZykJE1vmW9GGRy2hp75V);
        }
    }

    private final ImageView wHwI6WiVaPW36cHlnYtNbdyeJ6() {
        return (ImageView) this.ivIcon.a(this, TQ9bjtpRcmqadMoHMaK6KDpWQGo[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void peujtyiBSfZOKD0yphJi2(CBRLiveness3dFaceFragment cBRLiveness3dFaceFragment, DialogInterface dialogInterface, int i12) {
        cBRLiveness3dFaceFragment.writeSettingDialog = null;
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnZ4ntgRZiVOQFYAd(CBRLiveness3dFaceFragment cBRLiveness3dFaceFragment, Map map) {
        cBRLiveness3dFaceFragment.AnZ4ntgRZiVOQFYAd((Map<String, Boolean>) map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AnZ4ntgRZiVOQFYAd(VEkdd97RzWe.b8k1CqqNgacAsHleVkUzBdlNS status) {
        CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP;
        CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP2;
        CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP3;
        CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP4;
        VEkdd97RzWe.b8k1CqqNgacAsHleVkUzBdlNS b8k1cqqngacashlevkuzbdlns = this.previousFaceDetectorStatus;
        boolean zEquals = true;
        if (b8k1cqqngacashlevkuzbdlns != null) {
            Class<?> cls = status.getClass();
            n0 n0Var = m0.f406844a;
            zEquals = true ^ n0Var.b(cls).equals(n0Var.b(b8k1cqqngacashlevkuzbdlns.getClass()));
        }
        VEkdd97RzWe.b8k1CqqNgacAsHleVkUzBdlNS b8k1cqqngacashlevkuzbdlns2 = zEquals ? status : null;
        if (b8k1cqqngacashlevkuzbdlns2 != null) {
            ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "face detector status: " + b8k1cqqngacashlevkuzbdlns2, null, 4, null);
        }
        this.previousFaceDetectorStatus = status;
        ViewGroup viewGroupPVF9TOlBIXvMIL = PVF9TOlBIXvMIL();
        if (viewGroupPVF9TOlBIXvMIL != null && viewGroupPVF9TOlBIXvMIL.getVisibility() == 0) {
            CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP5 = hKhP1IV1YI8WgJ4nSpWmOP();
            if (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP5 != null) {
                cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP5.setScanCompleteState();
                return;
            }
            return;
        }
        if (this.isLivenessStarted) {
            TextView textViewLx7eKxkYx4Q7d70nzPK5p4g6 = lx7eKxkYx4Q7d70nzPK5p4g6();
            if (textViewLx7eKxkYx4Q7d70nzPK5p4g6 != null) {
                textViewLx7eKxkYx4Q7d70nzPK5p4g6.setText(status.getHint());
            }
            if (status instanceof VEkdd97RzWe.b8k1CqqNgacAsHleVkUzBdlNS.ar2zdFahlgqFwCDaNcK2mMj8NV2W) {
                CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP6 = hKhP1IV1YI8WgJ4nSpWmOP();
                if (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP6 != null) {
                    cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP6.setRecognizingState();
                }
                if (!this.isDebug || (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP4 = hKhP1IV1YI8WgJ4nSpWmOP()) == null) {
                    return;
                }
                cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP4.setFaceRectangle(null);
                return;
            }
            if (status instanceof VEkdd97RzWe.b8k1CqqNgacAsHleVkUzBdlNS.d8gDEgxuRMWxWXii0) {
                CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP7 = hKhP1IV1YI8WgJ4nSpWmOP();
                if (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP7 != null) {
                    cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP7.setRecognizingState();
                }
                if (!this.isDebug || (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP3 = hKhP1IV1YI8WgJ4nSpWmOP()) == null) {
                    return;
                }
                cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP3.setFaceRectangle(AnZ4ntgRZiVOQFYAd(((VEkdd97RzWe.b8k1CqqNgacAsHleVkUzBdlNS.d8gDEgxuRMWxWXii0) status).getFaceRectangle()));
                return;
            }
            if (status instanceof VEkdd97RzWe.b8k1CqqNgacAsHleVkUzBdlNS.W6LpgmOhfkE9MxK) {
                CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP8 = hKhP1IV1YI8WgJ4nSpWmOP();
                if (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP8 != null) {
                    cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP8.setRecognizingState();
                }
                if (!this.isDebug || (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP2 = hKhP1IV1YI8WgJ4nSpWmOP()) == null) {
                    return;
                }
                cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP2.setFaceRectangle(null);
                return;
            }
            if (status instanceof VEkdd97RzWe.b8k1CqqNgacAsHleVkUzBdlNS.C12548VEkdd97RzWe) {
                CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP9 = hKhP1IV1YI8WgJ4nSpWmOP();
                if (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP9 != null) {
                    cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP9.setFaceDetectedState();
                }
                if (!this.isDebug || (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP = hKhP1IV1YI8WgJ4nSpWmOP()) == null) {
                    return;
                }
                cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP.setFaceRectangle(AnZ4ntgRZiVOQFYAd(((VEkdd97RzWe.b8k1CqqNgacAsHleVkUzBdlNS.C12548VEkdd97RzWe) status).getFaceRectangle()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uz93gWN1OYgIQ(CBRLiveness3dFaceFragment cBRLiveness3dFaceFragment, DialogInterface dialogInterface, int i12) {
        dialogInterface.dismiss();
        cBRLiveness3dFaceFragment.writeSettingDialog = null;
        cBRLiveness3dFaceFragment.getViewModel().ro5yTlDmHIztT();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
    public void handleState(@k VEkdd97RzWe.Mvd4a63GEdh6H state, @Y61.l Bundle savedInstanceState) {
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "handleState: " + state, null, 4, null);
        if (AnZ4ntgRZiVOQFYAd(requireContext()) || !this.allowSettingsDialog || getViewModel().peujtyiBSfZOKD0yphJi2()) {
            return;
        }
        AnZ4ntgRZiVOQFYAd(state.getWarningDialog());
    }

    private final void AnZ4ntgRZiVOQFYAd(l.b finishEvent) {
        CBRLivenessReason reason = finishEvent.getReason();
        if (reason instanceof CBRLivenessReason.NetworkError) {
            pqTM3bdO8XTXh7no();
            Exception exception = ((CBRLivenessReason.NetworkError) reason).getException();
            if (exception != null) {
                getViewModel().uz93gWN1OYgIQ(exception);
                return;
            }
            return;
        }
        BaseFragment.finish$default(this, new a0.d(new CBRCompletionResult.SuccessTermination(reason)), null, null, 6, null);
    }

    private final void AnZ4ntgRZiVOQFYAd(CBRLivenessReason reason) {
        g appListener;
        if (reason instanceof CBRLivenessReason.VeritifcationSuccessfully) {
            Document documentHxrfc64cpBNzdXtCQnYxNm1uSR = Hxrfc64cpBNzdXtCQnYxNm1uSR();
            if (documentHxrfc64cpBNzdXtCQnYxNm1uSR == null || (appListener = getAppListener()) == null) {
                return;
            }
            appListener.a(documentHxrfc64cpBNzdXtCQnYxNm1uSR);
            return;
        }
        if (reason instanceof CBRLivenessReason.CompletedUnsuccessfullyAllowContinue) {
            BaseFragment.finish$default(this, new a0.b(false, 1, null), null, null, 6, null);
            return;
        }
        if (reason instanceof CBRLivenessReason.UserCancelled) {
            BaseFragment.finish$default(this, a0.a.f432636a, null, null, 6, null);
            return;
        }
        if (reason instanceof CBRLivenessReason.NetworkError) {
            pqTM3bdO8XTXh7no();
            ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe viewModel = getViewModel();
            Exception exception = ((CBRLivenessReason.NetworkError) reason).getException();
            if (exception == null) {
                exception = new IOException();
            }
            CBRViewModel.throwError$default(viewModel, exception, getIdDocSetType(), null, 4, null);
            return;
        }
        if (reason instanceof CBRLivenessReason.InitializationError) {
            pqTM3bdO8XTXh7no();
            CBRViewModel.throwError$default(getViewModel(), ((CBRLivenessReason.InitializationError) reason).getException(), getIdDocSetType(), null, 4, null);
        } else {
            BaseFragment.finish$default(this, a0.a.f432636a, null, null, 6, null);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@Y61.l Sensor sensor, int accuracy) {
    }

    private final RectF AnZ4ntgRZiVOQFYAd(RectF faceBox) {
        int[] iArr = new int[2];
        PreviewView previewViewMyHc7quGyJKbnAIkFgd = MyHc7quGyJKbnAIkFgd();
        if (previewViewMyHc7quGyJKbnAIkFgd != null) {
            previewViewMyHc7quGyJKbnAIkFgd.getLocationInWindow(iArr);
        }
        int[] iArr2 = new int[2];
        CBRLivenessFaceView cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP = hKhP1IV1YI8WgJ4nSpWmOP();
        if (cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP != null) {
            cBRLivenessFaceViewHKhP1IV1YI8WgJ4nSpWmOP.getLocationInWindow(iArr2);
        }
        return new RectF(((faceBox.left * MyHc7quGyJKbnAIkFgd().getWidth()) - iArr2[0]) + iArr[0], ((faceBox.top * MyHc7quGyJKbnAIkFgd().getHeight()) - iArr2[1]) + iArr[1], ((faceBox.right * MyHc7quGyJKbnAIkFgd().getWidth()) - iArr2[0]) + iArr[0], ((faceBox.bottom * MyHc7quGyJKbnAIkFgd().getHeight()) - iArr2[1]) + iArr[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AnZ4ntgRZiVOQFYAd(ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe.gCh8O9vEEXKO12FpnjmYuc29DG.b8k1CqqNgacAsHleVkUzBdlNS r6) {
        /*
            r5 = this;
            ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx r0 = r6.getSession()
            kotlin.Q r1 = r5.AnZ4ntgRZiVOQFYAd(r0)
            A r2 = r1.f406619b
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            B r1 = r1.f406620c
            ru.cyberity.cbr.core.widget.CBRStepState r1 = (ru.cyberity.cbr.core.widget.CBRStepState) r1
            android.widget.ImageView r3 = r5.wHwI6WiVaPW36cHlnYtNbdyeJ6()
            if (r3 != 0) goto L17
            goto L1a
        L17:
            ru.cyberity.cbr.core.widget.CBRStepStateKt.setStepState(r3, r1)
        L1a:
            android.widget.ImageView r1 = r5.wHwI6WiVaPW36cHlnYtNbdyeJ6()
            if (r1 == 0) goto L23
            r1.setImageDrawable(r2)
        L23:
            android.widget.TextView r1 = r5.yaDeBzW8OgCgJUx()
            if (r1 != 0) goto L2a
            goto L31
        L2a:
            java.lang.CharSequence r2 = r6.getTitle()
            r1.setText(r2)
        L31:
            android.widget.TextView r1 = r5.SgUnet9ElyJIfH62oFZvAtwNx9()
            if (r1 != 0) goto L38
            goto L3f
        L38:
            java.lang.CharSequence r2 = r6.getText()
            r1.setText(r2)
        L3f:
            r1 = 0
            if (r0 == 0) goto L47
            java.lang.String r2 = r0.getAnswer()
            goto L48
        L47:
            r2 = r1
        L48:
            ru.cyberity.cbr.core.data.model.AnswerType r3 = ru.cyberity.cbr.core.data.model.AnswerType.Green
            java.lang.String r3 = r3.getValue()
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            if (r2 != 0) goto L8d
            r2 = 0
            if (r0 == 0) goto L62
            java.lang.Boolean r3 = r0.getAllowContinuing()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.L.f(r3, r4)
            goto L63
        L62:
            r3 = r2
        L63:
            if (r3 == 0) goto L66
            goto L8d
        L66:
            android.widget.Button r0 = r5.peujtyiBSfZOKD0yphJi2()
            if (r0 != 0) goto L6d
            goto L70
        L6d:
            r0.setVisibility(r2)
        L70:
            android.widget.Button r0 = r5.peujtyiBSfZOKD0yphJi2()
            if (r0 != 0) goto L77
            goto L7e
        L77:
            java.lang.CharSequence r6 = r6.getRetryText()
            r0.setText(r6)
        L7e:
            android.widget.Button r6 = r5.peujtyiBSfZOKD0yphJi2()
            if (r6 == 0) goto Laa
            ru.cyberity.cbr.prooface.presentation.c r0 = new ru.cyberity.cbr.prooface.presentation.c
            r0.<init>()
            r6.setOnClickListener(r0)
            goto Laa
        L8d:
            android.widget.Button r6 = r5.peujtyiBSfZOKD0yphJi2()
            if (r6 != 0) goto L94
            goto L99
        L94:
            r2 = 8
            r6.setVisibility(r2)
        L99:
            androidx.lifecycle.P r6 = r5.getViewLifecycleOwner()
            androidx.lifecycle.J r6 = androidx.view.C22984Q.a(r6)
            ru.cyberity.cbr.prooface.presentation.CBRLiveness3dFaceFragment$b8k1CqqNgacAsHleVkUzBdlNS r2 = new ru.cyberity.cbr.prooface.presentation.CBRLiveness3dFaceFragment$b8k1CqqNgacAsHleVkUzBdlNS
            r2.<init>(r0, r1)
            r0 = 3
            kotlinx.coroutines.C43259k.d(r6, r1, r1, r2, r0)
        Laa:
            r5.ullELxy1GMYHVmKjJfw7S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.prooface.presentation.CBRLiveness3dFaceFragment.AnZ4ntgRZiVOQFYAd(ru.cyberity.cbr.prooface.presentation.VEkdd97RzWe$gCh8O9vEEXKO12FpnjmYuc29DG$b8k1CqqNgacAsHleVkUzBdlNS):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnZ4ntgRZiVOQFYAd(CBRLiveness3dFaceFragment cBRLiveness3dFaceFragment, View view) {
        ru.cyberity.cbr.core.analytics.c.b(cBRLiveness3dFaceFragment.getAnalyticsDelegate(), Screen.LivenessScreen, cBRLiveness3dFaceFragment.getIdDocSetType(), Control.RetryButton, null, 8, null);
        cBRLiveness3dFaceFragment.Gn2neQw35zOxo2tMX();
        cBRLiveness3dFaceFragment.kYOC3yMOMQtzjuoeUZM();
        cBRLiveness3dFaceFragment.OYwueUbBw1kS();
    }

    private final kotlin.Q<Drawable, CBRStepState> AnZ4ntgRZiVOQFYAd(Snkgl4azaPYl3o9T8p9tjFx session) {
        String answer = session != null ? session.getAnswer() : null;
        AnswerType answerType = AnswerType.Green;
        if (L.f(answer, answerType.getValue())) {
            return new kotlin.Q<>(ru.cyberity.cbr.core.common.n0.f432787a.getIconHandler().onResolveIcon(requireContext(), CBRIconHandler.CBRResultIcons.SUCCESS.getImageName()), CBRStepState.APPROVED);
        }
        if ((session != null ? L.f(session.getAllowContinuing(), Boolean.TRUE) : false) && !L.f(session.getAnswer(), answerType.getValue())) {
            return new kotlin.Q<>(ru.cyberity.cbr.core.common.n0.f432787a.getIconHandler().onResolveIcon(requireContext(), CBRIconHandler.CBRResultIcons.SUBMITTED.getImageName()), CBRStepState.PENDING);
        }
        return new kotlin.Q<>(ru.cyberity.cbr.core.common.n0.f432787a.getIconHandler().onResolveIcon(requireContext(), CBRIconHandler.CBRResultIcons.FAILURE.getImageName()), CBRStepState.REJECTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AnZ4ntgRZiVOQFYAd() {
        ViewGroup viewGroupPVF9TOlBIXvMIL = PVF9TOlBIXvMIL();
        if (viewGroupPVF9TOlBIXvMIL == null || viewGroupPVF9TOlBIXvMIL.getVisibility() != 0) {
            ViewGroup viewGroupPVF9TOlBIXvMIL2 = PVF9TOlBIXvMIL();
            if (viewGroupPVF9TOlBIXvMIL2 != null) {
                viewGroupPVF9TOlBIXvMIL2.setVisibility(0);
            }
            ImageView imageViewWHwI6WiVaPW36cHlnYtNbdyeJ6 = wHwI6WiVaPW36cHlnYtNbdyeJ6();
            if (imageViewWHwI6WiVaPW36cHlnYtNbdyeJ6 != null) {
                imageViewWHwI6WiVaPW36cHlnYtNbdyeJ6.setScaleX(0.0f);
            }
            i iVar = new i(wHwI6WiVaPW36cHlnYtNbdyeJ6(), androidx.dynamicanimation.animation.c.f46025n, 1.0f);
            iVar.f46047t.b(200.0f);
            iVar.f46047t.a(0.75f);
            iVar.j();
            ImageView imageViewWHwI6WiVaPW36cHlnYtNbdyeJ62 = wHwI6WiVaPW36cHlnYtNbdyeJ6();
            if (imageViewWHwI6WiVaPW36cHlnYtNbdyeJ62 != null) {
                imageViewWHwI6WiVaPW36cHlnYtNbdyeJ62.setScaleY(0.0f);
            }
            i iVar2 = new i(wHwI6WiVaPW36cHlnYtNbdyeJ6(), androidx.dynamicanimation.animation.c.f46026o, 1.0f);
            iVar2.f46047t.b(200.0f);
            iVar2.f46047t.a(0.75f);
            iVar2.j();
            Button buttonPeujtyiBSfZOKD0yphJi2 = peujtyiBSfZOKD0yphJi2();
            if (buttonPeujtyiBSfZOKD0yphJi2 != null && buttonPeujtyiBSfZOKD0yphJi2.getVisibility() == 0) {
                buttonPeujtyiBSfZOKD0yphJi2.setAlpha(0.0f);
                buttonPeujtyiBSfZOKD0yphJi2.animate().alpha(1.0f).start();
            }
            TextView textViewLx7eKxkYx4Q7d70nzPK5p4g6 = lx7eKxkYx4Q7d70nzPK5p4g6();
            if (textViewLx7eKxkYx4Q7d70nzPK5p4g6 != null) {
                textViewLx7eKxkYx4Q7d70nzPK5p4g6.setAlpha(1.0f);
                textViewLx7eKxkYx4Q7d70nzPK5p4g6.animate().alpha(0.0f).start();
            }
            pgbixkNCJDL();
        }
    }

    private final void AnZ4ntgRZiVOQFYAd(CBRViewModel.ShowPermissionDialog event) {
        androidx.appcompat.app.l lVarA = ru.cyberity.cbr.core.android.a.f432580a.a(requireActivity(), event.getMessage(), event.getPositiveButton(), event.getNegativeButton(), (32 & 16) != 0 ? null : new P5t5x18Nr9Zgcg9u0Pj(), (32 & 32) != 0 ? null : null);
        lVarA.show();
        this.lackOfPermissionDialog = lVarA;
    }

    @X
    private final void AnZ4ntgRZiVOQFYAd(VEkdd97RzWe.Snkgl4azaPYl3o9T8p9tjFx dialog) {
        if (dialog == null || this.writeSettingDialogShown) {
            return;
        }
        this.writeSettingDialogShown = true;
        final int i12 = 0;
        final int i13 = 1;
        final int i14 = 2;
        androidx.appcompat.app.l lVarCreate = new C47034b(requireContext()).setMessage(dialog.getMessage()).setPositiveButton(dialog.getButtonPositive(), new DialogInterface.OnClickListener(this) { // from class: ru.cyberity.cbr.prooface.presentation.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CBRLiveness3dFaceFragment f435635c;

            {
                this.f435635c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                switch (i12) {
                    case 0:
                        CBRLiveness3dFaceFragment.AnZ4ntgRZiVOQFYAd(this.f435635c, dialogInterface, i15);
                        break;
                    case 1:
                        CBRLiveness3dFaceFragment.uz93gWN1OYgIQ(this.f435635c, dialogInterface, i15);
                        break;
                    default:
                        CBRLiveness3dFaceFragment.peujtyiBSfZOKD0yphJi2(this.f435635c, dialogInterface, i15);
                        break;
                }
            }
        }).setNegativeButton(dialog.getButtonNegative(), new DialogInterface.OnClickListener(this) { // from class: ru.cyberity.cbr.prooface.presentation.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CBRLiveness3dFaceFragment f435635c;

            {
                this.f435635c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                switch (i13) {
                    case 0:
                        CBRLiveness3dFaceFragment.AnZ4ntgRZiVOQFYAd(this.f435635c, dialogInterface, i15);
                        break;
                    case 1:
                        CBRLiveness3dFaceFragment.uz93gWN1OYgIQ(this.f435635c, dialogInterface, i15);
                        break;
                    default:
                        CBRLiveness3dFaceFragment.peujtyiBSfZOKD0yphJi2(this.f435635c, dialogInterface, i15);
                        break;
                }
            }
        }).setNeutralButton(dialog.getButtonNeutral(), new DialogInterface.OnClickListener(this) { // from class: ru.cyberity.cbr.prooface.presentation.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CBRLiveness3dFaceFragment f435635c;

            {
                this.f435635c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                switch (i14) {
                    case 0:
                        CBRLiveness3dFaceFragment.AnZ4ntgRZiVOQFYAd(this.f435635c, dialogInterface, i15);
                        break;
                    case 1:
                        CBRLiveness3dFaceFragment.uz93gWN1OYgIQ(this.f435635c, dialogInterface, i15);
                        break;
                    default:
                        CBRLiveness3dFaceFragment.peujtyiBSfZOKD0yphJi2(this.f435635c, dialogInterface, i15);
                        break;
                }
            }
        }).create();
        this.writeSettingDialog = lVarCreate;
        if (lVarCreate != null) {
            lVarCreate.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnZ4ntgRZiVOQFYAd(CBRLiveness3dFaceFragment cBRLiveness3dFaceFragment, DialogInterface dialogInterface, int i12) {
        dialogInterface.dismiss();
        cBRLiveness3dFaceFragment.writeSettingDialog = null;
        cBRLiveness3dFaceFragment.startActivity(new Intent("android.settings.action.MANAGE_WRITE_SETTINGS").addFlags(268435456));
    }

    private final kotlin.Q<Integer, Integer> AnZ4ntgRZiVOQFYAd(Context context, int screenBrightnessMode, int screenBrightnessValue) {
        int i12 = Settings.System.getInt(context.getContentResolver(), "screen_brightness_mode", -1);
        int i13 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        if (i12 != -1 && i13 != -1) {
            Settings.System.putInt(context.getContentResolver(), "screen_brightness_mode", screenBrightnessMode);
            Settings.System.putInt(context.getContentResolver(), "screen_brightness", screenBrightnessValue);
            WindowManager.LayoutParams attributes = requireActivity().getWindow().getAttributes();
            attributes.screenBrightness = screenBrightnessValue / 255.0f;
            requireActivity().getWindow().setAttributes(attributes);
        }
        return new kotlin.Q<>(Integer.valueOf(i12), Integer.valueOf(i13));
    }

    @X
    private final boolean AnZ4ntgRZiVOQFYAd(Context context) {
        return Settings.System.canWrite(context);
    }

    private final void AnZ4ntgRZiVOQFYAd(Map<String, Boolean> grantResults) {
        boolean z12;
        int i12 = 0;
        if (grantResults.isEmpty()) {
            z12 = true;
        } else {
            Iterator<Map.Entry<String, Boolean>> it = grantResults.entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().booleanValue()) {
                    z12 = false;
                    break;
                }
            }
            z12 = true;
        }
        ru.cyberity.cbr.prooface.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd("CyberityProoface", "handlePermissionResults: granted=" + grantResults + ".all { it.value }", null, 4, null);
        if (!grantResults.isEmpty() && !grantResults.isEmpty()) {
            Iterator<Map.Entry<String, Boolean>> it2 = grantResults.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!it2.next().getValue().booleanValue()) {
                    String[] strArr = v09yZZykJE1vmW9GGRy2hp75V;
                    int length = strArr.length;
                    while (true) {
                        if (i12 < length) {
                            if (shouldShowRequestPermissionRationale(strArr[i12])) {
                                BaseFragment.finish$default(this, a0.a.f432636a, null, null, 6, null);
                                break;
                            }
                            i12++;
                        } else {
                            getViewModel().wHwI6WiVaPW36cHlnYtNbdyeJ6();
                            break;
                        }
                    }
                }
            }
        }
        if (z12) {
            stAj3XxWeahoQPVmlXh7CqSNWdN();
        }
    }
}

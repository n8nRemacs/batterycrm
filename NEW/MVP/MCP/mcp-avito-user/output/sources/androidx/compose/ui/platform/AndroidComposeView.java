package androidx.compose.ui.platform;

import Fc1.G3;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.runtime.snapshots.C22166k;
import androidx.compose.runtime.snapshots.C22176v;
import androidx.compose.ui.RunnableC22211b;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.focus.C22220e;
import androidx.compose.ui.focus.C22228m;
import androidx.compose.ui.focus.C22240z;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22259j;
import androidx.compose.ui.graphics.InterfaceC22264l0;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.input.pointer.C22324b;
import androidx.compose.ui.input.pointer.C22328f;
import androidx.compose.ui.input.pointer.C22335m;
import androidx.compose.ui.input.pointer.InterfaceC22334l;
import androidx.compose.ui.input.pointer.InterfaceC22345x;
import androidx.compose.ui.input.pointer.InterfaceC22347z;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22404c0;
import androidx.compose.ui.node.C22414h0;
import androidx.compose.ui.node.C22418j0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22431q;
import androidx.compose.ui.node.C22444x;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.C22548y2;
import androidx.compose.ui.platform.J;
import androidx.compose.ui.semantics.C22553a;
import androidx.compose.ui.semantics.C22558f;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.text.font.D;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.input.C22654u;
import androidx.compose.ui.text.input.C22655v;
import androidx.compose.ui.text.input.C22659z;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.unit.C22711a;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.v;
import androidx.core.view.C22823h0;
import androidx.view.C23489g;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import l0.g;
import okhttp3.internal.http2.Http2;
import p0.InterfaceC44967a;
import q0.C47175a;
import q0.C47177c;
import q0.InterfaceC47176b;
import s0.C47949a;

/* compiled from: AndroidComposeView.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u008d\u0002\u008e\u0002J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR+\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010+\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R*\u00104\u001a\u00020,2\u0006\u0010-\u001a\u00020,8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010:\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010@\u001a\u00020;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010F\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010L\u001a\b\u0012\u0004\u0012\u00020A0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010R\u001a\u00020M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010X\u001a\u00020S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010^\u001a\u00020Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001a\u0010l\u001a\u00020g8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010r\u001a\u00020m8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010x\u001a\u00020s8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR.\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u000b0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u0012R\"\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u008b\u0001\u001a\u00030\u0086\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u0091\u0001\u001a\u00030\u008c\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R \u0010\u0097\u0001\u001a\u00030\u0092\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R2\u0010¡\u0001\u001a\u00030\u0098\u00018\u0016@\u0016X\u0096\u000e¢\u0006 \n\u0006\b\u0099\u0001\u0010\u009a\u0001\u0012\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R0\u0010§\u0001\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b¢\u0001\u0010\u0093\u0001\u0012\u0006\b¦\u0001\u0010 \u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0005\b¥\u0001\u0010\rR5\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b¨\u0001\u0010 \u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R\"\u0010±\u0001\u001a\u0004\u0018\u00010\u000f8FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010ª\u0001R(\u0010¸\u0001\u001a\u00030²\u00018\u0016X\u0097\u0004¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u0012\u0006\b·\u0001\u0010 \u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R \u0010¾\u0001\u001a\u00030¹\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R(\u0010Å\u0001\u001a\u00030¿\u00018\u0016X\u0097\u0004¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u0012\u0006\bÄ\u0001\u0010 \u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R3\u0010Ì\u0001\u001a\u00030Æ\u00012\u0007\u0010\u001e\u001a\u00030Æ\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bÇ\u0001\u0010 \u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R3\u0010Ó\u0001\u001a\u00030Í\u00012\u0007\u0010\u001e\u001a\u00030Í\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bÎ\u0001\u0010 \u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R \u0010Ù\u0001\u001a\u00030Ô\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001R \u0010ß\u0001\u001a\u00030Ú\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001R \u0010å\u0001\u001a\u00030à\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001R \u0010ë\u0001\u001a\u00030æ\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001R\u0017\u0010î\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\bì\u0001\u0010í\u0001R\u0018\u0010ò\u0001\u001a\u00030ï\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bð\u0001\u0010ñ\u0001R\u001a\u0010ö\u0001\u001a\u0005\u0018\u00010ó\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bô\u0001\u0010õ\u0001R\u001a\u0010ú\u0001\u001a\u0005\u0018\u00010÷\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bø\u0001\u0010ù\u0001R\u0018\u0010þ\u0001\u001a\u00030û\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bü\u0001\u0010ý\u0001R\u0017\u0010\u0080\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÿ\u0001\u0010¤\u0001R\u0018\u0010\u0082\u0002\u001a\u00030\u0098\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010\u009c\u0001R\u0018\u0010\u0086\u0002\u001a\u00030\u0083\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0018\u0010\u008a\u0002\u001a\u00030\u0087\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002R\u0018\u0010\u008c\u0002\u001a\u00030\u0098\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008b\u0002\u0010\u009c\u0001¨\u0006\u008f\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/J0;", "Landroidx/compose/ui/platform/D2;", "Landroidx/compose/ui/input/pointer/l;", "Landroidx/lifecycle/q;", "", "getImportantForAutofill", "()I", "", "intervalMillis", "Lkotlin/G0;", "setAccessibilityEventBatchIntervalMillis", "(J)V", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "callback", "setOnViewTreeOwnersAvailable", "(LY41/l;)V", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "Landroidx/compose/ui/node/P;", "d", "Landroidx/compose/ui/node/P;", "getSharedDrawScope", "()Landroidx/compose/ui/node/P;", "sharedDrawScope", "Landroidx/compose/ui/unit/d;", "<set-?>", "e", "Landroidx/compose/runtime/y1;", "getDensity", "()Landroidx/compose/ui/unit/d;", "setDensity", "(Landroidx/compose/ui/unit/d;)V", "density", "Landroidx/compose/ui/focus/B;", "f", "Landroidx/compose/ui/focus/B;", "getFocusOwner", "()Landroidx/compose/ui/focus/B;", "focusOwner", "Lkotlin/coroutines/CoroutineContext;", "value", "g", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "h", "Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "dragAndDropManager", "Landroidx/compose/ui/platform/x2;", "m", "Landroidx/compose/ui/platform/x2;", "getViewConfiguration", "()Landroidx/compose/ui/platform/x2;", "viewConfiguration", "Landroidx/compose/ui/node/LayoutNode;", "n", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/collection/A0;", "o", "Landroidx/collection/A0;", "getLayoutNodes", "()Landroidx/collection/A0;", "layoutNodes", "Landroidx/compose/ui/spatial/i;", "p", "Landroidx/compose/ui/spatial/i;", "getRectManager", "()Landroidx/compose/ui/spatial/i;", "rectManager", "Landroidx/compose/ui/node/S0;", "q", "Landroidx/compose/ui/node/S0;", "getRootForTest", "()Landroidx/compose/ui/node/S0;", "rootForTest", "Landroidx/compose/ui/semantics/w;", "r", "Landroidx/compose/ui/semantics/w;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/w;", "semanticsOwner", "Landroidx/compose/ui/contentcapture/b;", "t", "Landroidx/compose/ui/contentcapture/b;", "getContentCaptureManager$ui_release", "()Landroidx/compose/ui/contentcapture/b;", "setContentCaptureManager$ui_release", "(Landroidx/compose/ui/contentcapture/b;)V", "contentCaptureManager", "Landroidx/compose/ui/platform/d;", "u", "Landroidx/compose/ui/platform/d;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/d;", "accessibilityManager", "Landroidx/compose/ui/graphics/l0;", "v", "Landroidx/compose/ui/graphics/l0;", "getGraphicsContext", "()Landroidx/compose/ui/graphics/l0;", "graphicsContext", "Landroidx/compose/ui/autofill/s;", "w", "Landroidx/compose/ui/autofill/s;", "getAutofillTree", "()Landroidx/compose/ui/autofill/s;", "autofillTree", "Landroid/content/res/Configuration;", "D", "LY41/l;", "getConfigurationChangeObserver", "()LY41/l;", "setConfigurationChangeObserver", "configurationChangeObserver", "Landroidx/compose/ui/autofill/e;", "F", "Landroidx/compose/ui/autofill/e;", "get_autofillManager$ui_release", "()Landroidx/compose/ui/autofill/e;", "_autofillManager", "Landroidx/compose/ui/platform/f;", "H", "Landroidx/compose/ui/platform/f;", "getClipboardManager", "()Landroidx/compose/ui/platform/f;", "clipboardManager", "Landroidx/compose/ui/platform/e;", "I", "Landroidx/compose/ui/platform/e;", "getClipboard", "()Landroidx/compose/ui/platform/e;", "clipboard", "Landroidx/compose/ui/node/L0;", "J", "Landroidx/compose/ui/node/L0;", "getSnapshotObserver", "()Landroidx/compose/ui/node/L0;", "snapshotObserver", "", "K", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "V", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "c0", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "_viewTreeOwners", "d0", "Landroidx/compose/runtime/I3;", "getViewTreeOwners", "viewTreeOwners", "Landroidx/compose/ui/text/input/Y;", "j0", "Landroidx/compose/ui/text/input/Y;", "getTextInputService", "()Landroidx/compose/ui/text/input/Y;", "getTextInputService$annotations", "textInputService", "Landroidx/compose/ui/platform/j2;", "l0", "Landroidx/compose/ui/platform/j2;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/j2;", "softwareKeyboardController", "Landroidx/compose/ui/text/font/D$b;", "m0", "Landroidx/compose/ui/text/font/D$b;", "getFontLoader", "()Landroidx/compose/ui/text/font/D$b;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/E$b;", "n0", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/E$b;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/E$b;)V", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "p0", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Lp0/a;", "q0", "Lp0/a;", "getHapticFeedBack", "()Lp0/a;", "hapticFeedBack", "Landroidx/compose/ui/modifier/i;", "s0", "Landroidx/compose/ui/modifier/i;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/i;", "modifierLocalManager", "Landroidx/compose/ui/platform/o2;", "t0", "Landroidx/compose/ui/platform/o2;", "getTextToolbar", "()Landroidx/compose/ui/platform/o2;", "textToolbar", "Landroidx/compose/ui/input/pointer/z;", "F0", "Landroidx/compose/ui/input/pointer/z;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/z;", "pointerIconService", "getView", "()Landroid/view/View;", "view", "Landroidx/compose/ui/platform/F2;", "getWindowInfo", "()Landroidx/compose/ui/platform/F2;", "windowInfo", "Landroidx/compose/ui/autofill/k;", "getAutofill", "()Landroidx/compose/ui/autofill/k;", "autofill", "Landroidx/compose/ui/autofill/p;", "getAutofillManager", "()Landroidx/compose/ui/autofill/p;", "autofillManager", "Landroidx/compose/ui/platform/p0;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/p0;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Landroidx/compose/ui/layout/K0$a;", "getPlacementScope", "()Landroidx/compose/ui/layout/K0$a;", "placementScope", "Lq0/b;", "getInputModeManager", "()Lq0/b;", "inputModeManager", "getScrollCaptureInProgress$ui_release", "scrollCaptureInProgress", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements androidx.compose.ui.node.J0, D2, InterfaceC22334l, InterfaceC23057q {

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public static final a f40963H0 = new a(null);

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public static Class<?> f40964I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.l
    public static Method f40965J0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f40966A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f40967A0;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final C22335m f40968B;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final Y41.a<kotlin.G0> f40969B0;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.input.pointer.G f40970C;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final B0 f40971C0;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.l<? super Configuration, kotlin.G0> configurationChangeObserver;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f40973D0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.autofill.a f40974E;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.scrollcapture.m f40975E0;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public final androidx.compose.ui.autofill.e _autofillManager;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final q f40977F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f40978G;

    /* renamed from: G0, reason: collision with root package name */
    public int f40979G0;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final C22470f clipboardManager;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final C22466e clipboard;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final androidx.compose.ui.node.L0 snapshotObserver;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    public boolean showLayoutBounds;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public C22511p0 f40984L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public C22464d1 f40985M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public C22712b f40986N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f40987O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C22414h0 f40988P;

    /* renamed from: Q, reason: collision with root package name */
    public long f40989Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final int[] f40990R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final float[] f40991S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final float[] f40992T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final float[] f40993U;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;

    /* renamed from: W, reason: collision with root package name */
    public boolean f40995W;

    /* renamed from: a0, reason: collision with root package name */
    public long f40996a0;

    /* renamed from: b, reason: collision with root package name */
    public long f40997b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f40998b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f40999c;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC22204y1 _viewTreeOwners;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final androidx.compose.ui.node.P sharedDrawScope;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final I3 viewTreeOwners;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC22204y1 density;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super b, kotlin.G0> f41004e0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FocusOwnerImpl f41005f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final N91.l f41006f0;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public CoroutineContext coroutineContext;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final U9.f f41008g0;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final AndroidDragAndDropManager dragAndDropManager;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final ViewTreeObserverOnTouchModeChangeListenerC22482i f41010h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final D1 f41011i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.input.a0 f41012i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.v f41013j;

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final androidx.compose.ui.text.input.Y textInputService;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.v f41015k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final AtomicReference f41016k0;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.graphics.N f41017l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final V0 f41018l0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C22499m0 f41019m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final W f41020m0;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final LayoutNode root;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC22204y1 fontFamilyResolver;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final androidx.collection.A0<LayoutNode> layoutNodes;

    /* renamed from: o0, reason: collision with root package name */
    public int f41024o0;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final androidx.compose.ui.spatial.i rectManager;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC22204y1 layoutDirection;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final AndroidComposeView f41027q;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final p0.c f41028q0;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final androidx.compose.ui.semantics.w semanticsOwner;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47177c f41030r0;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.platform.r f41031s;

    /* renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final androidx.compose.ui.modifier.i modifierLocalManager;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public androidx.compose.ui.contentcapture.b contentCaptureManager;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C22467e0 f41034t0;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final C22462d accessibilityManager;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public MotionEvent f41036u0;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC22264l0 graphicsContext;

    /* renamed from: v0, reason: collision with root package name */
    public long f41038v0;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final androidx.compose.ui.autofill.s autofillTree;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final E2<androidx.compose.ui.node.I0> f41040w0;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final ArrayList f41041x;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.N0<Y41.a<kotlin.G0>> f41042x0;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public ArrayList f41043y;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final w f41044y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f41045z;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final G3 f41046z0;

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$a;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static final boolean a(a aVar) throws ClassNotFoundException {
            aVar.getClass();
            try {
                if (AndroidComposeView.f40964I0 == null) {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    AndroidComposeView.f40964I0 = cls;
                    AndroidComposeView.f40965J0 = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method = AndroidComposeView.f40965J0;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public a() {
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC22983P f41047a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC23487e f41048b;

        public b(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k InterfaceC23487e interfaceC23487e) {
            this.f41047a = interfaceC22983P;
            this.f41048b = interfaceC23487e;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq0/a;", "it", "", "invoke-iuPiT84", "(I)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<C47175a, Boolean> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(C47175a c47175a) {
            int i12 = c47175a.f428941a;
            C47175a.f428938b.getClass();
            boolean zRequestFocusFromTouch = false;
            boolean z12 = i12 == C47175a.f428939c;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            if (z12) {
                zRequestFocusFromTouch = androidComposeView.isInTouchMode();
            } else if (i12 == C47175a.f428940d) {
                zRequestFocusFromTouch = androidComposeView.isInTouchMode() ? androidComposeView.requestFocusFromTouch() : true;
            }
            return Boolean.valueOf(zRequestFocusFromTouch);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "Lkotlin/G0;", "invoke", "(Landroid/content/res/Configuration;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Configuration, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f41051l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(Configuration configuration) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends kotlin.jvm.internal.H implements Y41.a<androidx.compose.ui.platform.coreshims.b> {
        @Override // Y41.a
        public final androidx.compose.ui.platform.coreshims.b invoke() {
            View view = (View) this.receiver;
            Y41.l<? super androidx.compose.ui.text.input.P, ? extends androidx.compose.ui.text.input.P> lVar = J.f41149a;
            androidx.compose.ui.platform.coreshims.c.b(view);
            return androidx.compose.ui.platform.coreshims.c.a(view);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ KeyEvent f41053m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(KeyEvent keyEvent) {
            super(0);
            this.f41053m = keyEvent;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(this.f41053m));
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends kotlin.jvm.internal.H implements Y41.q<androidx.compose.ui.draganddrop.q, l0.n, Y41.l<? super androidx.compose.ui.graphics.drawscope.g, ? extends kotlin.G0>, Boolean> {
        public final Boolean f(androidx.compose.ui.draganddrop.q qVar, long j12, Y41.l<? super androidx.compose.ui.graphics.drawscope.g, kotlin.G0> lVar) {
            AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
            a aVar = AndroidComposeView.f40963H0;
            Resources resources = androidComposeView.getContext().getResources();
            return Boolean.valueOf(E.f41103a.a(androidComposeView, qVar, new androidx.compose.ui.draganddrop.a(androidx.compose.ui.unit.f.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j12, lVar, null)));
        }

        @Override // Y41.q
        public final /* synthetic */ Boolean invoke(androidx.compose.ui.draganddrop.q qVar, l0.n nVar, Y41.l<? super androidx.compose.ui.graphics.drawscope.g, ? extends kotlin.G0> lVar) {
            return f(qVar, nVar.f413404a, lVar);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends kotlin.jvm.internal.H implements Y41.l<Y41.a<? extends kotlin.G0>, kotlin.G0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final kotlin.G0 invoke(Y41.a<? extends kotlin.G0> aVar) {
            ((AndroidComposeView) this.receiver).I(aVar);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class i extends kotlin.jvm.internal.H implements Y41.p<C22220e, l0.j, Boolean> {
        @Override // Y41.p
        public final Boolean invoke(C22220e c22220e, l0.j jVar) {
            return Boolean.valueOf(AndroidComposeView.j((AndroidComposeView) this.receiver, c22220e, jVar));
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class j extends kotlin.jvm.internal.H implements Y41.l<C22220e, Boolean> {
        @Override // Y41.l
        public final Boolean invoke(C22220e c22220e) {
            int i12 = c22220e.f39172a;
            AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
            a aVar = AndroidComposeView.f40963H0;
            androidComposeView.getClass();
            boolean z12 = androidx.compose.ui.l.f40320a;
            C22220e.f39163b.getClass();
            boolean zB2 = false;
            if (!C22220e.b(i12, C22220e.f39170i) && !C22220e.b(i12, C22220e.f39171j)) {
                Integer numC = C22228m.c(i12);
                if (numC == null) {
                    throw new IllegalStateException("Invalid focus direction");
                }
                int iIntValue = numC.intValue();
                l0.j jVarA = androidComposeView.A();
                Rect rectB = jVarA != null ? androidx.compose.ui.graphics.X0.b(jVarA) : null;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View viewFindNextFocus = rectB == null ? focusFinder.findNextFocus(androidComposeView, androidComposeView.findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(androidComposeView, rectB, iIntValue);
                if (viewFindNextFocus != null) {
                    zB2 = C22228m.b(viewFindNextFocus, Integer.valueOf(iIntValue), rectB);
                }
            }
            return Boolean.valueOf(zB2);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class k extends kotlin.jvm.internal.H implements Y41.a<kotlin.G0> {
        /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke() {
            /*
                r2 = this;
                java.lang.Object r0 = r2.receiver
                androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
                androidx.compose.ui.platform.AndroidComposeView$a r1 = androidx.compose.ui.platform.AndroidComposeView.f40963H0
                boolean r1 = r0.isFocused()
                if (r1 != 0) goto L28
                boolean r1 = androidx.compose.ui.l.f40320a
                boolean r1 = r0.hasFocus()
                if (r1 == 0) goto L15
                goto L28
            L15:
                boolean r1 = r0.hasFocus()
                if (r1 == 0) goto L2b
                android.view.View r1 = r0.findFocus()
                if (r1 == 0) goto L24
                r1.clearFocus()
            L24:
                r0.clearFocus()
                goto L2b
            L28:
                r0.clearFocus()
            L2b:
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.k.invoke():java.lang.Object");
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class l extends kotlin.jvm.internal.H implements Y41.a<l0.j> {
        @Override // Y41.a
        public final l0.j invoke() {
            AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
            a aVar = AndroidComposeView.f40963H0;
            return androidComposeView.A();
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class m extends kotlin.jvm.internal.W {
        @Override // kotlin.jvm.internal.W, kotlin.reflect.o
        public final Object get() {
            return ((AndroidComposeView) this.receiver).getLayoutDirection();
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/focus/FocusTargetNode;", "invoke", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class n extends kotlin.jvm.internal.N implements Y41.l<FocusTargetNode, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<FocusTargetNode> f41054l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(l0.h<FocusTargetNode> hVar) {
            super(1);
            this.f41054l = hVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.ui.focus.FocusTargetNode] */
        @Override // Y41.l
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.f41054l.f406842b = focusTargetNode;
            return Boolean.TRUE;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/key/c;", "keyEvent", "", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.key.c, Boolean> {
        public o() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(androidx.compose.ui.input.key.c cVar) {
            C22220e c22220eA;
            int i12;
            KeyEvent keyEvent = cVar.f40068a;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.getClass();
            long jA2 = androidx.compose.ui.input.key.e.a(keyEvent);
            androidx.compose.ui.input.key.b.f40052b.getClass();
            if (androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40059i)) {
                if (keyEvent.isShiftPressed()) {
                    C22220e.f39163b.getClass();
                    i12 = C22220e.f39165d;
                } else {
                    C22220e.f39163b.getClass();
                    i12 = C22220e.f39164c;
                }
                c22220eA = C22220e.a(i12);
            } else if (androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40057g)) {
                C22220e.f39163b.getClass();
                c22220eA = C22220e.a(C22220e.f39167f);
            } else if (androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40056f)) {
                C22220e.f39163b.getClass();
                c22220eA = C22220e.a(C22220e.f39166e);
            } else if (androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40054d) ? true : androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40064n)) {
                C22220e.f39163b.getClass();
                c22220eA = C22220e.a(C22220e.f39168g);
            } else if (androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40055e) ? true : androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40065o)) {
                C22220e.f39163b.getClass();
                c22220eA = C22220e.a(C22220e.f39169h);
            } else if (androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40058h) ? true : androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40061k) ? true : androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40066p)) {
                C22220e.f39163b.getClass();
                c22220eA = C22220e.a(C22220e.f39170i);
            } else if (androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40053c) ? true : androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40063m)) {
                C22220e.f39163b.getClass();
                c22220eA = C22220e.a(C22220e.f39171j);
            } else {
                c22220eA = null;
            }
            if (c22220eA != null) {
                int iB2 = androidx.compose.ui.input.key.e.b(keyEvent);
                androidx.compose.ui.input.key.d.f40069b.getClass();
                if (androidx.compose.ui.input.key.d.a(iB2, androidx.compose.ui.input.key.d.f40071d)) {
                    int i13 = c22220eA.f39172a;
                    Integer numC = C22228m.c(i13);
                    boolean z12 = androidx.compose.ui.l.f40320a;
                    l0.j jVarA = androidComposeView.A();
                    Boolean boolT = androidComposeView.getFocusOwner().t(i13, jVarA, new C22498m(c22220eA));
                    if (boolT != null ? boolT.booleanValue() : true) {
                        return Boolean.TRUE;
                    }
                    if (!androidx.compose.ui.focus.E.a(i13)) {
                        return Boolean.FALSE;
                    }
                    if (numC != null) {
                        int iIntValue = numC.intValue();
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View viewFindNextFocus = androidComposeView;
                        loop0: while (true) {
                            if (viewFindNextFocus == null) {
                                viewFindNextFocus = null;
                                break;
                            }
                            viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) androidComposeView.getRootView(), viewFindNextFocus, iIntValue);
                            if (viewFindNextFocus != null) {
                                Y41.l<? super androidx.compose.ui.text.input.P, ? extends androidx.compose.ui.text.input.P> lVar = J.f41149a;
                                if (!kotlin.jvm.internal.L.f(viewFindNextFocus, androidComposeView)) {
                                    for (ViewParent parent = viewFindNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                                        if (parent == androidComposeView) {
                                            break;
                                        }
                                    }
                                    break loop0;
                                }
                                break;
                            }
                        }
                        if (kotlin.jvm.internal.L.f(viewFindNextFocus, androidComposeView)) {
                            viewFindNextFocus = null;
                        }
                        if (viewFindNextFocus != null) {
                            Rect rectB = jVarA != null ? androidx.compose.ui.graphics.X0.b(jVarA) : null;
                            if (rectB == null) {
                                throw new IllegalStateException("Invalid rect");
                            }
                            int[] iArr = androidComposeView.f40990R;
                            viewFindNextFocus.getLocationInWindow(iArr);
                            int i14 = iArr[0];
                            int i15 = iArr[1];
                            androidComposeView.getLocationInWindow(iArr);
                            rectB.offset(iArr[0] - i14, iArr[1] - i15);
                            if (C22228m.b(viewFindNextFocus, numC, rectB)) {
                                return Boolean.TRUE;
                            }
                        }
                    }
                    if (!androidComposeView.getFocusOwner().k(i13, false, false)) {
                        return Boolean.TRUE;
                    }
                    Boolean boolT2 = androidComposeView.getFocusOwner().t(i13, null, new C22494l(c22220eA));
                    return Boolean.valueOf(boolT2 != null ? boolT2.booleanValue() : true);
                }
            }
            return Boolean.FALSE;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/unit/u;", "invoke-YbymL2g", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends kotlin.jvm.internal.N implements Y41.a<androidx.compose.ui.unit.u> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final androidx.compose.ui.unit.u invoke() {
            return androidx.compose.ui.unit.u.a(C22515q0.a(AndroidComposeView.this));
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$q", "Landroidx/compose/ui/input/pointer/z;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class q implements InterfaceC22347z {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC22345x f41057a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC22345x f41058b;

        public q() {
            InterfaceC22345x.f40307a.getClass();
            C22324b c22324b = InterfaceC22345x.a.f40309b;
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC22347z
        public final void a(InterfaceC22345x interfaceC22345x) {
            this.f41058b = interfaceC22345x;
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC22347z
        public final void b(InterfaceC22345x interfaceC22345x) {
            if (interfaceC22345x == null) {
                InterfaceC22345x.f40307a.getClass();
                interfaceC22345x = InterfaceC22345x.a.f40309b;
            }
            this.f41057a = interfaceC22345x;
            H.f41122a.a(AndroidComposeView.this, interfaceC22345x);
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC22347z
        /* renamed from: c, reason: from getter */
        public final InterfaceC22345x getF41058b() {
            return this.f41058b;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.viewinterop.a f41061m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(androidx.compose.ui.viewinterop.a aVar) {
            super(0);
            this.f41061m = aVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            C22511p0 androidViewsHandler$ui_release = androidComposeView.getAndroidViewsHandler$ui_release();
            androidx.compose.ui.viewinterop.a aVar = this.f41061m;
            androidViewsHandler$ui_release.removeViewInLayout(aVar);
            androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().remove(androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(aVar));
            aVar.setImportantForAccessibility(0);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/focus/FocusTargetNode;", "invoke", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class s extends kotlin.jvm.internal.N implements Y41.l<FocusTargetNode, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f41062l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(int i12) {
            super(1);
            this.f41062l = i12;
        }

        @Override // Y41.l
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.C1(this.f41062l));
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/focus/FocusTargetNode;", "invoke", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class t extends kotlin.jvm.internal.N implements Y41.l<FocusTargetNode, Boolean> {
        @Override // Y41.l
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            throw null;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/focus/FocusTargetNode;", "invoke", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class u extends kotlin.jvm.internal.N implements Y41.l<FocusTargetNode, Boolean> {
        @Override // Y41.l
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            throw null;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public v() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            int actionMasked;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            MotionEvent motionEvent = androidComposeView.f41036u0;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                androidComposeView.f41038v0 = SystemClock.uptimeMillis();
                androidComposeView.post(androidComposeView.f41044y0);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$w", "Ljava/lang/Runnable;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class w implements Runnable {
        public w() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.removeCallbacks(this);
            MotionEvent motionEvent = androidComposeView.f41036u0;
            if (motionEvent != null) {
                boolean z12 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z12) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i12 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i12 = 2;
                }
                AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                androidComposeView2.O(motionEvent, i12, androidComposeView2.f41038v0, false);
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/rotary/d;", "it", "", "invoke", "(Landroidx/compose/ui/input/rotary/d;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.rotary.d, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final x f41065l = new x();

        public x() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.rotary.d dVar) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "command", "invoke", "(LY41/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y extends kotlin.jvm.internal.N implements Y41.l<Y41.a<? extends kotlin.G0>, kotlin.G0> {
        public y() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Y41.a<? extends kotlin.G0> aVar) {
            Y41.a<? extends kotlin.G0> aVar2 = aVar;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            Handler handler = androidComposeView.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar2.invoke();
            } else {
                Handler handler2 = androidComposeView.getHandler();
                if (handler2 != null) {
                    handler2.post(new RunnableC22211b(1, aVar2));
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "invoke", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z extends kotlin.jvm.internal.N implements Y41.a<b> {
        public z() {
            super(0);
        }

        @Override // Y41.a
        public final b invoke() {
            return AndroidComposeView.this.get_viewTreeOwners();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v58, types: [androidx.compose.ui.platform.i] */
    public AndroidComposeView(@Y61.k Context context, @Y61.k CoroutineContext coroutineContext) {
        int i12;
        super(context);
        int i13 = 1;
        l0.g.f413384b.getClass();
        this.f40997b = l0.g.f413386d;
        this.f40999c = true;
        this.sharedDrawScope = new androidx.compose.ui.node.P(null, 1, null);
        this.density = C22126m3.f(C22711a.a(context), C22126m3.l());
        C22558f c22558f = new C22558f();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(c22558f);
        AbstractC22430p0<A0> abstractC22430p0 = new AbstractC22430p0<A0>() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // androidx.compose.ui.node.AbstractC22430p0
            public final v.d a() {
                A0 a02 = new A0();
                a02.f40961p = this.f41049b;
                return a02;
            }

            @Override // androidx.compose.ui.node.AbstractC22430p0
            public final void b(v.d dVar) {
                ((A0) dVar).f40961p = this.f41049b;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f41049b.hashCode();
            }
        };
        this.f41005f = new FocusOwnerImpl(new h(1, this, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0), new i(2, this, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0), new j(1, this, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0), new k(0, this, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0), new l(0, this, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0), new m(this, AndroidComposeView.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0));
        this.coroutineContext = coroutineContext;
        this.dragAndDropManager = new AndroidDragAndDropManager(new g(3, this, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0));
        this.f41011i = new D1();
        v.a aVar = androidx.compose.ui.v.f42878y1;
        androidx.compose.ui.v vVarA = androidx.compose.ui.input.key.f.a(aVar, new o());
        this.f41013j = vVarA;
        androidx.compose.ui.v vVarA2 = androidx.compose.ui.input.rotary.a.a(aVar, x.f41065l);
        this.f41015k = vVarA2;
        this.f41017l = new androidx.compose.ui.graphics.N();
        this.f41019m = new C22499m0(ViewConfiguration.get(context));
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.b(androidx.compose.ui.layout.P0.f40360b);
        layoutNode.k(getDensity());
        layoutNode.l(getViewConfiguration());
        layoutNode.d(emptySemanticsElement.d0(vVarA2).d0(vVarA).d0(getFocusOwner().getF39107i()).d0(getDragAndDropManager().f38991e).d0(abstractC22430p0));
        this.root = layoutNode;
        this.layoutNodes = androidx.collection.K.a();
        m4getLayoutNodes();
        this.rectManager = new androidx.compose.ui.spatial.i(0);
        this.f41027q = this;
        this.semanticsOwner = new androidx.compose.ui.semantics.w(getRoot(), c22558f, m4getLayoutNodes());
        androidx.compose.ui.platform.r rVar = new androidx.compose.ui.platform.r(this);
        this.f41031s = rVar;
        this.contentCaptureManager = new androidx.compose.ui.contentcapture.b(this, new e(0, this, J.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1));
        this.accessibilityManager = new C22462d(context);
        this.graphicsContext = C22259j.a(this);
        this.autofillTree = new androidx.compose.ui.autofill.s();
        this.f41041x = new ArrayList();
        this.f40968B = new C22335m();
        this.f40970C = new androidx.compose.ui.input.pointer.G(getRoot());
        this.configurationChangeObserver = d.f41051l;
        this.f40974E = new androidx.compose.ui.autofill.a(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw androidx.compose.foundation.H.s("Autofill service could not be located.");
        }
        this._autofillManager = new androidx.compose.ui.autofill.e(new androidx.compose.ui.autofill.y(autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.clipboardManager = new C22470f(context);
        this.clipboard = new C22466e(getClipboardManager());
        this.snapshotObserver = new androidx.compose.ui.node.L0(new y());
        this.f40988P = new C22414h0(getRoot());
        long j12 = Integer.MAX_VALUE;
        q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
        this.f40989Q = (j12 & 4294967295L) | (j12 << 32);
        this.f40990R = new int[]{0, 0};
        float[] fArrB = androidx.compose.ui.graphics.A0.b();
        this.f40991S = fArrB;
        this.f40992T = androidx.compose.ui.graphics.A0.b();
        this.f40993U = androidx.compose.ui.graphics.A0.b();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.f40996a0 = l0.g.f413385c;
        this.f40998b0 = true;
        this._viewTreeOwners = C22126m3.g(null);
        this.viewTreeOwners = C22126m3.d(new z());
        this.f41006f0 = new N91.l(this, i13);
        this.f41008g0 = new U9.f(this, i13);
        this.f41010h0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.i
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z12) {
                int i14;
                C47177c c47177c = this.f41467b.f41030r0;
                if (z12) {
                    C47175a.f428938b.getClass();
                    i14 = C47175a.f428939c;
                } else {
                    C47175a.f428938b.getClass();
                    i14 = C47175a.f428940d;
                }
                ((C22082i3) c47177c.f428943b).setValue(C47175a.a(i14));
            }
        };
        View view = getView();
        androidx.compose.ui.text.input.a0 a0Var = new androidx.compose.ui.text.input.a0(view, this, new C22659z(view), null, 8, null);
        this.f41012i0 = a0Var;
        ((J.a) J.f41149a).getClass();
        this.textInputService = new androidx.compose.ui.text.input.Y(a0Var);
        this.f41016k0 = new AtomicReference(null);
        this.f41018l0 = new V0(getTextInputService());
        this.f41020m0 = new W(context);
        this.fontFamilyResolver = C22126m3.f(androidx.compose.ui.text.font.O.a(context), C22126m3.l());
        Configuration configuration = context.getResources().getConfiguration();
        int i14 = Build.VERSION.SDK_INT;
        this.f41024o0 = i14 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        LayoutDirection layoutDirection2 = layoutDirection != 0 ? layoutDirection != 1 ? null : LayoutDirection.f42839c : LayoutDirection.f42838b;
        this.layoutDirection = C22126m3.g(layoutDirection2 == null ? LayoutDirection.f42838b : layoutDirection2);
        this.f41028q0 = new p0.c(this);
        if (isInTouchMode()) {
            C47175a.f428938b.getClass();
            i12 = C47175a.f428939c;
        } else {
            C47175a.f428938b.getClass();
            i12 = C47175a.f428940d;
        }
        this.f41030r0 = new C47177c(i12, new c(), null);
        this.modifierLocalManager = new androidx.compose.ui.modifier.i(this);
        this.f41034t0 = new C22467e0(this);
        this.f41040w0 = new E2<>();
        this.f41042x0 = new androidx.collection.N0<>(0, 1, null);
        this.f41044y0 = new w();
        this.f41046z0 = new G3(this, 8);
        this.f40969B0 = new v();
        this.f40971C0 = i14 < 29 ? new C0(fArrB, null) : new D0();
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        I.f41137a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        C22823h0.C(this, rVar);
        D2.f41101F1.getClass();
        setOnDragListener(getDragAndDropManager());
        getRoot().o(this);
        if (i14 >= 29) {
            B.f41080a.a(this);
        }
        this.f40975E0 = i14 >= 31 ? new androidx.compose.ui.scrollcapture.m() : null;
        this.f40977F0 = new q();
    }

    public static final void f(AndroidComposeView androidComposeView, int i12, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iB2;
        androidx.compose.ui.platform.r rVar = androidComposeView.f41031s;
        if (kotlin.jvm.internal.L.f(str, rVar.f41539G)) {
            int iB3 = rVar.f41537E.b(i12);
            if (iB3 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iB3);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.L.f(str, rVar.f41540H) || (iB2 = rVar.f41538F.b(i12)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iB2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b get_viewTreeOwners() {
        return (b) ((C22082i3) this._viewTreeOwners).getF42167b();
    }

    public static final boolean j(AndroidComposeView androidComposeView, C22220e c22220e, l0.j jVar) {
        Integer numC;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            return true;
        }
        return super.requestFocus((c22220e == null || (numC = C22228m.c(c22220e.f39172a)) == null) ? 130 : numC.intValue(), jVar != null ? androidx.compose.ui.graphics.X0.b(jVar) : null);
    }

    public static void k(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).z();
            } else if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt);
            }
        }
    }

    public static long l(int i12) {
        long j12;
        long j13;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode == Integer.MIN_VALUE) {
            int i13 = kotlin.w0.f410662c;
            j12 = 0 << 32;
        } else {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalStateException();
                }
                j13 = size;
                int i14 = kotlin.w0.f410662c;
                j12 = j13 << 32;
                return j12 | j13;
            }
            int i15 = kotlin.w0.f410662c;
            j12 = 0 << 32;
            size = Integer.MAX_VALUE;
        }
        j13 = size;
        return j12 | j13;
    }

    public static View n(View view, int i12) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (kotlin.jvm.internal.L.f(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i12))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View viewN = n(viewGroup.getChildAt(i13), i12);
            if (viewN != null) {
                return viewN;
            }
        }
        return null;
    }

    public static void q(LayoutNode layoutNode) {
        layoutNode.X();
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = layoutNode.O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            q(layoutNodeArr[i13]);
        }
    }

    public static boolean s(MotionEvent motionEvent) {
        boolean z12 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z12) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i12 = 1; i12 < pointerCount; i12++) {
                z12 = (Float.floatToRawIntBits(motionEvent.getX(i12)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i12)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !G1.f41117a.a(motionEvent, i12));
                if (z12) {
                    break;
                }
            }
        }
        return z12;
    }

    private void setDensity(androidx.compose.ui.unit.d dVar) {
        ((C22082i3) this.density).setValue(dVar);
    }

    private void setFontFamilyResolver(E.b bVar) {
        ((C22082i3) this.fontFamilyResolver).setValue(bVar);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        ((C22082i3) this.layoutDirection).setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(b bVar) {
        ((C22082i3) this._viewTreeOwners).setValue(bVar);
    }

    public final l0.j A() {
        if (isFocused()) {
            return getFocusOwner().getFocusRect();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return C22228m.a(viewFindFocus, this);
        }
        return null;
    }

    public final void B(@Y61.k LayoutNode layoutNode) {
        androidx.compose.ui.platform.r rVar = this.f41031s;
        rVar.f41533A = true;
        if (rVar.v()) {
            rVar.w(layoutNode);
        }
        androidx.compose.ui.contentcapture.b bVar = this.contentCaptureManager;
        bVar.f38953h = true;
        if (bVar.e()) {
            bVar.f38954i.w(kotlin.G0.f406611a);
        }
    }

    public final void C(@Y61.k LayoutNode layoutNode, boolean z12, boolean z13, boolean z14) {
        LayoutNode layoutNodeK;
        LayoutNode layoutNodeK2;
        C22404c0 c22404c0;
        androidx.compose.ui.node.W w12;
        C22414h0 c22414h0 = this.f40988P;
        if (!z12) {
            if (c22414h0.p(layoutNode, z13) && z14) {
                L(layoutNode);
                return;
            }
            return;
        }
        c22414h0.getClass();
        if (layoutNode.f40635k == null) {
            C47949a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        androidx.compose.ui.node.T t12 = layoutNode.f40616J;
        int iOrdinal = t12.f40681d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!t12.f40682e || z13) {
                    t12.f40682e = true;
                    t12.f40693p.f40850w = true;
                    if (layoutNode.f40625S) {
                        return;
                    }
                    boolean zF2 = kotlin.jvm.internal.L.f(layoutNode.b0(), Boolean.TRUE);
                    C22431q c22431q = c22414h0.f40809b;
                    if ((zF2 || (t12.f40682e && (layoutNode.I() == LayoutNode.UsageByParent.f40658b || !((c22404c0 = t12.f40694q) == null || (w12 = c22404c0.f40758t) == null || !w12.f())))) && ((layoutNodeK = layoutNode.K()) == null || !layoutNodeK.f40616J.f40682e)) {
                        c22431q.a(layoutNode, true);
                    } else if ((layoutNode.r() || C22414h0.h(layoutNode)) && ((layoutNodeK2 = layoutNode.K()) == null || !layoutNodeK2.G())) {
                        c22431q.a(layoutNode, false);
                    }
                    if (c22414h0.f40811d || !z14) {
                        return;
                    }
                    L(layoutNode);
                    return;
                }
                return;
            }
        }
        c22414h0.f40815h.b(new C22414h0.a(layoutNode, true, z13));
    }

    public final void D(@Y61.k LayoutNode layoutNode, boolean z12, boolean z13) {
        C22414h0 c22414h0 = this.f40988P;
        if (!z12) {
            c22414h0.getClass();
            int iOrdinal = layoutNode.f40616J.f40681d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            LayoutNode layoutNodeK = layoutNode.K();
            boolean z14 = layoutNodeK == null || layoutNodeK.r();
            androidx.compose.ui.node.T t12 = layoutNode.f40616J;
            if (!z13) {
                if (layoutNode.G()) {
                    return;
                }
                if (layoutNode.F() && layoutNode.r() == z14 && layoutNode.r() == t12.f40693p.f40849v) {
                    return;
                }
            }
            C22418j0 c22418j0 = t12.f40693p;
            c22418j0.f40851x = true;
            c22418j0.f40852y = true;
            if (!layoutNode.f40625S && c22418j0.f40849v && z14) {
                if ((layoutNodeK == null || !layoutNodeK.F()) && (layoutNodeK == null || !layoutNodeK.G())) {
                    c22414h0.f40809b.a(layoutNode, false);
                }
                if (c22414h0.f40811d) {
                    return;
                }
                L(null);
                return;
            }
            return;
        }
        c22414h0.getClass();
        int iOrdinal2 = layoutNode.f40616J.f40681d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        androidx.compose.ui.node.T t13 = layoutNode.f40616J;
        if ((t13.f40682e || t13.f40683f) && !z13) {
            return;
        }
        t13.f40683f = true;
        t13.f40684g = true;
        C22418j0 c22418j02 = t13.f40693p;
        c22418j02.f40851x = true;
        c22418j02.f40852y = true;
        if (layoutNode.f40625S) {
            return;
        }
        LayoutNode layoutNodeK2 = layoutNode.K();
        boolean zF2 = kotlin.jvm.internal.L.f(layoutNode.b0(), Boolean.TRUE);
        C22431q c22431q = c22414h0.f40809b;
        if (zF2 && ((layoutNodeK2 == null || !layoutNodeK2.f40616J.f40682e) && (layoutNodeK2 == null || !layoutNodeK2.f40616J.f40683f))) {
            c22431q.a(layoutNode, true);
        } else if (layoutNode.r() && ((layoutNodeK2 == null || !layoutNodeK2.F()) && (layoutNodeK2 == null || !layoutNodeK2.G()))) {
            c22431q.a(layoutNode, false);
        }
        if (c22414h0.f40811d) {
            return;
        }
        L(null);
    }

    public final void E() {
        androidx.compose.ui.platform.r rVar = this.f41031s;
        rVar.f41533A = true;
        if (rVar.v() && !rVar.f41544L) {
            rVar.f41544L = true;
            rVar.f41556l.post(rVar.f41545M);
        }
        androidx.compose.ui.contentcapture.b bVar = this.contentCaptureManager;
        bVar.f38953h = true;
        if (!bVar.e() || bVar.f38960o) {
            return;
        }
        bVar.f38960o = true;
        bVar.f38955j.post(bVar.f38961p);
    }

    public final void F() {
        if (this.f40995W) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            B0 b02 = this.f40971C0;
            float[] fArr = this.f40992T;
            b02.a(this, fArr);
            A1.a(fArr, this.f40993U);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f40990R;
            view.getLocationOnScreen(iArr);
            float f12 = iArr[0];
            float f13 = iArr[1];
            view.getLocationInWindow(iArr);
            float f14 = iArr[0];
            float f15 = f13 - iArr[1];
            g.a aVar = l0.g.f413384b;
            this.f40996a0 = (Float.floatToRawIntBits(f12 - f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L);
        }
    }

    public final void G(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        B0 b02 = this.f40971C0;
        float[] fArr = this.f40992T;
        b02.a(this, fArr);
        A1.a(fArr, this.f40993U);
        float x12 = motionEvent.getX();
        float y12 = motionEvent.getY();
        g.a aVar = l0.g.f413384b;
        long jC2 = androidx.compose.ui.graphics.A0.c((Float.floatToRawIntBits(x12) << 32) | (Float.floatToRawIntBits(y12) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jC2 >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jC2 & 4294967295L));
        this.f40996a0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(@Y61.k androidx.compose.ui.node.I0 i02) {
        E2<androidx.compose.ui.node.I0> e22;
        Reference<? extends androidx.compose.ui.node.I0> referencePoll;
        androidx.compose.runtime.collection.e<Reference<androidx.compose.ui.node.I0>> eVar;
        if (this.f40985M != null) {
            C22548y2.f41643q.getClass();
        }
        do {
            e22 = this.f41040w0;
            referencePoll = e22.f41109b.poll();
            eVar = e22.f41108a;
            if (referencePoll != null) {
                eVar.j(referencePoll);
            }
        } while (referencePoll != null);
        eVar.b(new WeakReference(i02, e22.f41109b));
        this.f41041x.remove(i02);
    }

    public final void I(@Y61.k Y41.a<kotlin.G0> aVar) {
        androidx.collection.N0<Y41.a<kotlin.G0>> n02 = this.f41042x0;
        if (n02.c(aVar) >= 0) {
            return;
        }
        n02.f(aVar);
    }

    public final void J(@Y61.k androidx.compose.ui.viewinterop.a aVar) {
        I(new r(aVar));
    }

    public final void K(@Y61.k LayoutNode layoutNode) {
        this.f40988P.f40812e.f40572a.b(layoutNode);
        layoutNode.f40624R = true;
        L(null);
    }

    public final void L(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.H() == LayoutNode.UsageByParent.f40658b) {
                if (!this.f40987O) {
                    LayoutNode layoutNodeK = layoutNode.K();
                    if (layoutNodeK == null) {
                        break;
                    }
                    long j12 = layoutNodeK.f40615I.f40875b.f40348e;
                    if (C22712b.h(j12) && C22712b.g(j12)) {
                        break;
                    }
                }
                layoutNode = layoutNode.K();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long M(long j12) {
        F();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) - Float.intBitsToFloat((int) (this.f40996a0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) - Float.intBitsToFloat((int) (this.f40996a0 & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        g.a aVar = l0.g.f413384b;
        return androidx.compose.ui.graphics.A0.c(jFloatToRawIntBits, this.f40993U);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int N(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.f40973D0
            r1 = 0
            if (r0 == 0) goto L20
            r7.f40973D0 = r1
            int r0 = r8.getMetaState()
            androidx.compose.ui.platform.D1 r2 = r7.f41011i
            r2.getClass()
            androidx.compose.ui.platform.G2$a r2 = androidx.compose.ui.platform.G2.f41118c
            r2.getClass()
            androidx.compose.runtime.y1<androidx.compose.ui.input.pointer.T> r2 = androidx.compose.ui.platform.G2.f41119d
            androidx.compose.ui.input.pointer.T r0 = androidx.compose.ui.input.pointer.T.a(r0)
            androidx.compose.runtime.i3 r2 = (androidx.compose.runtime.C22082i3) r2
            r2.setValue(r0)
        L20:
            androidx.compose.ui.input.pointer.m r0 = r7.f40968B
            androidx.compose.ui.input.pointer.E r2 = r0.a(r8, r7)
            androidx.compose.ui.input.pointer.G r3 = r7.f40970C
            if (r2 == 0) goto L79
            java.util.ArrayList r1 = r2.f40136a
            int r4 = r1.size()
            int r4 = r4 + (-1)
            if (r4 < 0) goto L47
        L34:
            int r5 = r4 + (-1)
            java.lang.Object r4 = r1.get(r4)
            r6 = r4
            androidx.compose.ui.input.pointer.F r6 = (androidx.compose.ui.input.pointer.F) r6
            boolean r6 = r6.f40142e
            if (r6 == 0) goto L42
            goto L48
        L42:
            if (r5 >= 0) goto L45
            goto L47
        L45:
            r4 = r5
            goto L34
        L47:
            r4 = 0
        L48:
            androidx.compose.ui.input.pointer.F r4 = (androidx.compose.ui.input.pointer.F) r4
            if (r4 == 0) goto L50
            long r4 = r4.f40141d
            r7.f40997b = r4
        L50:
            boolean r1 = r7.t(r8)
            int r1 = r3.a(r2, r7, r1)
            int r2 = r8.getActionMasked()
            if (r2 == 0) goto L61
            r3 = 5
            if (r2 != r3) goto L7c
        L61:
            r2 = r1 & 1
            if (r2 == 0) goto L66
            goto L7c
        L66:
            int r2 = r8.getActionIndex()
            int r8 = r8.getPointerId(r2)
            android.util.SparseBooleanArray r2 = r0.f40262c
            r2.delete(r8)
            android.util.SparseLongArray r0 = r0.f40261b
            r0.delete(r8)
            goto L7c
        L79:
            r3.b()
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.N(android.view.MotionEvent):int");
    }

    public final void O(MotionEvent motionEvent, int i12, long j12, boolean z12) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i12 != 9 && i12 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i13 = 0; i13 < pointerCount; i13++) {
            pointerPropertiesArr[i13] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i14 = 0; i14 < pointerCount; i14++) {
            pointerCoordsArr[i14] = new MotionEvent.PointerCoords();
        }
        int i15 = 0;
        while (i15 < pointerCount) {
            int i16 = ((actionIndex < 0 || i15 < actionIndex) ? 0 : 1) + i15;
            motionEvent.getPointerProperties(i16, pointerPropertiesArr[i15]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i15];
            motionEvent.getPointerCoords(i16, pointerCoords);
            float f12 = pointerCoords.x;
            g.a aVar = l0.g.f413384b;
            long jV2 = v((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jV2 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jV2 & 4294967295L));
            i15++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j12 : motionEvent.getDownTime(), j12, i12, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z12 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        this.f40970C.a(this.f40968B.a(motionEventObtain, this), this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            r13 = this;
            int[] r0 = r13.f40990R
            r13.getLocationOnScreen(r0)
            long r1 = r13.f40989Q
            androidx.compose.ui.unit.q$a r3 = androidx.compose.ui.unit.q.f42862b
            r3 = 32
            long r4 = r1 >> r3
            int r4 = (int) r4
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            int r1 = (int) r1
            r2 = 0
            r7 = r0[r2]
            r8 = 1
            if (r4 != r7) goto L27
            r9 = r0[r8]
            if (r1 != r9) goto L27
            long r9 = r13.lastMatrixRecalculationAnimationTime
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L44
        L27:
            r0 = r0[r8]
            long r9 = (long) r7
            long r9 = r9 << r3
            long r11 = (long) r0
            long r5 = r5 & r11
            long r5 = r5 | r9
            r13.f40989Q = r5
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r0) goto L44
            if (r1 == r0) goto L44
            androidx.compose.ui.node.LayoutNode r0 = r13.getRoot()
            androidx.compose.ui.node.T r0 = r0.f40616J
            androidx.compose.ui.node.j0 r0 = r0.f40693p
            r0.v0()
            r0 = r8
            goto L45
        L44:
            r0 = r2
        L45:
            r13.F()
            androidx.compose.ui.spatial.i r1 = r13.getRectManager()
            long r3 = r13.f40989Q
            long r5 = r13.f40996a0
            long r5 = androidx.compose.ui.unit.r.c(r5)
            r1.getClass()
            float[] r7 = r13.f40992T
            int r9 = androidx.compose.ui.spatial.j.a(r7)
            r9 = r9 & 2
            if (r9 != 0) goto L62
            goto L63
        L62:
            r7 = 0
        L63:
            androidx.compose.ui.spatial.l r9 = r1.f41871b
            long r10 = r9.f41884d
            boolean r10 = androidx.compose.ui.unit.q.c(r5, r10)
            if (r10 != 0) goto L71
            r9.f41884d = r5
            r5 = r8
            goto L72
        L71:
            r5 = r2
        L72:
            long r10 = r9.f41885e
            boolean r6 = androidx.compose.ui.unit.q.c(r3, r10)
            if (r6 != 0) goto L7d
            r9.f41885e = r3
            r5 = r8
        L7d:
            if (r7 == 0) goto L82
            r9.f41886f = r7
            r5 = r8
        L82:
            if (r5 != 0) goto L88
            boolean r3 = r1.f41874e
            if (r3 == 0) goto L89
        L88:
            r2 = r8
        L89:
            r1.f41874e = r2
            androidx.compose.ui.node.h0 r1 = r13.f40988P
            r1.a(r0)
            boolean r0 = androidx.compose.ui.l.f40320a
            if (r0 == 0) goto L9b
            androidx.compose.ui.spatial.i r0 = r13.getRectManager()
            r0.a()
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.P():void");
    }

    @Override // androidx.compose.ui.input.pointer.InterfaceC22334l
    public final void a(@Y61.k float[] fArr) {
        F();
        androidx.compose.ui.graphics.A0.h(fArr, this.f40992T);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f40996a0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f40996a0 & 4294967295L));
        Y41.l<? super androidx.compose.ui.text.input.P, ? extends androidx.compose.ui.text.input.P> lVar = J.f41149a;
        float[] fArr2 = this.f40991S;
        androidx.compose.ui.graphics.A0.e(fArr2);
        androidx.compose.ui.graphics.A0.i(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        J.b(fArr, fArr2);
    }

    @Override // android.view.ViewGroup
    public final void addView(@Y61.l View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(@Y61.k SparseArray<AutofillValue> sparseArray) {
        Y41.l<String, kotlin.G0> lVar;
        androidx.compose.ui.autofill.e eVar;
        androidx.compose.ui.semantics.l lVarQ;
        Y41.l lVar2;
        if (androidx.compose.ui.l.f40322c && (eVar = this._autofillManager) != null) {
            int size = sparseArray.size();
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = sparseArray.keyAt(i12);
                AutofillValue autofillValue = sparseArray.get(iKeyAt);
                androidx.compose.ui.autofill.l.f38888a.getClass();
                if (autofillValue.isText()) {
                    androidx.compose.ui.semantics.n nVar = (androidx.compose.ui.semantics.n) eVar.f38877b.f41804c.b(iKeyAt);
                    if (nVar != null && (lVarQ = nVar.Q()) != null) {
                        androidx.compose.ui.semantics.k.f41760a.getClass();
                        C22553a c22553a = (C22553a) androidx.compose.ui.semantics.m.a(lVarQ, androidx.compose.ui.semantics.k.f41767h);
                        if (c22553a != null && (lVar2 = (Y41.l) c22553a.f41728b) != null) {
                        }
                    }
                } else if (!autofillValue.isDate() && !autofillValue.isList()) {
                    autofillValue.isToggle();
                }
            }
        }
        androidx.compose.ui.autofill.a aVar = this.f40974E;
        if (aVar != null) {
            androidx.compose.ui.autofill.s sVar = aVar.f38867b;
            if (sVar.f38897a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i13 = 0; i13 < size2; i13++) {
                int iKeyAt2 = sparseArray.keyAt(i13);
                AutofillValue autofillValue2 = sparseArray.get(iKeyAt2);
                androidx.compose.ui.autofill.l.f38888a.getClass();
                if (autofillValue2.isText()) {
                    String string = autofillValue2.getTextValue().toString();
                    androidx.compose.ui.autofill.q qVar = (androidx.compose.ui.autofill.q) sVar.f38897a.get(Integer.valueOf(iKeyAt2));
                    if (qVar != null && (lVar = qVar.f38896c) != null) {
                        lVar.invoke(string);
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new kotlin.G("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new kotlin.G("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new kotlin.G("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.J0
    public final void b() {
        this.f40966A = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public final androidx.compose.ui.node.I0 c(@Y61.k Y41.p<? super androidx.compose.ui.graphics.M, ? super C22267c, kotlin.G0> pVar, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.l C22267c c22267c, boolean z12) {
        Reference<? extends androidx.compose.ui.node.I0> referencePoll;
        androidx.compose.runtime.collection.e<Reference<androidx.compose.ui.node.I0>> eVar;
        Object obj;
        if (c22267c != null) {
            return new C22500m1(c22267c, null, this, pVar, aVar);
        }
        if (z12) {
            if (isHardwareAccelerated() && this.f40998b0) {
                try {
                    return new Z1(this, pVar, aVar);
                } catch (Throwable unused) {
                    this.f40998b0 = false;
                }
            }
            if (this.f40985M == null) {
                C22548y2.f41643q.getClass();
                if (!C22548y2.f41648v) {
                    C22548y2.c.a(new View(getContext()));
                }
                C22464d1 c22464d1 = C22548y2.f41649w ? new C22464d1(getContext()) : new C22552z2(getContext());
                this.f40985M = c22464d1;
                addView(c22464d1, -1);
            }
            return new C22548y2(this, this.f40985M, pVar, aVar);
        }
        do {
            E2<androidx.compose.ui.node.I0> e22 = this.f41040w0;
            referencePoll = e22.f41109b.poll();
            eVar = e22.f41108a;
            if (referencePoll != null) {
                eVar.j(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i12 = eVar.f38262d;
            if (i12 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) eVar.k(i12 - 1)).get();
            if (obj != null) {
                break;
            }
        }
        androidx.compose.ui.node.I0 i02 = (androidx.compose.ui.node.I0) obj;
        if (i02 == null) {
            return new C22500m1(getGraphicsContext().a(), getGraphicsContext(), this, pVar, aVar);
        }
        i02.a(aVar, pVar);
        return i02;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i12) {
        return this.f41031s.m(i12, this.f40997b, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i12) {
        return this.f41031s.m(i12, this.f40997b, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.node.J0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k Y41.p r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.C22502n
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.n r0 = (androidx.compose.ui.platform.C22502n) r0
            int r1 = r0.f41517s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41517s = r1
            goto L18
        L13:
            androidx.compose.ui.platform.n r0 = new androidx.compose.ui.platform.n
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f41515q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41517s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            kotlin.C42729a0.b(r6)
            goto L44
        L31:
            kotlin.C42729a0.b(r6)
            java.util.concurrent.atomic.AtomicReference r6 = r4.f41016k0
            androidx.compose.ui.platform.o r2 = new androidx.compose.ui.platform.o
            r2.<init>(r4)
            r0.f41517s = r3
            java.lang.Object r5 = androidx.compose.ui.B.b(r6, r2, r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.d(Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        if (!isAttachedToWindow()) {
            q(getRoot());
        }
        w(true);
        AbstractC22167l.f38720e.getClass();
        C22176v.j().m();
        this.f41045z = true;
        androidx.compose.ui.graphics.N n12 = this.f41017l;
        C22245c c22245c = n12.f39293a;
        Canvas canvas2 = c22245c.f39351a;
        c22245c.f39351a = canvas;
        getRoot().y(c22245c, null);
        n12.f39293a.f39351a = canvas2;
        ArrayList arrayList = this.f41041x;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((androidx.compose.ui.node.I0) arrayList.get(i12)).g();
            }
        }
        C22548y2.f41643q.getClass();
        if (C22548y2.f41649w) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.f41045z = false;
        ArrayList arrayList2 = this.f41043y;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (androidx.compose.ui.l.f40320a) {
            getRectManager().a();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(@Y61.k MotionEvent motionEvent) {
        if (this.f40967A0) {
            G3 g32 = this.f41046z0;
            removeCallbacks(g32);
            if (motionEvent.getActionMasked() == 8) {
                this.f40967A0 = false;
            } else {
                g32.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (s(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (p(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f12 = -motionEvent.getAxisValue(26);
        getContext();
        float scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor() * f12;
        getContext();
        return getFocusOwner().p(new androidx.compose.ui.input.rotary.d(scaledVerticalScrollFactor, viewConfiguration.getScaledHorizontalScrollFactor() * f12, motionEvent.getDeviceId(), motionEvent.getEventTime()), new C22490k(motionEvent, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(@Y61.k MotionEvent motionEvent) {
        boolean z12;
        int i12;
        boolean z13 = this.f40967A0;
        G3 g32 = this.f41046z0;
        if (z13) {
            removeCallbacks(g32);
            g32.run();
        }
        if (s(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        androidx.compose.ui.platform.r rVar = this.f41031s;
        AccessibilityManager accessibilityManager = rVar.f41551g;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            AndroidComposeView androidComposeView = rVar.f41548d;
            if (action == 7 || action == 9) {
                float x12 = motionEvent.getX();
                float y12 = motionEvent.getY();
                androidComposeView.w(true);
                C22444x c22444x = new C22444x();
                androidx.collection.N0<Object> n02 = c22444x.f40938b;
                g.a aVar = l0.g.f413384b;
                LayoutNode.d dVar = LayoutNode.f40602T;
                androidx.compose.ui.input.pointer.U.f40189b.getClass();
                androidComposeView.getRoot().U((Float.floatToRawIntBits(y12) & 4294967295L) | (Float.floatToRawIntBits(x12) << 32), c22444x, true);
                for (int i13 = n02.f25660b - 1; -1 < i13; i13--) {
                    LayoutNode layoutNodeG = C22421l.g((v.d) n02.b(i13));
                    if (androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNodeG) != null) {
                        break;
                    }
                    if (layoutNodeG.f40615I.d(8)) {
                        int iA2 = rVar.A(layoutNodeG.f40627c);
                        androidx.compose.ui.semantics.u uVarA = androidx.compose.ui.semantics.v.a(layoutNodeG, false);
                        if (C22481h2.f(uVarA)) {
                            androidx.compose.ui.semantics.l lVarI = uVarA.i();
                            androidx.compose.ui.semantics.y.f41820a.getClass();
                            if (!lVarI.f41786b.c(androidx.compose.ui.semantics.y.f41845z)) {
                                i12 = iA2;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i12 = BeduinInputModel.MIN_TEXT_VERSION;
                androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                int i14 = rVar.f41549e;
                if (i14 != i12) {
                    rVar.f41549e = i12;
                    androidx.compose.ui.platform.r.E(rVar, i12, 128, null, 12);
                    androidx.compose.ui.platform.r.E(rVar, i14, 256, null, 12);
                }
            } else if (action == 10) {
                int i15 = rVar.f41549e;
                if (i15 == Integer.MIN_VALUE) {
                    androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                } else if (i15 != Integer.MIN_VALUE) {
                    rVar.f41549e = BeduinInputModel.MIN_TEXT_VERSION;
                    androidx.compose.ui.platform.r.E(rVar, BeduinInputModel.MIN_TEXT_VERSION, 128, null, 12);
                    androidx.compose.ui.platform.r.E(rVar, i15, 256, null, 12);
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            z12 = false;
            if (!u(motionEvent)) {
                return false;
            }
        } else {
            if (actionMasked == 10 && t(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f41036u0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f41036u0 = MotionEvent.obtainNoHistory(motionEvent);
                this.f40967A0 = true;
                postDelayed(g32, 8L);
                return false;
            }
            z12 = false;
        }
        if ((p(motionEvent) & 1) != 0) {
            return true;
        }
        return z12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(@Y61.k KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().g(keyEvent, new f(keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f41011i.getClass();
        G2.f41118c.getClass();
        ((C22082i3) G2.f41119d).setValue(androidx.compose.ui.input.pointer.T.a(metaState));
        return getFocusOwner().g(keyEvent, C22240z.f39214l) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(@Y61.k KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().a(keyEvent)) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(@Y61.k ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C22549z.f41667a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@Y61.k MotionEvent motionEvent) {
        if (this.f40967A0) {
            G3 g32 = this.f41046z0;
            removeCallbacks(g32);
            MotionEvent motionEvent2 = this.f41036u0;
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f40967A0 = false;
            } else {
                g32.run();
            }
        }
        if (s(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !u(motionEvent)) {
            return false;
        }
        int iP2 = p(motionEvent);
        if ((iP2 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (iP2 & 1) != 0;
    }

    @Y61.l
    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View viewN = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
                if (objInvoke instanceof View) {
                    viewN = (View) objInvoke;
                }
            } else {
                viewN = n(this, accessibilityId);
            }
        } catch (NoSuchMethodException unused) {
        }
        return viewN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (androidx.compose.ui.focus.s0.g(androidx.compose.ui.focus.n0.b((androidx.compose.ui.focus.FocusTargetNode) r3.f406842b), androidx.compose.ui.focus.C22228m.a(r0, r6), r1, r2) != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(@Y61.l android.view.View r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L77
            androidx.compose.ui.node.h0 r0 = r6.f40988P
            boolean r0 = r0.f40810c
            if (r0 == 0) goto La
            goto L77
        La:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r0.findNextFocus(r6, r7, r8)
            if (r7 != r6) goto L23
            androidx.compose.ui.focus.B r1 = r6.getFocusOwner()
            l0.j r1 = r1.getFocusRect()
            if (r1 != 0) goto L27
            l0.j r1 = androidx.compose.ui.focus.C22228m.a(r7, r6)
            goto L27
        L23:
            l0.j r1 = androidx.compose.ui.focus.C22228m.a(r7, r6)
        L27:
            androidx.compose.ui.focus.e r2 = androidx.compose.ui.focus.C22228m.d(r8)
            if (r2 == 0) goto L30
            int r2 = r2.f39172a
            goto L37
        L30:
            androidx.compose.ui.focus.e$a r2 = androidx.compose.ui.focus.C22220e.f39163b
            r2.getClass()
            int r2 = androidx.compose.ui.focus.C22220e.f39169h
        L37:
            kotlin.jvm.internal.l0$h r3 = new kotlin.jvm.internal.l0$h
            r3.<init>()
            androidx.compose.ui.focus.B r4 = r6.getFocusOwner()
            androidx.compose.ui.platform.AndroidComposeView$n r5 = new androidx.compose.ui.platform.AndroidComposeView$n
            r5.<init>(r3)
            java.lang.Boolean r4 = r4.t(r2, r1, r5)
            if (r4 != 0) goto L4c
            goto L76
        L4c:
            T r4 = r3.f406842b
            if (r4 != 0) goto L53
            if (r0 != 0) goto L75
            goto L76
        L53:
            if (r0 != 0) goto L57
        L55:
            r7 = r6
            goto L76
        L57:
            boolean r4 = androidx.compose.ui.focus.E.a(r2)
            if (r4 == 0) goto L62
            android.view.View r7 = super.focusSearch(r7, r8)
            goto L76
        L62:
            T r7 = r3.f406842b
            androidx.compose.ui.focus.FocusTargetNode r7 = (androidx.compose.ui.focus.FocusTargetNode) r7
            l0.j r7 = androidx.compose.ui.focus.n0.b(r7)
            l0.j r8 = androidx.compose.ui.focus.C22228m.a(r0, r6)
            boolean r7 = androidx.compose.ui.focus.s0.g(r7, r8, r1, r2)
            if (r7 == 0) goto L75
            goto L55
        L75:
            r7 = r0
        L76:
            return r7
        L77:
            android.view.View r7 = super.focusSearch(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.focusSearch(android.view.View, int):android.view.View");
    }

    @Y61.k
    public final C22511p0 getAndroidViewsHandler$ui_release() {
        if (this.f40984L == null) {
            C22511p0 c22511p0 = new C22511p0(getContext());
            this.f40984L = c22511p0;
            addView(c22511p0, -1);
            requestLayout();
        }
        return this.f40984L;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.l
    public androidx.compose.ui.autofill.k getAutofill() {
        return this.f40974E;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.l
    public androidx.compose.ui.autofill.p getAutofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public androidx.compose.ui.autofill.s getAutofillTree() {
        return this.autofillTree;
    }

    @Y61.k
    public final Y41.l<Configuration, kotlin.G0> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    @Y61.k
    /* renamed from: getContentCaptureManager$ui_release, reason: from getter */
    public final androidx.compose.ui.contentcapture.b getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public androidx.compose.ui.unit.d getDensity() {
        return (androidx.compose.ui.unit.d) ((C22082i3) this.density).getF42167b();
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public androidx.compose.ui.focus.B getFocusOwner() {
        return this.f41005f;
    }

    @Override // android.view.View
    public final void getFocusedRect(@Y61.k Rect rect) {
        kotlin.G0 g02;
        l0.j jVarA = A();
        if (jVarA != null) {
            rect.left = Math.round(jVarA.f413390a);
            rect.top = Math.round(jVarA.f413391b);
            rect.right = Math.round(jVarA.f413392c);
            rect.bottom = Math.round(jVarA.f413393d);
            g02 = kotlin.G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public E.b getFontFamilyResolver() {
        return (E.b) ((C22082i3) this.fontFamilyResolver).getF42167b();
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public D.b getFontLoader() {
        return this.f41020m0;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public InterfaceC22264l0 getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public InterfaceC44967a getHapticFeedBack() {
        return this.f41028q0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f40988P.f40809b.c();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public InterfaceC47176b getInputModeManager() {
        return this.f41030r0;
    }

    /* renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.J0
    @Y61.k
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) ((C22082i3) this.layoutDirection).getF42167b();
    }

    public long getMeasureIteration() {
        C22414h0 c22414h0 = this.f40988P;
        if (!c22414h0.f40810c) {
            C47949a.a("measureIteration should be only used during the measure/layout pass");
        }
        return c22414h0.f40814g;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public androidx.compose.ui.modifier.i getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public K0.a getPlacementScope() {
        return androidx.compose.ui.layout.L0.b(this);
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public InterfaceC22347z getPointerIconService() {
        return this.f40977F0;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public androidx.compose.ui.spatial.i getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public LayoutNode getRoot() {
        return this.root;
    }

    @Y61.k
    public androidx.compose.ui.node.S0 getRootForTest() {
        return this.f41027q;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        androidx.compose.ui.scrollcapture.m mVar;
        if (Build.VERSION.SDK_INT < 31 || (mVar = this.f40975E0) == null) {
            return false;
        }
        return ((Boolean) ((C22082i3) mVar.f41710a).getF42167b()).booleanValue();
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public androidx.compose.ui.semantics.w getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public androidx.compose.ui.node.P getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.J0
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public androidx.compose.ui.node.L0 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public InterfaceC22489j2 getSoftwareKeyboardController() {
        return this.f41018l0;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public androidx.compose.ui.text.input.Y getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public InterfaceC22509o2 getTextToolbar() {
        return this.f41034t0;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public InterfaceC22544x2 getViewConfiguration() {
        return this.f41019m;
    }

    @Y61.l
    public final b getViewTreeOwners() {
        return (b) this.viewTreeOwners.getF42167b();
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public F2 getWindowInfo() {
        return this.f41011i;
    }

    @Y61.l
    /* renamed from: get_autofillManager$ui_release, reason: from getter */
    public final androidx.compose.ui.autofill.e get_autofillManager() {
        return this._autofillManager;
    }

    public final void m() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.f40979G0 == 1) {
                D.f41095a.a(getView(), false);
            }
            this.f40979G0--;
        }
    }

    public final void o(@Y61.k LayoutNode layoutNode, boolean z12) {
        this.f40988P.f(layoutNode, z12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Lifecycle lifecycle;
        int i12;
        InterfaceC22983P interfaceC22983P;
        super.onAttachedToWindow();
        boolean zHasWindowFocus = hasWindowFocus();
        D1 d12 = this.f41011i;
        ((C22082i3) d12.f41100c).setValue(Boolean.valueOf(zHasWindowFocus));
        p pVar = new p();
        if (d12.f41099b == null) {
            d12.f41098a = pVar;
        }
        InterfaceC22204y1<androidx.compose.ui.unit.u> interfaceC22204y1 = d12.f41099b;
        if (interfaceC22204y1 != null) {
            ((C22082i3) interfaceC22204y1).setValue(androidx.compose.ui.unit.u.a(C22515q0.a(this)));
        }
        r(getRoot());
        q(getRoot());
        androidx.compose.runtime.snapshots.H h12 = getSnapshotObserver().f40586a;
        h12.getClass();
        AbstractC22167l.a aVar = AbstractC22167l.f38720e;
        Y41.p<Set<? extends Object>, AbstractC22167l, kotlin.G0> pVar2 = h12.f38630d;
        aVar.getClass();
        h12.f38634h = AbstractC22167l.a.d(pVar2);
        androidx.compose.ui.autofill.a aVar2 = this.f40974E;
        if (aVar2 != null) {
            androidx.compose.ui.autofill.o oVar = androidx.compose.ui.autofill.o.f38891a;
            oVar.getClass();
            aVar2.f38868c.registerCallback(oVar);
        }
        InterfaceC22983P interfaceC22983PA = androidx.view.V0.a(this);
        InterfaceC23487e interfaceC23487eA = C23489g.a(this);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC22983PA != null && interfaceC23487eA != null && (interfaceC22983PA != (interfaceC22983P = viewTreeOwners.f41047a) || interfaceC23487eA != interfaceC22983P))) {
            if (interfaceC22983PA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (interfaceC23487eA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f41047a.getLifecycle()) != null) {
                lifecycle.c(this);
            }
            interfaceC22983PA.getLifecycle().a(this);
            b bVar = new b(interfaceC22983PA, interfaceC23487eA);
            set_viewTreeOwners(bVar);
            Y41.l<? super b, kotlin.G0> lVar = this.f41004e0;
            if (lVar != null) {
                lVar.invoke(bVar);
            }
            this.f41004e0 = null;
        }
        if (isInTouchMode()) {
            C47175a.f428938b.getClass();
            i12 = C47175a.f428939c;
        } else {
            C47175a.f428938b.getClass();
            i12 = C47175a.f428940d;
        }
        ((C22082i3) this.f41030r0.f428943b).setValue(C47175a.a(i12));
        b viewTreeOwners2 = getViewTreeOwners();
        Lifecycle lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.f41047a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw androidx.compose.foundation.H.s("No lifecycle owner exists");
        }
        lifecycle2.a(this);
        lifecycle2.a(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f41006f0);
        getViewTreeObserver().addOnScrollChangedListener(this.f41008g0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f41010h0);
        if (Build.VERSION.SDK_INT >= 31) {
            G.f41115a.b(this);
        }
        androidx.compose.ui.autofill.e eVar = this._autofillManager;
        if (eVar != null) {
            getFocusOwner().l().f(eVar);
            getSemanticsOwner().f41805d.f(eVar);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C22459c0 c22459c0 = (C22459c0) androidx.compose.ui.B.a(this.f41016k0);
        if (c22459c0 == null) {
            return this.f41012i0.f42394d;
        }
        C22523s1 c22523s1 = (C22523s1) androidx.compose.ui.B.a(c22459c0.f41421e);
        return c22523s1 != null && (c22523s1.f41597e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@Y61.k Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(C22711a.a(getContext()));
        InterfaceC22204y1<androidx.compose.ui.unit.u> interfaceC22204y1 = this.f41011i.f41099b;
        if (interfaceC22204y1 != null) {
            ((C22082i3) interfaceC22204y1).setValue(androidx.compose.ui.unit.u.a(C22515q0.a(this)));
        }
        int i12 = Build.VERSION.SDK_INT;
        if ((i12 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f41024o0) {
            this.f41024o0 = i12 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(androidx.compose.ui.text.font.O.a(getContext()));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    @Override // android.view.View
    @Y61.l
    public final InputConnection onCreateInputConnection(@Y61.k EditorInfo editorInfo) {
        String str;
        C22459c0 c22459c0 = (C22459c0) androidx.compose.ui.B.a(this.f41016k0);
        androidx.compose.ui.text.input.F fA2 = null;
        if (c22459c0 != null) {
            C22523s1 c22523s1 = (C22523s1) androidx.compose.ui.B.a(c22459c0.f41421e);
            if (c22523s1 != null) {
                synchronized (c22523s1.f41595c) {
                    if (!c22523s1.f41597e) {
                        fA2 = androidx.compose.ui.text.input.K.a(c22523s1.f41593a.a(editorInfo), new C22519r1(c22523s1));
                        c22523s1.f41596d.b(new androidx.compose.ui.node.e1(fA2));
                    }
                }
            }
            return fA2;
        }
        androidx.compose.ui.text.input.a0 a0Var = this.f41012i0;
        if (!a0Var.f42394d) {
            return null;
        }
        C22655v c22655v = a0Var.f42398h;
        androidx.compose.ui.text.input.W w12 = a0Var.f42397g;
        int i12 = c22655v.f42483e;
        C22654u.f42467b.getClass();
        int i13 = C22654u.f42469d;
        boolean zB2 = C22654u.b(i12, i13);
        boolean z12 = c22655v.f42479a;
        int i14 = 0;
        if (zB2) {
            if (z12) {
                i14 = 6;
            }
        } else if (C22654u.b(i12, 0)) {
            i14 = 1;
        } else if (C22654u.b(i12, C22654u.f42470e)) {
            i14 = 2;
        } else if (C22654u.b(i12, C22654u.f42474i)) {
            i14 = 5;
        } else if (C22654u.b(i12, C22654u.f42473h)) {
            i14 = 7;
        } else if (C22654u.b(i12, C22654u.f42471f)) {
            i14 = 3;
        } else if (C22654u.b(i12, C22654u.f42472g)) {
            i14 = 4;
        } else {
            if (!C22654u.b(i12, C22654u.f42475j)) {
                throw new IllegalStateException("invalid ImeAction");
            }
            i14 = 6;
        }
        editorInfo.imeOptions = i14;
        androidx.compose.ui.text.input.O o12 = c22655v.f42484f;
        if (o12 != null && (str = o12.f42366a) != null) {
            editorInfo.privateImeOptions = str;
        }
        androidx.compose.ui.text.input.C.f42345b.getClass();
        int i15 = androidx.compose.ui.text.input.C.f42346c;
        int i16 = c22655v.f42482d;
        if (androidx.compose.ui.text.input.C.b(i16, i15)) {
            editorInfo.inputType = 1;
        } else if (androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42347d)) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= BeduinInputModel.MIN_TEXT_VERSION;
        } else if (androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42348e)) {
            editorInfo.inputType = 2;
        } else if (androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42349f)) {
            editorInfo.inputType = 3;
        } else if (androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42350g)) {
            editorInfo.inputType = 17;
        } else if (androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42351h)) {
            editorInfo.inputType = 33;
        } else if (androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42352i)) {
            editorInfo.inputType = 129;
        } else if (androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42353j)) {
            editorInfo.inputType = 18;
        } else {
            if (!androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42354k)) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!z12) {
            int i17 = editorInfo.inputType;
            if ((i17 & 1) == 1) {
                editorInfo.inputType = i17 | 131072;
                if (C22654u.b(c22655v.f42483e, i13)) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        if ((editorInfo.inputType & 1) == 1) {
            androidx.compose.ui.text.input.B.f42339b.getClass();
            int i18 = androidx.compose.ui.text.input.B.f42341d;
            int i19 = c22655v.f42480b;
            if (androidx.compose.ui.text.input.B.b(i19, i18)) {
                editorInfo.inputType |= 4096;
            } else if (androidx.compose.ui.text.input.B.b(i19, androidx.compose.ui.text.input.B.f42342e)) {
                editorInfo.inputType |= 8192;
            } else if (androidx.compose.ui.text.input.B.b(i19, androidx.compose.ui.text.input.B.f42343f)) {
                editorInfo.inputType |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (c22655v.f42481c) {
                editorInfo.inputType |= 32768;
            }
        }
        long j12 = w12.f42384b;
        v0.a aVar = androidx.compose.ui.text.v0.f42734b;
        editorInfo.initialSelStart = (int) (j12 >> 32);
        editorInfo.initialSelEnd = (int) (j12 & 4294967295L);
        androidx.core.view.inputmethod.a.a(editorInfo, w12.f42383a.f42127c);
        editorInfo.imeOptions |= 33554432;
        if (androidx.emoji2.text.e.g()) {
            androidx.emoji2.text.e.a().l(editorInfo);
        }
        androidx.compose.ui.text.input.Q q12 = new androidx.compose.ui.text.input.Q(a0Var.f42397g, new androidx.compose.ui.text.input.c0(a0Var), a0Var.f42398h.f42481c);
        a0Var.f42399i.add(new WeakReference(q12));
        return q12;
    }

    @Override // android.view.View
    @j.X
    public final void onCreateVirtualViewTranslationRequests(@Y61.k long[] jArr, @Y61.k int[] iArr, @Y61.k Consumer<ViewTranslationRequest> consumer) {
        this.contentCaptureManager.h(jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.compose.runtime.snapshots.H h12 = getSnapshotObserver().f40586a;
        C22166k c22166k = h12.f38634h;
        if (c22166k != null) {
            c22166k.dispose();
        }
        h12.b();
        D1 d12 = this.f41011i;
        if (d12.f41099b == null) {
            d12.f41098a = null;
        }
        b viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle = viewTreeOwners != null ? viewTreeOwners.f41047a.getLifecycle() : null;
        if (lifecycle == null) {
            throw androidx.compose.foundation.H.s("No lifecycle owner exists");
        }
        lifecycle.c(this.contentCaptureManager);
        lifecycle.c(this);
        androidx.compose.ui.autofill.a aVar = this.f40974E;
        if (aVar != null) {
            androidx.compose.ui.autofill.o oVar = androidx.compose.ui.autofill.o.f38891a;
            oVar.getClass();
            aVar.f38868c.unregisterCallback(oVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f41006f0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f41008g0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f41010h0);
        if (Build.VERSION.SDK_INT >= 31) {
            G.f41115a.a(this);
        }
        androidx.compose.ui.autofill.e eVar = this._autofillManager;
        if (eVar != null) {
            getSemanticsOwner().f41805d.j(eVar);
            getFocusOwner().l().j(eVar);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z12, int i12, @Y61.l Rect rect) {
        super.onFocusChanged(z12, i12, rect);
        if (z12 || hasFocus()) {
            return;
        }
        getFocusOwner().s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        this.lastMatrixRecalculationAnimationTime = 0L;
        this.f40988P.j(this.f40969B0);
        this.f40986N = null;
        P();
        if (this.f40984L != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i14 - i12, i15 - i13);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        C22414h0 c22414h0 = this.f40988P;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                r(getRoot());
            }
            long jL2 = l(i12);
            int i14 = kotlin.w0.f410662c;
            long jL3 = l(i13);
            C22712b.f42842b.getClass();
            long jA2 = C22712b.a.a((int) (jL2 >>> 32), (int) (jL2 & 4294967295L), (int) (jL3 >>> 32), (int) (4294967295L & jL3));
            C22712b c22712b = this.f40986N;
            if (c22712b == null) {
                this.f40986N = C22712b.a(jA2);
                this.f40987O = false;
            } else if (!C22712b.d(c22712b.f42843a, jA2)) {
                this.f40987O = true;
            }
            c22414h0.q(jA2);
            c22414h0.l();
            setMeasuredDimension(getRoot().M(), getRoot().E());
            if (this.f40984L != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().M(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().E(), 1073741824));
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProvideAutofillVirtualStructure(@Y61.l android.view.ViewStructure r13, int r14) {
        /*
            r12 = this;
            r14 = 1
            if (r13 == 0) goto Lb2
            boolean r0 = androidx.compose.ui.l.f40322c
            if (r0 == 0) goto Lab
            androidx.compose.ui.autofill.e r0 = r12._autofillManager
            if (r0 == 0) goto Lab
            androidx.compose.ui.autofill.l r1 = androidx.compose.ui.autofill.l.f38888a
            androidx.compose.ui.semantics.w r2 = r0.f38877b
            androidx.compose.ui.node.LayoutNode r2 = r2.f41802a
            android.view.autofill.AutofillId r3 = r0.f38882g
            java.lang.String r4 = r0.f38880e
            androidx.compose.ui.spatial.i r0 = r0.f38879d
            androidx.compose.ui.autofill.z.a(r13, r2, r3, r4, r0)
            java.lang.Object[] r5 = androidx.collection.a1.f25678a
            androidx.collection.N0 r5 = new androidx.collection.N0
            r6 = 0
            r7 = 2
            r5.<init>(r7, r6)
            r5.f(r2)
            r5.f(r13)
        L29:
            int r2 = r5.f25660b
            if (r2 == 0) goto Lab
            int r2 = r2 - r14
            java.lang.Object r2 = r5.k(r2)
            android.view.ViewStructure r2 = (android.view.ViewStructure) r2
            int r6 = r5.f25660b
            int r6 = r6 - r14
            java.lang.Object r6 = r5.k(r6)
            androidx.compose.ui.semantics.n r6 = (androidx.compose.ui.semantics.n) r6
            java.util.List r6 = r6.S()
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r8 = 0
        L49:
            if (r8 >= r7) goto L29
            java.lang.Object r9 = r6.get(r8)
            androidx.compose.ui.semantics.n r9 = (androidx.compose.ui.semantics.n) r9
            boolean r10 = r9.getF40625S()
            if (r10 != 0) goto La9
            boolean r10 = r9.m()
            if (r10 == 0) goto La9
            boolean r10 = r9.r()
            if (r10 != 0) goto L64
            goto La9
        L64:
            androidx.compose.ui.semantics.l r10 = r9.Q()
            if (r10 == 0) goto La3
            androidx.compose.ui.semantics.k r11 = androidx.compose.ui.semantics.k.f41760a
            r11.getClass()
            androidx.compose.ui.semantics.E<androidx.compose.ui.semantics.a<Y41.l<androidx.compose.ui.text.e, java.lang.Boolean>>> r11 = androidx.compose.ui.semantics.k.f41767h
            androidx.collection.R0<androidx.compose.ui.semantics.E<?>, java.lang.Object> r10 = r10.f41786b
            boolean r11 = r10.b(r11)
            if (r11 != 0) goto L8e
            androidx.compose.ui.semantics.y r11 = androidx.compose.ui.semantics.y.f41820a
            r11.getClass()
            androidx.compose.ui.semantics.E<androidx.compose.ui.autofill.v> r11 = androidx.compose.ui.semantics.y.f41836q
            boolean r11 = r10.b(r11)
            if (r11 != 0) goto L8e
            androidx.compose.ui.semantics.E<androidx.compose.ui.autofill.t> r11 = androidx.compose.ui.semantics.y.f41837r
            boolean r10 = r10.b(r11)
            if (r10 == 0) goto La3
        L8e:
            r1.getClass()
            int r10 = r2.addChildCount(r14)
            android.view.ViewStructure r10 = r2.newChild(r10)
            androidx.compose.ui.autofill.z.a(r10, r9, r3, r4, r0)
            r5.f(r9)
            r5.f(r10)
            goto La9
        La3:
            r5.f(r9)
            r5.f(r2)
        La9:
            int r8 = r8 + r14
            goto L49
        Lab:
            androidx.compose.ui.autofill.a r14 = r12.f40974E
            if (r14 == 0) goto Lb2
            androidx.compose.ui.autofill.h.a(r14, r13)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    @Y61.k
    @j.X
    public final PointerIcon onResolvePointerIcon(@Y61.k MotionEvent motionEvent, int i12) {
        InterfaceC22345x f41058b;
        int toolType = motionEvent.getToolType(i12);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (f41058b = getPointerIconService().getF41058b()) == null)) {
            return super.onResolvePointerIcon(motionEvent, i12);
        }
        H h12 = H.f41122a;
        Context context = getContext();
        h12.getClass();
        return H.b(context, f41058b);
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onResume(@Y61.k InterfaceC22983P interfaceC22983P) {
        setShowLayoutBounds(a.a(f40963H0));
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i12) {
        if (this.f40999c) {
            LayoutDirection layoutDirection = i12 != 0 ? i12 != 1 ? null : LayoutDirection.f42839c : LayoutDirection.f42838b;
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.f42838b;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(@Y61.k Rect rect, @Y61.k Point point, @Y61.k Consumer<ScrollCaptureTarget> consumer) {
        androidx.compose.ui.scrollcapture.m mVar;
        if (Build.VERSION.SDK_INT < 31 || (mVar = this.f40975E0) == null) {
            return;
        }
        mVar.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    @j.X
    public final void onVirtualViewTranslationResponses(@Y61.k LongSparseArray<ViewTranslationResponse> longSparseArray) {
        androidx.compose.ui.contentcapture.b bVar = this.contentCaptureManager;
        bVar.getClass();
        androidx.compose.ui.contentcapture.b.k(bVar, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z12) {
        boolean zA2;
        ((C22082i3) this.f41011i.f41100c).setValue(Boolean.valueOf(z12));
        this.f40973D0 = true;
        super.onWindowFocusChanged(z12);
        if (!z12 || getShowLayoutBounds() == (zA2 = a.a(f40963H0))) {
            return;
        }
        setShowLayoutBounds(zA2);
        q(getRoot());
    }

    public final int p(MotionEvent motionEvent) {
        int i12;
        int actionMasked;
        removeCallbacks(this.f41044y0);
        try {
            G(motionEvent);
            this.f40995W = true;
            w(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f41036u0;
                boolean z12 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                androidx.compose.ui.input.pointer.G g12 = this.f40970C;
                if (motionEvent2 != null) {
                    if ((motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true) {
                        if (motionEvent2.getButtonState() != 0 || (actionMasked = motionEvent2.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            g12.b();
                        } else if (motionEvent2.getActionMasked() != 10 && z12) {
                            O(motionEvent2, 10, motionEvent2.getEventTime(), true);
                        }
                    }
                }
                boolean z13 = motionEvent.getToolType(0) == 3;
                if (z12 || !z13 || actionMasked2 == 3 || actionMasked2 == 9 || !t(motionEvent)) {
                    i12 = 9;
                } else {
                    i12 = 9;
                    O(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.f41036u0;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.f41036u0;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    C22335m c22335m = this.f40968B;
                    if (action == i12 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            c22335m.f40262c.delete(pointerId);
                            c22335m.f40261b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.f41036u0;
                        float x12 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.f41036u0;
                        boolean z14 = (x12 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.f41036u0;
                        boolean z15 = (motionEvent7 != null ? motionEvent7.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z14 || z15) {
                            if (pointerId >= 0) {
                                c22335m.f40262c.delete(pointerId);
                                c22335m.f40261b.delete(pointerId);
                            }
                            C22328f c22328f = g12.f40150b;
                            if (c22328f.f40218d) {
                                c22328f.f40218d = true;
                            } else {
                                c22328f.f40221g.f40275a.g();
                            }
                        }
                    }
                }
                this.f41036u0 = MotionEvent.obtainNoHistory(motionEvent);
                return N(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.f40995W = false;
        }
    }

    public final void r(LayoutNode layoutNode) {
        this.f40988P.p(layoutNode, false);
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = layoutNode.O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            r(layoutNodeArr[i13]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i12, @Y61.l Rect rect) {
        int i13;
        boolean z12 = androidx.compose.ui.l.f40320a;
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().r().b()) {
            return super.requestFocus(i12, rect);
        }
        C22220e c22220eD = C22228m.d(i12);
        if (c22220eD != null) {
            i13 = c22220eD.f39172a;
        } else {
            C22220e.f39163b.getClass();
            i13 = C22220e.f39170i;
        }
        return kotlin.jvm.internal.L.f(getFocusOwner().t(i13, rect != null ? androidx.compose.ui.graphics.X0.d(rect) : null, new s(i13)), Boolean.TRUE);
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.f41031s.f41552h = intervalMillis;
    }

    public final void setConfigurationChangeObserver(@Y61.k Y41.l<? super Configuration, kotlin.G0> lVar) {
        this.configurationChangeObserver = lVar;
    }

    public final void setContentCaptureManager$ui_release(@Y61.k androidx.compose.ui.contentcapture.b bVar) {
        this.contentCaptureManager = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public void setCoroutineContext(@Y61.k CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
        ?? r12 = getRoot().f40615I.f40878e;
        if (r12 instanceof androidx.compose.ui.input.pointer.b0) {
            ((androidx.compose.ui.input.pointer.b0) r12).B0();
        }
        if (!r12.f42880b.f42893o) {
            C47949a.b("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
        v.d dVar = r12.f42880b;
        v.d dVar2 = dVar.f42885g;
        if (dVar2 == null) {
            C22421l.a(eVar, dVar);
        } else {
            eVar.b(dVar2);
        }
        while (true) {
            int i12 = eVar.f38262d;
            if (i12 == 0) {
                return;
            }
            v.d dVar3 = (v.d) eVar.k(i12 - 1);
            if ((dVar3.f42883e & 16) != 0) {
                for (v.d dVar4 = dVar3; dVar4 != null; dVar4 = dVar4.f42885g) {
                    if ((dVar4.f42882d & 16) != 0) {
                        AbstractC22425n abstractC22425nB = dVar4;
                        ?? eVar2 = 0;
                        while (abstractC22425nB != 0) {
                            if (abstractC22425nB instanceof androidx.compose.ui.node.P0) {
                                androidx.compose.ui.node.P0 p02 = (androidx.compose.ui.node.P0) abstractC22425nB;
                                if (p02 instanceof androidx.compose.ui.input.pointer.b0) {
                                    ((androidx.compose.ui.input.pointer.b0) p02).B0();
                                }
                            } else if ((abstractC22425nB.f42882d & 16) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                v.d dVar5 = abstractC22425nB.f40861q;
                                int i13 = 0;
                                abstractC22425nB = abstractC22425nB;
                                eVar2 = eVar2;
                                while (dVar5 != null) {
                                    if ((dVar5.f42882d & 16) != 0) {
                                        i13++;
                                        eVar2 = eVar2;
                                        if (i13 == 1) {
                                            abstractC22425nB = dVar5;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                            }
                                            if (abstractC22425nB != 0) {
                                                eVar2.b(abstractC22425nB);
                                                abstractC22425nB = 0;
                                            }
                                            eVar2.b(dVar5);
                                        }
                                    }
                                    dVar5 = dVar5.f42885g;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar2 = eVar2;
                                }
                                if (i13 == 1) {
                                }
                            }
                            abstractC22425nB = C22421l.b(eVar2);
                        }
                    }
                }
            }
            C22421l.a(eVar, dVar3);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j12) {
        this.lastMatrixRecalculationAnimationTime = j12;
    }

    public final void setOnViewTreeOwnersAvailable(@Y61.k Y41.l<? super b, kotlin.G0> callback) {
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f41004e0 = callback;
    }

    @Override // androidx.compose.ui.node.J0
    public void setShowLayoutBounds(boolean z12) {
        this.showLayoutBounds = z12;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(MotionEvent motionEvent) {
        float x12 = motionEvent.getX();
        float y12 = motionEvent.getY();
        return 0.0f <= x12 && x12 <= ((float) getWidth()) && 0.0f <= y12 && y12 <= ((float) getHeight());
    }

    public final boolean u(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f41036u0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long v(long j12) {
        F();
        long jC2 = androidx.compose.ui.graphics.A0.c(j12, this.f40992T);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f40996a0 >> 32)) + Float.intBitsToFloat((int) (jC2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f40996a0 & 4294967295L)) + Float.intBitsToFloat((int) (jC2 & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        g.a aVar = l0.g.f413384b;
        return jFloatToRawIntBits;
    }

    public final void w(boolean z12) {
        Y41.a<kotlin.G0> aVar;
        C22414h0 c22414h0 = this.f40988P;
        if (c22414h0.f40809b.c() || c22414h0.f40812e.f40572a.f38262d != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z12) {
                try {
                    aVar = this.f40969B0;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                aVar = null;
            }
            if (c22414h0.j(aVar)) {
                requestLayout();
            }
            c22414h0.a(false);
            if (this.f40966A) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f40966A = false;
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            Trace.endSection();
        }
    }

    public final void x(@Y61.k LayoutNode layoutNode, long j12) {
        C22414h0 c22414h0 = this.f40988P;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c22414h0.k(layoutNode, j12);
            if (!c22414h0.f40809b.c()) {
                c22414h0.a(false);
                if (this.f40966A) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f40966A = false;
                }
            }
            if (androidx.compose.ui.l.f40320a) {
                getRectManager().a();
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void y(@Y61.k androidx.compose.ui.node.I0 i02, boolean z12) {
        ArrayList arrayList = this.f41041x;
        if (!z12) {
            if (this.f41045z) {
                return;
            }
            arrayList.remove(i02);
            ArrayList arrayList2 = this.f41043y;
            if (arrayList2 != null) {
                arrayList2.remove(i02);
                return;
            }
            return;
        }
        if (!this.f41045z) {
            arrayList.add(i02);
            return;
        }
        ArrayList arrayList3 = this.f41043y;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f41043y = arrayList3;
        }
        arrayList3.add(i02);
    }

    public final void z() {
        androidx.collection.N0<Y41.a<kotlin.G0>> n02;
        int i12;
        androidx.compose.ui.autofill.e eVar;
        if (this.f40978G) {
            getSnapshotObserver().a();
            this.f40978G = false;
        }
        C22511p0 c22511p0 = this.f40984L;
        if (c22511p0 != null) {
            k(c22511p0);
        }
        if (androidx.compose.ui.l.f40322c && (eVar = this._autofillManager) != null) {
            androidx.collection.B0 b02 = eVar.f38883h;
            if (b02.f25562d == 0 && eVar.f38884i) {
                eVar.f38876a.f38939a.commit();
                eVar.f38884i = false;
            }
            if (b02.f25562d != 0) {
                eVar.f38884i = true;
            }
        }
        loop0: while (true) {
            n02 = this.f41042x0;
            if (n02.f25660b == 0 || n02.b(0) == null) {
                return;
            }
            int i13 = n02.f25660b;
            i12 = 0;
            while (i12 < i13) {
                Y41.a<kotlin.G0> aVarB = n02.b(i12);
                if (i12 < 0 || i12 >= n02.f25660b) {
                    break loop0;
                }
                Object[] objArr = n02.f25659a;
                Object obj = objArr[i12];
                objArr[i12] = null;
                if (aVarB != null) {
                    aVarB.invoke();
                }
                i12++;
            }
            n02.l(0, i13);
        }
        n02.e(i12);
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(@Y61.l View view, int i12) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i12, layoutParams, true);
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public C22462d getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public C22466e getClipboard() {
        return this.clipboard;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public C22470f getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.J0
    @Y61.k
    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Y61.k
    /* renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public androidx.collection.A0<LayoutNode> m4getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // android.view.ViewGroup
    public final void addView(@Y61.l View view, int i12, int i13) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i12;
        layoutParamsGenerateDefaultLayoutParams.height = i13;
        kotlin.G0 g02 = kotlin.G0.f406611a;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(@Y61.l View view, int i12, @Y61.l ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i12, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(@Y61.l View view, @Y61.l ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @InterfaceC42830m
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    @j.k0
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @InterfaceC42830m
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    @Y61.k
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
    }
}

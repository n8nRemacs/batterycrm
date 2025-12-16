package ru.cyberity.cbr.camera.photo.presentation.document;

import Y41.p;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.camera2.internal.G;
import androidx.camera.core.InterfaceC20120j0;
import androidx.camera.view.PreviewView;
import androidx.core.view.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e11.ViewOnClickListenerC39879j1;
import java.io.File;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.K;
import lY0.C43709d;
import n11.RunnableC44167a;
import ru.cyberity.cbr.camera.photo.presentation.document.CBRFrameViewWithBackground;
import ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel;
import ru.cyberity.cbr.camera.photo.presentation.document.DocCapture;
import ru.cyberity.cbr.core.analytics.Control;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.common.C47845a;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.f0;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.common.w;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.IdentitySide;
import ru.cyberity.cbr.core.domain.camera.CameraX;
import ru.cyberity.cbr.core.presentation.CBRAnalyticsScreenMapper;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.widget.CBRDocBoundsCheckResultView;
import ru.cyberity.cbr.core.widget.CBRSegmentedToggleView;
import ru.cyberity.cbr.core.widget.CBRToolbarView;
import ru.cyberity.internal.R;

/* compiled from: CBRPhotoDocumentPickerFragment.kt */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 Ð\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0019\u0010\u0004J#\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001eJ\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010 J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b\u0016\u0010'J\u0017\u0010(\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0003¢\u0006\u0004\b)\u0010'J\u0017\u0010*\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b*\u0010'J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b\u0018\u0010'J\u0019\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010+\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010,J\u000f\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010\u0004J!\u0010\u0018\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0018\u0010/J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u00101J\u000f\u00102\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\u0004J\u001f\u0010\u0018\u001a\u0002052\u0006\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u00106J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\"\u001a\u000207H\u0002¢\u0006\u0004\b\u0018\u00108J\u000f\u00109\u001a\u00020\fH\u0002¢\u0006\u0004\b9\u0010\u0004J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\"\u001a\u00020:H\u0002¢\u0006\u0004\b\u0018\u0010;J\u0013\u0010\u0018\u001a\u00020=*\u00020<H\u0002¢\u0006\u0004\b\u0018\u0010>J\u000f\u0010?\u001a\u00020\fH\u0002¢\u0006\u0004\b?\u0010\u0004J1\u0010\u0018\u001a\u00020\f2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@2\u0006\u0010D\u001a\u00020C2\b\b\u0002\u0010E\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010FR\u001b\u0010K\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001d\u0010P\u001a\u0004\u0018\u00010\b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001d\u0010R\u001a\u0004\u0018\u00010\b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010M\u001a\u0004\bQ\u0010OR\u001d\u0010U\u001a\u0004\u0018\u00010\b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bS\u0010M\u001a\u0004\bT\u0010OR\u001d\u0010Z\u001a\u0004\u0018\u00010V8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bW\u0010M\u001a\u0004\bX\u0010YR\u001d\u0010]\u001a\u0004\u0018\u00010\b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b[\u0010M\u001a\u0004\b\\\u0010OR\u001d\u0010b\u001a\u0004\u0018\u00010^8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b_\u0010M\u001a\u0004\b`\u0010aR\u001d\u0010c\u001a\u0004\u0018\u00010^8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bT\u0010M\u001a\u0004\b(\u0010aR\u001d\u0010f\u001a\u0004\u0018\u00010^8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bd\u0010M\u001a\u0004\be\u0010aR\u001d\u0010k\u001a\u0004\u0018\u00010g8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bh\u0010M\u001a\u0004\bi\u0010jR\u001d\u0010m\u001a\u0004\u0018\u00010g8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b2\u0010M\u001a\u0004\bl\u0010jR\u001d\u0010o\u001a\u0004\u0018\u00010\b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bn\u0010M\u001a\u0004\b)\u0010OR\u001d\u0010t\u001a\u0004\u0018\u00010p8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bq\u0010M\u001a\u0004\br\u0010sR\u001d\u0010w\u001a\u0004\u0018\u00010g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010M\u001a\u0004\bv\u0010jR\u001d\u0010|\u001a\u0004\u0018\u00010x8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010M\u001a\u0004\bz\u0010{R\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010}8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b~\u0010M\u001a\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0084\u0001\u001a\u0004\u0018\u00010g8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010M\u001a\u0005\b\u0083\u0001\u0010jR \u0010\u0087\u0001\u001a\u0004\u0018\u00010g8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010M\u001a\u0005\b\u0086\u0001\u0010jR\u001a\u0010\u0089\u0001\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bv\u0010\u0088\u0001R \u0010\u008b\u0001\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010M\u001a\u0005\b\u008a\u0001\u0010OR\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010g8BX\u0082\u0084\u0002¢\u0006\r\n\u0005\b\u0083\u0001\u0010M\u001a\u0004\bq\u0010jR\u001f\u0010\u008e\u0001\u001a\u0004\u0018\u00010g8BX\u0082\u0084\u0002¢\u0006\r\n\u0005\b\u008d\u0001\u0010M\u001a\u0004\by\u0010jR \u0010\u0094\u0001\u001a\u00030\u008f\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001e\u0010\u0098\u0001\u001a\u00020\u00118\u0016X\u0096D¢\u0006\u000f\n\u0005\b\u0095\u0001\u00109\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001d\u0010\u009a\u0001\u001a\u00020\u00118\u0016X\u0096D¢\u0006\u000e\n\u0005\b\u0099\u0001\u00109\u001a\u0005\bL\u0010\u0097\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u00109R\u001f\u0010\u009f\u0001\u001a\u00030\u009c\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010H\u001a\u0005\bn\u0010\u009e\u0001R \u0010£\u0001\u001a\u00030 \u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¡\u0001\u0010H\u001a\u0006\b\u0085\u0001\u0010¢\u0001R\u0019\u0010¦\u0001\u001a\u00030¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010¥\u0001R\u001c\u0010ª\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0017\u0010\u00ad\u0001\u001a\u00030«\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bl\u0010¬\u0001R\u0018\u0010®\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010©\u0001R\u0017\u0010¯\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010¥\u0001R\u001a\u0010±\u0001\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b9\u0010°\u0001R\u0015\u0010²\u0001\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b?\u00109R\u001a\u0010´\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b-\u0010³\u0001R\u0018\u0010¶\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bµ\u0001\u00109R\u0017\u0010¹\u0001\u001a\u00020=8TX\u0094\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R%\u0010¾\u0001\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0005\u0012\u00030»\u00010º\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0017\u0010Á\u0001\u001a\u00030¿\u00018TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u0016\u0010À\u0001R\u0016\u0010Â\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u0007R\u0018\u0010Ã\u0001\u001a\u0004\u0018\u00010^8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010aR\u0018\u0010Ä\u0001\u001a\u0004\u0018\u00010^8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010aR\u0018\u0010Å\u0001\u001a\u0004\u0018\u00010^8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010aR\u0018\u0010Æ\u0001\u001a\u0004\u0018\u00010^8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010aR\u0018\u0010Ç\u0001\u001a\u0004\u0018\u00010^8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010aR\u0018\u0010È\u0001\u001a\u0004\u0018\u00010^8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010aR\u001a\u0010Ë\u0001\u001a\u0005\u0018\u00010É\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010Ê\u0001R\u0017\u0010Ì\u0001\u001a\u0004\u0018\u00010^8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010aR\u0019\u0010Ï\u0001\u001a\u0005\u0018\u00010Í\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b~\u0010Î\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ñ\u0001"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/b;", "Lru/cyberity/cbr/camera/b;", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel;", "<init>", "()V", "", "getLayoutId", "()I", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/cyberity/cbr/core/common/a0;", "finishReason", "", "onFinishCalled", "(Lru/cyberity/cbr/core/common/a0;)Z", "Ljava/io/File;", "file", "b", "(Ljava/io/File;)V", "a", "u", "Landroidx/camera/core/j0;", "image", "Lru/cyberity/cbr/core/domain/camera/b;", "exposure", "(Landroidx/camera/core/j0;Lru/cyberity/cbr/core/domain/camera/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "peekHeight", "(I)V", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b;", VoiceInfo.STATE, "(Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b;)V", "e", "c", "d", "force", "(Z)V", "b0", "appear", "(ZLandroid/view/View;)V", "frameContainerHeight", "(I)I", "C", "width", "height", "Landroid/graphics/Bitmap;", "(II)Landroid/graphics/Bitmap;", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$g;", "(Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$g;)V", "Z", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$f;", "(Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$f;)V", "", "", "(J)Ljava/lang/String;", "a0", "", "scaleX", "scaleY", "Lru/cyberity/ml/docdetector/a;", "detectionResult", "save", "(FFLru/cyberity/ml/docdetector/a;Z)V", "s", "Lkotlin/C;", "Y", "()Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel;", "viewModel", "t", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "o", "()Landroid/view/View;", "rootView", "q", "takePictureView", "v", "z", "takeGalleryView", "Lru/cyberity/cbr/core/widget/CBRToolbarView;", "w", "r", "()Lru/cyberity/cbr/core/widget/CBRToolbarView;", "toolbar", "x", "n", "progressBar", "Landroid/widget/TextView;", "y", "h", "()Landroid/widget/TextView;", "helperTitle", "helperBrief", "A", "f", "helperDetails", "Landroid/view/ViewGroup;", "B", "g", "()Landroid/view/ViewGroup;", "helperDetailsFrame", "W", "helperView", "D", "darkOverlay", "Landroidx/camera/view/PreviewView;", "E", "m", "()Landroidx/camera/view/PreviewView;", "previewView", "F", "K", "container", "Lru/cyberity/cbr/core/widget/CBRDocBoundsCheckResultView;", "G", "R", "()Lru/cyberity/cbr/core/widget/CBRDocBoundsCheckResultView;", "docDetectionResultView", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRFrameViewWithBackground;", "H", "U", "()Lru/cyberity/cbr/camera/photo/presentation/document/CBRFrameViewWithBackground;", "frameWithBackground", "I", "M", "debugInfoView", "J", "L", "debugInfoRightView", "Landroid/view/ViewGroup;", "frameHintContainer", "X", "photoFrameContainerView", "autoCaptureHint", "N", "autoManual", "Lru/cyberity/cbr/core/analytics/Screen;", "O", "Lru/cyberity/cbr/core/analytics/Screen;", "getScreen", "()Lru/cyberity/cbr/core/analytics/Screen;", "screen", "P", "p", "()Z", "shouldShowFlash", "Q", "isFrontFacingCamera", "isAnimatingPopup", "Lru/cyberity/ml/autocapture/a;", "S", "()Lru/cyberity/ml/autocapture/a;", "autoCaptureFeature", "Ljava/text/DecimalFormat;", "T", "()Ljava/text/DecimalFormat;", "confidenceDecimalFormat", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "photoToPreviewTransform", "Landroid/graphics/Rect;", "V", "Landroid/graphics/Rect;", "photoFrameRect", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "photoFrameOnPhotoRectF", "photoFrameOnPhotoRect", "previewToPhotoMatrix", "Landroid/graphics/Bitmap;", "frameBitmap", "showDebugInfo", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b;", "currentCaptureState", "c0", "processing", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "", "", "k", "()Ljava/util/Map;", "permissionsPayload", "Lru/cyberity/cbr/core/domain/camera/CameraX$Mode;", "()Lru/cyberity/cbr/core/domain/camera/CameraX$Mode;", "cameraMode", "cameraContentColor", "docBoundsConfView", "goodDocConfView", "debugText1Right", "debugText2Right", "debugText3Right", "frameHintText", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "frameHintIcon", "autoCaptureHintText", "Lru/cyberity/cbr/core/widget/CBRSegmentedToggleView;", "()Lru/cyberity/cbr/core/widget/CBRSegmentedToggleView;", "autoManualSwitch", "d0", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends ru.cyberity.cbr.camera.b<CBRPhotoDocumentPickerViewModel> {

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE;

    /* renamed from: e0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f432345e0;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private ViewGroup frameHintContainer;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final boolean isFrontFacingCamera;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private boolean isAnimatingPopup;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private Rect photoFrameRect;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private Bitmap frameBitmap;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final boolean showDebugInfo;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private CBRPhotoDocumentPickerViewModel.b currentCaptureState;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private boolean processing;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(CBRPhotoDocumentPickerViewModel.class), new l(new k(this)), new m());

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView rootView = i0.a(this, R.id.cbr_content);

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView takePictureView = i0.a(this, R.id.cbr_primary_button);

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView takeGalleryView = i0.a(this, R.id.cbr_gallery);

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView toolbar = i0.a(this, R.id.cbr_toolbar);

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView progressBar = i0.a(this, R.id.cbr_progress);

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView helperTitle = i0.a(this, R.id.cbr_helper_title);

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView helperBrief = i0.a(this, R.id.cbr_helper_brief);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView helperDetails = i0.a(this, R.id.cbr_helper_details);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView helperDetailsFrame = i0.a(this, R.id.cbr_helper_details_frame);

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView helperView = i0.a(this, R.id.cbr_helper);

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView darkOverlay = i0.a(this, R.id.cbr_dark_overlay);

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView previewView = i0.a(this, R.id.cbr_camera_preview);

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView container = i0.a(this, R.id.cbr_camera_preview_container);

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView docDetectionResultView = i0.a(this, R.id.cbr_doc_detection_result);

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView frameWithBackground = i0.a(this, R.id.cbr_frame_with_background);

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView debugInfoView = i0.a(this, R.id.cbr_debug_info);

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView debugInfoRightView = i0.a(this, R.id.cbr_debug_info_right);

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView photoFrameContainerView = i0.a(this, R.id.cbr_frame_container);

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView autoCaptureHint = i0.a(this, R.id.cbr_autocapture_hint);

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final LifecycleAwareFindView autoManual = i0.a(this, R.id.cbr_auto_manual);

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Screen screen = CBRAnalyticsScreenMapper.INSTANCE.getScreenByFragment(this);

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldShowFlash = true;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C autoCaptureFeature = C42727D.c(C12424b.f432383a);

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C confidenceDecimalFormat = C42727D.c(c.f432384a);

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private Matrix photoToPreviewTransform = new Matrix();

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final RectF photoFrameOnPhotoRectF = new RectF();

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Rect photoFrameOnPhotoRect = new Rect();

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Matrix previewToPhotoMatrix = new Matrix();

    /* compiled from: CBRPhotoDocumentPickerFragment.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/b$a;", "", "Lru/cyberity/cbr/core/data/model/DocumentType;", "type", "", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "sides", "", AdvertDetailsBlockIdKt.GALLERY_BLOCK, "", "identityType", "Lru/cyberity/cbr/camera/photo/presentation/document/DocCapture$PreferredMode;", "preferredMode", "Lru/cyberity/cbr/camera/photo/presentation/document/b;", "a", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.camera.photo.presentation.document.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final b a(@Y61.k DocumentType type, @Y61.k List<? extends IdentitySide> sides, boolean gallery, @Y61.l String identityType, @Y61.l DocCapture.PreferredMode preferredMode) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_DOCUMENT_TYPE", type.getValue());
            ArrayList arrayList = new ArrayList(C42745f0.q(sides, 10));
            Iterator<T> it = sides.iterator();
            while (it.hasNext()) {
                arrayList.add(((IdentitySide) it.next()).getValue());
            }
            bundle.putStringArrayList("EXTRA_DOCUMENT_SIDES", new ArrayList<>(arrayList));
            bundle.putBoolean("EXTRA_GALLERY_AVAILABLE", gallery);
            bundle.putString("EXTRA_PREFER_AUTO_CAPTURE", preferredMode != null ? preferredMode.getValue() : null);
            if (identityType != null) {
                bundle.putString("EXTRA_ONLY_ID_DOC", identityType);
            }
            bVar.setArguments(bundle);
            return bVar;
        }

        private Companion() {
        }
    }

    /* compiled from: CBRPhotoDocumentPickerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/ml/autocapture/a;", "a", "()Lru/cyberity/ml/autocapture/a;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.camera.photo.presentation.document.b$b, reason: collision with other inner class name */
    public static final class C12424b extends N implements Y41.a<ru.cyberity.ml.autocapture.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final C12424b f432383a = new C12424b();

        public C12424b() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.ml.autocapture.a invoke() {
            return ru.cyberity.ml.autocapture.a.INSTANCE.a();
        }
    }

    /* compiled from: CBRPhotoDocumentPickerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/text/DecimalFormat;", "a", "()Ljava/text/DecimalFormat;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<DecimalFormat> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f432384a = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DecimalFormat invoke() {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            return decimalFormat;
        }
    }

    /* compiled from: CBRPhotoDocumentPickerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f432385a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f432386b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CBRPhotoDocumentPickerViewModel.b f432387c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z12, b bVar, CBRPhotoDocumentPickerViewModel.b bVar2) {
            super(0);
            this.f432385a = z12;
            this.f432386b = bVar;
            this.f432387c = bVar2;
        }

        public final void a() {
            TextView textViewF;
            if (!this.f432385a || (textViewF = this.f432386b.F()) == null) {
                return;
            }
            CBRPhotoDocumentPickerViewModel.AutoCaptureHint autoCaptureHintE = this.f432387c.getAutoCaptureHint();
            s.a(textViewF, autoCaptureHintE != null ? autoCaptureHintE.getHint() : null);
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPhotoDocumentPickerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 7, 1})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        public final void a() {
            View viewX = b.this.X();
            if (viewX == null) {
                return;
            }
            viewX.setVisibility(4);
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPhotoDocumentPickerFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerFragment$onFrameCaptured$2", f = "CBRPhotoDocumentPickerFragment.kt", i = {0, 0}, l = {267}, m = "invokeSuspend", n = {"bitmap", "startMs"}, s = {"L$0", "J$0"})
    public static final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        long f432390a;

        /* renamed from: b, reason: collision with root package name */
        Object f432391b;

        /* renamed from: c, reason: collision with root package name */
        Object f432392c;

        /* renamed from: d, reason: collision with root package name */
        int f432393d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC20120j0 f432395f;

        /* compiled from: CBRPhotoDocumentPickerFragment.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "width", "height", "Landroid/graphics/Bitmap;", "a", "(II)Landroid/graphics/Bitmap;"}, k = 3, mv = {1, 7, 1})
        public static final class a extends N implements p<Integer, Integer, Bitmap> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f432396a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(2);
                this.f432396a = bVar;
            }

            @Y61.k
            public final Bitmap a(int i12, int i13) {
                return this.f432396a.a(i12, i13);
            }

            @Override // Y41.p
            public /* bridge */ /* synthetic */ Bitmap invoke(Integer num, Integer num2) {
                return a(num.intValue(), num2.intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC20120j0 interfaceC20120j0, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f432395f = interfaceC20120j0;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new g(this.f432395f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Bitmap bitmap;
            long j12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432393d;
            if (i12 == 0) {
                C42729a0.b(obj);
                boolean zF2 = L.f(b.this.getViewModel().q().getValue().getSwitch().getAuto(), Boxing.boxBoolean(true));
                if (b.this.processing) {
                    if (n0.f432787a.isDebug()) {
                        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "skipped frame", null, 4, null);
                    }
                    return G0.f406611a;
                }
                b.this.processing = true;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Bitmap bitmapA = f0.a(this.f432395f, new a(b.this));
                if (zF2 && b.this.photoFrameRect != null) {
                    Matrix matrix = b.this.photoToPreviewTransform;
                    int width = bitmapA.getWidth();
                    int height = bitmapA.getHeight();
                    PreviewView previewViewM = b.this.m();
                    int width2 = previewViewM != null ? previewViewM.getWidth() : 0;
                    PreviewView previewViewM2 = b.this.m();
                    f0.a(matrix, width, height, width2, previewViewM2 != null ? previewViewM2.getHeight() : 0, 0, true);
                    b.this.photoToPreviewTransform.invert(b.this.previewToPhotoMatrix);
                    RectF rectF = b.this.photoFrameOnPhotoRectF;
                    Rect rect = b.this.photoFrameRect;
                    if (rect == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    rectF.set(rect);
                    b.this.previewToPhotoMatrix.mapRect(b.this.photoFrameOnPhotoRectF);
                    b.this.photoFrameOnPhotoRect.set((int) b.this.photoFrameOnPhotoRectF.left, (int) b.this.photoFrameOnPhotoRectF.top, (int) b.this.photoFrameOnPhotoRectF.right, (int) b.this.photoFrameOnPhotoRectF.bottom);
                }
                Context context = b.this.getContext();
                if (context != null) {
                    b bVar = b.this;
                    CBRPhotoDocumentPickerViewModel viewModel = bVar.getViewModel();
                    Rect rect2 = bVar.photoFrameOnPhotoRect;
                    this.f432391b = bitmapA;
                    this.f432392c = context;
                    this.f432390a = jCurrentTimeMillis;
                    this.f432393d = 1;
                    if (viewModel.b(context, bitmapA, rect2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                bitmap = bitmapA;
                j12 = jCurrentTimeMillis;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j12 = this.f432390a;
                bitmap = (Bitmap) this.f432391b;
                C42729a0.b(obj);
            }
            bitmap.recycle();
            TextView textViewP = b.this.P();
            if (textViewP != null) {
                s.a(textViewP, "frame handle: " + b.this.a(System.currentTimeMillis() - j12));
            }
            b.this.processing = false;
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPhotoDocumentPickerFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b;", VoiceInfo.STATE, "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$b;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerFragment$onViewCreated$1", f = "CBRPhotoDocumentPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements p<CBRPhotoDocumentPickerViewModel.b, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432397a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432398b;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k CBRPhotoDocumentPickerViewModel.b bVar, @Y61.l Continuation<? super G0> continuation) {
            return ((h) create(bVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = b.this.new h(continuation);
            hVar.f432398b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432397a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            b.this.b((CBRPhotoDocumentPickerViewModel.b) this.f432398b);
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPhotoDocumentPickerFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ru/cyberity/cbr/camera/photo/presentation/document/b$i", "Lru/cyberity/cbr/core/widget/CBRSegmentedToggleView$OnItemSelected;", "", "index", "Lkotlin/G0;", "onSelected", "(I)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class i implements CBRSegmentedToggleView.OnItemSelected {
        public i() {
        }

        @Override // ru.cyberity.cbr.core.widget.CBRSegmentedToggleView.OnItemSelected
        public void onSelected(int index) {
            b.this.getViewModel().a(index == 0);
            b.this.getAnalyticsDelegate().a(b.this.getScreen(), b.this.getIdDocSetType(), Control.AutocaptureSegmentedControl, b.this.k());
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/view/v0", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f432401a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f432402b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SizeF f432403c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f432404d;

        public j(View view, b bVar, SizeF sizeF, boolean z12) {
            this.f432401a = view;
            this.f432402b = bVar;
            this.f432403c = sizeF;
            this.f432404d = z12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CBRFrameViewWithBackground cBRFrameViewWithBackgroundU = this.f432402b.U();
            if (cBRFrameViewWithBackgroundU != null) {
                cBRFrameViewWithBackgroundU.setFrameSize(this.f432403c);
            }
            CBRFrameViewWithBackground cBRFrameViewWithBackgroundU2 = this.f432402b.U();
            if (cBRFrameViewWithBackgroundU2 != null) {
                cBRFrameViewWithBackgroundU2.b();
            }
            this.f432402b.b0();
            this.f432402b.C();
            if (this.f432404d) {
                b bVar = this.f432402b;
                ru.cyberity.cbr.camera.a.a(bVar, true, bVar.X(), null, 4, null);
            }
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    public static final class k extends N implements Y41.a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f432405a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f432405a = fragment;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f432405a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f432406a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Y41.a aVar) {
            super(0);
            this.f432406a = aVar;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f432406a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRPhotoDocumentPickerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class m extends N implements Y41.a<P0.c> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            b bVar = b.this;
            return new ru.cyberity.cbr.camera.photo.presentation.document.d(bVar, bVar.getServiceLocator(), b.this.getArguments());
        }
    }

    static {
        h0 h0Var = new h0(b.class, "rootView", "getRootView()Landroid/view/View;", 0);
        kotlin.jvm.internal.n0 n0Var = m0.f406844a;
        f432345e0 = new n[]{n0Var.i(h0Var), C0.k(b.class, "takePictureView", "getTakePictureView()Landroid/view/View;", 0, n0Var), C0.k(b.class, "takeGalleryView", "getTakeGalleryView()Landroid/view/View;", 0, n0Var), C0.k(b.class, "toolbar", "getToolbar()Lru/cyberity/cbr/core/widget/CBRToolbarView;", 0, n0Var), C0.k(b.class, "progressBar", "getProgressBar()Landroid/view/View;", 0, n0Var), C0.k(b.class, "helperTitle", "getHelperTitle()Landroid/widget/TextView;", 0, n0Var), C0.k(b.class, "helperBrief", "getHelperBrief()Landroid/widget/TextView;", 0, n0Var), C0.k(b.class, "helperDetails", "getHelperDetails()Landroid/widget/TextView;", 0, n0Var), C0.k(b.class, "helperDetailsFrame", "getHelperDetailsFrame()Landroid/view/ViewGroup;", 0, n0Var), C0.k(b.class, "helperView", "getHelperView()Landroid/view/ViewGroup;", 0, n0Var), C0.k(b.class, "darkOverlay", "getDarkOverlay()Landroid/view/View;", 0, n0Var), C0.k(b.class, "previewView", "getPreviewView()Landroidx/camera/view/PreviewView;", 0, n0Var), C0.k(b.class, "container", "getContainer()Landroid/view/ViewGroup;", 0, n0Var), C0.k(b.class, "docDetectionResultView", "getDocDetectionResultView()Lru/cyberity/cbr/core/widget/CBRDocBoundsCheckResultView;", 0, n0Var), C0.k(b.class, "frameWithBackground", "getFrameWithBackground()Lru/cyberity/cbr/camera/photo/presentation/document/CBRFrameViewWithBackground;", 0, n0Var), C0.k(b.class, "debugInfoView", "getDebugInfoView()Landroid/view/ViewGroup;", 0, n0Var), C0.k(b.class, "debugInfoRightView", "getDebugInfoRightView()Landroid/view/ViewGroup;", 0, n0Var), C0.k(b.class, "photoFrameContainerView", "getPhotoFrameContainerView()Landroid/view/View;", 0, n0Var), C0.k(b.class, "autoCaptureHint", "getAutoCaptureHint()Landroid/view/ViewGroup;", 0, n0Var), C0.k(b.class, "autoManual", "getAutoManual()Landroid/view/ViewGroup;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        Rect rect;
        RectF frameRect;
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "configurePhotoFrameRect", null, 4, null);
        View viewX = X();
        int top = viewX != null ? viewX.getTop() : 0;
        CBRFrameViewWithBackground cBRFrameViewWithBackgroundU = U();
        if (cBRFrameViewWithBackgroundU == null || (frameRect = cBRFrameViewWithBackgroundU.getFrameRect()) == null) {
            rect = null;
        } else {
            rect = new Rect((int) frameRect.left, ((int) frameRect.top) + top, (int) frameRect.right, top + ((int) frameRect.bottom));
            this.photoFrameOnPhotoRectF.set(rect);
        }
        this.photoFrameRect = rect;
    }

    private final ru.cyberity.ml.autocapture.a D() {
        return (ru.cyberity.ml.autocapture.a) this.autoCaptureFeature.getValue();
    }

    private final ViewGroup E() {
        return (ViewGroup) this.autoCaptureHint.a(this, f432345e0[18]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView F() {
        ViewGroup viewGroupE = E();
        if (viewGroupE != null) {
            return (TextView) viewGroupE.findViewById(R.id.cbr_text);
        }
        return null;
    }

    private final ViewGroup G() {
        return (ViewGroup) this.autoManual.a(this, f432345e0[19]);
    }

    private final CBRSegmentedToggleView H() {
        ViewGroup viewGroupG = G();
        if (viewGroupG != null) {
            return (CBRSegmentedToggleView) viewGroupG.findViewById(R.id.cbr_auto_manual_switch);
        }
        return null;
    }

    private final int I() {
        View viewO = o();
        if (viewO != null) {
            return ThemeHelper.INSTANCE.getThemeColor(viewO, CBRColorElement.CAMERA_CONTENT, C47845a.a(requireActivity(), R.attr.cbr_colorInit));
        }
        return -1;
    }

    private final DecimalFormat J() {
        return (DecimalFormat) this.confidenceDecimalFormat.getValue();
    }

    private final ViewGroup K() {
        return (ViewGroup) this.container.a(this, f432345e0[12]);
    }

    private final ViewGroup L() {
        return (ViewGroup) this.debugInfoRightView.a(this, f432345e0[16]);
    }

    private final ViewGroup M() {
        return (ViewGroup) this.debugInfoView.a(this, f432345e0[15]);
    }

    private final TextView N() {
        ViewGroup viewGroupL = L();
        if (viewGroupL != null) {
            return (TextView) viewGroupL.findViewById(R.id.text1);
        }
        return null;
    }

    private final TextView O() {
        ViewGroup viewGroupL = L();
        if (viewGroupL != null) {
            return (TextView) viewGroupL.findViewById(R.id.text2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView P() {
        ViewGroup viewGroupL = L();
        if (viewGroupL != null) {
            return (TextView) viewGroupL.findViewById(R.id.text3);
        }
        return null;
    }

    private final TextView Q() {
        ViewGroup viewGroupM = M();
        if (viewGroupM != null) {
            return (TextView) viewGroupM.findViewById(R.id.cbr_doc_bounds_confidence);
        }
        return null;
    }

    private final CBRDocBoundsCheckResultView R() {
        return (CBRDocBoundsCheckResultView) this.docDetectionResultView.a(this, f432345e0[13]);
    }

    private final ImageView S() {
        ViewGroup viewGroup = this.frameHintContainer;
        if (viewGroup != null) {
            return (ImageView) viewGroup.findViewById(R.id.cbr_icon);
        }
        return null;
    }

    private final TextView T() {
        ViewGroup viewGroup = this.frameHintContainer;
        if (viewGroup != null) {
            return (TextView) viewGroup.findViewById(R.id.cbr_text);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CBRFrameViewWithBackground U() {
        return (CBRFrameViewWithBackground) this.frameWithBackground.a(this, f432345e0[14]);
    }

    private final TextView V() {
        ViewGroup viewGroupM = M();
        if (viewGroupM != null) {
            return (TextView) viewGroupM.findViewById(R.id.cbr_good_photo_confidence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View X() {
        return this.photoFrameContainerView.a(this, f432345e0[17]);
    }

    private final void Z() {
        ViewGroup viewGroupM = M();
        if (viewGroupM != null) {
            viewGroupM.setVisibility(8);
        }
        ViewGroup viewGroupL = L();
        if (viewGroupL != null) {
            viewGroupL.setVisibility(8);
        }
        TextView textViewQ = Q();
        if (textViewQ != null) {
            s.a(textViewQ, (CharSequence) null);
        }
        TextView textViewV = V();
        if (textViewV != null) {
            s.a(textViewV, (CharSequence) null);
        }
    }

    private final void a0() {
        CBRDocBoundsCheckResultView cBRDocBoundsCheckResultViewR = R();
        if (cBRDocBoundsCheckResultViewR == null) {
            return;
        }
        cBRDocBoundsCheckResultViewR.setDocRect(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        RectF frameRect;
        Drawable background;
        CBRFrameViewWithBackground cBRFrameViewWithBackgroundU = U();
        if (cBRFrameViewWithBackgroundU == null || (frameRect = cBRFrameViewWithBackgroundU.getFrameRect()) == null) {
            return;
        }
        ViewGroup viewGroup = this.frameHintContainer;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(R.drawable.cbr_round_rect_background);
        }
        ViewGroup viewGroup2 = this.frameHintContainer;
        if (viewGroup2 != null && (background = viewGroup2.getBackground()) != null) {
            w.a(background, cBRFrameViewWithBackgroundU.getFrameBackgroundColor());
        }
        ViewGroup viewGroup3 = this.frameHintContainer;
        if (viewGroup3 != null) {
            viewGroup3.setLeft((int) frameRect.left);
        }
        ViewGroup viewGroup4 = this.frameHintContainer;
        if (viewGroup4 != null) {
            viewGroup4.setTop((int) frameRect.top);
        }
        ViewGroup viewGroup5 = this.frameHintContainer;
        if (viewGroup5 != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup5.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = (int) frameRect.width();
            layoutParams.height = (int) frameRect.height();
            viewGroup5.setLayoutParams(layoutParams);
        }
    }

    @Override // ru.cyberity.cbr.camera.a
    @Y61.l
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public ViewGroup i() {
        return (ViewGroup) this.helperView.a(this, f432345e0[9]);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @Y61.k
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public CBRPhotoDocumentPickerViewModel getViewModel() {
        return (CBRPhotoDocumentPickerViewModel) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @Y61.k
    public String getIdDocSetType() {
        return getViewModel().getType().getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_document_picker;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @Y61.k
    public Screen getScreen() {
        return this.screen;
    }

    @Override // ru.cyberity.cbr.camera.a, ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleEvent(@Y61.k CBRViewModel.CBRViewModelEvent event) {
        super.handleEvent(event);
        if (event instanceof CBRPhotoDocumentPickerViewModel.f) {
            CBRPhotoDocumentPickerViewModel.f fVar = (CBRPhotoDocumentPickerViewModel.f) event;
            float width = fVar.getPhotoSize().getWidth() / fVar.getSampleSize().getWidth();
            float height = fVar.getPhotoSize().getHeight() / fVar.getSampleSize().getHeight();
            a(fVar);
            if (fVar.getDrawDetectedFrame()) {
                a(width, height, fVar.getResult(), fVar.getSaveScreen());
                return;
            }
            return;
        }
        if (event instanceof CBRPhotoDocumentPickerViewModel.d) {
            Z();
            a0();
        } else if (event instanceof CBRPhotoDocumentPickerViewModel.g) {
            a((CBRPhotoDocumentPickerViewModel.g) event);
        } else if (event instanceof CBRPhotoDocumentPickerViewModel.e) {
            a(e.f432388a);
        }
    }

    @Override // ru.cyberity.cbr.camera.a
    @Y61.l
    public View n() {
        return this.progressBar.a(this, f432345e0[4]);
    }

    @Y61.l
    public View o() {
        return this.rootView.a(this, f432345e0[0]);
    }

    @Override // ru.cyberity.cbr.camera.a, ru.cyberity.cbr.core.presentation.BaseFragment
    public boolean onFinishCalled(@Y61.k a0 finishReason) {
        boolean zOnFinishCalled = super.onFinishCalled(finishReason);
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "finishing photo screen: " + finishReason, null, 4, null);
        return zOnFinishCalled;
    }

    @Override // ru.cyberity.cbr.camera.b, ru.cyberity.cbr.camera.a, ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@Y61.k View view, @Y61.l Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View viewX = X();
        if (viewX != null) {
            viewX.setVisibility(4);
        }
        j0.b(getViewModel().q(), this, new h(null));
        CBRSegmentedToggleView cBRSegmentedToggleViewH = H();
        if (cBRSegmentedToggleViewH != null) {
            s.a(cBRSegmentedToggleViewH, !D().getEnabled());
        }
        CBRSegmentedToggleView cBRSegmentedToggleViewH2 = H();
        if (cBRSegmentedToggleViewH2 != null) {
            cBRSegmentedToggleViewH2.setOnItemSelected(new i());
        }
        View viewFindViewById = requireView().findViewById(R.id.cbr_save_frame);
        viewFindViewById.setVisibility(8);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC39879j1(this, 20));
    }

    @Override // ru.cyberity.cbr.camera.a
    /* renamed from: p, reason: from getter */
    public boolean getShouldShowFlash() {
        return this.shouldShowFlash;
    }

    @Override // ru.cyberity.cbr.camera.a
    @Y61.l
    public View q() {
        return this.takePictureView.a(this, f432345e0[1]);
    }

    @Override // ru.cyberity.cbr.camera.a
    @Y61.l
    public CBRToolbarView r() {
        return (CBRToolbarView) this.toolbar.a(this, f432345e0[3]);
    }

    @Override // ru.cyberity.cbr.camera.a
    /* renamed from: t, reason: from getter */
    public boolean getIsFrontFacingCamera() {
        return this.isFrontFacingCamera;
    }

    @Override // ru.cyberity.cbr.camera.a
    public void u() {
        getViewModel().b(requireContext());
    }

    @Override // ru.cyberity.cbr.camera.b
    @Y61.l
    public View z() {
        return this.takeGalleryView.a(this, f432345e0[2]);
    }

    private final void d(CBRPhotoDocumentPickerViewModel.b state) {
        CBRFrameViewWithBackground.State stateB;
        CBRPhotoDocumentPickerViewModel.AutoCaptureHint.State stateD;
        ViewGroup viewGroupE;
        CBRPhotoDocumentPickerViewModel.b.a aVarG;
        String string;
        String string2;
        CBRPhotoDocumentPickerViewModel.b.a aVarG2 = state.getSwitch();
        Boolean boolE = aVarG2.getAuto();
        Boolean bool = Boolean.TRUE;
        int i12 = !L.f(boolE, bool) ? 1 : 0;
        CBRSegmentedToggleView cBRSegmentedToggleViewH = H();
        if (cBRSegmentedToggleViewH != null) {
            CharSequence charSequenceF = aVarG2.getAutoText();
            String str = "";
            if (charSequenceF == null || (string = charSequenceF.toString()) == null) {
                string = "";
            }
            CharSequence charSequenceG = aVarG2.getManualText();
            if (charSequenceG != null && (string2 = charSequenceG.toString()) != null) {
                str = string2;
            }
            cBRSegmentedToggleViewH.setItems(C42745f0.U(string, str), i12);
        }
        CBRPhotoDocumentPickerViewModel.b bVar = this.currentCaptureState;
        Boolean boolE2 = (bVar == null || (aVarG = bVar.getSwitch()) == null) ? null : aVarG.getAuto();
        if (L.f(aVarG2.getVisible(), bool) && !L.f(aVarG2.getAuto(), boolE2)) {
            a(L.f(aVarG2.getAuto(), bool), G());
            a(L.f(aVarG2.getAuto(), bool), r());
        }
        ViewGroup viewGroupG = G();
        if (viewGroupG != null) {
            viewGroupG.setVisibility(L.f(aVarG2.getVisible(), bool) ? 0 : 8);
        }
        ViewGroup viewGroupE2 = E();
        if (viewGroupE2 != null) {
            viewGroupE2.setVisibility(!L.f(aVarG2.getAuto(), bool) ? 4 : 0);
        }
        if (L.f(boolE2, bool) && L.f(aVarG2.getAuto(), Boolean.FALSE)) {
            a(false, X(), (Y41.a<G0>) new f());
        }
        if (L.f(aVarG2.getAuto(), bool) && (viewGroupE = E()) != null) {
            viewGroupE.post(new RunnableC44167a(this, 6));
        }
        CBRFrameViewWithBackground cBRFrameViewWithBackgroundU = U();
        if (cBRFrameViewWithBackgroundU == null) {
            return;
        }
        CBRPhotoDocumentPickerViewModel.AutoCaptureHint autoCaptureHintE = state.getAutoCaptureHint();
        if (autoCaptureHintE == null || (stateD = autoCaptureHintE.getCom.avito.android.remote.model.messenger.voice.VoiceInfo.STATE java.lang.String()) == null || (stateB = ru.cyberity.cbr.camera.photo.presentation.document.c.b(stateD)) == null) {
            stateB = CBRFrameViewWithBackground.State.RED;
        }
        cBRFrameViewWithBackgroundU.setState(stateB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(b bVar) throws Resources.NotFoundException {
        a(bVar, false, 1, (Object) null);
    }

    @Override // ru.cyberity.cbr.camera.a
    @Y61.k
    /* renamed from: b */
    public CameraX.Mode getCameraMode() {
        return getViewModel().o();
    }

    @Override // ru.cyberity.cbr.camera.a
    @Y61.l
    public View c() {
        return this.darkOverlay.a(this, f432345e0[10]);
    }

    @Override // ru.cyberity.cbr.camera.a
    @Y61.l
    public TextView e() {
        return (TextView) this.helperBrief.a(this, f432345e0[6]);
    }

    @Override // ru.cyberity.cbr.camera.a
    @Y61.l
    public TextView f() {
        return (TextView) this.helperDetails.a(this, f432345e0[7]);
    }

    @Override // ru.cyberity.cbr.camera.a
    @Y61.l
    public TextView h() {
        return (TextView) this.helperTitle.a(this, f432345e0[5]);
    }

    @Override // ru.cyberity.cbr.camera.a
    @Y61.k
    public Map<String, Object> k() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(super.k());
        Boolean boolH = getViewModel().q().getValue().getSwitch().getVisible();
        if (boolH != null) {
            linkedHashMap.put("isAutocaptureEnabled", boolH);
        }
        Boolean boolE = getViewModel().q().getValue().getSwitch().getAuto();
        if (boolE != null) {
            linkedHashMap.put("isAutocaptureActive", boolE);
        }
        return linkedHashMap;
    }

    @Override // ru.cyberity.cbr.camera.a
    @Y61.l
    public PreviewView m() {
        return (PreviewView) this.previewView.a(this, f432345e0[11]);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void c(CBRPhotoDocumentPickerViewModel.b state) {
        ViewGroup viewGroup;
        String strC;
        ImageView imageViewS;
        if (this.isAnimatingPopup) {
            return;
        }
        ViewGroup viewGroup2 = this.frameHintContainer;
        if (L.f(state.getSwitch().getAuto(), Boolean.TRUE)) {
            viewGroup = (ViewGroup) requireView().findViewById(R.id.cbr_frame_popup_hint_container);
        } else {
            viewGroup = (ViewGroup) requireView().findViewById(R.id.cbr_popup_hint_container_background);
        }
        this.frameHintContainer = viewGroup;
        if (!L.f(viewGroup2, viewGroup) && viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        if (this.frameHintContainer == null) {
            return;
        }
        TextView textViewT = T();
        if (textViewT != null) {
            CBRPhotoDocumentPickerViewModel.c cVarF = state.getFrameHint();
            s.a(textViewT, cVarF != null ? cVarF.getText() : null);
        }
        TextView textViewT2 = T();
        if (textViewT2 != null) {
            textViewT2.setTextColor(I());
        }
        CBRPhotoDocumentPickerViewModel.c cVarF2 = state.getFrameHint();
        if (cVarF2 != null && (strC = cVarF2.getIcon()) != null && (imageViewS = S()) != null) {
            imageViewS.setImageDrawable(ThemeHelper.INSTANCE.resolveIcon(requireContext(), strC));
        }
        ImageView imageViewS2 = S();
        if (imageViewS2 != null) {
            imageViewS2.setImageTintList(ColorStateList.valueOf(I()));
        }
        ViewGroup viewGroup3 = this.frameHintContainer;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(state.getFrameHint() != null ? 0 : 8);
        }
        ViewGroup viewGroup4 = this.frameHintContainer;
        if (viewGroup4 != null && viewGroup4.getVisibility() == 0) {
            ViewGroup viewGroup5 = this.frameHintContainer;
            if (viewGroup5 != null) {
                viewGroup5.setOnTouchListener(new Ha1.a(6));
                return;
            }
            return;
        }
        ViewGroup viewGroup6 = this.frameHintContainer;
        if (viewGroup6 != null) {
            viewGroup6.setOnTouchListener(null);
        }
    }

    private final void e(CBRPhotoDocumentPickerViewModel.b state) {
        CBRPhotoDocumentPickerViewModel.b bVar;
        CBRPhotoDocumentPickerViewModel.h hVarH;
        File fileC;
        CBRPhotoDocumentPickerViewModel.h hVarH2;
        CBRPhotoDocumentPickerViewModel.h hVarH3 = state.getVideoCapture();
        if (hVarH3 != null && (fileC = hVarH3.getFile()) != null) {
            CBRPhotoDocumentPickerViewModel.b bVar2 = this.currentCaptureState;
            if (((bVar2 == null || (hVarH2 = bVar2.getVideoCapture()) == null) ? null : hVarH2.getFile()) != null || !state.getVideoCapture().getStarted()) {
                fileC = null;
            }
            if (fileC != null) {
                c(fileC);
            }
        }
        CBRPhotoDocumentPickerViewModel.h hVarH4 = state.getVideoCapture();
        if (hVarH4 == null || hVarH4.getStarted() || (bVar = this.currentCaptureState) == null || (hVarH = bVar.getVideoCapture()) == null || !hVarH.getStarted()) {
            return;
        }
        w();
    }

    @Override // ru.cyberity.cbr.camera.a
    public void b(@Y61.k File file) {
        getViewModel().c(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(CBRPhotoDocumentPickerViewModel.b state) {
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "handleDocumentCaptureState: " + state, null, 4, null);
        e(state);
        d(state);
        a(state);
        c(state);
        this.currentCaptureState = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(b bVar, View view) {
        bVar.getViewModel().b(true);
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "saving the screen", null, 4, null);
    }

    @Override // ru.cyberity.cbr.camera.a
    public void a(@Y61.k File file) {
        getViewModel().b(file);
    }

    @Override // ru.cyberity.cbr.camera.a
    @Y61.l
    public Object a(@Y61.k InterfaceC20120j0 interfaceC20120j0, @Y61.k ru.cyberity.cbr.core.domain.camera.b bVar, @Y61.k Continuation<? super G0> continuation) {
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        Object objG = C43259k.g(K.f411877a, new g(interfaceC20120j0, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    private final int b(int frameContainerHeight) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.cbr_autocapture_hint_min_height);
        int dimensionPixelSize2 = (getResources().getDimensionPixelSize(R.dimen.cbr_margin_medium) * 2) + getResources().getDimensionPixelSize(R.dimen.cbr_autocapture_switch_min_height);
        BottomSheetBehavior<View> bottomSheetBehaviorJ = j();
        int iE2 = bottomSheetBehaviorJ != null ? bottomSheetBehaviorJ.E() : 0;
        ViewGroup viewGroupK = K();
        int height = viewGroupK != null ? viewGroupK.getHeight() : 0;
        CBRToolbarView cBRToolbarViewR = r();
        int height2 = ((height - (cBRToolbarViewR != null ? cBRToolbarViewR.getHeight() : 0)) - frameContainerHeight) - iE2;
        int i12 = dimensionPixelSize + dimensionPixelSize2;
        if ((height2 < 0 ? 0 : height2) < i12) {
            return i12 - height2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(View view, MotionEvent motionEvent) {
        view.performClick();
        return true;
    }

    private final void a(CBRPhotoDocumentPickerViewModel.b state) {
        TextView textViewF;
        CBRPhotoDocumentPickerViewModel.b.a aVarG;
        CBRPhotoDocumentPickerViewModel.b bVar = this.currentCaptureState;
        Boolean boolE = (bVar == null || (aVarG = bVar.getSwitch()) == null) ? null : aVarG.getAuto();
        boolean z12 = state.getAutoCaptureHint() == null || !L.f(state.getSwitch().getAuto(), Boolean.TRUE);
        boolean z13 = !z12;
        if (L.f(state.getSwitch().getAuto(), boolE)) {
            if (z12 || (textViewF = F()) == null) {
                return;
            }
            CBRPhotoDocumentPickerViewModel.AutoCaptureHint autoCaptureHintE = state.getAutoCaptureHint();
            s.a(textViewF, autoCaptureHintE != null ? autoCaptureHintE.getHint() : null);
            return;
        }
        ViewGroup viewGroupE = E();
        if (viewGroupE != null) {
            viewGroupE.setVisibility(z12 ? 8 : 0);
        }
        a(z13, E());
        a(z13, E(), new d(z13, this, state));
    }

    /* compiled from: CBRPhotoDocumentPickerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 7, 1})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f432388a = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }

        public final void a() {
        }
    }

    @Override // ru.cyberity.cbr.camera.a
    public void a(int peekHeight) throws Resources.NotFoundException {
        if (L.f(getViewModel().q().getValue().getSwitch().getAuto(), Boolean.TRUE)) {
            a(true);
        }
    }

    public static /* synthetic */ void a(b bVar, boolean z12, int i12, Object obj) throws Resources.NotFoundException {
        if ((i12 & 1) != 0) {
            z12 = false;
        }
        bVar.a(z12);
    }

    private final void a(boolean force) throws Resources.NotFoundException {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        View viewX = X();
        if (viewX == null || viewX.getVisibility() != 0 || force) {
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", com.avito.android.bxcontent.mvi.entity.f.l("showPhotoFrame: ", force), null, 4, null);
            View viewX2 = X();
            if (viewX2 == null || viewX2.getLayoutParams() == null) {
                return;
            }
            View viewX3 = X();
            float width = viewX3 != null ? viewX3.getWidth() : 0;
            float fApplyDimension = TypedValue.applyDimension(5, 90.0f, requireContext().getResources().getDisplayMetrics());
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.cbr_margin_small);
            float fC2 = (int) kotlin.ranges.s.c(width - (getResources().getDimensionPixelSize(R.dimen.cbr_margin_medium) * 2), fApplyDimension);
            int iR2 = (int) (fC2 / D().getFrameAspectRatio());
            int i12 = (dimensionPixelSize * 2) + iR2;
            int iB2 = b(i12);
            if (iB2 != 0) {
                iR2 -= iB2;
                i12 -= iB2;
                CBRSegmentedToggleView cBRSegmentedToggleViewH = H();
                if (cBRSegmentedToggleViewH != null && (layoutParams3 = cBRSegmentedToggleViewH.getLayoutParams()) != null && (layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = 0;
                }
            }
            CBRFrameViewWithBackground cBRFrameViewWithBackgroundU = U();
            if (cBRFrameViewWithBackgroundU != null && (layoutParams2 = cBRFrameViewWithBackgroundU.getLayoutParams()) != null) {
                layoutParams2.width = (int) width;
                layoutParams2.height = i12;
                CBRFrameViewWithBackground cBRFrameViewWithBackgroundU2 = U();
                if (cBRFrameViewWithBackgroundU2 != null) {
                    cBRFrameViewWithBackgroundU2.setLayoutParams(layoutParams2);
                }
            }
            SizeF sizeF = new SizeF(fC2, iR2);
            View viewX4 = X();
            boolean z12 = (viewX4 == null || viewX4.getVisibility() == 0) ? false : true;
            CBRFrameViewWithBackground cBRFrameViewWithBackgroundU3 = U();
            if (cBRFrameViewWithBackgroundU3 != null) {
                P.b(cBRFrameViewWithBackgroundU3, new j(cBRFrameViewWithBackgroundU3, this, sizeF, z12));
            }
            CBRFrameViewWithBackground cBRFrameViewWithBackgroundU4 = U();
            if (cBRFrameViewWithBackgroundU4 != null) {
                cBRFrameViewWithBackgroundU4.setFrameSize(sizeF);
            }
            CBRFrameViewWithBackground cBRFrameViewWithBackgroundU5 = U();
            if (cBRFrameViewWithBackgroundU5 != null) {
                cBRFrameViewWithBackgroundU5.b();
            }
            C();
            CBRFrameViewWithBackground cBRFrameViewWithBackgroundU6 = U();
            if (cBRFrameViewWithBackgroundU6 != null) {
                cBRFrameViewWithBackgroundU6.setState(CBRFrameViewWithBackground.State.RED);
            }
            ViewGroup viewGroupE = E();
            if (viewGroupE != null) {
                ViewGroup viewGroupE2 = E();
                if (viewGroupE2 == null || (layoutParams = viewGroupE2.getLayoutParams()) == null) {
                    layoutParams = null;
                } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    BottomSheetBehavior<View> bottomSheetBehaviorJ = j();
                    marginLayoutParams.bottomMargin = bottomSheetBehaviorJ != null ? bottomSheetBehaviorJ.E() : 0;
                    ViewGroup viewGroupE3 = E();
                    if (viewGroupE3 != null) {
                        viewGroupE3.setLayoutParams(layoutParams);
                    }
                }
                viewGroupE.setLayoutParams(layoutParams);
            }
            View viewX5 = X();
            if (viewX5 == null) {
                return;
            }
            viewX5.setVisibility(D().getEnabled() ? 0 : 8);
        }
    }

    private final void a(boolean appear, View view) {
        int color = androidx.core.content.d.getColor(requireContext(), R.color.auto_capture_frame_background);
        CBRFrameViewWithBackground cBRFrameViewWithBackgroundU = U();
        if (cBRFrameViewWithBackgroundU != null) {
            color = cBRFrameViewWithBackgroundU.getFrameBackgroundColor();
        }
        int i12 = 0;
        if (!appear) {
            i12 = color;
            color = 0;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C43709d(), Integer.valueOf(i12), Integer.valueOf(color));
        valueAnimatorOfObject.setDuration(d());
        valueAnimatorOfObject.addUpdateListener(new QU.a(view, 6));
        valueAnimatorOfObject.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(View view, ValueAnimator valueAnimator) {
        if (view != null) {
            view.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap a(int width, int height) {
        Bitmap bitmap = this.frameBitmap;
        if (bitmap != null && bitmap.getWidth() == width && bitmap.getHeight() == height && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap bitmap2 = this.frameBitmap;
        if (bitmap2 != null) {
            if (!bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            this.frameBitmap = null;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "prepared frame bitmap " + bitmapCreateBitmap.getWidth() + 'x' + bitmapCreateBitmap.getHeight(), null, 4, null);
        Bitmap bitmapCopy = bitmapCreateBitmap.copy(config, true);
        if (bitmapCreateBitmap != bitmapCopy) {
            bitmapCreateBitmap.recycle();
        }
        this.frameBitmap = bitmapCopy;
        return bitmapCopy;
    }

    private final void a(CBRPhotoDocumentPickerViewModel.g event) {
        ViewGroup viewGroupM = M();
        if (viewGroupM != null) {
            viewGroupM.setVisibility(this.showDebugInfo ? 0 : 8);
        }
        if (this.showDebugInfo) {
            String strF = G.f("Good doc conf: ", J().format(Float.valueOf(event.getConfidence())));
            TextView textViewV = V();
            if (textViewV != null) {
                s.a(textViewV, strF);
            }
            TextView textViewO = O();
            if (textViewO != null) {
                s.a(textViewO, "badphotos time " + a(event.getTimeMs()));
            }
        }
    }

    private final void a(CBRPhotoDocumentPickerViewModel.f event) {
        ViewGroup viewGroupL = L();
        if (viewGroupL != null) {
            viewGroupL.setVisibility(this.showDebugInfo ? 0 : 8);
        }
        if (this.showDebugInfo) {
            String strF = G.f("Doc bounds conf: ", J().format(Float.valueOf(event.getResult().getConfidence())));
            TextView textViewQ = Q();
            if (textViewQ != null) {
                s.a(textViewQ, strF);
            }
            ViewGroup viewGroupM = M();
            if (viewGroupM != null) {
                viewGroupM.setVisibility(this.showDebugInfo ? 0 : 8);
            }
            TextView textViewN = N();
            if (textViewN != null) {
                s.a(textViewN, "auto cap time " + a(event.getResult().getInferenceTimeMs()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(long j12) {
        return j12 + " ms";
    }

    private final void a(float scaleX, float scaleY, ru.cyberity.ml.docdetector.a detectionResult, boolean save) {
        Rect rectA = ru.cyberity.cbr.camera.photo.presentation.document.f.a(detectionResult.m(), scaleX, scaleY);
        if (save) {
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "showDocumentFrameAndCheckPhotoFrame: " + rectA, null, 4, null);
        }
        RectF rectF = new RectF(rectA);
        this.photoToPreviewTransform.mapRect(rectF);
        if (save) {
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "showDocumentFrameAndCheckPhotoFrame: view rect=" + rectF, null, 4, null);
        }
        CBRDocBoundsCheckResultView cBRDocBoundsCheckResultViewR = R();
        if (cBRDocBoundsCheckResultViewR == null) {
            return;
        }
        cBRDocBoundsCheckResultViewR.setDocRectF(rectF);
    }
}

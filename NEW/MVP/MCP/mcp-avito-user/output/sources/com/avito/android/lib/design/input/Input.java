package com.avito.android.lib.design.input;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.input.ComponentType;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.lib.util.x;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import j.e0;
import j.f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import pK0.InterfaceC46971a;

/* compiled from: Input.kt */
@s0
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0006º\u0001»\u0001¼\u0001J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001d\u0010\f\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001c\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0011¢\u0006\u0004\b+\u0010\u0014J\u0015\u0010,\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0011¢\u0006\u0004\b,\u0010\u0014J\r\u0010-\u001a\u00020\u0011¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0011¢\u0006\u0004\b/\u0010.J\r\u00100\u001a\u00020\u0011¢\u0006\u0004\b0\u0010.J\r\u00101\u001a\u00020\u0011¢\u0006\u0004\b1\u0010.J\r\u00102\u001a\u00020\u0011¢\u0006\u0004\b2\u0010.J\u0015\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0011¢\u0006\u0004\b4\u0010\u0014J\u0015\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u00020#¢\u0006\u0004\b6\u0010&J\u0015\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u00020#¢\u0006\u0004\b8\u0010&J\u0015\u0010:\u001a\u00020\u00052\u0006\u00109\u001a\u00020#¢\u0006\u0004\b:\u0010&J\u0015\u0010;\u001a\u00020\u00052\u0006\u00109\u001a\u00020#¢\u0006\u0004\b;\u0010&J\r\u0010<\u001a\u00020#¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\u00052\u0006\u0010>\u001a\u00020#¢\u0006\u0004\b?\u0010&J\u0015\u0010A\u001a\u00020\u00052\u0006\u0010@\u001a\u00020#¢\u0006\u0004\bA\u0010&J\u0015\u0010C\u001a\u00020\u00052\u0006\u0010B\u001a\u00020#¢\u0006\u0004\bC\u0010&J\u0015\u0010E\u001a\u00020\u00052\u0006\u0010D\u001a\u00020#¢\u0006\u0004\bE\u0010&J\u0019\u0010G\u001a\u00020\u00052\b\b\u0001\u0010F\u001a\u00020\u0011H\u0007¢\u0006\u0004\bG\u0010\u0014J\u0017\u0010G\u001a\u00020\u00052\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bG\u0010JJ\u0017\u0010L\u001a\u00020\u00052\b\u0010K\u001a\u0004\u0018\u00010'¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u0004\u0018\u00010H¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u00052\b\b\u0001\u0010F\u001a\u00020\u0011¢\u0006\u0004\bP\u0010\u0014J\u0017\u0010P\u001a\u00020\u00052\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bP\u0010JJ\u0015\u0010R\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020#¢\u0006\u0004\bR\u0010&J\u0017\u0010S\u001a\u00020\u00052\b\u0010K\u001a\u0004\u0018\u00010'¢\u0006\u0004\bS\u0010MJ\u000f\u0010T\u001a\u0004\u0018\u00010H¢\u0006\u0004\bT\u0010OJ\u0017\u0010U\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\bU\u0010\u0014J\u0017\u0010U\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bU\u0010\u001eJ\u0017\u0010V\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\bV\u0010\u0014J\u0017\u0010V\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bV\u0010\u001eJ\u0019\u0010X\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010WH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010Z¢\u0006\u0004\b[\u0010\\J\u0015\u0010_\u001a\u00020\u00052\u0006\u0010^\u001a\u00020]¢\u0006\u0004\b_\u0010`J\u0015\u0010c\u001a\u00020\u00052\u0006\u0010b\u001a\u00020a¢\u0006\u0004\bc\u0010dJ\u0015\u0010f\u001a\u00020\u00052\u0006\u0010e\u001a\u00020\u0011¢\u0006\u0004\bf\u0010\u0014J\r\u0010g\u001a\u00020\u0011¢\u0006\u0004\bg\u0010.J\u0015\u0010i\u001a\u00020\u00052\u0006\u0010h\u001a\u00020\u0011¢\u0006\u0004\bi\u0010\u0014J\u001b\u0010m\u001a\u00020\u00052\f\u0010l\u001a\b\u0012\u0004\u0012\u00020k0j¢\u0006\u0004\bm\u0010nJ\u0013\u0010o\u001a\b\u0012\u0004\u0012\u00020k0j¢\u0006\u0004\bo\u0010pJ\u0015\u0010s\u001a\u00020\u00052\u0006\u0010r\u001a\u00020q¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bu\u0010\u0007J\u0017\u0010v\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bv\u0010\u0007J\u0017\u0010w\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bw\u0010\u001eJ\u0015\u0010x\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\bx\u0010\u0014J\u0015\u0010z\u001a\u00020\u00052\u0006\u0010y\u001a\u00020\u0011¢\u0006\u0004\bz\u0010\u0014J\u0017\u0010|\u001a\u00020\u00052\b\b\u0001\u0010{\u001a\u00020\u0011¢\u0006\u0004\b|\u0010\u0014J\u0017\u0010|\u001a\u00020\u00052\b\u0010{\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b|\u0010}J\u0017\u0010~\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b~\u0010\u001eJ\u0015\u0010~\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b~\u0010\u0014J\u0019\u0010\u0080\u0001\u001a\u00020\u00052\b\u0010\u007f\u001a\u0004\u0018\u00010H¢\u0006\u0005\b\u0080\u0001\u0010JJ\u0017\u0010\u0081\u0001\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0005\b\u0081\u0001\u0010\u0014J\u001a\u0010\u0084\u0001\u001a\u00020\u00052\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001a\u0010\u0088\u0001\u001a\u00020\u00052\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001a\u0010\u008b\u0001\u001a\u00020\u00052\u0007\u0010\u008a\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0005\b\u008b\u0001\u0010\u0014J\u001a\u0010\u008d\u0001\u001a\u00020\u00052\u0007\u0010\u008c\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0005\b\u008d\u0001\u0010\u0014J\u001b\u0010\u008e\u0001\u001a\u00020\u00052\b\b\u0001\u0010 \u001a\u00020\u0011H\u0007¢\u0006\u0005\b\u008e\u0001\u0010\u0014J\u0019\u0010\u008f\u0001\u001a\u00020\u00052\b\b\u0001\u0010 \u001a\u00020\u0011¢\u0006\u0005\b\u008f\u0001\u0010\u0014J\u0019\u0010\u0091\u0001\u001a\u00020\u00052\u0007\u0010 \u001a\u00030\u0090\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0019\u0010\u0093\u0001\u001a\u00020\u00052\u0006\u00109\u001a\u00020'H\u0007¢\u0006\u0005\b\u0093\u0001\u0010MJ\u0019\u0010\u0094\u0001\u001a\u00020\u00052\u0006\u00109\u001a\u00020'H\u0007¢\u0006\u0005\b\u0094\u0001\u0010MJ\u0019\u0010\u0095\u0001\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u0011¢\u0006\u0005\b\u0095\u0001\u0010\u0014J\u0019\u0010\u0096\u0001\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u0011¢\u0006\u0005\b\u0096\u0001\u0010\u0014J\u001a\u0010\u0099\u0001\u001a\u00020\u00052\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001b\u0010\u009b\u0001\u001a\u00020\u00052\b\b\u0001\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0005\b\u009b\u0001\u0010\u0014J\u001b\u0010\u009c\u0001\u001a\u00020\u00052\b\b\u0001\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0005\b\u009c\u0001\u0010\u0014J\u001a\u0010\u009e\u0001\u001a\u00020\u00052\u0007\u0010\u009d\u0001\u001a\u00020#H\u0016¢\u0006\u0005\b\u009e\u0001\u0010&J\u001a\u0010 \u0001\u001a\u00020\u00052\u0007\u0010\u009f\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b \u0001\u0010\u0014J\u001a\u0010¢\u0001\u001a\u00020\u00052\u0007\u0010¡\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b¢\u0001\u0010\u0014Jk\u0010©\u0001\u001a\u00020\u00052Y\u0010\b\u001aU\u0012\u0018\u0012\u0016\u0018\u00010\u0018¢\u0006\u000f\b¤\u0001\u0012\n\b¥\u0001\u0012\u0005\b\b(¦\u0001\u0012\u0016\u0012\u00140\u0011¢\u0006\u000f\b¤\u0001\u0012\n\b¥\u0001\u0012\u0005\b\b(§\u0001\u0012\u0016\u0012\u00140\u0011¢\u0006\u000f\b¤\u0001\u0012\n\b¥\u0001\u0012\u0005\b\b(¨\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010£\u0001¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0011\u0010«\u0001\u001a\u00030\u0082\u0001¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0018\u0010®\u0001\u001a\u00020\u00052\u0007\u0010\u00ad\u0001\u001a\u00020\u0011¢\u0006\u0005\b®\u0001\u0010\u0014J\u001c\u0010¯\u0001\u001a\u00020\u00052\t\u0010¦\u0001\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0005\b¯\u0001\u0010}J\u0019\u0010°\u0001\u001a\u00020\u00052\u0006\u00105\u001a\u00020#H\u0002¢\u0006\u0005\b°\u0001\u0010&J\u001a\u0010²\u0001\u001a\u00020\u00052\u0007\u0010±\u0001\u001a\u00020#H\u0002¢\u0006\u0005\b²\u0001\u0010&J\u001a\u0010³\u0001\u001a\u00020\u00052\u0007\u0010\u008a\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b³\u0001\u0010\u0014J\u001c\u0010´\u0001\u001a\u00020\u00052\t\b\u0002\u0010±\u0001\u001a\u00020#H\u0002¢\u0006\u0005\b´\u0001\u0010&J\u0019\u0010µ\u0001\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0011H\u0002¢\u0006\u0005\bµ\u0001\u0010\u0014R(\u0010¹\u0001\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00118\u0002@BX\u0082\u000e¢\u0006\u000f\n\u0006\b¶\u0001\u0010·\u0001\"\u0005\b¸\u0001\u0010\u0014R\u0015\u0010¦\u0001\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010)¨\u0006½\u0001"}, d2 = {"Lcom/avito/android/lib/design/input/Input;", "Landroid/widget/FrameLayout;", "LpK0/a;", "Landroid/view/View$OnClickListener;", "l", "Lkotlin/G0;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "listener", "setClearButtonClickListener", "setRightIconClickListener", "Lkotlin/Function0;", "setClearButtonListener", "(LY41/a;)V", "Landroid/widget/TextView$OnEditorActionListener;", "setOnEditorActionListener", "(Landroid/widget/TextView$OnEditorActionListener;)V", "", "textRes", "setText", "(I)V", "Landroid/text/Editable;", "getText", "()Landroid/text/Editable;", "", "getHint", "()Ljava/lang/CharSequence;", "color", "setTextColor", "Landroid/content/res/ColorStateList;", "(Landroid/content/res/ColorStateList;)V", "LPK0/n;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setTextStyle", "(LPK0/n;)V", "", "isVisible", "setCursorVisible", "(Z)V", "", "getDeformattedText", "()Ljava/lang/String;", "maxLength", "setFormattedMaxLength", "setMaxLength", "getMaxLength", "()I", "getInputPaddingRight", "getInputPaddingLeft", "getInputPaddingTop", "getInputPaddingBottom", "index", "setSelection", "clear", "setClearButtonForUdf", "withClearButton", "setClearButton", "value", "setClearButtonVisibleUnfocused", "setClearButtonIgnoresRightIcon", "getClearButton", "()Z", "isLoading", "setLoading", "focusByClearButton", "setFocusByClearButton", "componentContainerFocusedRectEnabled", "setComponentContainerFocusedRectEnabled", "selectionToEndOnFocus", "setSelectionToEndOnFocus", "iconRes", "setLeftIcon", "Landroid/graphics/drawable/Drawable;", "icon", "(Landroid/graphics/drawable/Drawable;)V", "tag", "setLeftIconTag", "(Ljava/lang/String;)V", "getLeftIcon", "()Landroid/graphics/drawable/Drawable;", "setRightIcon", "forceInvisible", "setRightContainerForceInvisible", "setRightIconTag", "getRightIcon", "setLeftIconColor", "setRightIconColor", "Landroid/view/View$OnFocusChangeListener;", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "Landroid/view/View$OnTouchListener;", "setTouchListener", "(Landroid/view/View$OnTouchListener;)V", "Lcom/avito/android/lib/design/input/ComponentType;", "componentType", "setComponentType", "(Lcom/avito/android/lib/design/input/ComponentType;)V", "Lcom/avito/android/lib/design/input/FormatterType;", "formatterTypeArg", "setFormatterType", "(Lcom/avito/android/lib/design/input/FormatterType;)V", "inputType", "setInputType", "getInputType", "options", "setImeOptions", "", "Landroid/text/InputFilter;", "filters", "setFilters", "([Landroid/text/InputFilter;)V", "getFilters", "()[Landroid/text/InputFilter;", "Landroid/text/method/TransformationMethod;", "method", "setTransformationMethod", "(Landroid/text/method/TransformationMethod;)V", "setLeftIconListener", "setRightIconListener", "setClearButtonTint", "setHighlightColor", "gravity", "setGravity", "hint", "setHint", "(Ljava/lang/CharSequence;)V", "setHintTextColor", "drawable", "setEditTextBackground", "setEditTextBackgroundColor", "", VoiceInfo.STATE, "setState", "([I)V", "Lcom/avito/android/lib/design/input/Input$SpinnerPosition;", "spinnerPosition", "setSpinnerPosition", "(Lcom/avito/android/lib/design/input/Input$SpinnerPosition;)V", "minHeight", "setMinimumHeight", "minWidth", "setMinimumWidth", "setClearButtonAppearance", "setSpinnerAppearance", "Lcom/avito/android/lib/design/spinner/a;", "setSpinnerStyle", "(Lcom/avito/android/lib/design/spinner/a;)V", "setPostfix", "setPrefix", "setPrefixColor", "setPostfixColor", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "setEllipsize", "(Landroid/text/TextUtils$TruncateAt;)V", "setAppearance", "setAppearanceAndContent", "enabled", "setEnabled", "offset", "setTextVerticalOffset", "size", "setIconBackgroundSize", "Lkotlin/Function3;", "Lkotlin/S;", "name", "text", "selStart", "selEnd", "setOnSelectionChangedListener", "(LY41/q;)V", "getCurrentState", "()[I", "horizontalOffset", "setMarginsToClearButton", "setTextWithFormattingIfNeeded", "setClearButtonVisible", "singleLine", "setInputTypeSingleLine", "setEditTextMinHeight", "setSingleLineProperty", "setMaxLengthInternal", "M", "I", "setCachedInputType", "cachedInputType", "c", "SavedState", "SpinnerPosition", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class Input extends FrameLayout implements InterfaceC46971a {

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public static final c f179303W = new c(null);

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public static final int[] f179304a0 = new int[0];

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public static final int[] f179305b0 = {R.attr.state_error};

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public static final int[] f179306c0 = {R.attr.state_warning};

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public static final AvitoLayoutInflater.c f179307d0;

    /* renamed from: A, reason: collision with root package name */
    public int f179308A;

    /* renamed from: B, reason: collision with root package name */
    public int f179309B;

    /* renamed from: C, reason: collision with root package name */
    public int f179310C;

    /* renamed from: D, reason: collision with root package name */
    public int f179311D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public int[] f179312E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.input.b f179313F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public String f179314G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public String f179315H;

    /* renamed from: I, reason: collision with root package name */
    public int f179316I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f179317J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public FormatterType f179318K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f179319L;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    public int cachedInputType;

    /* renamed from: N, reason: collision with root package name */
    public int f179321N;

    /* renamed from: O, reason: collision with root package name */
    public int f179322O;

    /* renamed from: P, reason: collision with root package name */
    public int f179323P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public ColorStateList f179324Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public SpinnerPosition f179325R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f179326S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f179327T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f179328U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f179329V;

    /* renamed from: b, reason: collision with root package name */
    public int f179330b;

    /* renamed from: c, reason: collision with root package name */
    public int f179331c;

    /* renamed from: d, reason: collision with root package name */
    public int f179332d;

    /* renamed from: e, reason: collision with root package name */
    public int f179333e;

    /* renamed from: f, reason: collision with root package name */
    public int f179334f;

    /* renamed from: g, reason: collision with root package name */
    public int f179335g;

    /* renamed from: h, reason: collision with root package name */
    public int f179336h;

    /* renamed from: i, reason: collision with root package name */
    public int f179337i;

    /* renamed from: j, reason: collision with root package name */
    public int f179338j;

    /* renamed from: k, reason: collision with root package name */
    public int f179339k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InputField f179340l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ImageView f179341m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ImageView f179342n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f179343o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f179344p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Spinner f179345q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Spinner f179346r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final ImageView f179347s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public View.OnFocusChangeListener f179348t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f179349u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f179350v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f179351w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f179352x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f179353y;

    /* renamed from: z, reason: collision with root package name */
    public int f179354z;

    /* compiled from: Input.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/input/Input$SavedState;", "Landroid/view/AbsSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends AbsSavedState {

        @Y61.k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final int[] f179355b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Parcelable f179356c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Parcelable f179357d;

        /* compiled from: Input.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.createIntArray(), parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(@Y61.k int[] iArr, @Y61.k Parcelable parcelable, @Y61.k Parcelable parcelable2) {
            super(parcelable2);
            this.f179355b = iArr;
            this.f179356c = parcelable;
            this.f179357d = parcelable2;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeIntArray(this.f179355b);
            parcel.writeParcelable(this.f179356c, i12);
            parcel.writeParcelable(this.f179357d, i12);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Input.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/input/Input$SpinnerPosition;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SpinnerPosition {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f179358c;

        /* renamed from: d, reason: collision with root package name */
        public static final SpinnerPosition f179359d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ SpinnerPosition[] f179360e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f179361f;

        /* renamed from: b, reason: collision with root package name */
        public final int f179362b;

        /* compiled from: Input.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/input/Input$SpinnerPosition$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            SpinnerPosition spinnerPosition = new SpinnerPosition("LEFT", 0, -1);
            f179359d = spinnerPosition;
            SpinnerPosition[] spinnerPositionArr = {spinnerPosition, new SpinnerPosition("RIGHT", 1, 0)};
            f179360e = spinnerPositionArr;
            f179361f = kotlin.enums.c.a(spinnerPositionArr);
            f179358c = new a(null);
        }

        public SpinnerPosition(String str, int i12, int i13) {
            this.f179362b = i13;
        }

        public static SpinnerPosition valueOf(String str) {
            return (SpinnerPosition) Enum.valueOf(SpinnerPosition.class, str);
        }

        public static SpinnerPosition[] values() {
            return (SpinnerPosition[]) f179360e.clone();
        }
    }

    /* compiled from: Input.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            ColorStateList imageTintList;
            String str2 = str;
            Input input = Input.this;
            if (!input.f179326S) {
                input.post(new g(input, 1));
            }
            if (input.f179328U) {
                ImageView imageView = input.f179341m;
                ColorStateList imageTintList2 = imageView.getImageTintList();
                Integer numValueOf = imageTintList2 != null ? Integer.valueOf(imageTintList2.getDefaultColor()) : null;
                ColorStateList colorStateList = input.f179324Q;
                boolean zF2 = L.f(numValueOf, colorStateList != null ? Integer.valueOf(colorStateList.getDefaultColor()) : null);
                InputField inputField = input.f179340l;
                if (zF2 || ((imageTintList = imageView.getImageTintList()) != null && imageTintList.getDefaultColor() == inputField.getTextColors().getDefaultColor())) {
                    imageView.setImageTintList(str2.length() == 0 ? input.f179324Q : inputField.getTextColors());
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Input.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements Y41.p<Context, AttributeSet, Input> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f179364b = new b();

        public b() {
            super(2, Input.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V", 0);
        }

        @Override // Y41.p
        public final Input invoke(Context context, AttributeSet attributeSet) {
            return new Input(context, attributeSet, 0, 0, 12, null);
        }
    }

    /* compiled from: Input.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/input/Input$c;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: Input.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f179365a;

        static {
            int[] iArr = new int[SpinnerPosition.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f179365a = iArr;
            int[] iArr2 = new int[ComponentType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ComponentType.a aVar = ComponentType.f179282c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Input.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/res/TypedArray;", "Lkotlin/G0;", "invoke", "(Landroid/content/res/TypedArray;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<TypedArray, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(TypedArray typedArray) {
            TypedArray typedArray2 = typedArray;
            Input.this.o(typedArray2.getInt(11, Integer.MAX_VALUE), typedArray2.getInt(12, 1));
            return G0.f406611a;
        }
    }

    static {
        AvitoLayoutInflater.f181382a.getClass();
        f179307d0 = AvitoLayoutInflater.a(b.f179364b, AvitoLayoutInflater.f181384c);
    }

    @X41.j
    public Input(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static void e(Input input, int i12, int i13, int i14, int i15, int i16, int i17) {
        if ((i17 & 1) != 0) {
            i12 = input.f179354z;
        }
        if ((i17 & 2) != 0) {
            i13 = input.f179308A;
        }
        if ((i17 & 4) != 0) {
            i14 = input.f179309B;
        }
        if ((i17 & 8) != 0) {
            i15 = input.f179310C;
        }
        if ((i17 & 16) != 0) {
            i16 = input.f179311D;
        }
        input.f179354z = i12;
        input.f179309B = i14;
        input.f179308A = i13;
        input.f179310C = i15;
        input.f179340l.setPadding(i12, i13 - i16, i14, i15 + i16);
    }

    public static void g(TypedArray typedArray, int[] iArr, Y41.l lVar) {
        Integer numValueOf;
        int length = iArr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                numValueOf = null;
                break;
            }
            int i13 = iArr[i12];
            if (typedArray.hasValue(i13)) {
                numValueOf = Integer.valueOf(i13);
                break;
            }
            i12++;
        }
        if (numValueOf != null) {
            lVar.invoke(typedArray);
        }
    }

    private final String getText() {
        return String.valueOf(this.f179340l.getText());
    }

    public static void j(Input input, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i12 = input.f179330b;
        }
        int i15 = input.f179332d;
        if ((i14 & 4) != 0) {
            i13 = input.f179331c;
        }
        int i16 = input.f179333e;
        input.f179330b = i12;
        input.f179332d = i15;
        input.f179331c = i13;
        input.f179333e = i16;
        input.x();
    }

    public static /* synthetic */ void p(Input input, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        if ((i14 & 2) != 0) {
            i13 = 1;
        }
        input.o(i12, i13);
    }

    private final void setCachedInputType(int i12) {
        this.cachedInputType = i12;
        this.f179340l.setInputType(i12);
    }

    private final void setClearButtonVisible(boolean clear) {
        D6.G(this.f179347s, clear);
        D6.G(this.f179342n, !clear);
        z();
    }

    private final void setEditTextMinHeight(int minHeight) {
        InputField inputField = this.f179340l;
        inputField.setMinHeight(minHeight);
        inputField.setMinimumHeight(minHeight);
    }

    private final void setInputTypeSingleLine(boolean singleLine) {
        int i12 = this.cachedInputType;
        if ((i12 & 15) == 1) {
            setCachedInputType(singleLine ? (-131073) & i12 : 131072 | i12);
        }
    }

    private final void setMaxLengthInternal(int maxLength) {
        MaskParameters maskParameters;
        if (maxLength != Integer.MAX_VALUE && (maskParameters = this.f179318K.f179302d) != null) {
            int length = maskParameters.f179373d.length() + maskParameters.f179371b.length() + maxLength;
            int i12 = 0;
            String str = maskParameters.f179376g;
            if (maskParameters.f179377h) {
                int i13 = 0;
                for (int length2 = str.length() - 1; -1 < length2; length2--) {
                    if (str.charAt(length2) == '#') {
                        i13++;
                    } else {
                        i12++;
                    }
                    if (i13 >= maxLength) {
                        break;
                    }
                }
            } else {
                int length3 = str.length();
                int i14 = 0;
                int i15 = 0;
                while (i12 < length3) {
                    if (str.charAt(i12) == '#') {
                        i15++;
                    } else {
                        i14++;
                    }
                    if (i15 >= maxLength) {
                        break;
                    } else {
                        i12++;
                    }
                }
                i12 = i14;
            }
            maxLength = length + i12;
        }
        this.f179316I = maxLength;
        a(new InputFilter.LengthFilter(maxLength));
    }

    private final void setSingleLineProperty(boolean singleLine) {
        if (singleLine) {
            r();
        } else {
            p(this, 0, 0, 3);
        }
    }

    private final void setTextWithFormattingIfNeeded(CharSequence text) {
        MaskParameters maskParameters = this.f179318K.f179302d;
        String str = maskParameters != null ? maskParameters.f179371b : null;
        boolean z12 = true;
        boolean z13 = str == null || str.length() == 0;
        InputField inputField = this.f179340l;
        if (z13) {
            MaskParameters maskParameters2 = this.f179318K.f179302d;
            String str2 = maskParameters2 != null ? maskParameters2.f179373d : null;
            if (str2 != null && str2.length() != 0) {
                z12 = false;
            }
            if (z12) {
                inputField.setText(text);
                return;
            }
        }
        inputField.setText(com.avito.android.lib.design.input.c.d(this.f179318K, text, "", inputField.getSelectionEnd(), com.avito.android.lib.design.input.c.e(inputField), inputField.isFocused()).f179394a);
    }

    public static /* synthetic */ void t(Input input, CharSequence charSequence, boolean z12, int i12) {
        boolean z13 = (i12 & 2) == 0;
        if ((i12 & 4) != 0) {
            z12 = false;
        }
        input.s(charSequence, z13, z12);
    }

    public final void a(@Y61.k InputFilter inputFilter) {
        InputFilter[] filters = getFilters();
        ArrayList arrayList = new ArrayList();
        for (InputFilter inputFilter2 : filters) {
            if (!inputFilter2.getClass().equals(inputFilter.getClass())) {
                arrayList.add(inputFilter2);
            }
        }
        setFilters((InputFilter[]) C42745f0.i0(inputFilter, arrayList).toArray(new InputFilter[0]));
    }

    public final void b(@Y61.k TextWatcher textWatcher) {
        this.f179340l.addTextChangedListener(textWatcher);
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void c(TypedArray typedArray) throws Resources.NotFoundException {
        boolean zHasValue = typedArray.hasValue(39);
        ImageView imageView = this.f179341m;
        if (zHasValue) {
            imageView.setImageTintList(x.a(typedArray, getContext(), 39));
        }
        if (typedArray.hasValue(44)) {
            setRightIconColor(x.a(typedArray, getContext(), 44));
        }
        if (typedArray.hasValue(17)) {
            setCachedInputType(typedArray.getInt(17, 0));
        }
        boolean zHasValue2 = typedArray.hasValue(0);
        InputField inputField = this.f179340l;
        if (zHasValue2) {
            int resourceId = typedArray.getResourceId(0, 0);
            this.f179323P = resourceId;
            inputField.setTextAppearance(resourceId);
        }
        if (typedArray.hasValue(1)) {
            inputField.setTextColor(x.a(typedArray, getContext(), 1));
        }
        if (typedArray.hasValue(2)) {
            setHintTextColor(x.a(typedArray, getContext(), 2));
        }
        this.f179321N = typedArray.getColor(53, inputField.getTextColors().getDefaultColor());
        this.f179322O = typedArray.getColor(49, inputField.getTextColors().getDefaultColor());
        g(typedArray, new int[]{23, 25}, new k(this));
        FormatterType.f179288e.getClass();
        FormatterType formatterTypeA = FormatterType.a.a(typedArray.getInt(35, FormatterType.f179289f.f179300b));
        this.f179318K = formatterTypeA;
        setFormatterType(formatterTypeA);
        g(typedArray, new int[]{6, 7, 19, 20}, new h(this));
        if (typedArray.hasValue(59)) {
            setTextVerticalOffset(typedArray.getDimensionPixelSize(59, 0));
        }
        if (typedArray.hasValue(36)) {
            setIconBackgroundSize(typedArray.getDimensionPixelSize(36, 0));
        }
        g(typedArray, new int[]{40, 41}, new i(this));
        g(typedArray, new int[]{45, 46}, new j(this));
        if (typedArray.hasValue(37)) {
            com.avito.android.lib.util.r.a(imageView, Math.max(0, (this.f179334f - this.f179338j) / 2), Math.max(0, (this.f179335g - this.f179338j) / 2), x.a(typedArray, getContext(), 37), x.a(typedArray, getContext(), 38));
        }
        if (typedArray.hasValue(42)) {
            com.avito.android.lib.util.r.a(this.f179342n, Math.max(0, (this.f179336h - this.f179338j) / 2), Math.max(0, (this.f179337i - this.f179338j) / 2), x.a(typedArray, getContext(), 42), x.a(typedArray, getContext(), 43));
        }
        if (typedArray.hasValue(28)) {
            setClearButtonAppearance(typedArray.getResourceId(28, 0));
        }
        if (typedArray.hasValue(57)) {
            setSpinnerAppearance(typedArray.getResourceId(57, 0));
        }
        x();
        if (typedArray.hasValue(32)) {
            ComponentType.a aVar = ComponentType.f179282c;
            int i12 = typedArray.getInt(32, 0);
            aVar.getClass();
            for (ComponentType componentType : ComponentType.values()) {
                if (componentType.f179287b == i12) {
                    setComponentType(componentType);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        if (typedArray.hasValue(18)) {
            inputField.setImeOptions(typedArray.getInt(18, 0));
        }
        SpinnerPosition.a aVar2 = SpinnerPosition.f179358c;
        int i13 = typedArray.getInt(58, -1);
        aVar2.getClass();
        for (SpinnerPosition spinnerPosition : SpinnerPosition.values()) {
            if (spinnerPosition.f179362b == i13) {
                setSpinnerPosition(spinnerPosition);
                boolean zIsFocused = inputField.isFocused();
                if (inputField.getEllipsize() == null || !this.f179319L) {
                    return;
                }
                if (zIsFocused) {
                    inputField.setInputType(this.cachedInputType);
                    return;
                } else {
                    inputField.setKeyListener(null);
                    return;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final void d(TypedArray typedArray) {
        this.f179339k = typedArray.getDimensionPixelSize(8, 0);
        setLeftIcon(typedArray.getDrawable(15));
        setRightIcon(typedArray.getDrawable(16));
        setHint(typedArray.getString(10));
        t(this, typedArray.getString(9), false, 6);
        setLoading(typedArray.getBoolean(47, false));
        setFocusByClearButton(typedArray.getBoolean(34, false));
        setComponentContainerFocusedRectEnabled(typedArray.getBoolean(31, false));
        String string = typedArray.getString(48);
        if (string == null) {
            string = "";
        }
        setPostfix(string);
        String string2 = typedArray.getString(52);
        setPrefix(string2 != null ? string2 : "");
        if (typedArray.hasValue(56)) {
            setSelectionToEndOnFocus(typedArray.getBoolean(56, true));
        }
        if (typedArray.hasValue(27)) {
            setClearButton(typedArray.getBoolean(27, true));
        }
        if (typedArray.hasValue(30)) {
            setClearButtonVisibleUnfocused(typedArray.getBoolean(30, true));
        }
        if (typedArray.hasValue(29)) {
            setClearButtonIgnoresRightIcon(typedArray.getBoolean(29, false));
        }
        if (typedArray.hasValue(14)) {
            setMaxLength(typedArray.getInt(14, this.f179316I));
        }
        if (typedArray.hasValue(3)) {
            int i12 = typedArray.getInt(3, 0);
            TextUtils.TruncateAt truncateAt = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? null : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.END : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
            if (truncateAt == null) {
                truncateAt = TextUtils.TruncateAt.END;
            }
            setEllipsize(truncateAt);
        }
        setSingleLineProperty(typedArray.getBoolean(13, true));
        setMinimumHeight(this.f179339k);
        g(typedArray, new int[]{11, 12}, new e());
        boolean zHasValue = typedArray.hasValue(21);
        InputField inputField = this.f179340l;
        if (zHasValue) {
            inputField.setAutofillHints(typedArray.getString(21));
        }
        if (typedArray.hasValue(22)) {
            inputField.setImportantForAutofill(typedArray.getInt(22, 0));
        }
        if (typedArray.hasValue(4)) {
            setGravity(typedArray.getInt(4, 8388659));
        }
    }

    public final void f() {
        InputField inputField = this.f179340l;
        if (inputField.isFocused()) {
            inputField.clearFocus();
        }
    }

    /* renamed from: getClearButton, reason: from getter */
    public final boolean getF179349u() {
        return this.f179349u;
    }

    @Y61.k
    /* renamed from: getCurrentState, reason: from getter */
    public final int[] getF179312E() {
        return this.f179312E;
    }

    @Y61.k
    public final String getDeformattedText() {
        String string;
        Editable text = this.f179340l.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        return string.length() == 0 ? string : com.avito.android.lib.design.input.c.c(this.f179318K, string);
    }

    @Y61.k
    public final InputFilter[] getFilters() {
        InputFilter[] filters = this.f179340l.getFilters();
        return filters == null ? new InputFilter[0] : filters;
    }

    @Y61.l
    public final CharSequence getHint() {
        return this.f179340l.getHint();
    }

    /* renamed from: getInputPaddingBottom, reason: from getter */
    public final int getF179310C() {
        return this.f179310C;
    }

    /* renamed from: getInputPaddingLeft, reason: from getter */
    public final int getF179354z() {
        return this.f179354z;
    }

    /* renamed from: getInputPaddingRight, reason: from getter */
    public final int getF179309B() {
        return this.f179309B;
    }

    /* renamed from: getInputPaddingTop, reason: from getter */
    public final int getF179308A() {
        return this.f179308A;
    }

    /* renamed from: getInputType, reason: from getter */
    public final int getCachedInputType() {
        return this.cachedInputType;
    }

    @Y61.l
    public final Drawable getLeftIcon() {
        return this.f179341m.getDrawable();
    }

    /* renamed from: getMaxLength, reason: from getter */
    public final int getF179316I() {
        return this.f179316I;
    }

    @Y61.l
    public final Drawable getRightIcon() {
        return this.f179342n.getDrawable();
    }

    public final void h(@Y61.k TextWatcher textWatcher) {
        this.f179340l.removeTextChangedListener(textWatcher);
    }

    public final void i() {
        InputField inputField = this.f179340l;
        int selectionStart = inputField.getSelectionStart();
        int selectionEnd = inputField.getSelectionEnd();
        inputField.removeTextChangedListener(this.f179313F);
        FormatterType formatterType = this.f179318K;
        if (formatterType.f179302d != null) {
            this.f179313F = com.avito.android.lib.design.input.c.a(inputField, formatterType, this.f179321N, this.f179322O);
        }
        inputField.setText(getDeformattedText());
        inputField.setSelection(Math.min(inputField.getText().length(), selectionStart), Math.min(inputField.getText().length(), selectionEnd));
    }

    @Override // android.view.View
    public final boolean isClickable() {
        return this.f179340l.isClickable();
    }

    public final void k(int i12, int i13) {
        this.f179334f = i12;
        this.f179335g = i13;
        FrameLayout frameLayout = this.f179343o;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.f179334f;
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = this.f179335g;
        }
        frameLayout.requestLayout();
        y();
    }

    public final void m(int i12, int i13) {
        this.f179336h = i12;
        this.f179337i = i13;
        FrameLayout frameLayout = this.f179344p;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.f179336h;
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = this.f179337i;
        }
        frameLayout.requestLayout();
        z();
    }

    public final void o(int i12, int i13) {
        this.f179319L = false;
        InputField inputField = this.f179340l;
        inputField.setSingleLine(false);
        inputField.setMaxLines(i12);
        inputField.setMinLines(i13);
        inputField.setGravity(48);
        setInputTypeSingleLine(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Y61.k
    public final int[] onCreateDrawableState(int i12) {
        return View.mergeDrawableStates(super.onCreateDrawableState(i12 + this.f179312E.length), this.f179312E);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        if (!this.f179319L && this.f179332d == 0 && this.f179333e == 0) {
            InputField inputField = this.f179340l;
            int maxLines = inputField.getMaxLines();
            int minLines = inputField.getMinLines();
            setSingleLineProperty(true);
            setEditTextMinHeight(0);
            measureChild(inputField, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = this.f179339k - inputField.getMeasuredHeight();
            int i14 = this.f179311D;
            int i15 = (measuredHeight - i14) / 2;
            if (i15 > 0) {
                this.f179332d = i15;
                this.f179333e = i15;
                e(this, 0, i15, 0, i15, i14, 5);
            }
            setEditTextMinHeight(this.f179339k);
            o(maxLines, minLines);
        }
        super.onMeasure(i12, i13);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Y61.l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f179340l.onRestoreInstanceState(savedState.f179356c);
        setState(savedState.f179355b);
        i();
    }

    @Override // android.view.View
    @Y61.k
    public final Parcelable onSaveInstanceState() {
        return new SavedState(this.f179312E, this.f179340l.onSaveInstanceState(), super.onSaveInstanceState());
    }

    public final void q() {
        String str;
        String str2;
        InputField inputField = this.f179340l;
        if (inputField.isFocused()) {
            MaskParameters maskParameters = this.f179318K.f179302d;
            int length = (maskParameters == null || (str2 = maskParameters.f179371b) == null) ? 0 : str2.length();
            MaskParameters maskParameters2 = this.f179318K.f179302d;
            int length2 = (maskParameters2 == null || (str = maskParameters2.f179373d) == null) ? 0 : str.length();
            Editable text = inputField.getText();
            inputField.setSelection(Math.max(length, (text != null ? text.length() : 0) - length2));
        }
    }

    public final void r() {
        this.f179319L = true;
        InputField inputField = this.f179340l;
        inputField.setSingleLine(true);
        inputField.setMinLines(1);
        inputField.setMaxLines(1);
        inputField.setGravity(16);
        setInputTypeSingleLine(true);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        this.f179340l.refreshDrawableState();
    }

    public final void s(@Y61.l CharSequence charSequence, boolean z12, boolean z13) {
        InputField inputField = this.f179340l;
        Integer numValueOf = (z13 && inputField.isFocused()) ? Integer.valueOf(inputField.getSelectionStart()) : null;
        Editable text = inputField.getText();
        if (!L.f(charSequence, text != null ? text.toString() : null)) {
            setTextWithFormattingIfNeeded(charSequence);
        }
        if (numValueOf != null) {
            Editable text2 = inputField.getText();
            if ((text2 != null ? text2.length() : 0) >= numValueOf.intValue()) {
                setSelection(numValueOf.intValue());
                return;
            }
        }
        if (z12) {
            Editable text3 = inputField.getText();
            inputField.setSelection(text3 != null ? text3.length() : 0);
        }
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178939P);
        c(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceAndContent(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178939P);
        c(typedArrayObtainStyledAttributes);
        d(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setClearButton(boolean withClearButton) {
        this.f179349u = withClearButton;
        w();
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void setClearButtonAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178941Q);
        setClearButtonTint(x.a(typedArrayObtainStyledAttributes, getContext(), 3));
        com.avito.android.lib.util.r.a(this.f179347s, 0, Math.max(0, (this.f179337i - this.f179338j) / 2), x.a(typedArrayObtainStyledAttributes, getContext(), 1), x.a(typedArrayObtainStyledAttributes, getContext(), 2));
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int iMax = Math.max(0, ((this.f179336h - this.f179338j) / 2) + dimensionPixelOffset);
        int iMax2 = Math.max(0, ((this.f179336h - this.f179338j) / 2) - dimensionPixelOffset);
        D6.c(this.f179347s, Integer.valueOf(iMax), null, Integer.valueOf(iMax2), null, 10);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setClearButtonClickListener(@Y61.l View.OnClickListener listener) {
        this.f179347s.setOnClickListener(listener);
    }

    public final void setClearButtonForUdf(boolean clear) {
        boolean z12 = clear && C43066x.A0(getDeformattedText()).toString().length() > 0;
        this.f179349u = z12;
        setClearButtonVisible(z12);
    }

    public final void setClearButtonIgnoresRightIcon(boolean value) {
        this.f179352x = value;
        w();
    }

    public final void setClearButtonListener(@Y61.l Y41.a<G0> listener) {
        this.f179329V = listener;
    }

    public final void setClearButtonTint(@Y61.l ColorStateList color) {
        this.f179347s.setImageTintList(color);
    }

    public final void setClearButtonVisibleUnfocused(boolean value) {
        this.f179350v = value;
        w();
    }

    public final void setComponentContainerFocusedRectEnabled(boolean componentContainerFocusedRectEnabled) {
        this.f179340l.setComponentContainerFocusedRectEnabled(componentContainerFocusedRectEnabled);
    }

    public final void setComponentType(@Y61.k ComponentType componentType) {
        int iOrdinal = componentType.ordinal();
        boolean z12 = true;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            z12 = false;
        }
        InputField inputField = this.f179340l;
        inputField.setFocusable(z12);
        inputField.setFocusableInTouchMode(z12);
        inputField.setCursorVisible(z12);
    }

    public final void setCursorVisible(boolean isVisible) {
        this.f179340l.setCursorVisible(isVisible);
    }

    public final void setEditTextBackground(@Y61.l Drawable drawable) {
        this.f179340l.setBackground(drawable);
    }

    public final void setEditTextBackgroundColor(int color) {
        this.f179340l.setBackgroundColor(color);
    }

    public final void setEllipsize(@Y61.k TextUtils.TruncateAt ellipsize) {
        this.f179340l.setEllipsize(ellipsize);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (enabled == isEnabled()) {
            return;
        }
        super.setEnabled(enabled);
        InputField inputField = this.f179340l;
        inputField.setEnabled(enabled);
        this.f179341m.setEnabled(enabled);
        this.f179342n.setEnabled(enabled);
        inputField.setText(getText());
        w();
    }

    public final void setFilters(@Y61.k InputFilter[] filters) {
        this.f179340l.setFilters(filters);
    }

    public final void setFocusByClearButton(boolean focusByClearButton) {
        this.f179351w = focusByClearButton;
    }

    public final void setFormattedMaxLength(int maxLength) {
        this.f179316I = maxLength;
        a(new InputFilter.LengthFilter(maxLength));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setFormatterType(@Y61.k com.avito.android.lib.design.input.FormatterType r19) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.input.Input.setFormatterType(com.avito.android.lib.design.input.FormatterType):void");
    }

    public final void setGravity(int gravity) {
        this.f179340l.setGravity(gravity);
    }

    public final void setHighlightColor(int color) {
        this.f179340l.setHighlightColor(color);
    }

    public final void setHint(@e0 int hint) {
        setHint(getContext().getString(hint));
    }

    public final void setHintTextColor(@Y61.l ColorStateList color) {
        this.f179324Q = color;
        this.f179340l.setHintTextColor(color);
    }

    public final void setIconBackgroundSize(int size) {
        this.f179338j = size;
    }

    public final void setImeOptions(int options) {
        this.f179340l.setImeOptions(options);
    }

    public final void setInputType(int inputType) {
        setCachedInputType(inputType);
        int i12 = this.f179323P;
        InputField inputField = this.f179340l;
        inputField.setTextAppearance(i12);
        ColorStateList colorStateList = this.f179324Q;
        if (colorStateList != null) {
            inputField.setHintTextColor(colorStateList);
        }
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public final void setLeftIcon(@InterfaceC42165v int iconRes) {
        setLeftIcon(getContext().getDrawable(iconRes));
    }

    public final void setLeftIconColor(@InterfaceC42156l int color) {
        setLeftIconColor(ColorStateList.valueOf(color));
    }

    public final void setLeftIconListener(@Y61.l View.OnClickListener listener) {
        ImageView imageView = this.f179341m;
        if (listener != null) {
            imageView.setOnClickListener(new f(listener, imageView, 1));
        } else {
            imageView.setOnClickListener(null);
        }
        imageView.setClickable(listener != null);
    }

    public final void setLeftIconTag(@Y61.l String tag) {
        ImageView imageView = this.f179341m;
        if (tag == null || tag.length() == 0) {
            imageView.setTag("");
        } else {
            imageView.setTag(tag);
        }
    }

    public final void setLoading(boolean isLoading) {
        Spinner spinner = this.f179346r;
        Spinner spinner2 = this.f179345q;
        if (isLoading) {
            if (d.f179365a[this.f179325R.ordinal()] == 1) {
                D6.G(spinner2, true);
                D6.w(spinner);
            } else {
                D6.G(spinner, true);
                D6.w(spinner2);
            }
        } else {
            D6.w(spinner);
            D6.w(spinner2);
        }
        if (this.f179325R == SpinnerPosition.f179359d) {
            D6.G(this.f179341m, !isLoading && (getLeftIcon() != null));
            y();
        } else {
            D6.G(this.f179342n, !isLoading && (getRightIcon() != null));
            z();
        }
    }

    public final void setMarginsToClearButton(int horizontalOffset) {
        int iMax = Math.max(0, ((this.f179336h - this.f179338j) / 2) + horizontalOffset);
        int iMax2 = Math.max(0, ((this.f179336h - this.f179338j) / 2) - horizontalOffset);
        D6.c(this.f179347s, Integer.valueOf(iMax), null, Integer.valueOf(iMax2), null, 10);
    }

    public final void setMaxLength(int maxLength) {
        this.f179317J = true;
        setMaxLengthInternal(maxLength);
    }

    @Override // android.view.View
    public void setMinimumHeight(int minHeight) {
        this.f179339k = minHeight;
        setEditTextMinHeight(minHeight);
        super.setMinimumHeight(minHeight);
    }

    @Override // android.view.View
    public void setMinimumWidth(int minWidth) {
        this.f179340l.setMinWidth(minWidth);
    }

    @Override // android.view.View
    public void setOnClickListener(@Y61.l View.OnClickListener l12) {
        this.f179340l.setOnClickListener(l12);
    }

    public final void setOnEditorActionListener(@Y61.l TextView.OnEditorActionListener listener) {
        this.f179340l.setOnEditorActionListener(listener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(@Y61.l View.OnFocusChangeListener listener) {
        super.setOnFocusChangeListener(listener);
        this.f179348t = listener;
    }

    public final void setOnSelectionChangedListener(@Y61.l Y41.q<? super CharSequence, ? super Integer, ? super Integer, G0> listener) {
        this.f179340l.setOnSelectionChangedListener(listener);
    }

    @Override // android.view.View
    @InterfaceC42830m
    public final void setPadding(int i12, int i13, int i14, int i15) {
        super.setPadding(0, 0, 0, 0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setPostfix(@Y61.k String value) {
        this.f179315H = value;
        setFormatterType(this.f179318K);
    }

    public final void setPostfixColor(@InterfaceC42156l int color) {
        this.f179322O = color;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setPrefix(@Y61.k String value) {
        this.f179314G = value;
        setFormatterType(this.f179318K);
    }

    public final void setPrefixColor(@InterfaceC42156l int color) {
        this.f179321N = color;
    }

    public final void setRightContainerForceInvisible(boolean forceInvisible) {
        this.f179327T = forceInvisible;
        z();
    }

    public final void setRightIcon(@InterfaceC42165v int iconRes) {
        setRightIcon(getContext().getDrawable(iconRes));
    }

    public final void setRightIconClickListener(@Y61.l View.OnClickListener listener) {
        this.f179342n.setOnClickListener(listener);
    }

    public final void setRightIconColor(@Y61.l ColorStateList color) {
        this.f179342n.setImageTintList(color);
    }

    public final void setRightIconListener(@Y61.l View.OnClickListener listener) {
        ImageView imageView = this.f179342n;
        if (listener != null) {
            imageView.setOnClickListener(new f(listener, imageView, 0));
        } else {
            imageView.setOnClickListener(null);
        }
        imageView.setClickable(listener != null);
    }

    public final void setRightIconTag(@Y61.l String tag) {
        ImageView imageView = this.f179342n;
        if (tag == null || tag.length() == 0) {
            imageView.setTag("");
        } else {
            imageView.setTag(tag);
        }
    }

    public final void setSelection(int index) {
        this.f179340l.setSelection(index);
    }

    public final void setSelectionToEndOnFocus(boolean selectionToEndOnFocus) {
        this.f179353y = selectionToEndOnFocus;
    }

    public final void setSpinnerAppearance(@f0 int style) throws Resources.NotFoundException {
        this.f179345q.setAppearance(style);
        this.f179346r.setAppearance(style);
    }

    public final void setSpinnerPosition(@Y61.k SpinnerPosition spinnerPosition) {
        this.f179325R = spinnerPosition;
    }

    public final void setSpinnerStyle(@Y61.k com.avito.android.lib.design.spinner.a style) {
        this.f179345q.setStyle(style);
        this.f179346r.setStyle(style);
    }

    public final void setState(@Y61.k int[] state) {
        this.f179312E = Arrays.copyOf(state, state.length);
        refreshDrawableState();
    }

    public final void setText(@e0 int textRes) {
        setTextWithFormattingIfNeeded(getContext().getString(textRes));
    }

    public final void setTextColor(@InterfaceC42156l int color) {
        this.f179340l.setTextColor(color);
        i();
    }

    public final void setTextStyle(@Y61.k PK0.n style) {
        com.avito.android.lib.design.text_view.e.a(this.f179340l, style);
    }

    public final void setTextVerticalOffset(int offset) {
        this.f179311D = offset;
        e(this, 0, 0, 0, 0, offset, 15);
    }

    public final void setTouchListener(@Y61.l View.OnTouchListener listener) {
        this.f179340l.setOnTouchListener(listener);
    }

    public final void setTransformationMethod(@Y61.k TransformationMethod method) {
        InputField inputField = this.f179340l;
        int selectionEnd = inputField.getSelectionEnd();
        inputField.setTransformationMethod(method);
        inputField.setSelection(selectionEnd);
    }

    public final void u(boolean z12, @Y61.l CharSequence charSequence) {
        com.avito.android.lib.design.input.b bVar = this.f179313F;
        if (bVar != null) {
            h(bVar);
        }
        t(this, charSequence, false, 6);
        if (z12) {
            setFormatterType(this.f179318K);
        }
    }

    public final void v() {
        K2.i(this.f179340l);
    }

    public final void w() {
        boolean z12 = false;
        boolean z13 = getRightIcon() != null;
        boolean z14 = (this.f179349u && C43066x.A0(getDeformattedText()).toString().length() > 0 && (!z13 || this.f179352x)) && (this.f179350v || (isEnabled() && this.f179340l.isFocused()));
        D6.G(this.f179347s, z14);
        if (z13 && !z14) {
            z12 = true;
        }
        D6.G(this.f179342n, z12);
        z();
    }

    public final void x() {
        FrameLayout frameLayout = this.f179343o;
        if (!D6.y(frameLayout)) {
            frameLayout = null;
        }
        int i12 = frameLayout != null ? this.f179334f : this.f179330b;
        FrameLayout frameLayout2 = this.f179344p;
        e(this, i12, 0, (D6.y(frameLayout2) ? frameLayout2 : null) != null ? this.f179336h : this.f179331c, 0, 0, 26);
    }

    public final void y() {
        D6.G(this.f179343o, D6.y(this.f179341m) || D6.y(this.f179345q));
        x();
    }

    public final void z() {
        boolean z12 = false;
        if (!this.f179327T && (D6.y(this.f179342n) || D6.y(this.f179347s) || D6.y(this.f179346r))) {
            z12 = true;
        }
        D6.G(this.f179344p, z12);
        x();
    }

    public /* synthetic */ Input(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.input : i12, (i14 & 8) != 0 ? R.style.Design_Widget_Input : i13);
    }

    @Y61.l
    /* renamed from: getText, reason: collision with other method in class */
    public final Editable m53getText() {
        return this.f179340l.getText();
    }

    public final void setHint(@Y61.l CharSequence hint) {
        if (hint != null) {
            hint.toString();
        }
        this.f179340l.setHint(hint);
    }

    public final void setLeftIcon(@Y61.l Drawable icon) {
        ImageView imageView = this.f179341m;
        imageView.setImageDrawable(icon);
        D6.G(imageView, icon != null);
        y();
    }

    public final void setLeftIconColor(@Y61.l ColorStateList color) {
        this.f179328U = false;
        this.f179341m.setImageTintList(color);
    }

    public final void setRightIcon(@Y61.l Drawable icon) {
        ImageView imageView = this.f179342n;
        imageView.setImageDrawable(icon);
        D6.G(imageView, icon != null);
        w();
        x();
    }

    public final void setRightIconColor(@InterfaceC42156l int color) {
        setRightIconColor(ColorStateList.valueOf(color));
    }

    @X41.j
    public Input(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12, int i13) throws Resources.NotFoundException {
        super(context, attributeSet, i12, i13);
        this.f179349u = true;
        this.f179353y = true;
        this.f179312E = new int[0];
        this.f179314G = "";
        this.f179315H = "";
        this.f179316I = Integer.MAX_VALUE;
        FormatterType.f179288e.getClass();
        this.f179318K = FormatterType.f179289f;
        this.f179319L = true;
        this.f179321N = C35835l0.d(R.attr.black, context);
        this.f179322O = C35835l0.d(R.attr.black, context);
        this.f179325R = SpinnerPosition.f179359d;
        this.f179328U = true;
        Context context2 = getContext();
        int[] iArr = d.n.f178939P;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i12, i13);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(60, 0);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = LayoutInflater.from(resourceId != 0 ? new ContextThemeWrapper(context, resourceId) : context).inflate(R.layout.design_input, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R.id.design_input_value);
        if (viewFindViewById != null) {
            InputField inputField = (InputField) viewFindViewById;
            this.f179340l = inputField;
            View viewFindViewById2 = viewInflate.findViewById(R.id.design_input_left_icon);
            if (viewFindViewById2 != null) {
                this.f179341m = (ImageView) viewFindViewById2;
                View viewFindViewById3 = viewInflate.findViewById(R.id.design_input_right_icon);
                if (viewFindViewById3 != null) {
                    this.f179342n = (ImageView) viewFindViewById3;
                    View viewFindViewById4 = viewInflate.findViewById(R.id.design_input_clear);
                    if (viewFindViewById4 != null) {
                        ImageView imageView = (ImageView) viewFindViewById4;
                        this.f179347s = imageView;
                        View viewFindViewById5 = viewInflate.findViewById(R.id.design_input_spinner_left);
                        if (viewFindViewById5 != null) {
                            this.f179345q = (Spinner) viewFindViewById5;
                            View viewFindViewById6 = viewInflate.findViewById(R.id.design_input_spinner_right);
                            if (viewFindViewById6 != null) {
                                this.f179346r = (Spinner) viewFindViewById6;
                                View viewFindViewById7 = viewInflate.findViewById(R.id.design_input_left_container);
                                if (viewFindViewById7 != null) {
                                    this.f179343o = (FrameLayout) viewFindViewById7;
                                    View viewFindViewById8 = viewInflate.findViewById(R.id.design_input_right_container);
                                    if (viewFindViewById8 != null) {
                                        this.f179344p = (FrameLayout) viewFindViewById8;
                                        inputField.setId(-1);
                                        inputField.setOnFocusChangeListener(new com.avito.android.comfortable_deal.stages_transition.item.comment.h(this, 2));
                                        n.c(this, new a());
                                        imageView.setOnClickListener(new com.avito.android.imv_similiar_adverts.h(this, 16));
                                        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, iArr, i12, i13);
                                        c(typedArrayObtainStyledAttributes2);
                                        d(typedArrayObtainStyledAttributes2);
                                        typedArrayObtainStyledAttributes2.recycle();
                                        super.setPadding(0, 0, 0, 0);
                                        boolean zIsFocused = inputField.isFocused();
                                        if (inputField.getEllipsize() == null || !this.f179319L) {
                                            return;
                                        }
                                        if (zIsFocused) {
                                            inputField.setInputType(this.cachedInputType);
                                            return;
                                        } else {
                                            inputField.setKeyListener(null);
                                            return;
                                        }
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.InputField");
    }

    public final void setHintTextColor(int color) {
        this.f179340l.setHintTextColor(color);
    }

    public final void setTextColor(@Y61.l ColorStateList color) {
        this.f179340l.setTextColor(color);
        i();
    }
}

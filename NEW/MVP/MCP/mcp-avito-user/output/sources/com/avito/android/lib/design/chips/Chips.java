package com.avito.android.lib.design.chips;

import a90.ViewOnLayoutChangeListenerC19701a;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.d;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.p6;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import j.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: Chips.kt */
@s0
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\t\u007f9AI\u0080\u0001QZaB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0011J2\u0010\u001d\u001a\u00020\u000b2#\u0010\u001c\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b \u0010\u0015J\u0017\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b%\u0010$J\u001b\u0010)\u001a\u00020\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b,\u0010\u0015J\u0017\u0010/\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J'\u00103\u001a\u00020\u000b2\u0018\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b01¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\t¢\u0006\u0004\b6\u0010\rJ\u001d\u00107\u001a\u00020\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002¢\u0006\u0004\b7\u0010*R$\u0010?\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010G\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010O\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010W\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR*\u0010`\u001a\u00020X2\u0006\u0010Y\u001a\u00020X8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010c\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010\u0011R\"\u0010g\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010b\u001a\u0004\bg\u0010d\"\u0004\bh\u0010\u0011R.\u0010o\u001a\u0004\u0018\u00010\t2\b\u0010Y\u001a\u0004\u0018\u00010\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR.\u0010u\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010\u001eR$\u0010x\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010d\"\u0004\bw\u0010\u0011R$\u0010~\u001a\u00020y2\u0006\u0010Y\u001a\u00020y8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}¨\u0006\u0081\u0001"}, d2 = {"Lcom/avito/android/lib/design/chips/Chips;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "LpK0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "", "enabled", "setEnabled", "(Z)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "setTitleEnabled", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/S;", "name", "v", "clickListener", "setTitleTip", "(LY41/l;)V", "subtitle", "setSubtitle", "", "error", "setError", "(Ljava/lang/String;)V", "setErrorOnTop", "", "Lcom/avito/android/lib/design/chips/h;", "newData", "setData", "(Ljava/util/List;)V", "hint", "setHint", "Lcom/avito/android/lib/design/chips/Chips$f;", "listener", "setOnScrollPositionChangeListener", "(Lcom/avito/android/lib/design/chips/Chips$f;)V", "Lkotlin/Function2;", "callback", "setEllipsizeCallback", "(LY41/p;)V", "maxSelected", "setMaxSelected", "setupOverlayVariables", "Lcom/avito/android/lib/design/chips/Chips$c;", "b", "Lcom/avito/android/lib/design/chips/Chips$c;", "getChipsSelectedListener", "()Lcom/avito/android/lib/design/chips/Chips$c;", "setChipsSelectedListener", "(Lcom/avito/android/lib/design/chips/Chips$c;)V", "chipsSelectedListener", "Lcom/avito/android/lib/design/chips/Chips$a;", "c", "Lcom/avito/android/lib/design/chips/Chips$a;", "getChipsClickedListener", "()Lcom/avito/android/lib/design/chips/Chips$a;", "setChipsClickedListener", "(Lcom/avito/android/lib/design/chips/Chips$a;)V", "chipsClickedListener", "Lcom/avito/android/lib/design/chips/Chips$e;", "d", "Lcom/avito/android/lib/design/chips/Chips$e;", "getChipsOnRightDrawableClickedListener", "()Lcom/avito/android/lib/design/chips/Chips$e;", "setChipsOnRightDrawableClickedListener", "(Lcom/avito/android/lib/design/chips/Chips$e;)V", "chipsOnRightDrawableClickedListener", "Lcom/avito/android/lib/design/chips/Chips$b;", "e", "Lcom/avito/android/lib/design/chips/Chips$b;", "getChipsSelectConditionListener", "()Lcom/avito/android/lib/design/chips/Chips$b;", "setChipsSelectConditionListener", "(Lcom/avito/android/lib/design/chips/Chips$b;)V", "chipsSelectConditionListener", "Lcom/avito/android/lib/design/chips/Chips$DisplayType;", "value", "f", "Lcom/avito/android/lib/design/chips/Chips$DisplayType;", "getDisplayType", "()Lcom/avito/android/lib/design/chips/Chips$DisplayType;", "setDisplayType", "(Lcom/avito/android/lib/design/chips/Chips$DisplayType;)V", "displayType", "g", "Z", "isEditable", "()Z", "setEditable", "h", "isNotSelectable", "setNotSelectable", "i", "Ljava/lang/Integer;", "getMaxLines", "()Ljava/lang/Integer;", "setMaxLines", "(Ljava/lang/Integer;)V", "maxLines", "j", "LY41/l;", "getSelectCondition", "()LY41/l;", "setSelectCondition", "selectCondition", "getKeepSelected", "setKeepSelected", "keepSelected", "Lcom/avito/android/lib/design/chips/SelectStrategy;", "getSelectStrategy", "()Lcom/avito/android/lib/design/chips/SelectStrategy;", "setSelectStrategy", "(Lcom/avito/android/lib/design/chips/SelectStrategy;)V", "selectStrategy", "a", "DisplayType", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Chips extends ConstraintLayout implements InterfaceC46971a {

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f178664L = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f178665A;

    /* renamed from: B, reason: collision with root package name */
    public int f178666B;

    /* renamed from: C, reason: collision with root package name */
    public int f178667C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public x f178668D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public y f178669E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f178670F;

    /* renamed from: G, reason: collision with root package name */
    public int f178671G;

    /* renamed from: H, reason: collision with root package name */
    public int f178672H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f178673I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final WeakHashMap<View, Drawable> f178674J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public s f178675K;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public c chipsSelectedListener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public a chipsClickedListener;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public e chipsOnRightDrawableClickedListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public b chipsSelectConditionListener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public DisplayType displayType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isEditable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isNotSelectable;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Integer maxLines;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.l<? super Integer, Boolean> selectCondition;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ColorStateList f178685k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ColorStateList f178686l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ColorStateList f178687m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f178688n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final ImageView f178689o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final TextView f178690p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final TextView f178691q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final TextView f178692r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f178693s;

    /* renamed from: t, reason: collision with root package name */
    public w f178694t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public f f178695u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super Boolean, ? super Integer, G0> f178696v;

    /* renamed from: w, reason: collision with root package name */
    public int f178697w;

    /* renamed from: x, reason: collision with root package name */
    public int f178698x;

    /* renamed from: y, reason: collision with root package name */
    public int f178699y;

    /* renamed from: z, reason: collision with root package name */
    public int f178700z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Chips.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/Chips$DisplayType;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DisplayType {

        /* renamed from: b, reason: collision with root package name */
        public static final DisplayType f178701b;

        /* renamed from: c, reason: collision with root package name */
        public static final DisplayType f178702c;

        /* renamed from: d, reason: collision with root package name */
        public static final DisplayType f178703d;

        /* renamed from: e, reason: collision with root package name */
        public static final DisplayType f178704e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ DisplayType[] f178705f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f178706g;

        static {
            DisplayType displayType = new DisplayType("SINGLE_LINE_FIXED", 0);
            f178701b = displayType;
            DisplayType displayType2 = new DisplayType("SINGLE_LINE_STRETCH", 1);
            f178702c = displayType2;
            DisplayType displayType3 = new DisplayType("SINGLE_LINE_SCROLLABLE", 2);
            f178703d = displayType3;
            DisplayType displayType4 = new DisplayType("MULTIPLE_LINES", 3);
            f178704e = displayType4;
            DisplayType[] displayTypeArr = {displayType, displayType2, displayType3, displayType4};
            f178705f = displayTypeArr;
            f178706g = kotlin.enums.c.a(displayTypeArr);
        }

        public DisplayType() {
            throw null;
        }

        public static DisplayType valueOf(String str) {
            return (DisplayType) Enum.valueOf(DisplayType.class, str);
        }

        public static DisplayType[] values() {
            return (DisplayType[]) f178705f.clone();
        }
    }

    /* compiled from: Chips.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/Chips$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@Y61.k com.avito.android.lib.design.chips.h hVar);
    }

    /* compiled from: Chips.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/Chips$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void c(@Y61.k com.avito.android.lib.design.chips.h hVar, boolean z12);
    }

    /* compiled from: Chips.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/Chips$c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        void a(@Y61.k com.avito.android.lib.design.chips.h hVar);

        void b(@Y61.k com.avito.android.lib.design.chips.h hVar);
    }

    /* compiled from: Chips.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/chips/Chips$d;", "", "<init>", "()V", "", "CHIPS_MAX_SELECTED_NOT_SPECIFIED", "I", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: Chips.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/Chips$e;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {
        void a(@Y61.k com.avito.android.lib.design.chips.h hVar);
    }

    /* compiled from: Chips.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/chips/Chips$f;", "Lkotlin/Function1;", "", "Lkotlin/G0;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface f extends Y41.l<Integer, G0> {
    }

    /* compiled from: Chips.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/Chips$g;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class g extends RecyclerView.r {
        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            if (i12 == 0) {
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    int iK1 = ((LinearLayoutManager) layoutManager).K1();
                    if (iK1 == -1) {
                        iK1 = 0;
                    }
                    f fVar = Chips.this.f178695u;
                    if (fVar != null) {
                        fVar.invoke(Integer.valueOf(iK1));
                    }
                }
            }
        }
    }

    /* compiled from: Chips.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f178708a;

        static {
            int[] iArr = new int[DisplayType.values().length];
            try {
                DisplayType displayType = DisplayType.f178701b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DisplayType displayType2 = DisplayType.f178701b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DisplayType displayType3 = DisplayType.f178701b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DisplayType displayType4 = DisplayType.f178701b;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f178708a = iArr;
        }
    }

    static {
        new d(null);
    }

    public Chips(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chips);
        this.displayType = DisplayType.f178703d;
        this.isEditable = true;
        this.selectCondition = r.f178749l;
        this.f178685k = C35835l0.e(R.attr.gray48, getContext());
        this.f178686l = C35835l0.e(R.attr.red, getContext());
        setClipToPadding(false);
        setClipChildren(false);
        Context context2 = getContext();
        TypedValue typedValue = new TypedValue();
        int i12 = context2.getTheme().resolveAttribute(R.attr.chips, typedValue, true) ? typedValue.resourceId : 2132017649;
        ContextWrapper contextWrapper = new ContextWrapper(context2);
        contextWrapper.setTheme(i12);
        LayoutInflater.from(contextWrapper).inflate(R.layout.design_chips_layout, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f178688n = textView;
        this.f178689o = (ImageView) findViewById(R.id.title_tip);
        TextView textView2 = (TextView) findViewById(R.id.subtitle);
        this.f178690p = textView2;
        this.f178691q = (TextView) findViewById(R.id.error_top);
        TextView textView3 = (TextView) findViewById(R.id.hint);
        this.f178692r = textView3;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.chips_recycler_view);
        this.f178693s = recyclerView;
        recyclerView.o(new g());
        this.f178687m = textView2.getTextColors();
        this.f178674J = new WeakHashMap<>();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f179004y, R.attr.chips, R.style.Design_Widget_Chips);
        CharSequence text = typedArrayObtainStyledAttributes.getText(37);
        I5.a(textView, text != null ? text.toString() : null, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(34);
        I5.a(textView2, text2 != null ? text2.toString() : null, false);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(19);
        I5.a(textView3, text3 != null ? text3.toString() : null, false);
        g(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        m();
    }

    public static boolean i(RecyclerView recyclerView) {
        p6 p6Var = new p6(recyclerView);
        while (p6Var.hasNext()) {
            View viewFindViewById = ((View) p6Var.next()).findViewById(R.id.chip_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            if (((Button) viewFindViewById).d()) {
                return false;
            }
        }
        return true;
    }

    private final void setupOverlayVariables(List<? extends com.avito.android.lib.design.chips.h> newData) {
        Iterator<T> it = newData.iterator();
        while (it.hasNext()) {
            com.avito.android.lib.design.chips.g gVarQ1 = ((com.avito.android.lib.design.chips.h) it.next()).Q1();
            if (gVarQ1 != null) {
                this.f178673I = true;
                if (gVarQ1.getF178740a()) {
                    this.f178670F = true;
                    return;
                }
            }
        }
    }

    public static final void v(Chips chips, View view) {
        ColorDrawable colorDrawable = new ColorDrawable(872415231);
        colorDrawable.setBounds(0, 0, view.getWidth(), view.getHeight());
        view.getOverlay().add(colorDrawable);
        chips.f178674J.put(view, colorDrawable);
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(chips, 13));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean zY2 = D6.y(this.f178688n);
        ImageView imageView = this.f178689o;
        if (!zY2 && !D6.y(this.f178690p)) {
            D6.w(imageView);
        }
        if (D6.y(imageView)) {
            D6.c(this.f178688n, null, null, Integer.valueOf(y6.b(0)), null, 11);
            D6.c(this.f178690p, null, null, Integer.valueOf(y6.b(0)), null, 11);
            D6.c(this.f178691q, null, null, Integer.valueOf(y6.b(0)), null, 11);
        }
    }

    public final void g(TypedArray typedArray) {
        int iIntValue;
        int iIntValue2;
        int i12;
        if (typedArray.hasValue(11)) {
            this.f178699y = typedArray.getDimensionPixelSize(11, 0);
        }
        if (typedArray.hasValue(10)) {
            this.f178697w = typedArray.getDimensionPixelSize(10, 0);
        }
        if (typedArray.hasValue(12)) {
            this.f178698x = typedArray.getDimensionPixelSize(12, 0);
        }
        if (typedArray.hasValue(13)) {
            this.f178667C = typedArray.getDimensionPixelSize(13, 0);
        }
        if (typedArray.hasValue(39)) {
            this.f178700z = typedArray.getDimensionPixelSize(39, 0);
        }
        if (typedArray.hasValue(43)) {
            this.f178665A = typedArray.getDimensionPixelSize(43, 0);
        }
        boolean zHasValue = typedArray.hasValue(41);
        ImageView imageView = this.f178689o;
        if (zHasValue) {
            imageView.setImageDrawable(typedArray.getDrawable(41));
        }
        if (typedArray.hasValue(42)) {
            imageView.setImageTintList(com.avito.android.lib.util.x.a(typedArray, getContext(), 42));
        }
        if (typedArray.hasValue(14)) {
            this.f178666B = typedArray.getDimensionPixelSize(14, 0);
        }
        if (typedArray.hasValue(40)) {
            this.f178688n.setTextAppearance(typedArray.getResourceId(40, 0));
        }
        boolean zHasValue2 = typedArray.hasValue(36);
        TextView textView = this.f178690p;
        if (zHasValue2) {
            textView.setTextAppearance(typedArray.getResourceId(36, 0));
        }
        boolean zHasValue3 = typedArray.hasValue(18);
        TextView textView2 = this.f178691q;
        if (zHasValue3) {
            textView2.setTextAppearance(typedArray.getResourceId(18, 0));
        }
        boolean zHasValue4 = typedArray.hasValue(21);
        TextView textView3 = this.f178692r;
        if (zHasValue4) {
            textView3.setTextAppearance(typedArray.getResourceId(21, 0));
        }
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) textView.getLayoutParams())).topMargin = kotlin.math.b.b(typedArray.getDimension(39, 0.0f));
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) textView2.getLayoutParams())).topMargin = kotlin.math.b.b(typedArray.getDimension(39, 0.0f));
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) textView3.getLayoutParams())).topMargin = kotlin.math.b.b(typedArray.getDimension(22, 0.0f));
        RecyclerView recyclerView = this.f178693s;
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) recyclerView.getLayoutParams())).topMargin = kotlin.math.b.b(typedArray.getDimension(14, 0.0f));
        int i13 = typedArray.hasValue(26) ? typedArray.getInt(26, -1) : -1;
        if (typedArray.hasValue(25) && (i12 = typedArray.getInt(25, 0)) > 0) {
            setMaxLines(Integer.valueOf(i12));
        }
        this.isEditable = typedArray.getBoolean(16, this.isEditable);
        this.isNotSelectable = typedArray.getBoolean(23, this.isNotSelectable);
        int resourceId = typedArray.getResourceId(44, R.style.Deprecated_Button_Appearance_Default);
        int resourceId2 = typedArray.getResourceId(32, R.style.Deprecated_Button_Appearance_Primary);
        int resourceId3 = typedArray.getResourceId(27, R.style.Deprecated_Button_Appearance_Default);
        setEnabled(typedArray.getBoolean(0, true));
        this.f178694t = new w(SelectStrategy.values()[typedArray.getInt(31, 0)], typedArray.getBoolean(24, false), new i(2, this, Chips.class, "onSelected", "onSelected(IZ)V", 0), new j(2, this, Chips.class, "onUnSelected", "onUnSelected(IZ)V", 0), new k(2, this, Chips.class, "onClicked", "onClicked(IZ)V", 0), new n(0, this, Chips.class, "onMaxSelectedStateChanged", "onMaxSelectedStateChanged()V", 0), new l(1, this, Chips.class, "onCheckSelectCondition", "onCheckSelectCondition(I)Z", 0), i13, new m(2, this, Chips.class, "onSelectionApproved", "onSelectionApproved(ZI)V", 0));
        this.f178671G = typedArray.getDimensionPixelSize(30, 0);
        this.f178672H = typedArray.getDimensionPixelSize(29, 0);
        DisplayType displayType = (DisplayType) C42756l.F(typedArray.getInt(15, 0), DisplayType.values());
        if (displayType == null) {
            displayType = DisplayType.f178703d;
        }
        setDisplayType(displayType);
        int layoutDimension = typedArray.getLayoutDimension(1, -1);
        if (layoutDimension > 0) {
            t(layoutDimension, layoutDimension);
            setPadding(0, layoutDimension, 0, layoutDimension);
        } else {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(8, -1);
            Integer numValueOf = Integer.valueOf(dimensionPixelSize);
            if (dimensionPixelSize == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(6, -1);
                Integer numValueOf2 = Integer.valueOf(dimensionPixelSize2);
                if (dimensionPixelSize2 == -1) {
                    numValueOf2 = null;
                }
                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : typedArray.getDimensionPixelSize(2, 0);
            }
            if (numValueOf != null) {
                iIntValue2 = numValueOf.intValue();
            } else {
                int dimensionPixelSize3 = typedArray.getDimensionPixelSize(7, -1);
                Integer numValueOf3 = Integer.valueOf(dimensionPixelSize3);
                if (dimensionPixelSize3 == -1) {
                    numValueOf3 = null;
                }
                iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : typedArray.getDimensionPixelSize(4, 0);
            }
            int dimensionPixelSize4 = typedArray.getDimensionPixelSize(3, 0);
            int dimensionPixelSize5 = typedArray.getDimensionPixelSize(5, 0);
            t(iIntValue, iIntValue2);
            setPadding(0, dimensionPixelSize4, 0, dimensionPixelSize5);
        }
        recyclerView.setLayoutManager(k(this.maxLines));
        w wVar = this.f178694t;
        t tVar = new t(wVar == null ? null : wVar, new o(1, this, Chips.class, "onRightDrawableClicked", "onRightDrawableClicked(Lcom/avito/android/lib/design/chips/Chipable;)Lkotlin/Unit;", 0), isEnabled(), this.isNotSelectable, this.f178671G, this.f178672H);
        tVar.f178778j = resourceId2;
        tVar.f178779k = resourceId;
        tVar.f178780l = resourceId3;
        recyclerView.setAdapter(tVar);
    }

    @Y61.l
    public final a getChipsClickedListener() {
        return this.chipsClickedListener;
    }

    @Y61.l
    public final e getChipsOnRightDrawableClickedListener() {
        return this.chipsOnRightDrawableClickedListener;
    }

    @Y61.l
    public final b getChipsSelectConditionListener() {
        return this.chipsSelectConditionListener;
    }

    @Y61.l
    public final c getChipsSelectedListener() {
        return this.chipsSelectedListener;
    }

    @Y61.k
    public final DisplayType getDisplayType() {
        return this.displayType;
    }

    public final boolean getKeepSelected() {
        w wVar = this.f178694t;
        if (wVar == null) {
            wVar = null;
        }
        return wVar.f178805b;
    }

    @Y61.l
    public final Integer getMaxLines() {
        return this.maxLines;
    }

    @Y61.k
    public final Y41.l<Integer, Boolean> getSelectCondition() {
        return this.selectCondition;
    }

    @Y61.k
    public final SelectStrategy getSelectStrategy() {
        w wVar = this.f178694t;
        if (wVar == null) {
            wVar = null;
        }
        return wVar.f178804a;
    }

    public final void h() {
        RecyclerView.m mVarK = k(this.maxLines);
        RecyclerView recyclerView = this.f178693s;
        recyclerView.setLayoutManager(mVarK);
        post(new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 4));
        x xVar = this.f178668D;
        if (xVar != null) {
            recyclerView.r0(xVar);
        }
        int i12 = this.f178667C;
        if (i12 > 0) {
            x xVar2 = new x(i12);
            recyclerView.l(xVar2, -1);
            this.f178668D = xVar2;
        }
        l();
    }

    public final void j() {
        w wVar = this.f178694t;
        if (wVar == null) {
            wVar = null;
        }
        LinkedHashSet linkedHashSet = wVar.f178813j;
        List listM0 = C42745f0.M0(linkedHashSet);
        linkedHashSet.clear();
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            RecyclerView.Adapter adapter = this.f178693s.getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(iIntValue);
            }
        }
    }

    public final RecyclerView.m k(Integer num) {
        int iOrdinal = this.displayType.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                SafeFlexboxLayoutManager safeFlexboxLayoutManager = new SafeFlexboxLayoutManager(getContext());
                safeFlexboxLayoutManager.R1(1);
                safeFlexboxLayoutManager.Q1(0);
                return safeFlexboxLayoutManager;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return new MultilineLayoutManager(this.f178697w / 2, this.f178698x / 2, num, new p(this));
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return new FixedChipsLinearLayoutManager(getContext(), this.f178697w, this.f178699y, this.displayType == DisplayType.f178701b);
    }

    public final void l() {
        y yVar = this.f178669E;
        RecyclerView recyclerView = this.f178693s;
        if (yVar != null) {
            recyclerView.r0(yVar);
        }
        if (this.displayType != DisplayType.f178704e) {
            y yVar2 = new y((this.f178697w + ((this.f178670F || !this.f178673I) ? 0 : -this.f178672H)) / 2);
            recyclerView.l(yVar2, -1);
            this.f178669E = yVar2;
        }
    }

    public final void m() {
        TextView textView = this.f178688n;
        boolean zY2 = D6.y(textView);
        RecyclerView recyclerView = this.f178693s;
        TextView textView2 = this.f178691q;
        TextView textView3 = this.f178690p;
        if (zY2 || D6.y(textView3) || D6.y(textView2)) {
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) recyclerView.getLayoutParams())).topMargin = this.f178666B + (this.f178670F ? -this.f178671G : 0);
            if (D6.y(textView3)) {
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) textView3.getLayoutParams())).topMargin = D6.y(textView) ? this.f178700z : 0;
            }
            if (D6.y(textView2)) {
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) textView2.getLayoutParams())).topMargin = (D6.y(textView3) || D6.y(textView)) ? this.f178700z : 0;
            }
        } else {
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) recyclerView.getLayoutParams())).topMargin = this.f178670F ? -this.f178671G : 0;
        }
        l();
    }

    @Y61.k
    public final List<Integer> n() {
        return ((t) this.f178693s.getAdapter()).f178724c.a();
    }

    public final void o(@Y61.k com.avito.android.lib.design.chips.h hVar, boolean z12) {
        RecyclerView recyclerView = this.f178693s;
        Iterator it = ((t) recyclerView.getAdapter()).f178730i.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (hVar.V1(it.next())) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            if (z12) {
                recyclerView.F0(i12);
            } else {
                recyclerView.A0(i12);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Y61.l MotionEvent motionEvent) {
        if (isEnabled() && this.isEditable) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public final void p(int i12, boolean z12) {
        RecyclerView.Adapter adapter = this.f178693s.getAdapter();
        t tVar = adapter instanceof t ? (t) adapter : null;
        if (tVar == null || ((com.avito.android.lib.design.chips.h) C42745f0.K(i12, tVar.f178730i)) == null) {
            return;
        }
        w wVar = this.f178694t;
        (wVar != null ? wVar : null).e(i12, z12, true);
        tVar.notifyItemChanged(i12);
    }

    public final void q(@Y61.k com.avito.android.lib.design.chips.h hVar, boolean z12) {
        ArrayList arrayList;
        RecyclerView.Adapter adapter = this.f178693s.getAdapter();
        t tVar = adapter instanceof t ? (t) adapter : null;
        if (tVar == null || (arrayList = tVar.f178730i) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (hVar.V1(it.next())) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 == -1) {
            return;
        }
        w wVar = this.f178694t;
        (wVar != null ? wVar : null).e(i12, z12, true);
        tVar.notifyItemChanged(i12);
    }

    public final void r(@Y61.k Collection<? extends com.avito.android.lib.design.chips.h> collection) {
        RecyclerView recyclerView = this.f178693s;
        ArrayList arrayList = ((t) recyclerView.getAdapter()).f178730i;
        Collection<? extends com.avito.android.lib.design.chips.h> collection2 = collection;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(collection2, 10));
        for (com.avito.android.lib.design.chips.h hVar : collection2) {
            Iterator it = arrayList.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                } else if (hVar.V1(it.next())) {
                    break;
                } else {
                    i12++;
                }
            }
            arrayList2.add(Integer.valueOf(i12));
        }
        w wVar = this.f178694t;
        if (wVar == null) {
            wVar = null;
        }
        SelectStrategy selectStrategy = wVar.f178804a;
        if ((selectStrategy == SelectStrategy.f178716b || selectStrategy == SelectStrategy.f178718d) && arrayList2.size() > 1) {
            throw new IllegalStateException("Attempt to select more than one chip with single strategy.");
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                boolean zC2 = wVar.c(iIntValue);
                LinkedHashSet linkedHashSet = wVar.f178813j;
                if (!zC2) {
                    linkedHashSet.add(Integer.valueOf(iIntValue));
                } else if (linkedHashSet.size() != 1 || !wVar.f178805b) {
                    linkedHashSet.remove(Integer.valueOf(iIntValue));
                }
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            int iIntValue2 = ((Number) it3.next()).intValue();
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(iIntValue2);
            }
        }
    }

    @Y61.k
    public final List<com.avito.android.lib.design.chips.h> s() {
        t tVar = (t) this.f178693s.getAdapter();
        List<Integer> listA = tVar.f178724c.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add((com.avito.android.lib.design.chips.h) tVar.f178730i.get(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f179004y);
        g(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setChipsClickedListener(@Y61.l a aVar) {
        this.chipsClickedListener = aVar;
    }

    public final void setChipsOnRightDrawableClickedListener(@Y61.l e eVar) {
        this.chipsOnRightDrawableClickedListener = eVar;
    }

    public final void setChipsSelectConditionListener(@Y61.l b bVar) {
        this.chipsSelectConditionListener = bVar;
    }

    public final void setChipsSelectedListener(@Y61.l c cVar) {
        this.chipsSelectedListener = cVar;
    }

    public final void setData(@Y61.k List<? extends com.avito.android.lib.design.chips.h> newData) {
        t tVar = (t) this.f178693s.getAdapter();
        ArrayList arrayList = tVar.f178730i;
        arrayList.clear();
        arrayList.addAll(newData);
        tVar.notifyDataSetChanged();
        addOnLayoutChangeListener(new q(this, this));
        setupOverlayVariables(newData);
        m();
    }

    public final void setDisplayType(@Y61.k DisplayType displayType) {
        this.displayType = displayType;
        h();
        if (h.f178708a[this.displayType.ordinal()] == 1) {
            addOnLayoutChangeListener(new q(this, this));
        }
    }

    public final void setEditable(boolean z12) {
        this.isEditable = z12;
    }

    public final void setEllipsizeCallback(@Y61.k Y41.p<? super Boolean, ? super Integer, G0> callback) {
        this.f178696v = callback;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        RecyclerView recyclerView = this.f178693s;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        t tVar = adapter instanceof t ? (t) adapter : null;
        if (tVar != null) {
            tVar.f178726e = enabled;
        }
        p6 p6Var = new p6(recyclerView);
        while (p6Var.hasNext()) {
            ((View) p6Var.next()).setEnabled(enabled);
        }
    }

    public final void setError(@Y61.l String error) {
        ColorStateList colorStateList = this.f178686l;
        TextView textView = this.f178692r;
        textView.setTextColor(colorStateList);
        I5.a(textView, error, false);
    }

    public final void setErrorOnTop(@Y61.l String error) {
        I5.a(this.f178691q, error, false);
        m();
    }

    public final void setHint(@Y61.l CharSequence hint) {
        ColorStateList colorStateList = this.f178685k;
        TextView textView = this.f178692r;
        textView.setTextColor(colorStateList);
        I5.a(textView, hint, false);
    }

    public final void setKeepSelected(boolean z12) {
        w wVar = this.f178694t;
        if (wVar == null) {
            wVar = null;
        }
        wVar.f178805b = z12;
    }

    public final void setMaxLines(@Y61.l Integer num) {
        this.maxLines = num;
        h();
    }

    public final void setMaxSelected(int maxSelected) {
        w wVar = this.f178694t;
        if (wVar == null) {
            wVar = null;
        }
        wVar.f178812i = maxSelected;
        if (maxSelected != -1) {
            LinkedHashSet linkedHashSet = wVar.f178813j;
            int size = linkedHashSet.size();
            int i12 = wVar.f178812i;
            if (size > i12) {
                int size2 = linkedHashSet.size();
                while (i12 < size2) {
                    linkedHashSet.remove(Integer.valueOf(i12));
                    i12++;
                }
            }
        }
        Y41.a<G0> aVar = wVar.f178809f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setNotSelectable(boolean z12) {
        this.isNotSelectable = z12;
    }

    public final void setOnScrollPositionChangeListener(@Y61.l f listener) {
        this.f178695u = listener;
    }

    public final void setSelectCondition(@Y61.k Y41.l<? super Integer, Boolean> lVar) {
        this.selectCondition = lVar;
    }

    public final void setSelectStrategy(@Y61.k SelectStrategy selectStrategy) {
        w wVar = this.f178694t;
        if (wVar == null) {
            wVar = null;
        }
        wVar.f178804a = selectStrategy;
    }

    public final void setSubtitle(@Y61.k CharSequence subtitle) {
        ColorStateList colorStateList = this.f178687m;
        TextView textView = this.f178690p;
        textView.setTextColor(colorStateList);
        I5.a(textView, subtitle, false);
        m();
    }

    public final void setTitle(@Y61.l CharSequence title) {
        I5.a(this.f178688n, title, false);
        m();
    }

    public final void setTitleEnabled(boolean enabled) {
        this.f178688n.setEnabled(enabled);
    }

    public final void setTitleTip(@Y61.l Y41.l<? super View, G0> clickListener) {
        ImageView imageView = this.f178689o;
        if (clickListener == null) {
            D6.w(imageView);
        } else {
            D6.H(imageView);
        }
        imageView.setOnClickListener(clickListener != null ? new ViewOnClickListenerC31042l(5, clickListener) : null);
    }

    public final void t(int i12, int i13) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) this.f178688n.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = i13;
        D6.c(this.f178689o, Integer.valueOf(this.f178665A), null, Integer.valueOf(i13), null, 10);
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f178690p.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) bVar2).leftMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = i13;
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) this.f178691q.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) bVar3).leftMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar3).rightMargin = i13;
        ConstraintLayout.b bVar4 = (ConstraintLayout.b) this.f178692r.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) bVar4).leftMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar4).rightMargin = i13;
        this.f178693s.setPadding(i12, 0, i13, 0);
    }

    public final void u(boolean z12) {
        int i12 = 0;
        RecyclerView recyclerView = this.f178693s;
        if (z12) {
            int childCount = recyclerView.getChildCount();
            while (i12 < childCount) {
                v(this, recyclerView.getChildAt(i12));
                i12++;
            }
            s sVar = new s(this);
            recyclerView.m(sVar);
            this.f178675K = sVar;
            return;
        }
        s sVar2 = this.f178675K;
        if (sVar2 != null) {
            recyclerView.t0(sVar2);
        }
        this.f178675K = null;
        int childCount2 = recyclerView.getChildCount();
        while (true) {
            WeakHashMap<View, Drawable> weakHashMap = this.f178674J;
            if (i12 >= childCount2) {
                weakHashMap.clear();
                return;
            }
            View childAt = recyclerView.getChildAt(i12);
            Drawable drawableRemove = weakHashMap.remove(childAt);
            if (drawableRemove != null) {
                childAt.getOverlay().remove(drawableRemove);
            }
            i12++;
        }
    }
}

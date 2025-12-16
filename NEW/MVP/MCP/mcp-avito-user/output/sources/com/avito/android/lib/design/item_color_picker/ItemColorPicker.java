package com.avito.android.lib.design.item_color_picker;

import Y41.p;
import Y61.l;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import com.avito.android.lib.design.d;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.p6;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import j.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: ItemColorPicker.kt */
@s0
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0007pq2:BKRJ\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000bJ2\u0010\u0017\u001a\u00020\u00052#\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001e\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001f\u0010\u000fJ\u001b\u0010#\u001a\u00020\u00052\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b&\u0010\u001cJ\u0017\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J'\u0010-\u001a\u00020\u00052\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050+¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0003¢\u0006\u0004\b0\u0010\u0007R$\u00108\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010H\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010Q\u001a\u00020I2\u0006\u0010J\u001a\u00020I8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010T\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010\u000bR\"\u0010X\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010S\u001a\u0004\bX\u0010U\"\u0004\bY\u0010\u000bR.\u0010`\u001a\u0004\u0018\u00010\u00032\b\u0010J\u001a\u0004\u0018\u00010\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R.\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010\u0018R$\u0010i\u001a\u00020\b2\u0006\u0010J\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010U\"\u0004\bh\u0010\u000bR$\u0010o\u001a\u00020j2\u0006\u0010J\u001a\u00020j8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010n¨\u0006r"}, d2 = {"Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "LpK0/a;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "", "enabled", "setEnabled", "(Z)V", "", "title", "setTitle", "(Ljava/lang/String;)V", "setTitleEnabled", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/S;", "name", "v", "clickListener", "setTitleTip", "(LY41/l;)V", "", "subtitle", "setSubtitle", "(Ljava/lang/CharSequence;)V", "error", "setError", "setErrorOnTop", "", "Lcom/avito/android/lib/design/item_color_picker/a;", "newData", "setData", "(Ljava/util/List;)V", "hint", "setHint", "Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$e;", "listener", "setOnScrollPositionChangeListener", "(Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$e;)V", "Lkotlin/Function2;", "callback", "setEllipsizeCallback", "(LY41/p;)V", "maxSelected", "setMaxSelected", "Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$c;", "b", "Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$c;", "getItemColorSelectedListener", "()Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$c;", "setItemColorSelectedListener", "(Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$c;)V", "itemColorSelectedListener", "Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$d;", "c", "Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$d;", "getItemColorOnRightDrawableClickedListener", "()Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$d;", "setItemColorOnRightDrawableClickedListener", "(Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$d;)V", "itemColorOnRightDrawableClickedListener", "Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$b;", "d", "Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$b;", "getItemColorSelectConditionListener", "()Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$b;", "setItemColorSelectConditionListener", "(Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$b;)V", "itemColorSelectConditionListener", "Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$DisplayType;", "value", "e", "Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$DisplayType;", "getDisplayType", "()Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$DisplayType;", "setDisplayType", "(Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$DisplayType;)V", "displayType", "f", "Z", "isEditable", "()Z", "setEditable", "g", "isSelectable", "setSelectable", "h", "Ljava/lang/Integer;", "getMaxLines", "()Ljava/lang/Integer;", "setMaxLines", "(Ljava/lang/Integer;)V", "maxLines", "i", "LY41/l;", "getSelectCondition", "()LY41/l;", "setSelectCondition", "selectCondition", "getKeepSelected", "setKeepSelected", "keepSelected", "Lcom/avito/android/lib/design/item_color_picker/SelectStrategy;", "getSelectStrategy", "()Lcom/avito/android/lib/design/item_color_picker/SelectStrategy;", "setSelectStrategy", "(Lcom/avito/android/lib/design/item_color_picker/SelectStrategy;)V", "selectStrategy", "a", "DisplayType", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ItemColorPicker extends ConstraintLayout implements InterfaceC46971a {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f179422A = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public c itemColorSelectedListener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public d itemColorOnRightDrawableClickedListener;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public b itemColorSelectConditionListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public DisplayType displayType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isEditable;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isSelectable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    public Integer maxLines;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.l<? super Integer, Boolean> selectCondition;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ColorStateList f179431j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ColorStateList f179432k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ColorStateList f179433l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f179434m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ImageView f179435n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f179436o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final TextView f179437p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final TextView f179438q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f179439r;

    /* renamed from: s, reason: collision with root package name */
    public k f179440s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public e f179441t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public p<? super Boolean, ? super Integer, G0> f179442u;

    /* renamed from: v, reason: collision with root package name */
    public int f179443v;

    /* renamed from: w, reason: collision with root package name */
    public int f179444w;

    /* renamed from: x, reason: collision with root package name */
    public int f179445x;

    /* renamed from: y, reason: collision with root package name */
    public int f179446y;

    /* renamed from: z, reason: collision with root package name */
    public int f179447z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ItemColorPicker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$DisplayType;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DisplayType {

        /* renamed from: b, reason: collision with root package name */
        public static final DisplayType f179448b;

        /* renamed from: c, reason: collision with root package name */
        public static final DisplayType f179449c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ DisplayType[] f179450d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f179451e;

        static {
            DisplayType displayType = new DisplayType("SINGLE_LINE_SCROLLABLE", 0);
            f179448b = displayType;
            DisplayType displayType2 = new DisplayType("MULTILINE", 1);
            f179449c = displayType2;
            DisplayType[] displayTypeArr = {displayType, displayType2};
            f179450d = displayTypeArr;
            f179451e = kotlin.enums.c.a(displayTypeArr);
        }

        public DisplayType() {
            throw null;
        }

        public static DisplayType valueOf(String str) {
            return (DisplayType) Enum.valueOf(DisplayType.class, str);
        }

        public static DisplayType[] values() {
            return (DisplayType[]) f179450d.clone();
        }
    }

    /* compiled from: ItemColorPicker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$a;", "", "<init>", "()V", "", "ITEM_COLOR_MAX_SELECTED_NOT_SPECIFIED", "I", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ItemColorPicker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void a();
    }

    /* compiled from: ItemColorPicker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        void a(@Y61.k com.avito.android.lib.design.item_color_picker.a aVar);

        void b(@Y61.k com.avito.android.lib.design.item_color_picker.a aVar);
    }

    /* compiled from: ItemColorPicker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$d;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
    }

    /* compiled from: ItemColorPicker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$e;", "Lkotlin/Function1;", "", "Lkotlin/G0;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e extends Y41.l<Integer, G0> {
    }

    /* compiled from: ItemColorPicker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$f;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f extends RecyclerView.r {
        public f() {
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
                    e eVar = ItemColorPicker.this.f179441t;
                    if (eVar != null) {
                        eVar.invoke(Integer.valueOf(iK1));
                    }
                }
            }
        }
    }

    /* compiled from: ItemColorPicker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g {
        static {
            int[] iArr = new int[DisplayType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DisplayType displayType = DisplayType.f179448b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new a(null);
    }

    public ItemColorPicker(@Y61.k androidx.appcompat.view.d dVar) {
        super(dVar, null, R.attr.item_color);
        this.displayType = DisplayType.f179448b;
        this.isEditable = true;
        this.selectCondition = i.f179478l;
        this.f179431j = C35835l0.e(R.attr.gray48, getContext());
        this.f179432k = C35835l0.e(R.attr.red, getContext());
        Context context = getContext();
        TypedValue typedValue = new TypedValue();
        int i12 = context.getTheme().resolveAttribute(R.attr.item_color, typedValue, true) ? typedValue.resourceId : 2132017711;
        ContextWrapper contextWrapper = new ContextWrapper(context);
        contextWrapper.setTheme(i12);
        LayoutInflater.from(contextWrapper).inflate(R.layout.design_item_color_layout, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f179434m = textView;
        this.f179435n = (ImageView) findViewById(R.id.title_tip);
        TextView textView2 = (TextView) findViewById(R.id.subtitle);
        this.f179436o = textView2;
        this.f179437p = (TextView) findViewById(R.id.error_top);
        TextView textView3 = (TextView) findViewById(R.id.hint);
        this.f179438q = textView3;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.item_color_recycler_view);
        this.f179439r = recyclerView;
        recyclerView.o(new f());
        this.f179433l = textView2.getTextColors();
        TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(null, d.n.f178913C, R.attr.item_color, R.style.Design_Widget_ItemColor);
        CharSequence text = typedArrayObtainStyledAttributes.getText(30);
        I5.a(textView, text != null ? text.toString() : null, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(27);
        I5.a(textView2, text2 != null ? text2.toString() : null, false);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(17);
        I5.a(textView3, text3 != null ? text3.toString() : null, false);
        g(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        i();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean zY2 = D6.y(this.f179434m);
        ImageView imageView = this.f179435n;
        if (!zY2 && !D6.y(this.f179436o)) {
            D6.w(imageView);
        }
        if (D6.y(imageView)) {
            D6.c(this.f179434m, null, null, Integer.valueOf(y6.b(0)), null, 11);
            D6.c(this.f179436o, null, null, Integer.valueOf(y6.b(0)), null, 11);
            D6.c(this.f179437p, null, null, Integer.valueOf(y6.b(0)), null, 11);
        }
    }

    public final void g(TypedArray typedArray) {
        int i12;
        if (typedArray.hasValue(10)) {
            typedArray.getDimensionPixelSize(10, 0);
        }
        if (typedArray.hasValue(9)) {
            this.f179443v = typedArray.getDimensionPixelSize(9, 0);
        }
        if (typedArray.hasValue(11)) {
            this.f179444w = typedArray.getDimensionPixelSize(11, 0);
        }
        if (typedArray.hasValue(32)) {
            this.f179445x = typedArray.getDimensionPixelSize(32, 0);
        }
        if (typedArray.hasValue(34)) {
            this.f179446y = typedArray.getDimensionPixelSize(34, 0);
        }
        if (typedArray.hasValue(12)) {
            this.f179447z = typedArray.getDimensionPixelSize(12, 0);
        }
        int i13 = typedArray.hasValue(24) ? typedArray.getInt(24, -1) : -1;
        if (typedArray.hasValue(23) && (i12 = typedArray.getInt(23, 0)) > 0) {
            setMaxLines(Integer.valueOf(i12));
        }
        this.isEditable = typedArray.getBoolean(14, this.isEditable);
        this.isSelectable = typedArray.getBoolean(21, this.isSelectable);
        setEnabled(typedArray.getBoolean(0, true));
        this.f179440s = new k(SelectStrategy.values()[typedArray.getInt(25, 0)], typedArray.getBoolean(22, false), new com.avito.android.lib.design.item_color_picker.g(2, this, ItemColorPicker.class, "onSelected", "onSelected(IZ)V", 0), new com.avito.android.lib.design.item_color_picker.c(2, this, ItemColorPicker.class, "onUnSelected", "onUnSelected(IZ)V", 0), new com.avito.android.lib.design.item_color_picker.f(0, this, ItemColorPicker.class, "onMaxSelectedStateChanged", "onMaxSelectedStateChanged()V", 0), new com.avito.android.lib.design.item_color_picker.d(1, this, ItemColorPicker.class, "onCheckSelectCondition", "onCheckSelectCondition(I)Z", 0), i13, new com.avito.android.lib.design.item_color_picker.e(2, this, ItemColorPicker.class, "onSelectionApproved", "onSelectionApproved(ZI)V", 0));
        DisplayType displayType = (DisplayType) C42756l.F(typedArray.getInt(13, 0), DisplayType.values());
        if (displayType == null) {
            displayType = DisplayType.f179448b;
        }
        setDisplayType(displayType);
        int layoutDimension = typedArray.getLayoutDimension(1, -1);
        if (layoutDimension > 0) {
            k(layoutDimension, layoutDimension);
            setPadding(0, layoutDimension, 0, layoutDimension);
        } else {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(6, 0);
            if (dimensionPixelSize == 0) {
                dimensionPixelSize = typedArray.getDimensionPixelSize(2, 0);
            }
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(7, 0);
            if (dimensionPixelSize2 == 0) {
                dimensionPixelSize2 = typedArray.getDimensionPixelSize(4, 0);
            }
            int dimensionPixelSize3 = typedArray.getDimensionPixelSize(3, 0);
            int dimensionPixelSize4 = typedArray.getDimensionPixelSize(5, 0);
            k(dimensionPixelSize, dimensionPixelSize2);
            setPadding(0, dimensionPixelSize3, 0, dimensionPixelSize4);
        }
        RecyclerView.m mVarH = h(this.maxLines);
        RecyclerView recyclerView = this.f179439r;
        recyclerView.setLayoutManager(mVarH);
        k kVar = this.f179440s;
        if (kVar == null) {
            kVar = null;
        }
        recyclerView.setAdapter(new com.avito.android.lib.design.item_color_picker.b(kVar, isEnabled(), this.isSelectable));
    }

    @Y61.k
    public final DisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    public final d getItemColorOnRightDrawableClickedListener() {
        return this.itemColorOnRightDrawableClickedListener;
    }

    @l
    public final b getItemColorSelectConditionListener() {
        return this.itemColorSelectConditionListener;
    }

    @l
    public final c getItemColorSelectedListener() {
        return this.itemColorSelectedListener;
    }

    public final boolean getKeepSelected() {
        k kVar = this.f179440s;
        if (kVar == null) {
            kVar = null;
        }
        return kVar.f179480b;
    }

    @l
    public final Integer getMaxLines() {
        return this.maxLines;
    }

    @Y61.k
    public final Y41.l<Integer, Boolean> getSelectCondition() {
        return this.selectCondition;
    }

    @Y61.k
    public final SelectStrategy getSelectStrategy() {
        k kVar = this.f179440s;
        if (kVar == null) {
            kVar = null;
        }
        return kVar.f179479a;
    }

    public final RecyclerView.m h(Integer num) {
        int iOrdinal = this.displayType.ordinal();
        if (iOrdinal == 0) {
            getContext();
            return new FixedItemColorPickerLinearLayoutManager(0, false);
        }
        if (iOrdinal == 1) {
            return new MultilineItemColorPickerLayoutManager(this.f179443v / 2, this.f179444w / 2, num, new h(this));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void i() {
        TextView textView = this.f179434m;
        boolean zY2 = D6.y(textView);
        RecyclerView recyclerView = this.f179439r;
        TextView textView2 = this.f179437p;
        TextView textView3 = this.f179436o;
        if (!zY2 && !D6.y(textView3) && !D6.y(textView2)) {
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) recyclerView.getLayoutParams())).topMargin = 0;
            return;
        }
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) recyclerView.getLayoutParams())).topMargin = this.f179447z;
        if (D6.y(textView3)) {
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) textView3.getLayoutParams())).topMargin = D6.y(textView) ? this.f179445x : 0;
        }
        if (D6.y(textView2)) {
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) textView2.getLayoutParams())).topMargin = (D6.y(textView3) || D6.y(textView)) ? this.f179445x : 0;
        }
    }

    @Y61.k
    public final List<com.avito.android.lib.design.item_color_picker.a> j() {
        com.avito.android.lib.design.item_color_picker.b bVar = (com.avito.android.lib.design.item_color_picker.b) this.f179439r.getAdapter();
        List<Integer> listA = bVar.f179473c.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add((com.avito.android.lib.design.item_color_picker.a) bVar.f179476f.get(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    public final void k(int i12, int i13) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) this.f179434m.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = i13;
        D6.c(this.f179435n, Integer.valueOf(this.f179446y), null, Integer.valueOf(i13), null, 10);
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f179436o.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) bVar2).leftMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = i13;
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) this.f179437p.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) bVar3).leftMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar3).rightMargin = i13;
        ConstraintLayout.b bVar4 = (ConstraintLayout.b) this.f179438q.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) bVar4).leftMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar4).rightMargin = i13;
        this.f179439r.setPadding(i12, 0, i13, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@l MotionEvent motionEvent) {
        if (isEnabled() && this.isEditable) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178913C);
        g(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setData(@Y61.k List<? extends com.avito.android.lib.design.item_color_picker.a> newData) {
        com.avito.android.lib.design.item_color_picker.b bVar = (com.avito.android.lib.design.item_color_picker.b) this.f179439r.getAdapter();
        ArrayList arrayList = bVar.f179476f;
        arrayList.clear();
        arrayList.addAll(newData);
        bVar.notifyDataSetChanged();
    }

    public final void setDisplayType(@Y61.k DisplayType displayType) {
        this.displayType = displayType;
        this.f179439r.setLayoutManager(h(this.maxLines));
        post(new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 7));
    }

    public final void setEditable(boolean z12) {
        this.isEditable = z12;
    }

    public final void setEllipsizeCallback(@Y61.k p<? super Boolean, ? super Integer, G0> callback) {
        this.f179442u = callback;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        RecyclerView recyclerView = this.f179439r;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        com.avito.android.lib.design.item_color_picker.b bVar = adapter instanceof com.avito.android.lib.design.item_color_picker.b ? (com.avito.android.lib.design.item_color_picker.b) adapter : null;
        if (bVar != null) {
            bVar.f179474d = enabled;
        }
        p6 p6Var = new p6(recyclerView);
        while (p6Var.hasNext()) {
            ((View) p6Var.next()).setEnabled(enabled);
        }
    }

    public final void setError(@l String error) {
        ColorStateList colorStateList = this.f179432k;
        TextView textView = this.f179438q;
        textView.setTextColor(colorStateList);
        I5.a(textView, error, false);
    }

    public final void setErrorOnTop(@l String error) {
        I5.a(this.f179437p, error, false);
        i();
    }

    public final void setHint(@l CharSequence hint) {
        ColorStateList colorStateList = this.f179431j;
        TextView textView = this.f179438q;
        textView.setTextColor(colorStateList);
        I5.a(textView, hint, false);
    }

    public final void setItemColorOnRightDrawableClickedListener(@l d dVar) {
        this.itemColorOnRightDrawableClickedListener = dVar;
    }

    public final void setItemColorSelectConditionListener(@l b bVar) {
        this.itemColorSelectConditionListener = bVar;
    }

    public final void setItemColorSelectedListener(@l c cVar) {
        this.itemColorSelectedListener = cVar;
    }

    public final void setKeepSelected(boolean z12) {
        k kVar = this.f179440s;
        if (kVar == null) {
            kVar = null;
        }
        kVar.f179480b = z12;
    }

    public final void setMaxLines(@l Integer num) {
        this.maxLines = num;
        this.f179439r.setLayoutManager(h(num));
        post(new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 7));
    }

    public final void setMaxSelected(int maxSelected) {
        k kVar = this.f179440s;
        if (kVar == null) {
            kVar = null;
        }
        kVar.f179486h = maxSelected;
        if (maxSelected != -1) {
            LinkedHashSet linkedHashSet = kVar.f179487i;
            int size = linkedHashSet.size();
            int i12 = kVar.f179486h;
            if (size > i12) {
                int size2 = linkedHashSet.size();
                while (i12 < size2) {
                    linkedHashSet.remove(Integer.valueOf(i12));
                    i12++;
                }
            }
        }
        kVar.f179483e.invoke();
    }

    public final void setOnScrollPositionChangeListener(@l e listener) {
        this.f179441t = listener;
    }

    public final void setSelectCondition(@Y61.k Y41.l<? super Integer, Boolean> lVar) {
        this.selectCondition = lVar;
    }

    public final void setSelectStrategy(@Y61.k SelectStrategy selectStrategy) {
        k kVar = this.f179440s;
        if (kVar == null) {
            kVar = null;
        }
        kVar.f179479a = selectStrategy;
    }

    public final void setSelectable(boolean z12) {
        this.isSelectable = z12;
    }

    public final void setSubtitle(@Y61.k CharSequence subtitle) {
        ColorStateList colorStateList = this.f179433l;
        TextView textView = this.f179436o;
        textView.setTextColor(colorStateList);
        I5.a(textView, subtitle, false);
        i();
    }

    public final void setTitle(@l String title) {
        I5.a(this.f179434m, title, false);
        i();
    }

    public final void setTitleEnabled(boolean enabled) {
        this.f179434m.setEnabled(enabled);
    }

    public final void setTitleTip(@l Y41.l<? super View, G0> clickListener) {
        ImageView imageView = this.f179435n;
        if (clickListener == null) {
            D6.w(imageView);
        } else {
            D6.H(imageView);
        }
        imageView.setOnClickListener(clickListener != null ? new ViewOnClickListenerC31042l(7, clickListener) : null);
    }
}
